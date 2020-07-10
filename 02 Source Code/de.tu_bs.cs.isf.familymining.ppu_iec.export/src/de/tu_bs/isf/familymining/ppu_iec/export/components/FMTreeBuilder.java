package de.tu_bs.isf.familymining.ppu_iec.export.components;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Tree;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;

/**
 * Classes implementing this interface have the ability to build
 * {@link Tree}-Objects representing a FamilyModel in form of a
 * {@link ConfigurationResultRoot}.
 * 
 * @author Fabian Ochmann
 * 
 */
public interface FMTreeBuilder {

	/**
	 * Clear the existing tree and rebuild it, representing the currently set
	 * {@link ConfigurationResultRoot}
	 */
	void refreshTree();

	/**
	 * Get the current set Tree.
	 * 
	 * @return The current set Tree or null if none is set
	 */
	Tree getTree();

	/**
	 * Set the Tree which should be used to represent the currently set
	 * {@link ConfigurationResultRoot}
	 * 
	 * @param tree The Tree to use
	 */
	void setTree(Tree tree);

	/**
	 * Get the currently set {@link ConfigurationResultRoot}
	 * 
	 * @return The currently set {@link ConfigurationResultRoot}, null if none is
	 *         set
	 */
	ConfigurationResultRoot getCompareRoot();

	/**
	 * Set the {@link ConfigurationResultRoot}
	 * 
	 * @param compareRoot The {@link ConfigurationResultRoot} so set
	 */
	void setCompareRoot(ConfigurationResultRoot compareRoot);

	/**
	 * The {@link ServiceContainer} for the TreeBuilder to use if needed
	 * 
	 * @return The currently set {@link ServiceContainer}, or null if none is set
	 */
	ServiceContainer getServices();

	/**
	 * Set the {@link ServiceContainer} for the TreeBuilder to use if needed
	 * 
	 * @param services The {@link ServiceContainer} to use if needed
	 */
	void setServices(ServiceContainer services);

	/**
	 * Get the Style required for this TreeBuilder to work as intened, as defined in
	 * {@link SWT}. Trees set for this TreeBuilder should have the returned Style
	 * set.
	 * 
	 * @return The Style required for this TreeBuilder to work as intened, as
	 *         defined in {@link SWT}
	 */
	int requiredTreeStyle();

}