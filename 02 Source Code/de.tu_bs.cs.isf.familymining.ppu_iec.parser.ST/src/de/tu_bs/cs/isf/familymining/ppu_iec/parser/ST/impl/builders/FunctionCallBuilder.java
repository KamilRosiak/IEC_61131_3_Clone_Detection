package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.builders;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.RULE_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.TOKEN_ATTRIBUTE;

import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ExpressionType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.FunctionCallExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Parameter;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.StructuredTextExpressionFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IModelBuilder;

public class FunctionCallBuilder implements IModelBuilder<FunctionCallExpression> {
	private StructuredTextExpressionFactory exprFactory;
	private IModelBuilder<VariableExpression> variableExprBuilder;
	private IModelBuilder<Expression> expressionBuilder;
	
	public FunctionCallBuilder(IModelBuilder<VariableExpression> variableExprBuilder, IModelBuilder<Expression> expressionBuilder) {
		exprFactory = StructuredTextExpressionFactory.eINSTANCE;
		this.variableExprBuilder = variableExprBuilder;
		this.expressionBuilder = expressionBuilder;
	}
	
	@Override
	public FunctionCallExpression build(ParserNode functionCallNode) {
		return buildFunctionCall(functionCallNode);
	}

	private FunctionCallExpression buildFunctionCall(ParserNode functionCallNode) {
		FunctionCallExpression functionCall = exprFactory.createFunctionCallExpression();
		functionCall.setExpressionType(ExpressionType.FUNCTION_CALL);		
		for (ParserNode functionCallChildNode : functionCallNode.getChildren()) {
			switch (functionCallChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "function_name": {
					functionCall.setSymbol(functionCallChildNode.get(TOKEN_ATTRIBUTE));
				} break;
				case "parameter_list": {
					functionCall.getParameters().addAll(buildParameterList(functionCallChildNode));
				} break;
				default: {
					throw new IllegalArgumentException(STUtil.getIllegalRuleMessage(functionCallChildNode.<String>get(RULE_ATTRIBUTE)));
				}
			}
		}
		return functionCall;
	}
	
	private List<Parameter> buildParameterList(ParserNode parameterListNode) {
		// add assignment as single expr --> paramN, argN
		List<Parameter> parameterList = new ArrayList<>();
		for (ParserNode parameterAssignmentNode : parameterListNode.getChildren()) {
			switch (parameterAssignmentNode.<String>get(RULE_ATTRIBUTE)) {
				case "param_assignment": {
					parameterList.add(buildParameter(parameterAssignmentNode));
				} break;
				default: {
					throw new IllegalArgumentException(STUtil.getIllegalRuleMessage(parameterAssignmentNode.<String>get(RULE_ATTRIBUTE)));
				}
			}
		}
		return parameterList;
	}

	private Parameter buildParameter(ParserNode parameterAssignmentNode) {
		Parameter parameter = exprFactory.createParameter();
		for (ParserNode parameterAssignmentChildNode : parameterAssignmentNode.getChildren()) {
			switch (parameterAssignmentChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "variable": {
					parameter.setInput(variableExprBuilder.build(parameterAssignmentChildNode));
				} break;
				case "expression": {
					parameter.setAssignedValue(expressionBuilder.build(parameterAssignmentChildNode));
				} break;
				default: {
					throw new IllegalArgumentException(STUtil.getIllegalRuleMessage(parameterAssignmentChildNode.<String>get(RULE_ATTRIBUTE)));
				}
			}
		}
		return parameter;
	}
}
