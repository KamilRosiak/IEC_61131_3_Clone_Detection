package de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.handler;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPPartService;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPSelectionService;

public class ConfigurationManagerCommand {
	@Inject RCPSelectionService selectionService;
	@Inject RCPPartService partService;
	@Inject IEclipseContext context;
	
	@Execute
	public void execute() {
		FileTreeElement selection = selectionService.getCurrentSelectionFromExplorer();
		if (!selection.isDirectory()) {
			if(selection.getExtension().equals(E4CStringTable.FILE_ENDING_METRIC)) { 
				OpenConfigurationManagerHandler handler = new OpenConfigurationManagerHandler();
				ContextInjectionFactory.inject(handler, context);
				handler.execute();
				
			}
		}
	}
	
	@CanExecute
	public boolean canExecute() {
		FileTreeElement selection = selectionService.getCurrentSelectionFromExplorer();
		if (selection != null && !selection.isDirectory()) {
				if(selection.getExtension().equals(E4CStringTable.FILE_ENDING_METRIC)) {
					return true;
				}
		}			
		return false;
	}
}
