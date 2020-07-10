package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.sfc_diff.util;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
/**
 * This class represents a JavaFX representation of an SFCStep.
 * @author {Kamil Rosiak}
 *
 */
public class SFCStepFX extends VBox {
	public static final double STEP_WIDTH = 250d;
	public static final double STEP_HEIGHT = 30d;
	private Label stepName;

	public SFCStepFX(String name) {
		init();
		setStepName(name);
	}
	
	public void init() {
		setStepStyle("step");
		createLabel();
		setSize(STEP_WIDTH, STEP_HEIGHT);
		setAlignment(Pos.CENTER);
	}
	/**
	 * This method sets the style of this SFCStepFX based on defined style in the CSS file.
	 * @param style "step" "initialstep" ..
	 */
	public void setStepStyle(String style) {
		getStyleClass().clear();
		getStyleClass().add(style);
	}
	
	/**
	 * This method creates a label for the name.
	 */
	private void createLabel() {
		stepName = new Label();
		stepName.setAlignment(Pos.CENTER);
		getChildren().add(stepName);	
	}
	/**
	 * This method sets the name label of the SFCStepFX.
	 * @param name
	 */
	public void setStepName(String name) {
		stepName.setText(name);
	}
	
	/**
	 * This method sets the size of an SFCStepFX.
	 * @param width
	 * @param height
	 */
	public void setSize(double width, double height) {
		setMinHeight(height);
		setMaxHeight(height);
		setMinWidth(width);
		setMaxWidth(width);
	}

}
