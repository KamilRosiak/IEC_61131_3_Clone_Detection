package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;

import de.tu_bs.isf.familymining.ppu_iec.export.constants.XmlDataTable;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.ContentHeader;

/**
 * {@code <contentHeader>..</contentHeader>} factory.
 */
@Creatable
@Singleton
public class ContentHeaderFactory {

	/**
	 * {@code <coordinateInfo>..</coordinateInfo>} factory.
	 */
	@Inject
	public CoordinateInfoFactory coordinateInfoFactory;

	/**
	 * {@code <addData>..</addData>} factory.
	 */
	@Inject
	public AddDataFactory addDataFactory;

	/**
	 * {@code <data>..</data>} factory.
	 */
	@Inject
	public DataFactory dataFactory;

	/**
	 * @param scenarioName Name attribute in content header.
	 * @return {@code <contentHeader>..</contentHeader>}.
	 */
	public ContentHeader createContentHeader(String scenarioName) {
		ContentHeader contentHeader = new ContentHeader();
		contentHeader.setName(scenarioName);
		XMLGregorianCalendar calendar = new XMLCalendar(new Date(), Short.parseShort("1"));
		contentHeader.setModificationDateTime(calendar);
		contentHeader.setCoordinateInfo(coordinateInfoFactory.createCoordinateInfo());
		contentHeader.setAddData(addDataFactory.createAddData(dataFactory.createData(null,
				XmlDataTable.PROJECT_INFORMATION_DATA, XmlDataTable.HANDLE_UNKNOWN_IMPLEMENTATION)));
		return contentHeader;
	}

}
