/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.ExecutionBlock#getExecutionStatements <em>Execution Statements</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage#getExecutionBlock()
 * @model
 * @generated
 */
public interface ExecutionBlock extends FBDElement {
	/**
	 * Returns the value of the '<em><b>Execution Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Statements</em>' containment reference.
	 * @see #setExecutionStatements(StructuredText)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage#getExecutionBlock_ExecutionStatements()
	 * @model containment="true"
	 * @generated
	 */
	StructuredText getExecutionStatements();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.ExecutionBlock#getExecutionStatements <em>Execution Statements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Statements</em>' containment reference.
	 * @see #getExecutionStatements()
	 * @generated
	 */
	void setExecutionStatements(StructuredText value);

} // ExecutionBlock
