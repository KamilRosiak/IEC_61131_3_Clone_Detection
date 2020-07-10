
package de.tu_bs.cs.isf.familymining.rcp_e4.core.parts.properties_view.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.wb.swt.SWTResourceManager;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Literal;
import de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.EMFModelLoader.impl.EMFModelLoader;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.util.FileHandlingUtility;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.parts.properties_view.PropertieViewController;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.parts.properties_view.string_table.PropStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;


public class PropertieView {
	
	private Table _table;
	private TableViewer _tableViewer;
	private TableLayout _layout;
	private Listener fileListener;
	//these items represent a row in the table and show the value of the properties
	private TableItem _headingItem;

	private boolean SHOW_GLOBAL_VARS = true;
	private boolean SHOW_POUS = true;
	private boolean EXPAND_VARS = true;
	private boolean SHOW_RESOURCES = true;
	private boolean SHOW_CALLS = true;
	int num_function, num_program, num_functionblock, num_actions, num_vars, index;
	
	
	public PropertieView(Composite parent, PropertieViewController controller ) {
		init(parent);
	}
	
	public void init(Composite parent) {
		Composite tableComp = new Composite(parent, SWT.NONE);
		FillLayout fileLayout = new FillLayout();
		tableComp.setLayout(fileLayout);
		//create the tableViewer
		_tableViewer = new TableViewer(tableComp, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		_layout = new TableLayout();
		_table = _tableViewer.getTable();
		_table.setLinesVisible(true);
		_table.setHeaderForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		_table.setHeaderBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		
		TableViewerColumn _fileNameColumn = new TableViewerColumn(_tableViewer, SWT.LEAD);
		TableColumn tblclmnProperty = _fileNameColumn.getColumn();
		
		tblclmnProperty.setText(PropStringTable.HEADING_PROPERTY);
		TableViewerColumn _filePathColumn = new TableViewerColumn(_tableViewer, SWT.LEAD);
		TableColumn tblclmnValue = _filePathColumn.getColumn();
		tblclmnValue.setText(PropStringTable.HEADING_VALUE);
		_layout.addColumnData(new ColumnWeightData(20,true));
		_layout.addColumnData(new ColumnWeightData(80,800,true));

		_tableViewer.getTable().setLayout(_layout);
		
		intiInput();
		_tableViewer.setContentProvider(ArrayContentProvider.getInstance());
	}
	
	/**
	 * Initializing the elements of the view and binding it with the selection
	 */
	public void intiInput() {
		
		_tableViewer.getTable().removeAll();
        //Headings
        _headingItem = new TableItem(_table, SWT.NONE);
        _headingItem.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
        _headingItem.setFont(SWTResourceManager.getFont("Arial", 10, SWT.BOLD));
        _headingItem.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
        _headingItem.setText(new String[] {"Property","Value"});
        
	}
	
    public TableItem addTableItem(Table root, String propertyName, String value) {
    	TableItem newTableItem = new TableItem(root, SWT.NONE);
    	
        newTableItem.setFont(SWTResourceManager.getFont("Arial", 8, SWT.BOLD));
        newTableItem.setText(new String[] {propertyName, value});
        
        _tableViewer.getTable().redraw();
        
        return newTableItem;
    }
	
	
	/**
	 * This method shows information about a empty file.
	 */
	public void setEmptyItem() {
		intiInput();
        addTableItem(_table, PropStringTable.FILE_NAME,"");
        addTableItem(_table, PropStringTable.FILE_PATH,"");
        addTableItem(_table, PropStringTable.FILE_SIZE,"");
	}
	
	/**
	 * This method shows information about a file like , name and size.
	 */
	public void showFile(FileTreeElement file) {
        intiInput();
        addTableItem(_table, PropStringTable.FILE_NAME,FileHandlingUtility.getFilename(file));
        addTableItem(_table, PropStringTable.FILE_PATH,file.getAbsolutePath());
        addTableItem(_table,PropStringTable.FILE_SIZE,String.valueOf(file.getSize())+" bytes");
	}
	
	/**
	 * IMPLEMENTATION FOR .project
	 */
	public void showProjectFile(FileTreeElement file) {
		Configuration currentModel = (Configuration) EMFModelLoader.load(file.getAbsolutePath(), E4CStringTable.FILE_ENDING_CONFIGURATION);
		int num_resources = currentModel.getResources().size();

		
		intiInput();
        addTableItem(_table, PropStringTable.FILE_NAME,FileHandlingUtility.getFilename(file));
        addTableItem(_table, PropStringTable.FILE_PATH,file.getAbsolutePath());
        addTableItem(_table,PropStringTable.FILE_SIZE,String.valueOf(file.getSize())+" bytes");
        addTableItem(_table, PropStringTable.NUM_RESOURCES, num_resources + "");
        
        if (fileListener != null) {
			_table.removeListener(SWT.Selection, fileListener);	
		}
		
		fileListener = new Listener() {
			@Override
			public void handleEvent(Event e) {
			    if (e.item.toString().toLowerCase().contains("resources")) {
			    	list_resources(file);
			    }
			    else if (stringContainsNumber(e.item.toString())) {
			    	String resource_index = "";
			    	Pattern p = Pattern.compile("\\d+");
			        Matcher m = p.matcher(e.item.toString());
			        while(m.find()) {
			        	resource_index = m.group();
			        }
			        index = Integer.parseInt(resource_index);
		        	index = index - 1;
			        open_resource(file);
			    }
			    else if (e.item.toString().toLowerCase().contains("global")) {
			    	first_rows(file, num_resources);
			    	update(currentModel, "global");
		    	}
			    else if (e.item.toString().toLowerCase().contains("pous")) {
			    	first_rows(file, num_resources);
			    	update(currentModel, "pous");
			    }
			    else if (e.item.toString().toLowerCase().contains("calls")) {
			    	first_rows(file, num_resources);
			    	update(currentModel, "open_calls");
			    }
			    else if (e.item.toString().toLowerCase().contains("variable")) {
			    	first_rows(file, num_resources);
			    	update(currentModel, "vars");
			    }  
			}
		};

		_table.addListener(SWT.Selection,fileListener);
	}

	public boolean stringContainsNumber(String s) {
	    return Pattern.compile("[0-9]").matcher(s).find();
	}
	
	public void first_rows(FileTreeElement file, int num_resources)  {		
		intiInput();
        addTableItem(_table, PropStringTable.FILE_NAME,FileHandlingUtility.getFilename(file));
        addTableItem(_table, PropStringTable.FILE_PATH,file.getAbsolutePath());
        addTableItem(_table,PropStringTable.FILE_SIZE,String.valueOf(file.getSize())+" bytes");
        addTableItem(_table, PropStringTable.NUM_RESOURCES, num_resources + "");
	}
	
	public void list_resources(FileTreeElement file) {
		Configuration currentModel = (Configuration) EMFModelLoader.load(file.getAbsolutePath(), E4CStringTable.FILE_ENDING_CONFIGURATION);
		int num_resources = currentModel.getResources().size();
		first_rows(file, num_resources);
      
        if (SHOW_RESOURCES == true) {
        	for (int i =0; i < num_resources; i++) {
        		addTableItem(_table, (i + 1) + ".", currentModel.getResources().get(i).getName());
        	}
        	SHOW_RESOURCES = false;
        }  
        else {
        	SHOW_RESOURCES = true;
        }
	}
	
	public void open_resource(FileTreeElement file) {
		Configuration currentModel = (Configuration) EMFModelLoader.load(file.getAbsolutePath(), E4CStringTable.FILE_ENDING_CONFIGURATION);
		int num_resources = currentModel.getResources().size();
		
		first_rows(file, num_resources);
        
    	int num_global_vars = currentModel.getResources().get(index).getGlobalVariables().size();
    	int num_pous = currentModel.getResources().get(index).getPous().size();
    	num_program = 0;
    	num_function = 0;
    	num_functionblock = 0;
    	num_actions = 0;
    	num_vars = 0;
    	
    	addTableItem(_table, "Resource name", currentModel.getResources().get(index).getName()).setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
    	addTableItem(_table, PropStringTable.GLOBAL_VARIABLES_SIZE, num_global_vars + "");
    	addTableItem(_table, PropStringTable.POUS_SIZE, num_pous + "");
    	addTableItem(_table, "POU calls", "Callers  | Callees");
    	
    	for(int j = 0; j < num_pous; j++) {
    		if(currentModel.getResources().get(index).getPous().get(j).getType().toString().equalsIgnoreCase("program")) {
    			num_program += 1;
    		}
    		if (currentModel.getResources().get(index).getPous().get(j).getType().toString().equalsIgnoreCase("function")) {
    			num_function += 1;
    		}
    		if (currentModel.getResources().get(index).getPous().get(j).getType().toString().equalsIgnoreCase("functionblock")) {
    			num_functionblock += 1;
    		}
    		num_actions += currentModel.getResources().get(index).getPous().get(j).getActions().size();
    		num_vars += currentModel.getResources().get(index).getPous().get(j).getDeclaration().getOutputVariables().size();
    		num_vars += currentModel.getResources().get(index).getPous().get(j).getDeclaration().getInputVariables().size();
    		num_vars += currentModel.getResources().get(index).getPous().get(j).getDeclaration().getInternalVariables().size();
    	}
    	
    	addTableItem(_table, "POU Types", "PROGRAM: " + num_program + "   |   FUNCTION: " + num_function + "   |   FUNCTIONBLOCK: " + num_functionblock);
    	addTableItem(_table, "# Actions", num_actions + "");
    	addTableItem(_table, "# Variables", num_vars + "");
	}
	
	public void update(Configuration currentModel, String x) {
		int num_global_vars = currentModel.getResources().get(index).getGlobalVariables().size();
		int num_pous = currentModel.getResources().get(index).getPous().size();

        addTableItem(_table, "Resource name", currentModel.getResources().get(index).getName()).setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
    	
        if ( x != "global") {
        	addTableItem(_table, PropStringTable.GLOBAL_VARIABLES_SIZE, num_global_vars + "");
        }
        
        if (x == "global" && SHOW_GLOBAL_VARS == true) {
        	addTableItem(_table, PropStringTable.GLOBAL_VARIABLES_SIZE, num_global_vars + "").setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
        	for (int i = 0; i < num_global_vars; i++) {
        		Variable globalVar = currentModel.getResources().get(index).getGlobalVariables().get(i);
        		String initialValue = "";
        		if (globalVar.getInitialValue() instanceof Literal) {
        			initialValue = ((Literal) globalVar.getInitialValue()).getSymbol();
        		}
        		addTableItem(_table, "", globalVar.getName() + ": " + initialValue);        			
        	}
        	SHOW_GLOBAL_VARS = false;
        } else if (x == "global" && SHOW_GLOBAL_VARS == false) {
        	addTableItem(_table, PropStringTable.GLOBAL_VARIABLES_SIZE, num_global_vars + "");
        	SHOW_GLOBAL_VARS = true;
        }
        
        if (x != "pous") {
        	addTableItem(_table, PropStringTable.POUS_SIZE, num_pous + "");
        }
        	
		if (x == "pous" && SHOW_POUS == true) {
			addTableItem(_table, PropStringTable.POUS_SIZE, num_pous + "").setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
    		for (int i = 0; i < num_pous; i++) {
    			addTableItem(_table, "", currentModel.getResources().get(index).getPous().get(i).getIdentifier());
    		}
    		SHOW_POUS = false;
    	} else if (x == "pous" && SHOW_POUS == false) {
    		addTableItem(_table, PropStringTable.POUS_SIZE, num_pous + "");
    		SHOW_POUS = true;
    	}
		
		if (x != "open_calls") {
			addTableItem(_table, "POU calls", "Callers  | Callees");
		}
		
		if (x == "open_calls" && SHOW_CALLS == true) {
			addTableItem(_table, "POU calls", "Callers  | Callees").setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
			for (int i = 0; i < num_pous; i++) {
				String callers = "";
				String callees = "";
				int num_callers = currentModel.getResources().get(index).getPous().get(i).getCallers().size();
				int num_callees = currentModel.getResources().get(index).getPous().get(i).getCallees().size();
						
				for (int j = 0; j < num_callers; j++) {
					if (j == num_callers - 1) {
						callers += currentModel.getResources().get(index).getPous().get(i).getCallers().get(j).getIdentifier();
					} else {
						callers += currentModel.getResources().get(index).getPous().get(i).getCallers().get(j).getIdentifier() + ", ";
					}	
				}	
				for (int j = 0; j < num_callees; j++) {
					if (j == num_callees - 1) {
						callees += currentModel.getResources().get(index).getPous().get(i).getCallees().get(j).getIdentifier();
					} else {
						callees += currentModel.getResources().get(index).getPous().get(i).getCallees().get(j).getIdentifier() + ", ";
					}
				}
				
				if (callers != "" || callees != "") {
					addTableItem(_table, currentModel.getResources().get(index).getPous().get(i).getIdentifier(), "callers: " + callers);
					addTableItem(_table, "", "callees: " + callees);
				}
			}	
			SHOW_CALLS = false;
		} else if(x == "open_calls" && SHOW_CALLS == false){
			addTableItem(_table, "POU calls", "Callers  | Callees");
			SHOW_CALLS = true;
		}
		
		addTableItem(_table, "POU Types", "PROGRAM: " + num_program + "   |   FUNCTION: " + num_function + "   |   FUNCTIONBLOCK: " + num_functionblock);
		addTableItem(_table, "# Actions", num_actions + "");
		
		if (x != "vars") {
			addTableItem(_table, "# Variables", num_vars + "");
		}
		
		if (EXPAND_VARS == true && x == "vars") {
			addTableItem(_table, "# Variables", num_vars + "").setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
    		int num_input = 0;
    		int num_output = 0;
    		int num_internal = 0;
			for (int i = 0; i < num_pous; i++) {
				num_input += currentModel.getResources().get(index).getPous().get(i).getDeclaration().getInputVariables().size();
				num_output += currentModel.getResources().get(index).getPous().get(i).getDeclaration().getOutputVariables().size();
				num_internal += currentModel.getResources().get(index).getPous().get(i).getDeclaration().getInternalVariables().size();
			}
			addTableItem(_table, "          # Input", num_input + "");
			addTableItem(_table, "          # Output", num_output + "");
			addTableItem(_table, "          # Internal", num_internal + "");
			EXPAND_VARS = false;
    	} else if (EXPAND_VARS == false && x == "vars") {
			addTableItem(_table, "# Variables", num_vars + "");
			EXPAND_VARS = true;
		}
	}
}
