 
package de.tu_bs.isf.familymining.ppu_iec.export.handler;

import java.util.List;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPSelectionService;
import de.tu_bs.isf.familymining.ppu_iec.export.views.ExporterController;

public class MainMenuHandler {
	

	@Execute
	public void execute(RCPSelectionService selectionService,ExporterController controller) {
		List<FileTreeElement> selectedFiles = selectionService.getCurrentSelectionsFromExplorer();
		
		String inputPath = null;
		//Pre select file if it is valid
		if(!selectedFiles.isEmpty() || selectedFiles.size() == 1) {
			FileTreeElement fileTreeElement = selectedFiles.get(0);
			if (fileTreeElement.exists() && !fileTreeElement.isDirectory() 
					&& fileTreeElement.getExtension().equals("family")) {
				inputPath = fileTreeElement.getAbsolutePath();	
			}
		}		
		controller.showView(inputPath);	
	}	

	
	@CanExecute
	public boolean canExecute(RCPSelectionService selectionService) {
		return true;
	}
		
}