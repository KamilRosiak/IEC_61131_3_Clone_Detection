package de.tu_bs.cs.isf.familymining.ppu_iec.core;

import java.util.List;

import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.empty.EmptyActionAttr;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.empty.EmptyActionImplAttr;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.empty.EmptyImplAttr;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.empty.EmptyModelAttr;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.empty.EmptyVarsAttr;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.function_block_diagram.templates.AbstractFBDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.function_block_diagram.templates.AbstractFBDLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram.templates.AbstractLDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram.templates.AbstractLDLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractActionAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractModelAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractVariableAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action.ActionCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action.ActionImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.LanguageImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.DiagramContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.DiagramElementImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.FBDNetworkImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.LDNetworkImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.SFCLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation.SFCActionContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation.SFCActionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation.SFCImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.STLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.implementation.STImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelImplementaionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelVariableOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUActionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUVariableOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util.SolutionSerializer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.variable.VariableContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.match.interfaces.IMatcher;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.ExecutionBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderNetwork;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.AbstractAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.ComplexAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SimpleAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st.DefaultStatementStructure;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;

@Singleton
@Creatable
public class CompareEngine implements Runnable {
	private ConfigurationResultRoot result;
	private List<Configuration> sourceModels;
	private List<Configuration> targetModels;
	private MetricContainer metric;
	private IMatcher matcher;
	private Boolean saveAsResult;
	private ServiceContainer services;
	
	public CompareEngine(MetricContainer metric) {
		this.metric = metric;
	}
	
	public CompareEngine(List<Configuration> sourceModels, List<Configuration> targetModels, MetricContainer metric) {
		this(metric);
		this.sourceModels = sourceModels;
		this.targetModels = targetModels;
	}
	
	
	public CompareEngine(List<Configuration> sourceModels, List<Configuration> targetModels, IMatcher matcher, MetricContainer metric, Boolean saveAsResult, ServiceContainer services) {
		this(sourceModels, targetModels, metric);
		this.matcher = matcher;
		this.saveAsResult = saveAsResult;
		this.services = services;
	}
	
	@Override
	public void run() {
		ConfigurationResultRoot result = compareModelList(sourceModels, targetModels, metric);
		result.updateSimilarity();
		
		if(saveAsResult) {
			SolutionSerializer.encode(result, false);
		}
		
		matcher.match(result);
		result.updateSimilarity();
		setResult(result);
		SolutionSerializer.encode(result, RCPContentProvider.getCurrentWorkspacePath()+E4CStringTable.FAMILY_MODEL_DIRECTORY,E4CStringTable.FILE_ENDING_FAMILY_MODEL, false);
		services.eventBroker.send(PPUEventTable.ADD_RESULT, result);
		
	}

	/**
	 * This method compares two lists of models. (done)
	 */
	public ConfigurationResultRoot compareModelList(List<Configuration> sourceModels, List<Configuration> targetModels, MetricContainer metric) {
		ConfigurationResultRoot  resultRoot = new ConfigurationResultRoot(metric);
		if(metric.isModelCompare()) {
			for(Configuration sourceConfiguration : sourceModels) {
				for(Configuration targetConfiguration : targetModels) {
					ModelCompareContainer modelContainer = compareModels(sourceConfiguration, targetConfiguration, metric);
					//double link
					if(modelContainer != null) {
						resultRoot.addChildren(modelContainer);
					}
				}
			}
		}
		
		return resultRoot;
	}
	
	/**
	 * This method compares two models with the give model attributes.(done)
	 **/
	public ModelCompareContainer compareModels(Configuration sourceModel, Configuration targetModel, MetricContainer metric) {
		ModelCompareContainer modelContainer = new  ModelCompareContainer(sourceModel, targetModel, metric);
		
		//compare models with attributes
		compareModel(sourceModel, targetModel, modelContainer);
		
		//Compare Global Variables
		if(metric.isModelVariableOption()) {
			ModelVariableOption modelVaribaleOption = compareModelVars(sourceModel, targetModel , metric);
			
			if(modelVaribaleOption != null) {
				modelContainer.setModelVariableOption(modelVaribaleOption);
			} else {
				ResultElement<Configuration>  emptyModel = new ResultElement<Configuration>(sourceModel, targetModel, 1.0f, new EmptyVarsAttr());
				emptyModel.getAttribute().setWeight(metric.getModelVariableOptionAttr().getWeight());
				modelContainer.addResult(emptyModel);
			}
		}
		
		//compare pous
		if(metric.isModelImplementationOption()) {
			ModelImplementaionOption modelImplOption = compareModelImpl(sourceModel ,targetModel, metric);
			
			if(modelImplOption != null) {
				modelContainer.setModelImplementationOption(modelImplOption);
			} else {
				//handle no pous
				ResultElement<Configuration>  emptyModel = new ResultElement<Configuration>(sourceModel, targetModel, 1.0f, new EmptyModelAttr());
				emptyModel.getAttribute().setWeight(metric.getModelImplementationOptionAttr().getWeight());
				modelContainer.addResult(emptyModel);
			}
		}
		return modelContainer;
	}
	
	/**
	 * This method compare two Models with ModelAttributes that are selected in the metric.
	 */
	private void compareModel(Configuration sourceModel, Configuration targetModel, ModelCompareContainer modelContainer) {
		for(AbstractModelAttribute modelAttr : modelContainer.getMetric().getModelAttributs()) {
			if(modelAttr.isEnabled()) {
				ResultElement<Configuration> modelResult = modelAttr.compare(sourceModel, targetModel);
				if(modelResult != null) {
					modelContainer.getResults().add(modelResult);
				}
			}
		}
	}
	
	/**
	 * This method compares the underlying elements of a model and creating the ModelImplementaionOption.(done)
	 **/
	public ModelImplementaionOption compareModelImpl(Configuration sourceModel, Configuration targetModel, MetricContainer metric) {
		ModelImplementaionOption modelImplOption;
		List<POU> sourcePOUs = sourceModel.getResources().get(0).getPous();
		List<POU> targetPOUs = targetModel.getResources().get(0).getPous();
		
		if(sourcePOUs.isEmpty() && targetPOUs.isEmpty()) {
			modelImplOption = null;
		} else {
			modelImplOption = new ModelImplementaionOption(metric, metric.getModelImplementationOptionAttr());

			for(POU sourcePOU : sourcePOUs) {
				for(POU targetPOU : targetPOUs) {
					POUCompareContainer pouContainer = comparePOUs(sourcePOU,targetPOU, metric);
					if(pouContainer != null) {
						modelImplOption.addContainer(pouContainer);
					}
				}
			}
		}
		return modelImplOption;
	}

	/**
	 * this method compares the global variables and creates a ModelVariableOption. (done)
	 */
	public ModelVariableOption compareModelVars(Configuration sourceModel, Configuration targetModel, MetricContainer metric) {
		ModelVariableOption modelOption;
		List<Variable> sourceModelVariables = sourceModel.getResources().get(0).getGlobalVariables();
		List<Variable> targetModelVariables = targetModel.getResources().get(0).getGlobalVariables();
		
		if(sourceModelVariables.isEmpty() && targetModelVariables.isEmpty()) {
			modelOption = null;
		} else {
			modelOption = new ModelVariableOption(metric, metric.getModelVariableOptionAttr());
			for(Variable sourceVar : sourceModelVariables) {
				for(Variable targetVar : targetModelVariables) {
					//comapre vairables
					modelOption.addContainer(compareVariables(sourceVar, targetVar, PPUStringTable.GLOBAL_VARS_DESCRIPTION));
				}
			}
		}
		return modelOption;
	}
	
	/**
	 * This method compares two POUs with the give POU attributes and returns a POUCompareContainer.
	 **/
	public POUCompareContainer comparePOUs(POU sourcePOU, POU targetPOU, MetricContainer metric) {
		POUCompareContainer pouContainer = new POUCompareContainer(sourcePOU, targetPOU, metric);

		//Compare with all Attributes
		comparePOU(sourcePOU, targetPOU, pouContainer);
		
		//Compare POU implementation
		if(metric.isPOUImplementationOption()) {
			POUImplementationOption pouImplOption = comparePOUImplementation(sourcePOU ,targetPOU ,metric);
			if(pouImplOption != null) {
				pouContainer.setPouImplOption(pouImplOption);
			} else {
				//handle POUs has no implementation
				ResultElement<POU> emptyPOUImpl = new ResultElement<POU>(sourcePOU, targetPOU, 1.0f,new EmptyImplAttr());
				emptyPOUImpl.getAttribute().setWeight(metric.getPouOptionAttr().getWeight());
				
				pouContainer.addResult(emptyPOUImpl);
			}
		}
		
		//compare POUs Variables
		if(metric.isPOUVariableOption()) {
			POUVariableOption pouVarOption = comparePOUVariables(sourcePOU, targetPOU, metric);
			if(pouVarOption != null) {
				pouContainer.setPouVarOption(pouVarOption);
			} else {
				//handle POUs has no variables
				ResultElement<POU> emptyVars = new ResultElement<POU>(sourcePOU, targetPOU, 1.0f,new EmptyVarsAttr());
				emptyVars.getAttribute().setWeight(metric.getPouVariableOptionAttr().getWeight());
				pouContainer.addResult(emptyVars);
			}
		}
		
		//compare POUs Actions
		if(metric.isActionOption()) {
			POUActionOption pouActionOption = compareAction(sourcePOU, targetPOU, metric);
				
			if(pouActionOption != null) {
				pouContainer.setPouActionOption(pouActionOption);
			} else {
				//handle POUs has no actions 
				ResultElement<POU> emptyAction = new ResultElement<POU> (sourcePOU, targetPOU, 1.0f, new EmptyActionAttr());
				emptyAction.getAttribute().setWeight(metric.getPouActionAttr().getWeight());
				pouContainer.addResult(emptyAction);
			}
		}
		return pouContainer;
	}
	
	/**
	 * This method compares two POUs with POUAttributes that are selected in the metric.
	 */
	private void comparePOU(POU sourcePOU, POU targetPOU, POUCompareContainer pouContainer) {
		for(AbstractPOUAttribute pouAttr : pouContainer.getMetric().getPOUAttributs()) {
			if(pouAttr.isEnabled()) {
				pouContainer.setCompared(true);
				ResultElement<POU> pouResult = pouAttr.compare(sourcePOU, targetPOU);
				if(pouResult != null) {
					//double link
					pouContainer.getResults().add(pouResult);
				}
			}
		}
	}
	
	/**
	 * This method compares the implementation of two POUs and returns a POUImplementationOption.
	 */
	public POUImplementationOption comparePOUImplementation(POU sourcePou,POU targetPOU, MetricContainer metric) {
		POUImplementationOption pouImplOption;
		
		if(sourcePou.getImplementations().isEmpty() && targetPOU.getImplementations().isEmpty()) {
			pouImplOption = null;
		} else {
			pouImplOption = new POUImplementationOption(metric,metric.getPouOptionAttr());
			for(LanguageElement sourceElement : sourcePou.getImplementations()) {
				for(LanguageElement targetElement : targetPOU.getImplementations()) {
					AbstractLanguageContainer<?> container = compareLanguageElements(sourceElement, targetElement, metric);
					if(container != null) {
						pouImplOption.addContainer(container);
					}
				}
			}
		}
		return pouImplOption;
	}
	
	/**
	 * This method gets two LanguageElements and then checks in which language the implementation is done based 
	 * on the language its calls the specific method to compare the language.
	 */
	private AbstractLanguageContainer<?> compareLanguageElements(LanguageElement sourceElement, LanguageElement targetElement, MetricContainer metric) {
		if(sourceElement instanceof StructuredText && targetElement instanceof StructuredText && metric.isLanguageSTCompare()) {
			return compareStructuredText((StructuredText)sourceElement, (StructuredText)targetElement, metric);
		} else if(sourceElement instanceof SequentialFunctionChart && targetElement instanceof SequentialFunctionChart && metric.isLanguageSFCCompare()) {
			return compareSequentialFunctionChart((SequentialFunctionChart)sourceElement, (SequentialFunctionChart)targetElement, metric);
		} else if(sourceElement instanceof Diagram && targetElement instanceof Diagram ) {
			return compareDiagram((Diagram)sourceElement,(Diagram)targetElement, metric);
		} else {
			return null;
		}
	}

	/**
	 * Compares the variables of two POUS.
	 */
	public POUVariableOption comparePOUVariables(POU sourcePOU, POU targetPOU, MetricContainer metric) {
		POUVariableOption pouVarOption;
		//decompose in variable typs and compare 
		List<Variable> sourceInoutVars = sourcePOU.getDeclaration().getInOutVariables();
		List<Variable> targetInoutVars = targetPOU.getDeclaration().getInOutVariables();
		List<Variable> sourceInputVars = sourcePOU.getDeclaration().getInputVariables();
		List<Variable> targetInputVars = targetPOU.getDeclaration().getInputVariables();
		List<Variable> sourceOutputVars = sourcePOU.getDeclaration().getOutputVariables();
		List<Variable> targetOutputVars = targetPOU.getDeclaration().getOutputVariables();
		List<Variable> sourceInternalVars = sourcePOU.getDeclaration().getInternalVariables();
		List<Variable> targetInternalVars = targetPOU.getDeclaration().getInternalVariables();
		
		if(targetInoutVars.isEmpty() && sourceInputVars.isEmpty() && 
				targetInputVars.isEmpty() && sourceOutputVars.isEmpty() &&  
				targetOutputVars.isEmpty() && sourceInternalVars.isEmpty() && 
				targetInternalVars.isEmpty() ) {
			pouVarOption = null;
			
		} else {
			 pouVarOption = new POUVariableOption(metric, metric.getPouVariableOptionAttr());
			//for all InOutVariables	
			compareVarList(sourceInoutVars,targetInoutVars,pouVarOption, PPUStringTable.IN_OUT_VARS_DESCRIPTION, metric);
			//for all InputVars
			compareVarList(sourceInputVars, targetInputVars, pouVarOption, PPUStringTable.INPUT_VARS_DESCRIPTION,metric);
			//for all OutPutVars
			compareVarList(sourceOutputVars, targetOutputVars, pouVarOption, PPUStringTable.OUTPUT_VARS_DESCRIPTION,metric);
			//for all InternalVars
			compareVarList(sourceInternalVars, targetInternalVars, pouVarOption, PPUStringTable.INTERNAL_VARS_DESCRIPTION,metric);
		}
		return pouVarOption;
	}
	
	/**
	 * this method compares two sets of variables
	 */
	public void compareVarList(List<Variable> sourceVars, List<Variable> targetVars, POUVariableOption pouVarOption, String varTyp, MetricContainer metric) {
		for(Variable sourceVar : sourceVars) {
			for(Variable targetVar : targetVars) {
				pouVarOption.addContainer(compareVariables(sourceVar, targetVar, varTyp));
			}
		}
	}

	/**
	 * This method compare two variables.
	 */
	public VariableContainer compareVariables(Variable sourceVar, Variable targetVar, String varTyp) {
		VariableContainer varCont =  new VariableContainer(sourceVar, targetVar, metric, varTyp);
		for(AbstractVariableAttribute varAttr : varCont.getMetric().getVariableAttributes()) {
			if(varAttr.isEnabled()) {
				varCont.setCompared(true);
				ResultElement<Variable> variableCompResult = varAttr.compare(sourceVar, targetVar, varTyp);
				if(variableCompResult != null) {
					varCont.addResult(variableCompResult);
				}
			}
		}
		return varCont;
	}

	/**
	 * This method compares the actions of two given POUs, it compares every element from source pou with every element from target pou. Action will be compared on Action level and on implementation level.
	 */
	public POUActionOption compareAction(POU sourcePOU, POU targetPOU, MetricContainer metric) {
		POUActionOption pouActionOption;
		
		if(sourcePOU.getActions().isEmpty() && targetPOU.getActions().isEmpty()) {
			 pouActionOption = null;
			 
		} else if(sourcePOU.getActions().isEmpty() || targetPOU.getActions().isEmpty()) {
			pouActionOption = new POUActionOption(metric, metric.getActionImplementationAttr());
			
			for(Action sourceAction : sourcePOU.getActions()) {
				ActionCompareContainer actionContainer = new ActionCompareContainer(sourceAction, null, metric);
				actionContainer.setCompared(true);
				pouActionOption.addContainer(actionContainer);
			}
			for(Action targetAction : targetPOU.getActions()) {
				ActionCompareContainer actionContainer = new ActionCompareContainer(targetAction, null, metric);
				actionContainer.setCompared(true);
				pouActionOption.addContainer(new ActionCompareContainer(targetAction, null, metric));
			}
		} else {
			pouActionOption = new POUActionOption(metric, metric.getPouActionAttr());
			
			for(Action sourceAction : sourcePOU.getActions()) {
				for(Action targetAction : targetPOU.getActions()) {
					//compares action implementation
					ActionCompareContainer actionContainer = compareActions(sourceAction, targetAction, metric);
					
					if(actionContainer != null) {
						actionContainer.setCompared(true);
						pouActionOption.addContainer(actionContainer);
					}
				}
			}
		}

		return pouActionOption;
	}
	
	/**
	 * This method compares two actions with given action attributes.
	 */
	private ActionCompareContainer compareActions(Action sourceAction, Action targetAction, MetricContainer metric) {
		ActionCompareContainer actionContainer = new ActionCompareContainer(sourceAction, targetAction, metric);
		//compare with all attributes
		compareAction(sourceAction, targetAction, actionContainer);
		
		if(metric.isActionImplementaionOption()) {
			ActionImplementationOption actionImplOption = compareActionImplementation(sourceAction ,targetAction ,metric);
			
			if(actionImplOption != null) {
				actionContainer.setActionImplOption(actionImplOption);
			} else {
				//handle action has no implementation
				ResultElement<Action> emptyActionImpl = new ResultElement<Action>(sourceAction, targetAction, 1.0f, new EmptyActionImplAttr());
				emptyActionImpl.getAttribute().setWeight(metric.getActionImplementationAttr().getWeight());
				actionContainer.addResult(emptyActionImpl);
			}
		}
		return actionContainer;
	}
	
	/**
	 * This method compares two actions with ActionAttributes and adds all results to the given container.
	 */
	private void compareAction(Action sourceAction, Action targetAction, ActionCompareContainer actionContainer) {
		for(AbstractActionAttribute actionAttr : actionContainer.getMetric().getActionAttributes()) {
			if(actionAttr.isEnabled()) {
				actionContainer.setCompared(true);
				ResultElement<Action> actionResult = actionAttr.compare(sourceAction, targetAction);
				if(actionResult != null) {
					actionContainer.getResults().add(actionResult);
				}
			}
		}
	}
	
	/**
	 * This method compares the implementation of two actions.
	 */
	private ActionImplementationOption compareActionImplementation(Action sourceAction, Action targetAction, MetricContainer metric) {
		ActionImplementationOption actionOption;

		if(sourceAction.getImplementation() == null && targetAction.getImplementation() == null) {
			actionOption = null;
		} else {
			actionOption = new ActionImplementationOption(metric,metric.getActionImplementationAttr());
			//compare the language elements with all lang attr
			AbstractLanguageContainer<?> langContainer = compareLanguageElements(sourceAction.getImplementation(),targetAction.getImplementation(), metric);
			if(langContainer != null) {
				actionOption.addContainer(langContainer);
			}
		}
		return actionOption;
	}
	
	/**
	 * This method compares two structured text instances and the underlying elements and returns a STLangContainer.
	 */
	private STLangContainer compareStructuredText(StructuredText first, StructuredText second, MetricContainer metric) {
		//compares two structured texts
		STLangContainer stContainer = compareSTLang(first, second);
		if(metric.isSTImplCompare()) {
			stContainer.setImplOption(compareSTImpl(first.getStatements(),second.getStatements(), metric));
		}
		return stContainer;	
	}
	
	/**
	 * This method compares two Ladder Diagrams and the underlying elements and returns a LDLangContainer.
	 */
	private DiagramContainer compareDiagram(Diagram sourceDiagram, Diagram targetDiagram, MetricContainer metric) {
		DiagramContainer diagramLangContainer = new DiagramContainer(sourceDiagram, targetDiagram, metric);
		//compare ladder diagram
		if(sourceDiagram.getType().equals(DiagramType.LADDER_DIAGRAM) && targetDiagram.getType().equals(DiagramType.LADDER_DIAGRAM)) {
			compareLDLang(sourceDiagram, targetDiagram, diagramLangContainer);
			//compare single diagram elements
			if(metric.isLDImplCompare()) {
				diagramLangContainer.setImplOption(compareDiagramImpl(sourceDiagram,targetDiagram, metric));
			}
		//compare function block diagram
		} else if (sourceDiagram.getType().equals(DiagramType.FUNCTION_BLOCK_DIAGRAM) && targetDiagram.getType().equals(DiagramType.FUNCTION_BLOCK_DIAGRAM)) {
			compareFBDLang(sourceDiagram, targetDiagram, diagramLangContainer);
			//compare single diagram elements
			if(metric.isFBDImplCompare()) {
				diagramLangContainer.setImplOption(compareDiagramImpl(sourceDiagram,targetDiagram, metric));
			}
		}
		return diagramLangContainer;	
	}

	/**
	 * This method compares two SequentialFunctionChart instances and the underlying elements and returns a SFCLangContainer.
	 */
	private SFCLangContainer compareSequentialFunctionChart(SequentialFunctionChart sourceSFC, SequentialFunctionChart targetSFC, MetricContainer metric) {
		SFCLangContainer sfcContainer = new SFCLangContainer(sourceSFC, targetSFC, metric);
		
		compareSFCLang(sourceSFC, targetSFC, sfcContainer);
		
		//compare single steps if selected.
		if(metric.isSFCImplCompare()) {
			sfcContainer.setImplOption(compareSFCImpl(sourceSFC,targetSFC, metric));	
		}
		return sfcContainer;	
	}
	
	/**
	 * This method compare the implementation of two StructuredText elements.
	 */
	private LanguageImplementationOption<STImplContainer> compareSTImpl(List<Statement> sourceStatements, List<Statement> targetStatements, MetricContainer metric) {
		LanguageImplementationOption<STImplContainer> langImplOption = null;
		
		if(sourceStatements.isEmpty() && targetStatements.isEmpty()) {
			return null;
		} else if (sourceStatements.isEmpty() || targetStatements.isEmpty()) {
			langImplOption = new LanguageImplementationOption<STImplContainer>(metric, metric.getStImplOptionAttr());
			for(Statement srcStatement : sourceStatements) {
				langImplOption.addContainer(new STImplContainer(srcStatement, null,metric));
			}
			for(Statement trgStatement : targetStatements) {
				langImplOption.addContainer(new STImplContainer(null, trgStatement, metric));
			}
		} else {
			langImplOption = new LanguageImplementationOption<STImplContainer>(metric, metric.getStImplOptionAttr());
			//Disassemble StructuredText in Statements
			for(Statement sourceStatement : sourceStatements) {
				for(Statement targetStatement : targetStatements) {
					//compare statements with stImplAttributes.
					STImplContainer stImplContainer = compareStatements(sourceStatement, targetStatement, metric);
					langImplOption.addContainer(stImplContainer);

					//Get sub statements if available
					DefaultStatementStructure dss = new DefaultStatementStructure();
					List<Statement> sourceSubStatements = dss.getSubstatements(sourceStatement).getValues();
					List<Statement> targetSubStatements = dss.getSubstatements(targetStatement).getValues();
					
					//Recursively compare of subStatements
					if(!sourceSubStatements.isEmpty() && !targetSubStatements.isEmpty()) {
						LanguageImplementationOption<STImplContainer> recImplOption = compareSTImpl(sourceSubStatements, targetSubStatements , metric);
						if(recImplOption != null) {
							stImplContainer.setImplOption(recImplOption);
						}
					}
				}
			}
		}
		return langImplOption;	
	}
	
	/**
	 * This method compare the steps of two SFC instances .
	 */
	private LanguageImplementationOption<SFCImplContainer> compareSFCImpl(SequentialFunctionChart sourceSFC, SequentialFunctionChart targetSFC, MetricContainer metric) {
		LanguageImplementationOption<SFCImplContainer> langImplOption = null;
			//check if one of both SFCs has no steps
			if(sourceSFC.getSteps().isEmpty() && targetSFC.getSteps().isEmpty()) {
				return null;
			} else if (sourceSFC.getSteps().isEmpty()|| targetSFC.getSteps().isEmpty()) {
				langImplOption = new LanguageImplementationOption<SFCImplContainer>(metric, metric.getSfcImplOptionAttr());
				for(Step srcStep : sourceSFC.getSteps()) {
					langImplOption.addContainer(new SFCImplContainer(srcStep, null,metric));
				}
				for(Step trgStep : targetSFC.getSteps()) {
					langImplOption.addContainer(new SFCImplContainer(null, trgStep, metric));
				}
			} else {
				langImplOption = new LanguageImplementationOption<SFCImplContainer>(metric, metric.getSfcImplOptionAttr());
				//Disassemble Sequential Function Chart into single steps
				for(Step sourceStep : sourceSFC.getSteps()) {
					for(Step targetStep : targetSFC.getSteps()) {
						langImplOption.addContainer(compareSteps(sourceStep, targetStep, metric));
					}
				}
			}
		return langImplOption;	
	}

	/**
	 * This method compares the networks of two diagrams
	 */
	private LanguageImplementationOption<AbstractLanguageContainer<?>> compareDiagramImpl(Diagram sourceDiagram, Diagram targetDiagram, MetricContainer metric) {
		LanguageImplementationOption<AbstractLanguageContainer<?>> langImplOption = null;
		//if no networks are available
		if(sourceDiagram.getNetworks().isEmpty() && targetDiagram.getNetworks().isEmpty()) {
			return null;
		} else if(sourceDiagram.getNetworks().isEmpty() || targetDiagram.getNetworks().isEmpty()) {
			langImplOption = new LanguageImplementationOption<AbstractLanguageContainer<?>>(metric, metric.getLdImplOptionAttr());
			for(Network sourceNetwortk : sourceDiagram.getNetworks()) {
				langImplOption.addContainer(new LDNetworkImplContainer((LadderNetwork)sourceNetwortk, null, metric));
			}
			for(Network targetNetwork : targetDiagram.getNetworks()) {
				langImplOption.addContainer(new LDNetworkImplContainer(null, (LadderNetwork)targetNetwork, metric));
			}
		} else {
			langImplOption = new LanguageImplementationOption<AbstractLanguageContainer<?>>(metric, metric.getLdImplOptionAttr());
			for(Network sourcNetwork : sourceDiagram.getNetworks()) {
				for(Network targetNetwork : targetDiagram.getNetworks()) {
					if(sourcNetwork instanceof LadderNetwork && targetNetwork instanceof LadderNetwork) {
						LDNetworkImplContainer ldImplContainer = new LDNetworkImplContainer((LadderNetwork)sourcNetwork,(LadderNetwork)targetNetwork, metric);
						langImplOption.addContainer(ldImplContainer);
						//Compare NetworkElements
						ldImplContainer.setImplOption(compareNetworks((LadderNetwork)sourcNetwork,(LadderNetwork)targetNetwork, metric));
					} else {
						FBDNetworkImplContainer diagramContainer = new FBDNetworkImplContainer(sourcNetwork, targetNetwork, metric);
						langImplOption.addContainer(diagramContainer);
						diagramContainer.setImplOption(compareNetworks(sourcNetwork,targetNetwork, metric));
					}
				}
			}
		}
		return langImplOption;
	}

	/**
	 * This method compares the network elements of two diagrams.
	 */
	private LanguageImplementationOption<DiagramElementImplContainer> compareNetworks(Network sourceNetwork, Network targetNetwork, MetricContainer metric) {
		LanguageImplementationOption<DiagramElementImplContainer> ldElementImplOption = null;
		if(sourceNetwork.getNetworkElements().isEmpty() && targetNetwork.getNetworkElements().isEmpty()) {
			return null;
		} else if(sourceNetwork.getNetworkElements().isEmpty() || targetNetwork.getNetworkElements().isEmpty()) {
			ldElementImplOption = new LanguageImplementationOption<DiagramElementImplContainer>(metric, metric.getLdImplOptionAttr());
			for(DiagramElement sourceElement : sourceNetwork.getNetworkElements()) {
				ldElementImplOption.addContainer(new DiagramElementImplContainer(sourceElement, null, metric));
			}
			for(DiagramElement targetElement : targetNetwork.getNetworkElements()) {
				ldElementImplOption.addContainer(new DiagramElementImplContainer(null, targetElement, metric));
			}
		} else {
			ldElementImplOption = new LanguageImplementationOption<DiagramElementImplContainer>(metric, metric.getLdImplOptionAttr());
			for(DiagramElement sourceElement : sourceNetwork.getNetworkElements()) {
				for(DiagramElement targetElement : targetNetwork.getNetworkElements()) {
					DiagramElementImplContainer elemenContainer = new DiagramElementImplContainer(sourceElement,targetElement, metric);
					ldElementImplOption.addContainer(elemenContainer);
					//if the option function block compare is selected.
					if(sourceElement instanceof FBDElement && targetElement instanceof FBDElement) {
						if(metric.isLDFunctionBlockOption() && sourceNetwork instanceof LadderNetwork || metric.isFBDImplCompare()) {
							compareFBDElement((FBDElement)sourceElement, (FBDElement)targetElement, elemenContainer);
						}
					} else if(sourceElement instanceof LLElement && targetElement instanceof LLElement){
						//compare the other block like coils or contacts.
						compareLDElement((LLElement)sourceElement, (LLElement)targetElement, elemenContainer);
					} else if(sourceElement instanceof ExecutionBlock || targetElement instanceof ExecutionBlock) {
						//find an other solution 
						elemenContainer.setCompared(true);
					}
				}	
			}
		}
		return ldElementImplOption;
	}
	
	/**
	 * This method compares two Structured Text with STLangAttributes and adds results two the given container.
	 */
	private STLangContainer compareSTLang(StructuredText sourceST, StructuredText targetST) {
		STLangContainer stContainer = new STLangContainer(sourceST, targetST, metric);
		for(AbstractSTLangAttribute stLangAttr : stContainer.getMetric().getSTLangAttributes()) {
			if(stLangAttr.isEnabled()) {
				stContainer.setCompared(true);
				ResultElement<StructuredText> stLangResult = stLangAttr.compare(sourceST, targetST);
				if(stLangResult != null) {
					stContainer.addResult(stLangResult);
				}
			}
		}
		return stContainer;
	}
	
	/**
	 * This method compares ST Statement with STImplAttribute and adds the results to given container.
	 */
	private STImplContainer compareStatements(Statement sourceStatement, Statement targetStatement, MetricContainer metric) {
		STImplContainer stImplContainer = new STImplContainer(sourceStatement, targetStatement, metric);
		for(AbstractSTImplAttribute stAttr : metric.getSTImplAttributes()) {
			if(stAttr.isEnabled()) {
				stImplContainer.setCompared(true);
				ResultElement<Statement> result = stAttr.compare(sourceStatement, targetStatement);
				if(result != null) {
					stImplContainer.addResult(result);
				}
			}
		}
		return stImplContainer;
	}
	
	/**
	 * This method compares a SFC with SFCLangAttribute and adds the results to given container.
	 */
	private void compareSFCLang(SequentialFunctionChart sourceSFC, SequentialFunctionChart targetSFC, SFCLangContainer sfcContainer) {
		for(AbstractSFCLangAttribute sfcLangAttr : sfcContainer.getMetric().getSFCLangAttributes()) {
			if(sfcLangAttr.isEnabled()) {
				sfcContainer.setCompared(true);
				ResultElement<SequentialFunctionChart> stLangResult = sfcLangAttr.compare(sourceSFC, targetSFC);
				if(stLangResult != null) {
					sfcContainer.addResult(stLangResult);
				}
			}
		}
	}
	
	/**
	 * This method compares SFC Steps with SFCImplAttribute and adds the results to given container.
	 */
	private SFCImplContainer compareSteps(Step first, Step second, MetricContainer metric ) {
		SFCImplContainer sfcImplContainer = new SFCImplContainer(first, second, metric);
		//Compare with Attributes
		for(AbstractSFCImplAttribute sfcAttr : metric.getSFCImplAttributes()) {
			if(sfcAttr.isEnabled()) {
				sfcImplContainer.setCompared(true);
				ResultElement<Step> result = sfcAttr.compare(first, second);
				if(result != null) {
					sfcImplContainer.addResult(result);
				}
			}
		}
		//Compare Actions
		if(metric.isSFCActionImplCompare()) {
			SFCActionOption option = compareSFCActions(first.getActions(), second.getActions(), metric);
			if(option != null) {
				sfcImplContainer.setActionOption(option);
			} else {
				EmptyActionImplAttr attr = new EmptyActionImplAttr();
				attr.setWeight(metric.getSfcActionImplOption().getWeight());
				sfcImplContainer.addResult(new ResultElement<Step>(first, second, 1.0f,attr));
			}	
		}
		
		
		return sfcImplContainer;
	}
	
	/**
	 * This method compares SFC assigned actions.
	 */
	private SFCActionOption compareSFCActions(List<AbstractAction> sourceActions, List<AbstractAction> targetActions, MetricContainer metric) {
		if(sourceActions.isEmpty() && targetActions.isEmpty()) {
			return null;
		}
		SFCActionOption actionOption = new SFCActionOption(metric, metric.getSfcActionImplOption());
		
		/**
		 * Check if one of both steps has no actions.
		 */
		if(sourceActions.isEmpty() || targetActions.isEmpty()) {
			for(AbstractAction action : targetActions) {
				if(action instanceof SimpleAction) {
					actionOption.addContainer(new SFCActionContainer(null, action ,metric));
				}

			}
			for(AbstractAction action : sourceActions) {
				actionOption.addContainer(new SFCActionContainer(action, null ,metric));
			}
			return actionOption;
		}
		
		/**
		 * Compare actions.
		 */
		for(AbstractAction sourceAction : sourceActions) {
			for(AbstractAction targetAction : targetActions) {
				if(sourceAction instanceof SimpleAction && targetAction instanceof SimpleAction) {
					SimpleAction simpleSource = (SimpleAction)sourceAction;
					SimpleAction simpleTarget = (SimpleAction)targetAction;
					actionOption.addContainer(compareVariables(simpleSource.getActionVariable(), simpleTarget.getActionVariable(), "ACTION_VAR"));
	
				} else if (sourceAction instanceof ComplexAction && targetAction instanceof ComplexAction) {
					Action complexSource = ((ComplexAction)sourceAction).getPouAction();
					Action complexTarget = ((ComplexAction)targetAction).getPouAction();
					if(complexSource != null && complexTarget != null) {
						actionOption.addContainer(compareActions(complexSource, complexTarget, metric));
					}
				}	
			}
		}
		if(actionOption.getAllContainer().isEmpty())
			return null;
		
		return actionOption;
	}
	
	/**
	 * This method compares a Ladder Diagram with LDLangAttribute and adds the results to given container.
	 */
	private void compareLDLang(Diagram sourceDiagram, Diagram targetDiagram, IECAbstractContainer<Diagram> ldLangContainer) {
		for(AbstractLDLangAttribute LDLangAttr : ldLangContainer.getMetric().getLDLangAttributes()) {
			if(LDLangAttr.isEnabled()) {
				ldLangContainer.setCompared(true);
				ResultElement<Diagram> ldLangResult = LDLangAttr.compare(sourceDiagram, targetDiagram);
				if(ldLangResult != null) {
					ldLangContainer.addResult(ldLangResult);
				}
			}
		}
	}
	
	/**
	 * This method compares a Ladder Diagram with LDLangAttribute and adds the results to given container.
	 */
	private void compareFBDLang(Diagram sourceDiagram, Diagram targetDiagram, IECAbstractContainer<Diagram> ldLangContainer) {
		for(AbstractFBDLangAttribute LDLangAttr : ldLangContainer.getMetric().getFbdLangAttributes()) {
			if(LDLangAttr.isEnabled()) {
				ldLangContainer.setCompared(true);
				ResultElement<Diagram> ldLangResult = LDLangAttr.compare(sourceDiagram, targetDiagram);
				if(ldLangResult != null) {
					ldLangContainer.addResult(ldLangResult);
				}
			}
		}
	}
	
	/**
	 * This method compares DiagramElements with LDImplAttribute and adds the results to given container.
	 */
	private void compareLDElement(LLElement first , LLElement second ,DiagramElementImplContainer elemenContainer) {
		for(AbstractLDImplAttribute ldAttr : elemenContainer.getMetric().getLDImplAttributes()) {
			if(ldAttr.isEnabled()) {
				elemenContainer.setCompared(true);
				ResultElement<DiagramElement> ldResult = ldAttr.compare(first, second);
				if(ldResult != null) {
					elemenContainer.addResult(ldResult);
				}
			}
		}
	}
	
	/**
	 * This method compares Function Blocks with FDBImplAttributes and adds the results to given container.
	 */
	private void compareFBDElement(FBDElement first , FBDElement second , DiagramElementImplContainer container) {
		//Compares nested ST implementation
		if(container.getMetric().isFBDSTCompare()) {
			if(first instanceof ExecutionBlock && second instanceof ExecutionBlock) {
				container.setCompared(true);
				StructuredText firstST = ((ExecutionBlock)first).getExecutionStatements();
				StructuredText secondST = ((ExecutionBlock)second).getExecutionStatements();
				LanguageImplementationOption<?> nestedSTImpl = compareSTImpl(firstST.getStatements(), secondST.getStatements(), container.getMetric());
				container.setImplOption(nestedSTImpl);
			}	
		}
		for(AbstractFBDImplAttribute fbdAttr : container.getMetric().getFBDImplAttributes()) {
			if(fbdAttr.isEnabled()) {
				container.setCompared(true);
				ResultElement<DiagramElement> ldResult = fbdAttr.compare(first, second);
				if(ldResult != null) {
					container.addResult(ldResult);
				}
			}
		}
		for(AbstractFBDImplAttribute fbdAttr : container.getMetric().getFBDImplAttributes()) {
			if(fbdAttr.isEnabled()) {
				container.setCompared(true);
				ResultElement<DiagramElement> ldResult = fbdAttr.compare(first, second);
				if(ldResult != null) {
					container.addResult(ldResult);
				}
			}
		}
	}

	public ConfigurationResultRoot getResult() {
		return result;
	}

	public void setResult(ConfigurationResultRoot result) {
		this.result = result;
	}

}
