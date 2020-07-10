package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public interface ILDImplAttribute {
	
	public ResultElement<DiagramElement> compare(LLElement source, LLElement target);
}
