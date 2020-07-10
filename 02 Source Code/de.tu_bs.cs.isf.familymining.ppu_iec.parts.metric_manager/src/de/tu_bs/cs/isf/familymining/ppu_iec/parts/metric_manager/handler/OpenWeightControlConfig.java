 
package de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.handler;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.CMStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.util.events.CompareEngineEventConsts;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.string_table.E4CompareStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPImageService;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPPartService;

public class OpenWeightControlConfig {
	@Inject ESelectionService _selection;
	@Inject RCPImageService _imageService;
	@Inject IEventBroker _eventBroker;
	@Inject RCPPartService _partService;
	
	
	@Execute
	public void execute() {
		//Parametert is the selected folder in the tree
		TreeItem item = ((Tree)_selection.getSelection()).getSelection()[0];
		if(item != null) {
			_partService.showPart(E4CompareStringTable.WEIGHT_CONTROLLER_VIEW_ID);
			_eventBroker.send(CompareEngineEventConsts.OPEN_CONFIG_WEIGHTS, item);
		}
	}
	
	@CanExecute
	public boolean canExecute() {
		if(_selection.getSelection() instanceof Tree) {
			Tree selection = (Tree)_selection.getSelection();
			if(selection.getSelection() != null) {
				if(selection.getSelection().length > 0) {
					String typ = selection.getSelection()[0].getText(1);
					if(typ.equals(CMStringTable.CONTAINER_TYPE)) {
						return true;
				}
				}
			}	
		}
		return false;
	}
		
}