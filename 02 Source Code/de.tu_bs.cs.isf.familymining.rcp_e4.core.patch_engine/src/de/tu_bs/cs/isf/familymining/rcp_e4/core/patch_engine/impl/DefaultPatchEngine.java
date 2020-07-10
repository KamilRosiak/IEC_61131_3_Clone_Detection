package de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.impl;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.diffmerge.api.IComparison;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.LanguageImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.DiagramContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.LDNetworkImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.SFCLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation.SFCImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.STLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.implementation.STImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.IComparator;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.IMappingNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.INameProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.IPatchEngine;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.util.STNameProvider;

public class DefaultPatchEngine implements IPatchEngine {

	protected INameProvider stNameProvider;
	protected IComparator comparator;
	
	public DefaultPatchEngine(IComparator comparator) {
		this.stNameProvider = new STNameProvider();
		this.comparator = comparator;
	}
	
	@Override
	public IMappingNode diff(IECAbstractContainer<?> container) {
		if (!hasFirstAndSecond(container)) {
			return null;
		}
		IComparison rootMatches = createMatches(container);
		IMappingNode rootNode = new MappingNode(rootMatches, stNameProvider);
		diffChildren(rootNode, container);
		return rootNode;
	}
	
	@SuppressWarnings("unchecked")
	protected void diffChildren(IMappingNode parent, IECAbstractContainer<?> container) {
		for (IECAbstractContainer<?> containerChild : (List<IECAbstractContainer<?>>) getChildren(container)) {
			if (hasFirstAndSecond(container)) {
				IComparison childComparison = createMatches(containerChild);
				if (childComparison != null) {
					IMappingNode childNode = new MappingNode(parent, childComparison, stNameProvider);
					parent.addChild(childNode);
					diffChildren(parent, containerChild);					
				}
			}
		}	
	}

	protected IComparison createMatches(IECAbstractContainer<?> container) {
		if (hasFirstAndSecond(container)) {
			EObject refObject = (EObject) container.getFirst();
			EObject targetObject = (EObject) container.getSecond();
			return comparator.compare(EcoreUtil.copy(refObject),EcoreUtil.copy(targetObject));
		}
		return null;
	}
	
	protected boolean hasFirstAndSecond(IECAbstractContainer<?> container) {
		return container.getFirst() != null && container.getSecond() != null;
	}
	
	/**
	 * Retrieves the sub container of a <i>container</i>.
	 * <b>Only retrieves language containers and derivatives</b>
	 * 
	 * @param container
	 * @return
	 */
	protected static List<?> getChildren(IECAbstractContainer<?> container) {
		if (container instanceof STLangContainer) {
			LanguageImplementationOption<?> langImplOption = ((STLangContainer) container).getImplOption();
			return langImplOption != null ? langImplOption.getAllContainer() : Collections.emptyList();
		} else if (container instanceof SFCLangContainer) {
			LanguageImplementationOption<?> langImplOption = ((SFCLangContainer) container).getImplOption();
			return langImplOption != null ? langImplOption.getAllContainer() : Collections.emptyList();
		} else if (container instanceof DiagramContainer) {
			LanguageImplementationOption<?> langImplOption = ((DiagramContainer) container).getImplOption();
			return langImplOption != null ? langImplOption.getAllContainer() : Collections.emptyList();
		} else if (container instanceof STImplContainer) {
			LanguageImplementationOption<?> langImplOption = ((STImplContainer) container).getImplOption();
			return langImplOption != null ? langImplOption.getAllContainer() : Collections.emptyList();
		} else if (container instanceof SFCImplContainer) {
			LanguageImplementationOption<?> langImplOption = ((SFCImplContainer) container).getImplOption();
			return langImplOption != null ? langImplOption.getAllContainer() : Collections.emptyList();
		} else if (container instanceof LDNetworkImplContainer) {
			LanguageImplementationOption<?> langImplOption = ((LDNetworkImplContainer) container).getImplOption();
			return langImplOption != null ? langImplOption.getAllContainer() : Collections.emptyList();
		} else {
			return Collections.emptyList();
		}
		
	}
	
	@Override
	public EObject patch(IMappingNode differenceMappingNode) {
//		ModelPatchRecorder mpr = new ModelPatchRecorder();
//		mpr.setIdentifierProvider(new EMFIdentifierProvider());
//		return mpr.generateModelPatch(differenceMappingNode.getIntrinsicComparison());
		return null;
	}

	@Override
	public EObject apply(EObject patch, EObject applicant) {
//		EMFModelAccess ema = new SimpleReflectiveEMFModelAccess();
//		
//		// save the applicant
//		Path path = Paths.get("C:\\Users\\olive\\Desktop\\applicantModel.model");
//		try {
//			if (Files.exists(path)) {
//				Files.delete(path);
//			}
//			Resource r = ModelToXMIExporter.exportToXMI(path, EcoreUtil.copy(applicant));
//			EMFModelPatchApplier patchApplier = new EMFModelPatchApplier(ema);
//			PatchApplication pa = patchApplier.apply(patch, r.getResourceSet());
//			r.save(Collections.EMPTY_MAP);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 		
//		
//	
//		System.out.println("");
//		return null;
		return null;
	}
}
