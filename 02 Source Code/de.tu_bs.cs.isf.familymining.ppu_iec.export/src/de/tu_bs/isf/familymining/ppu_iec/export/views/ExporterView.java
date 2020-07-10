package de.tu_bs.isf.familymining.ppu_iec.export.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.isf.familymining.ppu_iec.export.constants.FileTable;

public class ExporterView {

	protected Shell shell;
	private Text inputPath;
	private Text outputPath;
	private Text contentHeaderName;
	private Button exportButton;
	private Button cancelButton;
	private Button inputButton;
	private Button outputButton;
	private Tree familyModelTree;
	private ServiceContainer services;
	
	public ExporterView(ServiceContainer serviceContainer) {
		this.services = serviceContainer;
		createContents();
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();

		getShell().open();
		getShell().layout();
		while (!getShell().isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Close the window.
	 */
	public void close() {
		getShell().close();
	}

	/**
	 * Create contents of the window.
	 * 
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shell = new Shell(SWT.SHELL_TRIM | SWT.APPLICATION_MODAL);
		getShell().setSize(800, 550);
		getShell().setText("PLCOpenXml Exporter");
		getShell().setLayout(new GridLayout(5, false));
		getShell().setImage(services.imageService.getImage(FileTable.CORE_BUNDLE_NAME, FileTable.Icons.PLC_OPEN_ICON));

		new Label(getShell(), SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(getShell(), SWT.NONE);

		Label inputLabel = new Label(getShell(), SWT.NONE);
		inputLabel.setText("Select an input path:");
		
		new Label(getShell(), SWT.NONE);
		new Label(shell, SWT.NONE);

		Label familyModelLabel = new Label(getShell(), SWT.NONE);
		familyModelLabel.setText("Family model");
		new Label(shell, SWT.NONE);

		/*
		 * Textfield for the inputpath
		 */
		inputPath = new Text(getShell(), SWT.BORDER);
		GridData gd_inputPath = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_inputPath.minimumWidth = 200;
		gd_inputPath.widthHint = 200;
		getInputPath().setLayoutData(gd_inputPath);
		
		/*
		 * creating Button for setting the inputpath
		 */
		inputButton = new Button(getShell(), SWT.NONE);
		inputButton.setText("Select");
		
		new Label(shell, SWT.NONE);

		familyModelTree = new Tree(getShell(), SWT.BORDER | SWT.CHECK);
		GridData gd_familyModelTree = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 9);
		gd_familyModelTree.minimumWidth = 200;
		gd_familyModelTree.widthHint = 200;
		familyModelTree.setLayoutData(gd_familyModelTree);

		new Label(getShell(), SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(shell, SWT.NONE);

		Label outputLabel = new Label(getShell(), SWT.NONE);
		outputLabel.setText("Select an output path:");
		new Label(getShell(), SWT.NONE);
		new Label(shell, SWT.NONE);

		/*
		 * Textfield for the outputpath
		 */
		outputPath = new Text(getShell(), SWT.BORDER);
		GridData gd_outputPath = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_outputPath.minimumWidth = 200;
		gd_outputPath.widthHint = 200;
		getOutputPath().setLayoutData(gd_outputPath);

		/* 
		 * creating Button for setting the outputpath
		 */
		outputButton = new Button(getShell(), SWT.NONE);
		outputButton.setText("Select");

		new Label(getShell(), SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);

		Label contentHeaderLable = new Label(getShell(), SWT.NONE);
		contentHeaderLable.setText("Set name for ContentHeader:");
		new Label(getShell(), SWT.NONE);
		new Label(shell, SWT.NONE);

		/*
		 * Textfield for the contentheader name
		 */
		contentHeaderName = new Text(getShell(), SWT.BORDER);
		GridData gd_contentHeaderName = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_contentHeaderName.minimumWidth = 200;
		gd_contentHeaderName.widthHint = 200;
		getContentHeaderName().setLayoutData(gd_contentHeaderName);

		new Label(getShell(), SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(getShell(), SWT.NONE);
		new Label(shell, SWT.NONE);

		cancelButton = new Button(getShell(), SWT.NONE);
		cancelButton.setText("Cancel");

		exportButton = new Button(getShell(), SWT.NONE);
		exportButton.setEnabled(false);

		exportButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		exportButton.setText("Export");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);

	}
	
	public Shell getShell() {
		return shell;
	}

	public Text getInputPath() {
		return inputPath;
	}

	public Text getOutputPath() {
		return outputPath;
	}

	public Text getContentHeaderName() {
		return contentHeaderName;
	}

	public Button getExportButton() {
		return exportButton;
	}

	public Button getCancelButton() {
		return cancelButton;
	}

	public Button getInputButton() {
		return inputButton;
	}

	public Button getOutputButton() {
		return outputButton;
	}

	public Tree getFamilyModelTree() {
		return familyModelTree;
	}

}
