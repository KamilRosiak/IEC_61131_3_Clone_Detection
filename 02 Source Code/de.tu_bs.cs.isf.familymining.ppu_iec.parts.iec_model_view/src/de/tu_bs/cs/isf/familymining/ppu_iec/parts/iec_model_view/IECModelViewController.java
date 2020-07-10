package de.tu_bs.cs.isf.familymining.ppu_iec.parts.iec_model_view;


import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.tu_bs.cs.isf.familymining.ppu_iec.parts.iec_model_view.view.IECModelView;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import javafx.embed.swt.FXCanvas;

public class IECModelViewController {
	IECModelView view;
	
	@PostConstruct
	public void postConstruct(Composite parent, ServiceContainer services) {
		view = new IECModelView(this, new FXCanvas(parent, SWT.None), services);
	}
	
	
	
	
	
}
