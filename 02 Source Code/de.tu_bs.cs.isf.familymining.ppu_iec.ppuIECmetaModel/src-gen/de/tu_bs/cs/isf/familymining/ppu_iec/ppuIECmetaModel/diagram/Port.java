/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.interfaces.EObjectSerializable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port#getAttachedElement <em>Attached Element</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port#getConnectedPorts <em>Connected Ports</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getPort()
 * @model
 * @extends EObjectSerializable
 * @generated
 */
public interface Port extends EObjectSerializable {
	/**
	 * Returns the value of the '<em><b>Attached Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached Element</em>' reference.
	 * @see #setAttachedElement(DiagramElement)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getPort_AttachedElement()
	 * @model
	 * @generated
	 */
	DiagramElement getAttachedElement();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port#getAttachedElement <em>Attached Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached Element</em>' reference.
	 * @see #getAttachedElement()
	 * @generated
	 */
	void setAttachedElement(DiagramElement value);

	/**
	 * Returns the value of the '<em><b>Connected Ports</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Ports</em>' reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getPort_ConnectedPorts()
	 * @model
	 * @generated
	 */
	EList<Port> getConnectedPorts();

} // Port
