package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.function_block_diagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.function_block_diagram.templates.AbstractFBDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class FBDBlockName extends AbstractFBDImplAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7295544237282117752L;
	private static final String ATTR_NAME ="FBD Block Name";
	private static final String ATTR_DESCRIPTION ="Compares the name of two function blocks";
	
	public FBDBlockName() {
		super(ATTR_NAME, ATTR_DESCRIPTION);
	}

	@Override
	public ResultElement<DiagramElement> compare(FBDElement first, FBDElement second) {
		if(first.getName().equals(second.getName())) {
			return new ResultElement<DiagramElement>(first, second, 1f,this);
		} else if( first.getName().equalsIgnoreCase(second.getName())){
			return new ResultElement<DiagramElement>(first, second, 1f,this);
		} else {
			return new ResultElement<DiagramElement>(first, second, 0f,this);
		}
	}
}
