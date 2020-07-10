package de.tu_bs.cs.isf.familymining.rcp_e4.core.parts.properties_view;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.parts.properties_view.view.PropertieView;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CEventTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;

/**
 * This view shows the properties of the current selected file in a jface tableview.
 * @author {Kamil Rosiak}
 *
 */
public class PropertieViewController {
	@Inject private ESelectionService _selectionService;
	private ServiceContainer services;
	private PropertieView view;

	
	@PostConstruct
	public void postConstruct(Composite parent, ServiceContainer services) {
		this.setServices(services);
		view = new PropertieView(parent, this);
	}
	
	public ServiceContainer getServices() {
		return services;
	}

	public void setServices(ServiceContainer services) {
		this.services = services;
	}
	
	/**
	 * Injecting the current selection and updating the view.
	 * @param o is the current selected object from the explorer view.
	 */
	@Inject
	@Optional
	public void selectionChanged(@UIEventTopic(E4CEventTable.SELECTION_CHANGED_EVENT) Object o) {
		//Here the event send the acutely selection
		if(o instanceof IStructuredSelection ) {
			IStructuredSelection selection = (IStructuredSelection) _selectionService.getSelection();
			if(selection.isEmpty()) {
				view.setEmptyItem();
			} else if (selection.getFirstElement() instanceof FileTreeElement){
				FileTreeElement file = (FileTreeElement) selection.getFirstElement();
			
				if(!file.isDirectory()) {
					//check file type
					if(file.getExtension().equals("project")) {
						view.showProjectFile(file);
					} else if(file.getExtension().equals("metric")) {
						
					} else {
						view.showFile(file);
					}
				} else {
					view.showFile(file);
				}
			} 
		}		
	}
}