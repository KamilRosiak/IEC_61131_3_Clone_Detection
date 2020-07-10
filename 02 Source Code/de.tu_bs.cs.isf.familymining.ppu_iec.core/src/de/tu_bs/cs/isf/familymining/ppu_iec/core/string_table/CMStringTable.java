package de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table;

public class CMStringTable {
	//Project Attributes Strings
	public final static String METRIC_CONTAINER_TYPE = "METRIC";
	
	public final static String PROJECT_CONTAINER_NAME = "PROJECT ATTRIBUTES";
	public final static String PROJECT_CONTAINER_DESCRIPTION = "Contains all project attributs";
	public final static String PROJECT_ATTRIBUTE_TYPE = "PROJECT ATTR";
	
	public final static String PROJECT_IMPL_OPTION = "Compare Program Organization Units (POUs)";
	public final static String PROJECT_IMPL_OPTION_DESC = "When activated, POUs will be compared.";
	
	public final static String PROJECT_VAR_OPTION = "Compare global variables";
	public final static String PROJECT_VAR_OPTION_DESC = "When activated, the variables will be compared.";
	
	
	public final static String IMPLEMENTATION_CONTAINER_NAME = "IMPLEMENTATION ATTRIBUTES";
	public final static String IMPLEMENTATION_CONTAINER_DESCRIPTION = "Contains separate groups and attributes for each of the five implemtation languages";

	public final static String IMPLEMENTATION_ATTRIBUTE_TYPE ="IMPLEMENTATION  ATTR";
	
	//POU Attribute Strings
	public final static String POU_CONTAINER_NAME = "POU ATTRIBUTES";
	public final static String POU_CONTAINER_DESCRIPTION = "Contains all POU attributs";
	
	public final static String POU_IMPL_OPTION = "Compare POU implementation";
	public final static String POU_IMPL_OPTION_DESC = "When activated, directly underlying implementation will be compared.";
	
	public final static String POU_VAR_OPTION = "Compare POU Variables";
	public final static String POU_VAR_OPTION_DESC = "When activated, the variables will be compared.";
	
	public final static String POU_ACTION_OPTION = "Compare POU actions";
	
	//Action Attributes 
	public final static String ACTION_IMPL_OPTION = "Compare Action implementation";
	public final static String ACTION_IMPL_OPTION_DESC = "When activated, directly underlying implementation will be compared.";
	
	
	//Impl Attributes 
	public final static String LANGUAGE_CONTAINER_NAME = "IEC 61131-3 LANGUAGES";
	public final static String LANGUAGE_CONTAINER_NAME_CONTAINER_DESCRIPTION = "Contains separate groups and attributes for each of the five implemtation languages";

	
	public final static String LANGUAGE_NESTED_OPTION = "Nested implementaion";
	public final static String LANGUAGE_NESTED_OPTION_DESC = "When activated, nested implementations will be compared.";
	
	
	public final static String IMPLEMENTATION_ATTR ="IMPLEMENTATION ATTRS";
	public final static String LANGUAGE_ATTR ="LANGUAGE ATTRS";
	
	public final static String CONFIGURATION_TYPE = "METRIC";
	public final static String MODEL_ATTR_TYPE = "PROJECT ATTR";
	public final static String POU_ATTR_TYPE = "POU ATTR";
	public final static String ACTION_ATTR_TYPE = "ACTION ATTR";
	public final static String VARIABLE_ATTR_TYPE = "VARIABLE ATTR";
	public final static String CONTAINER_TYPE = "ATTRIBUTE GROUP";
	public final static String OPTION_TYPE = "OPTION";
	
	//LADDER DIAGRAM OPTIONS
	public final static String LD_FBD_OPTION = "Compare Function Blocks";
	public final static String LD_FBD_OPTION_DESC = "When activated, function blocks compared with FBD implementation Attributes.";
	//FUNCTION BLOCK DIAGRAM OPTION
	public final static String FBD_ST_OPTION = "Compare Structured Text in Function Blocks";
	public final static String FBD_ST_OPTION_DESC = "When activated, Structured Text implementation compared with ST implementation Attributes.";
	//SFC OPTION
	public final static String SFC_ACTION_OPTION = "Compare Action implementation";
	public final static String SFC_ACTION_DESC = "When activated, Action implementation compared with implementation Attributes.";
	
	//CONTAINER TYPES
	public final static String LANGUAGE_ATTR_CONTAINER_ST = "STRUCTURED TEXT";
	public final static String LANGUAGE_ATTR_CONTAINER_SFC = "SEQUENTIAL FUNCTION CHART";
	public final static String LANGUAGE_ATTR_CONTAINER_LD = "LADDER DIAGRAM";
	public final static String LANGUAGE_ATTR_CONTAINER_FBD = "FUNCTION BLOCK DIAGRAM";

	
	public final static String ACTION_CONTAINER_NAME = "PROJECT ATTRIBUTES";
	public final static String ACTION_CONTAINER_DESCRIPTION = "Contains all Action attributs";
	
	public final static String VARIABLE_CONTAINER_NAME = "VARIABLE ATTRIBUTES";
	public final static String VARIABLE_CONTAINER_DESCRIPTION = "Contains all Variable attributs";
	
	///////////////////////VAR TYPES////////////////////////////////////
	public static final String GLOBAL_VARS_DESCRIPTION   = "GLOBAL_VARS";
	public static final String IN_OUT_VARS_DESCRIPTION   = "IN_OUT_VARS";
	public static final String INPUT_VARS_DESCRIPTION    = "INPUT_VARS";
	public static final String OUTPUT_VARS_DESCRIPTION   = "OUTPUT_VARS";
	public static final String INTERNAL_VARS_DESCRIPTION = "INTERNAL_VARS";
}
