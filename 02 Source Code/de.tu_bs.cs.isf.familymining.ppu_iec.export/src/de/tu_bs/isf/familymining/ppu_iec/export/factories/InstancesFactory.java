package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.Instances;

/**
 * {@code <instances>..</instances>} factory.
 */
@Creatable
@Singleton
public class InstancesFactory {

	/**
	 * {@code <configurations>..</configurations>} factory.
	 */
	@Inject
	public ConfigurationsFactory configurationsFactory;

	/**
	 * @return {@code <instances>..</instances>}.
	 */
	public Instances createInstances() {
		Instances instances = new Instances();
		instances.setConfigurations(configurationsFactory.createConfigurations());
		return instances;
	}

}
