package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.EXPRESSION_CALLBACK_EXTENSION_ID;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.ST_CALLBACK_EXTENSION_ID;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.ST_PARSER_EXTENSION_ID;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.VARIABLE_CALLBACK_EXTENSION_ID;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.eclipse.core.runtime.CoreException;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.INodeCallback;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.IParser;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IParserFactory;

public class StructuredTextUtil {

	@SuppressWarnings("unchecked")
	public static <T> T parse(String input, String rule, String nodeCallbackExtId, IParserFactory parserFactory) {
		Map<String, String> initData = new HashMap<>();
		initData.put(STStringTable.INIT_RULE, rule);
		try {
			IParser stParser = parserFactory.createParser(ST_PARSER_EXTENSION_ID, initData);
			INodeCallback variableBuilderCallback = parserFactory.createNodeCallable(nodeCallbackExtId);
			variableBuilderCallback.setParser(stParser);
			stParser.addNodeCallable(variableBuilderCallback);
			stParser.parse(input);	

			Object result = variableBuilderCallback.getResult();
			if (result != null) {
				try {
					T typedResult = (T) result;					
					return typedResult;
				} catch (ClassCastException e) {
					throw new ClassCastException("Cast failed. Actual type is "+result.getClass().getTypeName());
				}
			} else {
				throw new NullPointerException("Parsing result was null.");
			}

		} catch (NoSuchElementException | CoreException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Uses an ST Parser to translate a variable into an instance of <i>VariableExpression</i>
	 * 
	 * @param variableNode
	 * @return instance of <i>VariableExpression</i>
	 * 
	 * {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression}
	 */
	public static VariableExpression buildVariableExpression(String variableString, IParserFactory parserFactory) {
		if (variableString == null || variableString.isEmpty()) {
			return null;
		} else if (variableString.contains(" ")) {
			variableString = "UNDEF";				
		}
		
		VariableExpression varExpr = StructuredTextUtil.parse(variableString, "variable", VARIABLE_CALLBACK_EXTENSION_ID, parserFactory);
		if (varExpr == null) {
			throw new NullPointerException("Labelled Variable was null.");
		}
		return varExpr;
	}

	/**
	 * Uses an ST Parser to translate an expression string into an instance of <i>Expression</i>
	 * 
	 * @param variableNode
	 * @return instance of <i>VariableExpression</i>
	 * 
	 * {@link structuredtextexpression.Expression}
	 */
	public static Expression buildExpression(String expressionString, IParserFactory parserFactory) {
		if (expressionString == null || expressionString.isEmpty()) {
			return null;
		}
		
		Expression assignedValue = StructuredTextUtil.parse(expressionString, "expression", EXPRESSION_CALLBACK_EXTENSION_ID, parserFactory);
		if (assignedValue == null) {
			throw new NullPointerException("Assigned Value was null.");
		}
		return assignedValue;
	}
	
	/**
	 * Parses its input as Structured Text statements.
	 * 
	 * @param STTextBlock
	 * @param parserFactory 
	 * @return List<Statement> List of Structured Text statements.
	 */
	public static StructuredText buildStructuredText(String STTextBlock, IParserFactory parserFactory) {
		StructuredText structuredTextInstance = StructuredTextUtil.parse(STTextBlock, "statement_list", ST_CALLBACK_EXTENSION_ID, parserFactory);
		if (structuredTextInstance == null) {
			throw new NullPointerException("Assigned Value was null.");
		}
		return structuredTextInstance;
	}
}
