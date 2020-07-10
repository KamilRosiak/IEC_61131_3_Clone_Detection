/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump#getTargetNetwork <em>Target Network</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump#getJumpLabel <em>Jump Label</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getJump()
 * @model
 * @generated
 */
public interface Jump extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Target Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Network</em>' reference.
	 * @see #setTargetNetwork(Network)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getJump_TargetNetwork()
	 * @model
	 * @generated
	 */
	Network getTargetNetwork();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump#getTargetNetwork <em>Target Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Network</em>' reference.
	 * @see #getTargetNetwork()
	 * @generated
	 */
	void setTargetNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Jump Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jump Label</em>' attribute.
	 * @see #setJumpLabel(String)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getJump_JumpLabel()
	 * @model
	 * @generated
	 */
	String getJumpLabel();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump#getJumpLabel <em>Jump Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jump Label</em>' attribute.
	 * @see #getJumpLabel()
	 * @generated
	 */
	void setJumpLabel(String value);

} // Jump
