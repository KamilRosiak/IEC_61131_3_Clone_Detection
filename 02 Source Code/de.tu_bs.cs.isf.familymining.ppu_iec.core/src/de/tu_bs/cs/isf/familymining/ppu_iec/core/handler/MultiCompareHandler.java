package de.tu_bs.cs.isf.familymining.ppu_iec.core.handler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Shell;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.EMFModelLoader.impl.EMFModelLoader;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPSelectionService;

public class MultiCompareHandler {

	@Execute
	public void execute(Shell shell, ServiceContainer services) {
		List<FileTreeElement> selectedFiles = services.rcpSelectionService.getCurrentSelectionsFromExplorer();
		if(selectedFiles.size() > 2) {

			if(checkForConfigurations(selectedFiles)) {
				List<Configuration> models = loadModelsFrom(selectedFiles);
				services.partService.showPart(PPUStringTable.COMPARE_ENGINE_VIEW_ID);
				services.eventBroker.send(PPUEventTable.MULTI_COMPARE_ENGINE, models);
			} else {
				RCPMessageProvider.errorMessage("Wrong Selection", "One or more model are not of type configuration");
			}
		} else {
			RCPMessageProvider.informationMessage("Wrong Selection", "Please select two models of type configuration.");
		}
	}
	
	private boolean checkForConfigurations(List<FileTreeElement> selectedFiles) {
		return !selectedFiles.stream()
				.filter(element -> !element.isDirectory())
				.anyMatch(element -> !element.getExtension().equals(E4CStringTable.FILE_ENDING_CONFIGURATION));
	}

	private List<Configuration> loadModelsFrom(List<FileTreeElement> selectedFiles) {
		List<Configuration> models = new ArrayList<Configuration>();
		selectedFiles.forEach(element -> {
			models.add((Configuration)EMFModelLoader.load(element.getAbsolutePath(), E4CStringTable.FILE_ENDING_CONFIGURATION));
		});
		return models;
	}
	
	@CanExecute
	public boolean canExecute(RCPSelectionService selectionService) {
		List<FileTreeElement> selectedFiles = selectionService.getCurrentSelectionsFromExplorer();
		return checkForConfigurations(selectedFiles) && selectedFiles.size() > 2;
	}
		
}