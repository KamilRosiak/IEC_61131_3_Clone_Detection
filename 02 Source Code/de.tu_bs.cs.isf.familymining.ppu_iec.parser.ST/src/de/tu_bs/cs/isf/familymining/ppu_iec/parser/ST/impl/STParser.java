package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarLexer;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserType;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.abstracts.AbstractParser;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.INodeGenerator;

public class STParser extends AbstractParser {	
	protected static boolean _prettyPrint = true;
	protected STGrammarLexer _lexer = null;
	protected STGrammarParser _parser = null;
	protected ParserRuleContext _curParserContext = null;
		

	public STParser() {
		super(STStringTable.PARSER_EXTENSION_ID);
	}
	
	public STParser(String description) {
		this.description = description;
	}
	
	/**
	 * Scans the <b>input</b> and applies the rule denoted by <b>ruleIdentifier</b>. Convenience method.
	 * 
	 * @param input
	 * @param ruleIdentifier
	 * @return parser context or null, if parsing fails
	 */
	public ParserRuleContext compile(String input, String ruleIdentifier) {
		// start parsing
		_lexer = new STGrammarLexer(CharStreams.fromString(input));
		_lexer.removeErrorListeners();
		_lexer.addErrorListener(new ThrowingErrorListener());
		
		CommonTokenStream tokenStream = new CommonTokenStream(_lexer);
		
		_parser = new STGrammarParser(tokenStream);
		_parser.removeErrorListeners();
		_parser.addErrorListener(new ThrowingErrorListener());
		
		ParserRuleContext parserContext = this.invokeRule(ruleIdentifier);
		
		// Visualization
		AST simpleSyntaxTree = new AST(parserContext);
		if (_prettyPrint) {
			System.out.println(simpleSyntaxTree.toString());
	        
		} else {
			System.out.println(parserContext.toStringTree(_parser));
		}
	
		// return parse tree
		return parserContext;			
	}
	
	public ParserRuleContext invokeRule(String ruleIdentifier) {
		ParserRuleContext parserContext = null;
		try {

			for (Method m : _parser.getClass().getDeclaredMethods()) {
				if (m.getName().equalsIgnoreCase(ruleIdentifier)) {
					parserContext = (ParserRuleContext) m.invoke(_parser);
				}
			}
		} catch (ParseCancellationException e) {
			e.printStackTrace();
		} catch (NoViableAltException e) {
			e.printStackTrace();
		} catch (RecognitionException re) {
			System.out.println("An exception has occured: "+re.getMessage());
			System.out.println("Additional ANTLRv4 messages: \n"
					+ "Offending State: " +re.getOffendingState()+"\n"
					+ "RuleContext: "+re.getCtx()+ "\n"
					+ "Offending Token: "+re.getOffendingToken());
			
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			System.err.println(getErrorInformation());
		}
		
		return parserContext;
	}
	

	private String getErrorInformation() {
		String inputText = "Parser Input:\n"+_lexer._input.toString().replaceAll("[\n]", "\n");
		String tokenList = "";
		for (Token t : _lexer.getAllTokens()) { tokenList += t.getText() + " ";}
		tokenList = "[" + tokenList.trim().replace(" ", ",") +"]";
		
		return inputText+"\n"+tokenList+"\n";
	}

	@Override
	public ParserType getType() {
		return ParserType.STRUCTURED_TEXT;
	}

	public List<Token> getTokens(String input) {
		_lexer = new STGrammarLexer(CharStreams.fromString(input));
		CommonTokenStream tokenStream = new CommonTokenStream(_lexer);
		tokenStream.fill();
		List<Token> tokens = tokenStream.getTokens();
		return tokens;
	}
	
	@Override
	public void parse(String input) throws NullPointerException {
		// start parsing
		_lexer = new STGrammarLexer(CharStreams.fromString(input));
		_lexer.addErrorListener(new ThrowingErrorListener());
		
		CommonTokenStream tokenStream = new CommonTokenStream(_lexer);
		
		_parser = new STGrammarParser(tokenStream);
		_parser.addErrorListener(new ThrowingErrorListener());
		
		// invoke the correct rule
		String startingRule = this.initialData.getOrDefault(STStringTable.INIT_RULE, STStringTable.STARTING_RULE);
		ParserRuleContext parserContext = this.invokeRule(startingRule);
		
		// add all callbacks to visitor
		INodeGenerator nodeGenerator = new STNodeGenerator(_parser, input);
		STContextDispatcher stContextDispatcher = new STContextDispatcher(nodeGenerator, callbacks);
		stContextDispatcher.visit(parserContext);
		
		// post-process results
		finish();
		
		// get current context
		_curParserContext = parserContext;
		if (_curParserContext == null) {
			throw new NullPointerException("ST parser context is null.");
		}
	}
	
	public ParserRuleContext getCurParserContext() throws NullPointerException {
		if (_curParserContext == null) throw new NullPointerException();
		return _curParserContext;
	}
	
	public STGrammarLexer getLexer() {
		return _lexer;
	}
	
	public STGrammarParser getParser() {
		return _parser;
	}
}
