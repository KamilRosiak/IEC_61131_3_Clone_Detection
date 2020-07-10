package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.structured_text;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st.expression.ExpressionCompareUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class ST_ForLoopCondition extends AbstractSTImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "ST For Condition";
	public static final String UNIT_DESCRIPTION = "Compares the condition of two For loops.";
	
	public ST_ForLoopCondition() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<Statement> compare(Statement source, Statement target) {
		if(source instanceof ForLoop && target instanceof ForLoop) {
			ForLoop sourceLoop = (ForLoop)source;
			ForLoop targetLoop = (ForLoop)target;
			
			float similarity = 0.0f;
			
			if(sourceLoop.getInitialValue() == targetLoop.getInitialValue()) {
				similarity += 0.25f;
			}
			if(sourceLoop.getUpperBound() == targetLoop.getUpperBound()) {
				similarity += 0.25f;
			}
			if(sourceLoop.getIncrement() == targetLoop.getIncrement()) {
				similarity += 0.25f;
			}
			similarity += compare(sourceLoop.getCounter(), targetLoop.getCounter()) * 0.25;

			return new ResultElement<Statement>(source,target,similarity, this);
		}
		return null;	
	}
	
	public float compare(Expression sourceExp, Expression targetExp) {
		return ExpressionCompareUtil.compare(sourceExp, targetExp);
	}
	
}
