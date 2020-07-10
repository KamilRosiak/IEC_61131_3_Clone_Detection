package de.tu_bs.isf.familymining.ppu_iec.export.components.selection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.isf.familymining.ppu_iec.export.exporter.PLCOpenXmlExporter;

/**
 * Represents a selection made on a Family Model with the intention of exporting
 * the selected items via {@link PLCOpenXmlExporter}.
 * 
 * @author Fabian Ochmann
 */
public class FMSelection {

	private final List<POU> pous = new LinkedList<>();
	private final List<Variable> globalVariables = new LinkedList<>();
	private final Map<POU, List<Variable>> localVariableMap = new HashMap<>();
	private final Map<POU, List<Variable>> inputVariableMap = new HashMap<>();
	private final Map<POU, List<Variable>> outputVariableMap = new HashMap<>();

	/**
	 * A list of the selected POUs to be exported.
	 * 
	 * @return A list of the selected POUs to be exported.
	 */
	public List<POU> getPous() {
		return pous;
	}

	/**
	 * Adds a POU to the list of selected POUs
	 * 
	 * @param pou The POU to add to the list
	 */
	public void addPou(POU pou) {
		this.pous.add(pou);
	}

	/**
	 * A list of the selected global Variables to be exported.
	 * 
	 * @return A list of the selected global Variables to be exported.
	 */
	public List<Variable> getGlobalVariables() {
		return globalVariables;
	}

	/**
	 * A list of the selected local Variables to be exported as part of the given
	 * POU.
	 * 
	 * @param pou The POU under which the local Variables should be exported
	 * @return A List of Variables that should be exported under the given POU
	 */
	public List<Variable> getLocalVariables(POU pou) {
		List<Variable> localVariables = this.localVariableMap.get(pou);
		if (localVariables == null) {
			localVariables = new LinkedList<>();
			this.localVariableMap.put(pou, localVariables);
		}
		return localVariables;
	}
	
	/**
	 * A list of the selected input Variables to be exported as part of the given
	 * POU.
	 * 
	 * @param pou The POU under which the local Variables should be exported
	 * @return A List of Variables that should be exported under the given POU
	 */
	public List<Variable> getInputVariables(POU pou) {
		List<Variable> inputVariables = this.inputVariableMap.get(pou);
		if (inputVariables == null) {
			inputVariables = new LinkedList<>();
			this.inputVariableMap.put(pou, inputVariables);
		}
		return inputVariables;
	}
	
	/**
	 * A list of the selected output Variables to be exported as part of the given
	 * POU.
	 * 
	 * @param pou The POU under which the local Variables should be exported
	 * @return A List of Variables that should be exported under the given POU
	 */
	public List<Variable> getOutputVariables(POU pou) {
		List<Variable> outputVariables = this.outputVariableMap.get(pou);
		if (outputVariables == null) {
			outputVariables = new LinkedList<>();
			this.outputVariableMap.put(pou, outputVariables);
		}
		return outputVariables;
	}
}
