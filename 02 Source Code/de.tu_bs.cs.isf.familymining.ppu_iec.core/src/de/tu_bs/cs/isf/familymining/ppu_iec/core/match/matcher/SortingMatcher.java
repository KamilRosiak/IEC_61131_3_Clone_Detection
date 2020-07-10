package de.tu_bs.cs.isf.familymining.ppu_iec.core.match.matcher;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action.ActionCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action.ActionImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation.SFCImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelImplementaionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUActionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.match.interfaces.AbstractMatcher;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.util.VariabilityThresholdsUtil;
/**
 * This match takes the container with the highest similarity if all similaries are the same it takes the first container.
 * @author {Kamil Rosiak}
 *
 */
public class SortingMatcher extends AbstractMatcher {
	public static final String MATCHER_NAME = "Sorting Matcher";
	public static final String MATCHER_DESCRIPTION = "Matches by sorting the container lists and choosing the maximum similarities.";
	
	public SortingMatcher() {
		super(MATCHER_NAME, MATCHER_DESCRIPTION);
	}

	@Override
	public void match(ConfigurationResultRoot root) {
		//if no attributes selected
		if(root.getChildren() != null) {
			//first match the underlying elements the the container

			for(ModelCompareContainer modelContainer : root.getChildren()) {
				matchModelOptions(modelContainer);
				modelContainer.updateSimilarity();
			}
			
			matchContainer(root.getChildren());
		}
		
	}
	
	/**
	 * This method matches a ModelCompareContainer with his children.
	 */
	private void matchModelOptions(ModelCompareContainer modelContainer) {
		if(modelContainer.getModelImplementationOption() != null) {
			ModelImplementaionOption modelImplOption = modelContainer.getModelImplementationOption();
			matchContainer(modelImplOption.getAllContainer());
			
			for(POUCompareContainer pouCompContainer : modelImplOption.getAllContainer()) {
				matchPOUOContainer(pouCompContainer);
			}
		}
		
		if(modelContainer.getModelVariableOption() != null) {
			matchContainer(modelContainer.getModelVariableOption().getAllContainer());
		}
	}
	
	/**
	 * This method matches a POUCompareContainer with his children.
	 */
	@Override
	@SuppressWarnings("unchecked")
	public void matchPOUOContainer(POUCompareContainer pouContainer) {
		//Match POUImplementationOption
		if(pouContainer.getPouImplOption() != null) {
			POUImplementationOption pouImplOption = pouContainer.getPouImplOption();

			List<IECAbstractContainer> list = pouImplOption.getAllContainer()
					.stream()
				    .map(e -> (IECAbstractContainer) e)
				    .collect(Collectors.toList());
					matchContainer(list);
					pouContainer.updateSimilarity();
					
			for(IECAbstractContainer langContainer : pouImplOption.getAllContainer()) {
				AbstractLanguageContainer absLangCont = (AbstractLanguageContainer)langContainer;
				if(absLangCont.getImplOption() != null) {
					matchContainer(absLangCont.getImplOption().getAllContainer());
				}
			}
		}
		if(pouContainer.getPouActionOption() != null) {
			matchActionOption(pouContainer.getPouActionOption());
		}
		
		if(pouContainer.getPouVarOption() != null) {
			matchContainer(pouContainer.getPouVarOption().getAllContainer());
		}
	}
	
	/**
	 * This method matches a ActionCompareContainer with his children.
	 */
	private void matchActionOption(POUActionOption actionOption) {
		for(ActionCompareContainer actionContainer : actionOption.getAllContainer()) {
			ActionImplementationOption actionImplOption = actionContainer.getActionImplOption();
			if(actionImplOption != null) {
				List<IECAbstractContainer> list = actionImplOption.getAllContainer()
						.stream()
					    .map(e -> (IECAbstractContainer) e)
					    .collect(Collectors.toList());
						matchContainer(list);		
			}
		}
		
		matchContainer(actionOption.getAllContainer());
	}

	/**
	 * This is a generic method that matches all AbstractContainer Lists
	 * @param containers
	 */
	private <K extends EObject , T extends IECAbstractContainer<K>> void matchContainer(List<T> containers) {
		//first match fine-grained elements
		for(T container : containers) {
			if(container instanceof AbstractLanguageContainer) {
				if(container instanceof SFCImplContainer) {
					SFCImplContainer sfcImplContainer = (SFCImplContainer)container;
					
					if(sfcImplContainer.getActionOption() != null) {
						List<IECAbstractContainer> absContainer = sfcImplContainer.getActionOption().getAllContainer();

						for(IECAbstractContainer iecAbsCont : absContainer) {
							if(iecAbsCont instanceof ActionCompareContainer) {
								ActionCompareContainer actionContainer = (ActionCompareContainer)iecAbsCont;
								List<IECAbstractContainer> list = actionContainer.getActionImplOption().getAllContainer()
										.stream()
									    .map(e -> (IECAbstractContainer) e)
									    .collect(Collectors.toList());
										matchContainer(list);
										actionContainer.updateSimilarity();
								matchContainer(list);
								actionContainer.updateSimilarity();
							}
						}
						matchContainer(sfcImplContainer.getActionOption().getAllContainer());
					}

					sfcImplContainer.updateSimilarity();
				}
				AbstractLanguageContainer langContainer = (AbstractLanguageContainer)container;
				if(langContainer.getImplOption() != null) {
					matchContainer(langContainer.getImplOption().getAllContainer());
					container.updateSimilarity();
				}
			}
		}

		containers.sort((firstContainer, secondContainer) -> {
			if (firstContainer.getSimilarity() == secondContainer.getSimilarity()) {
				return 0;
			} else {
				return firstContainer.getSimilarity() > secondContainer.getSimilarity() ? -1 : 1;				
			}
		});
	
		List<K> markedElements = new ArrayList<>();
		List<T> removedContainers = new ArrayList<>();
		Iterator<T> programContainerIterator = containers.iterator();
		while (programContainerIterator.hasNext()) {
			T nextContainer = programContainerIterator.next();
			//first match mandatory and alternative container;
			if (!markedElements.contains(nextContainer.getFirst()) && !markedElements.contains(nextContainer.getSecond()) && nextContainer.getSimilarity() > VariabilityThresholdsUtil.getOptionalValue()/100) {
				markedElements.add(nextContainer.getFirst());
				markedElements.add(nextContainer.getSecond());
			} else {
				removedContainers.add(nextContainer);
				programContainerIterator.remove();
			}
		}
		//add all unmarked elements as optional.
		for(T container : removedContainers) {
			if(container.getFirst() != null && container.getSecond() != null) {
				if(!markedElements.contains(container.getFirst())) {
					markedElements.add(container.getFirst());
					container.setSecond(null);
					container.reset();
					containers.add(container);
				} else if(!markedElements.contains(container.getSecond())){
					markedElements.add(container.getSecond());
					container.setFirst(null);
					container.reset();
					containers.add(container);
				}	
			} else if(container.getFirst() != null || container.getSecond() != null){
				//that are all containers that was added as optional by the compare-engine.
				containers.add(container);
			}
		}
	}
}
