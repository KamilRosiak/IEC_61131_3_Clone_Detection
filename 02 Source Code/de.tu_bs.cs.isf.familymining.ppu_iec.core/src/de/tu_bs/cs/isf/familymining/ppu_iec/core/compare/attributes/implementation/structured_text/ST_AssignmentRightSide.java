package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.structured_text;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Assignment;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st.expression.ExpressionCompareUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class ST_AssignmentRightSide extends AbstractSTImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "ST Assignment Right Side Attribute";
	public static final String UNIT_DESCRIPTION = "This attribute compares the Right side of an assignment.";
	
	public ST_AssignmentRightSide() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<Statement> compare(Statement source, Statement target) {
		if(source instanceof Assignment && target instanceof Assignment) {
			Expression sourceExp = ((Assignment)source).getRight();
			Expression targetExp = ((Assignment)target).getRight();
			return new ResultElement<Statement>(source, target, ExpressionCompareUtil.compare(sourceExp, targetExp) ,this);
		}
		return null;
	}
}
