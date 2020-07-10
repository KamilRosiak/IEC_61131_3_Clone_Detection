/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Statement Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getStatementType()
 * @model
 * @generated
 */
public enum StatementType implements Enumerator {
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
	 * The '<em><b>ASSIGNMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNMENT(1, "ASSIGNMENT", "ASSIGNMENT"),

	/**
	 * The '<em><b>IF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IF_VALUE
	 * @generated
	 * @ordered
	 */
	IF(2, "IF", "IF"),

	/**
	 * The '<em><b>CASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASE_VALUE
	 * @generated
	 * @ordered
	 */
	CASE(3, "CASE", "CASE"),

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
	 * The '<em><b>POU CALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POU_CALL_VALUE
	 * @generated
	 * @ordered
	 */
	POU_CALL(5, "POU_CALL", "POU_CALL"),

	/**
	 * The '<em><b>WHILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHILE_VALUE
	 * @generated
	 * @ordered
	 */
	WHILE(6, "WHILE", "WHILE"),

	/**
	 * The '<em><b>REPEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEAT_VALUE
	 * @generated
	 * @ordered
	 */
	REPEAT(7, "REPEAT", "REPEAT"),

	/**
	 * The '<em><b>FOR LOOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOR_LOOP_VALUE
	 * @generated
	 * @ordered
	 */
	FOR_LOOP(8, "FOR_LOOP", "FOR_LOOP"),

	/**
	 * The '<em><b>CONDITIONAL BLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDITIONAL_BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITIONAL_BLOCK(9, "CONDITIONAL_BLOCK", "CONDITIONAL_BLOCK"),

	/**
	 * The '<em><b>CASE BLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASE_BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	CASE_BLOCK(10, "CASE_BLOCK", "CASE_BLOCK"),

	/**
	 * The '<em><b>EXIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT_VALUE
	 * @generated
	 * @ordered
	 */
	EXIT(11, "EXIT", "EXIT"),

	/**
	 * The '<em><b>RETURN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN_VALUE
	 * @generated
	 * @ordered
	 */
	RETURN(12, "RETURN", "RETURN");

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
	 * The '<em><b>ASSIGNMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT_VALUE = 1;

	/**
	 * The '<em><b>IF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IF_VALUE = 2;

	/**
	 * The '<em><b>CASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASE_VALUE = 3;

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
	 * The '<em><b>POU CALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POU_CALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POU_CALL_VALUE = 5;

	/**
	 * The '<em><b>WHILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHILE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHILE_VALUE = 6;

	/**
	 * The '<em><b>REPEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPEAT_VALUE = 7;

	/**
	 * The '<em><b>FOR LOOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOR_LOOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOR_LOOP_VALUE = 8;

	/**
	 * The '<em><b>CONDITIONAL BLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDITIONAL_BLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONDITIONAL_BLOCK_VALUE = 9;

	/**
	 * The '<em><b>CASE BLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASE_BLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASE_BLOCK_VALUE = 10;

	/**
	 * The '<em><b>EXIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXIT_VALUE = 11;

	/**
	 * The '<em><b>RETURN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RETURN_VALUE = 12;

	/**
	 * An array of all the '<em><b>Statement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StatementType[] VALUES_ARRAY =
		new StatementType[] {
			UNDEFINED,
			ASSIGNMENT,
			IF,
			CASE,
			FUNCTION_CALL,
			POU_CALL,
			WHILE,
			REPEAT,
			FOR_LOOP,
			CONDITIONAL_BLOCK,
			CASE_BLOCK,
			EXIT,
			RETURN,
		};

	/**
	 * A public read-only list of all the '<em><b>Statement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StatementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Statement Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Statement Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Statement Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatementType get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case ASSIGNMENT_VALUE: return ASSIGNMENT;
			case IF_VALUE: return IF;
			case CASE_VALUE: return CASE;
			case FUNCTION_CALL_VALUE: return FUNCTION_CALL;
			case POU_CALL_VALUE: return POU_CALL;
			case WHILE_VALUE: return WHILE;
			case REPEAT_VALUE: return REPEAT;
			case FOR_LOOP_VALUE: return FOR_LOOP;
			case CONDITIONAL_BLOCK_VALUE: return CONDITIONAL_BLOCK;
			case CASE_BLOCK_VALUE: return CASE_BLOCK;
			case EXIT_VALUE: return EXIT;
			case RETURN_VALUE: return RETURN;
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
	private StatementType(int value, String name, String literal) {
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
	
} //StatementType
