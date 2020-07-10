package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import java.util.Arrays;
import java.util.List;

import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.AddData;

/**
 * {@code <addData>..</addData>} factory.
 */
@Creatable
@Singleton
public class AddDataFactory {

	/**
	 * @param dataList List with {@code <data>..</data>} elements.
	 * @return {@code <addData>..</addData>}.
	 */
	public AddData createAddData(List<AddData.Data> dataList) {
		AddData addData = new AddData();
		for (AddData.Data data : dataList) {
			addData.getData().add(data);
		}
		return addData;
	}

	/**
	 * @param dataArray Array with {@code <data>..</data>} elements.
	 * @return {@code <addData>..</addData>}.
	 */
	public AddData createAddData(AddData.Data... dataArray) {
		return createAddData(Arrays.asList(dataArray));
	}

}
