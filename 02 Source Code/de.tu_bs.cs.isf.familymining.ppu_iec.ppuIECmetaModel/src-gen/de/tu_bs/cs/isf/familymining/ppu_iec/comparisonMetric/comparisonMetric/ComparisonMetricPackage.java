/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricFactory
 * @model kind="package"
 * @generated
 */
public interface ComparisonMetricPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "comparisonMetric";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.tu-braunschweig.de/isf/ppuIECScenario/metric";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "C";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComparisonMetricPackage eINSTANCE = de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonMetricPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.MetricImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonMetricPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Is Weighted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__IS_WEIGHTED = 2;

	/**
	 * The feature id for the '<em><b>Comparisonattribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__COMPARISONATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonAttributeImpl <em>Comparison Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonAttributeImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonMetricPackageImpl#getComparisonAttribute()
	 * @generated
	 */
	int COMPARISON_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_ATTRIBUTE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_ATTRIBUTE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_ATTRIBUTE__WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_ATTRIBUTE__IS_OPTION = 3;

	/**
	 * The feature id for the '<em><b>Child Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_ATTRIBUTE__CHILD_ATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>Parent Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_ATTRIBUTE__PARENT_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_ATTRIBUTE__TARGET_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Comparison Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_ATTRIBUTE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Comparison Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonTarget <em>Comparison Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonTarget
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonMetricPackageImpl#getComparisonTarget()
	 * @generated
	 */
	int COMPARISON_TARGET = 2;


	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#getDescription()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#isIsWeighted <em>Is Weighted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Weighted</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#isIsWeighted()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_IsWeighted();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#getComparisonattribute <em>Comparisonattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comparisonattribute</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric#getComparisonattribute()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_Comparisonattribute();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute <em>Comparison Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Attribute</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute
	 * @generated
	 */
	EClass getComparisonAttribute();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getLabel()
	 * @see #getComparisonAttribute()
	 * @generated
	 */
	EAttribute getComparisonAttribute_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getDescription()
	 * @see #getComparisonAttribute()
	 * @generated
	 */
	EAttribute getComparisonAttribute_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getWeight()
	 * @see #getComparisonAttribute()
	 * @generated
	 */
	EAttribute getComparisonAttribute_Weight();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#isIsOption <em>Is Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Option</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#isIsOption()
	 * @see #getComparisonAttribute()
	 * @generated
	 */
	EAttribute getComparisonAttribute_IsOption();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getChildAttributes <em>Child Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Attributes</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getChildAttributes()
	 * @see #getComparisonAttribute()
	 * @generated
	 */
	EReference getComparisonAttribute_ChildAttributes();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getParentAttribute <em>Parent Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Attribute</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getParentAttribute()
	 * @see #getComparisonAttribute()
	 * @generated
	 */
	EReference getComparisonAttribute_ParentAttribute();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Type</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getTargetType()
	 * @see #getComparisonAttribute()
	 * @generated
	 */
	EAttribute getComparisonAttribute_TargetType();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonTarget <em>Comparison Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Target</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonTarget
	 * @generated
	 */
	EEnum getComparisonTarget();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComparisonMetricFactory getComparisonMetricFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.MetricImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonMetricPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__NAME = eINSTANCE.getMetric_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__DESCRIPTION = eINSTANCE.getMetric_Description();

		/**
		 * The meta object literal for the '<em><b>Is Weighted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__IS_WEIGHTED = eINSTANCE.getMetric_IsWeighted();

		/**
		 * The meta object literal for the '<em><b>Comparisonattribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__COMPARISONATTRIBUTE = eINSTANCE.getMetric_Comparisonattribute();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonAttributeImpl <em>Comparison Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonAttributeImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonMetricPackageImpl#getComparisonAttribute()
		 * @generated
		 */
		EClass COMPARISON_ATTRIBUTE = eINSTANCE.getComparisonAttribute();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_ATTRIBUTE__LABEL = eINSTANCE.getComparisonAttribute_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_ATTRIBUTE__DESCRIPTION = eINSTANCE.getComparisonAttribute_Description();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_ATTRIBUTE__WEIGHT = eINSTANCE.getComparisonAttribute_Weight();

		/**
		 * The meta object literal for the '<em><b>Is Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_ATTRIBUTE__IS_OPTION = eINSTANCE.getComparisonAttribute_IsOption();

		/**
		 * The meta object literal for the '<em><b>Child Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_ATTRIBUTE__CHILD_ATTRIBUTES = eINSTANCE.getComparisonAttribute_ChildAttributes();

		/**
		 * The meta object literal for the '<em><b>Parent Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_ATTRIBUTE__PARENT_ATTRIBUTE = eINSTANCE.getComparisonAttribute_ParentAttribute();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_ATTRIBUTE__TARGET_TYPE = eINSTANCE.getComparisonAttribute_TargetType();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonTarget <em>Comparison Target</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonTarget
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonMetricPackageImpl#getComparisonTarget()
		 * @generated
		 */
		EEnum COMPARISON_TARGET = eINSTANCE.getComparisonTarget();

	}

} //ComparisonMetricPackage
