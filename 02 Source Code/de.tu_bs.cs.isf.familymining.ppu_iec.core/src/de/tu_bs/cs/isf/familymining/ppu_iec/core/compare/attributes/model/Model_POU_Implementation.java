package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.model;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractModelAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class Model_POU_Implementation extends AbstractModelAttribute {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 119095714130805799L;
	public static final String UNIT_NAME = "POU Comparisons";
	public static final String UNIT_DESCRIPTION = "Contains all POU comparisons";
	
	public Model_POU_Implementation() {
		super(UNIT_NAME, UNIT_DESCRIPTION);

	}
	

	@Override
	public ResultElement<Configuration> compare(Configuration modell1, Configuration modell2) {
		return new ResultElement<Configuration>(modell1, modell2, 0f, this);
	}

}
