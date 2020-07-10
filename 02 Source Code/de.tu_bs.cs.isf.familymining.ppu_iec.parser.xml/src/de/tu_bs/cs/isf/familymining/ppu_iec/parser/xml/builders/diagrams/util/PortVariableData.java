package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.util;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple data struct for collecting raw port data.
 * 
 * @author Oliver Urbaniak
 *
 */
public class PortVariableData {
	
	public static enum PortType {UNDEFINED, INPUT, OUTPUT, INOUT};
	
	private String name;
	private List<Long> refIds;
	private boolean connected;
	private String connectedParameterString;
	private String expressionString;
	private PortType portType;
	
	public PortVariableData() {
		this.setName("");
		this.setRefIds(new ArrayList<>());
		this.setConnectedParameterString("");
		this.setExpressionString("");
		this.setPortType(PortType.UNDEFINED);
		connected = true;
	}
	
	/**
	 * Simple field initialization.
	 * 
	 * @param name the name of the port
	 * @param refId the id of the counterpart to the port
	 * @param connected states if the port is connected to another port
	 * @param portString is either a connected parameter, the port it connects to, or an assigned expression as fixed source of input/output
	 * @param portType the specific type of the port
	 */
	public PortVariableData(String name, List<Long> refIds, boolean connected, String portString, PortType portType) {
		this.setName(name);
		this.setRefIds(refIds);
		if (connected) {
			this.setConnectedParameterString(portString);
		} else {
			this.setExpressionString(portString);
		}
		this.setPortType(portType);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean hasName() {
		return name != null && !name.isEmpty();
	}

	public List<Long> getRefIds() {
		return refIds;
	}

	public void addRefId(long refId) {
		refIds.add(refId);
	}
	
	public void setRefIds(List<Long> refId) {
		this.refIds = refId;
	}
	
	public boolean hasRefId() {
		return refIds != null && refIds.size() > 0;
	}

	public String getConnectedParameterString() {
		return connectedParameterString;
	}

	/**
	 * Stores a parameter string identifying the port on the other connection endpoint.
	 * Automatically sets the connection flag.
	 * 
	 * @param connectedParameterString
	 */
	public void setConnectedParameterString(String connectedParameterString) {
		this.connectedParameterString = connectedParameterString;
		if (this.connectedParameterString == null) {
			throw new InvalidParameterException("the input parameter of the connected parameter string is invalid");
		}
		connected = true;
	}
	
	/**
	 * A connected port has a connectedParameterString set whereas a disconnected port has a expressionString set
	 * 
	 * @return true if connected, false otherwise
	 */
	public boolean hasConnectedParameterString() {
		return connectedParameterString != null && !connectedParameterString.isEmpty();
	}

	public String getExpressionString() {
		return expressionString;
	}

	/**
	 * Stores an expression string representing the assigned value of that connectionless port.
	 * Automatically resets the connection flag.
	 * 
	 * @param expressionString
	 */
	public void setExpressionString(String expressionString) {
		this.expressionString = expressionString;
		if (this.expressionString == null) {
			throw new InvalidParameterException("The input parameter of the expression string is invalid.");
		}
		connected = false;
	}
	
	public boolean hasExpressionString() {
		return expressionString != null && !expressionString.isEmpty();
	}

	public PortType getPortType() {
		return portType;
	}

	public void setPortType(PortType portType) {
		this.portType = portType;
	}

	public boolean isConnected() {
		return connected;
	}
}