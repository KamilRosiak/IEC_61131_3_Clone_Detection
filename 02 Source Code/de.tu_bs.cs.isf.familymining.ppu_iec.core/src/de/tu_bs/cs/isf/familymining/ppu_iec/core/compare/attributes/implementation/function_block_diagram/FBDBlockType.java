package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.function_block_diagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.function_block_diagram.templates.AbstractFBDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElementType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlock;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class FBDBlockType extends AbstractFBDImplAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7295544237282117752L;
	private static final String ATTR_NAME ="FBD Block Type";
	private static final String ATTR_DESCRIPTION ="Compares the type of two function blocks";
	
	public FBDBlockType() {
		super(ATTR_NAME, ATTR_DESCRIPTION);
	}

	@Override
	public ResultElement<DiagramElement> compare(FBDElement first, FBDElement second) {
		if(first.getFBDElementType().equals(FBDElementType.STANDARD_FUNCTION) && second.getFBDElementType().equals(FBDElementType.STANDARD_FUNCTION)) {
			if (((StandardFunction)first).getFunctionOperation().equals(((StandardFunction)second).getFunctionOperation())) {
				return new ResultElement<DiagramElement>(first, second, 1f,this);
			} else {
				return new ResultElement<DiagramElement>(first, second, 0f,this);
			}
		} else if(first.getFBDElementType().equals(FBDElementType.STANDARD_FUNCTION_BLOCK) && second.getFBDElementType().equals(FBDElementType.STANDARD_FUNCTION_BLOCK)) {
			if (((StandardFunctionBlock)first).getFunctionBlockOperation().equals(((StandardFunctionBlock)second).getFunctionBlockOperation())) {
				return new ResultElement<DiagramElement>(first, second, 1f,this);
			} else {
				return new ResultElement<DiagramElement>(first, second, 0f,this);
			}
		} else if (first.getFBDElementType().equals(second.getFBDElementType())) {
			return new ResultElement<DiagramElement>(first, second, 1f,this);
		} else {
			return new ResultElement<DiagramElement>(first, second, 0f,this);
		}	
	}
}
