package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.interfaces.ExpressionStructure;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.BinaryExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.UnaryExpression;

public class DefaultExpressionStructure implements Serializable, ExpressionStructure {

	private static final long serialVersionUID = 4200792616207892952L;

	@Override
	public List<Expression> getSubexpressions(Expression e) {
		if (e instanceof BinaryExpression) {
			BinaryExpression be = (BinaryExpression) e;
			return Arrays.asList(be.getLeft(), be.getRight());
		} else if (e instanceof UnaryExpression) {
			UnaryExpression ue = (UnaryExpression) e;
			return Arrays.asList(ue.getSubexpression());
		} else {
			return Arrays.asList();
		}
	}

}
