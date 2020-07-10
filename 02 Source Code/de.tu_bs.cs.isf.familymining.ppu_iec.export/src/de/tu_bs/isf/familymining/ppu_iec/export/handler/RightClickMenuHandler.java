package de.tu_bs.isf.familymining.ppu_iec.export.handler;

import java.util.List;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPSelectionService;
import de.tu_bs.isf.familymining.ppu_iec.export.views.ExporterController;


public class RightClickMenuHandler {

	@Execute
	public void execute(RCPSelectionService selectionService,ServiceContainer services) {

		List<FileTreeElement> selectedFiles = selectionService.getCurrentSelectionsFromExplorer();
		ExporterController controller = new ExporterController(services);
		if(selectedFiles.size() == 1) {
			FileTreeElement fileTreeElement = selectedFiles.get(0);
			String inputPath = fileTreeElement.getAbsolutePath();	
			controller.showView(inputPath);	
		} else {
			controller.showView(null);
		}
	}	
	
	@CanExecute
	public boolean canExecute(RCPSelectionService selectionService) {
		List<FileTreeElement> selectedFiles = selectionService.getCurrentSelectionsFromExplorer();		
		if(selectedFiles.isEmpty() || selectedFiles.size() > 1) {
			return false;
		}		
		FileTreeElement fileTreeElement = selectedFiles.get(0);
		return fileTreeElement.exists() && !fileTreeElement.isDirectory() 
				&& fileTreeElement.getExtension().equals("family");	
	}

}
