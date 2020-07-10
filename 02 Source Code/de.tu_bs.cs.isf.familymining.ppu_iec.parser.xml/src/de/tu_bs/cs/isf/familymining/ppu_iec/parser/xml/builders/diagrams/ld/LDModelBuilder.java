package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.ld;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_CONTENT_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_NAME_ATTRIBUTE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.DiagramBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util.DiagramUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util.LDTraverselUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util.PortVariableData;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util.PortVariableData.PortType;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util.SimplePortConnector;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.StructuredTextUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XmlDomUtility;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LDJump;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementStatus;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderNetwork;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IParserFactory;

/**
 * Model builder for <i>IEC 61131-3 Ladder Diagram</i>.
 * Contrary to the standard way of modeling right power rails, the model builder
 * assigns a left <b>and</b> right power rail to each network.
 * Consequently, each network should start and end with a power rail element.
 * 
 * @author Oliver Urbaniak
 *
 */
public class LDModelBuilder extends DiagramBuilder {
	
	protected IParserFactory parserFactory;
	protected DiagramFactory diagramFactory;
	protected LadderDiagramFactory ldFactory;
	int currentNetworkPosition = 1;
	protected LLElement leftPowerRailTemplate;
	protected LLElement rightPowerRailTemplate;

	public LDModelBuilder(IParserFactory parserFactory) {
		this.parserFactory = parserFactory;
		this.diagramFactory = DiagramFactory.eINSTANCE;
		this.ldFactory = LadderDiagramFactory.eINSTANCE;
	}

	/**
	 * Builds an instance of {@link Diagram} configured as <i>Ladder Diagram</i>.
	 * 
	 * @param ldNode parser node for <b>&ltLD&gt</b>
	 * @param identifier of the diagram
	 * @return
	 */
	@Override
	public Diagram build(ParserNode ldNode) {
		reset();
		Diagram ladderDiagram = createDiagram(DiagramType.LADDER_DIAGRAM);
		currentNetworkPosition = 1;
		
		// store left and right power rail
		ldNode.consumeChild(NODE_NAME_ATTRIBUTE, "leftPowerRail", leftPowerRailNode -> {
			leftPowerRailTemplate = buildLeftPowerRail(leftPowerRailNode);
		});
		ldNode.consumeChild(NODE_NAME_ATTRIBUTE, "rightPowerRail", rightPowerRailNode -> {
			rightPowerRailTemplate = buildRightPowerRail(rightPowerRailNode);
		});
		
		// run through the diagram data structure, create diagram elements
		// and sort assign them their respective networks
		for (ParserNode ldChildNode : ldNode.getChildren()) {
			switch (name(ldChildNode)) {
				case "leftPowerRail": break;
				case "rightPowerRail": break;
				case "vendorElement": {
					// do nothing 
				} break;
				case "contact": {
					getActiveNetwork().getNetworkElements().add(buildContact(ldChildNode));
				} break;
				case "inVariable": {
					// ignored (at the moment)
				} break;
				case "block": {
					getActiveNetwork().getNetworkElements().add(buildFunctionBlock(ldChildNode));
				} break;
				case "coil": {
					getActiveNetwork().getNetworkElements().add(buildCoil(ldChildNode));
				} break;
				case "comment": { // IMPORTANT: defines the start of a new network
					openNetwork(currentNetworkPosition++, ladderDiagram);
				} break;
				case "jump": {
					getActiveNetwork().getNetworkElements().add(buildJump(ldChildNode));
				} break;
				case "label": {
					getActiveNetwork().setLabel(ldChildNode.get("label"));
				} break;
				default: {
					throw new RuntimeException("Unsupported node tag: "+name(ldChildNode));
				}	
			}
		}
		
		// attach right power rail to the last network
		attachRightPowerRail((LadderNetwork) getActiveNetwork());
		 
		// Set level for network elements
		for(Network network : ladderDiagram.getNetworks()) {
			if(network instanceof LadderNetwork) {
				LDTraverselUtil.setElementLevel(((LadderNetwork)network).getLeftPowerRail(), 0);
			}
			for(DiagramElement element : network.getNetworkElements()) {
				if (element instanceof Jump) {
					Jump jump = (Jump) element;
					String label = jump.getJumpLabel();
					for (Network targetNetwork : ladderDiagram.getNetworks()) {
						if (targetNetwork.getLabel() != null && targetNetwork.getLabel().equals(label)) {
							jump.setTargetNetwork(targetNetwork);
						}
					}
				}
			}
		}
		
 		return ladderDiagram;
	}
	
	@Override
	/**
	 * Attach copies for left and right power rail from the template
	 * 
	 * @param position network id
	 * @param ladderDiagram the created network's container
	 */
	public void openNetwork(int position, Diagram ladderDiagram) {		
		if (getActiveNetwork() != null) {
			attachRightPowerRail((LadderNetwork) getActiveNetwork());			
		}
		
		// 
		super.openNetwork(position, ladderDiagram);
		
		attachLeftPowerRail((LadderNetwork) getActiveNetwork());
	}

	protected void attachRightPowerRail(LadderNetwork network) {
		LLElement rightPowerRail = EcoreUtil.copy(rightPowerRailTemplate);
		network.setRightPowerRail(rightPowerRail);
		network.getNetworkElements().add(rightPowerRail);
		
		// connect elements that don't have targets to the right power rail
		for (DiagramElement element : network.getNetworkElements()) {
			if (element != rightPowerRail && element.getTargetElements().isEmpty()) {
				Port railInputPort = DiagramUtil.buildLDPort(rightPowerRail, PortType.INPUT);
				if (element instanceof LLElement) {
					connectInputPort(railInputPort, (LLElement) element, null);
					DiagramUtil.setElementReferences(element, rightPowerRail);
				} else if (element instanceof FBDElement) {
					// connect to a port of an fbd element 
					FBDElement fbdSource = (FBDElement) element;
					List<Port> affectedPorts = fbdSource.getOutputPorts().stream()
						.filter( outputPort -> ((FBPort)outputPort).isConnected())
						.collect(Collectors.toList());
					
					// check if there is only one connected port 
					if (affectedPorts.size() == 1) {
						DiagramUtil.setPortReferences(affectedPorts.get(0), railInputPort);
						DiagramUtil.setElementReferences(fbdSource, rightPowerRail);
					} else {
						throw new RuntimeException("A function block port must have only one connected port.");
					}
				}
			}
		}
	}
	
	protected void attachLeftPowerRail(LadderNetwork network) {
		LLElement leftPowerRail = EcoreUtil.copy(leftPowerRailTemplate);
		network.setLeftPowerRail(leftPowerRail);
		network.getNetworkElements().add(leftPowerRail);
	}
	
	protected LLElement buildLeftPowerRail(ParserNode leftPowerRailNode) {
		return buildLLElement(
				extractElementId(leftPowerRailNode), 
				LLElementType.LEFT_POWERRAIL, 
				LLElementStatus.UNDEFINED, 
				null, 
				Collections.emptyList(), 
				Collections.emptyList());
	}

	protected LLElement buildRightPowerRail(ParserNode rightPowerRailNode) {
		return buildLLElement(
				extractElementId(rightPowerRailNode), 
				LLElementType.RIGHT_POWERRAIL, 
				LLElementStatus.UNDEFINED, 
				null,
				Collections.emptyList(),
				Collections.emptyList());
	}

	protected LLElement buildContact(ParserNode contactNode) {
		return buildLLElement(
				extractElementId(contactNode), 
				LLElementType.CONTACT, 
				isNegated(contactNode) ? LLElementStatus.NORMAL_CLOSE : LLElementStatus.NORMAL_OPEN, 
				extractLabelledVariable(contactNode), 
				extractConnections(contactNode, "connectionPointIn"),
				extractConnections(contactNode, "connectionPointOut"));
	}

	protected LLElement buildCoil(ParserNode coilNode) {
		return buildLLElement(
				extractElementId(coilNode), 
				LLElementType.COIL, 
				extractCoilStatus(coilNode), 
				extractLabelledVariable(coilNode), 
				extractConnections(coilNode, "connectionPointIn"),
				extractConnections(coilNode, "connectionPointOut"));
	}
	
	private LDJump buildJump(ParserNode jumpNode) {
		LDJump jumpElement = ldFactory.createLDJump();
		jumpElement.setLocalId(extractElementId(jumpNode));
		jumpElement.setJumpLabel(jumpNode.get("label"));
		List<PortVariableData> inputConnectionData = extractConnections(jumpNode, "connectionPointIn");
		connectPorts(jumpElement, inputConnectionData, this::connectInputPort, this::connectInputPort);
		return jumpElement;
	}
	
	protected DiagramElement buildFunctionBlock(ParserNode blockNode) {
		return new LDFunctionBlockBuilder(parserFactory, getActiveNetwork()).buildFunctionBlock(blockNode);
	}	

	protected void reset() {
		this.setActiveNetwork(null);
		this.leftPowerRailTemplate = null;
		this.rightPowerRailTemplate = null;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	// Utility Methods
 	///////////////////////////////////////////////////////////////////////////////////////////
	
	protected VariableExpression extractLabelledVariable(ParserNode llElementNode) {
		ParserNode variableNode = XmlDomUtility.getChildOf(llElementNode, "variable");
		if (variableNode != null) {
			return StructuredTextUtil.buildVariableExpression(variableNode.get(NODE_CONTENT_ATTRIBUTE), parserFactory);			
		}
		return null;
	}

	/**
	 * Helper function for building LLElement instances.
	 * 
	 * @param id 
	 * @param type concrete type of ladder logic element
	 * @param status defined for coils and contacts
	 * @param variableExpr defined for coils and contacts
	 * @param inputConnectionData describes the input ports
	 * @param outputConnectionData describes the output portsd
	 * @return
	 */
	protected LLElement buildLLElement(String id, LLElementType type, LLElementStatus status, VariableExpression variableExpr, 
			List<PortVariableData> inputConnectionData, List<PortVariableData> outputConnectionData) {
		LLElement llElement = ldFactory.createLLElement();
		llElement.setLocalId(id);
		llElement.setTransitElementType(type);
		llElement.setStatus(status);
		
		// assign labelled variable
		if (variableExpr != null) {
			llElement.setLabeledVariable(variableExpr);
		}
		
		// connect incoming connections
		connectPorts(llElement, inputConnectionData, this::connectInputPort, this::connectInputPort);
		
		// connect outgoing connections
		connectPorts(llElement, outputConnectionData, this::connectOutputPort, this::connectOutputPort);
		
		return llElement;
	}

	/**
	 * Helper function for connecting the port of <i>llElement</i> given the type and the data of a port.
	 * The connector functions <i>llConnector</i> and <i>fbdConnector<i> handle the actual connection process.  
	 * 
	 * @param llElement
	 * @param connectionData
	 * @param type
	 * @param llConnector
	 * @param fbdConnector
	 */
	public void connectPorts(DiagramElement llElement, List<PortVariableData> connectionData,
			SimplePortConnector<Port, LLElement> llConnector, SimplePortConnector<Port, FBDElement> fbdConnector) {
		for (PortVariableData portData : connectionData) {
			List<DiagramElement> refElements = DiagramUtil.findDiagramElementsBy(getActiveNetwork(), portData.getRefIds());
			if (!refElements.isEmpty()) {
				Port port = DiagramUtil.buildLDPort(llElement, portData.getPortType());
				for (DiagramElement element : refElements) {
					if (element instanceof LLElement) {
						llConnector.connect(port, (LLElement) element, null);
					} else if (element instanceof FBDElement) {
						VariableExpression refParameter = null;
						if (portData.hasConnectedParameterString()) {
							refParameter = StructuredTextUtil.buildVariableExpression(portData.getConnectedParameterString(), parserFactory);
						}
						fbdConnector.connect(port, (FBDElement) element, refParameter); 
					}
					
					// declare source and target elements
					switch(portData.getPortType()) {
						case INPUT: {
							DiagramUtil.setElementReferences(element, llElement);
						} break;
						case INOUT: {
							DiagramUtil.setElementReferences(llElement, llElement);
						} break;
						case OUTPUT: {
							DiagramUtil.setElementReferences(llElement, element);
						} break;
						case UNDEFINED: {
							throw new RuntimeException("The port type is undefined.");
						}
					}
				}	
			}
		}
	}

	public void connectInputPort(Port inputPort, LLElement sourceElement, VariableExpression formalParameter) {
		// create and wire up ports 
		if (sourceElement.getOutputPorts().isEmpty()) {
			sourceElement.getOutputPorts().add(DiagramUtil.buildLDPort(sourceElement, PortType.OUTPUT));
		}
		DiagramUtil.setPortReferences(sourceElement.getOutputPorts().get(0), inputPort);
	}
	
	public void connectInputPort(Port inputPort, FBDElement sourceElement, VariableExpression formalParameter) {		
		// search for right fb port in the fbdElement and wire it up with the input port
		for (Port outputPort : sourceElement.getOutputPorts()) {
			if (outputPort instanceof FBPort) {
				FBPort fbOutputPort = (FBPort) outputPort;
				if (formalParameter != null && fbOutputPort.isConnected() && DiagramUtil.isEqual(fbOutputPort.getPortVariable(), formalParameter)) {
					DiagramUtil.setPortReferences(fbOutputPort, inputPort);
				}
			}
		}				
	}
	
	public void connectOutputPort(Port outputPort, LLElement targetElement, VariableExpression formalParameter) {
		// create and wire up ports 
		if (targetElement.getInputPorts().isEmpty()) {
			targetElement.getInputPorts().add(DiagramUtil.buildLDPort(targetElement, PortType.INPUT));
		}
		targetElement.getInputPorts().get(0).getConnectedPorts().add(outputPort);
		outputPort.getConnectedPorts().add(targetElement.getInputPorts().get(0));
	}
	
	public void connectOutputPort(Port outputPort, FBDElement targetElement, VariableExpression formalParameter) {		
		// search for right fb port in the fbdElement and wire it up with the input port
		for (Port inputPort : targetElement.getInputPorts()) {
			if (inputPort instanceof FBPort) {
				FBPort fbInputPort = (FBPort) inputPort;
				if (DiagramUtil.isEqual(fbInputPort.getPortVariable(), formalParameter)) {
					fbInputPort.getConnectedPorts().add(outputPort);
					outputPort.getConnectedPorts().add(fbInputPort);
				}
			}
		}	
	}
	
	public List<PortVariableData> extractConnections(ParserNode llElementNode, String connectionString) {
		List<PortVariableData> connectionData = new ArrayList<>();
		ParserNode connectionPointNode = XmlDomUtility.getChildOf(llElementNode, connectionString);
		for (ParserNode connectionNode : connectionPointNode.getChildren()) {
			PortVariableData portVariableStruct = extractPortVariableStruct(connectionNode);
			if (portVariableStruct != null) {
				connectionData.add(portVariableStruct);
			}
		}
		return connectionData;
	}
	
	protected PortVariableData extractPortVariableStruct(ParserNode connectionNode) {
		PortVariableData portVariableData = new PortVariableData();
		
		connectionNode.executeOnAttribute("refLocalId", (String refLocalId) -> {
			portVariableData.addRefId(Long.parseLong(refLocalId));			
		});
		connectionNode.executeOnAttribute("formalParameter", (String formalParameter) -> {
			portVariableData.setConnectedParameterString(formalParameter);			
		});
		
		ParserNode connectionPointNode = connectionNode.getParent();
		String connectionPointType = name(connectionPointNode);
		if (connectionPointType.endsWith("In")) {
			portVariableData.setPortType(PortType.INPUT);
		} else if (connectionPointType.endsWith("Out")) {
			portVariableData.setPortType(PortType.OUTPUT);
		} else {
			throw new RuntimeException("Unknown connection point: "+connectionPointType);
		}
		
		return portVariableData;
	}

	protected LLElementStatus extractCoilStatus(ParserNode coilNode) {
		boolean isNegated = isNegated(coilNode);
		String storageSpecifier = coilNode.get("storage");
		if (storageSpecifier.equals("none")) {
			if (isNegated) {
				return LLElementStatus.NEGATED;
			} else {
				return LLElementStatus.POSITIVE;
			}
		} else if (storageSpecifier.equals("set")) {
			return LLElementStatus.SET;
		} else if (storageSpecifier.equals("reset")) {
			return LLElementStatus.RESET;
		} else {
			throw new IllegalArgumentException("\"storage\" must not be "+storageSpecifier);
		}
	}
	
	protected boolean isNegated(ParserNode contactNode) {
		String negated = contactNode.get("negated");
		if (negated != null) {
			return Boolean.parseBoolean(negated);
		} else {
			throw new NullPointerException("contact must be explcitly declared normal open or closed");
		}
	}
	
	/**
	 * Extracts the attribute named "localId" of node.  
	 * 
	 * @param llElementNode the source of extraction
	 * @return id
	 * 
	 * @exception NullPointerException if no attribute named "localId" is found.
	 */
	protected String extractElementId(ParserNode llElementNode) {
		String id = llElementNode.get("localId");
		if (id != null) {
			return id;
		} else {
			throw new NullPointerException("\"localId\" must not be null.");
		}
	}
	
	public static String name(ParserNode node) {
		return node.get(NODE_NAME_ATTRIBUTE);
	}

	@Override
	protected Network newNetwork() {
		return ldFactory.createLadderNetwork();
	}
}
