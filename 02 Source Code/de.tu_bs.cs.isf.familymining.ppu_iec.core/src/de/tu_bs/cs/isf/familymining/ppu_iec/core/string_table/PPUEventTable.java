package de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table;

public class PPUEventTable {
	
	public static final String LOAD_METRIC_FROM_FILE = "LOAD_METRIC_FROM_FILE";
	public static final String LOAD_RESULT_FROM_FILE = "LOAD_RESULT_FROM_FILE";
	public static final String NEW_CONFIGURATION = "NEW_METRIC";
	public static final String ADD_ATTRIBUTE ="ADD_ATTRIBUTE";
	public static final String UPDATE_CONFIG ="UPDATE_CONFIG";
	public static final String SET_MODEL = "SET_MODEL";

	public static final String CHECK_WEIGHTS ="CHECK_WEIGHTS_EVENT";
	public static final String RESULT_EVENT ="RESULT_EVENT";

	/**
	 * Metric Manager Events
	 */
	public static final String ADD_MODEL_ATTR = "ADD_MODEL_ATTR";
	public static final String ADD_POU_ATTR = "ADD_POU_ATTR";
	public static final String ADD_ACTION_ATTR = "ADD_ACTION_ATTR";
	public static final String ADD_VARIABLE_ATTR = "ADD_VARIABLE_ATTR";
	
	public static final String ADD_ST_LANG_ATTR = "ADD_ST_LANG_ATTR";
	public static final String ADD_SFC_LANG_ATTR = "ADD_SFC_LANG_ATTR";
	public static final String ADD_LD_LANG_ATTR = "ADD_LD_LANG_ATTR";
	
	public static final String ADD_ST_IMPL_ATTR = "ADD_ST_IMPL_ATTR";
	public static final String ADD_SFC_IMPL_ATTR = "ADD_SFC_IMPL_ATTR";
	public static final String ADD_LD_IMPL_ATTR = "ADD_LD_IMPL_ATTR";
	
	public static final String ADD_FBD_IMPL_ATTR = "ADD_FBD_IMPL_ATTR";
	
	/**
	 * Compare Engine Events
	 */
	public static final String START_COMPARE_ENGINE = "START_COMPARE_ENGINE";
	public static final String QUICK_COMPARE_ENGINE = "QUICK_COMPARE_ENGINE";
	public static final String MULTI_COMPARE_ENGINE = "MULTI_COMPARE_ENGINE";
	public static final String MATCH_COMPARE_ENGINE = "MATCH_COMPARE_ENGINE";
	public static final String COMPARE_COMPARE_ENGINE = "COMPARE_COMPARE_ENGINE";
	public static final String PRESENTATION_COMPARE_ENGINE = "PRESENTATION_COMPARE_ENGINE";
	public static final String ADD_RESULT = "ADD_RESULT";
	
	
	/**
	 * Component Extraction
	 * 
	 */
	public final static String PROJECT_COMPARE_EVENT = "PROJECT_COMPARE_EVENT";
	public final static String COMPARE_POU_EVENT = "COMPARE_POU_EVENT";
}
