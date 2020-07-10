package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.interfaces;

import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;

public interface ExpressionStructure {

	public List<Expression> getSubexpressions(Expression e);
}
