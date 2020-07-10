package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.language.structured_text;

import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.IfImpl;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;
/**
 * 
 * @author {Alexander Schlie}
 *
 */
public class ST_NumberIFConditions extends AbstractSTLangAttribute {
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "ST Number Of Conditions in IF";
	public static final String UNIT_DESCRIPTION = "Compares the number of conditions in IF statements in ST implementations.";
	
	public ST_NumberIFConditions() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<StructuredText> compare(StructuredText source, StructuredText target) {
		float similarity = 0f;
		
		List<Statement> firstStatements = source.getStatements();
		List<Statement> secondStatements = target.getStatements();
		
		int conditionsInFirst = getNumberOfConditions(firstStatements);
		int conditionsInSecond = getNumberOfConditions(secondStatements);		
		
		if (Math.max(conditionsInFirst, conditionsInSecond) > 0) {
			similarity = (float) Math.min(conditionsInFirst, conditionsInSecond) / Math.max(conditionsInFirst, conditionsInSecond);
		}
		
		return new ResultElement<StructuredText> (source, target, similarity ,this);
	}

	/**
	 * Return the number of conditions in all IF statements
	 * @param firstStatements
	 * @return
	 */
	private int getNumberOfConditions(List<Statement> statements) {
		int counter = 0;
		
		for (Statement statement : statements) {
			if (statement instanceof IfImpl) {
				IfImpl statementIF = (IfImpl) statement;
				if (!statementIF.getConditionalBlocks().isEmpty()) {
					counter += statementIF.getConditionalBlocks().size();
				}
			}
		}
		return counter;
	}

}
