/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getStatementType <em>Statement Type</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getAbsStartLine <em>Abs Start Line</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getAbsEndLine <em>Abs End Line</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getRelStartLine <em>Rel Start Line</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getRelEndLine <em>Rel End Line</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getStartColumnPos <em>Start Column Pos</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getEndColumnPos <em>End Column Pos</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getStructuredText <em>Structured Text</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends Identifier {
	/**
	 * Returns the value of the '<em><b>Statement Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StatementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StatementType
	 * @see #setStatementType(StatementType)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getStatement_StatementType()
	 * @model
	 * @generated
	 */
	StatementType getStatementType();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getStatementType <em>Statement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StatementType
	 * @see #getStatementType()
	 * @generated
	 */
	void setStatementType(StatementType value);

	/**
	 * Returns the value of the '<em><b>Abs Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abs Start Line</em>' attribute.
	 * @see #setAbsStartLine(int)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getStatement_AbsStartLine()
	 * @model
	 * @generated
	 */
	int getAbsStartLine();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getAbsStartLine <em>Abs Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abs Start Line</em>' attribute.
	 * @see #getAbsStartLine()
	 * @generated
	 */
	void setAbsStartLine(int value);

	/**
	 * Returns the value of the '<em><b>Abs End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abs End Line</em>' attribute.
	 * @see #setAbsEndLine(int)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getStatement_AbsEndLine()
	 * @model
	 * @generated
	 */
	int getAbsEndLine();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getAbsEndLine <em>Abs End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abs End Line</em>' attribute.
	 * @see #getAbsEndLine()
	 * @generated
	 */
	void setAbsEndLine(int value);

	/**
	 * Returns the value of the '<em><b>Rel Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Start Line</em>' attribute.
	 * @see #setRelStartLine(int)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getStatement_RelStartLine()
	 * @model
	 * @generated
	 */
	int getRelStartLine();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getRelStartLine <em>Rel Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Start Line</em>' attribute.
	 * @see #getRelStartLine()
	 * @generated
	 */
	void setRelStartLine(int value);

	/**
	 * Returns the value of the '<em><b>Rel End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel End Line</em>' attribute.
	 * @see #setRelEndLine(int)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getStatement_RelEndLine()
	 * @model
	 * @generated
	 */
	int getRelEndLine();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getRelEndLine <em>Rel End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel End Line</em>' attribute.
	 * @see #getRelEndLine()
	 * @generated
	 */
	void setRelEndLine(int value);

	/**
	 * Returns the value of the '<em><b>Start Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Column Pos</em>' attribute.
	 * @see #setStartColumnPos(int)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getStatement_StartColumnPos()
	 * @model
	 * @generated
	 */
	int getStartColumnPos();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getStartColumnPos <em>Start Column Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Column Pos</em>' attribute.
	 * @see #getStartColumnPos()
	 * @generated
	 */
	void setStartColumnPos(int value);

	/**
	 * Returns the value of the '<em><b>End Column Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Column Pos</em>' attribute.
	 * @see #setEndColumnPos(int)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getStatement_EndColumnPos()
	 * @model
	 * @generated
	 */
	int getEndColumnPos();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getEndColumnPos <em>End Column Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Column Pos</em>' attribute.
	 * @see #getEndColumnPos()
	 * @generated
	 */
	void setEndColumnPos(int value);

	/**
	 * Returns the value of the '<em><b>Structured Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Text</em>' reference.
	 * @see #setStructuredText(StructuredText)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getStatement_StructuredText()
	 * @model required="true"
	 * @generated
	 */
	StructuredText getStructuredText();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement#getStructuredText <em>Structured Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Text</em>' reference.
	 * @see #getStructuredText()
	 * @generated
	 */
	void setStructuredText(StructuredText value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getText();

} // Statement
