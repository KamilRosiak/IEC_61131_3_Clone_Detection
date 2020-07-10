package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.ContentHeader.CoordinateInfo.Ld;

/**
 * {@code <ld>..</ld>} factory.
 */
@Creatable
@Singleton
public class LdFactory {

	/**
	 * {@code <scaling>..</scaling>} factory.
	 */
	@Inject
	public ScalingFactory scalingFactory;

	/**
	 * @return {@code <ld>..</ld>}.
	 */
	public Ld createLd() {
		Ld ld = new Ld();
		ld.setScaling(scalingFactory.createLdScaling());
		return ld;
	}
}
