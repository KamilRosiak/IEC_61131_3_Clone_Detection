package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.empty;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractModelAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class EmptyModelAttr extends  AbstractModelAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 119095714130805799L;
	public static final String ATTRIBUTE_NAME = "Empty Model Attribute";
	public static final String ATTRIBUTE_DESCRIPTION = "If model has no POUs.";
	
	public EmptyModelAttr() {
		super(ATTRIBUTE_NAME, ATTRIBUTE_DESCRIPTION);
	}
	
	@Override
	public ResultElement<Configuration> compare(Configuration modell1, Configuration modell2) {
		return new ResultElement<Configuration>(modell1, modell2, 1.0f, this);
	}

}
