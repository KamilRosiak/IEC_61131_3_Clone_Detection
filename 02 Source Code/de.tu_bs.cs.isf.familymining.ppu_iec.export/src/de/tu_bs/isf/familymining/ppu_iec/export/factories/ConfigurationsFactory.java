package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.Instances.Configurations;

/**
 * {@code <configurations>..</configurations>} factory.
 */
@Creatable
@Singleton
public class ConfigurationsFactory {

	/**
	 * @return {@code <configurations>..</configurations>}.
	 */
	public Configurations createConfigurations() {
		Configurations configurations = new Configurations();
		return configurations;
	}

}
