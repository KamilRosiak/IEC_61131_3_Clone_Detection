package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.gui;

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.match.interfaces.AbstractMatcher;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.key_value.KeyValueNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;

public class ComboGroup {
	private KeyValueNode matcherValue;
	private ComboViewer matchViewer;
	
	public ComboGroup(Composite parent, int style, KeyValueNode matcherValue) {
		this.matcherValue = matcherValue;
		createControl(parent, style);
	}
	
	private void createControl(Composite parent, int style) {
		Composite comp = new Composite(parent, style);
		comp.setLayout(new GridLayout(3,false));
		comp.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		Label description = new Label(comp, SWT.None);
		description.setText("Default Matcher:");
		

		matchViewer = new ComboViewer(comp, SWT.READ_ONLY);
		matchViewer.getCombo().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		matchViewer.setContentProvider(ArrayContentProvider.getInstance());
		matchViewer.setLabelProvider(new LabelProvider() {
			@Override
	        public String getText(Object element) {
	            if (element instanceof AbstractMatcher) {
	            	AbstractMatcher current = (AbstractMatcher) element;
	            	return current.getName();
	            }
				return "";
	        }
		});
		List<Object> objects = RCPContentProvider.getInstanceFromBundle(PPUStringTable.MATCHER_ATTRIBUTE_SYMBOLIC_NAME, PPUStringTable.MATCHER_ATTR_EXTENSION);
		AbstractMatcher defaultMatcher = null;
		int i = 0;
		for(Object obj : objects) {
			if(obj instanceof AbstractMatcher) {
				AbstractMatcher matcher = (AbstractMatcher)obj;
				matchViewer.insert(matcher, i);
				if(matcher.getName().equals(matcherValue.getStringValue())) {
					defaultMatcher = matcher;
				}
				i++;
			}
		}
		
		matchViewer.getCombo().addListener(SWT.Selection, e -> {
			matcherValue.setValue(getMatcher().getName());
		});
		
		if(defaultMatcher != null) {
			matchViewer.setSelection(new StructuredSelection(defaultMatcher));
		} else {
			matchViewer.setSelection(new StructuredSelection((AbstractMatcher)objects.get(0)));
		}

	}
	
	
	/**
	 * Returns the selected matcher when no matcher available returns null.
	 */
	public AbstractMatcher getMatcher() {
		StructuredSelection selection = (StructuredSelection) matchViewer.getSelection();
		if(selection.getFirstElement() instanceof AbstractMatcher) {
			AbstractMatcher matcher = (AbstractMatcher)selection.getFirstElement();
			return matcher;
		}
		return null;
	}
	
	
	public KeyValueNode getKeyValueNode() {
		return matcherValue;
	}
}
