package de.tu_bs.isf.familymining.ppu_iec.export.components.treebuilders;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.isf.familymining.ppu_iec.export.components.FMTreeBuilder;
import de.tu_bs.isf.familymining.ppu_iec.export.components.FMTreeOptionProcessor;
import de.tu_bs.isf.familymining.ppu_iec.export.constants.FileTable;
import de.tu_bs.isf.familymining.ppu_iec.export.constants.StringTable;

/**
 * An example class to show, how to rebuild the Tree from the FamilyModelView
 * with an {@link FMTreeBuilder}.
 * 
 * @author Fabian Ochmann
 *
 */
public class FamilyModelViewFMTreeBuilder extends BasicFMTreeBuilder {
	
	public static final int REQUIRED_STYLE = SWT.ICON;

	public FamilyModelViewFMTreeBuilder(Tree tree, ServiceContainer services) {
		super(tree, services);
	}

	@Override
	public int requiredTreeStyle() {
		return REQUIRED_STYLE;
	}

	@Override
	protected void buildRightClickMenu(Menu rightClickMenu, TreeItem treeItem) {
		// Uses a fragment-based context menu
	}

	@Override
	protected Listener getSelectionListener() {
		return null;
	}

	@Override
	protected void clean() {
		getTree().removeAll();
	}

	@Override
	protected void preOptionProcessing() {
		//Nothing to do
	}

	@Override
	protected void postOptionProcessing() {
		getTree().getShell().layout();
	}

	@Override
	protected TreeItem initRootItem() {
		//create tree root 
		TreeItem rootTreeItem = new TreeItem(getTree(), SWT.ICON);
		rootTreeItem.setImage(getServices().imageService.getImage(StringTable.BUNDLE_NAME, FileTable.Icons.FV_ROOT_16));
		String name = getFirstScenarioName()+"_"+getSecondScenarioName()+"_Family_Model";
		rootTreeItem.setText(name);
		
		if(!getCompareRoot().getChildren().isEmpty()) {
			rootTreeItem.setData(getCompareRoot().getChildren().get(0));
		}
		
		return rootTreeItem;
	}

	@Override
	protected FMTreeOptionProcessor getOptionProcessor() {
		return new BasicFMTreeProcessor(this);
	}

	@Override
	protected TreeItem createItem(TreeItemType type, TreeItem parent, String text, Object data) {
		switch (type) {
		case MANDATORY:
			return createMandatoryItem(parent, text, data);
		case OPTIONAL:
			return createOptionalItem(parent, text, data);
		case UNCOMPARED:
			return createUncomparedItem(parent, text, data);
		case ALTERNATIVE:
			TreeItem item = createAlternativeItem(parent, text, data);
			if(data instanceof IECAbstractContainer<?>) {
				IECAbstractContainer<?> cont = (IECAbstractContainer<?>)data;
				if (cont.getFirst() != null && !cont.getFirst().equals(cont.getSecond())) {
					createLeftAlternativeItem(item, "Source Model", cont.getFirst());	
					createRightAlternativeItem(item, "Target Model", cont.getSecond());
				}
			}
			return item;
		default:
			return null; //This line should never be reached
		}
	}

}
