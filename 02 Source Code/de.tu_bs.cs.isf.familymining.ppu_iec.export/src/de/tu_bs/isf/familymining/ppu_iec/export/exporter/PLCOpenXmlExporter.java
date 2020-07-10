package de.tu_bs.isf.familymining.ppu_iec.export.exporter;

import java.io.File;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.xml.sax.SAXException;

import de.tu_bs.isf.familymining.ppu_iec.export.components.selection.FMSelection;
import de.tu_bs.isf.familymining.ppu_iec.export.factories.ProjectFactory;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project;

/**
 * Exports selected family model elements to PLCOpenXml.
 */
@Creatable
@Singleton
public class PLCOpenXmlExporter {
	
	/**
	 * {@code <project>..</project>} factory. 
	 */
	@Inject
	public ProjectFactory projectFactory;
	
	
	/**
	 * Exports selected family model elements to PLCOpenXml.
	 * @param selection Selected family model elements.
	 * @param outputPath Output path.
	 * @throws JAXBException
	 * @throws SAXException
	 * @throws ClassNotFoundException
	 */
	public void export(FMSelection selection, String outputPath) throws JAXBException, SAXException, ClassNotFoundException
	{		
		Project project = projectFactory.createProject(selection);		
		JAXBContext jaxbContext = JAXBContext.newInstance(project.getClass().getPackage().getName());
		Marshaller marshaller = jaxbContext.createMarshaller();		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.marshal(project, new File(outputPath));
	}
}
