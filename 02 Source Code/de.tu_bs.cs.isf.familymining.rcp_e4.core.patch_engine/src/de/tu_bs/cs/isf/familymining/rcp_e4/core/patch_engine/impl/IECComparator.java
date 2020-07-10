package de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.impl;

import java.util.Arrays;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.diffmerge.api.IDiffPolicy;
import org.eclipse.emf.diffmerge.api.IMatchPolicy;
import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.diffdata.EComparison;
import org.eclipse.emf.diffmerge.diffdata.impl.EComparisonImpl;
import org.eclipse.emf.diffmerge.impl.policies.ConfigurableDiffPolicy;
import org.eclipse.emf.diffmerge.impl.policies.ConfigurableMatchPolicy;
import org.eclipse.emf.diffmerge.impl.scopes.SubtreeModelScope;
import org.eclipse.emf.ecore.EObject;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.IComparator;

public class IECComparator implements IComparator {
	
	/**
	 * Compares <i>referenceObject</i> to <i>targetObject</i> and determines the differences between both
	 * 
	 * @param referenceObject
	 * @param targetObject
	 * @return collection of differences between the objects
	 */
	public EComparison compare(EObject referenceObject, EObject targetObject) {
		// define the scope of the model objects
		IEditableModelScope ecoreModelScopeA = new SubtreeModelScope(referenceObject);
		IEditableModelScope ecoreModelScopeB = new SubtreeModelScope(targetObject);
		
		// create a comparison that encapsulates both scopes
		EComparison eobjectComparison = new EComparisonImpl(ecoreModelScopeA, ecoreModelScopeB);
		
		// select match and diff policy
		IMatchPolicy matchPolicy = createMatchPolicy();
		IDiffPolicy diffPolicy = createDiffPolicy();
		
		
		IStatus status = eobjectComparison.compute(matchPolicy, diffPolicy, null, null);
		if (status.isOK()) {
			return eobjectComparison;
		} else {
			if (status.getSeverity() == IStatus.ERROR) {
				status.getException().printStackTrace();
			}
			return null;
		}
		
	}

	private IMatchPolicy createMatchPolicy() {
		ConfigurableMatchPolicy matchPolicy = new ConfigurableMatchPolicy();
		
		// set MatchCriterionKind
		matchPolicy.setAllUsedCriteria(Arrays.asList(
				ConfigurableMatchPolicy.MatchCriterionKind.INTRINSIC_ID,
				ConfigurableMatchPolicy.MatchCriterionKind.EXTRINSIC_ID,
				ConfigurableMatchPolicy.MatchCriterionKind.NAME,
				ConfigurableMatchPolicy.MatchCriterionKind.STRUCTURE));
		
		// set fine grained criteria
		matchPolicy.setAllUsedFineGrainedCriteria(Arrays.asList(
				ConfigurableMatchPolicy.CRITERION_STRUCTURE_UNIQUECHILDREN,
				ConfigurableMatchPolicy.CRITERION_STRUCTURE_CONTAINMENTS,
				ConfigurableMatchPolicy.CRITERION_STRUCTURE_ROOTS,
				ConfigurableMatchPolicy.CRITERION_SEMANTICS_DEFAULTCONTENTS));
		
		// match IDs
		matchPolicy.setKeepMatchIDs(true);
		
		return matchPolicy;
	}

	private IDiffPolicy createDiffPolicy() {
		ConfigurableDiffPolicy diffPolicy = new ConfigurableDiffPolicy();
		
		// relevance of order
		diffPolicy.setIgnoreOrders(true);
		
		return diffPolicy;
	}
}
