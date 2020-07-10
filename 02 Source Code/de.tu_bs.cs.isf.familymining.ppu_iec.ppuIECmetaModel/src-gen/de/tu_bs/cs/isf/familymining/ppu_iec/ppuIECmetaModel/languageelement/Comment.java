/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.interfaces.EObjectSerializable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.Comment#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.Comment#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage#getComment()
 * @model
 * @extends EObjectSerializable
 * @generated
 */
public interface Comment extends EObjectSerializable {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage#getComment_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.Comment#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' attribute list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage#getComment_Statements()
	 * @model
	 * @generated
	 */
	EList<String> getStatements();

} // Comment
