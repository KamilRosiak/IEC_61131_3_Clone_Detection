/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.VariabilityCategory;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.StructuredTextExpressionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MergedModelPackageImpl extends EPackageImpl implements MergedModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variabilityCategoryEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MergedModelPackageImpl() {
		super(eNS_URI, MergedModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MergedModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MergedModelPackage init() {
		if (isInited) return (MergedModelPackage)EPackage.Registry.INSTANCE.getEPackage(MergedModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMergedModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MergedModelPackageImpl theMergedModelPackage = registeredMergedModelPackage instanceof MergedModelPackageImpl ? (MergedModelPackageImpl)registeredMergedModelPackage : new MergedModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ComparisonMetricPackage.eINSTANCE.eClass();
		ConfigurationPackage.eINSTANCE.eClass();
		LanguageElementPackage.eINSTANCE.eClass();
		StructuredTextExpressionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMergedModelPackage.createPackageContents();

		// Initialize created meta-data
		theMergedModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMergedModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MergedModelPackage.eNS_URI, theMergedModelPackage);
		return theMergedModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFamilyModel() {
		return familyModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFamilyModel_SourceVariant() {
		return (EReference)familyModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFamilyModel_TargetVariant() {
		return (EReference)familyModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFamilyModel_Metric() {
		return (EReference)familyModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFamilyModel_ComparedElements() {
		return (EReference)familyModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementComparison() {
		return elementComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementComparison_SourceElement() {
		return (EReference)elementComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementComparison_TargetElement() {
		return (EReference)elementComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementComparison_Similarity() {
		return (EAttribute)elementComparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementComparison_SubElements() {
		return (EReference)elementComparisonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementComparison_ParentElement() {
		return (EReference)elementComparisonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementComparison_Variability() {
		return (EAttribute)elementComparisonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVariabilityCategory() {
		return variabilityCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergedModelFactory getMergedModelFactory() {
		return (MergedModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		familyModelEClass = createEClass(FAMILY_MODEL);
		createEReference(familyModelEClass, FAMILY_MODEL__SOURCE_VARIANT);
		createEReference(familyModelEClass, FAMILY_MODEL__TARGET_VARIANT);
		createEReference(familyModelEClass, FAMILY_MODEL__METRIC);
		createEReference(familyModelEClass, FAMILY_MODEL__COMPARED_ELEMENTS);

		elementComparisonEClass = createEClass(ELEMENT_COMPARISON);
		createEReference(elementComparisonEClass, ELEMENT_COMPARISON__SOURCE_ELEMENT);
		createEReference(elementComparisonEClass, ELEMENT_COMPARISON__TARGET_ELEMENT);
		createEAttribute(elementComparisonEClass, ELEMENT_COMPARISON__SIMILARITY);
		createEReference(elementComparisonEClass, ELEMENT_COMPARISON__SUB_ELEMENTS);
		createEReference(elementComparisonEClass, ELEMENT_COMPARISON__PARENT_ELEMENT);
		createEAttribute(elementComparisonEClass, ELEMENT_COMPARISON__VARIABILITY);

		// Create enums
		variabilityCategoryEEnum = createEEnum(VARIABILITY_CATEGORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);
		ComparisonMetricPackage theComparisonMetricPackage = (ComparisonMetricPackage)EPackage.Registry.INSTANCE.getEPackage(ComparisonMetricPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(familyModelEClass, FamilyModel.class, "FamilyModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFamilyModel_SourceVariant(), theConfigurationPackage.getConfiguration(), null, "sourceVariant", null, 1, 1, FamilyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamilyModel_TargetVariant(), theConfigurationPackage.getConfiguration(), null, "targetVariant", null, 1, 1, FamilyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamilyModel_Metric(), theComparisonMetricPackage.getMetric(), null, "metric", null, 1, 1, FamilyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamilyModel_ComparedElements(), this.getElementComparison(), null, "comparedElements", null, 1, -1, FamilyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementComparisonEClass, ElementComparison.class, "ElementComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementComparison_SourceElement(), ecorePackage.getEObject(), null, "sourceElement", null, 1, 1, ElementComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementComparison_TargetElement(), ecorePackage.getEObject(), null, "targetElement", null, 1, 1, ElementComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementComparison_Similarity(), ecorePackage.getEFloat(), "similarity", "-1", 1, 1, ElementComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementComparison_SubElements(), this.getElementComparison(), null, "subElements", null, 0, -1, ElementComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementComparison_ParentElement(), this.getElementComparison(), null, "parentElement", null, 0, 1, ElementComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementComparison_Variability(), this.getVariabilityCategory(), "variability", "UNDEFINED", 0, 1, ElementComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(variabilityCategoryEEnum, VariabilityCategory.class, "VariabilityCategory");
		addEEnumLiteral(variabilityCategoryEEnum, VariabilityCategory.MANDATORY);
		addEEnumLiteral(variabilityCategoryEEnum, VariabilityCategory.ALTERNATIVE);
		addEEnumLiteral(variabilityCategoryEEnum, VariabilityCategory.OPTIONAL);
		addEEnumLiteral(variabilityCategoryEEnum, VariabilityCategory.UNDEFINED);

		// Create resource
		createResource(eNS_URI);
	}

} //MergedModelPackageImpl
