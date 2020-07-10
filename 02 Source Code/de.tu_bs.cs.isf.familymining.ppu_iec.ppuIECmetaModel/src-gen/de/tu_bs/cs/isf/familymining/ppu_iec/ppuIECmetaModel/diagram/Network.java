/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.interfaces.EObjectSerializable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getLabel <em>Label</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getNetworkElements <em>Network Elements</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getNetwork()
 * @model
 * @extends EObjectSerializable
 * @generated
 */
public interface Network extends EObjectSerializable {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getNetwork_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Network Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Elements</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getNetwork_NetworkElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiagramElement> getNetworkElements();

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' reference.
	 * @see #setDiagram(Diagram)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getNetwork_Diagram()
	 * @model
	 * @generated
	 */
	Diagram getDiagram();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getDiagram <em>Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(Diagram value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage#getNetwork_Position()
	 * @model default="-1"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

} // Network
