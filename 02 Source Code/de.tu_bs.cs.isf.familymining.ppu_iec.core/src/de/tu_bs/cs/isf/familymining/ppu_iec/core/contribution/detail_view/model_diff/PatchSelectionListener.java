package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.model_diff;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.STLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.implementation.STImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.parts.detail_view.DetailViewController;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;

public class PatchSelectionListener implements SelectionListener {

	public class ParentChildHelper {
		public EObject parent;
		public EObject child;
		public ParentChildHelper(EObject parent, EObject child) {
			this.parent = parent;
			this.child = child;
		}
	}
	
	private DetailViewController controller;
	private IECAbstractContainer<?> container; 
	
	public PatchSelectionListener(DetailViewController controller) {
		this.setController(controller);
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		if (container != null) {
			// request permission to apply patch on target 
			if (shouldPatch()) {
				patch(container);
			}
		}
	}

	private boolean shouldPatch() {
		return RCPMessageProvider.questionMessage("Apply Patch", "This process will change the target model. Do you want to continue?");
	}

	private void patch(IECAbstractContainer<?> container) {
		EObject patchObject = container.getSecond();
		
		if (container instanceof STLangContainer) {
			patchST((STLangContainer) container);
		} else if (container instanceof STImplContainer) {
			//patchStatement((STImplContainer) container);
			RCPMessageProvider.informationMessage("Apply Patch", "You cannot apply patches on Structured Text statements at the moment.");
		} 
	}

	private void patchST(STLangContainer langContainer) {
		// get model root of second
		//TODO:Fix it, with new family model its possible to update the controller.
		/**
		ModelCompareContainer mcc = controller.getCompareRoot().getChildren().get(0);
		Configuration originalConfiguration = mcc.getSecond();
		Configuration patchConfiguration = EcoreUtil.copy(originalConfiguration);
		
		// retrieve the object by id together with its parent
		String targetId = langContainer.getSecond().getId();
		ParentChildHelper parentChild = getChildById(patchConfiguration, targetId);
		if (parentChild != null) {
			EObject parent = parentChild.parent;
			EObject child = parentChild.child;
		
			// replace the child with the first element of the container  
			if (child != null && parent != null && EcoreUtil.equals(child, langContainer.getSecond())) {
				if (parent instanceof Action) {
					StructuredText stCopy = EcoreUtil.copy(langContainer.getFirst());
					stCopy.setId(((Action) parent).getName());
					((Action) parent).setImplementation(stCopy);
				} else if (parent instanceof POU) {
					((POU) parent).getImplementations().clear();
					StructuredText stCopy = EcoreUtil.copy(langContainer.getFirst());
					stCopy.setLabel(((POU) parent).getIdentifier());
					((POU) parent).getImplementations().add(stCopy);
				}
			}
		}
		
		
		patchConfiguration.setIdentifier("patched_"+patchConfiguration.getIdentifier());
		writeToXMI(patchConfiguration);
		**/
	}

	private void patchStatement(STImplContainer implContainer) {
		// get model root of second 
		//TODO:Fix it
		/**
		 * 
		ModelCompareContainer mcc = controller.getCompareRoot().getChildren().get(0);
		Configuration originalConfiguration = mcc.getSecond();
		Configuration patchConfiguration = EcoreUtil.copy(originalConfiguration);
		
		// retrieve the object by id together with its parent
		String targetId = implContainer.getSecond().getId();
		ParentChildHelper parentChild = getChildById(patchConfiguration, targetId);
		if (parentChild != null) {
			EObject parent = parentChild.parent;
			EObject child = parentChild.child;
		
			// replace the child with the first element of the container  
			if (child != null && parent != null && EcoreUtil.equals(child, implContainer.getSecond())) {
				// store the StructuredText instance				
				if (parent instanceof Statement) {
					EReference reference = parent.eContainmentFeature();
				} else if (parent instanceof StructuredText) {
					Statement stCopy = EcoreUtil.copy(implContainer.getFirst());
					((StructuredText) parent).getStatements().replaceAll(s -> {
						if (EcoreUtil.getID(s).equals(targetId)) {
							return EcoreUtil.copy(stCopy);
						}
						return s;
					});
					
				}
			}
		}
		
		
		patchConfiguration.setIdentifier("patched_"+patchConfiguration.getIdentifier());
		writeToXMI(patchConfiguration);
		**/
	}
	
	/**
	 * Retrieves child identified by <i>id</i> and its parent
	 *  
	 * @param patchConfiguration
	 * @param id
	 * @return
	 */
	private ParentChildHelper getChildById(Configuration patchConfiguration, String id) {
		TreeIterator<EObject> treeIt = EcoreUtil.getAllContents(patchConfiguration, true);
		while (treeIt.hasNext()) {
			EObject object = treeIt.next();
			for (EObject containedObject : object.eContents()) {
				String objectId = EcoreUtil.getID(containedObject);
				if (objectId != null) {
					if (objectId.equals(id)) {
						return new ParentChildHelper(object, containedObject);					
					}
				}
			}
			
		}
		return null;
	}
	
	private void writeToXMI(Configuration patchConfiguration) {
		String patchedPath = buildPatchedFilePath(patchConfiguration);
		try {
			exportToXMI(Paths.get(patchedPath), patchConfiguration);
			RCPMessageProvider.informationMessage("Apply Patch", "The patched model has been written to \""+patchedPath+"\"");
		} catch (IOException e) {
			RCPMessageProvider.informationMessage("Apply Patch", "The model could not be patched due to an error.");
		}
	}

	private String buildPatchedFilePath(Configuration patchConfiguration) {
		return RCPContentProvider.getCurrentWorkspacePath()+"01 Models/"+patchConfiguration.getIdentifier()+".project";
	}
	
	public static Resource exportToXMI(Path target, EObject root) throws IOException {		
		// get registry and insert data format
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		String filename = target.getFileName().toString();
		String fileExtension = filename.substring(filename.indexOf("."));
		Map<String,Object> m = reg.getExtensionToFactoryMap();
		m.put(fileExtension , new XMIResourceFactoryImpl());

		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createFileURI(target.toString()));
		resource.getContents().add(root);
		
		// TODO: ask user, if they want to overwrite existing file
		
		// create a new file
		if (Files.exists(target)){
			Files.delete(target);
		}
		
		// save xmi representation into the file
		resource.save(Collections.EMPTY_MAP);
		
		return resource;
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		widgetSelected(e);
	}

	public DetailViewController getController() {
		return controller;
	}

	public void setController(DetailViewController controller) {
		this.controller = controller;
	}

	public IECAbstractContainer<?> getContainer() {
		return container;
	}

	public void setContainer(IECAbstractContainer<?> container) {
		this.container = container;
	}

}
