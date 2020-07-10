/**
 */
package instructionlist;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage;

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
 * @see instructionlist.InstructionListFactory
 * @model kind="package"
 * @generated
 */
public interface InstructionListPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instructionlist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ppuIECScenario/IL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstructionListPackage eINSTANCE = instructionlist.impl.InstructionListPackageImpl.init();

	/**
	 * The meta object id for the '{@link instructionlist.impl.InstructionListImpl <em>Instruction List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instructionlist.impl.InstructionListImpl
	 * @see instructionlist.impl.InstructionListPackageImpl#getInstructionList()
	 * @generated
	 */
	int INSTRUCTION_LIST = 0;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_LIST__PARENT_ELEMENT = LanguageElementPackage.LANGUAGE_ELEMENT__PARENT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_LIST__CHILD_ELEMENTS = LanguageElementPackage.LANGUAGE_ELEMENT__CHILD_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_LIST__LABEL = LanguageElementPackage.LANGUAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_LIST__COMMENTS = LanguageElementPackage.LANGUAGE_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_LIST__NAME = LanguageElementPackage.LANGUAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_LIST__NETWORK = LanguageElementPackage.LANGUAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instruction List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_LIST_FEATURE_COUNT = LanguageElementPackage.LANGUAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instruction List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_LIST_OPERATION_COUNT = LanguageElementPackage.LANGUAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instructionlist.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instructionlist.impl.InstructionImpl
	 * @see instructionlist.impl.InstructionListPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__OPERANDS = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Next Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NEXT_INSTRUCTION = 3;

	/**
	 * The feature id for the '<em><b>Prev Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__PREV_INSTRUCTION = 4;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link instructionlist.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instructionlist.impl.OperatorImpl
	 * @see instructionlist.impl.InstructionListPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__MODIFIER = 1;

	/**
	 * The feature id for the '<em><b>Functioncall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__FUNCTIONCALL = 2;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link instructionlist.impl.OperandImpl <em>Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instructionlist.impl.OperandImpl
	 * @see instructionlist.impl.InstructionListPackageImpl#getOperand()
	 * @generated
	 */
	int OPERAND = 3;

	/**
	 * The feature id for the '<em><b>Next Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__NEXT_OPERAND = 0;

	/**
	 * The feature id for the '<em><b>Prev Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__PREV_OPERAND = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link instructionlist.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instructionlist.impl.FunctionCallImpl
	 * @see instructionlist.impl.InstructionListPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 4;

	/**
	 * The feature id for the '<em><b>Control Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__CONTROL_TASKS = ConfigurationPackage.POU__CONTROL_TASKS;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__DECLARATION = ConfigurationPackage.POU__DECLARATION;

	/**
	 * The feature id for the '<em><b>Callees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__CALLEES = ConfigurationPackage.POU__CALLEES;

	/**
	 * The feature id for the '<em><b>Callers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__CALLERS = ConfigurationPackage.POU__CALLERS;

	/**
	 * The feature id for the '<em><b>Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__IMPLEMENTATIONS = ConfigurationPackage.POU__IMPLEMENTATIONS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__IDENTIFIER = ConfigurationPackage.POU__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__RETURN_TYPE = ConfigurationPackage.POU__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__TYPE = ConfigurationPackage.POU__TYPE;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ACTIONS = ConfigurationPackage.POU__ACTIONS;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = ConfigurationPackage.POU_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = ConfigurationPackage.POU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instructionlist.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instructionlist.impl.NetworkImpl
	 * @see instructionlist.impl.InstructionListPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 5;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__INSTRUCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link instructionlist.impl.JumpImpl <em>Jump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instructionlist.impl.JumpImpl
	 * @see instructionlist.impl.InstructionListPackageImpl#getJump()
	 * @generated
	 */
	int JUMP = 6;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__OPERATOR = INSTRUCTION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__OPERANDS = INSTRUCTION__OPERANDS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__LABEL = INSTRUCTION__LABEL;

	/**
	 * The feature id for the '<em><b>Next Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__NEXT_INSTRUCTION = INSTRUCTION__NEXT_INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Prev Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__PREV_INSTRUCTION = INSTRUCTION__PREV_INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Target Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__TARGET_NETWORK = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instructionlist.IL_Modifier <em>IL Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instructionlist.IL_Modifier
	 * @see instructionlist.impl.InstructionListPackageImpl#getIL_Modifier()
	 * @generated
	 */
	int IL_MODIFIER = 7;


	/**
	 * Returns the meta object for class '{@link instructionlist.InstructionList <em>Instruction List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction List</em>'.
	 * @see instructionlist.InstructionList
	 * @generated
	 */
	EClass getInstructionList();

	/**
	 * Returns the meta object for the attribute '{@link instructionlist.InstructionList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see instructionlist.InstructionList#getName()
	 * @see #getInstructionList()
	 * @generated
	 */
	EAttribute getInstructionList_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link instructionlist.InstructionList#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network</em>'.
	 * @see instructionlist.InstructionList#getNetwork()
	 * @see #getInstructionList()
	 * @generated
	 */
	EReference getInstructionList_Network();

	/**
	 * Returns the meta object for class '{@link instructionlist.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see instructionlist.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the containment reference '{@link instructionlist.Instruction#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see instructionlist.Instruction#getOperator()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link instructionlist.Instruction#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see instructionlist.Instruction#getOperands()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Operands();

	/**
	 * Returns the meta object for the attribute '{@link instructionlist.Instruction#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see instructionlist.Instruction#getLabel()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Label();

	/**
	 * Returns the meta object for the reference '{@link instructionlist.Instruction#getNextInstruction <em>Next Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Instruction</em>'.
	 * @see instructionlist.Instruction#getNextInstruction()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_NextInstruction();

	/**
	 * Returns the meta object for the reference '{@link instructionlist.Instruction#getPrevInstruction <em>Prev Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prev Instruction</em>'.
	 * @see instructionlist.Instruction#getPrevInstruction()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_PrevInstruction();

	/**
	 * Returns the meta object for class '{@link instructionlist.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see instructionlist.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the attribute '{@link instructionlist.Operator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see instructionlist.Operator#getType()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Type();

	/**
	 * Returns the meta object for the attribute '{@link instructionlist.Operator#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see instructionlist.Operator#getModifier()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Modifier();

	/**
	 * Returns the meta object for the containment reference '{@link instructionlist.Operator#getFunctioncall <em>Functioncall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functioncall</em>'.
	 * @see instructionlist.Operator#getFunctioncall()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Functioncall();

	/**
	 * Returns the meta object for class '{@link instructionlist.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand</em>'.
	 * @see instructionlist.Operand
	 * @generated
	 */
	EClass getOperand();

	/**
	 * Returns the meta object for the reference '{@link instructionlist.Operand#getNextOperand <em>Next Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Operand</em>'.
	 * @see instructionlist.Operand#getNextOperand()
	 * @see #getOperand()
	 * @generated
	 */
	EReference getOperand_NextOperand();

	/**
	 * Returns the meta object for the reference '{@link instructionlist.Operand#getPrevOperand <em>Prev Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prev Operand</em>'.
	 * @see instructionlist.Operand#getPrevOperand()
	 * @see #getOperand()
	 * @generated
	 */
	EReference getOperand_PrevOperand();

	/**
	 * Returns the meta object for the attribute '{@link instructionlist.Operand#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see instructionlist.Operand#getLabel()
	 * @see #getOperand()
	 * @generated
	 */
	EAttribute getOperand_Label();

	/**
	 * Returns the meta object for class '{@link instructionlist.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see instructionlist.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for class '{@link instructionlist.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see instructionlist.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link instructionlist.Network#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see instructionlist.Network#getInstructions()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Instructions();

	/**
	 * Returns the meta object for the attribute '{@link instructionlist.Network#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see instructionlist.Network#getLabel()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Label();

	/**
	 * Returns the meta object for class '{@link instructionlist.Jump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump</em>'.
	 * @see instructionlist.Jump
	 * @generated
	 */
	EClass getJump();

	/**
	 * Returns the meta object for the reference '{@link instructionlist.Jump#getTargetNetwork <em>Target Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Network</em>'.
	 * @see instructionlist.Jump#getTargetNetwork()
	 * @see #getJump()
	 * @generated
	 */
	EReference getJump_TargetNetwork();

	/**
	 * Returns the meta object for enum '{@link instructionlist.IL_Modifier <em>IL Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IL Modifier</em>'.
	 * @see instructionlist.IL_Modifier
	 * @generated
	 */
	EEnum getIL_Modifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstructionListFactory getInstructionListFactory();

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
		 * The meta object literal for the '{@link instructionlist.impl.InstructionListImpl <em>Instruction List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instructionlist.impl.InstructionListImpl
		 * @see instructionlist.impl.InstructionListPackageImpl#getInstructionList()
		 * @generated
		 */
		EClass INSTRUCTION_LIST = eINSTANCE.getInstructionList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_LIST__NAME = eINSTANCE.getInstructionList_Name();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_LIST__NETWORK = eINSTANCE.getInstructionList_Network();

		/**
		 * The meta object literal for the '{@link instructionlist.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instructionlist.impl.InstructionImpl
		 * @see instructionlist.impl.InstructionListPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__OPERATOR = eINSTANCE.getInstruction_Operator();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__OPERANDS = eINSTANCE.getInstruction_Operands();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__LABEL = eINSTANCE.getInstruction_Label();

		/**
		 * The meta object literal for the '<em><b>Next Instruction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__NEXT_INSTRUCTION = eINSTANCE.getInstruction_NextInstruction();

		/**
		 * The meta object literal for the '<em><b>Prev Instruction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__PREV_INSTRUCTION = eINSTANCE.getInstruction_PrevInstruction();

		/**
		 * The meta object literal for the '{@link instructionlist.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instructionlist.impl.OperatorImpl
		 * @see instructionlist.impl.InstructionListPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__TYPE = eINSTANCE.getOperator_Type();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__MODIFIER = eINSTANCE.getOperator_Modifier();

		/**
		 * The meta object literal for the '<em><b>Functioncall</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__FUNCTIONCALL = eINSTANCE.getOperator_Functioncall();

		/**
		 * The meta object literal for the '{@link instructionlist.impl.OperandImpl <em>Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instructionlist.impl.OperandImpl
		 * @see instructionlist.impl.InstructionListPackageImpl#getOperand()
		 * @generated
		 */
		EClass OPERAND = eINSTANCE.getOperand();

		/**
		 * The meta object literal for the '<em><b>Next Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND__NEXT_OPERAND = eINSTANCE.getOperand_NextOperand();

		/**
		 * The meta object literal for the '<em><b>Prev Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND__PREV_OPERAND = eINSTANCE.getOperand_PrevOperand();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERAND__LABEL = eINSTANCE.getOperand_Label();

		/**
		 * The meta object literal for the '{@link instructionlist.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instructionlist.impl.FunctionCallImpl
		 * @see instructionlist.impl.InstructionListPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '{@link instructionlist.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instructionlist.impl.NetworkImpl
		 * @see instructionlist.impl.InstructionListPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__INSTRUCTIONS = eINSTANCE.getNetwork_Instructions();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__LABEL = eINSTANCE.getNetwork_Label();

		/**
		 * The meta object literal for the '{@link instructionlist.impl.JumpImpl <em>Jump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instructionlist.impl.JumpImpl
		 * @see instructionlist.impl.InstructionListPackageImpl#getJump()
		 * @generated
		 */
		EClass JUMP = eINSTANCE.getJump();

		/**
		 * The meta object literal for the '<em><b>Target Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP__TARGET_NETWORK = eINSTANCE.getJump_TargetNetwork();

		/**
		 * The meta object literal for the '{@link instructionlist.IL_Modifier <em>IL Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instructionlist.IL_Modifier
		 * @see instructionlist.impl.InstructionListPackageImpl#getIL_Modifier()
		 * @generated
		 */
		EEnum IL_MODIFIER = eINSTANCE.getIL_Modifier();

	}

} //InstructionListPackage
