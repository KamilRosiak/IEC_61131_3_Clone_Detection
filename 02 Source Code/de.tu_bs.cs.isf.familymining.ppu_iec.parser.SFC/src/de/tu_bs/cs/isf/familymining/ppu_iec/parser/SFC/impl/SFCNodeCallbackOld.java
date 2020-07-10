package de.tu_bs.cs.isf.familymining.ppu_iec.parser.SFC.impl;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_CONTENT_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_NAME_ATTRIBUTE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XmlDomUtility;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.AbstractAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.StepQualifier;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Transition;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserType;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.abstracts.AbstractNodeCallback;

public class SFCNodeCallbackOld extends AbstractNodeCallback {
	
	private final static String CALLABLE_ID = "SFCNodeCallback";
	
	protected SequentialFunctionChartFactory sfcFactory = null;
	protected SequentialFunctionChart modelRoot = null;
	protected Step activeStep;
	protected Transition activeTransition;
	protected AbstractAction activeAction;
	
	protected boolean stepIsActive;
	protected boolean transitionIsActive;
	protected boolean actionIsActive;
	
	protected HashMap<Integer, List<Integer>> transitionStepMap; 
	
	protected HashMap<Integer, String> inVariables;
	
	protected List<Step> actionBlockSteps;
	
	protected HashMap<Integer, Transition> transitions;
	protected HashMap<Integer, Step> steps;
	
	public SFCNodeCallbackOld() {
		super(CALLABLE_ID);
		sfcFactory = SequentialFunctionChartFactory.eINSTANCE;
		modelRoot = sfcFactory.createSequentialFunctionChart();
		transitionStepMap = new HashMap<>();
		activeStep = null;
		activeTransition = null;
		activeAction = null;
		stepIsActive = false;
		transitionIsActive = false;
		actionIsActive = false;
		inVariables = new HashMap<>();
		actionBlockSteps = new ArrayList<>();
		transitions = new HashMap<>();
		steps = new HashMap<>();
		//TODO:Comment
	}

	@Override
	public void processNode(ParserNode node) {
		for (ParserNode child : node.getChildren()) {
			processChildNode(child);			
			processNode(child); // recurse
		}	
	}
	
	private void processChildNode(ParserNode child) {
		String name = child.get(NODE_NAME_ATTRIBUTE);

		switch (name) {
        case "step":          				
			Step step = sfcFactory.createStep();
			activeStep = step;
			stepIsActive = true;
			transitionIsActive = false;
			actionIsActive = false;
			
			try {
				String StepName = child.get("name");
				int localID = Integer.valueOf(child.get("localId"));
				step.setName(StepName);
				step.setLocal_ID(localID);
				steps.put(localID, step);
				int begin = modelRoot.getSteps().size();
				

				modelRoot.getSteps().add(step);
				
				
				
				int end = modelRoot.getSteps().size();
				if (begin >= end) {
					System.out.println("leider nicht geil");
				}
			}
			catch (Exception e) {
				System.out.println("Step problem detected");
			}	
		break;
        case "transition": 
			Transition transition = sfcFactory.createTransition();
			transition.setIsJump(false);
			activeTransition = transition;
			transitionIsActive = true;
			stepIsActive = false;
			actionIsActive = false;
			
    		try {
    			
    			int localID = Integer.valueOf(child.get("localId"));
    			System.out.println(localID);
    			transition.setLocal_ID(localID);
    			transitions.put(localID, transition);
    			//put transition to the model instance
    			modelRoot.getTransitions().add(transition);
    		} catch (Exception e) {
    			System.out.println("Transition problem detected");
    		}
		break;
        case "connectionPointIn":
			if (child.getChildren() != null) {
				for (ParserNode t : child.getChildren()) {
					if (t.get(NODE_NAME_ATTRIBUTE).equals("connection")) {
						int targetID = Integer.valueOf(t.get("refLocalId"));
						
						if (stepIsActive) {
							if (transitionStepMap.containsKey(getActiveStep().getLocal_ID())) {
								transitionStepMap.get(getActiveStep().getLocal_ID()).add(targetID);
							}
							else {
								List<Integer> targets = new ArrayList<>();
								targets.add(targetID);
								transitionStepMap.put(getActiveStep().getLocal_ID(), targets);
							}
						}
						else if (transitionIsActive) {
							if (transitionStepMap.containsKey(getActiveTransition().getLocal_ID())) {
								transitionStepMap.get(getActiveTransition().getLocal_ID()).add(targetID);
							}
							else {
								List<Integer> targets = new ArrayList<>();
								targets.add(targetID);
								transitionStepMap.put(getActiveTransition().getLocal_ID(), targets);
							}
						}
						else if (actionIsActive) {
							if (transitionStepMap.containsKey(getActiveAction().getLocalId())) {
								transitionStepMap.get(getActiveAction().getLocalId()).add(targetID);
							}
							else {
								List<Integer> targets = new ArrayList<>();
								targets.add(targetID);
								transitionStepMap.put(getActiveAction().getLocalId(), targets);
							}
						}
					}
				}
			}
    	break;
        case "attribute":
			String attributeContent = child.get(NODE_CONTENT_ATTRIBUTE);
			// TODO: where do I add this content ? No place in the meta model :(
		break;
        case "condition":
			for (ParserNode x : child.getChildren()) {
				if (x.get(NODE_NAME_ATTRIBUTE).equals("connection")) {
					int targetID = Integer.valueOf(x.get("refLocalId"));
					
					// inVariables are stored in a map by their id
					// inVariables hold, as an expression, boolean statement
					getActiveTransition().setCondition(inVariables.get(targetID));
				}
			}
    	break;
        case "actionBlock":
        	Step stepAction = sfcFactory.createStep();
        	activeStep = stepAction;
        	stepIsActive = true;
			transitionIsActive = false;
			actionIsActive = false;
			
			try {
    			int localID = Integer.valueOf(child.get("localId"));
    			stepAction.setLocal_ID(localID);
    			actionBlockSteps.add(stepAction);
    		} catch (Exception e) {
    			System.out.println("Transition problem detected");
    		}
				
		break;
        case "action":
			Step activeStep = getActiveStep();
			AbstractAction action = sfcFactory.createSimpleAction();
			activeAction = action;
			
			try {
    			int localID = Integer.valueOf(child.get("localId"));
    			String qualifier = child.get("qualifier");
    			
    			action.setLocalId(localID);
    			action.setQualifier(StepQualifier.valueOf(qualifier));
    			
    			activeStep.getActions().add(action);
    		} catch (Exception e) {
    			System.out.println("Transition problem detected");
    		}
		break;
        case "inVariable":
			int inVariableID = Integer.valueOf(child.get("localId"));

			ParserNode expression = XmlDomUtility.getChildOf(child, "expression");
			if (expression != null) {
				inVariables.put(inVariableID, expression.get(NODE_CONTENT_ATTRIBUTE));				
			}
		break;
        case "expression":
		break;
        case "jumpStep":
        	Transition jumpTransition = sfcFactory.createTransition();
        	jumpTransition.setIsJump(true);
			activeTransition = jumpTransition;
			stepIsActive = false;
			transitionIsActive = true;
			actionIsActive = false;
			
			try {
//							String StepName = child.getAttributes().getNamedItem("name").getNodeValue();
				String jumpTargetName = child.get("targetName");
				int localID = Integer.valueOf(child.get("localId"));
				
				for (Step target : modelRoot.getSteps()) {
					if (target.getName() != null && target.getName().equals(jumpTargetName)) {
						
						if (transitionStepMap.containsKey(localID)) {
							transitionStepMap.get(localID).add(target.getLocal_ID());
						}
						else {
							List<Integer> targets = new ArrayList<>();
							targets.add(target.getLocal_ID());
							transitionStepMap.put(localID, targets);										
						}
						
					}
				}
				modelRoot.getTransitions().add(jumpTransition);
			}
			catch (Exception e) {
				System.out.println("JumpStep problem detected");
			}
		break;		
        case "reference":
			AbstractAction activeAction = getActiveAction();
			String actionName = child.get("name");
			// ((SimpleActionBlock) activeAction).setActionVariable(actionName);
    	break;	
        default : break;
		}
	}
	
	private Step getActiveStep() {
		return activeStep;
	}
	
	private Transition getActiveTransition() {
		return activeTransition;
	}
	
	private AbstractAction getActiveAction() {
		return activeAction;
	}

	@Override
	public int postProcessing() {
		
		postProcessActionBlocks();
		
		postProcessConnections();
		
		return 0;
	}
	
	/**
	 * TODO comment
	 */
	private void postProcessConnections() {
		
		for (Map.Entry<Integer, List<Integer>> connection : transitionStepMap.entrySet()) {
			
			int element = connection.getKey();
			List<Integer> sources = connection.getValue();
			
			for (Integer source : sources) {
				
				// I have a step "element", which has an incoming transition "source"
				// however, the step must not be an action step, as this was processed prior
				if ( (steps.containsKey(element) && !actionBlockSteps.contains(steps.get(element))) && transitions.containsKey(source)) {
					steps.get(element).getIncomingTransitions().add(transitions.get(source));
					transitions.get(source).getTargetStep().add(steps.get(element));
				}
				// I have a transition "element" and a step "source" from which that transition originates ( goes out )
				else if (transitions.containsKey(element) && steps.containsKey(source)) {
					transitions.get(element).getSourceStep().add(steps.get(source));
					
					steps.get(source).getOutgoingTransitions().add(transitions.get(element));
				}
				// I have a transition "element" and an inVariable "source" that refers to the transition
				else if (transitions.containsKey(element) && inVariables.containsKey(source)) {
					transitions.get(element).setCondition(inVariables.get(source));
				}
			}
		}
	}

	/**
	 * TODO comment
	 */
	private void postProcessActionBlocks() {
		for (Step actionStep : actionBlockSteps) {
			int actionBlock_ID = actionStep.getLocal_ID();
			List<Integer> step_IDs = transitionStepMap.get(actionBlock_ID);
			
			for (Step step : modelRoot.getSteps()) {
				for (int stepID : step_IDs) {
					if (step.getLocal_ID() == stepID) {
						step.getActions().addAll(actionStep.getActions());
					}					
				}
			}
		}
	}

	@Override
	public EObject getResult() {
		return modelRoot;
	}

	@Override
	public ParserType getType() {
		return ParserType.SEQUENTIAL_FUNCTION_CHART;
	}

}
