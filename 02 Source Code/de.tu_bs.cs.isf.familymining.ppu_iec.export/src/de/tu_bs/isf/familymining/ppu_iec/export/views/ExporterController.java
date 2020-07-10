package de.tu_bs.isf.familymining.ppu_iec.export.views;

import java.io.File;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.xml.bind.JAXBException;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.xml.sax.SAXException;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util.SolutionSerializer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.isf.familymining.ppu_iec.export.components.FMTreeBuilder;
import de.tu_bs.isf.familymining.ppu_iec.export.components.selection.FMSelection;
import de.tu_bs.isf.familymining.ppu_iec.export.components.selection.extractors.FMSelectionExtractors;
import de.tu_bs.isf.familymining.ppu_iec.export.components.treebuilders.SelectionFMTreeBuilder;
import de.tu_bs.isf.familymining.ppu_iec.export.exporter.PLCOpenXmlExporter;

public class ExporterController {
	
	ServiceContainer serviceContainer;

	
	@Inject
	private PLCOpenXmlExporter exporter;
	
	private ExporterView exporterView;
	
	private FMTreeBuilder treeBuilder;
	
	private String outputPath;
	
	public static String cHName;
	
	public ExporterController(ServiceContainer serviceContainer) {
		this.serviceContainer = serviceContainer;
		initView();
	}
	
	//getter for contentheader name
	public static String getCHName() {
        return cHName;
    }
	
	//setter for contentheader name
    public void setCHName(String value) {
        ExporterController.cHName = value;
    }
    
	@PostConstruct
	private void initView() {
		exporterView = new ExporterView(serviceContainer);
		exporterView.getInputButton().addSelectionListener(new SelectionAdapter() {			
			@Override
			public void widgetSelected(SelectionEvent e) {
				String selectedModelPath = RCPMessageProvider.getFilePathDialog("Select Family Model",
						E4CStringTable.FAMILY_MODEL_DIRECTORY);
				checkAndSetFamilyModel(selectedModelPath);
				enableExportButton();
				
				
			}
		});
		
		
		exporterView.getCancelButton().addSelectionListener(new SelectionAdapter() {			
			@Override
			public void widgetSelected(SelectionEvent e) {
				exporterView.close();
			}
		});
		
		exporterView.getExportButton().addSelectionListener(new SelectionAdapter() {			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				setCHName(exporterView.getContentHeaderName().getText());
				String test = getCHName();
				if (test.equals("")) {
					MessageDialog.openError(exporterView.getShell(), "Export was not successful", "Please select a ContentHeader Name!");
					return;
				}
				
				FMSelection selection = FMSelectionExtractors.fromTree().extract(treeBuilder.getTree());
				
				try {
					exporter.export(selection, outputPath);
					MessageDialog.openInformation(exporterView.getShell(), "Export was successful", "The PLCOpenXML was successfully exported!");
				} catch (ClassNotFoundException | JAXBException | SAXException exception) {
					exception.printStackTrace();
					MessageDialog.openError(exporterView.getShell(), "Error during export", "An error occured during the export!");
				}
			}
		});		
		
		/* 
		 * selection listener for the outputbutton
		 * sets chosen outputpath
		 */
		exporterView.getOutputButton().addSelectionListener(new SelectionAdapter() {			
			@Override
			public void widgetSelected(SelectionEvent e) {
				String newOutputPath = RCPMessageProvider.getFilePathDialog("Select Output Path",
						E4CStringTable.RESULT_DIRECTORY);
				if(newOutputPath != null && !newOutputPath.isEmpty()) {
					outputPath = checkEndingXML(newOutputPath);
					exporterView.getOutputPath().setText(outputPath);
					enableExportButton();
				}
			}
		});
		
		treeBuilder = new SelectionFMTreeBuilder(exporterView.getFamilyModelTree(), serviceContainer);
	}
	
	/*
	 * enables the export button
	 * checking if compareroot and outputpath are set
	 */
	private void enableExportButton() {
		boolean enable = treeBuilder.getCompareRoot() != null && outputPath != null;
		exporterView.getExportButton().setEnabled(enable);
	}
	
	/*
	 * Checking if file has .xml at the end of its name
	 */
	private String checkEndingXML(String outputPath) {
		File modelFile = new File(outputPath);
		String modelFilePath = modelFile.getAbsolutePath();
		int modelLength = modelFilePath.length();
		String modelEnding = modelFilePath.substring(modelLength-4, modelLength);
		if(!modelEnding.equals(".xml")) {
			return modelFilePath + ".xml";
		}
		return modelFilePath;
	}
	
	
	private void checkAndSetFamilyModel(String selectedModelPath) {
		File familyModelFile = new File(selectedModelPath);
		
		if (familyModelFile != null && familyModelFile.exists() && familyModelFile.isFile()) {
			ConfigurationResultRoot result = SolutionSerializer.decode(familyModelFile.getAbsolutePath());
			
			//Update Tree
			treeBuilder.setCompareRoot(result);
			treeBuilder.refreshTree();
			
			//Update input Label
			exporterView.getInputPath().setText(familyModelFile.getAbsolutePath());
			
			//getting the Name of the FamilyModel without .family as an ending
			String modelName = familyModelFile.getName().substring(0, familyModelFile.getName().length()-7);
			setCHName(modelName);
			File outputFile = new File(RCPContentProvider.getCurrentWorkspacePath() + E4CStringTable.RESULT_DIRECTORY + "/" + modelName + ".xml");
			
			//Update output Label
			outputPath = outputFile.getAbsolutePath();
			exporterView.getOutputPath().setText(outputPath);
			
			//Update Contentheader Lable
			exporterView.getContentHeaderName().setText(cHName);
			
			
		}
	}
	
	
	public void showView(String inputPath) {	
		initView();
		if(inputPath != null) {
			checkAndSetFamilyModel(inputPath);
			enableExportButton();
		}
		exporterView.open();		
	}
}
