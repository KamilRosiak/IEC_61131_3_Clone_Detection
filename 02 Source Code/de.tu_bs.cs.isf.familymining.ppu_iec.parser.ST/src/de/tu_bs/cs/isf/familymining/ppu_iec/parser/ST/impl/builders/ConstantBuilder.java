package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl.builders;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.RULE_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.TOKEN_ATTRIBUTE;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ExpressionType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Literal;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.StructuredTextExpressionFactory;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IModelBuilder;


public class ConstantBuilder implements IModelBuilder<Literal> {

	private StructuredTextExpressionFactory exprFactory;
	
	public ConstantBuilder() {
		this.exprFactory = StructuredTextExpressionFactory.eINSTANCE;
	}
	
	@Override
	public Literal build(ParserNode constantNode) {
		return buildConstant(constantNode);
	}
	
	private Literal buildConstant(ParserNode constantNode) {
		Literal constant = exprFactory.createLiteral();
		constant.setExpressionType(ExpressionType.LITERAL);
		constant.setSymbol(constantNode.get(TOKEN_ATTRIBUTE));	
		if (constantNode.getChildren().size() == 1) {
			ParserNode constantChildNode = constantNode.getChildren().get(0);
			switch (constantChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "numeric_literal": {
					constant.setDataType(extractNumericLiteralType(constantChildNode));
				} break;
				case "character_string": {
					constant.setDataType(extractCharStringType(constantChildNode));
				} break;
				case "time_literal": {
					constant.setDataType(extractTimeLiteralType(constantChildNode));
				} break;
				case "bit_string": {
					constant.setDataType(extractBitStringType(constantChildNode));
				} break;
				case "boolean_literal": {
					constant.setDataType(ElementaryDataType.BOOL);	
				} break;
				default: {
					throw new IllegalArgumentException(STUtil.getIllegalRuleMessage(constantChildNode.<String>get(RULE_ATTRIBUTE)));
				}
			}	
			return constant;
		} else {
			throw new RuntimeException("Constant node must have only one child.");
		}
	}

	private ElementaryDataType extractNumericLiteralType(ParserNode numericLiteralNode) {
		if (numericLiteralNode.getChildren().size() == 1) {
			ParserNode numericLiteralChildNode = numericLiteralNode.getChildren().get(0);
			switch (numericLiteralChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "integer_literal": {
					return ElementaryDataType.DINT;
				}
				case "real_literal": {
					return ElementaryDataType.LREAL;
				}
				default: {
					throw new IllegalArgumentException(STUtil.getIllegalRuleMessage(numericLiteralChildNode.<String>get(RULE_ATTRIBUTE)));
				}
			}			
		} else {
			throw new RuntimeException("Numeric literal node must have only one child");
		}
	}
	
	private ElementaryDataType extractCharStringType(ParserNode charStringNode) {
		if (charStringNode.getChildren().size() == 1) {
			switch (charStringNode.getChildren().get(0).<String>get(RULE_ATTRIBUTE)) {
				case "single_byte_char_string": {
					return ElementaryDataType.STRING;
				}
				case "double_byte_char_string": {
					return ElementaryDataType.WSTRING;
				}
				default: {
					throw new IllegalArgumentException(STUtil.getIllegalRuleMessage(charStringNode.getChildren().get(0).<String>get(RULE_ATTRIBUTE)));
				}
			}			
		} else {
			throw new RuntimeException("Char string node does not have only one child");
		}
	}
	
	private ElementaryDataType extractTimeLiteralType(ParserNode timeLiteralNode) {
		if (timeLiteralNode.getChildren().size() == 1) {
			ParserNode timeLiteralChildNode = timeLiteralNode.getChildren().get(0);
			switch (timeLiteralChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "duration": {
					return ElementaryDataType.TIME;
				}
				case "time_of_day": {
					return ElementaryDataType.TIME_OF_DAY;
				}
				case "date": {
					return ElementaryDataType.DATE;
				}
				case "date_and_time": {
					return ElementaryDataType.DATE_AND_TIME;
				}
				default: {
					throw new IllegalArgumentException(STUtil.getIllegalRuleMessage(timeLiteralChildNode.<String>get(RULE_ATTRIBUTE)));
				}
			}			
		} else {
			throw new RuntimeException("Time literal node does not have only one child");
		}
	}
	
	private ElementaryDataType extractBitStringType(ParserNode bitStringNode) {
		if (bitStringNode.getChildren().size() == 1) {
			String bitStringLiteral = bitStringNode.get(TOKEN_ATTRIBUTE);
			if (bitStringLiteral.startsWith("BYTE")) {
				return ElementaryDataType.BYTE;
			} else if (bitStringLiteral.startsWith("WORD")) {
				return ElementaryDataType.WORD;
			}else if (bitStringLiteral.startsWith("DWORD")) {
				return ElementaryDataType.DWORD;
			} else if (bitStringLiteral.startsWith("LWORD")) {
				return ElementaryDataType.LWORD;
			} else {
				return ElementaryDataType.UNSET;
			}
		} else {
			throw new RuntimeException("Bit string node does not have only one child");
		}
	}
}
