package de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.diffmerge.api.IComparison;
import org.eclipse.emf.diffmerge.api.IMatch;
import org.eclipse.emf.ecore.EObject;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.IMappingNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.INameProvider;

public class MappingNode implements IMappingNode {

	protected IMappingNode parent;
	protected List<IMappingNode> children;
	protected IComparison intrinsicComparison;
	
	protected Collection<IMatch> subTreeMatches;
	protected boolean isComputed;
	protected INameProvider nameProvider;
	
	public MappingNode(IComparison intrinsicComparison) {
		this(null, intrinsicComparison, new INameProvider.DefaultNameProvider());
	}
	
	public MappingNode(IComparison intrinsicMatches, INameProvider nameProvider) {
		this(null, intrinsicMatches, nameProvider);
	}
	
	public MappingNode(IMappingNode parent, IComparison intrinsicMatches, INameProvider nameProvider) {
		this.parent = parent;
		this.intrinsicComparison = intrinsicMatches;
		this.children = new ArrayList<>();
		this.subTreeMatches = null;
		this.isComputed = false;
		this.nameProvider = nameProvider;
	}

	@Override
	public Collection<IMatch> getSubtreeMatches() {
		if (!isComputed) {
			computeMatchTree();
		}
		return subTreeMatches;
	}

	protected void computeMatchTree() {
		if (isComputed) {
			return;
		}
		
		IComparison intrinsicMatches = getIntrinsicComparison();
		List<IMatch> childMatchCollection = new ArrayList<>();
		for (IMappingNode child : children) {
			childMatchCollection.addAll(child.getSubtreeMatches());
		}
		subTreeMatches = Stream.concat(intrinsicMatches.getMapping().getContents().stream(), childMatchCollection.stream()).collect(Collectors.toList());
		isComputed = true;
	}
	
	@Override
	public IComparison getIntrinsicComparison() {
		return intrinsicComparison;
	}

	@Override
	public boolean isRoot() {
		return parent == null;
	}

	@Override
	public void addChild(IMappingNode node) {
		if (!children.contains(node)) {
			children.add(node);		
			isComputed = false;
		}
	}

	@Override
	public boolean removeChild(IMappingNode node) {
		boolean isRemoved = children.remove(node);
		if (isRemoved) {
			isComputed = false;
		}
		return isRemoved;
	}

	@Override
	public List<IMappingNode> getChildren() {
		return children;
	}

	@Override
	public String getName(EObject eobject) {
		return nameProvider.getName(eobject);
	}

}
