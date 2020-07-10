/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Elementary Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.StructuredTextExpressionPackage#getElementaryDataType()
 * @model
 * @generated
 */
public enum ElementaryDataType implements Enumerator {
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
	 * The '<em><b>SINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINT_VALUE
	 * @generated
	 * @ordered
	 */
	SINT(1, "SINT", "SINT"),

	/**
	 * The '<em><b>INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(2, "INT", "INT"),

	/**
	 * The '<em><b>DINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DINT_VALUE
	 * @generated
	 * @ordered
	 */
	DINT(3, "DINT", "DINT"),

	/**
	 * The '<em><b>LINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINT_VALUE
	 * @generated
	 * @ordered
	 */
	LINT(4, "LINT", "LINT"),

	/**
	 * The '<em><b>USINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USINT_VALUE
	 * @generated
	 * @ordered
	 */
	USINT(5, "USINT", "USINT"),

	/**
	 * The '<em><b>UINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT_VALUE
	 * @generated
	 * @ordered
	 */
	UINT(6, "UINT", "UINT"),

	/**
	 * The '<em><b>UDINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UDINT_VALUE
	 * @generated
	 * @ordered
	 */
	UDINT(7, "UDINT", "UDINT"),

	/**
	 * The '<em><b>REAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_VALUE
	 * @generated
	 * @ordered
	 */
	REAL(8, "REAL", "REAL"),

	/**
	 * The '<em><b>LREAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LREAL_VALUE
	 * @generated
	 * @ordered
	 */
	LREAL(9, "LREAL", "LREAL"),

	/**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(10, "TIME", "TIME"),

	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(11, "DATE", "DATE"),

	/**
	 * The '<em><b>TIME OF DAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_OF_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_OF_DAY(12, "TIME_OF_DAY", "TIME_OF_DAY"),

	/**
	 * The '<em><b>TOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOD_VALUE
	 * @generated
	 * @ordered
	 */
	TOD(13, "TOD", "TOD"),

	/**
	 * The '<em><b>DATE AND TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_AND_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_AND_TIME(14, "DATE_AND_TIME", "DATE_AND_TIME"),

	/**
	 * The '<em><b>STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(15, "STRING", "STRING"),

	/**
	 * The '<em><b>BYTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	BYTE(16, "BYTE", "BYTE"),

	/**
	 * The '<em><b>WORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORD_VALUE
	 * @generated
	 * @ordered
	 */
	WORD(17, "WORD", "WORD"),

	/**
	 * The '<em><b>DWORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DWORD_VALUE
	 * @generated
	 * @ordered
	 */
	DWORD(18, "DWORD", "DWORD"),

	/**
	 * The '<em><b>LWORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LWORD_VALUE
	 * @generated
	 * @ordered
	 */
	LWORD(19, "LWORD", "LWORD"),

	/**
	 * The '<em><b>WSTRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WSTRING_VALUE
	 * @generated
	 * @ordered
	 */
	WSTRING(20, "WSTRING", "WSTRING"),

	/**
	 * The '<em><b>BOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOL_VALUE
	 * @generated
	 * @ordered
	 */
	BOOL(21, "BOOL", "BOOL"),

	/**
	 * The '<em><b>DERIVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVED_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVED(22, "DERIVED", "DERIVED");

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
	 * The '<em><b>SINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINT_VALUE = 1;

	/**
	 * The '<em><b>INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 2;

	/**
	 * The '<em><b>DINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DINT_VALUE = 3;

	/**
	 * The '<em><b>LINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINT_VALUE = 4;

	/**
	 * The '<em><b>USINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USINT_VALUE = 5;

	/**
	 * The '<em><b>UINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UINT_VALUE = 6;

	/**
	 * The '<em><b>UDINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UDINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UDINT_VALUE = 7;

	/**
	 * The '<em><b>REAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL_VALUE = 8;

	/**
	 * The '<em><b>LREAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LREAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LREAL_VALUE = 9;

	/**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 10;

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 11;

	/**
	 * The '<em><b>TIME OF DAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_OF_DAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_OF_DAY_VALUE = 12;

	/**
	 * The '<em><b>TOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOD_VALUE = 13;

	/**
	 * The '<em><b>DATE AND TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_AND_TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_AND_TIME_VALUE = 14;

	/**
	 * The '<em><b>STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 15;

	/**
	 * The '<em><b>BYTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BYTE_VALUE = 16;

	/**
	 * The '<em><b>WORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORD_VALUE = 17;

	/**
	 * The '<em><b>DWORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DWORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DWORD_VALUE = 18;

	/**
	 * The '<em><b>LWORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LWORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LWORD_VALUE = 19;

	/**
	 * The '<em><b>WSTRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WSTRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WSTRING_VALUE = 20;

	/**
	 * The '<em><b>BOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOL_VALUE = 21;

	/**
	 * The '<em><b>DERIVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DERIVED_VALUE = 22;

	/**
	 * An array of all the '<em><b>Elementary Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ElementaryDataType[] VALUES_ARRAY =
		new ElementaryDataType[] {
			UNSET,
			SINT,
			INT,
			DINT,
			LINT,
			USINT,
			UINT,
			UDINT,
			REAL,
			LREAL,
			TIME,
			DATE,
			TIME_OF_DAY,
			TOD,
			DATE_AND_TIME,
			STRING,
			BYTE,
			WORD,
			DWORD,
			LWORD,
			WSTRING,
			BOOL,
			DERIVED,
		};

	/**
	 * A public read-only list of all the '<em><b>Elementary Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ElementaryDataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Elementary Data Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ElementaryDataType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementaryDataType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Elementary Data Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ElementaryDataType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementaryDataType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Elementary Data Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ElementaryDataType get(int value) {
		switch (value) {
			case UNSET_VALUE: return UNSET;
			case SINT_VALUE: return SINT;
			case INT_VALUE: return INT;
			case DINT_VALUE: return DINT;
			case LINT_VALUE: return LINT;
			case USINT_VALUE: return USINT;
			case UINT_VALUE: return UINT;
			case UDINT_VALUE: return UDINT;
			case REAL_VALUE: return REAL;
			case LREAL_VALUE: return LREAL;
			case TIME_VALUE: return TIME;
			case DATE_VALUE: return DATE;
			case TIME_OF_DAY_VALUE: return TIME_OF_DAY;
			case TOD_VALUE: return TOD;
			case DATE_AND_TIME_VALUE: return DATE_AND_TIME;
			case STRING_VALUE: return STRING;
			case BYTE_VALUE: return BYTE;
			case WORD_VALUE: return WORD;
			case DWORD_VALUE: return DWORD;
			case LWORD_VALUE: return LWORD;
			case WSTRING_VALUE: return WSTRING;
			case BOOL_VALUE: return BOOL;
			case DERIVED_VALUE: return DERIVED;
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
	private ElementaryDataType(int value, String name, String literal) {
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
	
} //ElementaryDataType
