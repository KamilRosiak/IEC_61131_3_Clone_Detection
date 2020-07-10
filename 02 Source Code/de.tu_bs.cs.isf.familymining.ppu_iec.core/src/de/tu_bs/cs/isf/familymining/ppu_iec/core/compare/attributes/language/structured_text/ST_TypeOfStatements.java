package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.language.structured_text;

import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StatementType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;
/**
 * 
 * @author {Alexander Schlie}
 *
 */
public class ST_TypeOfStatements extends AbstractSTLangAttribute {
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "ST Type of Statements";
	public static final String UNIT_DESCRIPTION = "Compares the type of statements of ST implementations.";

	public ST_TypeOfStatements() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<StructuredText>  compare(StructuredText source, StructuredText target) {
		float similarity = 0f;

		
		List<Statement> firstStatements = source.getStatements();
		List<Statement> secondStatements = target.getStatements();
		int[] firstTypes = new int[6];
		int[] secondTypes = new int[6];
		int typesFound = 0;
	
		retrieveTypesOfStatements(firstTypes, firstStatements);
		retrieveTypesOfStatements(secondTypes, secondStatements);

		 
		
		 
		
	
		for (int i=0; i<firstTypes.length; i++) {
			if (Math.max(firstTypes[i], secondTypes[i]) > 0){
				typesFound++;
				similarity += (float)Math.min(firstTypes[i], secondTypes[i]) / Math.max(firstTypes[i], secondTypes[i]);					
			}
		}
		if (typesFound > 0) {
			similarity = similarity / typesFound;				
		}
	
		return new ResultElement<StructuredText> (source, target, similarity ,this);
	}

	/**
	 * Returns the types for a list of ST statements
	 * @param types Array holding 
	 * 			assignments in 0
	 * 			conditionals in 1
	 * 			loops in 2
	 * 			calls in 3
	 * @param statements a list of ST statements
	 */
	private void retrieveTypesOfStatements(int[] types, List<Statement> statements) {
		for (Statement statement : statements) {
			StatementType t = statement.getStatementType();
			switch (t) {
			case ASSIGNMENT: 	types[0]++;
							 	break;
			case CASE: 			types[1]++;
			 					break;
			case IF:			types[1]++;
								break;
			case WHILE:			types[2]++;
								break;
			case REPEAT:		types[2]++;
								break;
			case POU_CALL:		types[3]++;
								break;
			case FUNCTION_CALL:	types[4]++;
								break;
			case UNDEFINED:	    types[5]++;
								break;
			default: 
								break;
			}
		}
	}
}
