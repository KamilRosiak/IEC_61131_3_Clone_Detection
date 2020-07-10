package de.tu_bs.isf.familymining.ppu_iec.export.handler;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPSelectionService;
import de.tu_bs.isf.familymining.ppu_iec.export.views.ExporterController;

public class ExportHandler {
	@Inject ExporterController controller;
	
	@Execute
	public void execute(RCPSelectionService selectionService) {
		System.out.println("test");
	}
}
