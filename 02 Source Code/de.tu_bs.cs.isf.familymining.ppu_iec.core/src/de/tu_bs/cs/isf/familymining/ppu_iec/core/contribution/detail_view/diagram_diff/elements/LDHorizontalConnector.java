package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements;

import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.string_table.GDVStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util.Coloring;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;

/**
 * this class represents a horizontal connector line for the LD language
 * 
 * @author Domenik Eichhorn, Eike Schmitz, Ziad Alhajjar
 *
 */
public class LDHorizontalConnector extends Line {
	private List<Shape> shapes = new ArrayList<Shape>();

	/**
	 * calling the constructor with empty input will add default start and end
	 * values (should only be done when the line is the first element that is
	 * created)
	 * 
	 * @param color Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * 
	 */
	public LDHorizontalConnector(int color) {
		this(GDVStringTable.DEFAULT_SCALE, color);
	}

	/**
	 * calling the constructor with empty input will add default start and end
	 * values (should only be done when the line is the first element that is
	 * created)
	 * 
	 * @param scale for line size
	 * @param color Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * 
	 */
	public LDHorizontalConnector(double scale, int color) {
		this.setStartX(scale * 0.0);
		this.setStartY(scale * 50.0);
		this.setEndX(scale * 100.0);
		this.setEndY(scale * 50.0);
		shapes.add(this);
		Coloring.coloring(shapes, color);
	}

}
