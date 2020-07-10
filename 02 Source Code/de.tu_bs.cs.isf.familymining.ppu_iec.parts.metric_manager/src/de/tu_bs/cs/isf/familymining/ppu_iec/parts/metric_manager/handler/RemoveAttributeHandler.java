 
package de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.handler;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractModelAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractAttribute;

public class RemoveAttributeHandler {
	@Inject ESelectionService _selection;

	@Execute
	public void execute() {
		Tree tree = (Tree)_selection.getSelection();
		if(tree.getSelection().length > 0) {
			TreeItem selection = (TreeItem)tree.getSelection()[0];
			if(selection.getData() instanceof AbstractModelAttribute ||
			   selection.getData() instanceof AbstractPOUAttribute   ||
		       selection.getData() instanceof AbstractAttribute) {
				selection.dispose();
				}
		}
	}
	
	@CanExecute 
	public boolean canExecute() {
		if(_selection.getSelection() instanceof Tree) {
			Tree tree = (Tree)_selection.getSelection();
			if(tree.getSelection().length > 0) {
				TreeItem selection = (TreeItem)tree.getSelection()[0];
				if(selection.getData() instanceof AbstractModelAttribute ||
						selection.getData() instanceof AbstractPOUAttribute   ||
						selection.getData() instanceof AbstractAttribute) {
					return true;
				}
			}
		}
		return false;	
	}	
}