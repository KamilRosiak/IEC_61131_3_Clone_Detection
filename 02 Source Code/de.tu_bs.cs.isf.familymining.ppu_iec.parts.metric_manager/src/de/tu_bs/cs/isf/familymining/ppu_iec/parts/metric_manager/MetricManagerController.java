package de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.function_block_diagram.templates.AbstractFBDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram.templates.AbstractLDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram.templates.AbstractLDLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractActionAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractModelAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractVariableAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.util.MetricContainerSerializer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.util.events.CompareEngineEventConsts;
import de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.view.MetricManagerView;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.gui.swt.dialogs.InputDialogMulti;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;


@Creatable
public class MetricManagerController implements Serializable {
	public static String CONTEXT_MENU_ID ="de.tu_bs.cs.isf.familymining.ppu_iec.compare_engine.context_menu";
	/**
	 * 
	 */
	private static final long serialVersionUID = 3652790910858647919L;
	private MetricContainer _model;
	private MetricManagerView view;
	private ServiceContainer _services;
	@Inject ESelectionService _selection;

	@Focus
	public void setFocus() {
		_selection.setSelection(view.getTree());
	}
	
	@PostConstruct
	public void createPartControl(Composite parent, EMenuService menuService, ServiceContainer serviceContainer) {
		_services = serviceContainer;
		view = new MetricManagerView(this,parent,_services);
		//Register a context menu to the tree of the view (important to have the dependency to org.eclipse.e4.ui.services else you get null pointer exception)
		menuService.registerContextMenu(view.getTree(), CONTEXT_MENU_ID);
	}
	
	public MetricContainer getModel() {
		return _model;
	}

	public void setModel(MetricContainer model) {
		_model = model;
	}

	public MetricManagerView getView() {
		return view;
	}

	public void setView(MetricManagerView _view) {
		this.view = _view;
	}

	/**
	 * Open Configuration
	 */
	@Inject
	@Optional
	public void loadConfiguration(@UIEventTopic(CompareEngineEventConsts.LOAD_CONFIGURATION) FileTreeElement file) {
			MetricContainer config = MetricContainerSerializer.decode(file.getAbsolutePath());
			setModel(config);
			view.setConfiguration(config);
			view.expandAndpackConfigTree();
			
	}
	
	@Inject
	@Optional
	public void syncViewWithConfiguration(@UIEventTopic(CompareEngineEventConsts.UPDATE_CONFIG) Object o) {
			view.updateConfiguration();
	}
	
	@Inject
	@Optional
	public void newConfiguration(@UIEventTopic(CompareEngineEventConsts.NEW_CONFIGURATION) Object o) {
		InputDialogMulti input = new InputDialogMulti(Display.getCurrent().getActiveShell(), "Metric Name", "Decription");
		input.create();
		if(input.open() == Window.OK) {
			_model = new MetricContainer(input.getVars().get(0), input.getVars().get(1));
			view.setConfiguration(_model);
		}
	}
	@Inject
	@Optional
	public void addPOUAttribute(@UIEventTopic(PPUEventTable.ADD_POU_ATTR) AbstractPOUAttribute pouAttr) {
		if(view.getDecoratedTree() != null) {
			pouAttr.setEnabled(true);
			view.getDecoratedTree().addPOUAttribute(pouAttr);	
		}
	}
	
	@Inject
	@Optional
	public void addActionAttribute(@UIEventTopic(PPUEventTable.ADD_ACTION_ATTR) AbstractActionAttribute actionAttr) {
		if(view.getDecoratedTree() != null) {
			actionAttr.setEnabled(true);
			view.getDecoratedTree().addActionAttribute(actionAttr);
		}
	}
	
	@Inject
	@Optional
	public void addModelAttribute(@UIEventTopic(PPUEventTable.ADD_MODEL_ATTR) AbstractModelAttribute modelAttr) {
		if(view.getDecoratedTree() != null) {
			modelAttr.setEnabled(true);
			view.getDecoratedTree().addModelAttribute(modelAttr);	
		}
	}
	
	@Inject
	@Optional
	public void addVariableAttribute(@UIEventTopic(PPUEventTable.ADD_VARIABLE_ATTR) AbstractVariableAttribute varAttr) {
		if(view.getDecoratedTree() != null) {
			varAttr.setEnabled(true);
			view.getDecoratedTree().addVariableAttribute(varAttr);
		}
	}
	
	@Inject
	@Optional
	public void addSTImplAttribute(@UIEventTopic(PPUEventTable.ADD_ST_IMPL_ATTR) AbstractSTImplAttribute stAttr) {
		if(view.getDecoratedTree() != null) {
			stAttr.setEnabled(true);
			view.getDecoratedTree().addSTImplAttribute(stAttr);
		}
	}
	
	@Inject
	@Optional
	public void addSTLangAttribute(@UIEventTopic(PPUEventTable.ADD_ST_LANG_ATTR) AbstractSTLangAttribute stAttr) {
		if(view.getDecoratedTree() != null) {
			stAttr.setEnabled(true);
			view.getDecoratedTree().addSTLangAttribute(stAttr);
		}	
	}
	
	@Inject
	@Optional
	public void addLDImplAttribute(@UIEventTopic(PPUEventTable.ADD_LD_IMPL_ATTR) AbstractLDImplAttribute ldAttr) {
		if(view.getDecoratedTree() != null) {
			ldAttr.setEnabled(true);
			view.getDecoratedTree().addLDImplAttribute(ldAttr);
		}
	}
	
	@Inject
	@Optional
	public void addLDLAngAttribute(@UIEventTopic(PPUEventTable.ADD_LD_LANG_ATTR) AbstractLDLangAttribute ldAttr) {
		if(view.getDecoratedTree() != null) {
			ldAttr.setEnabled(true);
			view.getDecoratedTree().addLDLangAttribute(ldAttr);
		}
	}
	
	@Inject
	@Optional
	public void addSFCLangAttribute(@UIEventTopic(PPUEventTable.ADD_SFC_LANG_ATTR) AbstractSFCLangAttribute sfcAttr) {
		if(view.getDecoratedTree() != null) {
			sfcAttr.setEnabled(true);
			view.getDecoratedTree().addSFCLangAttribute(sfcAttr);
		}
	}
	
	@Inject
	@Optional
	public void addSFCImplAttribute(@UIEventTopic(PPUEventTable.ADD_SFC_IMPL_ATTR) AbstractSFCImplAttribute sfcAttr) {
		if(view.getDecoratedTree() != null) {
			sfcAttr.setEnabled(true);
			view.getDecoratedTree().addSFCImplAttribute(sfcAttr);
		}
	}
	
	@Inject
	@Optional
	public void addFBDImplAttribute(@UIEventTopic(PPUEventTable.ADD_FBD_IMPL_ATTR) AbstractFBDImplAttribute sfcAttr) {
		if(view.getDecoratedTree() != null) {
			sfcAttr.setEnabled(true);
			view.getDecoratedTree().addFBDImplAttribute(sfcAttr);
		}
	}

}
