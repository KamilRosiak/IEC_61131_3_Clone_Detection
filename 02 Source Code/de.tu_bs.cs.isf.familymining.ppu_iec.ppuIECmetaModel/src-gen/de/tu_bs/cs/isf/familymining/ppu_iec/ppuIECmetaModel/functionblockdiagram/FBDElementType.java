/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FBD Element Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage#getFBDElementType()
 * @model
 * @generated
 */
public enum FBDElementType implements Enumerator {
	/**
	 * The '<em><b>UNDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "UNDEFINED", "UNDEFINED"),

	/**
	 * The '<em><b>FBD POU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FBD_POU_VALUE
	 * @generated
	 * @ordered
	 */
	FBD_POU(1, "FBD_POU", "FBD_POU"),

	/**
	 * The '<em><b>STANDARD FUNCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_FUNCTION(2, "STANDARD_FUNCTION", "STANDARD_FUNCTION"),

	/**
	 * The '<em><b>STANDARD FUNCTION BLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_FUNCTION_BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_FUNCTION_BLOCK(3, "STANDARD_FUNCTION_BLOCK", "STANDARD_FUNCTION_BLOCK"),

	/**
	 * The '<em><b>EXECUTION BLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTION_BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTION_BLOCK(4, "EXECUTION_BLOCK", "EXECUTION_BLOCK");

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>FBD POU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FBD_POU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FBD_POU_VALUE = 1;

	/**
	 * The '<em><b>STANDARD FUNCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_FUNCTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_FUNCTION_VALUE = 2;

	/**
	 * The '<em><b>STANDARD FUNCTION BLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_FUNCTION_BLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_FUNCTION_BLOCK_VALUE = 3;

	/**
	 * The '<em><b>EXECUTION BLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTION_BLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTION_BLOCK_VALUE = 4;

	/**
	 * An array of all the '<em><b>FBD Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FBDElementType[] VALUES_ARRAY =
		new FBDElementType[] {
			UNDEFINED,
			FBD_POU,
			STANDARD_FUNCTION,
			STANDARD_FUNCTION_BLOCK,
			EXECUTION_BLOCK,
		};

	/**
	 * A public read-only list of all the '<em><b>FBD Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FBDElementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FBD Element Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FBDElementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FBDElementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FBD Element Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FBDElementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FBDElementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FBD Element Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FBDElementType get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case FBD_POU_VALUE: return FBD_POU;
			case STANDARD_FUNCTION_VALUE: return STANDARD_FUNCTION;
			case STANDARD_FUNCTION_BLOCK_VALUE: return STANDARD_FUNCTION_BLOCK;
			case EXECUTION_BLOCK_VALUE: return EXECUTION_BLOCK;
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
	private FBDElementType(int value, String name, String literal) {
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
	
} //FBDElementType
