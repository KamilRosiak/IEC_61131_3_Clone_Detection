/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Function Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlock#getFunctionBlockOperation <em>Function Block Operation</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage#getStandardFunctionBlock()
 * @model
 * @generated
 */
public interface StandardFunctionBlock extends FBDElement {
	/**
	 * Returns the value of the '<em><b>Function Block Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlockOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Block Operation</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlockOperation
	 * @see #setFunctionBlockOperation(StandardFunctionBlockOperation)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage#getStandardFunctionBlock_FunctionBlockOperation()
	 * @model required="true"
	 * @generated
	 */
	StandardFunctionBlockOperation getFunctionBlockOperation();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlock#getFunctionBlockOperation <em>Function Block Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Block Operation</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlockOperation
	 * @see #getFunctionBlockOperation()
	 * @generated
	 */
	void setFunctionBlockOperation(StandardFunctionBlockOperation value);

} // StandardFunctionBlock
