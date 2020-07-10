/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comparison Target</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#getComparisonTarget()
 * @model
 * @generated
 */
public enum ComparisonTarget implements Enumerator {
	/**
	 * The '<em><b>Variant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANT_VALUE
	 * @generated
	 * @ordered
	 */
	VARIANT(0, "Variant", "Variant"),

	/**
	 * The '<em><b>POU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POU_VALUE
	 * @generated
	 * @ordered
	 */
	POU(1, "POU", "POU"),

	/**
	 * The '<em><b>Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION(2, "Action", "Action"),

	/**
	 * The '<em><b>Variable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	VARIABLE(3, "Variable", "Variable"),

	/**
	 * The '<em><b>Structured Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURED_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURED_TEXT(4, "StructuredText", "StructuredText"),

	/**
	 * The '<em><b>Sequential Function Chart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL_FUNCTION_CHART_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENTIAL_FUNCTION_CHART(5, "SequentialFunctionChart", "SequentialFunctionChart"),

	/**
	 * The '<em><b>Ladder Diagram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LADDER_DIAGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	LADDER_DIAGRAM(6, "LadderDiagram", "LadderDiagram"),

	/**
	 * The '<em><b>Instruction List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTRUCTION_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	INSTRUCTION_LIST(7, "InstructionList", "InstructionList"),

	/**
	 * The '<em><b>Function Block Diagram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_BLOCK_DIAGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_BLOCK_DIAGRAM(8, "FunctionBlockDiagram", "FunctionBlockDiagram");

	/**
	 * The '<em><b>Variant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIANT
	 * @model name="Variant"
	 * @generated
	 * @ordered
	 */
	public static final int VARIANT_VALUE = 0;

	/**
	 * The '<em><b>POU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POU_VALUE = 1;

	/**
	 * The '<em><b>Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION
	 * @model name="Action"
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_VALUE = 2;

	/**
	 * The '<em><b>Variable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIABLE
	 * @model name="Variable"
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_VALUE = 3;

	/**
	 * The '<em><b>Structured Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURED_TEXT
	 * @model name="StructuredText"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURED_TEXT_VALUE = 4;

	/**
	 * The '<em><b>Sequential Function Chart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL_FUNCTION_CHART
	 * @model name="SequentialFunctionChart"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENTIAL_FUNCTION_CHART_VALUE = 5;

	/**
	 * The '<em><b>Ladder Diagram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LADDER_DIAGRAM
	 * @model name="LadderDiagram"
	 * @generated
	 * @ordered
	 */
	public static final int LADDER_DIAGRAM_VALUE = 6;

	/**
	 * The '<em><b>Instruction List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTRUCTION_LIST
	 * @model name="InstructionList"
	 * @generated
	 * @ordered
	 */
	public static final int INSTRUCTION_LIST_VALUE = 7;

	/**
	 * The '<em><b>Function Block Diagram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_BLOCK_DIAGRAM
	 * @model name="FunctionBlockDiagram"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_BLOCK_DIAGRAM_VALUE = 8;

	/**
	 * An array of all the '<em><b>Comparison Target</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComparisonTarget[] VALUES_ARRAY =
		new ComparisonTarget[] {
			VARIANT,
			POU,
			ACTION,
			VARIABLE,
			STRUCTURED_TEXT,
			SEQUENTIAL_FUNCTION_CHART,
			LADDER_DIAGRAM,
			INSTRUCTION_LIST,
			FUNCTION_BLOCK_DIAGRAM,
		};

	/**
	 * A public read-only list of all the '<em><b>Comparison Target</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComparisonTarget> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comparison Target</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparisonTarget get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparisonTarget result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparison Target</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparisonTarget getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparisonTarget result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparison Target</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparisonTarget get(int value) {
		switch (value) {
			case VARIANT_VALUE: return VARIANT;
			case POU_VALUE: return POU;
			case ACTION_VALUE: return ACTION;
			case VARIABLE_VALUE: return VARIABLE;
			case STRUCTURED_TEXT_VALUE: return STRUCTURED_TEXT;
			case SEQUENTIAL_FUNCTION_CHART_VALUE: return SEQUENTIAL_FUNCTION_CHART;
			case LADDER_DIAGRAM_VALUE: return LADDER_DIAGRAM;
			case INSTRUCTION_LIST_VALUE: return INSTRUCTION_LIST;
			case FUNCTION_BLOCK_DIAGRAM_VALUE: return FUNCTION_BLOCK_DIAGRAM;
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
	private ComparisonTarget(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //ComparisonTarget
