package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.ladder_diagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram.templates.AbstractLDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st.expression.ExpressionCompareUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class LDCoilExpressionCompare extends AbstractLDImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "LD Coil Expression Compare";
	public static final String UNIT_DESCRIPTION = "This Attribute compares the expression of two coils.";
	
	public LDCoilExpressionCompare() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<DiagramElement> compare(LLElement source, LLElement target) {
		if(source.getTransitElementType().equals(LLElementType.COIL) && target.getTransitElementType().equals(LLElementType.COIL)) {
			float similarity = ExpressionCompareUtil.compareVariableExpression(source.getLabeledVariable(), target.getLabeledVariable());
			return new ResultElement<DiagramElement>(source,target, similarity, this);
		} else {
			return null;
		}
	}
}
