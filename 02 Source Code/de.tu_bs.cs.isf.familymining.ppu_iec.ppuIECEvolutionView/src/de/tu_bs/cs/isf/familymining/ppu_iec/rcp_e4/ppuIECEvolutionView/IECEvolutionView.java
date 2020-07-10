package de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.ppuIECEvolutionView;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TreeItem;


public class IECEvolutionView {
	private TreeItem _root;
	private TreeViewer _treeViewer;
	public IECEvolutionView() {
		
	}
	public void createControl(Composite parent) {


		parent.setLayout(new GridLayout(1,false));
		
		Group controlPanel = new Group(parent, SWT.NONE);
		controlPanel.setLayout(new FillLayout(SWT.HORIZONTAL));
		controlPanel.setText("Control");
		
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		controlPanel.setLayoutData(gridData);
		

		//Set ups the expand button
		Button expandButton = new Button(controlPanel,SWT.NONE);
		expandButton.setText("Expand Tree");
		expandButton.addListener(SWT.Selection, e -> {
			/// IMMMMMMMDASIDJASDIASJDAIDAID
		});
		
		//Set ups the colapse button
		Button colapseButton = new Button(controlPanel,SWT.NONE);
		colapseButton.setText("Colapse Tree");
		colapseButton.addListener(SWT.Selection, e -> {
			/// IMMMMMMMDASIDJASDIASJDAIDAID
		});
		controlPanel.pack();
		
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessVerticalSpace = true;
		_treeViewer.getTree().setLayoutData(gridData);

		set_root(new TreeItem(_treeViewer.getTree(), SWT.NONE));
	}
	
	public void addModel() {
		
	}
	
	public TreeItem get_root() {
		return _root;
	}
	public void set_root(TreeItem _root) {
		this._root = _root;
	}
}
