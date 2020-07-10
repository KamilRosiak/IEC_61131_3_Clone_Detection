package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.model;

import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractModelAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

/**
 * 
 * @author Schlie
 *
 */
public class Model_DataTypeOfGlobalVariables extends AbstractModelAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "Data Type of Global Variables";
	public static final String UNIT_DESCRIPTION = "Compares the data types of the global variables in both projects";


	public Model_DataTypeOfGlobalVariables() {
		super(UNIT_NAME, UNIT_DESCRIPTION);	
	}

	@Override
	public ResultElement<Configuration>  compare(Configuration modell1, Configuration modell2) {
		/*Gets the list of all global variables per model and compares them*/
		
		List<Variable> modell_1_globalvariables = modell1.getGlobalVariables();
		List<Variable> modell_2_globalvariables = modell2.getGlobalVariables();
		
		float similarity = 0f;
		//TODO: Alex i thin its better to say if both are empty return 1.f
		
		if(modell_1_globalvariables.isEmpty() || modell_2_globalvariables.isEmpty()) {
			similarity = 0f;
		} else {
			similarity = compare(modell_1_globalvariables,modell_2_globalvariables);
		}


		
		return new ResultElement<Configuration>(modell1, modell2, similarity, this);
	}

	private float compare(List<Variable> modell_1_globalvariables, List<Variable> modell_2_globalvariables) {
		/*Compares all the elements from the first list modell1_1_globalvariables with every element in the second list
		 modell_2_globalvariables by data type.
		 If the data types are equal, then a full match is recorded.
		 The number of matches is then returned divided by the maximum size of both lists */
		float accumulator = 0f;
		for(int i = 0;i<modell_1_globalvariables.size();i++) {
			for(int j = 0;j<modell_2_globalvariables.size();j++) {
					if(modell_1_globalvariables.get(i).getType().equals(modell_2_globalvariables.get(j).getType())) {
						accumulator += 1f;
						break;
				}
			}
		}
		return accumulator / (Math.max(modell_1_globalvariables.size(),modell_2_globalvariables.size()));
	}

}