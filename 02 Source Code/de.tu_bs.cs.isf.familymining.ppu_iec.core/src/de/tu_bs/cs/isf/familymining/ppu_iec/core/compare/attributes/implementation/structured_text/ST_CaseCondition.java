package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.structured_text;

import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Case;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.CaseBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st.expression.ExpressionCompareUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class ST_CaseCondition extends AbstractSTImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "ST Case-Condition";
	public static final String UNIT_DESCRIPTION = "Compares the condition of two case statements.";
	
	public ST_CaseCondition() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<Statement> compare(Statement source, Statement target) {
		if(source instanceof Case && target instanceof Case) {
			Case sourceIf = (Case)source;
			Case targetIF = (Case)target;
			Expression sourceExp = sourceIf.getSwitch();
			Expression targetExp = targetIF.getSwitch();

			return new ResultElement<Statement>(source, target, compare(sourceExp, targetExp) ,this);
		} else if(source instanceof CaseBlock && target instanceof CaseBlock) {
			CaseBlock sourceIf = (CaseBlock)source;
			CaseBlock targetIF = (CaseBlock)target;
			
			List<Expression> sourceExps = sourceIf.getCaseExpressions();
			List<Expression> targetExps = targetIF.getCaseExpressions();
			float similarity = 0;
			
			for(Expression sourceExp : sourceExps) {
				for(Expression targetExp : targetExps) {
					similarity += compare(sourceExp, targetExp);
				}
			}
			similarity = similarity / Math.max(sourceExps.size(), targetExps.size());
			
			return new ResultElement<Statement>(source, target, similarity ,this);
			
		}
		return null;	
	}
	
	public float compare(Expression sourceExp, Expression targetExp) {
		return ExpressionCompareUtil.compare(sourceExp, targetExp);
	}
	
}
