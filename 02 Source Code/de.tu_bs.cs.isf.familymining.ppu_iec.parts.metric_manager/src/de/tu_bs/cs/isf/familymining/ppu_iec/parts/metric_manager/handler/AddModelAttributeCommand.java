package de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.handler;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.widgets.Tree;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.view.attribute_manager.AttributeManager;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPImageService;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPPartService;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPSelectionService;

public class AddModelAttributeCommand {
	@Inject ESelectionService _selection;
	@Inject public RCPImageService _imagService;
	@Inject public RCPSelectionService _selectionService;
	@Inject public RCPPartService _partService;
	@Inject public IEventBroker _eventBroker;
	
	@Execute
	public void execute(ServiceContainer serviceContainer) { 
		if(_selection.getSelection() instanceof Tree) {
			new AttributeManager(serviceContainer, PPUStringTable.MODEL_ATTRIBUTE_SYMBOLIC_NAME, PPUStringTable.MODEL_ATTR_EXTENSION,(Tree)_selection.getSelection(), _eventBroker);
		}
		

	}
	
	@CanExecute
	public boolean canExecute() {
		if(_selection.getSelection() instanceof Tree) {
			Tree tree = (Tree)_selection.getSelection();
			if(tree.getItemCount() > 0) {
				return true;
			}
		}
		return false;	
	}
}
