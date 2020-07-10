 
package de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.handler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.e4.core.di.annotations.Execute;

import de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.string_table.StringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.EMFModelLoader.impl.EMFModelLoader;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;


public class CompareProject {
	
	@Execute
	public void execute(ServiceContainer servcies) {
		//add view to rendering process and show them after.
		servcies.partService.setPartToBeRendered(StringTable.PROJECT_COMPARE_VIEW, true);
		servcies.partService.showPart(StringTable.PROJECT_COMPARE_VIEW);
		
		//load model from selection.
		List<Configuration> models = loadModelFromFileTreeElement(servcies.rcpSelectionService.getCurrentSelectionsFromExplorer());
		
		
		servcies.eventBroker.send(PPUEventTable.PROJECT_COMPARE_EVENT,models);
	}
	
	/**
	 * Loads a Configuration object from a FileTreeElement.
	 */
	private List<Configuration> loadModelFromFileTreeElement(List<FileTreeElement> selectedFile) {
		List<Configuration> configs = new ArrayList<Configuration>();
		for(FileTreeElement file : selectedFile) {
			configs.add((Configuration)EMFModelLoader.load(file.getAbsolutePath(), E4CStringTable.FILE_ENDING_CONFIGURATION));
		}
		return configs;
	}	
	
}