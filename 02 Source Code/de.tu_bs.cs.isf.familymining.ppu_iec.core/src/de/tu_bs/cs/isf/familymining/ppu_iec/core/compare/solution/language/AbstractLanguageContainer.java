package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language;

import org.eclipse.emf.ecore.EObject;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

/** 
 * This class represents the AbstractLanguageContainer, which will be added to the data structure when the engine compares
 * the implementation of POUs or actions.  It provides the implementation of the updateSimialrity method that is equal 
 * for every language container.
 * @author {Kamil Rosiak}
 */
public abstract class AbstractLanguageContainer<ElementType extends EObject> extends IECAbstractContainer<ElementType> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 459916686296006942L;
	
	private LanguageImplementationOption<? extends AbstractLanguageContainer<?>> implOption;
	
	public AbstractLanguageContainer(ElementType first, ElementType second, MetricContainer metric) {
		super(first, second, metric);
	}

	@Override
	public void updateSimilarity() {
		float similarity = 0.0f;
		float optionCounter = 0;
		
		//adds all results weighted or not weighted.
		for(ResultElement<?> langResult : getResults()) {
			similarity += getSimilarity(langResult.getSimilarity(), langResult.getAttribute(), getMetric().isWeighted());	
		}
		
		if(getImplOption() != null) {
			optionCounter++;
			LanguageImplementationOption<?> langImplOpt = getImplOption();
			langImplOpt.updateSimilarity();
			similarity += langImplOpt.getSimilarity(langImplOpt.getSimilarity(), langImplOpt.getOptionAttr(), getMetric().isWeighted());
		}
		
		//if not weighted we have to dived the similarity with the count of the results else its normed by 100% trough the weights.
		if(!getMetric().isWeighted() && getResults().size() + optionCounter > 0) {
			similarity = similarity / (getResults().size() + optionCounter);	
		} 
		
		setSimilarity(similarity);
	}

	@Override
	public void reset() {
		getResults().clear();
		setImplOption(null);
	}
	
	public LanguageImplementationOption<? extends AbstractLanguageContainer<?>> getImplOption() {
		return implOption;
	}

	public void setImplOption(LanguageImplementationOption<? extends AbstractLanguageContainer<?>> nestedSTImpl) {
		this.implOption = nestedSTImpl;
	}
	
	@Override
	public Boolean checkCompared() {
		if(implOption != null || isCompared()) {
			return true;
		} else if(getFirst() == null || getSecond() == null) {
			return true;
		}else {
			return false;
		}	
	}
	
}
