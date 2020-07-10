package de.tu_bs.cs.isf.familymining.ppu_iec.parser.SFC.util;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Transition;

public class SFCTraverselUtil {
	
	/**
	 * This method traverses over steps and sets the step level.
	 */
	public static void setStepLevel(Step step, int level) {
		if(step.getStepLevel() <= level) {
			step.setStepLevel(level);
		}
		for(Transition outTrans : step.getOutgoingTransitions()) {
			if(!outTrans.isIsJump()) {
				for(Step outStep : outTrans.getTargetStep()) {
					setStepLevel(outStep, level +1 );
				}
			}
		}
	}
}
