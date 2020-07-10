package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.configuration;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_CONTENT_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_NAME_ATTRIBUTE;

import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.EntireProjectModelBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.fbd.FBDModelBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.ld.LDModelBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.sfc.SFCModelBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.st.STModelBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XmlDomUtility;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.OrganizationType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Struct;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlockOperation;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionOperation;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.Comment;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IParserFactory;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.Registry;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.RegistryService;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.iec.IECRegistry;

public class POUBuilder {

	private ConfigurationFactory configFactory;
	private LanguageElementFactory leFactory;
	private IParserFactory parserFactory;
	private RegistryService<IECRegistry> registryService;

	public POUBuilder(ConfigurationFactory configFactory, IParserFactory parserFactory) {
		this.configFactory = configFactory;
		this.parserFactory = parserFactory;
		this.leFactory = LanguageElementFactory.eINSTANCE;
		registryService = RegistryService.getInstance();
	}
	
	public POU buildPOU(ParserNode pouNode) {
		if (pouNode.get(NODE_NAME_ATTRIBUTE).equals("pou")) {
			// clear local registries
			registryService.reset(IECRegistry.LOCAL_VAR_REG, true);
			registryService.reset(IECRegistry.LOCAL_ACTION_REG, true);
			
			POU pou = configFactory.createPOU();
        	
        	// set internal values
			String identifier = pouNode.get("name");
			pou.setIdentifier(identifier);
        	String pouType = pouNode.get("pouType");
        	if (pouType != null) {        		
	        	if (pouType.equalsIgnoreCase("functionBlock")) {
	        		pou.setType(OrganizationType.FUNCTIONBLOCK);        		
	        	} else if (pouType.equalsIgnoreCase("program")) {
	        		pou.setType(OrganizationType.PROGRAM);        		
	        	} else if (pouType.equalsIgnoreCase("function")) {
	        		pou.setType(OrganizationType.FUNCTION);        		
	        	}
        	}
        	        		        	
        	// Declaration <- POU
        	pou.setDeclaration(configFactory.createDeclaration());
        	
        	// traverse children
        	ParserNode interfaceNode = XmlDomUtility.getChildOf(pouNode, "interface");
        	if (interfaceNode != null) {
        		dispatchInterface(interfaceNode, pou);
        	}
        	
        	ParserNode actionsNode = XmlDomUtility.getChildOf(pouNode, "actions");
        	if (actionsNode != null) {
        		dispatchActions(actionsNode, pou);
        	}
        	
        	ParserNode bodyNode = XmlDomUtility.getChildOf(pouNode, "body");
        	if (bodyNode != null) {
        		dispatchBody(bodyNode, pou);
        	}

        	ParserNode addDataNode = XmlDomUtility.getChildOf(pouNode, "addData");
        	if (addDataNode != null) {
        		for (ParserNode dataNode : addDataNode.getChildren()) {
        			ParserNode interfaceAsPlainTextNode = XmlDomUtility.getChildOf(dataNode, "InterfaceAsPlainText");
        			if (interfaceAsPlainTextNode != null) {        				
        				dispatchComment(XmlDomUtility.getChildOf(interfaceAsPlainTextNode, "xhtml"), pou);
        			}
        		}
        	}
        	
        	// clear local registries
        	registryService.reset(IECRegistry.LOCAL_VAR_REG, false);
        	registryService.reset(IECRegistry.LOCAL_ACTION_REG, false);
        	
        	return pou;
		} else {
			throw new IllegalArgumentException(EntireProjectModelBuilder.illegalTagMessage(pouNode));
		}
	}
	
	private void dispatchInterface(ParserNode interfaceNode, POU pou) {
		// registry for local variables 
		Registry<Variable> localVarRegistry = registryService.getService(IECRegistry.LOCAL_VAR_REG);
		
		if (interfaceNode.get(NODE_NAME_ATTRIBUTE).equals("interface")) {
			VariableBuilder varBuilder = new VariableBuilder(configFactory);
			for (ParserNode childInterfaceNode : interfaceNode.getChildren()) {
				if (childInterfaceNode.get(NODE_NAME_ATTRIBUTE).equals("localVars")) {
					for (ParserNode variableNode : childInterfaceNode.getChildren()) {
						Variable var = varBuilder.buildLocalVariable(variableNode);
						pou.getDeclaration().getInternalVariables().add(var);	
						localVarRegistry.register(var);
					}
				} else if (childInterfaceNode.get(NODE_NAME_ATTRIBUTE).equals("outputVars")) {
					for (ParserNode variableNode : childInterfaceNode.getChildren()) {
						Variable var = varBuilder.buildOutputVariable(variableNode);
						pou.getDeclaration().getOutputVariables().add(var);
						localVarRegistry.register(var);					
					}
				} else if (childInterfaceNode.get(NODE_NAME_ATTRIBUTE).equals("inputVars")) {
					for (ParserNode variableNode : childInterfaceNode.getChildren()) {
						Variable var = varBuilder.buildInputVariable(variableNode);
						pou.getDeclaration().getInputVariables().add(var);
						localVarRegistry.register(var);
					}
				}
			}
			
			// interconnect pou with the referenced pou when a variable declaration is of POU type
			checkPOUInterconnections(pou, pou.getDeclaration().getInternalVariables());
			checkPOUInterconnections(pou, pou.getDeclaration().getInputVariables());
			checkPOUInterconnections(pou, pou.getDeclaration().getOutputVariables());
		} else {
			throw new IllegalArgumentException(EntireProjectModelBuilder.illegalTagMessage(interfaceNode));
		}
	}

	private void checkPOUInterconnections(POU pou, List<Variable> variables) {
		for (Variable var : variables) {
			if (isPOUInstance(var)) {
				Registry<POU> pouRegistry = RegistryService.getInstance().getService(IECRegistry.POU_REG);
				pouRegistry.performAction(var.getTypeName(), varPou -> {
					pou.getCallees().add(varPou);
					varPou.getCallers().add(pou);
				});
			}					
		}
	}

	private boolean isPOUInstance(Variable var) {
		// check for user defined type
		Registry<Struct> typeRegistry = RegistryService.getInstance().getService(IECRegistry.TYPE_REG);
		boolean userDefinedType = typeRegistry.isRegistered(var.getTypeName());
		
		// check for standard function block type
		StandardFunctionBlockOperation sfb = StandardFunctionBlockOperation.get(var.getTypeName());
		boolean standardBlockComponent = sfb != null && !sfb.equals(StandardFunctionBlockOperation.UNSET);
		
		// check for standard function type
		StandardFunctionOperation sf = StandardFunctionOperation.get(var.getTypeName());
		boolean standardComponent = sf != null && !sf.equals(StandardFunctionOperation.UNSET);
		
		return var.getType().equals(ElementaryDataType.DERIVED) && !userDefinedType && !standardComponent && !standardBlockComponent;
	}

	private void dispatchBody(ParserNode bodyNode, POU pou) {
		if (bodyNode.get(NODE_NAME_ATTRIBUTE).equals("body")) {
			LanguageElement le = buildLanguageElement(bodyNode, pou.getIdentifier());
			if (le != null) {
				dispatchSTComment(bodyNode, pou);
				pou.getImplementations().add(le);				
			}
		} else {
			throw new IllegalArgumentException(EntireProjectModelBuilder.illegalTagMessage(bodyNode));
		}
	}

	private void dispatchActions(ParserNode actionsNode, POU pou) {
		if (actionsNode.get(NODE_NAME_ATTRIBUTE).equals("actions")) {
			for (ParserNode actionNode : actionsNode.getChildren() ) {
				dispatchAction(actionNode, pou);
			}
		} else {
			throw new IllegalArgumentException(EntireProjectModelBuilder.illegalTagMessage(actionsNode));
		}
	}

	private void dispatchAction(ParserNode actionNode, POU pou) throws NullPointerException {
		Action action = configFactory.createAction();
		action.setName(actionNode.get("name"));
		
		ParserNode bodyNode = XmlDomUtility.getChildOf(actionNode, "body");
		LanguageElement le = buildLanguageElement(bodyNode, action.getName());
		if (le != null) {
			dispatchSTComment(bodyNode, pou);
			action.setImplementation(le);			
		}
		pou.getActions().add(action);
		
		// register local action
		Registry<Action> actionRegistry = RegistryService.getInstance().getService(IECRegistry.LOCAL_ACTION_REG);
		actionRegistry.register(action);
	}
	
	private LanguageElement buildLanguageElement(ParserNode bodyNode, String id) {
		if (id == null) {
			throw new NullPointerException("The language element id must not be null.");
		}
		
		if (bodyNode.get(NODE_NAME_ATTRIBUTE).equals("body")) {
			ParserNode STNode = bodyNode.getChildByAttribute(NODE_NAME_ATTRIBUTE, "ST");
			if (STNode != null) {
				StructuredText st = new STModelBuilder(parserFactory).buildStructuredText(STNode, id);
				return st;
			}
			ParserNode SFCNode = bodyNode.getChildByAttribute(NODE_NAME_ATTRIBUTE, "SFC");
			if (SFCNode != null) {
				SequentialFunctionChart sfc = new SFCModelBuilder(parserFactory).buildSequentialFunctionChart(SFCNode, id);
				return sfc;
			}
			
			ParserNode LDNode = bodyNode.getChildByAttribute(NODE_NAME_ATTRIBUTE, "LD");
			if (LDNode != null) {
				Diagram ld = new LDModelBuilder(parserFactory).build(LDNode);
				ld.setLabel(id);
				return ld;
			}
			
			ParserNode FBDNode = bodyNode.getChildByAttribute(NODE_NAME_ATTRIBUTE, "FBD");
			if (FBDNode != null) {
				Diagram fbd = new FBDModelBuilder(parserFactory).build(FBDNode);
				fbd.setLabel(id);
				return fbd;
			}
			
			return null;
		} else {
			throw new IllegalArgumentException(EntireProjectModelBuilder.illegalTagMessage(bodyNode));
		}
		
	}
	
	private void dispatchSTComment(ParserNode bodyNode, POU pou) {	
		if (bodyNode.get(NODE_NAME_ATTRIBUTE).equals("body")) {
			// only search comments in structured text
			ParserNode STNode = XmlDomUtility.getChildOf(bodyNode, "ST");
			if (STNode != null) {
				ParserNode xhtmlNode = XmlDomUtility.getChildOf(STNode, "xhtml");
				dispatchComment(xhtmlNode, pou);					
			}
		} else {
			throw new IllegalArgumentException(EntireProjectModelBuilder.illegalTagMessage(bodyNode));
		}
	}

	private void dispatchComment(ParserNode xhtmlNode, POU pou) {
		if (xhtmlNode != null) {
			// Search for Comment
			String text = xhtmlNode.get(NODE_CONTENT_ATTRIBUTE);
			List<String> comments = new ArrayList<>();
			
			// scan text and extract comments
			if (text != null) {
				String[] textLines = text.split("\n");
				for (int i = 0; i < textLines.length; i++) {
					int commentBeginIndex = textLines[i].trim().indexOf("//");
					if (commentBeginIndex != -1) {
						String comment = textLines[i].substring(commentBeginIndex);
						comments.add(comment.trim()); 
					} 
				}
			}
			if (!comments.isEmpty()) {
				Comment comment = leFactory.createComment();
				comment.setIdentifier(pou.getIdentifier());
				comment.getStatements().addAll(comments);
				pou.getDeclaration().getComment().add(comment);						
			}
		}
	}
}
