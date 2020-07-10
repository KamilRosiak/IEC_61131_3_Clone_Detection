package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.isf.familymining.ppu_iec.export.constants.XmlDataTable;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.ContentHeader.CoordinateInfo.Fbd;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.ContentHeader.CoordinateInfo.Ld;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.ContentHeader.CoordinateInfo.Sfc;

/**
 * {@code <scaling>..</scaling>} factory.
 */
@Creatable
@Singleton
public class ScalingFactory {

	/**
	 * @return {@code <scaling>..</scaling>} for {@code <fbd>..</fbd>} element.
	 */
	public Fbd.Scaling createFbdScaling() {
		Fbd.Scaling scaling = new Fbd.Scaling();
		scaling.setX(XmlDataTable.FBD_X);
		scaling.setY(XmlDataTable.FBD_Y);
		return scaling;
	}

	/**
	 * @return {@code <scaling>..</scaling>} for {@code <ld>..</ld>} element.
	 */
	public Ld.Scaling createLdScaling() {
		Ld.Scaling scaling = new Ld.Scaling();
		scaling.setX(XmlDataTable.LD_X);
		scaling.setY(XmlDataTable.LD_Y);
		return scaling;
	}

	/**
	 * @return {@code <scaling>..</scaling>} for {@code <sfc>..</sfc>} element.
	 */
	public Sfc.Scaling createSfcScaling() {
		Sfc.Scaling scaling = new Sfc.Scaling();
		scaling.setX(XmlDataTable.SFC_X);
		scaling.setY(XmlDataTable.SFC_Y);
		return scaling;
	}

}
