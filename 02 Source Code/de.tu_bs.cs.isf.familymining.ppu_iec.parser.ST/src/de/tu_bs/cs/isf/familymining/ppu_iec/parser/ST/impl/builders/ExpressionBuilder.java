package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.builders;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.RULE_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.TOKEN_ATTRIBUTE;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.ParserNodeMapping;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.BinaryExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.BinaryOperator;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ExpressionType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.FunctionCallExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Literal;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.StructuredTextExpressionFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Subrange;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.UnaryExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.UnaryOperator;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IModelBuilder;

public class ExpressionBuilder implements IModelBuilder<Expression> {
	
	private StructuredTextExpressionFactory 		exprFactory;
	private IModelBuilder<Literal> 					constantBuilder;
	private IModelBuilder<VariableExpression> 		variableBuilder;
	private IModelBuilder<FunctionCallExpression> 	functionCallBuilder;
	
	public ExpressionBuilder() {
		exprFactory = StructuredTextExpressionFactory.eINSTANCE;
		constantBuilder = new ConstantBuilder();
		variableBuilder = new VariableBuilder(this);
		functionCallBuilder = new FunctionCallBuilder(variableBuilder, this);
	}
	
	public Expression build(ParserNode expressionNode) {
		Expression expression = buildExpression(expressionNode);
		expression.setId(EcoreUtil.generateUUID());
		return expression;
	}
	
	private Expression buildExpression(ParserNode expressionNode) {
		if (exactlyOneChild(expressionNode)) {
			return buildXorExpression(expressionNode.getChildren().get(0));
		} else if (moreThanOneChild(expressionNode)) {
			return buildConcatenatedBinaryExpression(expressionNode,
					(operandNode) 	-> buildXorExpression(operandNode), 
					(operatorNode) 	-> extractOrOperator(operatorNode));
		} else {
			throw new RuntimeException("equality expression node must have children.");
		}
	}
	
	private BinaryOperator extractOrOperator(ParserNode orOperatorNode) {
		String orOperatorToken = orOperatorNode.get(TOKEN_ATTRIBUTE);
		if (STUtil.isEqual(orOperatorToken, "OR")) {
			return BinaryOperator.OR;
		} else {
			throw new RuntimeException("Symbol for OR ("+orOperatorToken+") was not expected.");
		}
	}

	private Expression buildXorExpression(ParserNode xorExpressionNode) {
		if (exactlyOneChild(xorExpressionNode)) {
			return buildAndExpression(xorExpressionNode.getChildren().get(0));
		} else if (moreThanOneChild(xorExpressionNode)) {
			return buildConcatenatedBinaryExpression(xorExpressionNode,
					(operandNode) -> buildAndExpression(operandNode), 
					(operatorNode) -> extractXorOperator(operatorNode));
		} else {
			throw new RuntimeException("equality expression node must have children.");
		}
	}		

	private BinaryOperator extractXorOperator(ParserNode xorOperatorNode) {
		String xorOperatorToken = xorOperatorNode.get(TOKEN_ATTRIBUTE);
		if (STUtil.isEqual(xorOperatorToken, "XOR")) {
			return BinaryOperator.XOR;
		} else {
			throw new RuntimeException("Symbol for XOR ("+xorOperatorToken+") was not expected.");
		}
	}

	private Expression buildAndExpression(ParserNode andExpressionNode) {
		if (exactlyOneChild(andExpressionNode)) {
			return buildComparisonExpression(andExpressionNode.getChildren().get(0));
		} else if (moreThanOneChild(andExpressionNode)) {
			return buildConcatenatedBinaryExpression(andExpressionNode,
					(operandNode) -> buildComparisonExpression(operandNode), 
					(operatorNode) -> extractAndOperator(operatorNode));
		} else {
			throw new RuntimeException("equality expression node must have children.");
		}
	}
	
	private BinaryOperator extractAndOperator(ParserNode andOperatorNode) {
		String andOperatorToken = andOperatorNode.get(TOKEN_ATTRIBUTE);
		if (STUtil.isEqual(andOperatorToken, "AND") || STUtil.isEqual(andOperatorToken, "&")) {
			return BinaryOperator.AND;
		} else {
			throw new RuntimeException("Symbol for AND ("+andOperatorToken+") was not expected.");
		}
	}

	private Expression buildComparisonExpression(ParserNode comparisonExpressionNode) {
		if (exactlyOneChild(comparisonExpressionNode)) {
			return buildEquExpression(comparisonExpressionNode.getChildren().get(0));
		} else if (moreThanOneChild(comparisonExpressionNode)) {
			return buildConcatenatedBinaryExpression(comparisonExpressionNode,
					(operandNode) -> buildEquExpression(operandNode), 
					(operatorNode) -> extractEquOperator(operatorNode));
		} else {
			throw new RuntimeException("equality expression node must have children.");
		}
	}
	
	private BinaryOperator extractEquOperator(ParserNode equOperatorNode) {
		String equOperatorToken = equOperatorNode.get(TOKEN_ATTRIBUTE);
		if (STUtil.isEqual(equOperatorToken, "=")) {
			return BinaryOperator.EQUAL;
		} else if (STUtil.isEqual(equOperatorToken, "<>")) {
			return BinaryOperator.NOT_EQUAL;
		} else {
			throw new RuntimeException("Symbol for equality ("+equOperatorToken+") was not expected.");
		}
	}

	private Expression buildEquExpression(ParserNode equExpressionNode) {
		if (exactlyOneChild(equExpressionNode)) {
			return buildAddExpression(equExpressionNode.getChildren().get(0));
		} else if (moreThanOneChild(equExpressionNode)) {
			return buildConcatenatedBinaryExpression(equExpressionNode,
					(operandNode) -> buildAddExpression(operandNode), 
					(operatorNode) -> extractComparisonOperator(operatorNode));	
		} else {
			throw new RuntimeException("equality expression node has "+equExpressionNode.getChildren().size()+" children.");
		}
	}

	private BinaryOperator extractComparisonOperator(ParserNode comparisonOperatorNode) {
		String comparisonOperatorToken = comparisonOperatorNode.get(TOKEN_ATTRIBUTE);
		if (STUtil.isEqual(comparisonOperatorToken, "<") || STUtil.isEqual(comparisonOperatorToken, "&lt;")) {
			return BinaryOperator.LESSER_THAN;
		} else if (STUtil.isEqual(comparisonOperatorToken, "<=") || STUtil.isEqual(comparisonOperatorToken, "&le;") 
				|| STUtil.isEqual(comparisonOperatorToken, "&lt;=")) {
			return BinaryOperator.LESSER_EQUAL;
		} else if (STUtil.isEqual(comparisonOperatorToken, ">") || STUtil.isEqual(comparisonOperatorToken, "&gt;")) {
			return BinaryOperator.GREATER_THAN;
		} else if (STUtil.isEqual(comparisonOperatorToken, ">=") || STUtil.isEqual(comparisonOperatorToken, "&ge;")
				|| STUtil.isEqual(comparisonOperatorToken, "&gt;=")) {
			return BinaryOperator.GREATER_EQUAL;
		} else {
			throw new RuntimeException("Symbol for comparison ("+comparisonOperatorToken+") was not expected.");
		} 
	}

	private Expression buildAddExpression(ParserNode addExpressionNode) {
		if (exactlyOneChild(addExpressionNode)) {
			return buildTerm(addExpressionNode.getChildren().get(0));
		} else if (moreThanOneChild(addExpressionNode)) {
			return buildConcatenatedBinaryExpression(addExpressionNode,
					(operandNode) -> buildTerm(operandNode), 
					(operatorNode) -> extractAddOperator(operatorNode));	
		} else {
			throw new RuntimeException("add expression node has "+addExpressionNode.getChildren().size()+" children.");
		}
	}

	private BinaryOperator extractAddOperator(ParserNode addOperatorNode) {
		String addOperatorToken = addOperatorNode.get(TOKEN_ATTRIBUTE);
		if (STUtil.isEqual(addOperatorToken, "+")) {
			return BinaryOperator.ADD;
		} else if (STUtil.isEqual(addOperatorToken, "-")) {
			return BinaryOperator.SUBTRACT;
		} else {
			throw new RuntimeException("Symbol for plus/minus ("+addOperatorToken+") was not expected.");
		}
	}

	private Expression buildTerm(ParserNode termNode) {
		if (exactlyOneChild(termNode)) {
			return buildPowerExpression(termNode.getChildren().get(0));
		} else if (moreThanOneChild(termNode)) {
			return buildConcatenatedBinaryExpression(termNode,
					(operandNode) -> buildPowerExpression(operandNode), 
					(operatorNode) -> extractTermOperator(operatorNode));	
		} else {
			throw new RuntimeException("term node has "+termNode.getChildren().size()+" children.");
		}
	}
	
	private BinaryOperator extractTermOperator(ParserNode multiplyOperatorNode) {
		String multiplyOperatorToken = multiplyOperatorNode.get(TOKEN_ATTRIBUTE);
		if (STUtil.isEqual(multiplyOperatorToken, "*")) {
			return BinaryOperator.MULT;
		} else if (STUtil.isEqual(multiplyOperatorToken, "/")) {
			return BinaryOperator.DIV;
		} else if (STUtil.isEqual(multiplyOperatorToken, "MOD")) {
			return BinaryOperator.MOD;
		} else {
			throw new RuntimeException("Symbol for mult/div/modulo ("+multiplyOperatorToken+") was not expected.");
		}
	}

	private Expression buildPowerExpression(ParserNode powerExpressionNode) {
		if (exactlyOneChild(powerExpressionNode)) {
			return buildUnaryExpression(powerExpressionNode.getChildren().get(0));
		} else if (moreThanOneChild(powerExpressionNode)) {
			return buildConcatenatedBinaryExpression(powerExpressionNode, 
					(operandNode) -> buildUnaryExpression(operandNode), // constructs the operand expressions 
					(operatorNode) -> BinaryOperator.EXP); 				// constructs the operators 
		} else {
			throw new RuntimeException("power expression node must have children.");
		}
	}

	private Expression buildUnaryExpression(ParserNode unaryExpressionNode) {
		// the primary operand is a base component in the expression hierarchy
		if (exactlyOneChild(unaryExpressionNode)) {
			return buildPrimaryExpression(unaryExpressionNode.getChildren().get(0));
		} else if (moreThanOneChild(unaryExpressionNode)) {
			ParserNode primaryExpressionNode = unaryExpressionNode.getChildByAttribute(RULE_ATTRIBUTE, "primary_expression");
			if (primaryExpressionNode != null) {
				Expression primaryExpression = buildPrimaryExpression(primaryExpressionNode);
				ParserNode unaryOperatorNode = unaryExpressionNode.getChildByAttribute(RULE_ATTRIBUTE, "unary_operator");
				if (unaryOperatorNode != null) {
					UnaryExpression unaryExpr = exprFactory.createUnaryExpression();
					unaryExpr.setExpressionType(ExpressionType.UNARY);
					unaryExpr.setSubexpression(primaryExpression);
					unaryExpr.setDataType(primaryExpression.getDataType());
					unaryExpr.setOperator(extractUnaryOperator(unaryOperatorNode));
					
					
					return unaryExpr; 
				} else {
					return primaryExpression;
				}
			} else {
				throw new RuntimeException("primary expression node must not be null");
			}
		} else {
			throw new RuntimeException("unary expression node must have one child");
		}
	}
	
	private UnaryOperator extractUnaryOperator(ParserNode unaryOperatorNode) {
		String unaryOperatorToken = unaryOperatorNode.get(TOKEN_ATTRIBUTE);
		if (STUtil.isEqual(unaryOperatorToken, "NOT")) {
			return UnaryOperator.NOT;
		} else if(STUtil.isEqual(unaryOperatorToken, "-")) {
			return UnaryOperator.NEGATIVE;
		} else if(STUtil.isEqual(unaryOperatorToken, "+")) {
			return UnaryOperator.POSITIVE;
		} else {
			throw new RuntimeException("Symbol for NOT/plus-sign/minus-sign ("+unaryOperatorToken+") was not expected.");
		}
	}

	private Expression buildPrimaryExpression(ParserNode primaryExpressionNode) {
		if (exactlyOneChild(primaryExpressionNode)) {
			ParserNode primaryExpressionChildNode = primaryExpressionNode.getChildren().get(0);
			switch (primaryExpressionChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "constant": {	
					return constantBuilder.build(primaryExpressionChildNode);
				}
				case "variable": {
					return variableBuilder.build(primaryExpressionChildNode);
				}
				case "expression": { // '(' expression ')' -> recursion
					UnaryExpression unaryExpr = exprFactory.createUnaryExpression();
					unaryExpr.setExpressionType(ExpressionType.UNARY);
					unaryExpr.setSubexpression(build(primaryExpressionChildNode));
					unaryExpr.setDataType(unaryExpr.getSubexpression().getDataType());
					unaryExpr.setOperator(UnaryOperator.PARENTHESIS);
					
					return unaryExpr;
				}
				case "function_call": {
					return functionCallBuilder.build(primaryExpressionChildNode);
				}
				case "enumerated_value": {
					// TODO: adjust  grammar --> create own rule for enumarated values
					throw new RuntimeException("The rule \"enumerated_value\" is not specified in the current parser version");
				}
				case "subrange": {
					ParserNode lowerBoundNode = primaryExpressionChildNode.getChildren().get(0);
					ParserNode upperBoundNode = primaryExpressionChildNode.getChildren().get(1);
					
					Subrange subrange = exprFactory.createSubrange();
					subrange.setExpressionType(ExpressionType.SUBRANGE);
					subrange.setLowerBound(constantBuilder.build(lowerBoundNode));
					subrange.setUpperBound(constantBuilder.build(upperBoundNode));
					if (subrange.getLowerBound().getDataType().equals(subrange.getUpperBound().getDataType())) {
						subrange.setDataType(subrange.getLowerBound().getDataType());
					}
					
					return subrange;
				}
				default: {
					throw new IllegalArgumentException(STUtil.getIllegalRuleMessage(primaryExpressionChildNode.<String>get(RULE_ATTRIBUTE)));
				}
			}
		} else {
			throw new RuntimeException("primary expression node must have one child");
		}
	}
	
	///////////////////////////////////////////////////////
	// Utilitiy Methods
	///////////////////////////////////////////////////////
	
	private boolean exactlyOneChild(ParserNode node) {
		return node.getChildren().size() == 1;
	}
	
	private boolean moreThanOneChild(ParserNode expressionNode) {
		return expressionNode.getChildren().size() >= 2;
	}
	
	private BinaryExpression constructBinaryExpression(Expression left, Expression right, BinaryOperator binaryOperator) {
		BinaryExpression binaryExpr = exprFactory.createBinaryExpression();
		binaryExpr.setExpressionType(ExpressionType.BINARY);
		binaryExpr.setLeft(left);
		binaryExpr.setRight(right);
		binaryExpr.setOperator(binaryOperator);
		if (left != null && right != null && left.getDataType().equals(right.getDataType())) {
			binaryExpr.setDataType(left.getDataType());
		}
		return binaryExpr;
	}
	
	/**
	 * Turns a concatenation of binary expressions into a hierarchy of {@link BinaryExpression}s.<br>
	 * Concatenation example: (operand0 operator1 (operand2 operation3 (<i>...</i>)))
	 * 
	 * @param rootNode the node containing the concatenation of operands and operators
	 * @param operandMapping the expression building function constructing the operands in the expression out of the operand parser nodes 
	 * @param operatorMapping the function extracting the operator out of the operator parser nodes
	 * @return topmost binary expression of the hierarchy
	 */
	private BinaryExpression buildConcatenatedBinaryExpression(ParserNode rootNode, 
			ParserNodeMapping<Expression> operandMapping, ParserNodeMapping<BinaryOperator> operatorMapping) {
		assert rootNode != null : "root node must not be null";
		assert moreThanOneChild(rootNode) : "root node must have 2 or more children";
				
		BinaryExpression topBinaryExpr = null;
		BinaryExpression prevBinaryExpr = null;
		for (int i = 0; i < rootNode.getChildren().size(); i+=2) {
			// in every iteration build a binary expression with the exception of the last
			if (i == rootNode.getChildren().size() - 1) {
				ParserNode rightMostOperand = rootNode.getChildren().get(i);
				prevBinaryExpr.setRight(operandMapping.map(rightMostOperand));
			} else {
				// construct the current binary expression with its operand and left expression
				ParserNode operandNode = rootNode.getChildren().get(i);
				ParserNode operatorNode = rootNode.getChildren().get(i+1);
				BinaryExpression curBinaryExpr = constructBinaryExpression(operandMapping.map(operandNode), null, operatorMapping.map(operatorNode));				
				if (prevBinaryExpr != null) { // connect current binary expression with the previous one
					prevBinaryExpr.setRight(curBinaryExpr);
				} else { // store the top binary expression at the first iteration 
					topBinaryExpr = curBinaryExpr;
				}
				prevBinaryExpr = curBinaryExpr; // set the new previous expression 
			}
		}
		return topBinaryExpr;
	}
}
