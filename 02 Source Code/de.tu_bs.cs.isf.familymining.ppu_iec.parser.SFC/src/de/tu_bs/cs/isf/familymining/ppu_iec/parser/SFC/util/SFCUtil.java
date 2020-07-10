package de.tu_bs.cs.isf.familymining.ppu_iec.parser.SFC.util;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Transition;

public class SFCUtil {
	private SequentialFunctionChart sfc;
	
	public SFCUtil(SequentialFunctionChart sfc) {
		this.sfc = sfc;
	}
	
	/**
	 * Returns a step by given id if available else null.
	 */
	public Step getStep(int localId) {
		for(Step step : sfc.getSteps()) {
			if(step.getLocal_ID() == localId) {
				return step;
			}
		}
		return null;
	}
	
	/**
	 * Returns a step by given name if available else null.
	 */
	public Step getStep(String stepName) {
		for(Step step : sfc.getSteps()) {
			if(step.getName().equals(stepName)) {
				return step;
			}
		}
		return null;
	}
	
	/**
	 * Returns a transition by given name if available else null.
	 */
	public Transition getTransition(int localId) {
		for(Transition transition : sfc.getTransitions()) {
			if(transition.getLocal_ID() == localId) {
				return transition;
			}
		}
		return null;
	}
	
}
