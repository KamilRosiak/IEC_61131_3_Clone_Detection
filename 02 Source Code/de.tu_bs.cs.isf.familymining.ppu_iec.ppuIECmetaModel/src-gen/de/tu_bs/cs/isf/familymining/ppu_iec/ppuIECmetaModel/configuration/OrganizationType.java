/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Organization Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getOrganizationType()
 * @model
 * @generated
 */
public enum OrganizationType implements Enumerator {
	/**
	 * The '<em><b>PROGRAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	PROGRAM(0, "PROGRAM", "PROGRAM"),

	/**
	 * The '<em><b>FUNCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION(1, "FUNCTION", "FUNCTION"),

	/**
	 * The '<em><b>FUNCTIONBLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONBLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTIONBLOCK(2, "FUNCTIONBLOCK", "FUNCTIONBLOCK");

	/**
	 * The '<em><b>PROGRAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROGRAM_VALUE = 0;

	/**
	 * The '<em><b>FUNCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_VALUE = 1;

	/**
	 * The '<em><b>FUNCTIONBLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONBLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTIONBLOCK_VALUE = 2;

	/**
	 * An array of all the '<em><b>Organization Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrganizationType[] VALUES_ARRAY =
		new OrganizationType[] {
			PROGRAM,
			FUNCTION,
			FUNCTIONBLOCK,
		};

	/**
	 * A public read-only list of all the '<em><b>Organization Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrganizationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Organization Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrganizationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrganizationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Organization Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrganizationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrganizationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Organization Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrganizationType get(int value) {
		switch (value) {
			case PROGRAM_VALUE: return PROGRAM;
			case FUNCTION_VALUE: return FUNCTION;
			case FUNCTIONBLOCK_VALUE: return FUNCTIONBLOCK;
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
	private OrganizationType(int value, String name, String literal) {
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
	
} //OrganizationType
