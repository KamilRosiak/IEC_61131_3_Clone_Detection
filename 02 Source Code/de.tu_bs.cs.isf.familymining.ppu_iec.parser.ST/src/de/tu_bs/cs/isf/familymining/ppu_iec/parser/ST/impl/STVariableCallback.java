package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.builders.ExpressionBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.builders.VariableBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserType;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.abstracts.antlr.AntlrModelBuilderCallback;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IModelBuilder;

public class STVariableCallback extends AntlrModelBuilderCallback<VariableExpression> {
	
	public STVariableCallback() {
		super(STStringTable.VARIABLE_CALLBACK_EXTENSION_ID, ParserType.STRUCTURED_TEXT);
	}

	@Override
	public IModelBuilder<VariableExpression> getModelBuilder() {
		IModelBuilder<Expression> exprBuilder = new ExpressionBuilder();
		return new VariableBuilder(exprBuilder);
	}

	@Override
	protected boolean isHidden(ParserNode node) {
		return false;
	}

}
