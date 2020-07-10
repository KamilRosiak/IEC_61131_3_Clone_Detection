/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.AccessPath;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.AccessType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ArrayVariable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Declaration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Location;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.OrganizationType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Resource;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Standard_Operator;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Struct;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Task;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.VariableDeclaration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.VariableLocationDataType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.VariableLocationType;

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
public class ConfigurationPackageImpl extends EPackageImpl implements ConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pouEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableDeclarationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableLocationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableLocationDataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum standard_OperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum organizationTypeEEnum = null;

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
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationPackageImpl() {
		super(eNS_URI, ConfigurationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationPackage init() {
		if (isInited) return (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConfigurationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConfigurationPackageImpl theConfigurationPackage = registeredConfigurationPackage instanceof ConfigurationPackageImpl ? (ConfigurationPackageImpl)registeredConfigurationPackage : new ConfigurationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		LanguageElementPackage.eINSTANCE.eClass();
		StructuredTextExpressionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigurationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationPackage.eNS_URI, theConfigurationPackage);
		return theConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Resources() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Accesspaths() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_GlobalVariables() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguration_Identifier() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_GlobalVariables() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Pous() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Tasks() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Types() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Scope() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_Location() {
		return (EReference)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_TypeName() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Array() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_InitialValue() {
		return (EReference)variableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessPath() {
		return accessPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessPath_Path() {
		return (EAttribute)accessPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessPath_Type() {
		return (EAttribute)accessPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPOU() {
		return pouEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPOU_ControlTasks() {
		return (EReference)pouEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPOU_Declaration() {
		return (EReference)pouEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPOU_Callees() {
		return (EReference)pouEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPOU_Callers() {
		return (EReference)pouEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPOU_Implementations() {
		return (EReference)pouEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPOU_Identifier() {
		return (EAttribute)pouEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPOU_ReturnType() {
		return (EAttribute)pouEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPOU_Type() {
		return (EAttribute)pouEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPOU_Actions() {
		return (EReference)pouEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_ControlledPrograms() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Type() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_DataType() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclaration_InputVariables() {
		return (EReference)declarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclaration_Comment() {
		return (EReference)declarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclaration_InOutVariables() {
		return (EReference)declarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclaration_InternalVariables() {
		return (EReference)declarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclaration_OutputVariables() {
		return (EReference)declarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclaration_Types() {
		return (EReference)declarationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Name() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_Implementation() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStruct() {
		return structEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStruct_Name() {
		return (EAttribute)structEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStruct_Variables() {
		return (EReference)structEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayVariable() {
		return arrayVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayVariable_LowerBound() {
		return (EReference)arrayVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayVariable_UpperBound() {
		return (EReference)arrayVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVariableDeclaration() {
		return variableDeclarationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAccessType() {
		return accessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVariableLocationType() {
		return variableLocationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVariableLocationDataType() {
		return variableLocationDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStandard_Operator() {
		return standard_OperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrganizationType() {
		return organizationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationFactory getConfigurationFactory() {
		return (ConfigurationFactory)getEFactoryInstance();
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
		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__RESOURCES);
		createEReference(configurationEClass, CONFIGURATION__ACCESSPATHS);
		createEReference(configurationEClass, CONFIGURATION__GLOBAL_VARIABLES);
		createEAttribute(configurationEClass, CONFIGURATION__IDENTIFIER);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NAME);
		createEReference(resourceEClass, RESOURCE__GLOBAL_VARIABLES);
		createEReference(resourceEClass, RESOURCE__POUS);
		createEReference(resourceEClass, RESOURCE__TASKS);
		createEReference(resourceEClass, RESOURCE__TYPES);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__SCOPE);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEReference(variableEClass, VARIABLE__LOCATION);
		createEAttribute(variableEClass, VARIABLE__TYPE_NAME);
		createEAttribute(variableEClass, VARIABLE__ARRAY);
		createEReference(variableEClass, VARIABLE__INITIAL_VALUE);

		accessPathEClass = createEClass(ACCESS_PATH);
		createEAttribute(accessPathEClass, ACCESS_PATH__PATH);
		createEAttribute(accessPathEClass, ACCESS_PATH__TYPE);

		pouEClass = createEClass(POU);
		createEReference(pouEClass, POU__CONTROL_TASKS);
		createEReference(pouEClass, POU__DECLARATION);
		createEReference(pouEClass, POU__CALLEES);
		createEReference(pouEClass, POU__CALLERS);
		createEReference(pouEClass, POU__IMPLEMENTATIONS);
		createEAttribute(pouEClass, POU__IDENTIFIER);
		createEAttribute(pouEClass, POU__RETURN_TYPE);
		createEAttribute(pouEClass, POU__TYPE);
		createEReference(pouEClass, POU__ACTIONS);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEReference(taskEClass, TASK__CONTROLLED_PROGRAMS);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__TYPE);
		createEAttribute(locationEClass, LOCATION__DATA_TYPE);

		declarationEClass = createEClass(DECLARATION);
		createEReference(declarationEClass, DECLARATION__INPUT_VARIABLES);
		createEReference(declarationEClass, DECLARATION__COMMENT);
		createEReference(declarationEClass, DECLARATION__IN_OUT_VARIABLES);
		createEReference(declarationEClass, DECLARATION__INTERNAL_VARIABLES);
		createEReference(declarationEClass, DECLARATION__OUTPUT_VARIABLES);
		createEReference(declarationEClass, DECLARATION__TYPES);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NAME);
		createEReference(actionEClass, ACTION__IMPLEMENTATION);

		structEClass = createEClass(STRUCT);
		createEAttribute(structEClass, STRUCT__NAME);
		createEReference(structEClass, STRUCT__VARIABLES);

		arrayVariableEClass = createEClass(ARRAY_VARIABLE);
		createEReference(arrayVariableEClass, ARRAY_VARIABLE__LOWER_BOUND);
		createEReference(arrayVariableEClass, ARRAY_VARIABLE__UPPER_BOUND);

		// Create enums
		variableDeclarationEEnum = createEEnum(VARIABLE_DECLARATION);
		accessTypeEEnum = createEEnum(ACCESS_TYPE);
		variableLocationTypeEEnum = createEEnum(VARIABLE_LOCATION_TYPE);
		variableLocationDataTypeEEnum = createEEnum(VARIABLE_LOCATION_DATA_TYPE);
		standard_OperatorEEnum = createEEnum(STANDARD_OPERATOR);
		organizationTypeEEnum = createEEnum(ORGANIZATION_TYPE);
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
		StructuredTextExpressionPackage theStructuredTextExpressionPackage = (StructuredTextExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredTextExpressionPackage.eNS_URI);
		LanguageElementPackage theLanguageElementPackage = (LanguageElementPackage)EPackage.Registry.INSTANCE.getEPackage(LanguageElementPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arrayVariableEClass.getESuperTypes().add(this.getVariable());

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Resources(), this.getResource(), null, "resources", null, 1, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Accesspaths(), this.getAccessPath(), null, "accesspaths", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_GlobalVariables(), this.getVariable(), null, "globalVariables", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_GlobalVariables(), this.getVariable(), null, "globalVariables", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Pous(), this.getPOU(), null, "pous", null, 1, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Types(), this.getStruct(), null, "types", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Scope(), this.getVariableDeclaration(), "scope", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), theStructuredTextExpressionPackage.getElementaryDataType(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Location(), this.getLocation(), null, "location", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_TypeName(), ecorePackage.getEString(), "typeName", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Array(), ecorePackage.getEBoolean(), "array", "false", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_InitialValue(), theStructuredTextExpressionPackage.getExpression(), null, "initialValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessPathEClass, AccessPath.class, "AccessPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessPath_Path(), ecorePackage.getEString(), "path", null, 0, 1, AccessPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessPath_Type(), this.getAccessType(), "type", null, 0, 1, AccessPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pouEClass, de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU.class, "POU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPOU_ControlTasks(), this.getTask(), this.getTask_ControlledPrograms(), "controlTasks", null, 0, -1, de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOU_Declaration(), this.getDeclaration(), null, "declaration", null, 1, 1, de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOU_Callees(), this.getPOU(), null, "callees", null, 0, -1, de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOU_Callers(), this.getPOU(), null, "callers", null, 0, -1, de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOU_Implementations(), theLanguageElementPackage.getLanguageElement(), null, "implementations", null, 0, -1, de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPOU_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPOU_ReturnType(), theStructuredTextExpressionPackage.getElementaryDataType(), "returnType", null, 0, 1, de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPOU_Type(), this.getOrganizationType(), "type", null, 1, 1, de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOU_Actions(), this.getAction(), null, "actions", null, 0, -1, de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ControlledPrograms(), this.getPOU(), this.getPOU_ControlTasks(), "controlledPrograms", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Type(), this.getVariableLocationType(), "type", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_DataType(), this.getVariableLocationDataType(), "dataType", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclaration_InputVariables(), this.getVariable(), null, "inputVariables", null, 0, -1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaration_Comment(), theLanguageElementPackage.getComment(), null, "comment", null, 0, -1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaration_InOutVariables(), this.getVariable(), null, "inOutVariables", null, 0, -1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaration_InternalVariables(), this.getVariable(), null, "internalVariables", null, 0, -1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaration_OutputVariables(), this.getVariable(), null, "outputVariables", null, 0, -1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaration_Types(), this.getStruct(), null, "types", null, 0, -1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Implementation(), theLanguageElementPackage.getLanguageElement(), null, "implementation", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structEClass, Struct.class, "Struct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStruct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStruct_Variables(), this.getVariable(), null, "variables", null, 1, -1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayVariableEClass, ArrayVariable.class, "ArrayVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayVariable_LowerBound(), theStructuredTextExpressionPackage.getExpression(), null, "lowerBound", null, 1, 1, ArrayVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayVariable_UpperBound(), theStructuredTextExpressionPackage.getExpression(), null, "upperBound", null, 1, 1, ArrayVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(variableDeclarationEEnum, VariableDeclaration.class, "VariableDeclaration");
		addEEnumLiteral(variableDeclarationEEnum, VariableDeclaration.UNSET);
		addEEnumLiteral(variableDeclarationEEnum, VariableDeclaration.VAR);
		addEEnumLiteral(variableDeclarationEEnum, VariableDeclaration.VAR_EXTERNAL);
		addEEnumLiteral(variableDeclarationEEnum, VariableDeclaration.VAR_TEMP);
		addEEnumLiteral(variableDeclarationEEnum, VariableDeclaration.VAR_INPUT);
		addEEnumLiteral(variableDeclarationEEnum, VariableDeclaration.VAR_OUTPUT);
		addEEnumLiteral(variableDeclarationEEnum, VariableDeclaration.VAR_IN_OUT);
		addEEnumLiteral(variableDeclarationEEnum, VariableDeclaration.VAR_ACCESS);
		addEEnumLiteral(variableDeclarationEEnum, VariableDeclaration.VAR_GLOBAL);
		addEEnumLiteral(variableDeclarationEEnum, VariableDeclaration.VAR_CONFIG);
		addEEnumLiteral(variableDeclarationEEnum, VariableDeclaration.RETAIN);
		addEEnumLiteral(variableDeclarationEEnum, VariableDeclaration.NON_RETAIN);
		addEEnumLiteral(variableDeclarationEEnum, VariableDeclaration.CONSTANT);
		addEEnumLiteral(variableDeclarationEEnum, VariableDeclaration.AT);

		initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
		addEEnumLiteral(accessTypeEEnum, AccessType.UNSET);
		addEEnumLiteral(accessTypeEEnum, AccessType.PUBLIC);
		addEEnumLiteral(accessTypeEEnum, AccessType.PRIVATE);
		addEEnumLiteral(accessTypeEEnum, AccessType.INTERNAL);
		addEEnumLiteral(accessTypeEEnum, AccessType.PROTECTED);

		initEEnum(variableLocationTypeEEnum, VariableLocationType.class, "VariableLocationType");
		addEEnumLiteral(variableLocationTypeEEnum, VariableLocationType.UNSET);
		addEEnumLiteral(variableLocationTypeEEnum, VariableLocationType.Q);
		addEEnumLiteral(variableLocationTypeEEnum, VariableLocationType.M);
		addEEnumLiteral(variableLocationTypeEEnum, VariableLocationType.I);

		initEEnum(variableLocationDataTypeEEnum, VariableLocationDataType.class, "VariableLocationDataType");
		addEEnumLiteral(variableLocationDataTypeEEnum, VariableLocationDataType.UNSET);
		addEEnumLiteral(variableLocationDataTypeEEnum, VariableLocationDataType.X);
		addEEnumLiteral(variableLocationDataTypeEEnum, VariableLocationDataType.UNSPECIFIED);
		addEEnumLiteral(variableLocationDataTypeEEnum, VariableLocationDataType.B);
		addEEnumLiteral(variableLocationDataTypeEEnum, VariableLocationDataType.W);
		addEEnumLiteral(variableLocationDataTypeEEnum, VariableLocationDataType.D);
		addEEnumLiteral(variableLocationDataTypeEEnum, VariableLocationDataType.L);

		initEEnum(standard_OperatorEEnum, Standard_Operator.class, "Standard_Operator");
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.UNSET);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.LD);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.ST);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.S);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.R);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.AND);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.OR);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.XOR);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.ADD);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.SUB);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.MUL);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.DIV);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.GT);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.GE);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.EQ);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.NE);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.LE);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.LT);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.JMP);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.CAL);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.RET);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.BRACKET_CLOSE);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.SHL);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.INC);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.MIN);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.MAX);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.MUX);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.LIMIT);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.LEN);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.LEFT);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.RIGHT);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.MID);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.CONCAT);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.INSERT);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.DELETE);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.REPLACE);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.FIND);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.MOD);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.SIN);
		addEEnumLiteral(standard_OperatorEEnum, Standard_Operator.COS);

		initEEnum(organizationTypeEEnum, OrganizationType.class, "OrganizationType");
		addEEnumLiteral(organizationTypeEEnum, OrganizationType.PROGRAM);
		addEEnumLiteral(organizationTypeEEnum, OrganizationType.FUNCTION);
		addEEnumLiteral(organizationTypeEEnum, OrganizationType.FUNCTIONBLOCK);

		// Create resource
		createResource(eNS_URI);
	}

} //ConfigurationPackageImpl
