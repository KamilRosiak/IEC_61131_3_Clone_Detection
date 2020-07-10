package de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.handler;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.parts.attribute_manager.util.AttributeExtension;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
/**
 * This handler adds all selected attributes from the attribute manager to the project explorer.
 * @author {Kamil Rosiak}
 *
 */
public class AddAttributesHandler {
	
	@Execute
	public void execute(ESelectionService selectionService,ServiceContainer services) { 

		if(selectionService.getSelection() instanceof Tree) {
			Tree tree = (Tree)selectionService.getSelection();
			for(TreeItem item : tree.getSelection()) {
				if(item.getData() instanceof AttributeExtension) {
					AttributeExtension extension = (AttributeExtension)item.getData();
					extension.getExtension().execute(services, extension.getAttribute());
				}
			}
			
			
		}	
	}
	
	@CanExecute
	public boolean canExecute(ESelectionService selectionService) {
		if(selectionService.getSelection() instanceof Tree) {
			Tree tree = (Tree)selectionService.getSelection();
			for(TreeItem item : tree.getSelection()) {
				if(!(item.getData() instanceof AttributeExtension)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
