/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Expression Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.StructuredTextExpressionPackage#getExpressionType()
 * @model
 * @generated
 */
public enum ExpressionType implements Enumerator {
	/**
	 * The '<em><b>BINARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY(0, "BINARY", "BINARY"),

	/**
	 * The '<em><b>UNARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNARY_VALUE
	 * @generated
	 * @ordered
	 */
	UNARY(1, "UNARY", "UNARY"),

	/**
	 * The '<em><b>LITERAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	LITERAL(2, "LITERAL", "LITERAL"),

	/**
	 * The '<em><b>VARIABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIABLE(3, "VARIABLE", "VARIABLE"),

	/**
	 * The '<em><b>FUNCTION CALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_CALL_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_CALL(4, "FUNCTION_CALL", "FUNCTION_CALL"),

	/**
	 * The '<em><b>SUBRANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBRANGE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBRANGE(5, "SUBRANGE", "SUBRANGE");

	/**
	 * The '<em><b>BINARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_VALUE = 0;

	/**
	 * The '<em><b>UNARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNARY_VALUE = 1;

	/**
	 * The '<em><b>LITERAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LITERAL_VALUE = 2;

	/**
	 * The '<em><b>VARIABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_VALUE = 3;

	/**
	 * The '<em><b>FUNCTION CALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_CALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_CALL_VALUE = 4;

	/**
	 * The '<em><b>SUBRANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBRANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBRANGE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Expression Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExpressionType[] VALUES_ARRAY =
		new ExpressionType[] {
			BINARY,
			UNARY,
			LITERAL,
			VARIABLE,
			FUNCTION_CALL,
			SUBRANGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Expression Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExpressionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Expression Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpressionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpressionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionType get(int value) {
		switch (value) {
			case BINARY_VALUE: return BINARY;
			case UNARY_VALUE: return UNARY;
			case LITERAL_VALUE: return LITERAL;
			case VARIABLE_VALUE: return VARIABLE;
			case FUNCTION_CALL_VALUE: return FUNCTION_CALL;
			case SUBRANGE_VALUE: return SUBRANGE;
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
	private ExpressionType(int value, String name, String literal) {
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
	
} //ExpressionType
