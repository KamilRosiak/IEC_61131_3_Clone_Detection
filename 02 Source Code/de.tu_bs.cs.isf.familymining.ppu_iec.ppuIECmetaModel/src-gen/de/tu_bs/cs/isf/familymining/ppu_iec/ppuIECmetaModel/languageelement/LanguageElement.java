/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.interfaces.EObjectSerializable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement#getParentElement <em>Parent Element</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement#getChildElements <em>Child Elements</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement#getLabel <em>Label</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage#getLanguageElement()
 * @model abstract="true"
 * @extends EObjectSerializable
 * @generated
 */
public interface LanguageElement extends EObjectSerializable {
	/**
	 * Returns the value of the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Element</em>' reference.
	 * @see #setParentElement(LanguageElement)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage#getLanguageElement_ParentElement()
	 * @model
	 * @generated
	 */
	LanguageElement getParentElement();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement#getParentElement <em>Parent Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Element</em>' reference.
	 * @see #getParentElement()
	 * @generated
	 */
	void setParentElement(LanguageElement value);

	/**
	 * Returns the value of the '<em><b>Child Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Elements</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage#getLanguageElement_ChildElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<LanguageElement> getChildElements();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage#getLanguageElement_Label()
	 * @model default=""
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage#getLanguageElement_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

} // LanguageElement
