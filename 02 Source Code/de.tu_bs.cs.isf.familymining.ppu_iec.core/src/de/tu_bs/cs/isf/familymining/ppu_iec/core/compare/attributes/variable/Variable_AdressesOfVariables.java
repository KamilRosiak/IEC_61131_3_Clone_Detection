package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.variable;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractVariableAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.VariableLocationDataType;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class Variable_AdressesOfVariables extends AbstractVariableAttribute {
	/**
	 * 
	 *  @author Bougouffa
	 */
	private static final long serialVersionUID = 1L;
	public static final String MODUL_NAME = "Adresses of Variables";
	public static final String MODUL_DESCRIPTION = "Compares the location of two variables";
	
	public Variable_AdressesOfVariables() {
		super(MODUL_NAME, MODUL_DESCRIPTION);
	}
	
	@Override
	public ResultElement<Variable> compare(Variable sourceVar, Variable targetVar, String varType) {
		/*Uses getLocation() to get the Location of both attributes of the POUs and compares them*/
		float sim = 0.0f;

		//TODO: I think that this attribute dont compares the variables location just a reference of the Location objects this returns for each pair false.  
		//TODO: Verify me alex :P greetings kamil 
		/** old impl
		if(sourceVar.getLocation().equals(targetVar.getLocation())) {
			sim = 1.0f;
		}
		 */
		
		//new impl 
		VariableLocationDataType sourceLocation = sourceVar.getLocation().getDataType();
		VariableLocationDataType targetLocation = targetVar.getLocation().getDataType();
		
		if(sourceLocation.equals(targetLocation)) {
			sim = 1.0f;
		}
		return new ResultElement<Variable> (sourceVar, targetVar, sim, this);
	}

}
