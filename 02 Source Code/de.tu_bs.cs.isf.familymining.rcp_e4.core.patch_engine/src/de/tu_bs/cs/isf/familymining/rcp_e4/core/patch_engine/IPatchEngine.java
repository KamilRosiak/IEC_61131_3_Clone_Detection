package de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine;

import org.eclipse.emf.ecore.EObject;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;

public interface IPatchEngine {
	
	public IMappingNode diff(IECAbstractContainer<?> container);
	
	public EObject patch(IMappingNode differenceMappingNode);
	
	public EObject apply(EObject patch, EObject applicant);
}
