package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.variable;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.commons.LevenstheinDistance;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractVariableAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class VariableNameCompare extends AbstractVariableAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8991008254271729727L;
	public static final String MODUL_NAME = "Variable Name Levensthein Compare";
	public static final String MODUL_DESCRIPTION = "Compares the names of two variables by means of calculating their Levensthein Distance";
	
	public VariableNameCompare() {
		super(MODUL_NAME, MODUL_DESCRIPTION);
	}
	
	@Override
	public ResultElement<Variable>  compare(Variable sourceVar, Variable targetVar, String varType) {
		
		
		float distance = LevenstheinDistance.computeLevenshteinDistance(sourceVar.getName(), targetVar.getName());
		
		float maxWordLength = Math.max(sourceVar.getName().length(), targetVar.getName().length());
		
		float similarity = (1-(distance/maxWordLength)) > 0 ? (1-(distance/maxWordLength)) : 0;
		
		return new ResultElement<Variable> (sourceVar, targetVar, similarity, this);
	}

}
