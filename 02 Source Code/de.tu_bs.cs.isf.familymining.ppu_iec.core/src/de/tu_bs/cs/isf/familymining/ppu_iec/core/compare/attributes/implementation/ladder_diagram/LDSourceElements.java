package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.ladder_diagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram.templates.AbstractLDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.ld.DiagramCompareUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class LDSourceElements extends AbstractLDImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "LD Source Elements";
	public static final String UNIT_DESCRIPTION = "Compares the types of incoming elements.";
	
	public LDSourceElements() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<DiagramElement> compare(LLElement source, LLElement target) {
		if(source.getSourceElements().isEmpty() && target.getSourceElements().isEmpty()) {
			return null;
		}
		
		float similarity = DiagramCompareUtil.compareInOutElements(source.getSourceElements(), target.getSourceElements());
	    return new ResultElement<DiagramElement>(source, target, similarity, this);
	}
}
