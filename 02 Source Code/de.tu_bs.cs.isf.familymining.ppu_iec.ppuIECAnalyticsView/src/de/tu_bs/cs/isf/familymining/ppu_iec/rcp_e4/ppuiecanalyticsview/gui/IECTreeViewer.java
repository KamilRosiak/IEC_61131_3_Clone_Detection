package de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.ppuiecanalyticsview.gui;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;


public class IECTreeViewer {
	private Tree _tree;
	private TreeColumn _tblclmnItemTyp,_tblclmnCount,_tblclmnItemName;
	private List<TreeColumn> _columns;
	
	public IECTreeViewer(Composite parent) {
		_columns = new ArrayList<TreeColumn>();
		createControl(parent);
	}
	
	@PostConstruct
	public void createControl(Composite parent) {
	
		_tree = new Tree(parent, SWT.BORDER | SWT.H_SCROLL |SWT.V_SCROLL);
		_tree.setHeaderVisible(true);
		_tree.setLinesVisible(true);
		_tblclmnItemName = new TreeColumn(_tree, SWT.LEFT);
		_tblclmnItemName.setResizable(true);
		_tblclmnItemName.setMoveable(true);
		_tblclmnItemName.setWidth(200);
		_tblclmnItemName.setText("Name");
		_columns.add(_tblclmnItemName);
		
		_tblclmnItemTyp = new TreeColumn(_tree, SWT.CENTER);
		_tblclmnItemTyp.setResizable(true);
		_tblclmnItemTyp.setMoveable(true);
		_tblclmnItemTyp.setWidth(200);
		_tblclmnItemTyp.setText("Type");
		_columns.add(_tblclmnItemTyp);
		
		_tblclmnCount = new TreeColumn(_tree, SWT.RIGHT);
		_tblclmnCount.setResizable(true);
		_tblclmnCount.setMoveable(true);
		_tblclmnCount.setWidth(200);
		_tblclmnCount.setAlignment(SWT.CENTER);
		_tblclmnCount.setText("Count");
		_columns.add(_tblclmnCount);
		//Packing the guy when items expand or colapse 
		_tree.addListener(SWT.Expand, e-> {
			packColumn();
		});
	}
	
	public void addTreeItem(String name, String type,String count, int font) {
		TreeItem item = new TreeItem(_tree, SWT.NONE);
		item.setText(new String[] {name, type, count});
	}

	public void packColumn() {
		_tree.setRedraw(false);
		for(TreeColumn tc: _columns) {
			tc.pack();
		}
		_tree.setRedraw(true);
		_tree.redraw();
	}
	
	public void expandTree() {
		_tree.setRedraw(false);
		for(TreeItem t :_tree.getItems()) {
			t.setExpanded(true);
			expandRek(t);
		}
		_tree.setRedraw(true);
		packColumn();
		_tree.redraw();
	}
	
	public void expandRek(TreeItem t) {
		for(TreeItem child: t.getItems()) {
			child.setExpanded(true);
			expandRek(child);
		}
	}
	
	
	public void colapseTree() {
		_tree.setRedraw(false);
		for(TreeItem t: _tree.getItems()) {
			t.setExpanded(false);
			colapseRek(t);
		}
		_tree.setRedraw(true);
		packColumn();
		_tree.redraw();		
	}
	public void colapseRek(TreeItem t) {
		for(TreeItem child: t.getItems()) {
			child.setExpanded(false);
			colapseRek(child);
		}
	}
	
	
	
	public Tree getTree() {
		return _tree;
	}
	
	
}
