package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.Types.Pous;

/**
 * {@code <pous>..</pous>} factory.
 */
@Creatable
@Singleton
public class PousFactory {

	/**
	 * @return {@code <pous>..</pous>}.
	 */
	public Pous createPouTypes() {
		Pous pous = new Pous();
		return pous;
	}
}
