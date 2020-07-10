package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

/**
 * raw element of a function block that can be extended by other function block
 * elements
 * 
 * @author Domenik Eichhorn, Eike Schmitz, Ziad Alhajjar
 * @deprecated
 */
public class FBRawElement extends BorderPane {

	private final String[] INPUTPARAMETER = { "EN", "IN", "PT" };
	private final String[] OUTPUTPARAMETER = { "Q", "ET" };

	private final String[] INPUTEXP = { "???", "???" };
	private final String[] OUTPUTEXP = { "???" };
	private static final String FB_CSS_LAYOUT = "-fx-background-color: \r\n" + "#000000,\r\n"
			+ "linear-gradient(#7ebcea, #2f4b8f),\r\n" + "linear-gradient(#426ab7, #263e75),\r\n"
			+ "linear-gradient(#9CB2D8, #9CB2D8);\r\n" + "-fx-background-insets: 0,1,1,2;\r\n"
			+ "-fx-background-radius: 2,1,1,1;\r\n" + "-fx-padding: 2 5 2 5;\r\n" + "-fx-text-fill: black;\r\n";
	private String identifier;
	private String[] inputParameter;
	private String[] outputParameter;
	private String[] inputExp;
	private String[] outputExp;
	private int scale;
	private String blockName;

	private final int SPACING_SIZE = 10;
	private final int CONNECTOR_LINE_SIZE = 20;

	/**
	 * 
	 * @param identifier      - that gives the FB a name (e.g. TON)
	 * @param inputParameter  - a string with the name of possible inputs that the
	 *                        FB can have
	 * @param outputParameter a string with the name of possible outputs that the FB
	 *                        can have
	 * @param scale           - Scale
	 * @param blockName       - Name of FB
	 * @param inputExp        Input Expressions
	 * @param outputExp       Output Expressions
	 */
	public FBRawElement(String identifier, String[] inputParameter, String[] outputParameter, int scale,
			String blockName, String[] inputExp, String[] outputExp) {
		this.scale = scale;
		this.blockName = blockName;
		setIdentifier(identifier);
		setInput(inputParameter);
		setOutput(outputParameter);
		setInputExp(inputExp);
		setOutputExp(outputExp);
		createLayout();
	}

	/**
	 * Append expressions to parameters.
	 */
	private void mergeParameterWithExp() {

		if (inputParameter.length >= inputExp.length) {
			for (int i = 0; i < inputExp.length; i++) {

				inputParameter[i] = inputParameter[i] + ":" + inputExp[i];
			}
		} else {

			for (int i = 0; i < inputParameter.length; i++) {
				inputParameter[i] = inputParameter[i] + ":" + inputExp[i];
			}

		}

		if (outputParameter.length >= outputExp.length) {
			for (int i = 0; i < outputExp.length; i++) {
				outputParameter[i] = outputParameter[i] + ":" + outputExp[i];
			}
		} else {

			for (int i = 0; i < outputParameter.length; i++) {
				outputParameter[i] = outputParameter[i] + ":" + outputExp[i];
			}

		}

	}

	private void createLayout() {
		this.setStyle(FB_CSS_LAYOUT);
		mergeParameterWithExp();

		VBox inputBox = new VBox();
		// set input parameter as left element
		inputBox.getChildren().add(new Text(""));
		for (int i = 0; i < inputParameter.length; i++) {
			Text inputText = new Text(inputParameter[i]);
			inputBox.getChildren().add(inputText);
		}

		// set output parameter as left element
		VBox outputBox = new VBox();
		outputBox.getChildren().add(new Text(""));
		for (int i = 0; i < outputParameter.length; i++) {
			Text outputText = new Text(outputParameter[i]);
			outputBox.getChildren().add(outputText);
		}

		this.setLeft(inputBox);
		this.setRight(outputBox);

		VBox centerVbox = new VBox();
		Line titelLine = new Line(0, 0, CONNECTOR_LINE_SIZE, 0);
		HBox spaceHbox = new HBox();
		spaceHbox.getChildren().add(new Text("\t"));
		centerVbox.getChildren().addAll(new Text(identifier), titelLine, spaceHbox);
		this.setCenter(centerVbox);
	}

	private void setIdentifier(String id) {
		this.identifier = id;
	}

	private void setInput(String[] inputs) {
		if (inputs == null) {
			this.inputParameter = INPUTPARAMETER;
		} else {

			this.inputParameter = new String[inputs.length];
			for (int i = 0; i < inputs.length; i++) {
				this.inputParameter[i] = inputs[i];
			}
		}
	}

	private void setOutput(String[] outputs) {
		if (outputs == null) {
			this.outputParameter = OUTPUTPARAMETER;
		} else {
			this.outputParameter = new String[outputs.length];
			for (int i = 0; i < outputs.length; i++) {
				this.outputParameter[i] = outputs[i];
			}
		}
	}

	private void setInputExp(String[] inputArgs) {
		if (inputArgs == null) {
			this.inputExp = INPUTEXP;

		} else {
			this.inputExp = new String[inputArgs.length];
			for (int i = 0; i < inputArgs.length; i++) {
				this.inputExp[i] = inputArgs[i];
			}
		}

	}

	private void setOutputExp(String[] outputArgs) {
		if (outputArgs == null) {
			this.outputExp = OUTPUTEXP;

		} else {
			this.outputExp = new String[outputArgs.length];
			for (int i = 0; i < outputArgs.length; i++) {
				this.outputExp[i] = outputArgs[i];
			}
		}
	}

	public String getIdentifier() {
		return identifier;
	}

	public String[] getInput() {
		return inputParameter;
	}

	public String[] getOutput() {
		return outputParameter;
	}

}
