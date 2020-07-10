/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.ComplexAction#getPouAction <em>Pou Action</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartPackage#getComplexAction()
 * @model
 * @generated
 */
public interface ComplexAction extends AbstractAction {
	/**
	 * Returns the value of the '<em><b>Pou Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pou Action</em>' reference.
	 * @see #setPouAction(Action)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartPackage#getComplexAction_PouAction()
	 * @model
	 * @generated
	 */
	Action getPouAction();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.ComplexAction#getPouAction <em>Pou Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pou Action</em>' reference.
	 * @see #getPouAction()
	 * @generated
	 */
	void setPouAction(Action value);

} // ComplexAction
