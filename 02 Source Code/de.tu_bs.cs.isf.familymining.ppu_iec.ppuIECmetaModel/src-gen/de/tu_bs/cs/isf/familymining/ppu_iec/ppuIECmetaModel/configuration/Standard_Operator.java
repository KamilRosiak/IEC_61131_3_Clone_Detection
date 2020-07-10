/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Standard Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getStandard_Operator()
 * @model
 * @generated
 */
public enum Standard_Operator implements Enumerator {
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
	 * The '<em><b>LD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LD_VALUE
	 * @generated
	 * @ordered
	 */
	LD(1, "LD", "LD"),

	/**
	 * The '<em><b>ST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ST_VALUE
	 * @generated
	 * @ordered
	 */
	ST(2, "ST", "ST"),

	/**
	 * The '<em><b>S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S_VALUE
	 * @generated
	 * @ordered
	 */
	S(3, "S", "S"),

	/**
	 * The '<em><b>R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R_VALUE
	 * @generated
	 * @ordered
	 */
	R(4, "R", "R"),

	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(5, "AND", "AND"),

	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(6, "OR", "OR"),

	/**
	 * The '<em><b>XOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XOR_VALUE
	 * @generated
	 * @ordered
	 */
	XOR(7, "XOR", "XOR"),

	/**
	 * The '<em><b>ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_VALUE
	 * @generated
	 * @ordered
	 */
	ADD(8, "ADD", "ADD"),

	/**
	 * The '<em><b>SUB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUB_VALUE
	 * @generated
	 * @ordered
	 */
	SUB(9, "SUB", "SUB"),

	/**
	 * The '<em><b>MUL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUL_VALUE
	 * @generated
	 * @ordered
	 */
	MUL(10, "MUL", "MUL"),

	/**
	 * The '<em><b>DIV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIV_VALUE
	 * @generated
	 * @ordered
	 */
	DIV(11, "DIV", "DIV"),

	/**
	 * The '<em><b>GT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT_VALUE
	 * @generated
	 * @ordered
	 */
	GT(12, "GT", "GT"),

	/**
	 * The '<em><b>GE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GE_VALUE
	 * @generated
	 * @ordered
	 */
	GE(13, "GE", "GE"),

	/**
	 * The '<em><b>EQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ_VALUE
	 * @generated
	 * @ordered
	 */
	EQ(14, "EQ", "EQ"),

	/**
	 * The '<em><b>NE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NE_VALUE
	 * @generated
	 * @ordered
	 */
	NE(15, "NE", "NE"),

	/**
	 * The '<em><b>LE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LE_VALUE
	 * @generated
	 * @ordered
	 */
	LE(17, "LE", "LE"),

	/**
	 * The '<em><b>LT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT_VALUE
	 * @generated
	 * @ordered
	 */
	LT(18, "LT", "LT"),

	/**
	 * The '<em><b>JMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JMP_VALUE
	 * @generated
	 * @ordered
	 */
	JMP(19, "JMP", "JMP"),

	/**
	 * The '<em><b>CAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAL_VALUE
	 * @generated
	 * @ordered
	 */
	CAL(20, "CAL", "CAL"),

	/**
	 * The '<em><b>RET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RET_VALUE
	 * @generated
	 * @ordered
	 */
	RET(21, "RET", "RET"),

	/**
	 * The '<em><b>BRACKET CLOSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRACKET_CLOSE_VALUE
	 * @generated
	 * @ordered
	 */
	BRACKET_CLOSE(22, "BRACKET_CLOSE", "BRACKET_CLOSE"),

	/**
	 * The '<em><b>SHL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHL_VALUE
	 * @generated
	 * @ordered
	 */
	SHL(23, "SHL", "SHL"),

	/**
	 * The '<em><b>INC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INC_VALUE
	 * @generated
	 * @ordered
	 */
	INC(24, "INC", "INC"),

	/**
	 * The '<em><b>MIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_VALUE
	 * @generated
	 * @ordered
	 */
	MIN(25, "MIN", "MIN"),

	/**
	 * The '<em><b>MAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_VALUE
	 * @generated
	 * @ordered
	 */
	MAX(26, "MAX", "MAX"),

	/**
	 * The '<em><b>MUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUX_VALUE
	 * @generated
	 * @ordered
	 */
	MUX(27, "MUX", "MUX"),

	/**
	 * The '<em><b>LIMIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMIT_VALUE
	 * @generated
	 * @ordered
	 */
	LIMIT(28, "LIMIT", "LIMIT"),

	/**
	 * The '<em><b>LEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEN_VALUE
	 * @generated
	 * @ordered
	 */
	LEN(29, "LEN", "LEN"),

	/**
	 * The '<em><b>LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT(30, "LEFT", "LEFT"),

	/**
	 * The '<em><b>RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT(31, "RIGHT", "RIGHT"),

	/**
	 * The '<em><b>MID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MID_VALUE
	 * @generated
	 * @ordered
	 */
	MID(32, "MID", "MID"),

	/**
	 * The '<em><b>CONCAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCAT_VALUE
	 * @generated
	 * @ordered
	 */
	CONCAT(33, "CONCAT", "CONCAT"),

	/**
	 * The '<em><b>INSERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_VALUE
	 * @generated
	 * @ordered
	 */
	INSERT(34, "INSERT", "INSERT"),

	/**
	 * The '<em><b>DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(35, "DELETE", "DELETE"),

	/**
	 * The '<em><b>REPLACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACE(36, "REPLACE", "REPLACE"),

	/**
	 * The '<em><b>FIND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIND_VALUE
	 * @generated
	 * @ordered
	 */
	FIND(37, "FIND", "FIND"),

	/**
	 * The '<em><b>MOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOD_VALUE
	 * @generated
	 * @ordered
	 */
	MOD(38, "MOD", "MOD"),

	/**
	 * The '<em><b>SIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIN_VALUE
	 * @generated
	 * @ordered
	 */
	SIN(39, "SIN", "SIN"),

	/**
	 * The '<em><b>COS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COS_VALUE
	 * @generated
	 * @ordered
	 */
	COS(40, "COS", "COS");

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
	 * The '<em><b>LD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LD_VALUE = 1;

	/**
	 * The '<em><b>ST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ST_VALUE = 2;

	/**
	 * The '<em><b>S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S_VALUE = 3;

	/**
	 * The '<em><b>R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R_VALUE = 4;

	/**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 5;

	/**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 6;

	/**
	 * The '<em><b>XOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XOR_VALUE = 7;

	/**
	 * The '<em><b>ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADD_VALUE = 8;

	/**
	 * The '<em><b>SUB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUB_VALUE = 9;

	/**
	 * The '<em><b>MUL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MUL_VALUE = 10;

	/**
	 * The '<em><b>DIV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIV_VALUE = 11;

	/**
	 * The '<em><b>GT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GT_VALUE = 12;

	/**
	 * The '<em><b>GE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GE_VALUE = 13;

	/**
	 * The '<em><b>EQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQ_VALUE = 14;

	/**
	 * The '<em><b>NE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NE_VALUE = 15;

	/**
	 * The '<em><b>LE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LE_VALUE = 17;

	/**
	 * The '<em><b>LT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LT_VALUE = 18;

	/**
	 * The '<em><b>JMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JMP_VALUE = 19;

	/**
	 * The '<em><b>CAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAL_VALUE = 20;

	/**
	 * The '<em><b>RET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RET_VALUE = 21;

	/**
	 * The '<em><b>BRACKET CLOSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRACKET_CLOSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BRACKET_CLOSE_VALUE = 22;

	/**
	 * The '<em><b>SHL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHL_VALUE = 23;

	/**
	 * The '<em><b>INC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INC_VALUE = 24;

	/**
	 * The '<em><b>MIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIN_VALUE = 25;

	/**
	 * The '<em><b>MAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAX_VALUE = 26;

	/**
	 * The '<em><b>MUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MUX_VALUE = 27;

	/**
	 * The '<em><b>LIMIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_VALUE = 28;

	/**
	 * The '<em><b>LEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEN_VALUE = 29;

	/**
	 * The '<em><b>LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_VALUE = 30;

	/**
	 * The '<em><b>RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_VALUE = 31;

	/**
	 * The '<em><b>MID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MID_VALUE = 32;

	/**
	 * The '<em><b>CONCAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONCAT_VALUE = 33;

	/**
	 * The '<em><b>INSERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSERT_VALUE = 34;

	/**
	 * The '<em><b>DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 35;

	/**
	 * The '<em><b>REPLACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPLACE_VALUE = 36;

	/**
	 * The '<em><b>FIND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIND_VALUE = 37;

	/**
	 * The '<em><b>MOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOD_VALUE = 38;

	/**
	 * The '<em><b>SIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIN_VALUE = 39;

	/**
	 * The '<em><b>COS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COS_VALUE = 40;

	/**
	 * An array of all the '<em><b>Standard Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Standard_Operator[] VALUES_ARRAY =
		new Standard_Operator[] {
			UNSET,
			LD,
			ST,
			S,
			R,
			AND,
			OR,
			XOR,
			ADD,
			SUB,
			MUL,
			DIV,
			GT,
			GE,
			EQ,
			NE,
			LE,
			LT,
			JMP,
			CAL,
			RET,
			BRACKET_CLOSE,
			SHL,
			INC,
			MIN,
			MAX,
			MUX,
			LIMIT,
			LEN,
			LEFT,
			RIGHT,
			MID,
			CONCAT,
			INSERT,
			DELETE,
			REPLACE,
			FIND,
			MOD,
			SIN,
			COS,
		};

	/**
	 * A public read-only list of all the '<em><b>Standard Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Standard_Operator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Standard Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Standard_Operator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Standard_Operator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Standard Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Standard_Operator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Standard_Operator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Standard Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Standard_Operator get(int value) {
		switch (value) {
			case UNSET_VALUE: return UNSET;
			case LD_VALUE: return LD;
			case ST_VALUE: return ST;
			case S_VALUE: return S;
			case R_VALUE: return R;
			case AND_VALUE: return AND;
			case OR_VALUE: return OR;
			case XOR_VALUE: return XOR;
			case ADD_VALUE: return ADD;
			case SUB_VALUE: return SUB;
			case MUL_VALUE: return MUL;
			case DIV_VALUE: return DIV;
			case GT_VALUE: return GT;
			case GE_VALUE: return GE;
			case EQ_VALUE: return EQ;
			case NE_VALUE: return NE;
			case LE_VALUE: return LE;
			case LT_VALUE: return LT;
			case JMP_VALUE: return JMP;
			case CAL_VALUE: return CAL;
			case RET_VALUE: return RET;
			case BRACKET_CLOSE_VALUE: return BRACKET_CLOSE;
			case SHL_VALUE: return SHL;
			case INC_VALUE: return INC;
			case MIN_VALUE: return MIN;
			case MAX_VALUE: return MAX;
			case MUX_VALUE: return MUX;
			case LIMIT_VALUE: return LIMIT;
			case LEN_VALUE: return LEN;
			case LEFT_VALUE: return LEFT;
			case RIGHT_VALUE: return RIGHT;
			case MID_VALUE: return MID;
			case CONCAT_VALUE: return CONCAT;
			case INSERT_VALUE: return INSERT;
			case DELETE_VALUE: return DELETE;
			case REPLACE_VALUE: return REPLACE;
			case FIND_VALUE: return FIND;
			case MOD_VALUE: return MOD;
			case SIN_VALUE: return SIN;
			case COS_VALUE: return COS;
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
	private Standard_Operator(int value, String name, String literal) {
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
	
} //Standard_Operator
