/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Standard Function Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage#getStandardFunctionOperation()
 * @model
 * @generated
 */
public enum StandardFunctionOperation implements Enumerator {
	/**
	 * The '<em><b>UNSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSET_VALUE
	 * @generated
	 * @ordered
	 */
	UNSET(0, "UNSET", "UNSET"),

	/**
	 * The '<em><b>TYPECHANGE TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPECHANGE_TO_VALUE
	 * @generated
	 * @ordered
	 */
	TYPECHANGE_TO(1, "TYPECHANGE_TO", "TYPECHANGE_TO"),

	/**
	 * The '<em><b>TRUNC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUNC_VALUE
	 * @generated
	 * @ordered
	 */
	TRUNC(2, "TRUNC", "TRUNC"),

	/**
	 * The '<em><b>BCD TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BCD_TO_VALUE
	 * @generated
	 * @ordered
	 */
	BCD_TO(3, "BCD_TO", "BCD_TO"),

	/**
	 * The '<em><b>TO BCD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_BCD_VALUE
	 * @generated
	 * @ordered
	 */
	TO_BCD(4, "TO_BCD", "TO_BCD"),

	/**
	 * The '<em><b>DT TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DT_TO_VALUE
	 * @generated
	 * @ordered
	 */
	DT_TO(5, "DT_TO", "DT_TO"),

	/**
	 * The '<em><b>TOD TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOD_TO_VALUE
	 * @generated
	 * @ordered
	 */
	TOD_TO(6, "TOD_TO", "TOD_TO"),

	/**
	 * The '<em><b>DATE TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TO_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_TO(7, "DATE_TO", "DATE_TO"),

	/**
	 * The '<em><b>TO BOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_BOOL_VALUE
	 * @generated
	 * @ordered
	 */
	TO_BOOL(8, "TO_BOOL", "TO_BOOL"),

	/**
	 * The '<em><b>BOOL TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	BOOL_TO(9, "BOOL_TO", "BOOL_TO"),

	/**
	 * The '<em><b>STRING TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_TO_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_TO(10, "STRING_TO", "STRING_TO"),

	/**
	 * The '<em><b>TO STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	TO_STRING(11, "TO_STRING", "TO_STRING"),

	/**
	 * The '<em><b>TIME TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_TO_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_TO(12, "TIME_TO", "TIME_TO"),

	/**
	 * The '<em><b>ABS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABS_VALUE
	 * @generated
	 * @ordered
	 */
	ABS(13, "ABS", "ABS"),

	/**
	 * The '<em><b>SQRT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQRT_VALUE
	 * @generated
	 * @ordered
	 */
	SQRT(14, "SQRT", "SQRT"),

	/**
	 * The '<em><b>LN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LN_VALUE
	 * @generated
	 * @ordered
	 */
	LN(15, "LN", "LN"),

	/**
	 * The '<em><b>LOG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG_VALUE
	 * @generated
	 * @ordered
	 */
	LOG(16, "LOG", "LOG"),

	/**
	 * The '<em><b>EXP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXP_VALUE
	 * @generated
	 * @ordered
	 */
	EXP(17, "EXP", "EXP"),

	/**
	 * The '<em><b>SIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIN_VALUE
	 * @generated
	 * @ordered
	 */
	SIN(18, "SIN", "SIN"),

	/**
	 * The '<em><b>COS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COS_VALUE
	 * @generated
	 * @ordered
	 */
	COS(19, "COS", "COS"),

	/**
	 * The '<em><b>TAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAN_VALUE
	 * @generated
	 * @ordered
	 */
	TAN(20, "TAN", "TAN"),

	/**
	 * The '<em><b>ASIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASIN_VALUE
	 * @generated
	 * @ordered
	 */
	ASIN(21, "ASIN", "ASIN"),

	/**
	 * The '<em><b>ACOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACOS_VALUE
	 * @generated
	 * @ordered
	 */
	ACOS(22, "ACOS", "ACOS"),

	/**
	 * The '<em><b>ATAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATAN_VALUE
	 * @generated
	 * @ordered
	 */
	ATAN(23, "ATAN", "ATAN"),

	/**
	 * The '<em><b>ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_VALUE
	 * @generated
	 * @ordered
	 */
	ADD(24, "ADD", "ADD"),

	/**
	 * The '<em><b>MUL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUL_VALUE
	 * @generated
	 * @ordered
	 */
	MUL(25, "MUL", "MUL"),

	/**
	 * The '<em><b>SUB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUB_VALUE
	 * @generated
	 * @ordered
	 */
	SUB(26, "SUB", "SUB"),

	/**
	 * The '<em><b>DIV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIV_VALUE
	 * @generated
	 * @ordered
	 */
	DIV(27, "DIV", "DIV"),

	/**
	 * The '<em><b>MOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOD_VALUE
	 * @generated
	 * @ordered
	 */
	MOD(28, "MOD", "MOD"),

	/**
	 * The '<em><b>EXPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPT(29, "EXPT", "EXPT"),

	/**
	 * The '<em><b>MOVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_VALUE
	 * @generated
	 * @ordered
	 */
	MOVE(30, "MOVE", "MOVE"),

	/**
	 * The '<em><b>SHL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHL_VALUE
	 * @generated
	 * @ordered
	 */
	SHL(31, "SHL", "SHL"),

	/**
	 * The '<em><b>SHR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHR_VALUE
	 * @generated
	 * @ordered
	 */
	SHR(32, "SHR", "SHR"),

	/**
	 * The '<em><b>ROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROR_VALUE
	 * @generated
	 * @ordered
	 */
	ROR(33, "ROR", "ROR"),

	/**
	 * The '<em><b>ROL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROL_VALUE
	 * @generated
	 * @ordered
	 */
	ROL(34, "ROL", "ROL"),

	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(35, "AND", "AND"),

	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(36, "OR", "OR"),

	/**
	 * The '<em><b>XOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XOR_VALUE
	 * @generated
	 * @ordered
	 */
	XOR(37, "XOR", "XOR"),

	/**
	 * The '<em><b>NOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_VALUE
	 * @generated
	 * @ordered
	 */
	NOT(38, "NOT", "NOT"),

	/**
	 * The '<em><b>SEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEL_VALUE
	 * @generated
	 * @ordered
	 */
	SEL(39, "SEL", "SEL"),

	/**
	 * The '<em><b>MAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_VALUE
	 * @generated
	 * @ordered
	 */
	MAX(40, "MAX", "MAX"),

	/**
	 * The '<em><b>MIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_VALUE
	 * @generated
	 * @ordered
	 */
	MIN(41, "MIN", "MIN"),

	/**
	 * The '<em><b>LIMIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMIT_VALUE
	 * @generated
	 * @ordered
	 */
	LIMIT(42, "LIMIT", "LIMIT"),

	/**
	 * The '<em><b>MUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUX_VALUE
	 * @generated
	 * @ordered
	 */
	MUX(43, "MUX", "MUX"),

	/**
	 * The '<em><b>GT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT_VALUE
	 * @generated
	 * @ordered
	 */
	GT(44, "GT", "GT"),

	/**
	 * The '<em><b>GE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GE_VALUE
	 * @generated
	 * @ordered
	 */
	GE(45, "GE", "GE"),

	/**
	 * The '<em><b>EQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ_VALUE
	 * @generated
	 * @ordered
	 */
	EQ(46, "EQ", "EQ"),

	/**
	 * The '<em><b>LT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT_VALUE
	 * @generated
	 * @ordered
	 */
	LT(47, "LT", "LT"),

	/**
	 * The '<em><b>LE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LE_VALUE
	 * @generated
	 * @ordered
	 */
	LE(48, "LE", "LE"),

	/**
	 * The '<em><b>NE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NE_VALUE
	 * @generated
	 * @ordered
	 */
	NE(49, "NE", "NE"),

	/**
	 * The '<em><b>LEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEN_VALUE
	 * @generated
	 * @ordered
	 */
	LEN(50, "LEN", "LEN"),

	/**
	 * The '<em><b>LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT(51, "LEFT", "LEFT"),

	/**
	 * The '<em><b>RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT(52, "RIGHT", "RIGHT"),

	/**
	 * The '<em><b>MID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MID_VALUE
	 * @generated
	 * @ordered
	 */
	MID(53, "MID", "MID"),

	/**
	 * The '<em><b>CONCAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCAT_VALUE
	 * @generated
	 * @ordered
	 */
	CONCAT(54, "CONCAT", "CONCAT"),

	/**
	 * The '<em><b>INSERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_VALUE
	 * @generated
	 * @ordered
	 */
	INSERT(55, "INSERT", "INSERT"),

	/**
	 * The '<em><b>DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(56, "DELETE", "DELETE"),

	/**
	 * The '<em><b>REPLACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACE(57, "REPLACE", "REPLACE"),

	/**
	 * The '<em><b>FIND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIND_VALUE
	 * @generated
	 * @ordered
	 */
	FIND(58, "FIND", "FIND");

	/**
	 * The '<em><b>UNSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSET_VALUE = 0;

	/**
	 * The '<em><b>TYPECHANGE TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPECHANGE_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TYPECHANGE_TO_VALUE = 1;

	/**
	 * The '<em><b>TRUNC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUNC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRUNC_VALUE = 2;

	/**
	 * The '<em><b>BCD TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BCD_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BCD_TO_VALUE = 3;

	/**
	 * The '<em><b>TO BCD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_BCD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TO_BCD_VALUE = 4;

	/**
	 * The '<em><b>DT TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DT_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DT_TO_VALUE = 5;

	/**
	 * The '<em><b>TOD TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOD_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOD_TO_VALUE = 6;

	/**
	 * The '<em><b>DATE TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TO_VALUE = 7;

	/**
	 * The '<em><b>TO BOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_BOOL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TO_BOOL_VALUE = 8;

	/**
	 * The '<em><b>BOOL TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOL_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOL_TO_VALUE = 9;

	/**
	 * The '<em><b>STRING TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_VALUE = 10;

	/**
	 * The '<em><b>TO STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TO_STRING_VALUE = 11;

	/**
	 * The '<em><b>TIME TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_TO_VALUE = 12;

	/**
	 * The '<em><b>ABS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABS_VALUE = 13;

	/**
	 * The '<em><b>SQRT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQRT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SQRT_VALUE = 14;

	/**
	 * The '<em><b>LN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LN_VALUE = 15;

	/**
	 * The '<em><b>LOG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOG_VALUE = 16;

	/**
	 * The '<em><b>EXP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXP_VALUE = 17;

	/**
	 * The '<em><b>SIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIN_VALUE = 18;

	/**
	 * The '<em><b>COS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COS_VALUE = 19;

	/**
	 * The '<em><b>TAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TAN_VALUE = 20;

	/**
	 * The '<em><b>ASIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASIN_VALUE = 21;

	/**
	 * The '<em><b>ACOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACOS_VALUE = 22;

	/**
	 * The '<em><b>ATAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ATAN_VALUE = 23;

	/**
	 * The '<em><b>ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADD_VALUE = 24;

	/**
	 * The '<em><b>MUL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MUL_VALUE = 25;

	/**
	 * The '<em><b>SUB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUB_VALUE = 26;

	/**
	 * The '<em><b>DIV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIV_VALUE = 27;

	/**
	 * The '<em><b>MOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOD_VALUE = 28;

	/**
	 * The '<em><b>EXPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPT_VALUE = 29;

	/**
	 * The '<em><b>MOVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVE_VALUE = 30;

	/**
	 * The '<em><b>SHL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHL_VALUE = 31;

	/**
	 * The '<em><b>SHR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHR_VALUE = 32;

	/**
	 * The '<em><b>ROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROR_VALUE = 33;

	/**
	 * The '<em><b>ROL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROL_VALUE = 34;

	/**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 35;

	/**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 36;

	/**
	 * The '<em><b>XOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XOR_VALUE = 37;

	/**
	 * The '<em><b>NOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_VALUE = 38;

	/**
	 * The '<em><b>SEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEL_VALUE = 39;

	/**
	 * The '<em><b>MAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAX_VALUE = 40;

	/**
	 * The '<em><b>MIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIN_VALUE = 41;

	/**
	 * The '<em><b>LIMIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_VALUE = 42;

	/**
	 * The '<em><b>MUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MUX_VALUE = 43;

	/**
	 * The '<em><b>GT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GT_VALUE = 44;

	/**
	 * The '<em><b>GE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GE_VALUE = 45;

	/**
	 * The '<em><b>EQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQ_VALUE = 46;

	/**
	 * The '<em><b>LT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LT_VALUE = 47;

	/**
	 * The '<em><b>LE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LE_VALUE = 48;

	/**
	 * The '<em><b>NE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NE_VALUE = 49;

	/**
	 * The '<em><b>LEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEN_VALUE = 50;

	/**
	 * The '<em><b>LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_VALUE = 51;

	/**
	 * The '<em><b>RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_VALUE = 52;

	/**
	 * The '<em><b>MID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MID_VALUE = 53;

	/**
	 * The '<em><b>CONCAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONCAT_VALUE = 54;

	/**
	 * The '<em><b>INSERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSERT_VALUE = 55;

	/**
	 * The '<em><b>DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 56;

	/**
	 * The '<em><b>REPLACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPLACE_VALUE = 57;

	/**
	 * The '<em><b>FIND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIND_VALUE = 58;

	/**
	 * An array of all the '<em><b>Standard Function Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StandardFunctionOperation[] VALUES_ARRAY =
		new StandardFunctionOperation[] {
			UNSET,
			TYPECHANGE_TO,
			TRUNC,
			BCD_TO,
			TO_BCD,
			DT_TO,
			TOD_TO,
			DATE_TO,
			TO_BOOL,
			BOOL_TO,
			STRING_TO,
			TO_STRING,
			TIME_TO,
			ABS,
			SQRT,
			LN,
			LOG,
			EXP,
			SIN,
			COS,
			TAN,
			ASIN,
			ACOS,
			ATAN,
			ADD,
			MUL,
			SUB,
			DIV,
			MOD,
			EXPT,
			MOVE,
			SHL,
			SHR,
			ROR,
			ROL,
			AND,
			OR,
			XOR,
			NOT,
			SEL,
			MAX,
			MIN,
			LIMIT,
			MUX,
			GT,
			GE,
			EQ,
			LT,
			LE,
			NE,
			LEN,
			LEFT,
			RIGHT,
			MID,
			CONCAT,
			INSERT,
			DELETE,
			REPLACE,
			FIND,
		};

	/**
	 * A public read-only list of all the '<em><b>Standard Function Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StandardFunctionOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Standard Function Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StandardFunctionOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StandardFunctionOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Standard Function Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StandardFunctionOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StandardFunctionOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Standard Function Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StandardFunctionOperation get(int value) {
		switch (value) {
			case UNSET_VALUE: return UNSET;
			case TYPECHANGE_TO_VALUE: return TYPECHANGE_TO;
			case TRUNC_VALUE: return TRUNC;
			case BCD_TO_VALUE: return BCD_TO;
			case TO_BCD_VALUE: return TO_BCD;
			case DT_TO_VALUE: return DT_TO;
			case TOD_TO_VALUE: return TOD_TO;
			case DATE_TO_VALUE: return DATE_TO;
			case TO_BOOL_VALUE: return TO_BOOL;
			case BOOL_TO_VALUE: return BOOL_TO;
			case STRING_TO_VALUE: return STRING_TO;
			case TO_STRING_VALUE: return TO_STRING;
			case TIME_TO_VALUE: return TIME_TO;
			case ABS_VALUE: return ABS;
			case SQRT_VALUE: return SQRT;
			case LN_VALUE: return LN;
			case LOG_VALUE: return LOG;
			case EXP_VALUE: return EXP;
			case SIN_VALUE: return SIN;
			case COS_VALUE: return COS;
			case TAN_VALUE: return TAN;
			case ASIN_VALUE: return ASIN;
			case ACOS_VALUE: return ACOS;
			case ATAN_VALUE: return ATAN;
			case ADD_VALUE: return ADD;
			case MUL_VALUE: return MUL;
			case SUB_VALUE: return SUB;
			case DIV_VALUE: return DIV;
			case MOD_VALUE: return MOD;
			case EXPT_VALUE: return EXPT;
			case MOVE_VALUE: return MOVE;
			case SHL_VALUE: return SHL;
			case SHR_VALUE: return SHR;
			case ROR_VALUE: return ROR;
			case ROL_VALUE: return ROL;
			case AND_VALUE: return AND;
			case OR_VALUE: return OR;
			case XOR_VALUE: return XOR;
			case NOT_VALUE: return NOT;
			case SEL_VALUE: return SEL;
			case MAX_VALUE: return MAX;
			case MIN_VALUE: return MIN;
			case LIMIT_VALUE: return LIMIT;
			case MUX_VALUE: return MUX;
			case GT_VALUE: return GT;
			case GE_VALUE: return GE;
			case EQ_VALUE: return EQ;
			case LT_VALUE: return LT;
			case LE_VALUE: return LE;
			case NE_VALUE: return NE;
			case LEN_VALUE: return LEN;
			case LEFT_VALUE: return LEFT;
			case RIGHT_VALUE: return RIGHT;
			case MID_VALUE: return MID;
			case CONCAT_VALUE: return CONCAT;
			case INSERT_VALUE: return INSERT;
			case DELETE_VALUE: return DELETE;
			case REPLACE_VALUE: return REPLACE;
			case FIND_VALUE: return FIND;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StandardFunctionOperation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //StandardFunctionOperation
