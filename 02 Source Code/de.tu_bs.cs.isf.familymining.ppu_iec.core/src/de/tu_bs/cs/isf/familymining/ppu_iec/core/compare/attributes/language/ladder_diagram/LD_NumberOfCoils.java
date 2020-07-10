package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.language.ladder_diagram;

import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram.templates.AbstractLDLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementType;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class LD_NumberOfCoils extends AbstractLDLangAttribute {
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "LD Compare Number of Coils";
	public static final String UNIT_DESCRIPTION = "Compares the number of coils in Ladder Diagram implementation";
	
	public LD_NumberOfCoils() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}
	
	@Override
	public ResultElement<Diagram> compare(Diagram source, Diagram target) {
		float similarity = 0f;
		List<Network> sourceElements = source.getNetworks();
		List<Network> targetElements = target.getNetworks();
		
		float a = 0f;
		float b = 0f;
		
		if (!sourceElements.isEmpty() && !targetElements.isEmpty()){
			for (Network network : sourceElements) {
				for (DiagramElement nElement : network.getNetworkElements()) {
					if (nElement instanceof LLElement) {
						if (((LLElement) nElement).getTransitElementType().equals(LLElementType.COIL)) {
							a++;
						}
					}
				}
			}
			for (Network network : targetElements) {
				for (DiagramElement nElement : network.getNetworkElements()) {
					if (nElement instanceof LLElement) {
						if (((LLElement) nElement).getTransitElementType().equals(LLElementType.COIL)) {
							b++;
						}
					}
				}
			}
			similarity = Math.min(a, b) / Math.max(a, b); 
		}
		return new ResultElement<Diagram>(source, target, similarity ,this);
	}
}
	
	
