package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.isf.familymining.ppu_iec.export.components.selection.FMSelection;
import de.tu_bs.isf.familymining.ppu_iec.export.constants.XmlDataTable;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.AddData;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.Instances.Configurations.Configuration.Resource;

/**
 * {@code <resource>..</resource>} factory.
 */
@Creatable
@Singleton
public class ResourceFactory {

	/**
	 * {@code <globalVars>..</globalVars>} factory.
	 */
	@Inject
	public GlobalVariableFactory globalVariableFactory;

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
	 * {@code <pou>..</pou>} factory.
	 */
	@Inject
	public PouFactory pouFactory;

	/**
	 * @param scenarioName Name attribute in content header.
	 * @param selection    Selected tree items.
	 * @return {@code <resource>..</resource>}.
	 */
	public Resource createResource(String scenarioName, FMSelection selection) {
		Resource resource = new Resource();
		resource.setName(scenarioName);

		resource.getGlobalVars().add(globalVariableFactory.createGlobalVariables(selection.getGlobalVariables()));

		List<AddData.Data> dataList = new ArrayList<AddData.Data>();
		for (POU pou : selection.getPous()) {
			dataList.add(dataFactory.createData(
					pouFactory.createPou(pou, selection.getLocalVariables(pou), selection.getInputVariables(pou),
							selection.getOutputVariables(pou)),
					XmlDataTable.POU_DATA, XmlDataTable.HANDLE_UNKNOWN_IMPLEMENTATION));
		}

		resource.setAddData(addDataFactory.createAddData(dataList));
		return resource;
	}

}
