/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonTarget;
import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric;

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
public class ComparisonMetricPackageImpl extends EPackageImpl implements ComparisonMetricPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonTargetEEnum = null;

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
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComparisonMetricPackageImpl() {
		super(eNS_URI, ComparisonMetricFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComparisonMetricPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComparisonMetricPackage init() {
		if (isInited) return (ComparisonMetricPackage)EPackage.Registry.INSTANCE.getEPackage(ComparisonMetricPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComparisonMetricPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComparisonMetricPackageImpl theComparisonMetricPackage = registeredComparisonMetricPackage instanceof ComparisonMetricPackageImpl ? (ComparisonMetricPackageImpl)registeredComparisonMetricPackage : new ComparisonMetricPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theComparisonMetricPackage.createPackageContents();

		// Initialize created meta-data
		theComparisonMetricPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComparisonMetricPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComparisonMetricPackage.eNS_URI, theComparisonMetricPackage);
		return theComparisonMetricPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Name() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Description() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_IsWeighted() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetric_Comparisonattribute() {
		return (EReference)metricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonAttribute() {
		return comparisonAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonAttribute_Label() {
		return (EAttribute)comparisonAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonAttribute_Description() {
		return (EAttribute)comparisonAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonAttribute_Weight() {
		return (EAttribute)comparisonAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonAttribute_IsOption() {
		return (EAttribute)comparisonAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparisonAttribute_ChildAttributes() {
		return (EReference)comparisonAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparisonAttribute_ParentAttribute() {
		return (EReference)comparisonAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonAttribute_TargetType() {
		return (EAttribute)comparisonAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonTarget() {
		return comparisonTargetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonMetricFactory getComparisonMetricFactory() {
		return (ComparisonMetricFactory)getEFactoryInstance();
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
		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__NAME);
		createEAttribute(metricEClass, METRIC__DESCRIPTION);
		createEAttribute(metricEClass, METRIC__IS_WEIGHTED);
		createEReference(metricEClass, METRIC__COMPARISONATTRIBUTE);

		comparisonAttributeEClass = createEClass(COMPARISON_ATTRIBUTE);
		createEAttribute(comparisonAttributeEClass, COMPARISON_ATTRIBUTE__LABEL);
		createEAttribute(comparisonAttributeEClass, COMPARISON_ATTRIBUTE__DESCRIPTION);
		createEAttribute(comparisonAttributeEClass, COMPARISON_ATTRIBUTE__WEIGHT);
		createEAttribute(comparisonAttributeEClass, COMPARISON_ATTRIBUTE__IS_OPTION);
		createEReference(comparisonAttributeEClass, COMPARISON_ATTRIBUTE__CHILD_ATTRIBUTES);
		createEReference(comparisonAttributeEClass, COMPARISON_ATTRIBUTE__PARENT_ATTRIBUTE);
		createEAttribute(comparisonAttributeEClass, COMPARISON_ATTRIBUTE__TARGET_TYPE);

		// Create enums
		comparisonTargetEEnum = createEEnum(COMPARISON_TARGET);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Description(), ecorePackage.getEString(), "description", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_IsWeighted(), ecorePackage.getEBoolean(), "isWeighted", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetric_Comparisonattribute(), this.getComparisonAttribute(), null, "comparisonattribute", null, 0, -1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonAttributeEClass, ComparisonAttribute.class, "ComparisonAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonAttribute_Label(), ecorePackage.getEString(), "label", null, 0, 1, ComparisonAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonAttribute_Description(), ecorePackage.getEString(), "description", null, 0, 1, ComparisonAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonAttribute_Weight(), ecorePackage.getEFloatObject(), "weight", "0", 0, 1, ComparisonAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonAttribute_IsOption(), ecorePackage.getEBoolean(), "isOption", null, 0, 1, ComparisonAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparisonAttribute_ChildAttributes(), this.getComparisonAttribute(), null, "childAttributes", null, 0, -1, ComparisonAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparisonAttribute_ParentAttribute(), this.getComparisonAttribute(), null, "parentAttribute", null, 0, 1, ComparisonAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonAttribute_TargetType(), this.getComparisonTarget(), "targetType", null, 0, 1, ComparisonAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparisonTargetEEnum, ComparisonTarget.class, "ComparisonTarget");
		addEEnumLiteral(comparisonTargetEEnum, ComparisonTarget.VARIANT);
		addEEnumLiteral(comparisonTargetEEnum, ComparisonTarget.POU);
		addEEnumLiteral(comparisonTargetEEnum, ComparisonTarget.ACTION);
		addEEnumLiteral(comparisonTargetEEnum, ComparisonTarget.VARIABLE);
		addEEnumLiteral(comparisonTargetEEnum, ComparisonTarget.STRUCTURED_TEXT);
		addEEnumLiteral(comparisonTargetEEnum, ComparisonTarget.SEQUENTIAL_FUNCTION_CHART);
		addEEnumLiteral(comparisonTargetEEnum, ComparisonTarget.LADDER_DIAGRAM);
		addEEnumLiteral(comparisonTargetEEnum, ComparisonTarget.INSTRUCTION_LIST);
		addEEnumLiteral(comparisonTargetEEnum, ComparisonTarget.FUNCTION_BLOCK_DIAGRAM);

		// Create resource
		createResource(eNS_URI);
	}

} //ComparisonMetricPackageImpl
