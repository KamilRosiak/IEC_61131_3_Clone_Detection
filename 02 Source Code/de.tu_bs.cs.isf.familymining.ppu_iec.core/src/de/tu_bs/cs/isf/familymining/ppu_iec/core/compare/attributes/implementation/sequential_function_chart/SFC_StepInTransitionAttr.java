package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.sequential_function_chart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Transition;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class SFC_StepInTransitionAttr extends AbstractSFCImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "SFC Step In Transition Compare";
	public static final String UNIT_DESCRIPTION = "Compares the Incoming transitions."; 
	
	public SFC_StepInTransitionAttr() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<Step> compare(Step source, Step target) {
		//if both have no transitions
		if(source.getIncomingTransitions().size() == 0 && target.getIncomingTransitions().size() == 0) {
			return new ResultElement<Step>(source, target, 1f, this);
		}
		//if one of both has no elements they cant be similar
		if(source.getIncomingTransitions().size() == 0 || target.getIncomingTransitions().size() == 0) {
			new ResultElement<Step>(source, target, 0f, this);
		}
		
		
		//Copy transitions
		List<Transition> sourceInTransitions = new ArrayList<Transition>();
		sourceInTransitions.addAll(source.getIncomingTransitions());

		List<Transition> targetInTransitions = new ArrayList<Transition>();
		targetInTransitions.addAll(target.getIncomingTransitions());

		//create iterator 
		Iterator<Transition> sourceIterator = sourceInTransitions.iterator();
		Iterator<Transition> targetIterator = targetInTransitions.iterator();
		
		int matchedTransitions = 0;
		while(sourceIterator.hasNext()) {
			Transition sourceTransition = sourceIterator.next();
			while(targetIterator.hasNext()) {
				Transition targetTransition = targetIterator.next();
				if(compareCondition(sourceTransition.getCondition(), targetTransition.getCondition()) 
						&& (sourceTransition.isIsJump() == targetTransition.isIsJump())) {
					matchedTransitions++;
					sourceIterator.remove();
					targetIterator.remove();
					break;
				}
			}
		}
		
		int maxSize = Math.max(source.getIncomingTransitions().size(), target.getIncomingTransitions().size());

		return new ResultElement<Step>(source, target, ((float)matchedTransitions/(float)maxSize), this);
	}
	
	
	private boolean compareCondition(String sourceCondition, String targetCondition) {
		return sourceCondition.equals(targetCondition) || sourceCondition.equalsIgnoreCase(targetCondition);
	}
	
	
}
