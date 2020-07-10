package de.tu_bs.cs.isf.familymining.ppu_iec.core.handler;



import static de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CFileTable.ABOUT_24_ICON_PATH;
import static de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CGenInfo.RCP4_VERSION_INFO;
import static de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CGenInfo.RCP4_VERSION_RELSEASE_DATE;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPImageService;;

/**
 * This command opens a wizard that allows a user to creates a new project in the current workspace. 
 * @author {Kamil Rosiak}
 */
public class AboutHandler {
    @Inject RCPImageService _imageService;

	@Execute
	public void execute() {
		Shell dialog = new Shell(Display.getCurrent());
		dialog.setText("About");
		dialog.setLayout(new FillLayout(SWT.VERTICAL));
		dialog.setImage(_imageService.getImage(null, ABOUT_24_ICON_PATH));
		Composite comp = new Composite(dialog, SWT.None);
		comp.setLayout(new FillLayout(SWT.VERTICAL));
		
		Group copyright = new Group(comp,SWT.None);
		copyright.setLayout(new FillLayout(SWT.VERTICAL));
		copyright.setText("Copyright");
		Text copyrightNotice1 = new Text(copyright, SWT.MULTI);
		copyrightNotice1.setEnabled(false);
		copyrightNotice1.setText("\u00A9 2018");
		copyrightNotice1.append("\nTechnische Universität Braunschweig | Institut für Softwaretechnik und Fahrzeuginformatik");
		copyrightNotice1.append("\nTechnische Universität München | Lehrstuhl für Automatisierung und Informationssysteme");
		
		Group version = new Group(comp, SWT.None);
		version.setLayout(new FillLayout(SWT.VERTICAL));
		version.setText("Version");
		Text versionInfo = new Text(version, SWT.None);
		versionInfo.setEnabled(false);
		versionInfo.setText(RCP4_VERSION_INFO);
		Text releaseDate = new Text(version, SWT.None);
		releaseDate.setEnabled(false);
		releaseDate.setText(RCP4_VERSION_RELSEASE_DATE);
		
		Group funding = new Group(comp,SWT.None);
		funding.setLayout(new FillLayout(SWT.VERTICAL));
		funding.setText("Supported by");
		Text dfg = new Text(funding, SWT.MULTI);
		dfg.setEnabled(false);
		dfg.setText("German Research Foundation (DFG)");
		
		Group developers = new Group(comp,SWT.None);
		developers.setLayout(new FillLayout(SWT.VERTICAL));
		developers.setText("Developers");
		Text team = new Text(developers, SWT.MULTI);
		team.setEnabled(false);
		team.setText("Bougouffa, Safa");
		team.append("\nFischer, Juliane");
		team.append("\nRosiak, Kamil");
		team.append("\nSchlie, Alexander");
		team.append("\nUrbaniak, Oliver");
		
		
		
		dialog.setSize(600, 400);
		dialog.setVisible(true);
	}
		
}