package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements;

import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util.Coloring;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util.LayoutText;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;

/**
 * A coil element in LD diagram
 * 
 * @author Domenik Eichhorn, Eike Schmitz, Ziad Alhajjar
 *
 */
public class LDCoil extends BorderPane {
	private List<Shape> shapes = new ArrayList<Shape>();
	@SuppressWarnings("unused")
	private double scale;
	private final int SPACING_SIZE = 10;

	/**
	 * if coil a reset coil element
	 */
	private boolean isReset;

	/**
	 * The top title of element
	 */
	private String title;

	/**
	 * with this constructor color can be specified
	 * 
	 * @param color Color Value, see {@link util.Coloring#coloring(List, int)}.
	 */
	public LDCoil(int color) {
		this(3, "???", false, color);
	}

	/**
	 * with this constructor reset and color could be specified
	 * 
	 * @param _isReset If it is a R-coil
	 * @param color    Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * 
	 */
	public LDCoil(boolean _isReset, int color) {
		this(3, _isReset, color);
	}

	/**
	 * with this constructor titel, reset and color could be specified
	 * 
	 * @param _titel   Titel of coil
	 * @param _isReset If it is a R-coil
	 * @param color    Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * 
	 */
	public LDCoil(String _titel, boolean _isReset, int color) {

		this(3, _titel, _isReset, color);
	}

	/**
	 * with this constructor the title and color could be specified
	 * 
	 * @param _titel Titel of coil
	 * @param color  Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * 
	 */
	public LDCoil(String _title, int color) {
		this(3, _title, color);
	}

	/**
	 * with this constructor the scaling, reset and color could be specified
	 * 
	 * @param scale    double specifies the scaling for the element
	 * @param _isReset If it is a R-coil
	 * @param color    Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * 
	 */
	public LDCoil(double scale, boolean _isReset, int color) {
		this.scale = scale;
		this.isReset = _isReset;
		createLayout(scale, color);
	}

	/**
	 * with this constructor the scaling, title and color could be specified
	 * 
	 * @param scale  double specifies the scaling for the element
	 * @param _titel Titel of coil
	 * @param color  Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * 
	 */
	public LDCoil(double scale, String _titel, int color) {
		this.scale = scale;
		this.title = _titel;
		createLayout(scale, color);
	}

	/**
	 * with this constructor the scaling, title and color could be specified
	 * 
	 * @param scale  double specifies the scaling for the element
	 * @param _titel Titel of coil
	 * @param color  Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * 
	 */
	public LDCoil(boolean _isReset, String _titel, int color) {
		this(3, _titel, _isReset, color);
	}

	/**
	 * with this constructor the scaling, reset title and color could be specified
	 * 
	 * @param scale    double specifies the scaling for the element
	 * @param _isReset If it is a R-coil
	 * @param _titel   Titel of coil
	 * @param color    Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * 
	 */
	public LDCoil(double scale, String _titel, boolean _isReset, int color) {
		this.scale = scale;
		this.isReset = _isReset;
		this.title = _titel;
		createLayout(scale, color);
	}

	/**
	 * createLayout method creates the elements and sets them in to the H-Box layout
	 * 
	 * @param scale double creates elements with given scaling
	 * @param color Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * 
	 */
	private void createLayout(double scale, int color) {
		HBox h = new HBox();
		Text text = new Text(title);
		text = LayoutText.setTextSize(text);
		Ellipse ellipseRight = new Ellipse(0, 0, 1 * scale, 8 * scale);
		shapes.add(text);
		ellipseRight.setFill(Color.TRANSPARENT);
		shapes.add(ellipseRight);
		Ellipse ellipseLeft = new Ellipse(0, 0, 1 * scale, 8 * scale);
		ellipseLeft.setFill(Color.TRANSPARENT);
		shapes.add(ellipseLeft);
		if (isReset) {
			Text r = new Text("\nR");
			shapes.add(r);
			Coloring.coloring(shapes, color);
			h.getChildren().addAll(ellipseLeft, r, ellipseRight);
			h.setSpacing(SPACING_SIZE - 1 * scale);
		} else {
			Coloring.coloring(shapes, color);
			h.getChildren().addAll(ellipseLeft, ellipseRight);
			h.setSpacing(SPACING_SIZE * scale);
		}
		this.setCenter(h);
		this.setTop(text);
		text.setStrokeWidth(0.5);
	}

	public void setIsReset(boolean r) {
		this.isReset = r;
	}

}
