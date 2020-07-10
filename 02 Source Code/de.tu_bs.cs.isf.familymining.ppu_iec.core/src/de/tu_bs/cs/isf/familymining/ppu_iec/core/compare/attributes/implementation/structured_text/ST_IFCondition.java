package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.structured_text;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ConditionalBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.If;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st.expression.ExpressionCompareUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class ST_IFCondition extends AbstractSTImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "ST If-Condition";
	public static final String UNIT_DESCRIPTION = "Compares the condition of two if statements.";
	
	public ST_IFCondition() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<Statement> compare(Statement source, Statement target) {
		if(source instanceof If && target instanceof If) {
			If sourceIf = (If)source;
			If targetIF = (If)target;
			Expression sourceExp = sourceIf.getConditionalBlocks().get(0).getCondition();
			Expression targetExp = targetIF.getConditionalBlocks().get(0).getCondition();

			return new ResultElement<Statement>(source, target, compare(sourceExp, targetExp) ,this);
		} else if(source instanceof ConditionalBlock && target instanceof ConditionalBlock) {
			ConditionalBlock sourceIf = (ConditionalBlock)source;
			ConditionalBlock targetIF = (ConditionalBlock)target;
			if (!sourceIf.isElse() && !targetIF.isElse()) {
				Expression sourceExp = sourceIf.getCondition();
				Expression targetExp = targetIF.getCondition();
				return new ResultElement<Statement>(source, target, compare(sourceExp, targetExp), this);			
			} else {
				return null;				
			}
		}
		return null;	
	}
	
	public float compare(Expression sourceExp, Expression targetExp) {
		return ExpressionCompareUtil.compare(sourceExp, targetExp);
	}
	
}
