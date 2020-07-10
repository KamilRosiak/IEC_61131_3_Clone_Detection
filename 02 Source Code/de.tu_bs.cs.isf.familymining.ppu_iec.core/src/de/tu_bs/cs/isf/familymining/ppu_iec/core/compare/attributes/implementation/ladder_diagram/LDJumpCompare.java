package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.ladder_diagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram.templates.AbstractLDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LDJump;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.algorithm.LevenstheinDistance;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class LDJumpCompare extends AbstractLDImplAttribute {

	private static final long serialVersionUID = 3549580422501526126L;
	
	protected static final String ATTR_NAME = "LD Jump Label";
	protected static final String ATTR_DESC = "Compares two LD Jump labels using the Levensthein distance";
	
	public LDJumpCompare() {
		super(ATTR_NAME, ATTR_DESC);
	}

	@Override
	public ResultElement<DiagramElement> compare(LLElement source, LLElement target) {
		if (source instanceof LDJump && target instanceof LDJump) {
			LDJump sourceJump = (LDJump) source;
			LDJump targetJump = (LDJump) target;
			
			float maxWordLength = Math.max(sourceJump.getJumpLabel().length(), targetJump.getJumpLabel().length());
			
			int distance = LevenstheinDistance.computeLevenshteinDistance(sourceJump.getJumpLabel(), targetJump.getJumpLabel());
			
			float similarity = (1-(distance/maxWordLength)) > 0 ? (1-(distance/maxWordLength)) : 0;
			
			return new ResultElement<DiagramElement>(sourceJump ,targetJump, similarity, this);
		}
		return null;
	}

}
