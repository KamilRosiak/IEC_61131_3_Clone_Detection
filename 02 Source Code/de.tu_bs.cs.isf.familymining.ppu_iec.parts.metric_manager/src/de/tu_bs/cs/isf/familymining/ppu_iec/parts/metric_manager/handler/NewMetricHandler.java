package de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.handler;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.widgets.Tree;

import de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.util.events.CompareEngineEventConsts;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPImageService;
/**
 * This 
 * @author {Kamil Rosiak}
 *
 */
public class NewMetricHandler {
	@Inject ESelectionService _selection;
	@Inject RCPImageService _imageService;
	@Inject IEventBroker _eventBroker;
	
	@Execute
	public void execute() {
		if(_selection.getSelection() instanceof Tree) {
			Tree tree = (Tree)_selection.getSelection();
			if(tree.getItemCount() == 0) {
				createNewConfiguration();
			} else {
				boolean decision = RCPMessageProvider.questionMessage("Decision","Would you like to create a new configuration ?");
				if(decision) {
					tree.removeAll();
					createNewConfiguration();
				}
			}			
		}
	}
	
	private void createNewConfiguration() {
		_eventBroker.send(CompareEngineEventConsts.NEW_CONFIGURATION,"");
	}
	
	@CanExecute
	public boolean canExecute() {
		if(_selection.getSelection() instanceof Tree) {
			return true;
		} else {
			return false;
		}
	}
}
