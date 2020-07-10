package de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.widgets.Composite;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view.view.FamilyModelView;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.string_table.E4CompareEventTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPImageService;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPPartService;

public class FamilyModelController {
	@Inject RCPPartService partService;
	@Inject RCPImageService imageService;
	@Inject IEventBroker eventBroker;
	@Inject ESelectionService selectionService;
	
	private FamilyModelView view;
	private ConfigurationResultRoot compareRoot;
	
	@PostConstruct
	public void createPartControl(Composite parent, EMenuService menuService, ServiceContainer serviceContainer) {
		view = new FamilyModelView(parent, this,serviceContainer);
		//register menu
		menuService.registerContextMenu(view.getTree(), "de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_context_menu");
		setFocus();
	}
	
	public ConfigurationResultRoot getResultRoot() {
		return compareRoot;
	}
	
	@Focus
	public void setFocus() {	
		view.getTree().setFocus();
		selectionService.setSelection(view.getTree());
	}

	/**
	 * After compare process the compare engine send a RESULT_EVENT with a reference on the result object that calls this method.
	 * 
	 */
	@Inject
	@Optional
	public void showFamilyModel(@UIEventTopic(PPUEventTable.RESULT_EVENT) ConfigurationResultRoot o) {
		if(o instanceof ConfigurationResultRoot) {
			compareRoot = (ConfigurationResultRoot) o;
			view.refreshView();
			eventBroker.send(E4CompareEventTable.SHOW_DETAIL_EVENT, compareRoot);
		}
	}
}
