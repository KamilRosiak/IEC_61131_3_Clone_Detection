package de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.handler;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPPartService;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPSelectionService;

public class OpenConfigurationManagerHandler {
	@Inject RCPPartService partService; 
	@Inject RCPSelectionService selectionServ;
	@Inject IEventBroker eventBroker;
	
	@Execute
	public void execute() {
		partService.showPart(PPUStringTable.METRIC_MANAGER_VIEW_ID);
		FileTreeElement target = selectionServ.getCurrentSelectionFromExplorer();
		eventBroker.send(PPUEventTable.LOAD_METRIC_FROM_FILE, target);
	}
}
