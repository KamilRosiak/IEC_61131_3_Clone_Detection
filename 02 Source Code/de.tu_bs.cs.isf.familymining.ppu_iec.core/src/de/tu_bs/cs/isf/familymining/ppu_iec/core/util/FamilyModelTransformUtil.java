package de.tu_bs.cs.isf.familymining.ppu_iec.core.util;

import org.eclipse.swt.widgets.TreeItem;

import FeatureDiagram.Feature;
import FeatureDiagram.FeatureDiagramFactory;
import FeatureDiagram.FeatureDiagramm;
import FeatureDiagram.GraphicalFeature;
import FeatureDiagram.impl.FeatureDiagramFactoryImpl;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action.ActionCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action.ActionImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelImplementaionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelVariableOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUActionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUVariableOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.variable.VariableContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.VariabilityCategoryThresholds;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.VariableDeclaration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;

public class FamilyModelTransformUtil {
	
	private static FeatureDiagramm diagram;	
	private static int featureID = 0;
	
	public static FeatureDiagramm transformToFeatureDiagram(TreeItem familyModelRoot) {
		featureID = 0;
		diagram = FeatureDiagramFactory.eINSTANCE.createFeatureDiagramm();
		Feature root = createFeature(familyModelRoot.getText());
		root.setMandatory(true);
		diagram.setRoot(root);
		
		recusivelyProcessTreeItems(familyModelRoot.getItems(), root);

		return diagram;
	}
	
	private static void recusivelyProcessTreeItems(TreeItem[] treeItems, Feature parent) {	
		for (TreeItem item : treeItems) {
			Feature feature = createFeature(item.getText());
			feature.setParent(parent);
			parent.getChildren().add(feature);
			
			setFeatureVariability(feature, item.getData());
			
			if (item.getItemCount() > 0) {
				recusivelyProcessTreeItems(item.getItems(), feature);
			}
		}
	}
	
	private static void setFeatureVariability(Feature feature, Object data) {
		float mandatoryThreshold = 0f;

		if (!VariabilityThresholdsUtil.isGranularTH()) {
			mandatoryThreshold = (VariabilityThresholdsUtil.getMandatoryValue() / 100);
		}
		
		if (data == null || data instanceof POUImplementationOption || data instanceof POUActionOption || data instanceof POUVariableOption) {
			// its a category
			feature.setMandatory(true);
		}
		else if (data instanceof POUCompareContainer) {
			if (((POUCompareContainer) data).getSimilarity() > mandatoryThreshold) {
				feature.setMandatory(true);
			}
			else if (((POUCompareContainer) data).getSimilarity() == 0) {
				feature.setMandatory(false);
			}
			else
				feature.setAlternative(true);
		}
		else if (data instanceof ActionCompareContainer) {
			if (((ActionCompareContainer) data).getSimilarity() > mandatoryThreshold) {
				feature.setMandatory(true);
			}
			else if (((ActionCompareContainer) data).getSimilarity() == 0) {
				feature.setMandatory(false);
			}
			else
				feature.setAlternative(true);
		}
		else if (data instanceof VariableContainer) {
			if (((VariableContainer) data).getSimilarity() > mandatoryThreshold) {
				feature.setMandatory(true);
			}
			else if (((VariableContainer) data).getSimilarity() == 0) {
				feature.setMandatory(false);
			}
			else
				feature.setAlternative(true);
		}
		else if (data instanceof VariableContainer) {
			if (((VariableContainer) data).getSimilarity() > mandatoryThreshold) {
				feature.setMandatory(true);
			}
			else if (((VariableContainer) data).getSimilarity() == 0) {
				feature.setMandatory(false);
			}
			else
				feature.setAlternative(true);
		}
		else if (data instanceof AbstractLanguageContainer) {
			if (((AbstractLanguageContainer<?>) data).getSimilarity() > mandatoryThreshold) {
				feature.setMandatory(true);
			}
			else if (((AbstractLanguageContainer<?>) data).getSimilarity() == 0) {
				feature.setMandatory(false);
			}
			else
				feature.setAlternative(true);
		}
	}

	/**
	 * This method transforms a ConfigurationResultRoot into a FeatureDiaramm.
	 */
	public static FeatureDiagramm transformToFeatureDiagram(ConfigurationResultRoot result) {
		diagram = FeatureDiagramFactory.eINSTANCE.createFeatureDiagramm();

		
		ModelCompareContainer modelContainer = result.getChildren().get(0);
		String sourceName = "";
		String targetName = "";
		if(!modelContainer.getResults().isEmpty()) {
			if(modelContainer.getResults().get(0).getFirst() != null) {
				sourceName = modelContainer.getResults().get(0).getFirst().getIdentifier();
			}

			if(modelContainer.getResults().get(0).getFirst() != null) {
				targetName = modelContainer.getResults().get(0).getSecond().getIdentifier();
			}
		}

		String featureDiagramName = sourceName +"_"+targetName+"_FeatureDiagram";
		Feature root = createFeature(featureDiagramName);
		root.setMandatory(true);
		processModelContainer(modelContainer ,root);

		diagram.setRoot(root);
		return diagram;
	}
	

	private static void processModelContainer(ModelCompareContainer modelContainer, Feature root) {
		if(modelContainer.getModelImplementationOption() != null) {
			processModelImplOption(root, modelContainer.getModelImplementationOption());
		}
		if(modelContainer.getModelVariableOption() != null) {
			processModelVarOption(root, modelContainer.getModelVariableOption());
		}
	}
	
	/**
	 * This method process a ModelVariableOption and creates its Feature Diagram representation.
	 */
	private static void processModelVarOption(Feature root, ModelVariableOption modelVarOption) {
		//create overlaying feature and double link
		Feature variableHolder = createFeature("Variables");
		variableHolder.setParent(root);
		variableHolder.setMandatory(true);
		root.getChildren().add(variableHolder);

		for(VariableContainer modelVarContainer : modelVarOption.getAllContainer()) {
			Variable sourceVar = modelVarContainer.getFirst();
			Variable targetVar = modelVarContainer.getSecond();
			
			String first = null;
			String second = null;
			
			if(sourceVar != null) {
				first = sourceVar.getName();
			}
			if(targetVar != null) {
				second = targetVar.getName();
			}
			Feature variableFeature = createFeatureItem(modelVarContainer, first, second);
			variableHolder.getChildren().add(variableFeature);
			variableFeature.setParent(variableHolder);
		}
	}

	private static void processModelImplOption(Feature parent, ModelImplementaionOption modelImplOption) {
		for(POUCompareContainer pouContainer : modelImplOption.getAllContainer()) {
			String first;
			String second;
			//Check for null values 
			if(pouContainer.getFirst() == null) {
				first = null;
			} else {
				first = pouContainer.getFirst().getIdentifier();
			}

			if(pouContainer.getSecond() == null) {
				second = null;
			} else {
				second = pouContainer.getSecond().getIdentifier();
			}
			Feature pouFeature = createFeatureItem(pouContainer, first, second);
			pouFeature.setParent(parent);
			parent.getChildren().add(pouFeature);
			processPouCompareContainer(pouFeature, pouContainer);
			
		}

	}
	

	private static void processPouCompareContainer(Feature parent, POUCompareContainer pouContainer) {
		if(pouContainer.getPouImplOption() != null) {
			processPouImplementationOption(parent, pouContainer.getPouImplOption());
		}
		if(pouContainer.getPouActionOption() != null) {
			processPouActionOption(parent, pouContainer.getPouActionOption());
		}
		if(pouContainer.getPouVarOption() != null) {
			processPouVariableOption(parent, pouContainer.getPouVarOption());
		}	
	}

	
	private static void processPouVariableOption(Feature parent, POUVariableOption pouVarOption) {
		Feature variableHolder = createMandatoryFeature("Variables");
		variableHolder.setParent(parent);
		parent.getChildren().add(variableHolder);
		
		Feature outputHolder = createMandatoryFeature("Output");
		Feature inputHolder = createMandatoryFeature("Input");
		Feature inOutHolder = createMandatoryFeature("In_Out");


		for(VariableContainer pouVarContainer : pouVarOption.getAllContainer()) {
			Variable sourceVar = pouVarContainer.getFirst();
			Variable targetVar = pouVarContainer.getSecond();
			
			String first = null;
			String second = null;
			VariableDeclaration varDec = null;
			if(sourceVar != null) {
				first = sourceVar.getName();
				varDec = sourceVar.getScope();
			}
			if(targetVar != null) {
				second = targetVar.getName();
				varDec = targetVar.getScope();
			}
			
			Feature variableFeature = createFeatureItem(pouVarContainer, first, second);
			if(varDec == VariableDeclaration.VAR_OUTPUT) {
				outputHolder.getChildren().add(variableFeature);
				variableFeature.setParent(outputHolder);
			} else if (varDec == VariableDeclaration.VAR_INPUT) {
				inputHolder.getChildren().add(variableFeature);
				variableFeature.setParent(inputHolder);
			} else if (varDec == VariableDeclaration.VAR_IN_OUT) {
				inOutHolder.getChildren().add(variableFeature);
				variableFeature.setParent(inOutHolder);
			}
		}
		
		if(!outputHolder.getChildren().isEmpty()) {
			outputHolder.setParent(variableHolder);
			variableHolder.getChildren().add(outputHolder);
		}
		if(!inputHolder.getChildren().isEmpty()) {
			inputHolder.setParent(variableHolder);
			variableHolder.getChildren().add(inputHolder);
		}
		if(!inOutHolder.getChildren().isEmpty()) {
			inOutHolder.setParent(variableHolder);
			variableHolder.getChildren().add(inOutHolder);
		}
	}
	
	

	private static void processPouImplementationOption(Feature parent, POUImplementationOption pouImplOption) {
		Feature implementationHolder = createFeature("Implementation");
		implementationHolder.setMandatory(true);
		implementationHolder.setAbstract(true);
		implementationHolder.setParent(parent);
		parent.getChildren().add(implementationHolder);
		
		for(IECAbstractContainer<?> langContainer : pouImplOption.getAllContainer()) {
			LanguageElement sourceLE = (LanguageElement) langContainer.getFirst();
			LanguageElement targetLE = (LanguageElement) langContainer.getSecond();
			String first = null;
			String second = null;
			
			if(sourceLE != null) {
				first = createLanguageLabel(sourceLE);
			}
			if(targetLE != null) {
				second = createLanguageLabel(targetLE);
			}
			
			Feature langElemFeature = createFeatureItem(langContainer, first, second);
			langElemFeature.setMandatory(true);
			implementationHolder.getChildren().add(langElemFeature);
			langElemFeature.setParent(implementationHolder);
		}
	}

	private static void processPouActionOption(Feature parent, POUActionOption pouActionOption) {
		Feature actionHolder = createFeature("Actions");
		actionHolder.setMandatory(true);
		actionHolder.setParent(parent);
		parent.getChildren().add(actionHolder);	
		
		for(ActionCompareContainer actionContainer : pouActionOption.getAllContainer()) {
			Action sourceAction = actionContainer.getFirst();
			Action targetAction = actionContainer.getSecond();
			String first = null;
			String second = null;
			
			if(sourceAction != null) {
				first = sourceAction.getName();
			}
			if(targetAction != null) {
				second = targetAction.getName();
			}
			
			Feature actionFeature = createFeatureItem(actionContainer, first, second);
			actionHolder.getChildren().add(actionFeature);
			actionFeature.setParent(actionHolder);
			processActionContainer(actionFeature, actionContainer);
		}
	}

	private static void processActionContainer(Feature parent, ActionCompareContainer actionContainer) {
		if(actionContainer.getActionImplOption() != null) {
			processActionImplementationOption(parent, actionContainer.getActionImplOption());
		}
	}

	private static void processActionImplementationOption(Feature parent, ActionImplementationOption actImplOption) {
		Feature implementationHolder = createFeature("Implementation");
		implementationHolder.setMandatory(true);
		implementationHolder.setAbstract(true);
		implementationHolder.setParent(parent);
		
		parent.getChildren().add(implementationHolder);
		
		for (IECAbstractContainer<?> langContainer : actImplOption.getAllContainer()) {
			LanguageElement sourceLE = (LanguageElement) langContainer.getFirst();
			LanguageElement targetLE = (LanguageElement) langContainer.getSecond();
			String first = null;
			String second = null;
			
			if(sourceLE != null) {
				first = createLanguageLabel(sourceLE);
			}
			if(targetLE != null) {
				second = createLanguageLabel(targetLE);
			}
		
			Feature langElemFeature = createFeatureItem(langContainer, first, second);
			langElemFeature.setMandatory(true);
			implementationHolder.getChildren().add(langElemFeature);
			langElemFeature.setParent(implementationHolder);
		}
	}
	
	private static String createLanguageLabel(LanguageElement langElem) {
		if (langElem instanceof StructuredText) {
			return "ST_Implementation";
		} else if (langElem instanceof SequentialFunctionChart) {
			return "SFC_Implementation";
		} else if(langElem instanceof Diagram) {
			Diagram diagram =(Diagram)langElem;
			if(diagram.getType().equals(DiagramType.LADDER_DIAGRAM)) {
				return "LD_Implementation";
			} else  {
				return "FBD_Implementation"; 
			}

		} else {
			return "";
		}
		//ToDo later implementation for 
	}
	
	public static Feature createFeatureItem(IECAbstractContainer<?> absContainer, String first, String second) {
		Feature feature = null;	 
		float similarity = absContainer.getSimilarity();
		if(similarity >= VariabilityThresholdsUtil.getMandatoryValue()/100f) {
			feature = createFeature(getMandatoryName(first, second));
			feature.setMandatory(true);
		} else if(similarity ==  VariabilityCategoryThresholds.OPTIONAL_THRESHOLD) {
			feature = createFeature(getOptionName(first, second));
			//may cause error , set setOr  to True
		} else {
			feature = createFeature(getAlternativeName(first, second));
			feature.setAlternative(true);
		}		
		return feature;
	}
	
	private static String getAlternativeName(String first, String second) {
		return "Variant Subsystem ( "+first+" / " +second + " ) ";
	}

	private static String getOptionName(String first, String second) {
		if(first == null && second != null) {
			return second;
		}
		if(first != null && second == null) {
			return first;
		} 
		if (first !=null && second != null ) {
			return first;
		}
		return "";
	}
	
	private static String getMandatoryName(String first, String second) {
		if(first != null && second != null) {
			if(first.equals(second)) {
				return first;
			} else {
				return first +"_"+ second;
			}
		}
		return getOptionName(first, second);
	}
	

	/**
	 * TODO DUPLICATE from featureModelEditorView
	  * This method creates a new feature. With default name
	  */
	 public static Feature createFeature(String featureName) {
    	Feature feature = FeatureDiagramFactoryImpl.eINSTANCE.createFeature();
    	setFeatureID(feature);
    	feature.setName(featureName);
    	GraphicalFeature graphicalFeature = FeatureDiagramFactory.eINSTANCE.createGraphicalFeature();
    	feature.setGraphicalfeature(graphicalFeature);
    	feature.setMandatory(false);
    	feature.setAlternative(false);
    	feature.setOr(false);
    	return feature;
	 }
	 
	 /**
	  * @param feature
	  */
	 private static void setFeatureID(Feature feature) {
		 feature.setIdentifier(featureID);
		 featureID++;
	 }
	 
	 
	 private static Feature createMandatoryFeature(String featureName) {
		 Feature ret = createFeature(featureName);
		 ret.setMandatory(true);
		 return ret;
	 }
}
