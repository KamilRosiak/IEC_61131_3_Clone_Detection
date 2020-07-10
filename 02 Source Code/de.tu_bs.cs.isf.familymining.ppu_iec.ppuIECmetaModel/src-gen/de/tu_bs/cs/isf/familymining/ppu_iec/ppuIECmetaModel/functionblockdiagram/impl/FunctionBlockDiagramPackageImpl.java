/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.ExecutionBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElementType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDJump;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlockOperation;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionOperation;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage;

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
public class FunctionBlockDiagramPackageImpl extends EPackageImpl implements FunctionBlockDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fbdElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fbdpouEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardFunctionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fbdJumpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fbdElementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum standardFunctionOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum standardFunctionBlockOperationEEnum = null;

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
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FunctionBlockDiagramPackageImpl() {
		super(eNS_URI, FunctionBlockDiagramFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FunctionBlockDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FunctionBlockDiagramPackage init() {
		if (isInited) return (FunctionBlockDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionBlockDiagramPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFunctionBlockDiagramPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FunctionBlockDiagramPackageImpl theFunctionBlockDiagramPackage = registeredFunctionBlockDiagramPackage instanceof FunctionBlockDiagramPackageImpl ? (FunctionBlockDiagramPackageImpl)registeredFunctionBlockDiagramPackage : new FunctionBlockDiagramPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ConfigurationPackage.eINSTANCE.eClass();
		DiagramPackage.eINSTANCE.eClass();
		LanguageElementPackage.eINSTANCE.eClass();
		StructuredTextPackage.eINSTANCE.eClass();
		StructuredTextExpressionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFunctionBlockDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theFunctionBlockDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFunctionBlockDiagramPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FunctionBlockDiagramPackage.eNS_URI, theFunctionBlockDiagramPackage);
		return theFunctionBlockDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFBDElement() {
		return fbdElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFBDElement_FBDElementType() {
		return (EAttribute)fbdElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFBDElement_Name() {
		return (EAttribute)fbdElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFBDPOU() {
		return fbdpouEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFBDPOU_RefPOU() {
		return (EReference)fbdpouEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandardFunction() {
		return standardFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardFunction_FunctionOperation() {
		return (EAttribute)standardFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandardFunctionBlock() {
		return standardFunctionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardFunctionBlock_FunctionBlockOperation() {
		return (EAttribute)standardFunctionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionBlock() {
		return executionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutionBlock_ExecutionStatements() {
		return (EReference)executionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFBDJump() {
		return fbdJumpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFBDElementType() {
		return fbdElementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStandardFunctionOperation() {
		return standardFunctionOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStandardFunctionBlockOperation() {
		return standardFunctionBlockOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionBlockDiagramFactory getFunctionBlockDiagramFactory() {
		return (FunctionBlockDiagramFactory)getEFactoryInstance();
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
		fbdElementEClass = createEClass(FBD_ELEMENT);
		createEAttribute(fbdElementEClass, FBD_ELEMENT__FBD_ELEMENT_TYPE);
		createEAttribute(fbdElementEClass, FBD_ELEMENT__NAME);

		fbdpouEClass = createEClass(FBDPOU);
		createEReference(fbdpouEClass, FBDPOU__REF_POU);

		standardFunctionEClass = createEClass(STANDARD_FUNCTION);
		createEAttribute(standardFunctionEClass, STANDARD_FUNCTION__FUNCTION_OPERATION);

		standardFunctionBlockEClass = createEClass(STANDARD_FUNCTION_BLOCK);
		createEAttribute(standardFunctionBlockEClass, STANDARD_FUNCTION_BLOCK__FUNCTION_BLOCK_OPERATION);

		executionBlockEClass = createEClass(EXECUTION_BLOCK);
		createEReference(executionBlockEClass, EXECUTION_BLOCK__EXECUTION_STATEMENTS);

		fbdJumpEClass = createEClass(FBD_JUMP);

		// Create enums
		fbdElementTypeEEnum = createEEnum(FBD_ELEMENT_TYPE);
		standardFunctionOperationEEnum = createEEnum(STANDARD_FUNCTION_OPERATION);
		standardFunctionBlockOperationEEnum = createEEnum(STANDARD_FUNCTION_BLOCK_OPERATION);
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
		StructuredTextPackage theStructuredTextPackage = (StructuredTextPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredTextPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fbdElementEClass.getESuperTypes().add(theDiagramPackage.getDiagramElement());
		fbdpouEClass.getESuperTypes().add(this.getFBDElement());
		standardFunctionEClass.getESuperTypes().add(this.getFBDElement());
		standardFunctionBlockEClass.getESuperTypes().add(this.getFBDElement());
		executionBlockEClass.getESuperTypes().add(this.getFBDElement());
		fbdJumpEClass.getESuperTypes().add(theDiagramPackage.getJump());
		fbdJumpEClass.getESuperTypes().add(this.getFBDElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(fbdElementEClass, FBDElement.class, "FBDElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFBDElement_FBDElementType(), this.getFBDElementType(), "FBDElementType", "UNDEFINED", 0, 1, FBDElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFBDElement_Name(), ecorePackage.getEString(), "name", "", 1, 1, FBDElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fbdpouEClass, de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDPOU.class, "FBDPOU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFBDPOU_RefPOU(), theConfigurationPackage.getPOU(), null, "refPOU", null, 1, 1, de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDPOU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardFunctionEClass, StandardFunction.class, "StandardFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardFunction_FunctionOperation(), this.getStandardFunctionOperation(), "functionOperation", "UNSET", 1, 1, StandardFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardFunctionBlockEClass, StandardFunctionBlock.class, "StandardFunctionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardFunctionBlock_FunctionBlockOperation(), this.getStandardFunctionBlockOperation(), "functionBlockOperation", null, 1, 1, StandardFunctionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionBlockEClass, ExecutionBlock.class, "ExecutionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionBlock_ExecutionStatements(), theStructuredTextPackage.getStructuredText(), null, "executionStatements", null, 0, 1, ExecutionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fbdJumpEClass, FBDJump.class, "FBDJump", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(fbdElementTypeEEnum, FBDElementType.class, "FBDElementType");
		addEEnumLiteral(fbdElementTypeEEnum, FBDElementType.UNDEFINED);
		addEEnumLiteral(fbdElementTypeEEnum, FBDElementType.FBD_POU);
		addEEnumLiteral(fbdElementTypeEEnum, FBDElementType.STANDARD_FUNCTION);
		addEEnumLiteral(fbdElementTypeEEnum, FBDElementType.STANDARD_FUNCTION_BLOCK);
		addEEnumLiteral(fbdElementTypeEEnum, FBDElementType.EXECUTION_BLOCK);

		initEEnum(standardFunctionOperationEEnum, StandardFunctionOperation.class, "StandardFunctionOperation");
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.UNSET);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.TYPECHANGE_TO);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.TRUNC);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.BCD_TO);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.TO_BCD);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.DT_TO);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.TOD_TO);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.DATE_TO);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.TO_BOOL);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.BOOL_TO);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.STRING_TO);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.TO_STRING);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.TIME_TO);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.ABS);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.SQRT);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.LN);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.LOG);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.EXP);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.SIN);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.COS);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.TAN);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.ASIN);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.ACOS);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.ATAN);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.ADD);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.MUL);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.SUB);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.DIV);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.MOD);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.EXPT);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.MOVE);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.SHL);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.SHR);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.ROR);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.ROL);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.AND);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.OR);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.XOR);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.NOT);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.SEL);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.MAX);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.MIN);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.LIMIT);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.MUX);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.GT);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.GE);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.EQ);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.LT);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.LE);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.NE);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.LEN);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.LEFT);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.RIGHT);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.MID);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.CONCAT);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.INSERT);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.DELETE);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.REPLACE);
		addEEnumLiteral(standardFunctionOperationEEnum, StandardFunctionOperation.FIND);

		initEEnum(standardFunctionBlockOperationEEnum, StandardFunctionBlockOperation.class, "StandardFunctionBlockOperation");
		addEEnumLiteral(standardFunctionBlockOperationEEnum, StandardFunctionBlockOperation.UNSET);
		addEEnumLiteral(standardFunctionBlockOperationEEnum, StandardFunctionBlockOperation.SR);
		addEEnumLiteral(standardFunctionBlockOperationEEnum, StandardFunctionBlockOperation.RS);
		addEEnumLiteral(standardFunctionBlockOperationEEnum, StandardFunctionBlockOperation.RTRIG);
		addEEnumLiteral(standardFunctionBlockOperationEEnum, StandardFunctionBlockOperation.FTRIG);
		addEEnumLiteral(standardFunctionBlockOperationEEnum, StandardFunctionBlockOperation.CTU);
		addEEnumLiteral(standardFunctionBlockOperationEEnum, StandardFunctionBlockOperation.CTD);
		addEEnumLiteral(standardFunctionBlockOperationEEnum, StandardFunctionBlockOperation.CTUD);
		addEEnumLiteral(standardFunctionBlockOperationEEnum, StandardFunctionBlockOperation.TP);
		addEEnumLiteral(standardFunctionBlockOperationEEnum, StandardFunctionBlockOperation.TON);
		addEEnumLiteral(standardFunctionBlockOperationEEnum, StandardFunctionBlockOperation.TOF);

		// Create resource
		createResource(eNS_URI);
	}

} //FunctionBlockDiagramPackageImpl
