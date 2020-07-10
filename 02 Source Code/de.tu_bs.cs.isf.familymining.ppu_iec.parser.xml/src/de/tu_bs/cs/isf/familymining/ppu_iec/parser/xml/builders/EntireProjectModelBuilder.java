package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_NAME_ATTRIBUTE;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.configuration.POUBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.configuration.VariableBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XmlDomUtility;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Resource;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Struct;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Task;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IParserFactory;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.Registry;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.RegistryService;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.iec.IECRegistry;

public class EntireProjectModelBuilder {

	private ConfigurationFactory configFactory = ConfigurationFactory.eINSTANCE;
	private IParserFactory parserFactory;
	private Configuration config;
	
	public EntireProjectModelBuilder(IParserFactory parserFactory) {
		this.parserFactory = parserFactory;
		initializeRegistries();
	}

	private void initializeRegistries() {
		RegistryService<IECRegistry> registryService = RegistryService.getInstance();
		
		Registry<POU> pouRegistry = new Registry<POU>(instance -> instance != null ? instance.getIdentifier() : null);
		registryService.provide(IECRegistry.POU_REG, pouRegistry);
	
		Registry<Struct> typeRegistry = new Registry<Struct>(instance -> instance != null ? instance.getName() : null);
		registryService.provide(IECRegistry.TYPE_REG, typeRegistry);
	
		Registry<Variable> localVarRegistry = new Registry<Variable>(instance -> instance != null ? instance.getName() : null);
		registryService.provide(IECRegistry.LOCAL_VAR_REG, localVarRegistry);
	
		Registry<Action> localActionRegistry = new Registry<Action>(instance -> instance != null ? instance.getName() : null);
		registryService.provide(IECRegistry.LOCAL_ACTION_REG, localActionRegistry);
	}

	public Configuration buildConfiguration(ParserNode root) {
		// throw out all the stored instances from the last pass (if existent)
		RegistryService.getInstance().reset(true);
		
		if (name(root).equals("project")) {
			this.config = configFactory.createConfiguration();
			
			root.consumeChild(NODE_NAME_ATTRIBUTE, "contentHeader", contentHeaderNode -> {
				String configName = contentHeaderNode.get("name");
				config.setIdentifier( configName != null ? configName : UUID.randomUUID().toString() );
			});
			
			// for entire projects
			for (ParserNode dataNode : getDataNodes(root)) {
				ParserNode resourceNode = dataNode.getChildByAttribute(NODE_NAME_ATTRIBUTE, "resource");
				if (resourceNode != null) {
					Resource res = buildResource(resourceNode);
		        	config.getResources().add(res);				
				}
			}
		} else {
			throw new IllegalArgumentException(illegalTagMessage(root));
		}
		
		// remove the instances from the current pass
		RegistryService.getInstance().reset(true);
		
		return config;
	}

	private List<ParserNode> getDataNodes(ParserNode addDataParentNode) {
		try {
			ParserNode addDataNode = XmlDomUtility.getChildOf(addDataParentNode, "addData");
			return addDataNode.getChildren();
		} catch (NullPointerException e) {
			throw new NullPointerException(nullpointerChildMessage(name(addDataParentNode), "addData"));
		}
	}

	private Resource buildResource(ParserNode resourceNode) {
		if (name(resourceNode).equals("resource")) {
			Resource resource = configFactory.createResource();
			resource.setName(resourceNode.get("name"));
			
			for (ParserNode resourceChild : resourceNode.getChildren()) {
				if (name(resourceChild).equals("task")) {
					Task task = buildTask(resourceChild);
					resource.getTasks().add(task);
				} else if (name(resourceChild).equals("globalVars")) {
					List<Variable> globalVars = buildGlobalVars(resourceChild);
					resource.getGlobalVariables().addAll(globalVars);
				} else if (name(resourceChild).equals("addData")) {
					resourceChild.getChildren().forEach(dataNode -> dispatchResourceData(dataNode, resource));
				}
			}		
			return resource;
		} else {
			throw new IllegalArgumentException(illegalTagMessage(resourceNode));
		}
	}

	private Task buildTask(ParserNode taskNode) {
		Task task = configFactory.createTask();
    	task.setName(taskNode.get("name"));
    	
    	// searched for monitored POU
    	taskNode.consumeChild(NODE_NAME_ATTRIBUTE, "pouInstance", pouInstanceNode -> {
    		String pouName = pouInstanceNode.get("name");
    		if (pouInstanceNode != null && !pouName.isEmpty()) {
    			// connect task to pou
    			Registry<POU> pouRegistry = RegistryService.getInstance().getService(IECRegistry.POU_REG);
    			pouRegistry.performAction(pouName, pou -> {
    				task.setControlledPrograms(pou);
    				pou.getControlTasks().add(task);
    			});
    		}    		
    	});
    	return task;
	}
	
	private List<Variable> buildGlobalVars(ParserNode globalVarsNode) {
		if (name(globalVarsNode).equals("globalVars")) {
			List<Variable> variables = new ArrayList<>();
			for (ParserNode globalVarsChildNode : globalVarsNode.getChildren()) {
				if (name(globalVarsChildNode).equals("variable")) {
					Variable globalVar = new VariableBuilder(configFactory).buildGlobalVariable(globalVarsChildNode);
					variables.add(globalVar);
				}
			}
			return variables;
		} else {
			throw new IllegalArgumentException(illegalTagMessage(globalVarsNode));
		}
	}

	private void dispatchResourceData(ParserNode dataNode, Resource resource) {
		if (dataNode.get(NODE_NAME_ATTRIBUTE).equals("data")) {
			dataNode.consumeChild(NODE_NAME_ATTRIBUTE, "dataType", dataTypeNode -> {
				Struct struct = buildDataType(dataTypeNode);
				resource.getTypes().add(struct);

				// add struct type to the global type registry 
				RegistryService.getInstance().getService(IECRegistry.TYPE_REG).register(struct);
			});
		
			dataNode.consumeChild(NODE_NAME_ATTRIBUTE, "pou", pouNode -> {
				POU p = new POUBuilder(configFactory, parserFactory).buildPOU(pouNode);
				resource.getPous().add(p);
				
				// add POU to the global POU registry 
				RegistryService.getInstance().<POU>getService(IECRegistry.POU_REG).register(p);				
			});
		} else {
			throw new IllegalArgumentException(illegalTagMessage(dataNode));
		}
	}
	
	private Struct buildDataType(ParserNode dataTypeNode) {
		if (name(dataTypeNode).equals("dataType")) {
			ParserNode baseTypeNode = XmlDomUtility.getChildOf(dataTypeNode, "baseType");
        	ParserNode structNode = XmlDomUtility.getChildOf(baseTypeNode, "struct");
        	Struct dataTypeDecl = configFactory.createStruct();
        	dataTypeDecl.setName(dataTypeNode.get("name"));
        	for (ParserNode structChildNode : structNode.getChildren()) {
        		Variable variable = new VariableBuilder(configFactory).buildLocalVariable(structChildNode);
        		dataTypeDecl.getVariables().add(variable);
        	}
        	return dataTypeDecl;
		} else {
			throw new IllegalArgumentException(illegalTagMessage(dataTypeNode));
		}
	}

	/**
	 * Returns name of the xml element node
	 * 
	 * @param node
	 * @return
	 */
	public static String name(ParserNode node) {
		return node.get(NODE_NAME_ATTRIBUTE);
	}
	
	static String nullpointerChildMessage(String parent, String child) {
		return "The \""+child+"\" node is not a child of "+parent+".";
	}

	public static String illegalTagMessage(ParserNode illegalNode) {
		return "The tag "+ illegalNode.get(NODE_NAME_ATTRIBUTE)+ " cannot be matched.";
	}
}
