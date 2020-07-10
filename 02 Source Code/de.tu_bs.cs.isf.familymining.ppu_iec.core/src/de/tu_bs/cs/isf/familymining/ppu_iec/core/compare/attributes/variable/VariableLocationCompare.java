package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.variable;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractVariableAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Location;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class VariableLocationCompare extends AbstractVariableAttribute {
	/**
	 * 
	 *  @author Kamil Rosiak
	 */
	private static final long serialVersionUID = 1L;
	public static final String MODUL_NAME = "DataLocation of Variable";
	public static final String MODUL_DESCRIPTION = "Compares the data location of variables.";
	
	public VariableLocationCompare() {
		super(MODUL_NAME, MODUL_DESCRIPTION);
	}
	
	@Override
	public ResultElement<Variable>  compare(Variable sourceVar, Variable targetVar, String varType) {
		Location sourceLocation = sourceVar.getLocation();
		Location targetLoaction = targetVar.getLocation();
		
		boolean isDataTypeEquals = sourceLocation.getDataType().equals(targetLoaction.getDataType());
		boolean isTypeEquals = sourceLocation.getType().equals(targetLoaction.getType());
		
		if(isDataTypeEquals || isTypeEquals) {
			if(isDataTypeEquals && isTypeEquals) {
				return new ResultElement<Variable> (sourceVar, targetVar, 1f, this);
			}
			return new ResultElement<Variable> (sourceVar, targetVar, 0.5f, this);
		}
		return new ResultElement<Variable> (sourceVar, targetVar, 0f, this);
	}
	
}
