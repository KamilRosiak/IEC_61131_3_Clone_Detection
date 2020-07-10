package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.configuration;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_NAME_ATTRIBUTE;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.EntireProjectModelBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.StructuredTextUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XmlDomUtility;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ArrayVariable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Location;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.VariableDeclaration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.VariableLocationDataType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.VariableLocationType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IParserFactory;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.impl.DefaultParserFactory;

public class VariableBuilder {

	private class VariableInfo {
		String name = null;
		TypeInfo typeInfo = null;
		String initialValue = null;
		Location location = null;
	}
	
	private class TypeInfo {
		ElementaryDataType type = ElementaryDataType.UNSET;
		String typeString = null; // set if type is DERIVED
		public String lowerBound = null, upperBound = null;
	}
	
	private ConfigurationFactory configFactory;
	private IParserFactory parserFactory;

	public VariableBuilder(ConfigurationFactory configFactory) {
		this.configFactory = configFactory;
		this.parserFactory = new DefaultParserFactory();
	}
	
	public Variable buildGlobalVariable(ParserNode variableNode) {
		Variable var = buildVariable(variableNode);
		var.setScope(VariableDeclaration.VAR_GLOBAL);
		return var;
	}
	
	public Variable buildLocalVariable(ParserNode variableNode) {
		Variable var = buildVariable(variableNode);
		var.setScope(VariableDeclaration.VAR);
		return var;
	}
	
	public Variable buildInputVariable(ParserNode variableNode) {
		Variable var = buildVariable(variableNode);
		var.setScope(VariableDeclaration.VAR_INPUT);
		return var;
	}
	
	public Variable buildOutputVariable(ParserNode variableNode) {
		Variable var = buildVariable(variableNode);
		var.setScope(VariableDeclaration.VAR_OUTPUT);
		return var;
	}
	
	private Variable buildVariable(ParserNode variableNode) {
		if (variableNode.get(NODE_NAME_ATTRIBUTE).equals("variable")) {
			VariableInfo varInfo = extractVariableInfo(variableNode);
			if (!isValid(varInfo)) {
				throw new RuntimeException("Invalid variable info extracted.");
			}
	        
			Variable var = null;
			if (isArrayVariable(variableNode)) {
				// set lower and upper bound of array
				ArrayVariable arrayVar = configFactory.createArrayVariable();
				arrayVar.setArray(true);
				arrayVar.setLowerBound(StructuredTextUtil.buildExpression(varInfo.typeInfo.lowerBound, parserFactory));
				arrayVar.setUpperBound(StructuredTextUtil.buildExpression(varInfo.typeInfo.upperBound, parserFactory));
				var = arrayVar;
			} else {
				var = configFactory.createVariable();
			}
			
			// process and set extracted variable data 
			var.setName(varInfo.name);
			var.setType(varInfo.typeInfo.type);
			var.setTypeName(varInfo.typeInfo.typeString);
			var.setLocation(varInfo.location);
			var.setInitialValue(StructuredTextUtil.buildExpression(varInfo.initialValue, parserFactory));
			
	        return var;
		} else {
			throw new IllegalArgumentException(EntireProjectModelBuilder.illegalTagMessage(variableNode));
		}
	}

	private VariableInfo extractVariableInfo(ParserNode variableNode) {
		VariableInfo varInfo = new VariableInfo();
		
		String name = variableNode.get("name");
		if (name != null) {
			varInfo.name = name;			
		}
		
		TypeInfo typeInfo = getTypeInfo(variableNode);
		varInfo.typeInfo = typeInfo;
		
		String initialValue = getInitialValue(variableNode);
		varInfo.initialValue = initialValue;

    	Location loc = getLocation(variableNode);
    	varInfo.location = loc;
		
		return varInfo;
	}

	private TypeInfo getTypeInfo(ParserNode variableNode) {
		TypeInfo typeInfo = new TypeInfo();
		ParserNode typeNode = XmlDomUtility.getChildOf(variableNode, "type");
		if (typeNode == null) {
			throw new NullPointerException("Variable node must have a type node.");
		}
		
		// either extract info out of an array or a simple type node
		ParserNode exactTypeNode = typeNode.getChildren().get(0);
		if (isArray(exactTypeNode)) { // variable array type
			// get array dimensions
			ParserNode dimensionNode = XmlDomUtility.getChildOf(exactTypeNode, "dimension");
			if (dimensionNode == null) {
				throw new NullPointerException("Array type node must have a dimension node");
			}
			typeInfo.lowerBound = dimensionNode.get("lower");
			typeInfo.upperBound = dimensionNode.get("upper");
			
			ParserNode baseTypeNode = XmlDomUtility.getChildOf(exactTypeNode, "baseType");
			if (baseTypeNode == null) {
				throw new NullPointerException("Array type node must have a base type node");
			}
			
			// reset exact type so it can be treated like a normal variable type afterwards
			exactTypeNode = baseTypeNode.getChildren().get(0);
		}
		
		// extract the base type of the variable/array
		if (isDerived(exactTypeNode)) { // derived type
			typeInfo.type = ElementaryDataType.DERIVED;
			typeInfo.typeString = exactTypeNode.get("name");			
		} else { // primitive type
			String exactTypeName = exactTypeNode.get(NODE_NAME_ATTRIBUTE);
			typeInfo.type = ElementaryDataType.valueOf(exactTypeName.toUpperCase());
			typeInfo.typeString = exactTypeName;
		}
		
		return typeInfo;
	}

	private boolean isValid(VariableInfo varInfo) {
		boolean mandatoryFieldsNotNull = varInfo.name != null && varInfo.location != null && varInfo.typeInfo != null;
		if (mandatoryFieldsNotNull) {
			TypeInfo ti = varInfo.typeInfo;
			boolean typeConsistent = 
					ti.type != ElementaryDataType.UNSET && !ti.typeString.isEmpty() && 
					( (ti.lowerBound == null && ti.upperBound == null) || (ti.lowerBound != null && ti.upperBound != null) );
			return typeConsistent;
		}
		return false;
	}
	
	private boolean isArrayVariable(ParserNode variableNode) {
		if (variableNode.get(NODE_NAME_ATTRIBUTE).equals("variable")) {
			ParserNode typeNode = XmlDomUtility.getChildOf(variableNode, "type");
			if (typeNode != null) {
				ParserNode arrayNode = XmlDomUtility.getChildOf(typeNode, "array");
				return arrayNode != null;
			} else {
				return false;				
			}
		} else {
			throw new IllegalArgumentException(EntireProjectModelBuilder.illegalTagMessage(variableNode));
		}
	}

	private boolean isDerived(ParserNode exactTypeNode) {
		return exactTypeNode.<String>get(NODE_NAME_ATTRIBUTE).equalsIgnoreCase("derived");
	}
	
	private boolean isArray(ParserNode exactTypeNode) {
		return exactTypeNode.get(NODE_NAME_ATTRIBUTE).equals("array");
	}

	/**
	 * Accepts node "variable" and retrieves the initial value. 
	 * The initial value is optional.
	 * 
	 * @param variableNode
	 * @return string representing the initial value or null, if not present
	 */
	private String getInitialValue(ParserNode variableNode) {
		String initialValue = null;
		ParserNode initialValueNode = XmlDomUtility.getChildOf(variableNode, "initialValue");
		if (initialValueNode != null) {
			ParserNode simpleValueNode = XmlDomUtility.getChildOf(initialValueNode, "simpleValue");
			if (simpleValueNode != null) {
				initialValue = simpleValueNode.get("value");
			}
		}
		return initialValue;
	}
	
	private Location getLocation(ParserNode variableNode) {
		Location location = configFactory.createLocation();
		String locationAttr = variableNode.get("address");
		if (locationAttr != null) {
			VariableLocationType varLocationType = getVariableLocationType(locationAttr);
			location.setType(varLocationType);
			
			VariableLocationDataType varLocationDataType = getVariableLocationDataType(locationAttr);
			location.setDataType(varLocationDataType);
		}
		return location;
	}
	
	private VariableLocationType getVariableLocationType(String locationAttr) {
		VariableLocationType varLocationType = VariableLocationType.UNSET;
		if (locationAttr.contains("Q")) {
			varLocationType = VariableLocationType.Q;
		} else if (locationAttr.contains("M")) {
			varLocationType = VariableLocationType.M;
		} else if (locationAttr.contains("I")) {
			varLocationType = VariableLocationType.I;
		}
		return varLocationType;
	}
	
	private VariableLocationDataType getVariableLocationDataType(String locationAttr) {
		VariableLocationDataType varLocationDataType = VariableLocationDataType.UNSET;
		if (locationAttr.contains("X")) {
			varLocationDataType = VariableLocationDataType.X;
		} else if (locationAttr.contains("B")) {
			varLocationDataType = VariableLocationDataType.B;
		} else if (locationAttr.contains("W")) {
			varLocationDataType = VariableLocationDataType.W;
		} else if (locationAttr.contains("D")) {
			varLocationDataType = VariableLocationDataType.D;
		} else if (locationAttr.contains("L")) {
			varLocationDataType = VariableLocationDataType.L;
		} else if (locationAttr.contains("*")) {
			varLocationDataType = VariableLocationDataType.UNSPECIFIED;
		}
		return varLocationDataType;
	}
}
