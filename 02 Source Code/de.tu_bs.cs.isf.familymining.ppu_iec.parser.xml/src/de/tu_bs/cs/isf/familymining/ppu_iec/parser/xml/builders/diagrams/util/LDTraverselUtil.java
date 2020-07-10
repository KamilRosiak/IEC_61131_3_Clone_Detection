package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;

public class LDTraverselUtil {
	
	/**
	 * This method traverses over steps and sets the step level.
	 */
	public static void setElementLevel(DiagramElement element, int level) {
		if(element.getLevel() <= level) {
			element.setLevel(level);
		}
		for(DiagramElement outElement : element.getTargetElements()) {
				setElementLevel(outElement, level +1);	
		}
	}
}
