package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.structured_text;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st.expression.ExpressionCompareUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class ST_FunctionCallNameAttr extends AbstractSTImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "ST FunctionCallName Attribute";
	public static final String UNIT_DESCRIPTION = "Compares the names of two function calls";
	
	public ST_FunctionCallNameAttr() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<Statement> compare(Statement source, Statement target) {
		
		if(source instanceof FunctionCallStatement && target instanceof FunctionCallStatement) {
			FunctionCallStatement sourceFuncCall = ((FunctionCallStatement)source);
			FunctionCallStatement targetFuncCall = ((FunctionCallStatement)target);
			
			float variableSimilarity = 0;
			float functionCallSimilarity = ExpressionCompareUtil.compareFunctionCall(sourceFuncCall.getFunctionCall(), targetFuncCall.getFunctionCall());	

			//In the case, that the function call invokes over a variable, the variable name makes 50 percent of the similarity else the similarity only depends on the function call name.
			if(sourceFuncCall.getInvokingVariable() != null && targetFuncCall.getInvokingVariable() != null) {
				variableSimilarity = ExpressionCompareUtil.compareVariableExpression(sourceFuncCall.getInvokingVariable(), targetFuncCall.getInvokingVariable());
				return new ResultElement<Statement>(source, target, (variableSimilarity + functionCallSimilarity )/2 ,this);
			} else if(sourceFuncCall.getInvokingVariable() != null || targetFuncCall.getInvokingVariable() != null) {
				return new ResultElement<Statement>(source, target, (variableSimilarity + functionCallSimilarity )/2 ,this);
			} else {
				return new ResultElement<Statement>(source, target, functionCallSimilarity, this);
			}

		}
		return null;
	}
}
