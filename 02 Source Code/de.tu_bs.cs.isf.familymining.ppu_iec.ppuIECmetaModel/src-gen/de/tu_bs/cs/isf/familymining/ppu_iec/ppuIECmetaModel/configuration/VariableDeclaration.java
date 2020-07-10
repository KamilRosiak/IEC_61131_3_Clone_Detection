/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Variable Declaration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public enum VariableDeclaration implements Enumerator {
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
	 * The '<em><b>VAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_VALUE
	 * @generated
	 * @ordered
	 */
	VAR(1, "VAR", "VAR"),

	/**
	 * The '<em><b>VAR EXTERNAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_EXTERNAL_VALUE
	 * @generated
	 * @ordered
	 */
	VAR_EXTERNAL(2, "VAR_EXTERNAL", "VAR_EXTERNAL"),

	/**
	 * The '<em><b>VAR TEMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_TEMP_VALUE
	 * @generated
	 * @ordered
	 */
	VAR_TEMP(3, "VAR_TEMP", "VAR_TEMP"),

	/**
	 * The '<em><b>VAR INPUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	VAR_INPUT(4, "VAR_INPUT", "VAR_INPUT"),

	/**
	 * The '<em><b>VAR OUTPUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	VAR_OUTPUT(5, "VAR_OUTPUT", "VAR_OUTPUT"),

	/**
	 * The '<em><b>VAR IN OUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_IN_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	VAR_IN_OUT(6, "VAR_IN_OUT", "VAR_IN_OUT"),

	/**
	 * The '<em><b>VAR ACCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	VAR_ACCESS(7, "VAR_ACCESS", "VAR_ACCESS"),

	/**
	 * The '<em><b>VAR GLOBAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_GLOBAL_VALUE
	 * @generated
	 * @ordered
	 */
	VAR_GLOBAL(8, "VAR_GLOBAL", "VAR_GLOBAL"),

	/**
	 * The '<em><b>VAR CONFIG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_CONFIG_VALUE
	 * @generated
	 * @ordered
	 */
	VAR_CONFIG(9, "VAR_CONFIG", "VAR_CONFIG"),

	/**
	 * The '<em><b>RETAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETAIN_VALUE
	 * @generated
	 * @ordered
	 */
	RETAIN(10, "RETAIN", "RETAIN"),

	/**
	 * The '<em><b>NON RETAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_RETAIN_VALUE
	 * @generated
	 * @ordered
	 */
	NON_RETAIN(11, "NON_RETAIN", "NON_RETAIN"),

	/**
	 * The '<em><b>CONSTANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTANT(12, "CONSTANT", "CONSTANT"),

	/**
	 * The '<em><b>AT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_VALUE
	 * @generated
	 * @ordered
	 */
	AT(13, "AT", "AT");

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
	 * The '<em><b>VAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VAR_VALUE = 1;

	/**
	 * The '<em><b>VAR EXTERNAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_EXTERNAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VAR_EXTERNAL_VALUE = 2;

	/**
	 * The '<em><b>VAR TEMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_TEMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VAR_TEMP_VALUE = 3;

	/**
	 * The '<em><b>VAR INPUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_INPUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VAR_INPUT_VALUE = 4;

	/**
	 * The '<em><b>VAR OUTPUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_OUTPUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VAR_OUTPUT_VALUE = 5;

	/**
	 * The '<em><b>VAR IN OUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_IN_OUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VAR_IN_OUT_VALUE = 6;

	/**
	 * The '<em><b>VAR ACCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_ACCESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VAR_ACCESS_VALUE = 7;

	/**
	 * The '<em><b>VAR GLOBAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_GLOBAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VAR_GLOBAL_VALUE = 8;

	/**
	 * The '<em><b>VAR CONFIG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_CONFIG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VAR_CONFIG_VALUE = 9;

	/**
	 * The '<em><b>RETAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RETAIN_VALUE = 10;

	/**
	 * The '<em><b>NON RETAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_RETAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NON_RETAIN_VALUE = 11;

	/**
	 * The '<em><b>CONSTANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT_VALUE = 12;

	/**
	 * The '<em><b>AT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AT_VALUE = 13;

	/**
	 * An array of all the '<em><b>Variable Declaration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VariableDeclaration[] VALUES_ARRAY =
		new VariableDeclaration[] {
			UNSET,
			VAR,
			VAR_EXTERNAL,
			VAR_TEMP,
			VAR_INPUT,
			VAR_OUTPUT,
			VAR_IN_OUT,
			VAR_ACCESS,
			VAR_GLOBAL,
			VAR_CONFIG,
			RETAIN,
			NON_RETAIN,
			CONSTANT,
			AT,
		};

	/**
	 * A public read-only list of all the '<em><b>Variable Declaration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VariableDeclaration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Variable Declaration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariableDeclaration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VariableDeclaration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Variable Declaration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariableDeclaration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VariableDeclaration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Variable Declaration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariableDeclaration get(int value) {
		switch (value) {
			case UNSET_VALUE: return UNSET;
			case VAR_VALUE: return VAR;
			case VAR_EXTERNAL_VALUE: return VAR_EXTERNAL;
			case VAR_TEMP_VALUE: return VAR_TEMP;
			case VAR_INPUT_VALUE: return VAR_INPUT;
			case VAR_OUTPUT_VALUE: return VAR_OUTPUT;
			case VAR_IN_OUT_VALUE: return VAR_IN_OUT;
			case VAR_ACCESS_VALUE: return VAR_ACCESS;
			case VAR_GLOBAL_VALUE: return VAR_GLOBAL;
			case VAR_CONFIG_VALUE: return VAR_CONFIG;
			case RETAIN_VALUE: return RETAIN;
			case NON_RETAIN_VALUE: return NON_RETAIN;
			case CONSTANT_VALUE: return CONSTANT;
			case AT_VALUE: return AT;
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
	private VariableDeclaration(int value, String name, String literal) {
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
	
} //VariableDeclaration
