package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.function_block_diagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.function_block_diagram.templates.AbstractFBDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.ld.DiagramCompareUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class FBDBlockOutElements extends AbstractFBDImplAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7295544237282117752L;
	private static final String ATTR_NAME ="FBD Block Out Elements";
	private static final String ATTR_DESCRIPTION ="Compares output elements of two blocks based on types.";
	
	public FBDBlockOutElements() {
		super(ATTR_NAME, ATTR_DESCRIPTION);
	}

	@Override
	public ResultElement<DiagramElement> compare(FBDElement first, FBDElement second) {
		if(first.getTargetElements().isEmpty() && second.getTargetElements().isEmpty()) {
			return null;
		} 
		float similarity = DiagramCompareUtil.compareInOutElements(first.getTargetElements(), second.getTargetElements());
		return new ResultElement<DiagramElement>(first, second, similarity, this);
	}
}
