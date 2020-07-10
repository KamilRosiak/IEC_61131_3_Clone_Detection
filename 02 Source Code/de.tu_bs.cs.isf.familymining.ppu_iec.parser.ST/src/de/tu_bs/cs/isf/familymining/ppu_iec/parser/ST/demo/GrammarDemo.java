package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.demo;

import org.eclipse.swt.graphics.Point;

import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarLexer;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.antlr.grammar_check.GrammarCheckApplication;

public class GrammarDemo {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Point winSize = new Point(1024, 768);
		GrammarCheckApplication.start(STGrammarLexer.class, STGrammarParser.class, winSize);
	}
	
}
