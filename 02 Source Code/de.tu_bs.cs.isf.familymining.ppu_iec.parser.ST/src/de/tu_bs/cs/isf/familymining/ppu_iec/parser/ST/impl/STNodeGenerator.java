package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.ABSOLUTE_END_LINE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.ABSOLUTE_START_LINE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.CHAR_END_POSITION_IN_LINE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.CHAR_START_POSITION_IN_LINE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.IS_HIDDEN_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.RULE_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.TOKEN_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.TOKEN_END_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.TOKEN_START_ATTRIBUTE;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.INodeGenerator;

public class STNodeGenerator implements INodeGenerator {
	private Map<ParserRuleContext, ParserNode> parserNodeMap;
	private Parser parser;
	private String originalText;
	
	public STNodeGenerator(Parser antlrParser, String originalText) {
		parserNodeMap = new HashMap<>();
		this.parser = antlrParser;
		this.originalText = originalText;
	}
	
	public ParserNode generate(Object context) {
		if (context instanceof ParserRuleContext) {
			ParserRuleContext antlrContext = (ParserRuleContext) context;
			ParserNode node = new ParserNode();
			node.put(RULE_ATTRIBUTE, parser.getRuleNames()[antlrContext.getRuleIndex()])
			.put(IS_HIDDEN_ATTRIBUTE, "false")
			.put(TOKEN_START_ATTRIBUTE, antlrContext.start.getTokenIndex())
			.put(TOKEN_END_ATTRIBUTE, antlrContext.stop.getTokenIndex())
			.put(TOKEN_ATTRIBUTE, getTextFromContext(antlrContext, originalText))
			.put(ABSOLUTE_START_LINE, antlrContext.start.getLine())
			.put(ABSOLUTE_END_LINE, antlrContext.stop.getLine())
			.put(CHAR_START_POSITION_IN_LINE, antlrContext.start.getCharPositionInLine())
			.put(CHAR_END_POSITION_IN_LINE, getCharEndPosition(antlrContext.stop))
			.setParent(deriveParentNodeFrom(antlrContext));
			map(antlrContext, node);
			return node;
		} else {
			throw new ClassCastException("context type mismatch: expected ParserRuleContext");
		}
	}

	private int getCharEndPosition(Token token) {
		int lineBeginIndex = token.getStopIndex();
		while (lineBeginIndex-1 >= 0 && originalText.charAt(lineBeginIndex-1) != '\n') {
			lineBeginIndex--; 
		}
		int stopTokenCharEndPosition = token.getStopIndex() - lineBeginIndex;
		return stopTokenCharEndPosition;
	}

	private String getTextFromContext(ParserRuleContext context, String originalText) {
		int startIndex = context.start.getStartIndex();
		int stopIndex = context.stop.getStopIndex();
		String textPart = "";
		if (startIndex <= stopIndex) {
			textPart = originalText.substring(startIndex, stopIndex+1);
		}
		return textPart;
	}

	private ParserNode deriveParentNodeFrom(ParserRuleContext context) {
		if (context.getParent() != null) {
			return parserNodeMap.get(context.getParent());			
		} else {
			return null;
		}
	}

	private void map(ParserRuleContext context, ParserNode node) {
		parserNodeMap.put(context, node);
	}

}