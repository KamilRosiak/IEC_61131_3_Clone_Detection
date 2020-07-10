package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_NAME_ATTRIBUTE;

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
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IParserFactory;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.Registry;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.RegistryService;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.iec.IECRegistry;

public class SinglePOUModelBuilder {
	private ConfigurationFactory configFactory = ConfigurationFactory.eINSTANCE;
	private IParserFactory parserFactory;
	private Configuration config;
	
	public SinglePOUModelBuilder(IParserFactory parserFactory) {
		this.parserFactory = parserFactory;
		this.config = configFactory.createConfiguration();
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
		
		this.config = configFactory.createConfiguration();
		Resource resource = configFactory.createResource();
		config.getResources().add(resource);
		if (root.get(NODE_NAME_ATTRIBUTE).equals("project")) {
			ParserNode contentHeaderNode = XmlDomUtility.getChildOf(root, "contentHeader");
			if (contentHeaderNode != null) {
				try {
	        		config.setIdentifier(contentHeaderNode.get("name"));        		
	        	} catch (NullPointerException e) {
	        		config.setIdentifier(UUID.randomUUID().toString());
	        	}
				resource.setName(config.getIdentifier());
			}
			ParserNode typesNode = XmlDomUtility.getChildOf(root, "types");
			if (typesNode != null) {
				dispatchTypes(typesNode, resource);
			} 
		} else {
			throw new IllegalArgumentException(illegalTagMessage(root));
		}
		
		// remove the instances from the current pass
		RegistryService.getInstance().reset(true);
		
		return config;
	}
	
	private void dispatchTypes(ParserNode typesNode, Resource resource) {
		if (typesNode.get(NODE_NAME_ATTRIBUTE).equals("types")) {
			ParserNode dataTypeNode = XmlDomUtility.getChildOf(typesNode, "dataType");
			if (dataTypeNode != null) {
				Struct struct = buildDataType(dataTypeNode);
				resource.getTypes().add(struct);
				
				Registry<Struct> structRegistry = RegistryService.getInstance().getService(IECRegistry.TYPE_REG);
				structRegistry.register(struct);
			}
			ParserNode pousNode = XmlDomUtility.getChildOf(typesNode, "pous");
			if (pousNode != null) {
				for (ParserNode pouNode : pousNode.getChildren()) {
					POU p = new POUBuilder(configFactory, parserFactory).buildPOU(pouNode);
					resource.getPous().add(p);
					
					// add POU to the global registry 
					RegistryService.getInstance().<POU>getService(IECRegistry.POU_REG).register(p);					
				}
			}
		} else {
			throw new IllegalArgumentException(illegalTagMessage(typesNode));
		}
	}
	
	private Struct buildDataType(ParserNode dataTypeNode) {
		if (dataTypeNode.get(NODE_NAME_ATTRIBUTE).equals("dataType")) {
			ParserNode baseTypeNode = XmlDomUtility.getChildOf(dataTypeNode, "baseType");
        	ParserNode structNode = XmlDomUtility.getChildOf(baseTypeNode, "struct");
        	Struct dataTypeDecl =configFactory.createStruct();
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

	static String illegalTagMessage(ParserNode illegalNode) {
		return "The tag "+ illegalNode.get(NODE_NAME_ATTRIBUTE)+ " cannot be matched.";
	}
}
