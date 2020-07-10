/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.StructuredTextExpressionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextFactory
 * @model kind="package"
 * @generated
 */
public interface StructuredTextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structuredtext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ppuIECScenario/ST";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ST";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuredTextPackage eINSTANCE = de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextImpl <em>Structured Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getStructuredText()
	 * @generated
	 */
	int STRUCTURED_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TEXT__PARENT_ELEMENT = LanguageElementPackage.LANGUAGE_ELEMENT__PARENT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TEXT__CHILD_ELEMENTS = LanguageElementPackage.LANGUAGE_ELEMENT__CHILD_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TEXT__LABEL = LanguageElementPackage.LANGUAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TEXT__COMMENTS = LanguageElementPackage.LANGUAGE_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TEXT__ID = LanguageElementPackage.LANGUAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TEXT__STATEMENTS = LanguageElementPackage.LANGUAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TEXT__TEXT = LanguageElementPackage.LANGUAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Structured Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TEXT_FEATURE_COUNT = LanguageElementPackage.LANGUAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Structured Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TEXT_OPERATION_COUNT = LanguageElementPackage.LANGUAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StatementImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ID = StructuredTextExpressionPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Statement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__STATEMENT_TYPE = StructuredTextExpressionPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abs Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ABS_START_LINE = StructuredTextExpressionPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abs End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ABS_END_LINE = StructuredTextExpressionPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rel Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__REL_START_LINE = StructuredTextExpressionPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rel End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__REL_END_LINE = StructuredTextExpressionPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__START_COLUMN_POS = StructuredTextExpressionPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__END_COLUMN_POS = StructuredTextExpressionPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Structured Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__STRUCTURED_TEXT = StructuredTextExpressionPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = StructuredTextExpressionPackage.IDENTIFIER_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT___GET_TEXT = StructuredTextExpressionPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = StructuredTextExpressionPackage.IDENTIFIER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AbstractPOUCallImpl <em>Abstract POU Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AbstractPOUCallImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getAbstractPOUCall()
	 * @generated
	 */
	int ABSTRACT_POU_CALL = 2;

	/**
	 * The feature id for the '<em><b>Control Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__CONTROL_TASKS = ConfigurationPackage.POU__CONTROL_TASKS;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__DECLARATION = ConfigurationPackage.POU__DECLARATION;

	/**
	 * The feature id for the '<em><b>Callees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__CALLEES = ConfigurationPackage.POU__CALLEES;

	/**
	 * The feature id for the '<em><b>Callers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__CALLERS = ConfigurationPackage.POU__CALLERS;

	/**
	 * The feature id for the '<em><b>Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__IMPLEMENTATIONS = ConfigurationPackage.POU__IMPLEMENTATIONS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__IDENTIFIER = ConfigurationPackage.POU__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__RETURN_TYPE = ConfigurationPackage.POU__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__TYPE = ConfigurationPackage.POU__TYPE;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__ACTIONS = ConfigurationPackage.POU__ACTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__ID = ConfigurationPackage.POU_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__STATEMENT_TYPE = ConfigurationPackage.POU_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abs Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__ABS_START_LINE = ConfigurationPackage.POU_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abs End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__ABS_END_LINE = ConfigurationPackage.POU_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rel Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__REL_START_LINE = ConfigurationPackage.POU_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rel End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__REL_END_LINE = ConfigurationPackage.POU_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Start Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__START_COLUMN_POS = ConfigurationPackage.POU_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>End Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__END_COLUMN_POS = ConfigurationPackage.POU_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Structured Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL__STRUCTURED_TEXT = ConfigurationPackage.POU_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Abstract POU Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL_FEATURE_COUNT = ConfigurationPackage.POU_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL___GET_TEXT = ConfigurationPackage.POU_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract POU Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_POU_CALL_OPERATION_COUNT = ConfigurationPackage.POU_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AssignmentImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Statement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__STATEMENT_TYPE = STATEMENT__STATEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Abs Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ABS_START_LINE = STATEMENT__ABS_START_LINE;

	/**
	 * The feature id for the '<em><b>Abs End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ABS_END_LINE = STATEMENT__ABS_END_LINE;

	/**
	 * The feature id for the '<em><b>Rel Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__REL_START_LINE = STATEMENT__REL_START_LINE;

	/**
	 * The feature id for the '<em><b>Rel End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__REL_END_LINE = STATEMENT__REL_END_LINE;

	/**
	 * The feature id for the '<em><b>Start Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__START_COLUMN_POS = STATEMENT__START_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>End Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__END_COLUMN_POS = STATEMENT__END_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>Structured Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__STRUCTURED_TEXT = STATEMENT__STRUCTURED_TEXT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__LEFT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__RIGHT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT___GET_TEXT = STATEMENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.IfImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getIf()
	 * @generated
	 */
	int IF = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Statement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__STATEMENT_TYPE = STATEMENT__STATEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Abs Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ABS_START_LINE = STATEMENT__ABS_START_LINE;

	/**
	 * The feature id for the '<em><b>Abs End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ABS_END_LINE = STATEMENT__ABS_END_LINE;

	/**
	 * The feature id for the '<em><b>Rel Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__REL_START_LINE = STATEMENT__REL_START_LINE;

	/**
	 * The feature id for the '<em><b>Rel End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__REL_END_LINE = STATEMENT__REL_END_LINE;

	/**
	 * The feature id for the '<em><b>Start Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__START_COLUMN_POS = STATEMENT__START_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>End Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__END_COLUMN_POS = STATEMENT__END_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>Structured Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__STRUCTURED_TEXT = STATEMENT__STRUCTURED_TEXT;

	/**
	 * The feature id for the '<em><b>Conditional Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITIONAL_BLOCKS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF___GET_TEXT = STATEMENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ConditionalBlockImpl <em>Conditional Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ConditionalBlockImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getConditionalBlock()
	 * @generated
	 */
	int CONDITIONAL_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Statement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK__STATEMENT_TYPE = STATEMENT__STATEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Abs Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK__ABS_START_LINE = STATEMENT__ABS_START_LINE;

	/**
	 * The feature id for the '<em><b>Abs End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK__ABS_END_LINE = STATEMENT__ABS_END_LINE;

	/**
	 * The feature id for the '<em><b>Rel Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK__REL_START_LINE = STATEMENT__REL_START_LINE;

	/**
	 * The feature id for the '<em><b>Rel End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK__REL_END_LINE = STATEMENT__REL_END_LINE;

	/**
	 * The feature id for the '<em><b>Start Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK__START_COLUMN_POS = STATEMENT__START_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>End Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK__END_COLUMN_POS = STATEMENT__END_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>Structured Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK__STRUCTURED_TEXT = STATEMENT__STRUCTURED_TEXT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Substatements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK__SUBSTATEMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK__ELSE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK___GET_TEXT = STATEMENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>Conditional Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BLOCK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.CaseImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Statement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__STATEMENT_TYPE = STATEMENT__STATEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Abs Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ABS_START_LINE = STATEMENT__ABS_START_LINE;

	/**
	 * The feature id for the '<em><b>Abs End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ABS_END_LINE = STATEMENT__ABS_END_LINE;

	/**
	 * The feature id for the '<em><b>Rel Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__REL_START_LINE = STATEMENT__REL_START_LINE;

	/**
	 * The feature id for the '<em><b>Rel End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__REL_END_LINE = STATEMENT__REL_END_LINE;

	/**
	 * The feature id for the '<em><b>Start Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__START_COLUMN_POS = STATEMENT__START_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>End Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__END_COLUMN_POS = STATEMENT__END_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>Structured Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__STRUCTURED_TEXT = STATEMENT__STRUCTURED_TEXT;

	/**
	 * The feature id for the '<em><b>Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__SWITCH = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CASES = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ELSE_STATEMENTS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE___GET_TEXT = STATEMENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.CaseBlockImpl <em>Case Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.CaseBlockImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getCaseBlock()
	 * @generated
	 */
	int CASE_BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Statement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__STATEMENT_TYPE = STATEMENT__STATEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Abs Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__ABS_START_LINE = STATEMENT__ABS_START_LINE;

	/**
	 * The feature id for the '<em><b>Abs End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__ABS_END_LINE = STATEMENT__ABS_END_LINE;

	/**
	 * The feature id for the '<em><b>Rel Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__REL_START_LINE = STATEMENT__REL_START_LINE;

	/**
	 * The feature id for the '<em><b>Rel End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__REL_END_LINE = STATEMENT__REL_END_LINE;

	/**
	 * The feature id for the '<em><b>Start Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__START_COLUMN_POS = STATEMENT__START_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>End Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__END_COLUMN_POS = STATEMENT__END_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>Structured Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__STRUCTURED_TEXT = STATEMENT__STRUCTURED_TEXT;

	/**
	 * The feature id for the '<em><b>Case Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__CASE_EXPRESSIONS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Substatements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__SUBSTATEMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK___GET_TEXT = STATEMENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>Case Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.FunctionCallStatementImpl <em>Function Call Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.FunctionCallStatementImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getFunctionCallStatement()
	 * @generated
	 */
	int FUNCTION_CALL_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Statement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__STATEMENT_TYPE = STATEMENT__STATEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Abs Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__ABS_START_LINE = STATEMENT__ABS_START_LINE;

	/**
	 * The feature id for the '<em><b>Abs End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__ABS_END_LINE = STATEMENT__ABS_END_LINE;

	/**
	 * The feature id for the '<em><b>Rel Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__REL_START_LINE = STATEMENT__REL_START_LINE;

	/**
	 * The feature id for the '<em><b>Rel End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__REL_END_LINE = STATEMENT__REL_END_LINE;

	/**
	 * The feature id for the '<em><b>Start Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__START_COLUMN_POS = STATEMENT__START_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>End Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__END_COLUMN_POS = STATEMENT__END_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>Structured Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__STRUCTURED_TEXT = STATEMENT__STRUCTURED_TEXT;

	/**
	 * The feature id for the '<em><b>Invoking Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__INVOKING_VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__FUNCTION_CALL = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT___GET_TEXT = STATEMENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>Function Call Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.UnboundedLoopImpl <em>Unbounded Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.UnboundedLoopImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getUnboundedLoop()
	 * @generated
	 */
	int UNBOUNDED_LOOP = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_LOOP__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Statement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_LOOP__STATEMENT_TYPE = STATEMENT__STATEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Abs Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_LOOP__ABS_START_LINE = STATEMENT__ABS_START_LINE;

	/**
	 * The feature id for the '<em><b>Abs End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_LOOP__ABS_END_LINE = STATEMENT__ABS_END_LINE;

	/**
	 * The feature id for the '<em><b>Rel Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_LOOP__REL_START_LINE = STATEMENT__REL_START_LINE;

	/**
	 * The feature id for the '<em><b>Rel End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_LOOP__REL_END_LINE = STATEMENT__REL_END_LINE;

	/**
	 * The feature id for the '<em><b>Start Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_LOOP__START_COLUMN_POS = STATEMENT__START_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>End Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_LOOP__END_COLUMN_POS = STATEMENT__END_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>Structured Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_LOOP__STRUCTURED_TEXT = STATEMENT__STRUCTURED_TEXT;

	/**
	 * The feature id for the '<em><b>Substatements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_LOOP__SUBSTATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_LOOP__CONDITION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unbounded Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_LOOP___GET_TEXT = STATEMENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>Unbounded Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUNDED_LOOP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ForLoopImpl <em>For Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ForLoopImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getForLoop()
	 * @generated
	 */
	int FOR_LOOP = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Statement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__STATEMENT_TYPE = STATEMENT__STATEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Abs Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__ABS_START_LINE = STATEMENT__ABS_START_LINE;

	/**
	 * The feature id for the '<em><b>Abs End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__ABS_END_LINE = STATEMENT__ABS_END_LINE;

	/**
	 * The feature id for the '<em><b>Rel Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__REL_START_LINE = STATEMENT__REL_START_LINE;

	/**
	 * The feature id for the '<em><b>Rel End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__REL_END_LINE = STATEMENT__REL_END_LINE;

	/**
	 * The feature id for the '<em><b>Start Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__START_COLUMN_POS = STATEMENT__START_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>End Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__END_COLUMN_POS = STATEMENT__END_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>Structured Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__STRUCTURED_TEXT = STATEMENT__STRUCTURED_TEXT;

	/**
	 * The feature id for the '<em><b>Substatements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__SUBSTATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__INITIAL_VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__UPPER_BOUND = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__INCREMENT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__COUNTER = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>For Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP___GET_TEXT = STATEMENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>For Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ExitStatementImpl <em>Exit Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ExitStatementImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getExitStatement()
	 * @generated
	 */
	int EXIT_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Statement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT__STATEMENT_TYPE = STATEMENT__STATEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Abs Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT__ABS_START_LINE = STATEMENT__ABS_START_LINE;

	/**
	 * The feature id for the '<em><b>Abs End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT__ABS_END_LINE = STATEMENT__ABS_END_LINE;

	/**
	 * The feature id for the '<em><b>Rel Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT__REL_START_LINE = STATEMENT__REL_START_LINE;

	/**
	 * The feature id for the '<em><b>Rel End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT__REL_END_LINE = STATEMENT__REL_END_LINE;

	/**
	 * The feature id for the '<em><b>Start Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT__START_COLUMN_POS = STATEMENT__START_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>End Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT__END_COLUMN_POS = STATEMENT__END_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>Structured Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT__STRUCTURED_TEXT = STATEMENT__STRUCTURED_TEXT;

	/**
	 * The number of structural features of the '<em>Exit Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT___GET_TEXT = STATEMENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>Exit Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ReturnStatementImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__ID = STATEMENT__ID;

	/**
	 * The feature id for the '<em><b>Statement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__STATEMENT_TYPE = STATEMENT__STATEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Abs Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__ABS_START_LINE = STATEMENT__ABS_START_LINE;

	/**
	 * The feature id for the '<em><b>Abs End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__ABS_END_LINE = STATEMENT__ABS_END_LINE;

	/**
	 * The feature id for the '<em><b>Rel Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__REL_START_LINE = STATEMENT__REL_START_LINE;

	/**
	 * The feature id for the '<em><b>Rel End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__REL_END_LINE = STATEMENT__REL_END_LINE;

	/**
	 * The feature id for the '<em><b>Start Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__START_COLUMN_POS = STATEMENT__START_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>End Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__END_COLUMN_POS = STATEMENT__END_COLUMN_POS;

	/**
	 * The feature id for the '<em><b>Structured Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__STRUCTURED_TEXT = STATEMENT__STRUCTURED_TEXT;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT___GET_TEXT = STATEMENT___GET_TEXT;

	/**
	 * The number of operations of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StatementType <em>Statement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StatementType
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getStatementType()
	 * @generated
	 */
	int STATEMENT_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText <em>Structured Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Text</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText
	 * @generated
	 */
	EClass getStructuredText();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText#getStatements()
	 * @see #getStructuredText()
	 * @generated
	 */
	EReference getStructuredText_Statements();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText#getText()
	 * @see #getStructuredText()
	 * @generated
	 */
	EAttribute getStructuredText_Text();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getStatementType <em>Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Type</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getStatementType()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_StatementType();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getAbsStartLine <em>Abs Start Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abs Start Line</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getAbsStartLine()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_AbsStartLine();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getAbsEndLine <em>Abs End Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abs End Line</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getAbsEndLine()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_AbsEndLine();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getRelStartLine <em>Rel Start Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel Start Line</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getRelStartLine()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_RelStartLine();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getRelEndLine <em>Rel End Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel End Line</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getRelEndLine()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_RelEndLine();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getStartColumnPos <em>Start Column Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Column Pos</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getStartColumnPos()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_StartColumnPos();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getEndColumnPos <em>End Column Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Column Pos</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getEndColumnPos()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_EndColumnPos();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getStructuredText <em>Structured Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structured Text</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getStructuredText()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_StructuredText();

	/**
	 * Returns the meta object for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getText() <em>Get Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Text</em>' operation.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getText()
	 * @generated
	 */
	EOperation getStatement__GetText();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.AbstractPOUCall <em>Abstract POU Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract POU Call</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.AbstractPOUCall
	 * @generated
	 */
	EClass getAbstractPOUCall();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Assignment#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Assignment#getLeft()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Left();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Assignment#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Assignment#getRight()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Right();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.If#getConditionalBlocks <em>Conditional Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional Blocks</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.If#getConditionalBlocks()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ConditionalBlocks();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ConditionalBlock <em>Conditional Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Block</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ConditionalBlock
	 * @generated
	 */
	EClass getConditionalBlock();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ConditionalBlock#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ConditionalBlock#getCondition()
	 * @see #getConditionalBlock()
	 * @generated
	 */
	EReference getConditionalBlock_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ConditionalBlock#getSubstatements <em>Substatements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substatements</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ConditionalBlock#getSubstatements()
	 * @see #getConditionalBlock()
	 * @generated
	 */
	EReference getConditionalBlock_Substatements();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ConditionalBlock#isElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Else</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ConditionalBlock#isElse()
	 * @see #getConditionalBlock()
	 * @generated
	 */
	EAttribute getConditionalBlock_Else();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Case#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Case#getSwitch()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Switch();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Case#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Case#getCases()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Cases();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Case#getElseStatements <em>Else Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Statements</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Case#getElseStatements()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_ElseStatements();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.CaseBlock <em>Case Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Block</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.CaseBlock
	 * @generated
	 */
	EClass getCaseBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.CaseBlock#getCaseExpressions <em>Case Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case Expressions</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.CaseBlock#getCaseExpressions()
	 * @see #getCaseBlock()
	 * @generated
	 */
	EReference getCaseBlock_CaseExpressions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.CaseBlock#getSubstatements <em>Substatements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substatements</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.CaseBlock#getSubstatements()
	 * @see #getCaseBlock()
	 * @generated
	 */
	EReference getCaseBlock_Substatements();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement <em>Function Call Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call Statement</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement
	 * @generated
	 */
	EClass getFunctionCallStatement();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement#getInvokingVariable <em>Invoking Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoking Variable</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement#getInvokingVariable()
	 * @see #getFunctionCallStatement()
	 * @generated
	 */
	EReference getFunctionCallStatement_InvokingVariable();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement#getFunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Call</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement#getFunctionCall()
	 * @see #getFunctionCallStatement()
	 * @generated
	 */
	EReference getFunctionCallStatement_FunctionCall();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.UnboundedLoop <em>Unbounded Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unbounded Loop</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.UnboundedLoop
	 * @generated
	 */
	EClass getUnboundedLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.UnboundedLoop#getSubstatements <em>Substatements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substatements</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.UnboundedLoop#getSubstatements()
	 * @see #getUnboundedLoop()
	 * @generated
	 */
	EReference getUnboundedLoop_Substatements();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.UnboundedLoop#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.UnboundedLoop#getCondition()
	 * @see #getUnboundedLoop()
	 * @generated
	 */
	EReference getUnboundedLoop_Condition();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop <em>For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop
	 * @generated
	 */
	EClass getForLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop#getSubstatements <em>Substatements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substatements</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop#getSubstatements()
	 * @see #getForLoop()
	 * @generated
	 */
	EReference getForLoop_Substatements();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop#getInitialValue()
	 * @see #getForLoop()
	 * @generated
	 */
	EAttribute getForLoop_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop#getUpperBound()
	 * @see #getForLoop()
	 * @generated
	 */
	EAttribute getForLoop_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop#getIncrement()
	 * @see #getForLoop()
	 * @generated
	 */
	EAttribute getForLoop_Increment();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Counter</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop#getCounter()
	 * @see #getForLoop()
	 * @generated
	 */
	EReference getForLoop_Counter();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ExitStatement <em>Exit Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Statement</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ExitStatement
	 * @generated
	 */
	EClass getExitStatement();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StatementType <em>Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Statement Type</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StatementType
	 * @generated
	 */
	EEnum getStatementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructuredTextFactory getStructuredTextFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextImpl <em>Structured Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getStructuredText()
		 * @generated
		 */
		EClass STRUCTURED_TEXT = eINSTANCE.getStructuredText();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_TEXT__STATEMENTS = eINSTANCE.getStructuredText_Statements();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_TEXT__TEXT = eINSTANCE.getStructuredText_Text();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StatementImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Statement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__STATEMENT_TYPE = eINSTANCE.getStatement_StatementType();

		/**
		 * The meta object literal for the '<em><b>Abs Start Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__ABS_START_LINE = eINSTANCE.getStatement_AbsStartLine();

		/**
		 * The meta object literal for the '<em><b>Abs End Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__ABS_END_LINE = eINSTANCE.getStatement_AbsEndLine();

		/**
		 * The meta object literal for the '<em><b>Rel Start Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__REL_START_LINE = eINSTANCE.getStatement_RelStartLine();

		/**
		 * The meta object literal for the '<em><b>Rel End Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__REL_END_LINE = eINSTANCE.getStatement_RelEndLine();

		/**
		 * The meta object literal for the '<em><b>Start Column Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__START_COLUMN_POS = eINSTANCE.getStatement_StartColumnPos();

		/**
		 * The meta object literal for the '<em><b>End Column Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__END_COLUMN_POS = eINSTANCE.getStatement_EndColumnPos();

		/**
		 * The meta object literal for the '<em><b>Structured Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__STRUCTURED_TEXT = eINSTANCE.getStatement_StructuredText();

		/**
		 * The meta object literal for the '<em><b>Get Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATEMENT___GET_TEXT = eINSTANCE.getStatement__GetText();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AbstractPOUCallImpl <em>Abstract POU Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AbstractPOUCallImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getAbstractPOUCall()
		 * @generated
		 */
		EClass ABSTRACT_POU_CALL = eINSTANCE.getAbstractPOUCall();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AssignmentImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__LEFT = eINSTANCE.getAssignment_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__RIGHT = eINSTANCE.getAssignment_Right();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.IfImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Conditional Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITIONAL_BLOCKS = eINSTANCE.getIf_ConditionalBlocks();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ConditionalBlockImpl <em>Conditional Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ConditionalBlockImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getConditionalBlock()
		 * @generated
		 */
		EClass CONDITIONAL_BLOCK = eINSTANCE.getConditionalBlock();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_BLOCK__CONDITION = eINSTANCE.getConditionalBlock_Condition();

		/**
		 * The meta object literal for the '<em><b>Substatements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_BLOCK__SUBSTATEMENTS = eINSTANCE.getConditionalBlock_Substatements();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_BLOCK__ELSE = eINSTANCE.getConditionalBlock_Else();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.CaseImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__SWITCH = eINSTANCE.getCase_Switch();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__CASES = eINSTANCE.getCase_Cases();

		/**
		 * The meta object literal for the '<em><b>Else Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__ELSE_STATEMENTS = eINSTANCE.getCase_ElseStatements();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.CaseBlockImpl <em>Case Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.CaseBlockImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getCaseBlock()
		 * @generated
		 */
		EClass CASE_BLOCK = eINSTANCE.getCaseBlock();

		/**
		 * The meta object literal for the '<em><b>Case Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_BLOCK__CASE_EXPRESSIONS = eINSTANCE.getCaseBlock_CaseExpressions();

		/**
		 * The meta object literal for the '<em><b>Substatements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_BLOCK__SUBSTATEMENTS = eINSTANCE.getCaseBlock_Substatements();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.FunctionCallStatementImpl <em>Function Call Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.FunctionCallStatementImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getFunctionCallStatement()
		 * @generated
		 */
		EClass FUNCTION_CALL_STATEMENT = eINSTANCE.getFunctionCallStatement();

		/**
		 * The meta object literal for the '<em><b>Invoking Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_STATEMENT__INVOKING_VARIABLE = eINSTANCE.getFunctionCallStatement_InvokingVariable();

		/**
		 * The meta object literal for the '<em><b>Function Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_STATEMENT__FUNCTION_CALL = eINSTANCE.getFunctionCallStatement_FunctionCall();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.UnboundedLoopImpl <em>Unbounded Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.UnboundedLoopImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getUnboundedLoop()
		 * @generated
		 */
		EClass UNBOUNDED_LOOP = eINSTANCE.getUnboundedLoop();

		/**
		 * The meta object literal for the '<em><b>Substatements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNBOUNDED_LOOP__SUBSTATEMENTS = eINSTANCE.getUnboundedLoop_Substatements();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNBOUNDED_LOOP__CONDITION = eINSTANCE.getUnboundedLoop_Condition();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ForLoopImpl <em>For Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ForLoopImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getForLoop()
		 * @generated
		 */
		EClass FOR_LOOP = eINSTANCE.getForLoop();

		/**
		 * The meta object literal for the '<em><b>Substatements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP__SUBSTATEMENTS = eINSTANCE.getForLoop_Substatements();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_LOOP__INITIAL_VALUE = eINSTANCE.getForLoop_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_LOOP__UPPER_BOUND = eINSTANCE.getForLoop_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_LOOP__INCREMENT = eINSTANCE.getForLoop_Increment();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP__COUNTER = eINSTANCE.getForLoop_Counter();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ExitStatementImpl <em>Exit Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ExitStatementImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getExitStatement()
		 * @generated
		 */
		EClass EXIT_STATEMENT = eINSTANCE.getExitStatement();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ReturnStatementImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getReturnStatement()
		 * @generated
		 */
		EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StatementType <em>Statement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StatementType
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextPackageImpl#getStatementType()
		 * @generated
		 */
		EEnum STATEMENT_TYPE = eINSTANCE.getStatementType();

	}

} //StructuredTextPackage
