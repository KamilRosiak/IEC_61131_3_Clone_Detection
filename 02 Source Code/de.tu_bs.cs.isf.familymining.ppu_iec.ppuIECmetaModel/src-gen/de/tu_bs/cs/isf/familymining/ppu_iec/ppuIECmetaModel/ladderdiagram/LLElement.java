/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LL Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement#getStatus <em>Status</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement#getLabeledVariable <em>Labeled Variable</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage#getLLElement()
 * @model
 * @generated
 */
public interface LLElement extends AbstractTransitElement {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementStatus
	 * @see #setStatus(LLElementStatus)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage#getLLElement_Status()
	 * @model
	 * @generated
	 */
	LLElementStatus getStatus();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(LLElementStatus value);

	/**
	 * Returns the value of the '<em><b>Labeled Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeled Variable</em>' containment reference.
	 * @see #setLabeledVariable(VariableExpression)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage#getLLElement_LabeledVariable()
	 * @model containment="true"
	 * @generated
	 */
	VariableExpression getLabeledVariable();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement#getLabeledVariable <em>Labeled Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labeled Variable</em>' containment reference.
	 * @see #getLabeledVariable()
	 * @generated
	 */
	void setLabeledVariable(VariableExpression value);

} // LLElement
