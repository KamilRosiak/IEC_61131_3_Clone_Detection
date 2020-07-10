package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.VarList;

/**
 * {@code <globalVars>..</globalVars>} factory.
 */
@Creatable
@Singleton
public class GlobalVariableFactory {

	/**
	 * {@code <variable>..</variable>}.
	 */
	@Inject
	public VariableFactory variableFactory;

	/**
	 * @param variables List of variables.
	 * @return {@code <globalVars>..</globalVars>}.
	 */
	public VarList createGlobalVariables(List<Variable> variables) {
		VarList varList = new VarList();
		for (Variable variable : variables) {
			varList.getVariable().add(variableFactory.createVariable(variable));
		}
		return varList;
	}

}
