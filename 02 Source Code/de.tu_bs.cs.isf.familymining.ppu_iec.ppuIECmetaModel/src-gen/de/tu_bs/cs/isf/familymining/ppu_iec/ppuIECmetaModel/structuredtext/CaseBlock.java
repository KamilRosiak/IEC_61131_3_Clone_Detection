/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.CaseBlock#getCaseExpressions <em>Case Expressions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.CaseBlock#getSubstatements <em>Substatements</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getCaseBlock()
 * @model
 * @generated
 */
public interface CaseBlock extends Statement {
	/**
	 * Returns the value of the '<em><b>Case Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Expressions</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getCaseBlock_CaseExpressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getCaseExpressions();

	/**
	 * Returns the value of the '<em><b>Substatements</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substatements</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getCaseBlock_Substatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getSubstatements();

} // CaseBlock
