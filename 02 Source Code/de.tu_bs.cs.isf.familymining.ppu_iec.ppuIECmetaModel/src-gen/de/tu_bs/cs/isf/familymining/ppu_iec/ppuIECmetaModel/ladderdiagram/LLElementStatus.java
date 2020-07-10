/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>LL Element Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage#getLLElementStatus()
 * @model
 * @generated
 */
public enum LLElementStatus implements Enumerator {
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
	 * The '<em><b>NORMAL OPEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL_OPEN(1, "NORMAL_OPEN", "NORMAL_OPEN"),

	/**
	 * The '<em><b>NORMAL CLOSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_CLOSE_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL_CLOSE(2, "NORMAL_CLOSE", "NORMAL_CLOSE"),

	/**
	 * The '<em><b>POSITIVE TRANSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_TRANSITION_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE_TRANSITION(3, "POSITIVE_TRANSITION", "POSITIVE_TRANSITION"),

	/**
	 * The '<em><b>NEGATIVE TRANSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_TRANSITION_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATIVE_TRANSITION(4, "NEGATIVE_TRANSITION", "NEGATIVE_TRANSITION"),

	/**
	 * The '<em><b>SET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_VALUE
	 * @generated
	 * @ordered
	 */
	SET(5, "SET", "SET"),

	/**
	 * The '<em><b>RESET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_VALUE
	 * @generated
	 * @ordered
	 */
	RESET(6, "RESET", "RESET"),

	/**
	 * The '<em><b>NEGATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATED_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATED(7, "NEGATED", "NEGATED"),

	/**
	 * The '<em><b>POSITIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE(8, "POSITIVE", "POSITIVE");

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
	 * The '<em><b>NORMAL OPEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_OPEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_OPEN_VALUE = 1;

	/**
	 * The '<em><b>NORMAL CLOSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_CLOSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_CLOSE_VALUE = 2;

	/**
	 * The '<em><b>POSITIVE TRANSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_TRANSITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVE_TRANSITION_VALUE = 3;

	/**
	 * The '<em><b>NEGATIVE TRANSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_TRANSITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEGATIVE_TRANSITION_VALUE = 4;

	/**
	 * The '<em><b>SET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_VALUE = 5;

	/**
	 * The '<em><b>RESET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESET_VALUE = 6;

	/**
	 * The '<em><b>NEGATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEGATED_VALUE = 7;

	/**
	 * The '<em><b>POSITIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVE_VALUE = 8;

	/**
	 * An array of all the '<em><b>LL Element Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LLElementStatus[] VALUES_ARRAY =
		new LLElementStatus[] {
			UNDEFINED,
			NORMAL_OPEN,
			NORMAL_CLOSE,
			POSITIVE_TRANSITION,
			NEGATIVE_TRANSITION,
			SET,
			RESET,
			NEGATED,
			POSITIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>LL Element Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LLElementStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>LL Element Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LLElementStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LLElementStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>LL Element Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LLElementStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LLElementStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>LL Element Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LLElementStatus get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case NORMAL_OPEN_VALUE: return NORMAL_OPEN;
			case NORMAL_CLOSE_VALUE: return NORMAL_CLOSE;
			case POSITIVE_TRANSITION_VALUE: return POSITIVE_TRANSITION;
			case NEGATIVE_TRANSITION_VALUE: return NEGATIVE_TRANSITION;
			case SET_VALUE: return SET;
			case RESET_VALUE: return RESET;
			case NEGATED_VALUE: return NEGATED;
			case POSITIVE_VALUE: return POSITIVE;
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
	private LLElementStatus(int value, String name, String literal) {
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
	
} //LLElementStatus
