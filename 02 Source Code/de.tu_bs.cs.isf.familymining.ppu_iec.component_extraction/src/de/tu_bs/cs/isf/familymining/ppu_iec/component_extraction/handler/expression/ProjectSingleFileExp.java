package de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.handler.expression;

import org.eclipse.e4.core.di.annotations.Evaluate;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;

/**
 * This Expression checks if only one file is selected and the file extension is of type .project.
 * @author kamil
 *
 */
public class ProjectSingleFileExp {
	
	@Evaluate
	public boolean checkFile(ServiceContainer services) {
		return checkForConfigurations(services.rcpSelectionService.getCurrentSelectionFromExplorer()) && services.rcpSelectionService.getCurrentSelectionsFromExplorer().size() > 0;	
	}
	
	/**
	 * Evaluates to true if the selected file is from type "Configuration".
	 */
	private boolean checkForConfigurations(FileTreeElement selectedFile) {
		if(selectedFile != null && !selectedFile.isDirectory()) {
			return selectedFile.getExtension().equals(E4CStringTable.FILE_ENDING_CONFIGURATION);
		}
		return false;

	}
}
