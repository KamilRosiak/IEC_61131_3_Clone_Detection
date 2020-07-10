package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;

/**
 * value pair for the diff that contains a painted element and its row
 * @author Domenik Eichhorn
 *
 */
public class GUIPair {
	public DiagramElement element;
	public int row;
	
	public GUIPair(DiagramElement element, int row) {
		this.element = element;
		this.row = row;
	}
}
