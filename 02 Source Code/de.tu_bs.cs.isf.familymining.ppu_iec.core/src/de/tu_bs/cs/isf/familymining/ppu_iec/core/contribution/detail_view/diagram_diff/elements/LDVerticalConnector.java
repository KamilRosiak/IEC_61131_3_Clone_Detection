package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements;

import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.string_table.GDVStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util.Coloring;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;

/**
 * this class represents a vertical connector line for the LD language
 * 
 * @author Domenik Eichhorn, Eike Schmitz, Ziad Alhajjar
 *
 */
public class LDVerticalConnector extends Line {
	private List<Shape> shapes = new ArrayList<Shape>();

	/**
	 * Constructor for line with color.
	 * 
	 * @param color Color Value, see {@link util.Coloring#coloring(List, int)}.
	 */
	public LDVerticalConnector(int color) {
		this(GDVStringTable.DEFAULT_SCALE, color);
	}

	/**
	 * Constructor for line with color and scale.
	 * 
	 * @param scale - scale the size of the element
	 * @param color Color Value, see {@link util.Coloring#coloring(List, int)}.
	 */
	public LDVerticalConnector(double scale, int color) {
		this.setStartX(scale * 50.0);
		this.setStartY(scale * 0.0);
		this.setEndX(scale * 50.0);
		this.setEndY(scale * 75.0);
		shapes.add(this);
		Coloring.coloring(shapes, color);
	}

}
