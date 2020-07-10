package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.Types.Pous.Pou.Interface.InputVars;

/**
 * {@code <inputVars>..</inputVars>} factory.
 */
@Creatable
@Singleton
public class InputVariableFactory {

	/**
	 * {@code <variable>..</variable>} factory.
	 */
	@Inject
	public VariableFactory variableFactory;

	/**
	 * @param variables List of variables.
	 * @return {@code <inputVars>..</inputVars>}.
	 */
	public InputVars createInputVariables(List<Variable> variables) {
		InputVars varList = new InputVars();
		for (Variable variable : variables) {
			varList.getVariable().add(variableFactory.createVariable(variable));
		}
		return varList;
	}

}
