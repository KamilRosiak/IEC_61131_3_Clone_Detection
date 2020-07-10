package de.tu_bs.cs.isf.familymining.ppu_iec.parser.SFC.impl;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_CONTENT_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_NAME_ATTRIBUTE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.SFC.util.SFCTraverselUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.SFC.util.SFCUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XmlDomUtility;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.AbstractAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.ComplexAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SimpleAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.StepQualifier;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Transition;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserType;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.abstracts.AbstractNodeCallback;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.Registry;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.RegistryService;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.iec.IECRegistry;

public class SFCNodeCallback extends AbstractNodeCallback {
	
	private final static String CALLABLE_ID = "SFCNodeCallback";
	
	protected SequentialFunctionChartFactory sfcFactory = null;
	protected SequentialFunctionChart modelRoot = null;

	private List<SFCDivergence> divs;
	private List<SFCTransition> refsTransitions;
	private Map<Integer, Step>  refsSteps;
	private List<SFCAction> actions;
	private Map<Integer, String> vars;
	private List<SFCJumpStep> refsJumpTarget;
	
	public SFCNodeCallback() {
		super(CALLABLE_ID);
		sfcFactory      = SequentialFunctionChartFactory.eINSTANCE;
		modelRoot       = sfcFactory.createSequentialFunctionChart();
		
		refsTransitions = new ArrayList<SFCTransition>();
		refsJumpTarget  = new ArrayList<SFCJumpStep>();
		refsSteps 	    = new HashMap<Integer, Step>();
		actions			= new ArrayList<SFCAction>();
		vars	        = new HashMap<Integer, String>();
		divs 			= new ArrayList<SFCDivergence>();
	}
	
	private List<SFCDivergence> getDivs(int refID) {
		List<SFCDivergence> foundDivs = new ArrayList<SFCDivergence>();
		for(SFCDivergence div : divs) {
			if(div.getLocalID() == refID) {
				foundDivs.add(div);
			}
		}
		return foundDivs;
	}

	@Override
	public void processNode(ParserNode node) {
		for (ParserNode child : node.getChildren()) {
			processChildNode(child);			
			processNode(child); // recurse
		}	
	}
	
	private void processChildNode(ParserNode node) {
		String nodeName = node.get(NODE_NAME_ATTRIBUTE);
		switch (nodeName) {
		case "step":
			processStepNode(node);
			break;
		case "inVariable":
			processInVarNode(node);
			break;
		case "transition":
			processTransition(node);
			break;
		case "actionBlock":
			processActionBlock(node);
			break;
		case "jumpStep":
			processJumpStep(node);
			break;
		case "selectionDivergence":
			processSelectionDivergence(node);
			break;
		case "selectionConvergence":
			processSelectionDivergence(node);
			break;
		case "simultaneousDivergence":
			processSelectionDivergence(node);
			break;
		case "simultaneousConvergence":
			processSelectionDivergence(node);
			break;
		default:
			break;
		}
	}
	
	/**
	 * This method processes selectionDivergence,selectionConvergence and simultaneousDivergence.
	 */
	private void processSelectionDivergence(ParserNode node) {
		int localId = Integer.parseInt(node.get("localId"));
		SFCDivergence divergence = new SFCDivergence(localId);
		processConnectionPointIn(node, divergence);
	}

	/**
	 * This method processes jump steps and fill the refsJumpTarget map for post-processing. 
	 */
	private void processJumpStep(ParserNode node) {
		String targetName = node.get("targetName");
		SFCJumpStep jumpStep = new SFCJumpStep(Integer.parseInt(node.get("localId")), targetName);
		processConnectionPointIn(node, jumpStep);
	}
	
	/**
	 * This method processes the ConnectionPoints of a parser node fills the reference location to every map with the given object. 
	 */
	private void processConnectionPointIn(ParserNode node, Object element) {
		for(ParserNode child : node.getChildren()) {
			if(child.get(NODE_NAME_ATTRIBUTE).equals("connectionPointIn")) {
				for(ParserNode childchild : child.getChildren()) {
					if(childchild.get(NODE_NAME_ATTRIBUTE).equals("connection")) {
						int refLocalID = Integer.parseInt(childchild.get("refLocalId"));
						if(element instanceof Step) {
							Step step = (Step)element;
							refsSteps.put(refLocalID, step);
						} else if(element instanceof SFCTransition) {
							SFCTransition transition = (SFCTransition)element;
							transition.setRefLocalID(refLocalID);
							refsTransitions.add(transition);
						} else if(element instanceof SFCDivergence) {
							SFCDivergence sfcDiv = (SFCDivergence)element;
							SFCDivergence sfcNewDiv = new SFCDivergence(sfcDiv.getLocalID());
							sfcNewDiv.setRefLocalId(refLocalID);
							divs.add(sfcNewDiv);
						} else if(element instanceof SFCJumpStep) {
							SFCJumpStep sfcJump = (SFCJumpStep)element;
							sfcJump.setRefLocalId(refLocalID);
							refsJumpTarget.add(sfcJump);
						}
					}
				}
			}
		}
	
	}
	
	/**
	 * This method processes the actions and fills the refAction map for the post-processing.
	 */
	private void processActionBlock(ParserNode actionBlockNode) {
		// accumulate all actions in the node
		int refLocalId = getRefLocation(actionBlockNode);
		for(ParserNode actionBlockChildNode : actionBlockNode.getChildren()) {
			if(actionBlockChildNode.get(NODE_NAME_ATTRIBUTE).equals("action")) {
				AbstractAction action = buildAction(actionBlockChildNode);
				actions.add(new SFCAction(refLocalId, action));
			}
		}
	}

	/**
	 * Returns the reference ID of an node if available else -1.
	 */
	private int getRefLocation(ParserNode node) {
		for(ParserNode child : node.getChildren()) {
			if(child.get(NODE_NAME_ATTRIBUTE).equals("connectionPointIn")) {
				for(ParserNode childchild : child.getChildren()) {
					if(childchild.get(NODE_NAME_ATTRIBUTE).equals("connection")) {
						int refLocalID = Integer.parseInt(childchild.get("refLocalId"));
						return refLocalID;
					}
				}
			}
		}
		return -1;
	}
	
	private AbstractAction buildAction(ParserNode actionNode) {
		// check if referenced entity is boolean variable or action
		ParserNode referenceNode = XmlDomUtility.getChildOf(actionNode, "reference");
		
		// look for local boolean variables with reference name
		Registry<Variable> localVarRegistry = RegistryService.getInstance().getService(IECRegistry.LOCAL_VAR_REG);
		String referencedName = referenceNode.get("name");
		if (localVarRegistry.isRegistered(referencedName)) { // referenced name is a variable --> simple action
			Variable var = localVarRegistry.get(referencedName);
			if (var.getType() == ElementaryDataType.BOOL) {
				SimpleAction simpleAction = sfcFactory.createSimpleAction();
				simpleAction.setLocalId(Integer.parseInt(actionNode.get("localId")));
				simpleAction.setQualifier(StepQualifier.get(actionNode.get("qualifier")));
				simpleAction.setActionVariable(var);
				return simpleAction;
			} else {
				throw new RuntimeException("Reference variable must be of type boolean.");
			}
		}
		
		// look for local actions or actions of pou variables
		Registry<Action> POUActionRegistry = RegistryService.getInstance().getService(IECRegistry.LOCAL_ACTION_REG);
		String[] varTokens = referencedName.split("\\.");

		if (varTokens.length <= 2) {
			// set fields
			ComplexAction complexAction = sfcFactory.createComplexAction();
			complexAction.setLocalId(Integer.parseInt(actionNode.get("localId")));
			complexAction.setQualifier(StepQualifier.get(actionNode.get("qualifier")));
			
			// resolve action reference
			if (varTokens.length == 1) { // simple local action reference
				POUActionRegistry.performAction(referencedName, action -> {
					complexAction.setPouAction(action);
				});
			} else { // reference on action of local pou variable
				String localVarName = varTokens[0];
				String actionName = varTokens[1];
				Variable var = localVarRegistry.get(localVarName);
				if (var.getType() == ElementaryDataType.DERIVED) {
					Registry<POU> pouRegistry = RegistryService.getInstance().getService(IECRegistry.POU_REG);
					pouRegistry.performAction(var.getTypeName(), pou -> {
						pou.getActions().stream()
							.filter(pouAction -> pouAction.getName().equals(actionName))
							.forEach(pouAction -> complexAction.setPouAction(pouAction));
					});
				} else {
					throw new RuntimeException("Variable must be of ElementaryDataType DERIVED");
				}		
			}
			return complexAction;
		} else {
			throw new RuntimeException("Referencing POU variables over more than one POU variable is cannot be processed.");
		}
	}
	
	/**
	 * This method processes the transitions and starts condition processing. 
	 */
	private void processTransition(ParserNode node) {
		Transition transition = sfcFactory.createTransition();
		transition.setLocal_ID(Integer.parseInt(node.get("localId")));
		modelRoot.getTransitions().add(transition);
		processConnectionPointIn(node, new SFCTransition(transition.getLocal_ID(), transition));
		processCondition(node, transition);
	}

	/**
	 * This method processes the condition node and set the condition to the given transition.
	 */
	private void processCondition(ParserNode node, Transition transition) {
		for(ParserNode child : node.getChildren()) {
			if(child.get(NODE_NAME_ATTRIBUTE).equals("condition")) {
				for(ParserNode childChild : child.getChildren()) {
					if(childChild.get(NODE_NAME_ATTRIBUTE).equals("connectionPointIn")) {
						for(ParserNode connectionNode : childChild.getChildren()) {
							if(connectionNode.get(NODE_NAME_ATTRIBUTE).equals("connection")) {
								int refLocalId = Integer.parseInt(connectionNode.get("refLocalId"));
								transition.setCondition(vars.get(refLocalId));
							}
						}
					}	
				}
			} 
		}
	}

	/**
	 * This method processes a parser node of in variable
	 * @param node
	 */
	private void processInVarNode(ParserNode node) {
		int localId = Integer.valueOf(node.get("localId"));
		ParserNode expression = XmlDomUtility.getChildOf(node, "expression");
		if (expression != null) {
			vars.put(localId, expression.get(NODE_CONTENT_ATTRIBUTE));		
		}
	}
	
	/**
	 * This method processes a parser node of type step
	 * @param node
	 */
	private void processStepNode(ParserNode node) {
		Step step = sfcFactory.createStep();
		step.setName(node.get("name"));
		step.setInitialStep(Boolean.parseBoolean(node.get("initialStep")));
		step.setLocal_ID(Integer.valueOf(node.get("localId")));
		modelRoot.getSteps().add(step);
		processConnectionPointIn(node, step);
	}

	@Override
	public EObject getResult() {
		return modelRoot;
	}

	@Override
	public ParserType getType() {
		return ParserType.SEQUENTIAL_FUNCTION_CHART;
	}
	
	@Override
	public int postProcessing() {
		SFCUtil util = new SFCUtil(modelRoot);
		postProcessAction(util);
		postProcessTransitionJumpTargets(util);
		postProcessSteps(util);
		postProcessTransitions(util);
		for(Step step : modelRoot.getSteps()) {
			if(step.getInitialStep()) {
				SFCTraverselUtil.setStepLevel(step, 0);
			}
		}
		
		return 0;
	}

	/**
	 * PostProcess Steps add the Transitions target step.
	 * @param util
	 */
	private void postProcessTransitionJumpTargets(SFCUtil util) {
		for(SFCJumpStep sfcJumpStep : refsJumpTarget) {
			Step step = util.getStep(sfcJumpStep.getJumpTarget()); 
			if(step != null) {
				List<Transition> transitions = getTransition(util, sfcJumpStep.getRefLocalId(), new ArrayList<Transition>());
				if(!transitions.isEmpty()) {
					for(Transition transition : transitions) {
						transition.setIsJump(true);
						transition.getTargetStep().add(step);
					}
				} else {
					System.err.println("no transitions found for jump");
				}
			} else {
				System.err.println("Unknowen jump target.");
			}
		}	
	}
	
	/**
	 * This method returns all referenced transition.
	 */
	private List<Transition> getTransition(SFCUtil util, int refLocatId, List<Transition> transitionList) {
		List<SFCDivergence> divs = getDivs(refLocatId);
		if(divs.isEmpty()) {
			Transition transition = util.getTransition(refLocatId);
			if(transition != null) {
				if(!transitionList.contains(transition))
					transitionList.add(transition);
			}
			return transitionList;
		} else {
			for(SFCDivergence sfcDiv : divs) {
				List<Transition> recTransitions = getTransition(util, sfcDiv.getRefLocalId(), transitionList);
				for(Transition recTransition : recTransitions) {
					if(!transitionList.contains(recTransition)) {
						transitionList.add(recTransition);
					}
				}
			}
			return transitionList;
		}
	}
	
	/**
	 * This method returns all referenced steps.
	 */
	private List<Step> getSteps(SFCUtil util, int refLocatId, List<Step> steps) {
		List<SFCDivergence> divs = getDivs(refLocatId);
		if(divs.isEmpty()) {
			Step step = util.getStep(refLocatId);
			if(step != null && !steps.contains(step)) {
				steps.add(step);
			}
			return steps;
		} else {
			for(SFCDivergence sfcDiv : divs) {
				List<Step> recSteps = getSteps(util, sfcDiv.getRefLocalId(), steps);
				for(Step recStep : recSteps) {
					if(!steps.contains(recStep)) {
						steps.add(recStep);
					}
				}
			}
			return steps;
		}
	}
	
	/**
	 * PostProcess Actions add the actions to reference step.
	 */
	private void postProcessAction(SFCUtil util) {
		for(SFCAction sfcAction : actions) {
			Step step = util.getStep(sfcAction.getRefLocation());
			if(step != null) {
				step.getActions().add(sfcAction.getAction());
			} else {
				System.err.println("unknown action source found.");
			}
		}
	}
	
	/**
	 * PostProcess Transitions
	 */
	private void postProcessTransitions(SFCUtil util) {	
		for(SFCTransition sfcTransition : refsTransitions) {
			List<Step> steps = getSteps(util, sfcTransition.getRefLocalID(), new ArrayList<Step>());
			
			if(!steps.isEmpty()) {
				for(Step step : steps) {
					step.getOutgoingTransitions().add(sfcTransition.getTransition());
					if(!sfcTransition.getTransition().getSourceStep().contains(step)) {
						sfcTransition.getTransition().getSourceStep().add(step);
					}
				}
			} else {
				System.err.println("No source step for transition found");
			}
		}
	}
	
	/**
	 * PostProcess Steps
	 */
	private void postProcessSteps(SFCUtil util) {
		for(Entry<Integer, Step> entry : refsSteps.entrySet()) {
			List<Transition> transitions =  getTransition(util, entry.getKey(), new ArrayList<Transition>());
			if(!transitions.isEmpty()) {
				for(Transition trans : transitions) {
					entry.getValue().getIncomingTransitions().add(trans);
					trans.getTargetStep().add(entry.getValue());
				}
			} else {
				System.err.println("unknown connection to step found");
			}
		}
	}
}
