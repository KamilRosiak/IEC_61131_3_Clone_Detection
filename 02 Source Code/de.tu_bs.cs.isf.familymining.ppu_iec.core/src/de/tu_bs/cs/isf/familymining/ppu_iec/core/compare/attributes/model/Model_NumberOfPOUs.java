package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.model;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractModelAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Resource;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

/**
 * 
 * @author Schlie
 *
 */
public class Model_NumberOfPOUs extends AbstractModelAttribute {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "Number of POUs";
	public static final String UNIT_DESCRIPTION = "Calculates the normalized distance between the number of comprised POUs";

	//THE COMPARE ENGINE FIRST EXECUTES THE COMPARE METHODE HERE THEN THE COMPARE METHODE FROM CHILDS
	public Model_NumberOfPOUs() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<Configuration> compare(Configuration modell1, Configuration modell2) {
		
		float modell_1_POUs = retrieveNumberOfPOUs(modell1);
		float modell_2_POUs = retrieveNumberOfPOUs(modell2);
		
		float similarity = ((modell_1_POUs == 0) & modell_1_POUs == modell_2_POUs) ? 0 : (Math.min(modell_1_POUs, modell_2_POUs)/Math.max(modell_1_POUs, modell_2_POUs));
		
		return new ResultElement<Configuration>(modell1, modell2, similarity, this);
	}

	/**
	 * Retrieves for a given project/model/configuration the total number of comprised POUs
	 * @param modell A given project/model/configuration
	 * @return The total number of comprised POUs as an integer value
	 */
	private int retrieveNumberOfPOUs(Configuration modell) {
		
		int pous = 0;
		if (!modell.getResources().isEmpty()) {
			for (Resource res : modell.getResources()) {
				if (!res.getPous().isEmpty()) {
					pous += res.getPous().size();
				}
			}
		}
		return pous;
	}

}
