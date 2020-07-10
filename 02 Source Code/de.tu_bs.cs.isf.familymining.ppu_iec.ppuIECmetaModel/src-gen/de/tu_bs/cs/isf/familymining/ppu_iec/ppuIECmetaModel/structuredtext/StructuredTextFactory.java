/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage
 * @generated
 */
public interface StructuredTextFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuredTextFactory eINSTANCE = de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.StructuredTextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Structured Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Text</em>'.
	 * @generated
	 */
	StructuredText createStructuredText();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If</em>'.
	 * @generated
	 */
	If createIf();

	/**
	 * Returns a new object of class '<em>Conditional Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Block</em>'.
	 * @generated
	 */
	ConditionalBlock createConditionalBlock();

	/**
	 * Returns a new object of class '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case</em>'.
	 * @generated
	 */
	Case createCase();

	/**
	 * Returns a new object of class '<em>Case Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Block</em>'.
	 * @generated
	 */
	CaseBlock createCaseBlock();

	/**
	 * Returns a new object of class '<em>Function Call Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call Statement</em>'.
	 * @generated
	 */
	FunctionCallStatement createFunctionCallStatement();

	/**
	 * Returns a new object of class '<em>Unbounded Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unbounded Loop</em>'.
	 * @generated
	 */
	UnboundedLoop createUnboundedLoop();

	/**
	 * Returns a new object of class '<em>For Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Loop</em>'.
	 * @generated
	 */
	ForLoop createForLoop();

	/**
	 * Returns a new object of class '<em>Exit Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit Statement</em>'.
	 * @generated
	 */
	ExitStatement createExitStatement();

	/**
	 * Returns a new object of class '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Statement</em>'.
	 * @generated
	 */
	ReturnStatement createReturnStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StructuredTextPackage getStructuredTextPackage();

} //StructuredTextFactory
