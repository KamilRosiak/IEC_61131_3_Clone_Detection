package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.language.structured_text;

import java.util.List;
import java.util.Stack;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.interfaces.ExpressionStructure;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.interfaces.StatementStructure;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
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
public class ST_NumberOfOperands extends AbstractSTLangAttribute {
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "ST Number Of Operands";
	public static final String UNIT_DESCRIPTION = "Compares the number of Operands in two ST implementations.";
	
	private ExpressionStructure expressionStructure;
	private StatementStructure statementStructure;
	
	public ST_NumberOfOperands() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
		this.expressionStructure = new DefaultExpressionStructure();
		this.statementStructure = new DefaultStatementStructure();
	}

	@Override
	public ResultElement<StructuredText>  compare(StructuredText source, StructuredText target) {
		float similarity = 0f;
		
		List<Statement> firstStatements = source.getStatements();
		List<Statement> secondStatements = target.getStatements();
		
		int firstNumber = getNumberOfOperands(firstStatements);
		int secondNumber = getNumberOfOperands(secondStatements);

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
	private int getNumberOfOperands(List<Statement> firstStatements) {
		int operands = 0;
		for (Statement statement : firstStatements) {
			operands += recursivelyGetOperands(statement);	
		}
		return operands;
	}
	
	/**
	 * TODO comment
	 * @param subStatements
	 * @return
	 */
	private int recursivelyGetOperands(Statement statement) {
		int operands = 0;
		List<Expression> expressions = statementStructure.getExpressions(statement).getValues();
		for (Expression rootExpression : expressions) {
			Stack<Expression> exprStack = new Stack<>();
			exprStack.push(rootExpression);
			while (!exprStack.isEmpty()) { // go through the expression tree and count each operand
				Expression curExpression = exprStack.pop();
				List<Expression> subexpressions = expressionStructure.getSubexpressions(curExpression);
				if (!subexpressions.isEmpty()) {
					subexpressions.forEach((e) -> exprStack.push(e));
				} else { // terminal expression --> literal, variable, function call or subrange
					operands++;
				}
			}
		}
		for (Statement sub : statementStructure.getSubstatements(statement).getValues()) {
			operands += recursivelyGetOperands(sub);					
		}
		return operands;
	}
}
