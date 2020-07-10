package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.pou;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class POU_Implementation extends AbstractPOUAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6235038386043504841L;
	public static final String MODUL_NAME = "POU Implementation";
	public static final String MODUL_DESCRIPTION = "Compares the implementaiton of POUs";
	
	public POU_Implementation() {
		super(MODUL_NAME, MODUL_DESCRIPTION);
	}

	@Override
	public ResultElement<POU> compare(POU pou1, POU pou2) {
		return new ResultElement<POU>(pou1, pou2, 0.0f, this);
	}
}
