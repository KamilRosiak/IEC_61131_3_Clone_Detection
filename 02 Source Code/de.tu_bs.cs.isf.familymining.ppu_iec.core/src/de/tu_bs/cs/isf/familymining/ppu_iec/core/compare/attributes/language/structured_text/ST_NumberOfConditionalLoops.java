package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.language.structured_text;

import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.If;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StatementType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;
/**
 * 
 * @author {Alexander Schlie}
 *
 */
public class ST_NumberOfConditionalLoops extends AbstractSTLangAttribute {
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "ST Number Of Conditional Loops";
	public static final String UNIT_DESCRIPTION = "Compares the number of IF, ELSE and ELSIF in two ST implementations.";
	
	public ST_NumberOfConditionalLoops() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<StructuredText>  compare(StructuredText source, StructuredText target) {
		float similarity = 0f;
		
		
		/* TYPES OF LOOPS AND LOCATOIN WITHIN ARRAY
		 * 0	IF
		 * 1	ELSE
		 * 2	ELIF
		 */
		int[] firstLoops = new int[3];
		int[] secondLoops = new int[3];
	
		retrieveLoops(firstLoops, source);
		retrieveLoops(secondLoops, target);
	
		int numberOfValidLoops = 0;
		for (int i=0; i<firstLoops.length; i++) {
			if (Math.max(firstLoops[i], secondLoops[i]) > 0){
				numberOfValidLoops++;
				similarity += (float)Math.min(firstLoops[i], secondLoops[i])/Math.max(firstLoops[i], secondLoops[i]);					
			}
		}
		
		similarity = (numberOfValidLoops > 0) ? (similarity / numberOfValidLoops) : 0;
	
		return new ResultElement<StructuredText> (source, target, similarity ,this);
	}

	/**
	 * Returns the conditional types for a list of ST statements
	 * @param types Array holding 
	 * 			IF in 0
	 * 			ELSE in 1
	 * 			ELSIF in 2
	 * @param statements a list of ST statements
	 */
	private void retrieveLoops(int[] types, StructuredText structuredText) {
		
		for (Statement statement : structuredText.getStatements()) {
			if (statement.getStatementType().equals(StatementType.IF)) {
				If ifStatement = (If) statement;
				
				// the first if is mandatory
				types[0]++; 
				
				// count all conditional branches except for the initial if branch
				if (ifStatement.getConditionalBlocks().size() > 1) {
					types[1] += ifStatement.getConditionalBlocks().size() - 1;
				}
				
				// count else 
				if (!ifStatement.getConditionalBlocks().get(ifStatement.getConditionalBlocks().size()-1).isElse()) {
					types[2]++;
				}
			}
		}
		
	}
}
