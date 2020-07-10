package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st.expression;

import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.BinaryExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.BinaryOperator;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;

/**
 * This class unwrapps binary expressions in an expression-list and operator-list to make it comparable. 
 * @author {Kamil Rosiak}
 */
public class ExpressionUnwrapper {
	private List<Expression> expressionList;
	private List<BinaryOperator> operatorList;
	

	public ExpressionUnwrapper(BinaryExpression expression) {
		init();
		unwrappExp(expression);
	}
	
	public ExpressionUnwrapper(Expression expression) {
		init();
		unwrappExp(expression);
	}
	
	private void unwrappExp(Expression expression) {
		expressionList.add(expression);
	}
	
	private void init() {
		setExpressionList(new ArrayList<Expression>());
		setOperatiorList(new ArrayList<BinaryOperator>());
	}

	/**
	 * This method unwraps a binary expression recursively and pushes the not binary expressions and operator into a list.
	 * @param expression
	 */
	private void unwrappExp(BinaryExpression expression) {
		Expression leftExpression = expression.getLeft();
		Expression rightExpression = expression.getRight();
		
		//adding the first operator
		addOperator(expression.getOperator());

		//adding expression or unwrapping the expression recursively 
		if(leftExpression instanceof BinaryExpression) {
			unwrappExp((BinaryExpression)leftExpression);
		} else {
			addExpression(leftExpression);
		}
		
		if(rightExpression instanceof BinaryExpression) {
			unwrappExp((BinaryExpression)rightExpression);
		} else {
			addExpression(rightExpression);
		}
	}

	public List<Expression> getExpressionList() {
		return expressionList;
	}

	public void setExpressionList(List<Expression> expressionList) {
		this.expressionList = expressionList;
	}
	public void addExpression(Expression exp) {
		this.expressionList.add(exp);
	}

	public List<BinaryOperator> getOperatiorList() {
		return operatorList;
	}

	public void setOperatiorList(List<BinaryOperator> operatiorList) {
		this.operatorList = operatiorList;
	}
	
	public void addOperator(BinaryOperator operator) {
		this.operatorList.add(operator);
	}
	
	public void printLists() {
		System.out.println("Expressions__________________________");
		for(Expression exp : expressionList) {
			System.out.println(exp.getExpressionType());
		}
		System.out.println("Operators__________________________");
		for(BinaryOperator op : operatorList) {
			System.out.println(op);
		}
	}
	
	
}
