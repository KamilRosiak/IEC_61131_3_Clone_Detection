/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FB Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#getPortVariable <em>Port Variable</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#isNegated <em>Negated</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#getAssignedValue <em>Assigned Value</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#isConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getFBPort()
 * @model
 * @generated
 */
public interface FBPort extends Port {
	/**
	 * Returns the value of the '<em><b>Port Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Variable</em>' containment reference.
	 * @see #setPortVariable(VariableExpression)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getFBPort_PortVariable()
	 * @model containment="true"
	 * @generated
	 */
	VariableExpression getPortVariable();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#getPortVariable <em>Port Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Variable</em>' containment reference.
	 * @see #getPortVariable()
	 * @generated
	 */
	void setPortVariable(VariableExpression value);

	/**
	 * Returns the value of the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated</em>' attribute.
	 * @see #setNegated(boolean)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getFBPort_Negated()
	 * @model
	 * @generated
	 */
	boolean isNegated();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' attribute.
	 * @see #isNegated()
	 * @generated
	 */
	void setNegated(boolean value);

	/**
	 * Returns the value of the '<em><b>Assigned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Value</em>' containment reference.
	 * @see #setAssignedValue(Expression)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getFBPort_AssignedValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getAssignedValue();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#getAssignedValue <em>Assigned Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Value</em>' containment reference.
	 * @see #getAssignedValue()
	 * @generated
	 */
	void setAssignedValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #setConnected(boolean)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getFBPort_Connected()
	 * @model
	 * @generated
	 */
	boolean isConnected();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isConnected()
	 * @generated
	 */
	void setConnected(boolean value);

} // FBPort
