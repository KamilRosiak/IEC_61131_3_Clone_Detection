package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.empty;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class EmptyActionAttr extends  AbstractPOUAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 119095714130805799L;
	public static final String ATTRIBUTE_NAME = "Empty Action Attribute";
	public static final String ATTRIBUTE_DESCRIPTION = "If POU has no actions.";
	
	public EmptyActionAttr() {
		super(ATTRIBUTE_NAME, ATTRIBUTE_DESCRIPTION);
	}

	@Override
	public ResultElement<POU> compare(POU sourcePOU, POU targetPOU) {
		return new ResultElement<POU>(sourcePOU, targetPOU, 1.0f, this);
	}




	


}
