package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Inject;
import javax.inject.Singleton;
import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.isf.familymining.ppu_iec.export.components.selection.FMSelection;
import de.tu_bs.isf.familymining.ppu_iec.export.constants.XmlDataTable;
import de.tu_bs.isf.familymining.ppu_iec.export.views.ExporterController;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project;

/**
 * {@code <project>..</project>} factory.
 */
@Creatable
@Singleton
public class ProjectFactory {

	/**
	 * {@code <fileHeader>..</fileHeader>} factory.
	 */
	@Inject
	public FileHeaderFactory fileHeaderFactory;

	/**
	 * {@code <contentHeader>..</contentHeader>} factory.
	 */
	@Inject
	public ContentHeaderFactory contentHeaderFactory;

	/**
	 * {@code <types>..</types>} factory.
	 */
	@Inject
	public TypesFactory typesFactory;

	/**
	 * {@code <instances>..</instances>} factory.
	 */
	@Inject
	public InstancesFactory instancesFactory;

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
	 * {@code <resource>..</resource>} factory.
	 */
	@Inject
	public ResourceFactory resourceFactory;

	/**
	 * @param selection Selected tree items.
	 * @return {@code <project>..</project>}.
	 */
	public Project createProject(FMSelection selection) {
		String scenarioName = ExporterController.getCHName();
		Project project = new Project();
		project.setFileHeader(fileHeaderFactory.createFileHeader());
		project.setContentHeader(contentHeaderFactory.createContentHeader(scenarioName));
		project.setTypes(typesFactory.createTypes());
		project.setInstances(instancesFactory.createInstances());
		project.setAddData(addDataFactory
				.createAddData(dataFactory.createData(resourceFactory.createResource(scenarioName, selection),
						XmlDataTable.APPLICATION_DATA, XmlDataTable.HANDLE_UNKNOWN_IMPLEMENTATION)));
		return project;
	}

}
