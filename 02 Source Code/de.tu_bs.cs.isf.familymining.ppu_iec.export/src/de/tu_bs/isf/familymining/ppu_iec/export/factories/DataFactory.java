package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.AddData;

/**
 * {@code <data>..</data>} factory.
 */
@Creatable
@Singleton
public class DataFactory {

	/**
	 * @param any           inner element.
	 * @param name          name attribute.
	 * @param handleUnknown handleUnknown attribute.
	 * @return {@code <data>..</data>}.
	 */
	public AddData.Data createData(Object any, String name, String handleUnknown) {
		AddData.Data data = new AddData.Data();
		data.setHandleUnknown(handleUnknown);
		data.setName(name);
		data.setAny(any);
		return data;
	}

}
