/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.If#getConditionalBlocks <em>Conditional Blocks</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Statement {
	/**
	 * Returns the value of the '<em><b>Conditional Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ConditionalBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Blocks</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage#getIf_ConditionalBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalBlock> getConditionalBlocks();

} // If
