package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util;

public class XMLStringTable {
	/**
	 * Plugin
	 */
	public static final String PARSER_EXTENSION_ID = "XmlParser";
	
	public static final String NODECALLBACK_EXTENSION_ID = "PPUFillCallback";
	public static final String PARSER_PROCESS_EXTENSION_ID = "IECProjectConverter";
	
	public static final String PARSER_PROCESS_SINGLE_POU_EXTENSION_ID = "IECSinglePOUConverter";
	public static final String NODECALLBACK_SINGLE_POU_EXTENSION_ID = "IECSinglePOUCallback";
	
	public static final String MODEL_INSTANCE_EXTENSION = "project";

	/**
	 * Structured Text Plugin (redundant)
	 */
	public static final String ST_PARSER_EXTENSION_ID = "STParser";
	public final static String ST_CALLBACK_EXTENSION_ID = "STNodeCallback";
	public final static String VARIABLE_CALLBACK_EXTENSION_ID = "STVariableCallback"; 
	public final static String EXPRESSION_CALLBACK_EXTENSION_ID = "STExpressionCallback"; 
	
	/**
	 * Parser Node
	 */
	public static final String NODE_NAME_ATTRIBUTE = "NodeName";
	public static final String NODE_CONTENT_ATTRIBUTE = "NodeContent";
	public static final String NODE_TYPE_ATTRIBUTE = "NodeType";
}
