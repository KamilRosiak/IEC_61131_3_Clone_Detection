package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.ld;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_CONTENT_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_NAME_ATTRIBUTE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util.DiagramUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util.PortVariableData;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util.PortVariableData.PortType;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util.SimplePortConnector;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.StructuredTextUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XmlDomUtility;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.ExecutionBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElementType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDPOU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlockOperation;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionOperation;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IParserFactory;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.Registry;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.RegistryService;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.registry.iec.IECRegistry;

public class LDFunctionBlockBuilder {
	// 
	private static final String POU_EXECUTE = "EXECUTE";
	
	// standard function block types as stored in the plc twin cat xmls
	private static final String[] STANDARD_FUNCTION_BLOCKS = getNames(StandardFunctionBlockOperation.class);
	private static final String[] STANDARD_FUNCTIONS = getNames(StandardFunctionOperation.class);
	
	private IParserFactory parserFactory;
	private FunctionBlockDiagramFactory fbdFactory;
	private Network network;
	private Map<Long, String> globInVariable;
	
	/**
	 * This method creates an array of strings out of an enumeration.
	 */
	public static String[] getNames(Class<? extends Enum<?>> e) {
	    return Arrays.stream(e.getEnumConstants()).map(Enum::toString).toArray(String[]::new);
	}
	
	public LDFunctionBlockBuilder(IParserFactory parserFactory, Network currentNetwork) {
		this.parserFactory = parserFactory;
		this.fbdFactory = FunctionBlockDiagramFactory.eINSTANCE;
		this.network = currentNetwork;
		this.globInVariable = new HashMap<Long, String>();
	}
	
	public LDFunctionBlockBuilder(IParserFactory parserFactory) {
		this(parserFactory, null);
	}
	
	public Network getNetwork() {
		return network;
	}
	public void setNetwork(Network network) {
		this.network = network;
	}
	
	public FBDElement buildFunctionBlock(ParserNode blockNode) {
		// create function block
		FBDElement fbdElement = buildBasicFBDElement(blockNode);
		
		// use input variable data to find the input variables and connections
		List<PortVariableData> inputPortVariables = extractPortVariableData(blockNode, "inputVariables");		
		connectPorts(fbdElement, inputPortVariables, this::connectInputPort, this::connectInputPort);
		
		// use input variable data to find the in/out variables and connections
		List<PortVariableData> inOutVariables = extractPortVariableData(blockNode, "inOutVariables");
		connectPorts(fbdElement, inOutVariables, this::connectInOutPort, this::connectInOutPort);
		
		// use input variable data to find the output variables and connections
		List<PortVariableData> outputVariables = extractPortVariableData(blockNode, "outputVariables");
		connectPorts(fbdElement, outputVariables, this::connectOutputPort, this::connectOutputPort);
		
		
		return fbdElement;
	}
	
	public void handleGlobInVariable(ParserNode inVariableNode) {
		long localId = Long.valueOf(inVariableNode.get("localId"));
		ParserNode expression = XmlDomUtility.getChildOf(inVariableNode, "expression");
		if (expression != null) {
			globInVariable.put(localId, expression.get(NODE_CONTENT_ATTRIBUTE));		
		}		
	}
	
	public void handleGlobOutVariable(ParserNode outVariableNode) {
		// get assigned value for the output port
		String expressionStr = "";
		ParserNode expression = XmlDomUtility.getChildOf(outVariableNode, "expression");
		if (expression != null) {
			expressionStr = expression.get(NODE_CONTENT_ATTRIBUTE);		
		}
		
		// find diagram element and the connected port 
		ParserNode connectionPointIn = XmlDomUtility.getChildOf(outVariableNode, "connectionPointIn");
		if (connectionPointIn != null) {
			ParserNode connection = XmlDomUtility.getChildOf(connectionPointIn, "connection");
			if (connection != null) {
				long refLocalId = Long.valueOf(connection.get("refLocalId"));
				String formalParameter = connection.get("formalParameter");
				DiagramElement dElement = DiagramUtil.findDiagramElementBy(network, refLocalId);
				if(dElement != null) {
					final int outPortSize = dElement.getOutputPorts().size();
					if(outPortSize == 1) {
						Port port = dElement.getOutputPorts().get(0);
						if(port instanceof FBPort) {
							Expression exp = buildAssignedValue(expressionStr);
							((FBPort) port).setAssignedValue(exp);
						} else {
							System.out.println("Something is wrong because the port is not FUNCTION BLOCK PORT!");
						}
					} else if(outPortSize > 1){
						for (int i = 0; i < outPortSize; i++) {
							Port port = dElement.getOutputPorts().get(i);
							VariableExpression formalParamterExp = buildVariableExpression(formalParameter);
							if(port instanceof FBPort && DiagramUtil.isEqual(((FBPort)port).getPortVariable(), formalParamterExp)) {
								Expression exp = buildAssignedValue(expressionStr);
								((FBPort) port).setAssignedValue(exp);
								return;
							}
						}
					} else {
						System.out.println("There are no outputs ports. Something went WRONG!");
					}
				} else { //TODO what about size == 0
					System.out.println("This should not happen but added this for debug reasons! (Later, it can be deleted if that the case)");
				}
			}
		}
	}
	
	private FBDElement buildBasicFBDElement(ParserNode blockNode) {
		// extract function block attributes 
		String localId = blockNode.get("localId");
		String typeName = blockNode.get("typeName");
		String instanceName = blockNode.get("instanceName");
		
		// determine if standard block and the type of standard block if so
		if (isStandardFunctionBlock(typeName)) {
			StandardFunctionBlock standardFb = fbdFactory.createStandardFunctionBlock();
			standardFb.setLocalId(localId);
			if (instanceName != null) standardFb.setName(instanceName);
			standardFb.setFBDElementType(FBDElementType.STANDARD_FUNCTION_BLOCK);
			standardFb.setFunctionBlockOperation(getStandardFBType(typeName));
			return standardFb;
		} else if (isStandardFunction(typeName)) {
			StandardFunction standardFunction = fbdFactory.createStandardFunction();
			standardFunction.setLocalId(localId);
			if (typeName != null) standardFunction.setName(typeName);
			standardFunction.setFBDElementType(FBDElementType.STANDARD_FUNCTION);
			standardFunction.setFunctionOperation(getStandardFunctionType(typeName));
			return standardFunction;
		} else if (isExecutionBlock(typeName)) {
			ExecutionBlock execBlock = fbdFactory.createExecutionBlock();
			execBlock.setLocalId(localId);
			if (instanceName != null) execBlock.setName(instanceName);
			execBlock.setFBDElementType(FBDElementType.EXECUTION_BLOCK);
			execBlock.setExecutionStatements(extractSTStatements(blockNode));
			return execBlock;
		} else { 
			// try to find referring pou and build an fbd pou
			Registry<POU> pouRegistry = RegistryService.getInstance().getService(IECRegistry.POU_REG);

			FBDPOU fbdPou = fbdFactory.createFBDPOU();
			fbdPou.setLocalId(localId);
			if (instanceName != null) fbdPou.setName(instanceName);
			fbdPou.setFBDElementType(FBDElementType.FBD_POU);
			
			pouRegistry.performAction(typeName, pou -> {
				fbdPou.setRefPOU(pou);
			});
			
			return fbdPou;
		}
	}

	private boolean isStandardFunctionBlock(String typeName) {
		return Arrays.asList(STANDARD_FUNCTION_BLOCKS).contains(typeName);
	}

	private boolean isStandardFunction(String typeName) {
		return Arrays.asList(STANDARD_FUNCTIONS).contains(typeName);
	}

	private boolean isExecutionBlock(String typeName) {
		return typeName.equals(POU_EXECUTE);
	}

	private StandardFunctionBlockOperation getStandardFBType(String typeName) {
		try {
			return StandardFunctionBlockOperation.get(typeName);			
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("standard function block type "+typeName+" cannot be assigned to a concrete type enum");			
		}
	}
	
	private StandardFunctionOperation getStandardFunctionType(String typeName) {
		try {
			return StandardFunctionOperation.get(typeName);			
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("standard function type "+typeName+" cannot be assigned to a concrete type enum");			
		}	}
	
	private StructuredText extractSTStatements(ParserNode blockNode) {
		// extract the data
		ParserNode addDataNode = XmlDomUtility.getChildOf(blockNode, "addData");
		if (addDataNode != null) {
			for (ParserNode dataNode : addDataNode.getChildren()) {
				if (name(dataNode.getChildren().get(0)).equals("STCode")) {
					return buildStStatements(dataNode.getChildren().get(0));					
				}
			}
			return null;
		} else {
			throw new RuntimeException(name(blockNode)+" has no child named addData");
		}
	}
	
	private void connectPorts(FBDElement fbdElement, List<PortVariableData> portVariableData, 
			SimplePortConnector<FBPort, LLElement> llConnector, SimplePortConnector<FBPort, FBDElement> fbdConnector) {
		for (PortVariableData portData : portVariableData) {
			FBPort fbdPort = DiagramUtil.buildFBPort(fbdElement, portData, parserFactory);
			List<DiagramElement> refElements = DiagramUtil.findDiagramElementsBy(network, portData.getRefIds());
			
			// store globalElement if there is one
			String globalElement = null;
			if (!portData.getRefIds().isEmpty()) {
				globalElement = globInVariable.get(portData.getRefIds().get(0)); // assumed: only one or none global variable per port
			}
			
			if (!refElements.isEmpty()) {  // case: target element for the port to connect to found
				for (DiagramElement element: refElements) {
					if (!fbdPort.isConnected()) {
						throw new RuntimeException("An FBD port where connected=false must not have a connected element("+element.getLocalId()+")");
					}
					
					// connect the fbd element port with its counter part
					if (element instanceof LLElement) {
						llConnector.connect(fbdPort, (LLElement) element, null);
					} else if (element instanceof FBDElement) {
						VariableExpression refParameter = null;
						if (portData.hasConnectedParameterString()) {
							refParameter = buildVariableExpression(portData.getConnectedParameterString());
						}
						fbdConnector.connect(fbdPort, (FBDElement) element, refParameter);
					}
					
					// declare source and target elements
					switch(portData.getPortType()) {
						case INPUT: {
							DiagramUtil.setElementReferences(element, fbdElement);
						} break;
						case INOUT: {
							DiagramUtil.setElementReferences(fbdElement, fbdElement);						
						} break;
						case OUTPUT: {
							DiagramUtil.setElementReferences(fbdElement, element);
						} break;
						case UNDEFINED: {
							throw new RuntimeException("The port type is undefined.");
						}
					}
				}
			} else if(globalElement != null) { // case: global variable as input parameter for port
				fbdPort.setConnected(false);
				fbdPort.setAssignedValue(buildAssignedValue(globalElement));	
			} else if (portData.hasExpressionString()) { // case: constant expression as input parameter for port
				if (!fbdPort.isConnected()) {
					fbdPort.setAssignedValue(buildAssignedValue(portData.getExpressionString()));	
				} else {
					throw new RuntimeException("An FBD port where connected=true must have a connected element.");						
				}
			}
		}
	}
	
	private void connectInputPort(FBPort fbPort, LLElement sourceElement, VariableExpression formalParameter) {
		if (sourceElement.getOutputPorts().isEmpty()) {
			sourceElement.getOutputPorts().add(DiagramUtil.buildLDPort(sourceElement, PortType.INPUT));
		}
		sourceElement.getOutputPorts().get(0).getConnectedPorts().add(fbPort);
		fbPort.getConnectedPorts().add(sourceElement.getOutputPorts().get(0));
	}
	
	private void connectInputPort(FBPort fbPort, FBDElement sourceElement, VariableExpression formalParameter) {
		// search for a output port from source element with the specified formal Parameter
		if (formalParameter == null && sourceElement.getOutputPorts().size() == 1) { // there must be only one port of the specified element
			DiagramUtil.setPortReferences(sourceElement.getOutputPorts().get(0), fbPort);
		} else { // there are several identified by their port's port variable
			for (Port outputPort : sourceElement.getOutputPorts()) {
				if (outputPort instanceof FBPort) {
					FBPort fbOutputPort = (FBPort) outputPort;
					if (DiagramUtil.isEqual(fbOutputPort.getPortVariable(), formalParameter)) { // found the matching port by formal parameter
						DiagramUtil.setPortReferences(fbPort, fbOutputPort);
						return;
					}
				}
			}
		}
		throw new RuntimeException("There must be a matching port for port "+fbPort.getPortVariable().getSymbol()+" of element with id "+fbPort.getAttachedElement().getLocalId());
	}
	
	private void connectInOutPort(FBPort fbdPort, DiagramElement inputElement, VariableExpression formalParameter) {
		throw new RuntimeException("Currently cannot connect a function blocks's in/out port to itself.");
	}
	
	private void connectOutputPort(FBPort fbdPort, LLElement targetElement, VariableExpression formalParameter) {
		throw new RuntimeException("Currently cannot connect a function block's output port with a target LLElement.");
	}
	
	private void connectOutputPort(FBPort fbdPort, FBDElement targetElement, VariableExpression formalParameter) {
		throw new RuntimeException("Currently cannot connect a function block's output port with a target FBDElement.");

	}

	///////////////////////////////////////////////////////////////////////////////////////////
	// Utility Methods
	///////////////////////////////////////////////////////////////////////////////////////////

	private List<PortVariableData> extractPortVariableData(ParserNode blockNode, String variableCollectionTag) {
		List<PortVariableData> portVariables = new ArrayList<>();
		ParserNode variableCollectionNode = XmlDomUtility.getChildOf(blockNode, variableCollectionTag);
		for (ParserNode variableNode : variableCollectionNode.getChildren()) {
			PortVariableData portVariableData = extractPortVariable(variableNode, variableCollectionTag);
			if (portVariableData != null) {
				portVariables.add(portVariableData);				
			}
		}
		return portVariables;
	}
	
	private PortVariableData extractPortVariable(ParserNode variableNode, String variableCollection) {
		PortVariableData portData = new PortVariableData();
		String variableName = variableNode.get("formalParameter");
		portData.setName(variableName);
		
		// set port type	
		if (variableCollection.startsWith("input")) {
			portData.setPortType(PortType.INPUT);
		} else if (variableCollection.startsWith("output")) {
			portData.setPortType(PortType.OUTPUT);
		} else if (variableCollection.startsWith("inOut")) {
			portData.setPortType(PortType.INOUT);
		} else {
			throw new RuntimeException("Unknown connection point: "+variableCollection);
		}
		
		// extract connection point data
		if (!variableNode.getChildren().isEmpty()) {
			ParserNode connectionPointNode = variableNode.getChildren().get(0);
			for (ParserNode connectionPointChildNode : connectionPointNode.getChildren()) {
				switch(name(connectionPointChildNode)) {
					case "connection": {
						connectionPointChildNode.executeOnAttribute("refLocalId", (String refLocalId) -> {
							portData.addRefId(Long.parseLong(refLocalId));										
						});
						connectionPointChildNode.executeOnAttribute("formalParameter", (String formalParameter) -> {
							portData.setConnectedParameterString(formalParameter);							
						});						
					} break;
					case "expression": {
						String expressionString = connectionPointChildNode.get(NODE_CONTENT_ATTRIBUTE);
						if (expressionString != null && !expressionString.isEmpty()) {
							portData.setExpressionString(expressionString);			
						}												
					} break;
				}
			}
		}
		return portData;
	}
	
	private StructuredText buildStStatements(ParserNode stCodeNode) {
		return StructuredTextUtil.buildStructuredText(stCodeNode.get(NODE_CONTENT_ATTRIBUTE), parserFactory);
	}
	
	private VariableExpression buildVariableExpression(String variableName) {
		return StructuredTextUtil.buildVariableExpression(variableName, parserFactory);
	}
	
	private Expression buildAssignedValue(String String) {
		return StructuredTextUtil.buildExpression(String, parserFactory);
	}
	
	public static String name(ParserNode node) {
		return node.get(NODE_NAME_ATTRIBUTE);
	}
	
}
