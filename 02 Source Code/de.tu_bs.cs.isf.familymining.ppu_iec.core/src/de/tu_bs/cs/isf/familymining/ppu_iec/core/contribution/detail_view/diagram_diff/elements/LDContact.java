package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements;

import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.string_table.GDVStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util.Coloring;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util.LayoutText;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;

/**
 * this class represents a Contact element for the LD language, as well as a
 * negated contact element
 * 
 * @author Domenik Eichhorn, Eike Schmitz, Ziad Alhajjar
 *
 */
public class LDContact extends BorderPane {

	private boolean negated;
	@SuppressWarnings("unused")
	private double scale;
	private String title;
	private List<Shape> shapes = new ArrayList<Shape>();

	/**
	 * this is the default constructor for a contact element
	 * 
	 * @param color Color Value, see {@link util.Coloring#coloring(List, int)}.
	 */
	public LDContact(int color) {
		this(GDVStringTable.DEFAULT_SCALE, "???", false, color);
	}

	/**
	 * this constructor specifies whether it is a contact or a negated contact
	 * 
	 * 
	 * @param color Color Value, see {@link util.Coloring#coloring(List, int)}.
	 */
	public LDContact(boolean negated, int color) {
		this(GDVStringTable.DEFAULT_SCALE, negated, color);
	}

	/**
	 * this constructor specifies whether it is a contact or a negated contact, with
	 * color and title.
	 * 
	 * @param title   the title of element.
	 * @param negated true for a negated contact element, false for a contact
	 *                element
	 * @param color   Color Value, see {@link util.Coloring#coloring(List, int)}.
	 */
	public LDContact(String title, boolean negated, int color) {
		this(GDVStringTable.DEFAULT_SCALE, title, negated, color);
	}

	/**
	 * with this constructor the scaling can be specified
	 * 
	 * @param scale   double specifies the scaling for the element
	 * @param negated true for negated contact element, false for contact element
	 * @param color   Color Value, see {@link util.Coloring#coloring(List, int)}.
	 */
	public LDContact(double scale, boolean negated, int color) {
		// super(scale * 30); //spacing
		this.scale = scale;
		this.negated = negated;
		createLayout(scale, color);
	}

	/**
	 * with this constructor the scaling can be specified
	 * 
	 * @param scale double specifies the scaling for the element
	 * @param title the title of element
	 * @param color Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * 
	 */
	public LDContact(double scale, String title, int color) {
		// super(scale * 30); //spacing
		this.title = title;
		createLayout(scale, color);
	}

	/**
	 * with this constructor the scaling can be specified
	 * 
	 * @param scale   double specifies the scaling for the element
	 * @param negated true for negated contact element, false for contact element
	 * @param title   the title of element
	 * @param color   Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * 
	 */
	public LDContact(double scale, String title, boolean negated, int color) {
		// super(scale * 30); //spacing
		this.scale = scale;
		this.negated = negated;
		this.title = title;
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
		double width = 10;
		double height = 50;
		Text text = new Text(title);
		text = LayoutText.setTextSize(text);
		Rectangle rectangleLeft = new Rectangle(width * scale, height * scale);
		rectangleLeft.setFill(Color.TRANSPARENT);
		shapes.add(rectangleLeft);
		Rectangle rectangleRight = new Rectangle(width * scale, height * scale);
		rectangleRight.setFill(Color.TRANSPARENT);
		shapes.add(rectangleRight);
		shapes.add(text);
		if (negated == true) {
			Line line = new Line(10 * scale, 100 * scale, 26 * scale, 50 * scale);
			h.setSpacing(3 * scale);
			shapes.add(line);
			Coloring.coloring(shapes, color);
			h.getChildren().addAll(rectangleLeft, line, rectangleRight);
		} else {
			Coloring.coloring(shapes, color);
			h.getChildren().addAll(rectangleLeft, rectangleRight);
			h.setSpacing(25 * scale);
		}
		this.setCenter(h);
		this.setTop(text);
		setAlignment(text, Pos.TOP_CENTER);
		text.setStrokeWidth(0.5);

	}

}