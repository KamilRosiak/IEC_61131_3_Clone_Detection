package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.builders.ExpressionBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserType;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.abstracts.antlr.AntlrModelBuilderCallback;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IModelBuilder;

public class STExpressionCallback extends AntlrModelBuilderCallback<Expression> {

	public STExpressionCallback() {
		super(STStringTable.EXPRESSION_CALLBACK_EXTENSION_ID, ParserType.STRUCTURED_TEXT);
	}

	@Override
	public IModelBuilder<Expression> getModelBuilder() {
		return new ExpressionBuilder();
	}

	@Override
	protected boolean isHidden(ParserNode node) {
		return false;
	}

}
