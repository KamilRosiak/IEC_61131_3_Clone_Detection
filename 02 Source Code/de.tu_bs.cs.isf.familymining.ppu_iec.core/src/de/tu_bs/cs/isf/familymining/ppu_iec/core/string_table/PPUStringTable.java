package de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table;

public class PPUStringTable {
	public static final String APPLICATION_NAME = "Variability Analysis Toolkit for IEC61131-3 Languages";
	public static final String BUNDLE_NAME  = "de.tu_bs.cs.isf.familymining.ppu_iec.core";
	
	//PARTS AND VIEWS
	public static final String ANALYTICS_VIEW_ID ="de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.part.ppuiecanalyticsview";
	public static final String METRIC_MANAGER_VIEW_ID ="de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager";
	public static final String RESULT_MANAGER_VIEW_ID ="de.tu_bs.cs.isf.familymining.ppu_iec.result_manager";
	public static final String COMPARE_ENGINE_VIEW_ID ="de.tu_bs.cs.isf.familymining.ppu_iec.parts.compare_engine_view";
	public static final String PROJECT_COMPARE_VIEW ="de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.part.ProjectCompare";
	
	//Extension points
	public static final String ACTION_ATTRIBUTE_SYMBOLIC_NAME 	 = "de.tu_bs.cs.isf.familymining.ppu_iec.core.ActionAttribute";
	public static final String MODEL_ATTRIBUTE_SYMBOLIC_NAME 	     = "de.tu_bs.cs.isf.familymining.ppu_iec.core.ModelAttribute";
	public static final String POU_ATTRIBUTE_SYMBOLIC_NAME      	 = "de.tu_bs.cs.isf.familymining.ppu_iec.core.POUAttribute";
	public static final String VARIABLE_ATTRIBUTE_SYMBOLIC_NAME    = "de.tu_bs.cs.isf.familymining.ppu_iec.core.VariableAttribute";
	public static final String MATCHER_ATTRIBUTE_SYMBOLIC_NAME     = "de.tu_bs.cs.isf.familymining.ppu_iec.core.Matcher";
	
	//IEC 61131-3 Languages 
	public static final String ST_LANG_ATTRIBUTE_SYMBOLIC_NAME 	 = "de.tu_bs.cs.isf.familymining.ppu_iec.core.STLanguageAttribute";
	public static final String ST_IMPL_ATTRIBUTE_SYMBOLIC_NAME 	 = "de.tu_bs.cs.isf.familymining.ppu_iec.core.STImplementationAttribute";

	public static final String SFC_LANG_ATTRIBUTE_SYMBOLIC_NAME 	 = "de.tu_bs.cs.isf.familymining.ppu_iec.core.SFCLanguageAttribute";
	public static final String SFC_IMPL_ATTRIBUTE_SYMBOLIC_NAME 	 = "de.tu_bs.cs.isf.familymining.ppu_iec.core.SFCImplementationAttribute";
	
	public static final String LD_LANG_ATTRIBUTE_SYMBOLIC_NAME 	 = "de.tu_bs.cs.isf.familymining.ppu_iec.core.LDLanguageAttribute";
	public static final String LD_IMPL_ATTRIBUTE_SYMBOLIC_NAME 	 = "de.tu_bs.cs.isf.familymining.ppu_iec.core.LDImplementationAttribute";
	
	public static final String FBD_IMPL_ATTRIBUTE_SYMBOLIC_NAME 	 = "de.tu_bs.cs.isf.familymining.ppu_iec.core.FBDImplementationAttribute";
	
	
	
	
	//element for the extensions
	public static String MODEL_ATTR_EXTENSION     ="model_attr";
	public static String POU_ATTR_EXTENSION 	  ="pou_attr";
	public static String MATCHER_ATTR_EXTENSION   ="matcher_obj";
	public static String ACTION_ATTR_EXTENSION    ="action_attr";
	public static String VARIABLE_ATTR_EXTENSION  ="variable_attr";
	
	//implementation attribute
	public static String ST_ATTR_EXTENSION = "st_attr";
	public static String SFC_ATTR_EXTENSION = "sfc_attr";
	public static String LD_ATTR_EXTENSION = "ld_attr";
	public static String FBD_ATTR_EXTENSION = "fbd_attr";
	
	//Language Preprocessor
	public static String FBD ="FBD";
	public static String IL ="IL";
	public static String LD ="LD";
	public static String SFC ="SFC";
	public static String ST ="ST";
	public static String FDB ="FDB";
	
	// Variability Classifications
	public static String MANDATORY = "MANDATORY";
	public static String ALTERNATIVE = "ALTERNATIVE";
	public static String OPTIONAL = "OPTIONAL";
	
	// Variant Subsystem Declaraiton
	public static final String VARIANT_SUBSYSTEM = "Variant Subsystem";
	
	public final static String CONFIGURATION_TYPE = "METRIC";
	public final static String MODEL_ATTR_TYPE = "PROJECT ATTR";
	public final static String POU_ATTR_TYPE = "POU ATTR";
	public final static String ACTION_ATTR_TYPE = "ACTION_ATTR";
	public final static String LANGUAGE_ATTR_TYPE = "PROGRAM ATTR";
	
	public final static String ST_LANGUAGE_ATTR_TYPE = "ST LANGUAGE ATTR";
	public final static String SFC_LANGUAGE_ATTR_TYPE = "SFC LANGUAGE ATTR";
	public final static String LD_LANGUAGE_ATTR_TYPE = "LD LANGUAGE ATTR";
	public final static String FBD_LANGUAGE_ATTR_TYPE = "FBD LANGUAGE ATTR";
	
	public final static String ST_IMPLEMENTATION_ATTR_TYPE = "ST IMPLEMENTATION ATTR";
	public final static String SFC_IMPLEMENTATION_ATTR_TYPE = "SFC IMPLEMENTATION ATTR";
	public final static String LD_IMPLEMENTATION_ATTR_TYPE = "LD IMPLEMENTATION ATTR";
	public final static String FBD_IMPLEMENTATION_ATTR_TYPE = "FBD IMPLEMENTATION ATTR";
	
	public final static String VARIABLE_ATTR_TYPE = "VARIABLE ATTR";
	public final static String CONTAINER_TYPE = "ATTRIBUTE GROUP";
	public final static String OPTION_TYPE = "OPTION";

	//Project Attributes Strings
	public final static String METRIC_CONTAINER_TYPE = "METRIC";
	
	
	public final static String PROJECT_CONTAINER_NAME = "PROJECT ATTRIBUTES";
	public final static String PROJECT_CONTAINER_DESCRIPTION = "Contains all project attributs";

	public final static String PROJECT_ATTRIBUTE_TYPE = "PROJECT ATTR";
	
	
	public final static String PROGRAM_CONTAINER_NAME = "PROGRAM ATTRIBUTES";
	public final static String PROGRAM_CONTAINER_DESCRIPTION = "Contains separate groups and attributes for each of the five implemtation languages";

	public final static String IMPLEMENTATION_CONTAINER_NAME = "IMPLEMENTATION ATTRIBUTES";
	public final static String IMPLEMENTATION_CONTAINER_DESCRIPTION = "Contains";
	
	public final static String IMPLEMENTATION_ATTRIBUTE_TYPE ="IMPLEMENTATION  ATTR";
	
	public final static String POU_CONTAINER_NAME = "POU ATTRIBUTES";
	public final static String POU_CONTAINER_DESCRIPTION = "Contains all POU attributs";
	
	
	public final static String ACTION_CONTAINER_NAME = "ACTION ATTRIBUTES";
	public final static String ACTION_CONTAINER_DESCRIPTION = "Contains all Action attributs";
	
	public final static String VARIABLE_CONTAINER_NAME = "VARIABLE ATTRIBUTES";
	public final static String VARIABLE_CONTAINER_DESCRIPTION = "Contains all Variable attributs";
	
	///////////////////////VAR TYPES////////////////////////////////////
	public static final String GLOBAL_VARS_DESCRIPTION   = "GLOBAL_VARS";
	public static final String IN_OUT_VARS_DESCRIPTION   = "IN_OUT_VARS";
	public static final String INPUT_VARS_DESCRIPTION    = "INPUT_VARS";
	public static final String OUTPUT_VARS_DESCRIPTION   = "OUTPUT_VARS";
	public static final String INTERNAL_VARS_DESCRIPTION = "INTERNAL_VARS";
	
	
	
	/***********************************
	 *  COMPARE ENGINE 
	 */
	//Compare Engine View
	public static String CE_ERROR 				  = "Compare Engine Error";
	public static String CE_ERROR_CONFIG 		  = "no configuration selected";
	public static String CE_ERROR_DEFAULT_CONFIG  = "no default configuration selected";
	public static String CE_ERROR_SOURCE_MODEL    = "no source model selected";
	public static String CE_ERROR_TARGET_MODEL 	  = "no target model selected";
	public static String CE_ERROR_MATCHER 		  = "no matcher selected";

}
