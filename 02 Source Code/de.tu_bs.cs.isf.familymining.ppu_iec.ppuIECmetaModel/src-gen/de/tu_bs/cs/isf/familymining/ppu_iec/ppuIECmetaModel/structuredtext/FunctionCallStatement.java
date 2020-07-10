/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.FunctionCallExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement#getInvokingVariable <em>Invoking Variable</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement#getFunctionCall <em>Function Call</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getFunctionCallStatement()
 * @model
 * @generated
 */
public interface FunctionCallStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Invoking Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoking Variable</em>' containment reference.
	 * @see #setInvokingVariable(VariableExpression)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getFunctionCallStatement_InvokingVariable()
	 * @model containment="true"
	 * @generated
	 */
	VariableExpression getInvokingVariable();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement#getInvokingVariable <em>Invoking Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoking Variable</em>' containment reference.
	 * @see #getInvokingVariable()
	 * @generated
	 */
	void setInvokingVariable(VariableExpression value);

	/**
	 * Returns the value of the '<em><b>Function Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Call</em>' containment reference.
	 * @see #setFunctionCall(FunctionCallExpression)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getFunctionCallStatement_FunctionCall()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionCallExpression getFunctionCall();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement#getFunctionCall <em>Function Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Call</em>' containment reference.
	 * @see #getFunctionCall()
	 * @generated
	 */
	void setFunctionCall(FunctionCallExpression value);

} // FunctionCallStatement
