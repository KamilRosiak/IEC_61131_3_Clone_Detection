/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>LL Element Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage#getLLElementType()
 * @model
 * @generated
 */
public enum LLElementType implements Enumerator {
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
	 * The '<em><b>LEFT POWERRAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_POWERRAIL_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_POWERRAIL(1, "LEFT_POWERRAIL", "LEFT_POWERRAIL"),

	/**
	 * The '<em><b>CONTACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTACT(2, "CONTACT", "CONTACT"),

	/**
	 * The '<em><b>COIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COIL_VALUE
	 * @generated
	 * @ordered
	 */
	COIL(3, "COIL", "COIL"),

	/**
	 * The '<em><b>RIGHT POWERRAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_POWERRAIL_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_POWERRAIL(5, "RIGHT_POWERRAIL", "RIGHT_POWERRAIL"),

	/**
	 * The '<em><b>JUMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUMP_VALUE
	 * @generated
	 * @ordered
	 */
	JUMP(5, "JUMP", "JUMP"),

	/**
	 * The '<em><b>ABSTRACT POU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_POU_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTRACT_POU(6, "ABSTRACT_POU", "ABSTRACT_POU"),

	/**
	 * The '<em><b>RETURN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN_VALUE
	 * @generated
	 * @ordered
	 */
	RETURN(7, "RETURN", "RETURN"),

	/**
	 * The '<em><b>STANDARD ELEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_ELEMENT(8, "STANDARD_ELEMENT", "STANDARD_ELEMENT");

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
	 * The '<em><b>LEFT POWERRAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_POWERRAIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_POWERRAIL_VALUE = 1;

	/**
	 * The '<em><b>CONTACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTACT_VALUE = 2;

	/**
	 * The '<em><b>COIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COIL_VALUE = 3;

	/**
	 * The '<em><b>RIGHT POWERRAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_POWERRAIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_POWERRAIL_VALUE = 5;

	/**
	 * The '<em><b>JUMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JUMP_VALUE = 5;

	/**
	 * The '<em><b>ABSTRACT POU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_POU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_POU_VALUE = 6;

	/**
	 * The '<em><b>RETURN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RETURN_VALUE = 7;

	/**
	 * The '<em><b>STANDARD ELEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_ELEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_ELEMENT_VALUE = 8;

	/**
	 * An array of all the '<em><b>LL Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LLElementType[] VALUES_ARRAY =
		new LLElementType[] {
			UNDEFINED,
			LEFT_POWERRAIL,
			CONTACT,
			COIL,
			RIGHT_POWERRAIL,
			JUMP,
			ABSTRACT_POU,
			RETURN,
			STANDARD_ELEMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>LL Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LLElementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>LL Element Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LLElementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LLElementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>LL Element Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LLElementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LLElementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>LL Element Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LLElementType get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case LEFT_POWERRAIL_VALUE: return LEFT_POWERRAIL;
			case CONTACT_VALUE: return CONTACT;
			case COIL_VALUE: return COIL;
			case RIGHT_POWERRAIL_VALUE: return RIGHT_POWERRAIL;
			case ABSTRACT_POU_VALUE: return ABSTRACT_POU;
			case RETURN_VALUE: return RETURN;
			case STANDARD_ELEMENT_VALUE: return STANDARD_ELEMENT;
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
	private LLElementType(int value, String name, String literal) {
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
	
} //LLElementType
