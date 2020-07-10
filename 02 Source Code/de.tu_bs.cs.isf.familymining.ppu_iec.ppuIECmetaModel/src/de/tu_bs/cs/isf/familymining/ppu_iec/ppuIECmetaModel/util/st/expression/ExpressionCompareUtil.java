package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st.expression;


import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.BinaryExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.FunctionCallExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Literal;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Subrange;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.UnaryExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.algorithm.LevenstheinDistance;

public abstract class ExpressionCompareUtil {
	
	public static float compare(Expression sourceExp , Expression targetExp) {
		if(sourceExp instanceof VariableExpression && targetExp instanceof VariableExpression) {
			return compareVariableExpression((VariableExpression)sourceExp, (VariableExpression)targetExp);
		} else if(sourceExp instanceof BinaryExpression && targetExp instanceof BinaryExpression) {	
			return compareBinarayExpression(new ExpressionUnwrap((BinaryExpression)sourceExp) , new ExpressionUnwrap((BinaryExpression)targetExp));
		} else if (sourceExp instanceof BinaryExpression) {
			return compareBinarayExpression(new ExpressionUnwrap((BinaryExpression)sourceExp) , new ExpressionUnwrap(targetExp));
		} else if(targetExp instanceof BinaryExpression) {
			return compareBinarayExpression(new ExpressionUnwrap(sourceExp) ,new ExpressionUnwrap((BinaryExpression)targetExp));
		} else if(sourceExp instanceof FunctionCallExpression && targetExp instanceof FunctionCallExpression) {
			return compareFunctionCall((FunctionCallExpression)sourceExp, (FunctionCallExpression)targetExp);
		} else if(sourceExp instanceof UnaryExpression && targetExp instanceof UnaryExpression) {
			return compareUnaryExpression((UnaryExpression)sourceExp, (UnaryExpression)targetExp);
		} else if(sourceExp instanceof Subrange && targetExp instanceof Subrange) {
			return compareSubRange((Subrange)sourceExp, (Subrange)targetExp);
		} else if(sourceExp instanceof Literal && targetExp instanceof Literal) {
			return compareLiteral((Literal)targetExp,(Literal) sourceExp);
		} 
		return 0f;
	}
	private static float compareSubRange(Subrange sourceExp, Subrange targetExp) {
		float similarity = 0;
		
		similarity += compareLiteral(sourceExp.getLowerBound(), targetExp.getLowerBound()) * 0.5;
		similarity += compareLiteral(sourceExp.getUpperBound(), targetExp.getUpperBound()) * 0.5;

		return similarity;
	}
	/**
	 * This method compare two instances of ExprerssionUnwrapper. It compares all operators and expressions from left two right.
	 * @param sourceUnwrap 
	 * @param targetUnwrap
	 * @return
	 */
	public static float compareBinarayExpression(ExpressionUnwrap sourceUnwrap, ExpressionUnwrap targetUnwrap) {
		int expIterations = Math.min(sourceUnwrap.getExpressionList().size(), targetUnwrap.getExpressionList().size());
		int i = 0;
		float expSimilarity = 0;
		//compare expressions
		while(i < expIterations) {
			expSimilarity += compare(sourceUnwrap.getExpressionList().get(i), targetUnwrap.getExpressionList().get(i));
			i++;
		}
		
		int opIterations = Math.min(sourceUnwrap.getOperatiorList().size(), targetUnwrap.getOperatiorList().size());
		i = 0;
		float opSimilarity = 0;
		//compare operators
		while(i < opIterations) {
			if(sourceUnwrap.getOperatiorList().get(i).equals(targetUnwrap.getOperatiorList().get(i))) {
				opSimilarity += 1f;
			}
			i++;
		}
		
		int maxOperators = Math.max(sourceUnwrap.getOperatiorList().size(), targetUnwrap.getOperatiorList().size());
		int maxExpressions =  Math.max(sourceUnwrap.getExpressionList().size(), targetUnwrap.getExpressionList().size());
		//divide the float value with max value of expressions and operators.
		float similarity = (expSimilarity + opSimilarity) / (maxExpressions + maxOperators);
		return similarity;
	}
	
	/**
	 * This method compares unaryExpressions and returns a similarity based on the literal and unary operator.
	 */
	public static float compareUnaryExpression(UnaryExpression sourceExp, UnaryExpression targetExp) {
		float similarity = 0.0f;
		
		similarity += compare(sourceExp.getSubexpression(), targetExp.getSubexpression())* 0.7;
		
		if(sourceExp.getOperator().equals(targetExp.getOperator())) {
			similarity += 0.3;
		}
		return similarity;
	}
	
	/**
	 * This method compares FunctionCallExpressions based on the symbol.
	 */
	public static float compareFunctionCall(FunctionCallExpression sourceExp, FunctionCallExpression targetExp) {
		float similarity = 0;
		
		if(sourceExp.getSymbol().equals(targetExp.getSymbol())) {
			similarity += 1f;
		}

		//TODO: More parameters for functions calls.
		return similarity;
	}
	
	/**
	 * This method compares FunctionCallExpressions based on the symbol with the levenstein metric.
	 */
	public static float compareFunctionCallLevenstein(FunctionCallExpression sourceExp, FunctionCallExpression targetExp) {
		float distance = LevenstheinDistance.computeLevenshteinDistance(sourceExp.getSymbol(), targetExp.getSymbol());
		float maxWordLength = Math.max(sourceExp.getSymbol().length(), targetExp.getSymbol().length());
		float similarity = (1-(distance/maxWordLength)) > 0 ? (1-(distance/maxWordLength)) : 0;

		return similarity;
	}
	
	/**
	 * This method compares two VaribaleExpressions with his inner elements
	 */
	public static float compareVariableExpression(VariableExpression source, VariableExpression target) {
		int sourceDepth = ExpressionCompareUtil.getVarExpressionDepth(0, source);
		int targetDepth = ExpressionCompareUtil.getVarExpressionDepth(0, target);

		float sim = 0;
		int maxDepth = Math.max(sourceDepth, targetDepth);

		if(maxDepth > 0 ) {
			sim = (float) ExpressionCompareUtil.compareVarExpression(0, source, target) / maxDepth;
		} else {
			sim = 0;
		}
		return sim;
	}
	
	/**
	 * This method compares two VaribaleExpressions
	 */
	public static boolean compareSymbols(VariableExpression source, VariableExpression target) {
		if(source.getSymbol().equals(target.getSymbol())) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * This method returns the depth of a variable expression based on inner variables.
	 */
	public static int getVarExpressionDepth(int count, VariableExpression varExpression) {
		if(varExpression != null) {
			count++;
			if(varExpression.getInnerVariable() != null) {
				return getVarExpressionDepth(count, varExpression.getInnerVariable());
			} else {
				return count;
			}
		} else {
			return count;
		}
	}
	
	/**
	 * This method compares a variable expression recursively and adds for every equal variable name a value of 1 to the similarity value. 
	 * This value has to be divided by the expression depth.
	 */
	public static int compareVarExpression(int similarity, VariableExpression sourceExpression, VariableExpression targetExpression ) {
		if(ExpressionCompareUtil.compareSymbols(sourceExpression, targetExpression)) {
			similarity++;
			if(sourceExpression.getInnerVariable() != null && targetExpression.getInnerVariable() != null) {
				return compareVarExpression(similarity, sourceExpression.getInnerVariable(), targetExpression.getInnerVariable());
			}
		} else {
			if(sourceExpression.getInnerVariable() != null && targetExpression.getInnerVariable() != null) {
				return compareVarExpression(similarity, sourceExpression.getInnerVariable(), targetExpression.getInnerVariable());
			}
		}
		return similarity;
	}
	
	/**
	 * This method compares two literal based on her symbol.
	 * @param l1 first literal 
	 * @param l2 second literal 
	 * @return returns 1 if equal and 0 if not.
	 */
	private static float compareLiteral(Literal l1, Literal l2) {
		if(l1.getSymbol().equals(l2.getSymbol())) {
			return 1f;
		} else if(l1.getSymbol().equalsIgnoreCase(l2.getSymbol())) {
			return 1f;
		} else {
			return 0f;
		}
	}
	
}
