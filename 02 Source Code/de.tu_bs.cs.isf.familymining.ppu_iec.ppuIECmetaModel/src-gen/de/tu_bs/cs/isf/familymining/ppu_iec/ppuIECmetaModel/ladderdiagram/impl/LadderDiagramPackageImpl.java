/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.AbstractLadderPou;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.AbstractTransitElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LDJump;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementStatus;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderNetwork;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage;

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
public class LadderDiagramPackageImpl extends EPackageImpl implements LadderDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTransitElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractLadderPouEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass llElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ladderNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ldJumpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum llElementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum llElementStatusEEnum = null;

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
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LadderDiagramPackageImpl() {
		super(eNS_URI, LadderDiagramFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LadderDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LadderDiagramPackage init() {
		if (isInited) return (LadderDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(LadderDiagramPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLadderDiagramPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LadderDiagramPackageImpl theLadderDiagramPackage = registeredLadderDiagramPackage instanceof LadderDiagramPackageImpl ? (LadderDiagramPackageImpl)registeredLadderDiagramPackage : new LadderDiagramPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DiagramPackage.eINSTANCE.eClass();
		LanguageElementPackage.eINSTANCE.eClass();
		ConfigurationPackage.eINSTANCE.eClass();
		StructuredTextExpressionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLadderDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theLadderDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLadderDiagramPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LadderDiagramPackage.eNS_URI, theLadderDiagramPackage);
		return theLadderDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTransitElement() {
		return abstractTransitElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractTransitElement_TransitElementType() {
		return (EAttribute)abstractTransitElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractLadderPou() {
		return abstractLadderPouEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLLElement() {
		return llElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLLElement_Status() {
		return (EAttribute)llElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLLElement_LabeledVariable() {
		return (EReference)llElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLadderNetwork() {
		return ladderNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLadderNetwork_LeftPowerRail() {
		return (EReference)ladderNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLadderNetwork_RightPowerRail() {
		return (EReference)ladderNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLDJump() {
		return ldJumpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLLElementType() {
		return llElementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLLElementStatus() {
		return llElementStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LadderDiagramFactory getLadderDiagramFactory() {
		return (LadderDiagramFactory)getEFactoryInstance();
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
		abstractTransitElementEClass = createEClass(ABSTRACT_TRANSIT_ELEMENT);
		createEAttribute(abstractTransitElementEClass, ABSTRACT_TRANSIT_ELEMENT__TRANSIT_ELEMENT_TYPE);

		abstractLadderPouEClass = createEClass(ABSTRACT_LADDER_POU);

		llElementEClass = createEClass(LL_ELEMENT);
		createEAttribute(llElementEClass, LL_ELEMENT__STATUS);
		createEReference(llElementEClass, LL_ELEMENT__LABELED_VARIABLE);

		ladderNetworkEClass = createEClass(LADDER_NETWORK);
		createEReference(ladderNetworkEClass, LADDER_NETWORK__LEFT_POWER_RAIL);
		createEReference(ladderNetworkEClass, LADDER_NETWORK__RIGHT_POWER_RAIL);

		ldJumpEClass = createEClass(LD_JUMP);

		// Create enums
		llElementTypeEEnum = createEEnum(LL_ELEMENT_TYPE);
		llElementStatusEEnum = createEEnum(LL_ELEMENT_STATUS);
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
		DiagramPackage theDiagramPackage = (DiagramPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramPackage.eNS_URI);
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);
		StructuredTextExpressionPackage theStructuredTextExpressionPackage = (StructuredTextExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredTextExpressionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractTransitElementEClass.getESuperTypes().add(theDiagramPackage.getDiagramElement());
		abstractLadderPouEClass.getESuperTypes().add(theConfigurationPackage.getPOU());
		abstractLadderPouEClass.getESuperTypes().add(this.getAbstractTransitElement());
		llElementEClass.getESuperTypes().add(this.getAbstractTransitElement());
		ladderNetworkEClass.getESuperTypes().add(theDiagramPackage.getNetwork());
		ldJumpEClass.getESuperTypes().add(theDiagramPackage.getJump());
		ldJumpEClass.getESuperTypes().add(this.getLLElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractTransitElementEClass, AbstractTransitElement.class, "AbstractTransitElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTransitElement_TransitElementType(), this.getLLElementType(), "TransitElementType", "UNDEFINED", 0, 1, AbstractTransitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractLadderPouEClass, AbstractLadderPou.class, "AbstractLadderPou", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(llElementEClass, LLElement.class, "LLElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLLElement_Status(), this.getLLElementStatus(), "status", null, 0, 1, LLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLLElement_LabeledVariable(), theStructuredTextExpressionPackage.getVariableExpression(), null, "labeledVariable", null, 0, 1, LLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ladderNetworkEClass, LadderNetwork.class, "LadderNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLadderNetwork_LeftPowerRail(), this.getLLElement(), null, "leftPowerRail", null, 0, 1, LadderNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLadderNetwork_RightPowerRail(), this.getLLElement(), null, "rightPowerRail", null, 0, 1, LadderNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ldJumpEClass, LDJump.class, "LDJump", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(llElementTypeEEnum, LLElementType.class, "LLElementType");
		addEEnumLiteral(llElementTypeEEnum, LLElementType.UNDEFINED);
		addEEnumLiteral(llElementTypeEEnum, LLElementType.LEFT_POWERRAIL);
		addEEnumLiteral(llElementTypeEEnum, LLElementType.CONTACT);
		addEEnumLiteral(llElementTypeEEnum, LLElementType.COIL);
		addEEnumLiteral(llElementTypeEEnum, LLElementType.RIGHT_POWERRAIL);
		addEEnumLiteral(llElementTypeEEnum, LLElementType.JUMP);
		addEEnumLiteral(llElementTypeEEnum, LLElementType.ABSTRACT_POU);
		addEEnumLiteral(llElementTypeEEnum, LLElementType.RETURN);
		addEEnumLiteral(llElementTypeEEnum, LLElementType.STANDARD_ELEMENT);

		initEEnum(llElementStatusEEnum, LLElementStatus.class, "LLElementStatus");
		addEEnumLiteral(llElementStatusEEnum, LLElementStatus.UNDEFINED);
		addEEnumLiteral(llElementStatusEEnum, LLElementStatus.NORMAL_OPEN);
		addEEnumLiteral(llElementStatusEEnum, LLElementStatus.NORMAL_CLOSE);
		addEEnumLiteral(llElementStatusEEnum, LLElementStatus.POSITIVE_TRANSITION);
		addEEnumLiteral(llElementStatusEEnum, LLElementStatus.NEGATIVE_TRANSITION);
		addEEnumLiteral(llElementStatusEEnum, LLElementStatus.SET);
		addEEnumLiteral(llElementStatusEEnum, LLElementStatus.RESET);
		addEEnumLiteral(llElementStatusEEnum, LLElementStatus.NEGATED);
		addEEnumLiteral(llElementStatusEEnum, LLElementStatus.POSITIVE);

		// Create resource
		createResource(eNS_URI);
	}

} //LadderDiagramPackageImpl
