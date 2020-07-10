package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.builders;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.RULE_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.TOKEN_ATTRIBUTE;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ExpressionType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.StructuredTextExpressionFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IModelBuilder;

public class VariableBuilder implements IModelBuilder<VariableExpression> {

	private StructuredTextExpressionFactory exprFactory;
	private IModelBuilder<Expression> expressionBuilder;
	
	public VariableBuilder(IModelBuilder<Expression> expressionBuilder) {
		this.exprFactory = StructuredTextExpressionFactory.eINSTANCE;
		this.expressionBuilder = expressionBuilder;
	}
	
	@Override
	public VariableExpression build(ParserNode variableNode) {
		if (variableNode.getChildren().size() == 1) {
			ParserNode variableChildNode = variableNode.getChildren().get(0);
			switch (variableChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "direct_variable": {
					VariableExpression variable = exprFactory.createVariableExpression();
					variable.setExpressionType(ExpressionType.VARIABLE);
					variable.setSymbol(variableNode.get(TOKEN_ATTRIBUTE));
					variable.setDataType(ElementaryDataType.DERIVED);
					// TODO: find out return type of variable in particular recursion
					return variable;
				}
				case "symbolic_variable": {
					return buildSymbolicVariable(variableChildNode);
				}
				default: {
					throw new IllegalArgumentException(STUtil.getIllegalRuleMessage(variableChildNode.<String>get(RULE_ATTRIBUTE)));
				}
			}
		} else {
			throw new RuntimeException("variable node must have one child");
		}
	}
	
	private VariableExpression buildSymbolicVariable(ParserNode symbolicVariableNode) {
		VariableExpression variable = exprFactory.createVariableExpression();
		variable.setExpressionType(ExpressionType.VARIABLE);
		for (ParserNode symbolicVariableChildNode : symbolicVariableNode.getChildren()) {
			switch (symbolicVariableChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "variable_name": {
					variable.setSymbol(symbolicVariableChildNode.get(TOKEN_ATTRIBUTE));
					variable.setDataType(ElementaryDataType.DERIVED);
					// TODO: find out return type of variable in particular recursion
				} break;
				case "symbolic_variable_helper": {
					dispatchSymbolicVariableExtension(variable, symbolicVariableChildNode);
				} break;
				default: {
					throw new IllegalArgumentException(STUtil.getIllegalRuleMessage(symbolicVariableChildNode.<String>get(RULE_ATTRIBUTE)));
				}
			}
		}
		return variable;
	}
	
	private void dispatchSymbolicVariableExtension(VariableExpression variable, ParserNode symbolicVariableHelperNode) {
		ParserNode symbolicVariableHelperChildNode = symbolicVariableHelperNode.getChildren().get(0);
		switch (symbolicVariableHelperChildNode.<String>get(RULE_ATTRIBUTE)) {
			case "array_variable": {
				dipatchArrayExtension(variable, symbolicVariableHelperChildNode);
			} break;
			case "structured_variable": {
				dispatchInnerVariableExtension(variable, symbolicVariableHelperChildNode);
			} break;
		}
	}

	private void dipatchArrayExtension(VariableExpression variable, ParserNode arrayVariableNode) {
		for (ParserNode arrayVariableChildNode : arrayVariableNode.getChildren()) {
			switch (arrayVariableChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "expression": {
					variable.getArrayIndices().add(expressionBuilder.build(arrayVariableChildNode));
				} break;
				case "symbolic_variable_helper": {
					dispatchSymbolicVariableExtension(variable, arrayVariableChildNode);
				} break;
				default: {
					throw new IllegalArgumentException(STUtil.getIllegalRuleMessage(arrayVariableChildNode.get(RULE_ATTRIBUTE)));
				}
			}
			
		}
	}
	
	private void dispatchInnerVariableExtension(VariableExpression variable, ParserNode structuredVariableNode) {
		VariableExpression innerVariable = exprFactory.createVariableExpression();
		innerVariable.setExpressionType(ExpressionType.VARIABLE);
		variable.setInnerVariable(innerVariable);
		
		for (ParserNode structuredVariableChildNode : structuredVariableNode.getChildren()) {
			switch (structuredVariableChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "variable_name": {
					innerVariable.setSymbol(structuredVariableChildNode.get(TOKEN_ATTRIBUTE));
					innerVariable.setDataType(ElementaryDataType.DERIVED);
					// TODO: find out return type of variable in particular recursion
				} break;
				case "symbolic_variable_helper": {
					dispatchSymbolicVariableExtension(innerVariable, structuredVariableChildNode);
				} break;
				default: {
					throw new IllegalArgumentException(STUtil.getIllegalRuleMessage(structuredVariableChildNode.get(RULE_ATTRIBUTE)));
				}
			}
		}
	}
}
