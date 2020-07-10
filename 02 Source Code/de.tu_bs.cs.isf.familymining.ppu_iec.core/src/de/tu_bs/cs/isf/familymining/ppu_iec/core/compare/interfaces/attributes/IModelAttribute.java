package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public interface IModelAttribute {
	public ResultElement<Configuration> compare(Configuration modell1, Configuration modell2);
}
