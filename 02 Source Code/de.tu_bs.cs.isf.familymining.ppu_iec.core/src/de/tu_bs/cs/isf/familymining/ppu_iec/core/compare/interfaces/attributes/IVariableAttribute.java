package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes;


import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public interface IVariableAttribute {
	public ResultElement<Variable> compare(Variable sourceVar, Variable targetVar, String varType);
}
