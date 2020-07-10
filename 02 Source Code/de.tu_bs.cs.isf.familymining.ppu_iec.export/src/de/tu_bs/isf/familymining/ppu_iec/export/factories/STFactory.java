package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.FormattedText;

/**
 * {@code <ST>..</ST>} factory.
 */
@Creatable
@Singleton
public class STFactory {

	/**
	 * @return {@code <ST>..</ST>};
	 */
	public FormattedText createST() {
		FormattedText st = new FormattedText();
		return st;
	}
}
