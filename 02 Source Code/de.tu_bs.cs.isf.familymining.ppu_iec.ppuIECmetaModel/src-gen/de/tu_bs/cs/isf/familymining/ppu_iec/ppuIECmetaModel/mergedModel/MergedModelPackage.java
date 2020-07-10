/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel;

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
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelFactory
 * @model kind="package"
 * @generated
 */
public interface MergedModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mergedModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.tu-braunschweig.de/isf/ppuIECScenario/MergedModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MergedModelPackage eINSTANCE = de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.MergedModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.FamilyModelImpl <em>Family Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.FamilyModelImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.MergedModelPackageImpl#getFamilyModel()
	 * @generated
	 */
	int FAMILY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Source Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MODEL__SOURCE_VARIANT = 0;

	/**
	 * The feature id for the '<em><b>Target Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MODEL__TARGET_VARIANT = 1;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MODEL__METRIC = 2;

	/**
	 * The feature id for the '<em><b>Compared Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MODEL__COMPARED_ELEMENTS = 3;

	/**
	 * The number of structural features of the '<em>Family Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Family Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.ElementComparisonImpl <em>Element Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.ElementComparisonImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.MergedModelPackageImpl#getElementComparison()
	 * @generated
	 */
	int ELEMENT_COMPARISON = 1;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COMPARISON__SOURCE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COMPARISON__TARGET_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Similarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COMPARISON__SIMILARITY = 2;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COMPARISON__SUB_ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COMPARISON__PARENT_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COMPARISON__VARIABILITY = 5;

	/**
	 * The number of structural features of the '<em>Element Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COMPARISON_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Element Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COMPARISON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.VariabilityCategory <em>Variability Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.VariabilityCategory
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.MergedModelPackageImpl#getVariabilityCategory()
	 * @generated
	 */
	int VARIABILITY_CATEGORY = 2;


	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel <em>Family Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family Model</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel
	 * @generated
	 */
	EClass getFamilyModel();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getSourceVariant <em>Source Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Variant</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getSourceVariant()
	 * @see #getFamilyModel()
	 * @generated
	 */
	EReference getFamilyModel_SourceVariant();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getTargetVariant <em>Target Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Variant</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getTargetVariant()
	 * @see #getFamilyModel()
	 * @generated
	 */
	EReference getFamilyModel_TargetVariant();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metric</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getMetric()
	 * @see #getFamilyModel()
	 * @generated
	 */
	EReference getFamilyModel_Metric();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getComparedElements <em>Compared Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compared Elements</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getComparedElements()
	 * @see #getFamilyModel()
	 * @generated
	 */
	EReference getFamilyModel_ComparedElements();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison <em>Element Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Comparison</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison
	 * @generated
	 */
	EClass getElementComparison();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Element</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getSourceElement()
	 * @see #getElementComparison()
	 * @generated
	 */
	EReference getElementComparison_SourceElement();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Element</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getTargetElement()
	 * @see #getElementComparison()
	 * @generated
	 */
	EReference getElementComparison_TargetElement();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getSimilarity <em>Similarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Similarity</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getSimilarity()
	 * @see #getElementComparison()
	 * @generated
	 */
	EAttribute getElementComparison_Similarity();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getSubElements <em>Sub Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Elements</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getSubElements()
	 * @see #getElementComparison()
	 * @generated
	 */
	EReference getElementComparison_SubElements();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getParentElement <em>Parent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Element</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getParentElement()
	 * @see #getElementComparison()
	 * @generated
	 */
	EReference getElementComparison_ParentElement();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getVariability <em>Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variability</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getVariability()
	 * @see #getElementComparison()
	 * @generated
	 */
	EAttribute getElementComparison_Variability();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.VariabilityCategory <em>Variability Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variability Category</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.VariabilityCategory
	 * @generated
	 */
	EEnum getVariabilityCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MergedModelFactory getMergedModelFactory();

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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.FamilyModelImpl <em>Family Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.FamilyModelImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.MergedModelPackageImpl#getFamilyModel()
		 * @generated
		 */
		EClass FAMILY_MODEL = eINSTANCE.getFamilyModel();

		/**
		 * The meta object literal for the '<em><b>Source Variant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_MODEL__SOURCE_VARIANT = eINSTANCE.getFamilyModel_SourceVariant();

		/**
		 * The meta object literal for the '<em><b>Target Variant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_MODEL__TARGET_VARIANT = eINSTANCE.getFamilyModel_TargetVariant();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_MODEL__METRIC = eINSTANCE.getFamilyModel_Metric();

		/**
		 * The meta object literal for the '<em><b>Compared Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY_MODEL__COMPARED_ELEMENTS = eINSTANCE.getFamilyModel_ComparedElements();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.ElementComparisonImpl <em>Element Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.ElementComparisonImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.MergedModelPackageImpl#getElementComparison()
		 * @generated
		 */
		EClass ELEMENT_COMPARISON = eINSTANCE.getElementComparison();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_COMPARISON__SOURCE_ELEMENT = eINSTANCE.getElementComparison_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_COMPARISON__TARGET_ELEMENT = eINSTANCE.getElementComparison_TargetElement();

		/**
		 * The meta object literal for the '<em><b>Similarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_COMPARISON__SIMILARITY = eINSTANCE.getElementComparison_Similarity();

		/**
		 * The meta object literal for the '<em><b>Sub Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_COMPARISON__SUB_ELEMENTS = eINSTANCE.getElementComparison_SubElements();

		/**
		 * The meta object literal for the '<em><b>Parent Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_COMPARISON__PARENT_ELEMENT = eINSTANCE.getElementComparison_ParentElement();

		/**
		 * The meta object literal for the '<em><b>Variability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_COMPARISON__VARIABILITY = eINSTANCE.getElementComparison_Variability();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.VariabilityCategory <em>Variability Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.VariabilityCategory
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.MergedModelPackageImpl#getVariabilityCategory()
		 * @generated
		 */
		EEnum VARIABILITY_CATEGORY = eINSTANCE.getVariabilityCategory();

	}

} //MergedModelPackage
