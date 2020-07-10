/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FBDPOU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDPOU#getRefPOU <em>Ref POU</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage#getFBDPOU()
 * @model
 * @generated
 */
public interface FBDPOU extends FBDElement {
	/**
	 * Returns the value of the '<em><b>Ref POU</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref POU</em>' reference.
	 * @see #setRefPOU(POU)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage#getFBDPOU_RefPOU()
	 * @model required="true"
	 * @generated
	 */
	POU getRefPOU();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDPOU#getRefPOU <em>Ref POU</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref POU</em>' reference.
	 * @see #getRefPOU()
	 * @generated
	 */
	void setRefPOU(POU value);

} // FBDPOU
