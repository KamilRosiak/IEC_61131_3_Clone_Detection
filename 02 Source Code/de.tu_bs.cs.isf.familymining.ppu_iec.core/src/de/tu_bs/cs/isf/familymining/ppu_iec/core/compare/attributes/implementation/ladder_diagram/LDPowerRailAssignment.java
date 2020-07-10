package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.ladder_diagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram.templates.AbstractLDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementType;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class LDPowerRailAssignment extends AbstractLDImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "LD Power Rail Assignment";
	public static final String UNIT_DESCRIPTION = "This Attribute assigns the left an right power rail a mandatory value.";
	
	public LDPowerRailAssignment() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<DiagramElement> compare(LLElement source, LLElement target) {
		if(source.getTransitElementType().equals(LLElementType.LEFT_POWERRAIL) && target.getTransitElementType().equals(LLElementType.LEFT_POWERRAIL)) {
			return new ResultElement<DiagramElement>(source,target, 1f, this);
		} else if(source.getTransitElementType().equals(LLElementType.RIGHT_POWERRAIL) && target.getTransitElementType().equals(LLElementType.RIGHT_POWERRAIL)) {
			return new ResultElement<DiagramElement>(source,target, 1f, this);
		}
		return null;
	}
}
