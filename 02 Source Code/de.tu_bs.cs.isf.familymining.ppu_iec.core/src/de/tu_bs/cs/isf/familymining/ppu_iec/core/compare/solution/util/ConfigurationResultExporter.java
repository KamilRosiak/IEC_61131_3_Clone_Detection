package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.util.MetricExporter;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action.ActionCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.DiagramContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.DiagramElementImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.FBDNetworkImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.LDNetworkImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.SFCLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation.SFCActionContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation.SFCImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.STLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.implementation.STImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelImplementaionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUActionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.variable.VariableContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.EnableGranularThresholds;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.MandatoryValueActionContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.VariabilityThresholdsContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.MandatoryValuePOUContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.VariabilityCategoryThresholds;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.util.VariabilityThresholdsUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderNetwork;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.VariabilityCategory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextFactory;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.PreferencesUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.key_value.KeyValueNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;

public class ConfigurationResultExporter {
	private ConfigurationResultRoot result;
	private MergedModelFactory factory;
	
	public ConfigurationResultExporter(ConfigurationResultRoot result) {
		this.result = result;
		initialiaze();
	}
	
	/**
	 * Initialize the ecore content.
	 */
	private void initialiaze() {
		// Initialize the model
		MergedModelPackage.eINSTANCE.eClass();
		factory = MergedModelFactory.eINSTANCE;
	}
	
	public FamilyModel transformResult() {
		FamilyModel famModel = factory.createFamilyModel();
		//export metric to xml format and set it
		famModel.setMetric(new MetricExporter(result.getMetric()).transformMetric());
		//set both models
		ModelCompareContainer modelCompareContainer = result.getChildren().get(0);
		famModel.setSourceVariant(EcoreUtil.copy(modelCompareContainer.getFirst()));
		famModel.setTargetVariant(EcoreUtil.copy(modelCompareContainer.getSecond()));
		//add ModelContainer to familyModel
		famModel.getComparedElements().add(buildModelContainer(modelCompareContainer));

		return famModel;
	}
	
	/**
	 * This method builds the ModelCompareContainer with all children.
	 */
	private ElementComparison buildModelContainer(ModelCompareContainer container) {
		//reduce the element to identifier 
		Configuration reducedSourceElement = ConfigurationFactory.eINSTANCE.createConfiguration();
		reducedSourceElement.setIdentifier((container.getFirst() != null) ? container.getFirst().getIdentifier() : "");
		
		Configuration reducedTargetElement = ConfigurationFactory.eINSTANCE.createConfiguration();
		reducedTargetElement.setIdentifier((container.getSecond() != null) ? container.getSecond().getIdentifier() : "");
		
		ElementComparison modelContainer = createElementComparision(reducedSourceElement, reducedTargetElement, container.getSimilarity());
		modelContainer.setVariability(getTypeForContainer(container));
		
		if(container.getModelImplementationOption() != null) {
			buildModelImplementaionOption(modelContainer,container.getModelImplementationOption());
		}
		
		if(container.getModelVariableOption() != null) {
			buildModelVariables(modelContainer, container.getModelVariableOption().getAllContainer());
		}

		return modelContainer;
	}
	
	/**
	 * This method builds the ModelImplementaionOption with all children.
	 */
	private void buildModelImplementaionOption(ElementComparison parent, ModelImplementaionOption option) {
		for(POUCompareContainer pouContainer : option.getAllContainer()) {
			ElementComparison pouElementComparison = buildPouContainer(pouContainer);
			pouElementComparison.setVariability(getTypeForContainer(pouContainer));
			pouElementComparison.setParentElement(parent);
			parent.getSubElements().add(pouElementComparison);
		}
	}
	
	/**
	 * This method builds a POUCompareContainer with all children. 
	 */
	private ElementComparison buildPouContainer(POUCompareContainer pouContainer) {
		POU reducedSourceElement = ConfigurationFactory.eINSTANCE.createPOU();
		reducedSourceElement.setIdentifier((pouContainer.getFirst() != null) ? pouContainer.getFirst().getIdentifier() : "");
		POU reducedTargetElement = ConfigurationFactory.eINSTANCE.createPOU();
		reducedTargetElement.setIdentifier((pouContainer.getSecond() != null) ? pouContainer.getSecond().getIdentifier() : "");
		ElementComparison modelOption = createElementComparision(reducedSourceElement, reducedTargetElement, pouContainer.getSimilarity());
		modelOption.setVariability(getTypeForContainer(pouContainer));
		
		if(pouContainer.getPouImplOption() != null) {
			buildImplOption(modelOption, pouContainer.getPouImplOption().getAllContainer());
		}
		if(pouContainer.getPouActionOption() != null) {
			buildPOUActionOption(modelOption, pouContainer.getPouActionOption());
		}
		if(pouContainer.getPouVarOption() != null) {
			buildModelVariables(modelOption, pouContainer.getPouVarOption().getAllContainer());
		}

		return modelOption;
	}
	
	/**
	 * This method builds the POUImplementationOption with all children.
	 */
	private void buildImplOption(ElementComparison parent, List<AbstractLanguageContainer<?>> container) {
		for(IECAbstractContainer<?> langCont : container) {
			LanguageElement sourceLE = null; 
			LanguageElement targetLE = null; 
			
			AbstractLanguageContainer<?> languageContainer = (AbstractLanguageContainer<?>)langCont;

			if(languageContainer instanceof STLangContainer) {
				sourceLE = StructuredTextFactory.eINSTANCE.createStructuredText();
				targetLE = StructuredTextFactory.eINSTANCE.createStructuredText();	
				
			} else if (languageContainer instanceof SFCLangContainer) {
				sourceLE = SequentialFunctionChartFactory.eINSTANCE.createSequentialFunctionChart();
				targetLE = SequentialFunctionChartFactory.eINSTANCE.createSequentialFunctionChart();
				
			} else if(languageContainer instanceof DiagramContainer) {
				sourceLE = DiagramFactory.eINSTANCE.createDiagram();
				targetLE = DiagramFactory.eINSTANCE.createDiagram();
			} 
			
			ElementComparison langElementComparison = createElementComparision(sourceLE, targetLE, languageContainer.getSimilarity());
			//check for nested implementation artifacts
			if(languageContainer.getImplOption() != null && !languageContainer.getImplOption().getAllContainer().isEmpty()) {
				buildImpl(langElementComparison, languageContainer.getImplOption().getAllContainer());
			}	
			
			langElementComparison.setVariability(getTypeForContainer(languageContainer));
			langElementComparison.setParentElement(parent);
			parent.getSubElements().add(langElementComparison);	

		}
	}
	
	
	private void buildImpl(ElementComparison parent, List<? extends AbstractLanguageContainer<?>> list ) {
		for(AbstractLanguageContainer<?> container : list) {
			ElementComparison langElementComparison = null;
			//build Structured Text Implementation
			if(container instanceof STImplContainer) {
				STImplContainer stImplContainer = (STImplContainer)container;
				langElementComparison = createElementComparision(stImplContainer.getFirst(), stImplContainer.getSecond(), stImplContainer.getSimilarity());
				//recursivly creating nested implementations
				if(stImplContainer.getImplOption() != null) {
					buildImpl(langElementComparison, stImplContainer.getImplOption().getAllContainer());
				}
			} else if(container instanceof SFCImplContainer) {
				SFCImplContainer sfcImplContainer = (SFCImplContainer)container;
				langElementComparison = createElementComparision(sfcImplContainer.getFirst(), sfcImplContainer.getSecond(), sfcImplContainer.getSimilarity());
				if(sfcImplContainer.getActionOption() != null) {
					for(Object actionContainer : sfcImplContainer.getActionOption().getAllContainer()) {
						if(actionContainer instanceof SFCActionContainer) {
							SFCActionContainer sfcActionContainer = (SFCActionContainer)actionContainer;
							ElementComparison actionElement = createElementComparision(sfcActionContainer.getFirst(), sfcActionContainer.getSecond(), sfcActionContainer.getSimilarity());
							actionElement.setVariability(getTypeForContainer(sfcActionContainer));
							actionElement.setParentElement(langElementComparison);
							langElementComparison.getSubElements().add(actionElement);
						} else if(actionContainer instanceof ActionCompareContainer){
							ActionCompareContainer actionCompareContainer = (ActionCompareContainer)actionContainer;
							ElementComparison actionElement = createElementComparision(actionCompareContainer.getFirst(), actionCompareContainer.getSecond(), actionCompareContainer.getSimilarity());
							if(actionCompareContainer.getActionImplOption() != null) {
								List<AbstractLanguageContainer<?>> nestedContainer = actionCompareContainer.getActionImplOption().getAllContainer().stream()
									    .map(e -> (AbstractLanguageContainer<?>) e)
									    .collect(Collectors.toList());	
								buildImplOption(actionElement, nestedContainer);
							}
							actionElement.setVariability(getTypeForContainer(actionCompareContainer));
							actionElement.setParentElement(langElementComparison);
							langElementComparison.getSubElements().add(actionElement);
						} else if (actionContainer instanceof VariableContainer) {
							VariableContainer varCont = (VariableContainer)actionContainer;
							buildVariableContainer(langElementComparison, varCont);
						} 	
					}
				}
			} else if(container instanceof DiagramElementImplContainer) {
				DiagramElementImplContainer diaImplContainer = (DiagramElementImplContainer)container;
				langElementComparison = createElementComparision(container.getFirst(), container.getSecond(), container.getSimilarity());
				if(diaImplContainer.getImplOption() != null) {
					List<AbstractLanguageContainer<?>> nestedContainer = container.getImplOption().getAllContainer().stream()
						    .map(e -> (AbstractLanguageContainer<?>) e)
						    .collect(Collectors.toList());	
					buildImplOption(langElementComparison, nestedContainer);
				}	
			} else if(container instanceof LDNetworkImplContainer) {
				LDNetworkImplContainer ldNetworkContainer = (LDNetworkImplContainer)container;
				LadderNetwork firstLDNetwork = LadderDiagramFactory.eINSTANCE.createLadderNetwork();
				LadderNetwork secondLDNetwork = LadderDiagramFactory.eINSTANCE.createLadderNetwork();
				firstLDNetwork.setLabel(ldNetworkContainer.getLeftLabel());
				secondLDNetwork.setLabel(ldNetworkContainer.getRightLabel());
				
				langElementComparison = createElementComparision(firstLDNetwork, secondLDNetwork, ldNetworkContainer.getSimilarity());
				if(ldNetworkContainer.getImplOption() != null) {
					buildImpl(langElementComparison, ldNetworkContainer.getImplOption().getAllContainer());
				}	
				
			} else if(container instanceof FBDNetworkImplContainer) {
				FBDNetworkImplContainer fbdNetworkContainer = (FBDNetworkImplContainer)container;
				Network firstLDNetwork = DiagramFactory.eINSTANCE.createNetwork();
				Network secondLDNetwork = DiagramFactory.eINSTANCE.createNetwork();
				firstLDNetwork.setLabel(fbdNetworkContainer.getLeftLabel());
				secondLDNetwork.setLabel(fbdNetworkContainer.getRightLabel());
				
				langElementComparison = createElementComparision(firstLDNetwork, secondLDNetwork, fbdNetworkContainer.getSimilarity());
				if(fbdNetworkContainer.getImplOption() != null) {
					buildImpl(langElementComparison, fbdNetworkContainer.getImplOption().getAllContainer());
				}
			} 
			
			if(langElementComparison != null) {
				langElementComparison.setVariability(getTypeForContainer(container));
				langElementComparison.setParentElement(parent);
				parent.getSubElements().add(langElementComparison);
			}
		}
		
	}
	
	/**
	 * This method builds the POUActionOption with all children.
	 */
	private void buildPOUActionOption(ElementComparison parent, POUActionOption option) {
		for(ActionCompareContainer actionCont : option.getAllContainer()) {
			ElementComparison langElementComparison = buildActionContainer(actionCont);
			langElementComparison.setVariability(getTypeForContainer(actionCont));
			langElementComparison.setParentElement(parent);
			parent.getSubElements().add(langElementComparison);
		}
	}
	
	/**
	 * This method builds a ActionContainer with all children.
	 */
	private ElementComparison buildActionContainer(ActionCompareContainer container) {
		Action reducedSourceAction = ConfigurationFactory.eINSTANCE.createAction();
		reducedSourceAction.setName((container.getFirst() != null) ? container.getFirst().getName() : "");
		
		Action reducedTargetAction = ConfigurationFactory.eINSTANCE.createAction();
		reducedTargetAction.setName((container.getSecond() != null) ? container.getSecond().getName() : "");

		ElementComparison actionContainer = createElementComparision(reducedSourceAction, reducedTargetAction, container.getSimilarity());
		actionContainer.setVariability(getTypeForContainer(container));
		
		if(container.getActionImplOption() != null) {
			List<AbstractLanguageContainer<?>> nesteContainer = container.getActionImplOption().getAllContainer().stream()
				    .map(e -> (AbstractLanguageContainer<?>) e)
				    .collect(Collectors.toList());	
			buildImplOption(actionContainer, nesteContainer);
		}

		return actionContainer;
	}

	/**
	 * This method builds VariableContainer.
	 */
	private void buildModelVariables(ElementComparison parent, List<VariableContainer> container) {
		for(VariableContainer modelVarContainer: container) {
			buildVariableContainer(parent, modelVarContainer);
		}
	}
	
	private void buildVariableContainer(ElementComparison parent, VariableContainer container) {
		ElementComparison modelVarElementComparison = createElementComparision(container.getFirst(), container.getSecond(), container.getSimilarity());
		modelVarElementComparison.setVariability(getTypeForContainer(container));
		modelVarElementComparison.setParentElement(parent);
		parent.getSubElements().add(modelVarElementComparison);
	}
	
	/**
	 * This method returns a ElementComparison and sets source, target and the similarity.
	 */
	private ElementComparison createElementComparision(EObject source, EObject target, float similarity) {
		ElementComparison container = factory.createElementComparison();
		container.setSourceElement(EcoreUtil.copy(source));
		container.setTargetElement(EcoreUtil.copy(target));
		container.setSimilarity(similarity);
		return container;
	}
	
	
	/** 
	 * This method returns the variability type for a container by chosen preferences.
	 */
	private VariabilityCategory getTypeForContainer(IECAbstractContainer<?> container) {
		KeyValueNode enableGranularThresholds = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME,EnableGranularThresholds.ENABLE_GRANULAR_THRESHOLDS,"false");
		KeyValueNode mandatoryValueGeneral = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, VariabilityThresholdsContribution.MANDATORY_VALUE_PREF,String.valueOf(VariabilityCategoryThresholds.MANDATORY_DEFAULT_THRESHOLD));
		KeyValueNode mandatoryValuePOU = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, MandatoryValuePOUContribution.MANDATORY_VALUE_PREF,String.valueOf(VariabilityCategoryThresholds.POU_MANDATORY_DEFAULT_THRESHOLD));
		KeyValueNode mandatoryValueAction = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, MandatoryValueActionContribution.MANDATORY_VALUE_PREF,String.valueOf(VariabilityCategoryThresholds.ACTION_MANDATORY_DEFAULT_THRESHOLD));
		float similarity = container.getSimilarity();
		//different thresholds
		float mandatoryValue = 0.0f;
		if(enableGranularThresholds.getBoolValue()) {
			if(container instanceof ActionCompareContainer) {
				mandatoryValue = mandatoryValueAction.getFloatValue();
			} else if(container instanceof POUCompareContainer) {
				mandatoryValue = mandatoryValuePOU.getFloatValue();
			} else if(container instanceof AbstractLanguageContainer) {
				AbstractLanguageContainer<?> langContainer = (AbstractLanguageContainer<?>) container;
				if(langContainer instanceof STImplContainer || langContainer instanceof STLangContainer) {
					mandatoryValue = VariabilityThresholdsUtil.getMandatoryValueSTImpl();
				} else if(langContainer instanceof SFCImplContainer || langContainer instanceof SFCLangContainer) {
					mandatoryValue = VariabilityThresholdsUtil.getMandatoryValueSFCImpl();
				} else if(langContainer instanceof DiagramContainer ) {
					//TODO: Differ between FBD and LD
					mandatoryValue = VariabilityThresholdsUtil.getMandatoryValueLDImpl();
				}
			} else {
				mandatoryValue = mandatoryValueGeneral.getFloatValue();
			}
		} else {
			mandatoryValue = mandatoryValueGeneral.getFloatValue();
		}
		
		if(similarity >= (mandatoryValue / 100)) {
			return VariabilityCategory.MANDATORY;
		} else if(similarity == VariabilityCategoryThresholds.OPTIONAL_THRESHOLD) {
			return VariabilityCategory.OPTIONAL;
	    } else {
	    	return VariabilityCategory.ALTERNATIVE;
		}
	}
	
	/**
	 * This method exports the metric to XML.
	 */
	public void saveMetricToXmi(String path) {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("MergedModel", new XMIResourceFactoryImpl());
        Map<String,String> options = new HashMap<String, String>();
        options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_RECORD);
        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(URI.createURI(path));
        resource.getContents().add(transformResult());
        // now save the content.
        try {
        	FileOutputStream fos = new FileOutputStream(path);
        	
            resource.save(fos,options);
        } catch (IOException e) {
        	RCPMessageProvider.errorMessage("Exporter", "Could not export family model.");
        	e.printStackTrace();
        }
    }
	
}
