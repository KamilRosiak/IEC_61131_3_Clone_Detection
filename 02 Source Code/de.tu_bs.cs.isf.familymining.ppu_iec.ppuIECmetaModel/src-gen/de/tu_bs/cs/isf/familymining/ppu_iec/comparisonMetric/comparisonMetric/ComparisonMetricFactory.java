/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage
 * @generated
 */
public interface ComparisonMetricFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComparisonMetricFactory eINSTANCE = de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonMetricFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric</em>'.
	 * @generated
	 */
	Metric createMetric();

	/**
	 * Returns a new object of class '<em>Comparison Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Attribute</em>'.
	 * @generated
	 */
	ComparisonAttribute createComparisonAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComparisonMetricPackage getComparisonMetricPackage();

} //ComparisonMetricFactory
