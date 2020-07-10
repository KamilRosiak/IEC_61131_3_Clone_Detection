package de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.result_view.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPPartService;

@Creatable 
public class ResultView {
	@Inject RCPPartService _partService;
	private Label _myLabelInView;
	private ConfigurationResultRoot compareRoot;

	@PostConstruct
	public void createPartControl(Composite parent) {
		_myLabelInView = new Label(parent, SWT.BORDER);
		_myLabelInView.setText("Implementation of IEC Graphical DSL here. The code is in the de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.iec_editor plugin.");
	}

	@Focus
	public void setFocus() {
		_myLabelInView.setFocus();
	}

	/**
	 * After compare process the compare engine send a RESULT_EVENT with a reference on the result object that calls this method.
	 * 
	 */
	@Inject
	@Optional
	public void loadConfiguration(@UIEventTopic(PPUEventTable.RESULT_EVENT) Object o) {	
		compareRoot = (ConfigurationResultRoot) o;
		_myLabelInView.setText("This is result view: "+String.valueOf(compareRoot.getSimilarity()));
		//focus on this part 
		_partService.showPart("de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.family_view"); 
	}

}
