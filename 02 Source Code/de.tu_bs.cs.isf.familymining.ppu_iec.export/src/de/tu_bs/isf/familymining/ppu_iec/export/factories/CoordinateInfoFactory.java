package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.ContentHeader.CoordinateInfo;

/**
 * {@code <coordinateInfo>..</coordinateInfo>} factory.
 */
@Creatable
@Singleton
public class CoordinateInfoFactory {

	/**
	 * {@code <fbd>..</fbd>} factory.
	 */
	@Inject
	public FbdFactory fbdFactory;

	/**
	 * {@code <sfc>..</sfc>} factory.
	 */
	@Inject
	public SfcFactory sfcFactory;

	/**
	 * {@code <ld>..</ld>} factory.
	 */
	@Inject
	public LdFactory ldFactory;

	/**
	 * @return {@code <coordinateInfo>..</coordinateInfo>}.
	 */
	public CoordinateInfo createCoordinateInfo() {
		CoordinateInfo coordinateInfo = new CoordinateInfo();
		coordinateInfo.setFbd(fbdFactory.createFbd());
		coordinateInfo.setLd(ldFactory.createLd());
		coordinateInfo.setSfc(sfcFactory.createSfc());
		return coordinateInfo;
	}

}
