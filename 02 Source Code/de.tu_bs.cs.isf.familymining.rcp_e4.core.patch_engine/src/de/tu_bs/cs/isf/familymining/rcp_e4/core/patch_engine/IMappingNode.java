package de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.diffmerge.api.IComparison;
import org.eclipse.emf.diffmerge.api.IMatch;
import org.eclipse.emf.ecore.EObject;

public interface IMappingNode {

	/**
	 * Returns the overall matches of the node hierarchy.
	 * 
	 * @return list of matches
	 */
	public Collection<IMatch> getSubtreeMatches();
	
	public IComparison getIntrinsicComparison();
		
	public boolean isRoot();
	
	public void addChild(IMappingNode node);
	
	public boolean removeChild(IMappingNode node);
	
	public List<IMappingNode> getChildren();
	
	public String getName(EObject name);
}
