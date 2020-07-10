package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.fbd;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_NAME_ATTRIBUTE;

import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.DiagramBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.ld.LDFunctionBlockBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.ld.LDModelBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util.LDTraverselUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util.PortVariableData;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDJump;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramFactory;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IParserFactory;

public class FBDModelBuilder extends DiagramBuilder {

	/**
	 * For FBD the element's local id contains information about the referring network.
	 * E.g. <i>localId="20000000010"</i> refers to network denoted by 2 in <i>[2]0000000010</i>.
	 * For network numbers < 10, the length is fixed by this constant.
	 * For network numbers > 10, the length increases (e.g. 20 in <i>[20]0000000010</i> 
	 */
	private static final int COMMON_LOCAL_ID_LENGTH = 11;
	
	protected IParserFactory parserFactory;
	private DiagramFactory diagramFactory;
	private LDFunctionBlockBuilder fbBuilder;
	private LDModelBuilder ldModelBuilder;

	private Diagram funcBlockDiagram;
	
	public FBDModelBuilder(IParserFactory parserFactory) {
		this.parserFactory = parserFactory;
		this.diagramFactory = DiagramFactory.eINSTANCE;
		this.fbBuilder = new LDFunctionBlockBuilder(parserFactory);
		this.ldModelBuilder = new LDModelBuilder(parserFactory);
	}

	@Override
	public Diagram build(ParserNode fbdNode) {
		funcBlockDiagram = createDiagram(DiagramType.FUNCTION_BLOCK_DIAGRAM);
		openNetwork(1, funcBlockDiagram);
		fbBuilder.setNetwork(getActiveNetwork());
		
		// first traversal of nodes
		for (ParserNode fbdChildNode : fbdNode.getChildren()) {
			switch (name(fbdChildNode)) {
				case "vendorElement":
					// do nothing
					break;
				case "inVariable":
					handleInVariable(fbdChildNode);
					break;
				case "block":
					handleBlock(fbdChildNode);
					break;
				case "outVariable":
					handleOutVariable(fbdChildNode);
					break;
				case "label":
					handleLabel(fbdChildNode);
					break;
				case "jump":
					handleJump(fbdChildNode);
					break;
				default:
					throw new RuntimeException("Unsupported node tag: " + name(fbdChildNode));
			}
		}
		
		//set level for elements and target networks for jumps
		for(Network network : funcBlockDiagram.getNetworks()) {
			for(DiagramElement element : network.getNetworkElements()) {
				if(element.getSourceElements().isEmpty()) {
					LDTraverselUtil.setElementLevel(element, 0);
				}
				if (element instanceof Jump) {
					Jump jump = (Jump) element;
					String label = jump.getJumpLabel();
					for (Network targetNetwork : funcBlockDiagram.getNetworks()) {
						if (targetNetwork.getLabel() != null && targetNetwork.getLabel().equals(label)) {
							jump.setTargetNetwork(targetNetwork);
						}
					}
				}
			}	
		}
		
		return funcBlockDiagram;
	}

	private void handleInVariable(ParserNode inVariableNode) {
		checkForNewNetwork(inVariableNode);
		fbBuilder.handleGlobInVariable(inVariableNode);	
	}

	private void checkForNewNetwork(ParserNode elementNode) {
		int currentNetworkPosition = getActiveNetwork().getPosition();
		int position = extractNetworkPosition(elementNode.get("localId"));
		if (position > currentNetworkPosition) {
			currentNetworkPosition = position;
			openNetwork(currentNetworkPosition, funcBlockDiagram);
			fbBuilder.setNetwork(getActiveNetwork());
		}
	}
	
	private void handleBlock(ParserNode blockNode) {
		checkForNewNetwork(blockNode);
		getActiveNetwork().getNetworkElements().add(buildFunctionBlock(blockNode));
	}
	
	protected DiagramElement buildFunctionBlock(ParserNode blockNode) {
		return fbBuilder.buildFunctionBlock(blockNode);
	}

	private void handleOutVariable(ParserNode outVariableNode) {
		checkForNewNetwork(outVariableNode);
		fbBuilder.handleGlobOutVariable(outVariableNode);	
	}
	
	private void handleLabel(ParserNode labelNode) {
		checkForNewNetwork(labelNode);
		getActiveNetwork().setLabel(labelNode.get("label"));
	}
	
	private int extractNetworkPosition(String localId) {
		int networkNumEnd = localId.length() - COMMON_LOCAL_ID_LENGTH + 1;
		String networkNumString = localId.substring(0, networkNumEnd);
		return Integer.parseInt(networkNumString);
	}
	
	private void handleJump(ParserNode jumpNode) {
		FBDJump jumpElement = FunctionBlockDiagramFactory.eINSTANCE.createFBDJump();
		jumpElement.setLocalId(jumpNode.get("localId"));
		jumpElement.setJumpLabel(jumpNode.get("label"));
		List<PortVariableData> inputConnectionData = ldModelBuilder.extractConnections(jumpNode, "connectionPointIn");
		ldModelBuilder.setActiveNetwork(getActiveNetwork());
		ldModelBuilder.connectPorts(jumpElement, inputConnectionData, ldModelBuilder::connectInputPort, ldModelBuilder::connectInputPort);
		getActiveNetwork().getNetworkElements().add(jumpElement);
	}
	
	public static String name(ParserNode node) {
		return node.get(NODE_NAME_ATTRIBUTE);
	}

	@Override
	protected Network newNetwork() {
		return diagramFactory.createNetwork();
	}
}
