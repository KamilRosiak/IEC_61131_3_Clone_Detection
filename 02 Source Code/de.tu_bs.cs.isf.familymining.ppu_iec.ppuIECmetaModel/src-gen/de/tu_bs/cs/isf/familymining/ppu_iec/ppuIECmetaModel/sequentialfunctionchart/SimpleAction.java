/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SimpleAction#getActionVariable <em>Action Variable</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartPackage#getSimpleAction()
 * @model
 * @generated
 */
public interface SimpleAction extends AbstractAction {
	/**
	 * Returns the value of the '<em><b>Action Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Variable</em>' reference.
	 * @see #setActionVariable(Variable)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartPackage#getSimpleAction_ActionVariable()
	 * @model
	 * @generated
	 */
	Variable getActionVariable();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SimpleAction#getActionVariable <em>Action Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Variable</em>' reference.
	 * @see #getActionVariable()
	 * @generated
	 */
	void setActionVariable(Variable value);

} // SimpleAction
