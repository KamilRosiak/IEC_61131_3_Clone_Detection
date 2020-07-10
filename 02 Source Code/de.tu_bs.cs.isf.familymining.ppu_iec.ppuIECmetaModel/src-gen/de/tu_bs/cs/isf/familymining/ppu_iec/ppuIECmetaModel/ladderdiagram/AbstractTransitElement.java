/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Transit Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.AbstractTransitElement#getTransitElementType <em>Transit Element Type</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage#getAbstractTransitElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTransitElement extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Transit Element Type</b></em>' attribute.
	 * The default value is <code>"UNDEFINED"</code>.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transit Element Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementType
	 * @see #setTransitElementType(LLElementType)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage#getAbstractTransitElement_TransitElementType()
	 * @model default="UNDEFINED"
	 * @generated
	 */
	LLElementType getTransitElementType();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.AbstractTransitElement#getTransitElementType <em>Transit Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transit Element Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementType
	 * @see #getTransitElementType()
	 * @generated
	 */
	void setTransitElementType(LLElementType value);

} // AbstractTransitElement
