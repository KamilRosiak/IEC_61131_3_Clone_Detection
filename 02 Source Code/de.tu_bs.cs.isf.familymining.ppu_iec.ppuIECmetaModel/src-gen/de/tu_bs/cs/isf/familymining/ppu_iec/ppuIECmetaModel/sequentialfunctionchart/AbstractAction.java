/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.interfaces.EObjectSerializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.AbstractAction#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.AbstractAction#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartPackage#getAbstractAction()
 * @model abstract="true"
 * @extends EObjectSerializable
 * @generated
 */
public interface AbstractAction extends EObjectSerializable {
	/**
	 * Returns the value of the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Id</em>' attribute.
	 * @see #setLocalId(int)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartPackage#getAbstractAction_LocalId()
	 * @model
	 * @generated
	 */
	int getLocalId();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.AbstractAction#getLocalId <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Id</em>' attribute.
	 * @see #getLocalId()
	 * @generated
	 */
	void setLocalId(int value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * The default value is <code>"UNDEFINED"</code>.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.StepQualifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.StepQualifier
	 * @see #setQualifier(StepQualifier)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartPackage#getAbstractAction_Qualifier()
	 * @model default="UNDEFINED" required="true"
	 * @generated
	 */
	StepQualifier getQualifier();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.AbstractAction#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.StepQualifier
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(StepQualifier value);

} // AbstractAction
