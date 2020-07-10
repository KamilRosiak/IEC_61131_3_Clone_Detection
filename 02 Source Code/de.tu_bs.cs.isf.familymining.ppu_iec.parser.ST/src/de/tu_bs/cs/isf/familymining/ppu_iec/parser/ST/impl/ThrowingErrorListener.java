package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl;
import java.util.BitSet;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ThrowingErrorListener extends BaseErrorListener {

	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
			BitSet conflictingAlts, ATNConfigSet configs) 
					throws ParseCancellationException {
        throw new ParseCancellationException("SLL conflict: from " + startIndex + " to " + stopIndex);
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
		      throws ParseCancellationException {
		         throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
	}
	
	@Override
	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs)
		throws ParseCancellationException {
	         throw new ParseCancellationException("ambiguity exception: from "+startIndex+" to "+stopIndex);
	}
}
