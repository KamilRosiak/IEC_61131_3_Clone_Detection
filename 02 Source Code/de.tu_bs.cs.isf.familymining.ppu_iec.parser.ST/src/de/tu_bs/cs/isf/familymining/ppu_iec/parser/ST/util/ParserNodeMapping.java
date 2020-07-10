package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util;

import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;

public interface ParserNodeMapping<T> {
	
	public T map(ParserNode node);
}
