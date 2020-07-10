package de.tu_bs.isf.familymining.ppu_iec.export.utils;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

/**
 * A Utility-Class with methods commonly used with {@link Tree}- and
 * {@link TreeItem}-Objects
 * 
 * @author Fabian Ochmann
 *
 */
public class TreeUtils {

	private TreeUtils() {}
	
	/**
	 * Returns all items in the given Tree, including child-items.
	 */
	public static List<TreeItem> getAllItems(Tree tree){
		List<TreeItem> items = new LinkedList<>();
		
		if(tree != null) {
			for(TreeItem item : tree.getItems()) {
				items.add(item);
				items.addAll(getAllChildItems(item));
			}
		}
		
		return items;
	}
	
	/**
	 * Returns all child-items of the given TreeItem.
	 */
	public static List<TreeItem> getAllChildItems(TreeItem item){
		List<TreeItem> childItems = new LinkedList<>();
		
		if(item != null) {
			for(TreeItem child : item.getItems()) {
				childItems.add(child);
				childItems.addAll(getAllChildItems(child));
			}
		}
		
		return childItems;
	}
	
}
