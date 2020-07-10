package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.Types;

/**
 * {@code <types>..</types>} factory.
 */
@Creatable
@Singleton
public class TypesFactory {

	/**
	 * {@code <dataTypes>..</dataTypes>} factory.
	 */
	@Inject
	public DataTypesFactory dataTypesFactory;

	/**
	 * {@code <pous>..</pous>} factory.
	 */
	@Inject
	public PousFactory pouTypesFactory;

	/**
	 * @return {@code <types>..</types>}.
	 */
	public Types createTypes() {
		Types types = new Types();
		types.setDataTypes(dataTypesFactory.createDataTypes());
		types.setPous(pouTypesFactory.createPouTypes());
		return types;
	}

}
