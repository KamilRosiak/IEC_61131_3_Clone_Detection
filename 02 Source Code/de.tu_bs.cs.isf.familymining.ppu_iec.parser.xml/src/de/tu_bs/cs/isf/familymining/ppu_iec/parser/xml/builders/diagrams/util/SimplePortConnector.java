package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;

public interface SimplePortConnector<P extends Port, T extends DiagramElement> {

	public void connect(P port, T element, VariableExpression formalParameter);
}


