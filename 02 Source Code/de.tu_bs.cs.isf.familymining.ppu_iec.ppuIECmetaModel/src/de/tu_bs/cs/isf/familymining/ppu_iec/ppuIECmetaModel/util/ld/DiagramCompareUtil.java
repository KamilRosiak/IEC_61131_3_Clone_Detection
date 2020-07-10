package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.ld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.ExecutionBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st.expression.ExpressionCompareUtil;

public class DiagramCompareUtil {
	
	/**
	 * This method compares two List of DiagramElements by classes and returns a similarity value based on matched classes.
	 */
	public static float compareInOutElements(List<DiagramElement> sourceObjects, List<DiagramElement> targetObjects) {
		List<DiagramElement> sourceElements = new ArrayList<DiagramElement>();
		sourceElements.addAll(sourceObjects);
		Iterator<DiagramElement> sourceIterator = sourceElements.iterator();
		
		List<DiagramElement> targetElements = new ArrayList<DiagramElement>();
		targetElements.addAll(targetObjects);
		Iterator<DiagramElement> targetIterator = targetElements.iterator();
		
		DiagramElement sourceElement;
		DiagramElement targetElement;
		
		int matchedItems = 0;
		while(sourceIterator.hasNext()) {
			sourceElement = sourceIterator.next();
			while(targetIterator.hasNext()) {
				targetElement = targetIterator.next();
				if(sourceElement.getClass().toString().equals(targetElement.getClass().toString())) {
					
					if(sourceElement instanceof LLElement && targetElement instanceof LLElement) {
						sourceIterator.remove();
						targetIterator.remove();
						matchedItems++;
						break;
					}
					
					if(sourceElement instanceof StandardFunction && targetElement instanceof StandardFunction) {
						if(compareStandadFunction((StandardFunction)sourceElement, (StandardFunction)targetElement)) {
							sourceIterator.remove();
							targetIterator.remove();
							matchedItems++;
							break;
						}
						break;
					}
					
					if(sourceElement instanceof StandardFunctionBlock && targetElement instanceof StandardFunctionBlock) {
						if(compareStandadFunctionBlock((StandardFunctionBlock)sourceElement, (StandardFunctionBlock)targetElement)) {
							sourceIterator.remove();
							targetIterator.remove();
							matchedItems++;
							break;
						}
						break;
					}
					if(sourceElement instanceof ExecutionBlock && targetElement instanceof ExecutionBlock) {
							sourceIterator.remove();
							targetIterator.remove();
							matchedItems++;
							break;
					}
					if(sourceElement instanceof Jump && targetElement instanceof Jump) {
						sourceIterator.remove();
						targetIterator.remove();
						matchedItems++;
						break;
					}
				}
			}
		}
		
		int maxSize = Math.max(sourceObjects.size(), targetObjects.size());
		if(maxSize > 0) {
			return (float)matchedItems/(float)maxSize;
		} else {
			return 0;
		}
	}
	
	/**
	 * This method compares StandardFunctions based on the operation.
	 */
	public static boolean compareStandadFunction(StandardFunction first, StandardFunction second) {
		return first.getFunctionOperation().equals(second.getFunctionOperation());
	}
	
	/**
	 * This method compares StandardFunctionBlock based on the functionBlockoperation.
	 */
	public static boolean compareStandadFunctionBlock(StandardFunctionBlock first, StandardFunctionBlock second) {
		return first.getFunctionBlockOperation().equals(second.getFunctionBlockOperation());
	}
	
	/**
	 * This method compares two lists of ports based on symbols.
	 */
	public static float compareInOutPorts(List<Port> sourcePorts, List<Port> targetPorts) {
		List<Port> sourceElements = new ArrayList<Port>();
		sourceElements.addAll(sourcePorts);
		Iterator<Port> sourceIterator = sourceElements.iterator();
		
		List<Port> targetElements = new ArrayList<Port>();
		targetElements.addAll(targetPorts);
		Iterator<Port> targetIterator = targetElements.iterator();
		
		Port sourcePort;
		Port targetPort;
		
		int matchedPorts = 0;
		while(sourceIterator.hasNext()) {
			sourcePort = sourceIterator.next();
			while(targetIterator.hasNext()) {
				targetPort = targetIterator.next();
				if(sourcePort instanceof FBPort && targetPort instanceof FBPort) {
					FBPort sourceFBP = (FBPort)sourcePort;
					FBPort targetFBP = (FBPort)targetPort;
					if(ExpressionCompareUtil.compareSymbols(sourceFBP.getPortVariable(),targetFBP.getPortVariable())) {
						if(ExpressionCompareUtil.compare(sourceFBP.getAssignedValue(), targetFBP.getAssignedValue()) == 1f || 
								sourceFBP.getAssignedValue() == null && targetFBP.getAssignedValue() == null) {
							sourceIterator.remove();
							targetIterator.remove();
							matchedPorts++;
							break;
						}
					}
				}
			}
		}

		int maxSize = Math.max(sourcePorts.size(), targetPorts.size());
		if(maxSize > 0) {
			return (float)matchedPorts/(float)maxSize;
		} else {
			return 0;
		}
	}
	
	
}
