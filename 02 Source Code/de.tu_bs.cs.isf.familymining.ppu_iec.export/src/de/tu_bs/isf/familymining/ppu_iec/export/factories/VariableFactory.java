package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.VarListPlain;

/**
 * {@code <variable>..</variable>} factory.
 */
@Creatable
@Singleton
public class VariableFactory {

	/**
	 * {@code <type>..</type>} factory.
	 */
	@Inject
	public TypeFactory typeFactory;

	/**
	 * @param var Variable.
	 * @return {@code <variable>..</variable>}.
	 */
	public VarListPlain.Variable createVariable(Variable var) {
		VarListPlain.Variable variable = new VarListPlain.Variable();
		variable.setName(var.getName());
		variable.setType(typeFactory.createDataType(var));
		return variable;
	}

}
