package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.structured_text;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.UnboundedLoop;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st.expression.ExpressionCompareUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class ST_While_Condition extends AbstractSTImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "ST While Condition";
	public static final String UNIT_DESCRIPTION = "Compares the condition of two while loops.";
	
	public ST_While_Condition() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<Statement> compare(Statement source, Statement target) {
		if(source instanceof UnboundedLoop && target instanceof UnboundedLoop) {
			UnboundedLoop sourceLoop = (UnboundedLoop)source;
			UnboundedLoop targetLoopt = (UnboundedLoop)target;
			return new ResultElement<Statement>(source,target,compare(sourceLoop.getCondition(), targetLoopt.getCondition()), this);
		}
		return null;	
	}
	
	public float compare(Expression sourceExp, Expression targetExp) {
		return ExpressionCompareUtil.compare(sourceExp, targetExp);
	}
	
}
