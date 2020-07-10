package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.variable;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractVariableAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class VariableScopeCompare extends AbstractVariableAttribute {
	/**
	 * 
	 *  @author Kamil Rosiak
	 */
	private static final long serialVersionUID = 1L;
	public static final String MODUL_NAME = "Scope of Variable";
	public static final String MODUL_DESCRIPTION = "Compares the scope of variables.";
	
	public VariableScopeCompare() {
		super(MODUL_NAME, MODUL_DESCRIPTION);
	}
	
	@Override
	public ResultElement<Variable>  compare(Variable sourceVar, Variable targetVar, String varType) {
		float sim = 0.0f;
		if(sourceVar.getScope().equals(targetVar.getScope())) {
			sim = 1.0f;
		}
		return new ResultElement<Variable> (sourceVar, targetVar, sim, this);
	}
}
