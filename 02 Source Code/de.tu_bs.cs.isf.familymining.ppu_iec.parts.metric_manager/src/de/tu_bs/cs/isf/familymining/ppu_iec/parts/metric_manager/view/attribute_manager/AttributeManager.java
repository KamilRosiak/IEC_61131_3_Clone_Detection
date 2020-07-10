package de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.view.attribute_manager;

import java.util.List;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractActionAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractModelAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractVariableAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.ConfigurationManagerColor;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUFileTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractAttribute;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPImageService;

public class AttributeManager {
	private Shell _shell;
	private ServiceContainer _services;
	private String _point, _extensions;
	private Tree _sourceTree;
	private Tree _targetTree;
	private Tree _configTree;
	private IEventBroker _eventBroker;
	
	public AttributeManager(ServiceContainer services, String point, String extension, Tree parent, IEventBroker eventBroker) {
		_services = services;
		_point = point;
		_eventBroker = eventBroker;
		_extensions = extension;
		_configTree = parent;
		_shell = new Shell();
		shellDecorater(extension);
		createControl(_shell);
		_shell.pack();
		_shell.setVisible(true);
	}

	@PostConstruct
	public void createControl(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
	
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Group grpSource = new Group(composite, SWT.NONE);
		grpSource.setText("Select Attributs");
		grpSource.setLayout(new FillLayout(SWT.HORIZONTAL));
		buildSource(grpSource);
		
		Group group = new Group(parent, SWT.NONE);
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		group.setText("Menu");
		group.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Button btnNewButton = new Button(group, SWT.NONE);
		btnNewButton.setText("Add Attribute");
		btnNewButton.addListener(SWT.Selection, e-> {
			for(TreeItem item : _sourceTree.getItems()) {
				if(item.getChecked()) {
					if(_extensions.equals(PPUStringTable.MODEL_ATTR_EXTENSION)) {
						TreeItem newItem = new TreeItem(_configTree.getItem(0).getItem(0), SWT.ICON | SWT.CHECK);
						AbstractModelAttribute model_attr = (AbstractModelAttribute)item.getData();
						newItem.setText(new String[] {model_attr.getAttributeName(),PPUStringTable.MODEL_ATTR_TYPE ,model_attr.getAttributDescription()});
						newItem.setData(item.getData());
						newItem.setImage(_services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.MODEL_ATTRIBUTE_16));
						newItem.setBackground(ConfigurationManagerColor.MODEL_ATTR_COLOR);
					} else if(_extensions.equals(PPUStringTable.POU_ATTR_EXTENSION)) {
						TreeItem newItem = new TreeItem(_configTree.getItem(0).getItem(1), SWT.ICON | SWT.CHECK);
						AbstractPOUAttribute pou_attr = (AbstractPOUAttribute)item.getData();
						newItem.setText(new String[] {pou_attr.getAttributeName(),PPUStringTable.MODEL_ATTR_TYPE ,pou_attr.getAttributDescription()});
						newItem.setData(item.getData());
						newItem.setImage(_services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.POU_ATTRIBUTE_16));	
						newItem.setBackground(ConfigurationManagerColor.POU_ATTR_COLOR);
					} else if(_extensions.equals(PPUStringTable.ACTION_ATTR_EXTENSION)) {
						AbstractActionAttribute action_attr = (AbstractActionAttribute)item.getData();
						TreeItem newItem = new TreeItem(_configTree.getItem(0).getItem(1).getItem(2), SWT.CHECK);
						newItem.setText(new String[] {action_attr.getAttributeName(),PPUStringTable.ACTION_ATTR_TYPE});
						newItem.setData(action_attr);
						newItem.setBackground(ConfigurationManagerColor.ACTION_ATTR_COLOR);
						newItem.setImage(_services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.ACTION_ATTRIBUTE_16));
						
					} else if(_extensions.equals(PPUStringTable.VARIABLE_ATTR_EXTENSION)) {
						AbstractVariableAttribute variableAttr = (AbstractVariableAttribute)item.getData();
						TreeItem newItem = new TreeItem(_configTree.getItem(0).getItem(3),SWT.CHECK);
						newItem.setText(new String[] {variableAttr.getAttributeName(),PPUStringTable.VARIABLE_ATTR_TYPE, variableAttr.getAttributDescription()});
						newItem.setData(variableAttr);
						newItem.setBackground(ConfigurationManagerColor.VARIABLE_ATTR_COLOR);
						newItem.setImage(_services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.VARIABLE_ATTRIBUTE_16));
					}
				}
			}
			_shell.dispose();
			_eventBroker.send(PPUEventTable.UPDATE_CONFIG, "");
		});
		
		Button btnNewButton_1 = new Button(group, SWT.NONE);
		btnNewButton_1.setText("Cancel");
		btnNewButton_1.addListener(SWT.Selection,e-> {
			_shell.dispose();
		});;
	}

	public void shellDecorater(String element) {
		RCPImageService imgSer = _services.imageService;
		if(element.equals(PPUStringTable.MODEL_ATTR_EXTENSION)) {
			_shell.setImage(imgSer.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.MODEL_ATTRIBUTE_16));
			_shell.setText("Select Model Attributes");
		} else if(element.equals(PPUStringTable.POU_ATTR_EXTENSION)) {
			_shell.setImage(imgSer.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.POU_ATTRIBUTE_16));
			_shell.setText("Select Model Attributes");
		} else if(element.equals(PPUStringTable.ACTION_ATTR_EXTENSION)) {
			_shell.setImage(imgSer.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.ACTION_ATTRIBUTE_16));
			_shell.setText("Select Action Attributes");
		} else if(element.equals(PPUStringTable.VARIABLE_ATTR_EXTENSION)) {
			_shell.setImage(imgSer.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.VARIABLE_ATTRIBUTE_16));
			_shell.setText("Select Variable Attributes");
		}
	}

	public void buildSource(Composite parent) {
		_sourceTree = new Tree(parent,SWT.CHECK | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		decorateTree(_sourceTree);
		List<Object> objects = RCPContentProvider.getInstanceFromBundle(_point, _extensions);
		for(Object obj : objects) {
			Image img;
			if(obj instanceof AbstractModelAttribute) {
				AbstractModelAttribute modelAttr = (AbstractModelAttribute)obj;
				img = _services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.MODEL_ATTRIBUTE_16);
				createDecoreatedItem(img, modelAttr);
			} else if(obj instanceof AbstractPOUAttribute) {
				AbstractPOUAttribute pouAttr = (AbstractPOUAttribute)obj;
				img = _services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.POU_ATTRIBUTE_16);
				createDecoreatedItem(img, pouAttr);
			} else if(obj instanceof AbstractActionAttribute) {
				AbstractActionAttribute actionAttr = (AbstractActionAttribute)obj;
				img = _services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.ACTION_ATTRIBUTE_16);
				createDecoreatedItem(img, actionAttr);
			} else if(obj instanceof AbstractVariableAttribute) {
				AbstractVariableAttribute variableAttr = (AbstractVariableAttribute)obj;
				img = _services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.VARIABLE_ATTRIBUTE_16);
				createDecoreatedItem(img, variableAttr);
			}
		}
	}
	
	private TreeItem createDecoreatedItem(Image img, AbstractAttribute attribute) {
		TreeItem item = addTreeItem(_sourceTree);
		item.setImage(img);
		item.setText(new String[] {attribute.getAttributeName(), attribute.getAttributDescription()});
		item.setData(attribute);
		return item;
	}

	private TreeItem addTreeItem(Tree tree) {
		TreeItem tree_item = new TreeItem(tree, SWT.ICON | SWT.CHECK);
		return tree_item;	
	}
	
	
	public void buildConfiguration(Composite parent) {
		_targetTree = new Tree(parent,SWT.CHECK | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		decorateTree(_targetTree);
		//TODE: Show the items of configuration slide them in and out 
	}
	
	private void decorateTree(Tree tree) {
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		TreeColumn _tblclmnItemName = new TreeColumn(tree, SWT.LEFT);
		_tblclmnItemName.setResizable(true);
		_tblclmnItemName.setMoveable(true);
		_tblclmnItemName.setWidth(300);
		_tblclmnItemName.setText("Name");
		
		TreeColumn _tblclmnItemTyp = new TreeColumn(tree, SWT.CENTER);
		_tblclmnItemTyp.setResizable(true);
		_tblclmnItemTyp.setMoveable(true);
		_tblclmnItemTyp.setWidth(500);
		_tblclmnItemTyp.setText("Description");
	}
	
	
}
