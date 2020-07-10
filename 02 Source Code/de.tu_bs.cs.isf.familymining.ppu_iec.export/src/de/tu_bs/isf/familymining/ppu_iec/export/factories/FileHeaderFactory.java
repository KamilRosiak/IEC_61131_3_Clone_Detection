package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import java.util.Date;

import javax.inject.Singleton;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;

import de.tu_bs.isf.familymining.ppu_iec.export.constants.XmlDataTable;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.FileHeader;

/**
 * {@code <fileHeader>..</fileHeader>} factory.
 */
@Creatable
@Singleton
public class FileHeaderFactory {

	/**
	 * @return {@code <fileHeader>..</fileHeader>}.
	 */
	public FileHeader createFileHeader() {
		FileHeader fileHeader = new FileHeader();
		fileHeader.setCompanyName(XmlDataTable.COMPANY_NAME);
		fileHeader.setProductName(XmlDataTable.PRODUCT_NAME);
		fileHeader.setProductVersion(XmlDataTable.PRODUCT_VERSION);
		XMLGregorianCalendar calendar = new XMLCalendar(new Date(), Short.parseShort("1"));
		fileHeader.setCreationDateTime(calendar);
		return fileHeader;
	}

}
