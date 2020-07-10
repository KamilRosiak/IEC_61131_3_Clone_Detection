package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.builders.ExpressionBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.builders.FunctionCallBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.builders.VariableBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.FunctionCallExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserType;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.abstracts.antlr.AntlrModelBuilderCallback;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IModelBuilder;

public class STNodeCallback extends AntlrModelBuilderCallback<StructuredText> {
	
	public STNodeCallback() {
		super(STStringTable.STATEMENTS_CALLABACK_EXTENSION_ID, ParserType.STRUCTURED_TEXT);
	}

	@Override
	public IModelBuilder<StructuredText> getModelBuilder() {
		IModelBuilder<Expression> expressionBuilder = new ExpressionBuilder();
		IModelBuilder<VariableExpression> variableExpressionBuilder = new VariableBuilder(expressionBuilder);
		IModelBuilder<FunctionCallExpression> functionCallBuilder = new FunctionCallBuilder(variableExpressionBuilder, expressionBuilder);
		return new STMetaModelBuilder(functionCallBuilder, expressionBuilder, variableExpressionBuilder);
	}

	@Override
	protected boolean isHidden(ParserNode node) {
		return false;
	}
}
