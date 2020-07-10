package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.function_block_diagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.function_block_diagram.templates.AbstractFBDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDJump;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.algorithm.LevenstheinDistance;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class FBDJumpCompare extends AbstractFBDImplAttribute {
	private static final long serialVersionUID = 7502569920113332003L;

	protected static final String ATTR_NAME = "FBD Jump Label";
	protected static final String ATTR_DESC = "Compares two FBD Jump labels using the Levensthein distance";
	
	public FBDJumpCompare() {
		super(ATTR_NAME, ATTR_DESC);
	}

	@Override
	public ResultElement<DiagramElement> compare(FBDElement first, FBDElement second) {
		if (first instanceof FBDJump && second instanceof FBDJump) {
			FBDJump sourceJump = (FBDJump) first;
			FBDJump targetJump = (FBDJump) second;
			
			float maxWordLength = Math.max(sourceJump.getJumpLabel().length(), targetJump.getJumpLabel().length());
			
			int distance = LevenstheinDistance.computeLevenshteinDistance(sourceJump.getJumpLabel(), targetJump.getJumpLabel());
			
			float similarity = (1-(distance/maxWordLength)) > 0 ? (1-(distance/maxWordLength)) : 0;
			
			return new ResultElement<DiagramElement>(sourceJump ,targetJump, similarity, this);
		}
		return null;
	}

}
