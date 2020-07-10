/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#getDescription <em>Description</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#isIsWeighted <em>Is Weighted</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#getComparisonattribute <em>Comparisonattribute</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#getMetric()
 * @model
 * @generated
 */
public interface Metric extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#getMetric_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#getMetric_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Weighted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Weighted</em>' attribute.
	 * @see #setIsWeighted(boolean)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#getMetric_IsWeighted()
	 * @model
	 * @generated
	 */
	boolean isIsWeighted();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#isIsWeighted <em>Is Weighted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Weighted</em>' attribute.
	 * @see #isIsWeighted()
	 * @generated
	 */
	void setIsWeighted(boolean value);

	/**
	 * Returns the value of the '<em><b>Comparisonattribute</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparisonattribute</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#getMetric_Comparisonattribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComparisonAttribute> getComparisonattribute();

} // Metric
