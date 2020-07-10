/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunction#getFunctionOperation <em>Function Operation</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage#getStandardFunction()
 * @model
 * @generated
 */
public interface StandardFunction extends FBDElement {
	/**
	 * Returns the value of the '<em><b>Function Operation</b></em>' attribute.
	 * The default value is <code>"UNSET"</code>.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Operation</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionOperation
	 * @see #setFunctionOperation(StandardFunctionOperation)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage#getStandardFunction_FunctionOperation()
	 * @model default="UNSET" required="true"
	 * @generated
	 */
	StandardFunctionOperation getFunctionOperation();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunction#getFunctionOperation <em>Function Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Operation</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionOperation
	 * @see #getFunctionOperation()
	 * @generated
	 */
	void setFunctionOperation(StandardFunctionOperation value);

} // StandardFunction
