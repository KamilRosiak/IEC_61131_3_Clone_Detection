package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements;

import java.util.List;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class LDLConnector extends BorderPane {

	private static final double LOWER_PALCEHOLDER_SITE = 35;
	private static final double UPPER_PLACEHOLDER_SIZE = 35;

	/**
	 * constructor with color and mirror property
	 * 
	 * @param color    Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * @param mirrored - if the L should be mirrored or not
	 */
	public LDLConnector(int color, boolean mirrored) {
		this(1, color, mirrored);
	}

	/**
	 * constructor with scale, color and mirror property
	 * 
	 * @param scale    - scale the size of the element (currently unused)
	 * @param color    Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * @param mirrored - if the L should be mirrored or not
	 */
	public LDLConnector(double scale, int color, boolean mirrored) {
		createLayout(scale, color, mirrored);
	}

	/**
	 * creates layout of L Connector of the LD language
	 * 
	 * @param scale    - scale the size of the element (currently unused)
	 * @param color    Color Value, see {@link util.Coloring#coloring(List, int)}.
	 * @param mirrored - if the L should be mirrored or not default values can be
	 *                 found in the String Table
	 */
	private void createLayout(double scale, int color, boolean mirrored) {

		VBox lowerPlaceholder = new VBox();
		lowerPlaceholder.setMinHeight(LOWER_PALCEHOLDER_SITE);
		VBox upperPlaceholder = new VBox();
		upperPlaceholder.setMinHeight(UPPER_PLACEHOLDER_SIZE);

		BorderPane pane = new BorderPane();

		LDVerticalConnector verticalLine = new LDVerticalConnector(0.95, color);
		LDHorizontalConnector horizontalLine = new LDHorizontalConnector(0.5, color);

		if (!mirrored) {
			VBox box = new VBox();
			pane.setTop(upperPlaceholder);
			box.getChildren().addAll(verticalLine, horizontalLine);
			pane.setRight(box);
			pane.setBottom(lowerPlaceholder);
			this.setBottom(pane);
		} else {
			BorderPane linePane = new BorderPane();
			linePane.setBottom(horizontalLine);
			linePane.setRight(verticalLine);
			pane.setLeft(linePane);
			pane.setBottom(lowerPlaceholder);
			this.setBottom(pane);
		}
	}
}
