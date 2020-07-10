package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public interface IPOUAttribute {
	public  ResultElement<POU> compare(POU sourcePOU, POU targetPOU);

}