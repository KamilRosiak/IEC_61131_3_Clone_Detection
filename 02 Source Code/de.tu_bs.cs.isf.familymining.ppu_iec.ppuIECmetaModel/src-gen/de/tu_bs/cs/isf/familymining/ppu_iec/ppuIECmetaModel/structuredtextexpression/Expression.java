/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression#getDataType <em>Data Type</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression#getExpressionType <em>Expression Type</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.StructuredTextExpressionPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends Identifier {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType
	 * @see #setDataType(ElementaryDataType)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.StructuredTextExpressionPackage#getExpression_DataType()
	 * @model
	 * @generated
	 */
	ElementaryDataType getDataType();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(ElementaryDataType value);

	/**
	 * Returns the value of the '<em><b>Expression Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ExpressionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ExpressionType
	 * @see #setExpressionType(ExpressionType)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.StructuredTextExpressionPackage#getExpression_ExpressionType()
	 * @model
	 * @generated
	 */
	ExpressionType getExpressionType();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression#getExpressionType <em>Expression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ExpressionType
	 * @see #getExpressionType()
	 * @generated
	 */
	void setExpressionType(ExpressionType value);

} // Expression
