package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.language.structured_text;

import java.util.List;
import java.util.Stack;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.interfaces.ExpressionStructure;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.interfaces.StatementStructure;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StatementType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st.DefaultExpressionStructure;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st.DefaultStatementStructure;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;
/**
 * 
 * @author {Alexander Schlie}
 *
 */
public class ST_NumberOfOperators extends AbstractSTLangAttribute {
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "ST Number Of Operators";
	public static final String UNIT_DESCRIPTION = "Compares the number of operators in two ST implementations.";
	
	private ExpressionStructure expressionStructure;
	private StatementStructure statementStructure;
	
	public ST_NumberOfOperators() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
		this.expressionStructure = new DefaultExpressionStructure();
		this.statementStructure = new DefaultStatementStructure();
	}

	@Override
	public ResultElement<StructuredText>  compare(StructuredText source, StructuredText target) {
		float similarity = 0f;
		
		List<Statement> firstStatements = source.getStatements();
		List<Statement> secondStatements = target.getStatements();
		
		int firstNumber = getNumberOfOperators(firstStatements);
		int secondNumber = getNumberOfOperators(secondStatements);

		if (Math.max(firstNumber, secondNumber) != 0){
			similarity = (float)Math.min(firstNumber, secondNumber) / Math.max(firstNumber, secondNumber);
		}
		
		return new ResultElement<StructuredText> (source, target, similarity ,this);
	}

	/**
	 * TODO comment
	 * @param firstStatements
	 * @return
	 */
	private int getNumberOfOperators(List<Statement> firstStatements) {
		int operators = 0;
		for (Statement statement : firstStatements) {
			operators += recursivelyGetOperators(statement);
		}
		return operators;
	}
	
	/**
	 * TODO comment
	 * @param subStatements
	 * @return
	 */
	private int recursivelyGetOperators(Statement statement) {
		
		if (statement.getStatementType().equals(StatementType.ASSIGNMENT)) {
			return 1;
		}
		
		int operators = 0;
		for (Expression rootExpression : statementStructure.getExpressions(statement).getValues()) {
			Stack<Expression> exprStack = new Stack<>();
			exprStack.push(rootExpression);
			while (!exprStack.isEmpty()) { // go through the expression tree and count each operand
				Expression curExpression = exprStack.pop();
				List<Expression> subexpressions = expressionStructure.getSubexpressions(curExpression);
				if (!subexpressions.isEmpty()) { // non-terminal expressions that contain an operator --> binary and unary expressions
					operators++;
					subexpressions.forEach((e) -> exprStack.push(e));
				}
			}
		}
		for (Statement sub : statementStructure.getSubstatements(statement).getValues()) {
			operators += recursivelyGetOperators(sub);					
		}
		return operators;
	}
}
