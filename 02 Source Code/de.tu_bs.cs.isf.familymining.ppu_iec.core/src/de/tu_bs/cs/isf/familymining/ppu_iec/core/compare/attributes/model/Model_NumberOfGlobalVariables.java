package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.model;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractModelAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

/**
 * 
 * @author Bougouffa
 *
 */
public class Model_NumberOfGlobalVariables extends AbstractModelAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "Number of Global Variables";
	public static final String UNIT_DESCRIPTION = "Evaluates if the projects have the same the number of global variables";

	public Model_NumberOfGlobalVariables() {
		super(UNIT_NAME, UNIT_DESCRIPTION);	
	}

	@Override
	public ResultElement<Configuration> compare(Configuration modell1, Configuration modell2) {
		/*Gets the int number of global variables per model and compares them*/
		
		int modell_1_globalvariables = modell1.getResources().get(0).getGlobalVariables().size();
		int modell_2_globalvariables = modell2.getResources().get(0).getGlobalVariables().size();
		
		float similarity = 0f;
		
		if(modell_1_globalvariables == modell_2_globalvariables) {
			similarity = 1f;
		}
		
		return new ResultElement<Configuration>(modell1, modell2, similarity, this);
	}

}