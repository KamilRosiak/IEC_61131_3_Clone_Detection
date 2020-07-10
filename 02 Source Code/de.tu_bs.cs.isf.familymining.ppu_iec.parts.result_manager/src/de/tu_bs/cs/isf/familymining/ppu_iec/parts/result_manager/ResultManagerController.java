package de.tu_bs.cs.isf.familymining.ppu_iec.parts.result_manager;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.widgets.Composite;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util.SolutionSerializer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.parts.result_manager.view.ResultManagerView;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;

@Creatable
public class ResultManagerController {
	public static final String ID			   = "de.tu_bs.cs.isf.familymining.ppu_iec.result_manager";
	public static final String CONTEXT_MENU_ID = "de.tu_bs.cs.isf.familymining.ppu_iec.result_manager_context_menu";
	
	private ResultManagerView view;
	private ConfigurationResultRoot model;
	@Inject ESelectionService selection;
	
	
	@PostConstruct
	public void createPartControl(Composite parent, EMenuService menuService, ServiceContainer serviceContainer) {
		this.view = new ResultManagerView(this, parent,serviceContainer);

		menuService.registerContextMenu(view.getTree() , CONTEXT_MENU_ID);
	}
	
	@Focus
	private void setFocus() {
		selection.setSelection(view.getTree());
	}

	public ConfigurationResultRoot getModel() {
		return model;
	}

	public void setModel(ConfigurationResultRoot model) {
		this.model = model;
	}
	
	/**
	 * Open Result
	 * 
	 */
	@Inject
	@Optional
	public void loadConfiguration(@UIEventTopic(PPUEventTable.LOAD_RESULT_FROM_FILE) Object o) {
		if(o instanceof FileTreeElement) {
			FileTreeElement file = (FileTreeElement)o;
			ConfigurationResultRoot result = SolutionSerializer.decode(file.getAbsolutePath());
			setModel(result);
			view.setResult(result);
		}
	}
}
