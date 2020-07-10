package de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.ppuiecanalyticsview;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.widgets.Composite;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPSelectionService;


@Creatable 
public class IECAnalyticsView {
	public static final String RESOURCE = "Resource";
	public static final String VARS = "GlobalVariables";
	@Inject RCPSelectionService _selectionService;

	@PostConstruct
	public void createPartControl(Composite parent) {
	}
	
	@Focus
	public void setFocus() {	
		
	}
}
