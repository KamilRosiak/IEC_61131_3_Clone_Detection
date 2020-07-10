package de.tu_bs.cs.isf.familymining.ppu_iec.parts.result_manager.handler;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPPartService;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPSelectionService;

public class OpenResultManagerHandler {
	@Inject RCPPartService partService; 
	@Inject RCPSelectionService selectionServ;
	@Inject IEventBroker eventBroker;
	
	@Execute
	public void execute() {

	}
}
