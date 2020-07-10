package de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine;

import org.eclipse.emf.diffmerge.diffdata.EComparison;
import org.eclipse.emf.ecore.EObject;

public interface IComparator {

	public EComparison compare(EObject reference, EObject target);
}
