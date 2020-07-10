package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.Types.DataTypes;

/**
 * {@code <dataTypes>..</dataTypes>} factory.
 */
@Creatable
@Singleton
public class DataTypesFactory {

	/**
	 * @return {@code <dataTypes>..</dataTypes>}.
	 */
	public DataTypes createDataTypes() {
		DataTypes dataTypes = new DataTypes();
		return dataTypes;
	}

}
