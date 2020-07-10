/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ladder Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderNetwork#getLeftPowerRail <em>Left Power Rail</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderNetwork#getRightPowerRail <em>Right Power Rail</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage#getLadderNetwork()
 * @model
 * @generated
 */
public interface LadderNetwork extends Network {
	/**
	 * Returns the value of the '<em><b>Left Power Rail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Power Rail</em>' reference.
	 * @see #setLeftPowerRail(LLElement)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage#getLadderNetwork_LeftPowerRail()
	 * @model
	 * @generated
	 */
	LLElement getLeftPowerRail();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderNetwork#getLeftPowerRail <em>Left Power Rail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Power Rail</em>' reference.
	 * @see #getLeftPowerRail()
	 * @generated
	 */
	void setLeftPowerRail(LLElement value);

	/**
	 * Returns the value of the '<em><b>Right Power Rail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Power Rail</em>' reference.
	 * @see #setRightPowerRail(LLElement)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage#getLadderNetwork_RightPowerRail()
	 * @model
	 * @generated
	 */
	LLElement getRightPowerRail();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderNetwork#getRightPowerRail <em>Right Power Rail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Power Rail</em>' reference.
	 * @see #getRightPowerRail()
	 * @generated
	 */
	void setRightPowerRail(LLElement value);

} // LadderNetwork
