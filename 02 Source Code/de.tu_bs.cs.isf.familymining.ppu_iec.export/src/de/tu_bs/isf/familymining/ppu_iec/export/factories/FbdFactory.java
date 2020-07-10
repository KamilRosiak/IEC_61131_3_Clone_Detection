package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.ContentHeader.CoordinateInfo.Fbd;

/**
 * {@code <fbd>..</fbd>} factory.
 */
@Creatable
@Singleton
public class FbdFactory {

	/**
	 * {@code <scaling>..</scaling>} factory.
	 */
	@Inject
	public ScalingFactory scalingFactory;

	/**
	 * @return {@code <fbd>..</fbd>}.
	 */
	public Fbd createFbd() {
		Fbd fbd = new Fbd();
		fbd.setScaling(scalingFactory.createFbdScaling());
		return fbd;
	}

}
