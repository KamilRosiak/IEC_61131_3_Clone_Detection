package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util.PortVariableData.PortType;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.StructuredTextUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IParserFactory;

public class DiagramUtil {
	private static DiagramFactory diagramFactory = DiagramFactory.eINSTANCE;
	
	public static DiagramElement findDiagramElementBy(Network network, long localId) {
		for (DiagramElement diagramElement: network.getNetworkElements()) {
			if (hasLocalId(diagramElement, localId)) {
				return diagramElement;
			}
		}			
		return null;
	}
	
	private static boolean hasLocalId(DiagramElement element, long targetLocalId) {
		return Long.parseLong(element.getLocalId()) == targetLocalId;
	}
	
	public static List<DiagramElement> findDiagramElementsBy(Network network, List<Long> localIds) {
		List<DiagramElement> diagramElements = new ArrayList<>();
		for (DiagramElement diagramElement: network.getNetworkElements()) {
			if (hasLocalId(diagramElement, localIds)) {
				 diagramElements.add(diagramElement);
			}
		}			
		return diagramElements;
	}

	private static boolean hasLocalId(DiagramElement element, List<Long> targetLocalId) {
		return targetLocalId.contains(Long.parseLong(element.getLocalId()));
	}
	
	public static Port buildLDPort(DiagramElement diagramElement, PortType portType) {
		Port port = diagramFactory.createPort();
		port.setAttachedElement(diagramElement);
		switch (portType) {
			case INPUT: {
				diagramElement.getInputPorts().add(port);				
			} break;
			case OUTPUT: {
				diagramElement.getOutputPorts().add(port);
			} break;
			case INOUT: {
				// TODO: model input/output-ports
				Port outPort = diagramFactory.createPort();
				outPort.setAttachedElement(diagramElement);
				diagramElement.getOutputPorts().add(outPort);
				diagramElement.getInputPorts().add(port);
				port.getConnectedPorts().add(outPort);
				outPort.getConnectedPorts().add(port);
			}
			case UNDEFINED: {
				throw new RuntimeException("The port type is undefined.");
			}
		}
		return port;
	}
	
	public static FBPort buildFBPort(DiagramElement diagramElement, PortVariableData portVariableData, IParserFactory parserFactory) {
		FBPort fbPort = diagramFactory.createFBPort();
		fbPort.setAttachedElement(diagramElement);
		switch (portVariableData.getPortType()) {
			case INPUT: {
				diagramElement.getInputPorts().add(fbPort);				
			} break;
			case OUTPUT: {
				diagramElement.getOutputPorts().add(fbPort);
			} break;
			case INOUT: {
				// TODO: model input/output-ports
				Port outPort = diagramFactory.createPort();
				outPort.setAttachedElement(diagramElement);
				diagramElement.getOutputPorts().add(outPort);
				diagramElement.getInputPorts().add(fbPort);
				fbPort.getConnectedPorts().add(outPort);
				outPort.getConnectedPorts().add(fbPort);
			}
			case UNDEFINED: {
				throw new RuntimeException("The port type is undefined.");
			}
		}
		
		if (portVariableData.hasExpressionString()) {
			Expression assignedValue = StructuredTextUtil.buildExpression(portVariableData.getExpressionString(), parserFactory);
			fbPort.setAssignedValue(assignedValue);
		}
		if (portVariableData.hasName()) {
			VariableExpression portVariable = StructuredTextUtil.buildVariableExpression(portVariableData.getName(), parserFactory);
			fbPort.setPortVariable(portVariable);
		}
		fbPort.setNegated(false); // TODO: not used yet, find out if something was overlooked
		fbPort.setConnected(portVariableData.isConnected());
		return fbPort;
	}
	
	public static void setElementReferences(DiagramElement sourceElement, DiagramElement targetElement) {
		sourceElement.getTargetElements().add(targetElement);
		targetElement.getSourceElements().add(sourceElement);
	}
	
	public static void setPortReferences(Port portA, Port portB) {
		portA.getConnectedPorts().add(portB);
		portB.getConnectedPorts().add(portA);
	}
	
	public static boolean isEqual(VariableExpression var1, VariableExpression var2) {
		boolean isSymbolEqual = var1.getSymbol().equals(var2.getSymbol());
		boolean hasComparableSubvariable = var1.getInnerVariable() != null && var2.getInnerVariable() != null;
		return hasComparableSubvariable ? isSymbolEqual && isEqual(var1.getInnerVariable(), var2.getInnerVariable()) : isSymbolEqual; 
	}
	
	/**
	 * Checks if the elements of <i>network</i> form a connected graph.
	 * 
	 * @param network diagram network
	 * @return true if connected, otherwise return false
	 * 
	 * @see Diagram
	 * @see Network
	 */
	protected static boolean isConnected(Network network) {
		List<DiagramElement> elements = network.getNetworkElements();
		if (elements.isEmpty()) {
			return true;
		} else {
			// true if the bfs found the same exact number of elements in the network, else false
			Set<DiagramElement> elementSet = breadthFirstSearch(elements.get(0));			
			
			assert elementSet.size() <= elements.size();
			return elementSet.size() == elements.size();			
		}
	}

	/**
	 * Splits a disconnected network graph according to its connected subnetworks.
	 * 
	 * @param network the network to be split
	 * @param startIndex start index of the new list of subnetworks, might be different from the input network's index
	 * @return the subnetworks resulting from splitting the input network
	 */
	protected List<Network> split(Network network, int startIndex) {
		List<DiagramElement> elements = network.getNetworkElements();
		if (elements.isEmpty()) {
			return Arrays.asList(network);
		}
		
		// splitting iteration
		// 1. initialize list with all elements
		// 2. choose start element
		// 3. group reachable elements from start element
		// 4. remove grouped elements from list
		// 5. if list is not empty, go to step 2
		// 6. return subnetworks
		List<Network> subnetworks = new ArrayList<>();
		int networkId = startIndex;
		while (!elements.isEmpty()) {
			Set<DiagramElement> subnetworkElements = breadthFirstSearch(elements.get(0));
			Network subnetwork = diagramFactory.createNetwork();
			subnetwork.setDiagram(network.getDiagram());
			subnetwork.setPosition(networkId);
			subnetwork.getNetworkElements().addAll(subnetworkElements);
			
			subnetworks.add(subnetwork);
			networkId++;
		}
		return subnetworks;
	}
	
	/**
	 * Initiates a BFS search beginning from the start element.
	 * The output set of elements is sorted by local id in ascending order.
	 * 
	 * @param startElement
	 * @return the sorted set of reachable elements
	 */
	private static Set<DiagramElement> breadthFirstSearch(DiagramElement startElement) {
		// initialize the set of already seen elements and the queue for bfs
		SortedSet<DiagramElement> elementSet = new TreeSet<>((e1, e2) -> (int) (Long.parseLong(e1.getLocalId()) - Long.parseLong(e2.getLocalId())));
		elementSet.add(startElement);
		Deque<DiagramElement> bfsQueue = new ArrayDeque<>();
		bfsQueue.addLast(startElement);
		while (!bfsQueue.isEmpty()) {
			DiagramElement currentElement = bfsQueue.removeFirst();
			Set<DiagramElement> neighbors = new HashSet<>();
			neighbors.addAll(currentElement.getSourceElements());
			neighbors.addAll(currentElement.getTargetElements());
			
			// insert all new neighbor elements, add all seen elements into our set
			for (DiagramElement neighborElement : neighbors) {
				if (!elementSet.contains(neighborElement)) {
					bfsQueue.addLast(neighborElement);
					elementSet.add(neighborElement);
				}
			}
		}
		return elementSet;
	}
}
