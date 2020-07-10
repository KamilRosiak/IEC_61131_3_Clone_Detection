/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Standard Function Block Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage#getStandardFunctionBlockOperation()
 * @model
 * @generated
 */
public enum StandardFunctionBlockOperation implements Enumerator {
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
	 * The '<em><b>SR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SR_VALUE
	 * @generated
	 * @ordered
	 */
	SR(1, "SR", "SR"),

	/**
	 * The '<em><b>RS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RS_VALUE
	 * @generated
	 * @ordered
	 */
	RS(2, "RS", "RS"),

	/**
	 * The '<em><b>RTRIG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTRIG_VALUE
	 * @generated
	 * @ordered
	 */
	RTRIG(3, "R_TRIG", "R_TRIG"),

	/**
	 * The '<em><b>FTRIG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FTRIG_VALUE
	 * @generated
	 * @ordered
	 */
	FTRIG(4, "F_TRIG", "F_TRIG"),

	/**
	 * The '<em><b>CTU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTU_VALUE
	 * @generated
	 * @ordered
	 */
	CTU(5, "CTU", "CTU"),

	/**
	 * The '<em><b>CTD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTD_VALUE
	 * @generated
	 * @ordered
	 */
	CTD(6, "CTD", "CTD"),

	/**
	 * The '<em><b>CTUD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTUD_VALUE
	 * @generated
	 * @ordered
	 */
	CTUD(7, "CTUD", "CTUD"),

	/**
	 * The '<em><b>TP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TP_VALUE
	 * @generated
	 * @ordered
	 */
	TP(8, "TP", "TP"),

	/**
	 * The '<em><b>TON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TON_VALUE
	 * @generated
	 * @ordered
	 */
	TON(9, "TON", "TON"),

	/**
	 * The '<em><b>TOF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOF_VALUE
	 * @generated
	 * @ordered
	 */
	TOF(10, "TOF", "TOF");

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
	 * The '<em><b>SR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SR_VALUE = 1;

	/**
	 * The '<em><b>RS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RS_VALUE = 2;

	/**
	 * The '<em><b>RTRIG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTRIG
	 * @model name="R_TRIG"
	 * @generated
	 * @ordered
	 */
	public static final int RTRIG_VALUE = 3;

	/**
	 * The '<em><b>FTRIG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FTRIG
	 * @model name="F_TRIG"
	 * @generated
	 * @ordered
	 */
	public static final int FTRIG_VALUE = 4;

	/**
	 * The '<em><b>CTU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CTU_VALUE = 5;

	/**
	 * The '<em><b>CTD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CTD_VALUE = 6;

	/**
	 * The '<em><b>CTUD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTUD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CTUD_VALUE = 7;

	/**
	 * The '<em><b>TP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TP_VALUE = 8;

	/**
	 * The '<em><b>TON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TON_VALUE = 9;

	/**
	 * The '<em><b>TOF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOF_VALUE = 10;

	/**
	 * An array of all the '<em><b>Standard Function Block Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StandardFunctionBlockOperation[] VALUES_ARRAY =
		new StandardFunctionBlockOperation[] {
			UNSET,
			SR,
			RS,
			RTRIG,
			FTRIG,
			CTU,
			CTD,
			CTUD,
			TP,
			TON,
			TOF,
		};

	/**
	 * A public read-only list of all the '<em><b>Standard Function Block Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StandardFunctionBlockOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Standard Function Block Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StandardFunctionBlockOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StandardFunctionBlockOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Standard Function Block Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StandardFunctionBlockOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StandardFunctionBlockOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Standard Function Block Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StandardFunctionBlockOperation get(int value) {
		switch (value) {
			case UNSET_VALUE: return UNSET;
			case SR_VALUE: return SR;
			case RS_VALUE: return RS;
			case RTRIG_VALUE: return RTRIG;
			case FTRIG_VALUE: return FTRIG;
			case CTU_VALUE: return CTU;
			case CTD_VALUE: return CTD;
			case CTUD_VALUE: return CTUD;
			case TP_VALUE: return TP;
			case TON_VALUE: return TON;
			case TOF_VALUE: return TOF;
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
	private StandardFunctionBlockOperation(int value, String name, String literal) {
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
	
} //StandardFunctionBlockOperation
