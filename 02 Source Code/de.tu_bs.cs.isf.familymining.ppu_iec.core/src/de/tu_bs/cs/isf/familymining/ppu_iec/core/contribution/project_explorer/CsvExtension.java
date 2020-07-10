package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.project_explorer;

import org.eclipse.swt.graphics.Image;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUFileTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPImageService;
import de.tu_bs.cs.isf.familymining.rcp_e4.parts.project_explorer.interfaces.IProjectExplorerExtension;

public class CsvExtension implements IProjectExplorerExtension {
	@Override
	public Image getIcon(RCPImageService imageService) {
		return imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.CSV_FILE);
	}

	@Override
	public void execute(ServiceContainer container) {
		RCPMessageProvider.informationMessage("Not Available", "An Editor for csv is not available now.");	
	}
}
