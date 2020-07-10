package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.Types.Pous.Pou.Interface;

/**
 * {@code <interface>..</interface>} factory.
 */
@Creatable
@Singleton
public class InterfaceFactory {

	/**
	 * {@code <localVars>..</localVars>} factory.
	 */
	@Inject
	public LocalVariableFactory localVariableFactory;

	/**
	 * {@code <inputVars>..</inputVars>} factory.
	 */
	@Inject
	public InputVariableFactory inputVariableFactory;

	/**
	 * {@code <outputVars>..</outputVars>} factory.
	 */
	@Inject
	public OutputVariableFactory outputVariableFactory;

	/**
	 * @param localVariables  List of local variables.
	 * @param inputVariables  List of input variables.
	 * @param outputVariables List of output variables.
	 * @return {@code <interface>..</interface>}.
	 */
	public Interface createInterface(List<Variable> localVariables, List<Variable> inputVariables,
			List<Variable> outputVariables) {
		Interface in = new Interface();
		
		if(!localVariables.isEmpty()) {
			in.getLocalVarsOrTempVarsOrInputVars().add(localVariableFactory.createLocalVariables(localVariables));			
		}
		if(!inputVariables.isEmpty()) {			
			in.getLocalVarsOrTempVarsOrInputVars().add(inputVariableFactory.createInputVariables(inputVariables));
		}
		if(!outputVariables.isEmpty()) {
			in.getLocalVarsOrTempVarsOrInputVars().add(outputVariableFactory.createOutputVariables(outputVariables));			
		}
		
		return in;
	}

}
