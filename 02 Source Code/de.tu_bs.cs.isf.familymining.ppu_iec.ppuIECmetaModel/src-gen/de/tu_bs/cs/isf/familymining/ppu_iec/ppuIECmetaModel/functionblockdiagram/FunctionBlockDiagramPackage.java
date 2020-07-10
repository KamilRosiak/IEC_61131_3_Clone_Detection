/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage;

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
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionBlockDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "functionblockdiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ppuIECScenario/FunctionBlockDiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FBD";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionBlockDiagramPackage eINSTANCE = de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FBDElementImpl <em>FBD Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FBDElementImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getFBDElement()
	 * @generated
	 */
	int FBD_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_ELEMENT__INPUT_PORTS = DiagramPackage.DIAGRAM_ELEMENT__INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_ELEMENT__OUTPUT_PORTS = DiagramPackage.DIAGRAM_ELEMENT__OUTPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_ELEMENT__SOURCE_ELEMENTS = DiagramPackage.DIAGRAM_ELEMENT__SOURCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_ELEMENT__TARGET_ELEMENTS = DiagramPackage.DIAGRAM_ELEMENT__TARGET_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_ELEMENT__LOCAL_ID = DiagramPackage.DIAGRAM_ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_ELEMENT__LEVEL = DiagramPackage.DIAGRAM_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>FBD Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_ELEMENT__FBD_ELEMENT_TYPE = DiagramPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_ELEMENT__NAME = DiagramPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FBD Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_ELEMENT_FEATURE_COUNT = DiagramPackage.DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FBD Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_ELEMENT_OPERATION_COUNT = DiagramPackage.DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FBDPOUImpl <em>FBDPOU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FBDPOUImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getFBDPOU()
	 * @generated
	 */
	int FBDPOU = 1;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBDPOU__INPUT_PORTS = FBD_ELEMENT__INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBDPOU__OUTPUT_PORTS = FBD_ELEMENT__OUTPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBDPOU__SOURCE_ELEMENTS = FBD_ELEMENT__SOURCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBDPOU__TARGET_ELEMENTS = FBD_ELEMENT__TARGET_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBDPOU__LOCAL_ID = FBD_ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBDPOU__LEVEL = FBD_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>FBD Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBDPOU__FBD_ELEMENT_TYPE = FBD_ELEMENT__FBD_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBDPOU__NAME = FBD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref POU</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBDPOU__REF_POU = FBD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FBDPOU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBDPOU_FEATURE_COUNT = FBD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FBDPOU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBDPOU_OPERATION_COUNT = FBD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.StandardFunctionImpl <em>Standard Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.StandardFunctionImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getStandardFunction()
	 * @generated
	 */
	int STANDARD_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION__INPUT_PORTS = FBD_ELEMENT__INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION__OUTPUT_PORTS = FBD_ELEMENT__OUTPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION__SOURCE_ELEMENTS = FBD_ELEMENT__SOURCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION__TARGET_ELEMENTS = FBD_ELEMENT__TARGET_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION__LOCAL_ID = FBD_ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION__LEVEL = FBD_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>FBD Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION__FBD_ELEMENT_TYPE = FBD_ELEMENT__FBD_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION__NAME = FBD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Function Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION__FUNCTION_OPERATION = FBD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Standard Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION_FEATURE_COUNT = FBD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Standard Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION_OPERATION_COUNT = FBD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.StandardFunctionBlockImpl <em>Standard Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.StandardFunctionBlockImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getStandardFunctionBlock()
	 * @generated
	 */
	int STANDARD_FUNCTION_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION_BLOCK__INPUT_PORTS = FBD_ELEMENT__INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION_BLOCK__OUTPUT_PORTS = FBD_ELEMENT__OUTPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION_BLOCK__SOURCE_ELEMENTS = FBD_ELEMENT__SOURCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION_BLOCK__TARGET_ELEMENTS = FBD_ELEMENT__TARGET_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION_BLOCK__LOCAL_ID = FBD_ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION_BLOCK__LEVEL = FBD_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>FBD Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION_BLOCK__FBD_ELEMENT_TYPE = FBD_ELEMENT__FBD_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION_BLOCK__NAME = FBD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Function Block Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION_BLOCK__FUNCTION_BLOCK_OPERATION = FBD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Standard Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION_BLOCK_FEATURE_COUNT = FBD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Standard Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FUNCTION_BLOCK_OPERATION_COUNT = FBD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.ExecutionBlockImpl <em>Execution Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.ExecutionBlockImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getExecutionBlock()
	 * @generated
	 */
	int EXECUTION_BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK__INPUT_PORTS = FBD_ELEMENT__INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK__OUTPUT_PORTS = FBD_ELEMENT__OUTPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK__SOURCE_ELEMENTS = FBD_ELEMENT__SOURCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK__TARGET_ELEMENTS = FBD_ELEMENT__TARGET_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK__LOCAL_ID = FBD_ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK__LEVEL = FBD_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>FBD Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK__FBD_ELEMENT_TYPE = FBD_ELEMENT__FBD_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK__NAME = FBD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Execution Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK__EXECUTION_STATEMENTS = FBD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK_FEATURE_COUNT = FBD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Execution Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK_OPERATION_COUNT = FBD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FBDJumpImpl <em>FBD Jump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FBDJumpImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getFBDJump()
	 * @generated
	 */
	int FBD_JUMP = 5;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_JUMP__INPUT_PORTS = DiagramPackage.JUMP__INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_JUMP__OUTPUT_PORTS = DiagramPackage.JUMP__OUTPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_JUMP__SOURCE_ELEMENTS = DiagramPackage.JUMP__SOURCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_JUMP__TARGET_ELEMENTS = DiagramPackage.JUMP__TARGET_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_JUMP__LOCAL_ID = DiagramPackage.JUMP__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_JUMP__LEVEL = DiagramPackage.JUMP__LEVEL;

	/**
	 * The feature id for the '<em><b>Target Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_JUMP__TARGET_NETWORK = DiagramPackage.JUMP__TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Jump Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_JUMP__JUMP_LABEL = DiagramPackage.JUMP__JUMP_LABEL;

	/**
	 * The feature id for the '<em><b>FBD Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_JUMP__FBD_ELEMENT_TYPE = DiagramPackage.JUMP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_JUMP__NAME = DiagramPackage.JUMP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FBD Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_JUMP_FEATURE_COUNT = DiagramPackage.JUMP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FBD Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_JUMP_OPERATION_COUNT = DiagramPackage.JUMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElementType <em>FBD Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElementType
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getFBDElementType()
	 * @generated
	 */
	int FBD_ELEMENT_TYPE = 6;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionOperation <em>Standard Function Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionOperation
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getStandardFunctionOperation()
	 * @generated
	 */
	int STANDARD_FUNCTION_OPERATION = 7;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlockOperation <em>Standard Function Block Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlockOperation
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getStandardFunctionBlockOperation()
	 * @generated
	 */
	int STANDARD_FUNCTION_BLOCK_OPERATION = 8;


	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement <em>FBD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FBD Element</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement
	 * @generated
	 */
	EClass getFBDElement();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement#getFBDElementType <em>FBD Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FBD Element Type</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement#getFBDElementType()
	 * @see #getFBDElement()
	 * @generated
	 */
	EAttribute getFBDElement_FBDElementType();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement#getName()
	 * @see #getFBDElement()
	 * @generated
	 */
	EAttribute getFBDElement_Name();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDPOU <em>FBDPOU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FBDPOU</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDPOU
	 * @generated
	 */
	EClass getFBDPOU();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDPOU#getRefPOU <em>Ref POU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref POU</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDPOU#getRefPOU()
	 * @see #getFBDPOU()
	 * @generated
	 */
	EReference getFBDPOU_RefPOU();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunction <em>Standard Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Function</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunction
	 * @generated
	 */
	EClass getStandardFunction();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunction#getFunctionOperation <em>Function Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Operation</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunction#getFunctionOperation()
	 * @see #getStandardFunction()
	 * @generated
	 */
	EAttribute getStandardFunction_FunctionOperation();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlock <em>Standard Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Function Block</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlock
	 * @generated
	 */
	EClass getStandardFunctionBlock();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlock#getFunctionBlockOperation <em>Function Block Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Block Operation</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlock#getFunctionBlockOperation()
	 * @see #getStandardFunctionBlock()
	 * @generated
	 */
	EAttribute getStandardFunctionBlock_FunctionBlockOperation();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.ExecutionBlock <em>Execution Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Block</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.ExecutionBlock
	 * @generated
	 */
	EClass getExecutionBlock();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.ExecutionBlock#getExecutionStatements <em>Execution Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Statements</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.ExecutionBlock#getExecutionStatements()
	 * @see #getExecutionBlock()
	 * @generated
	 */
	EReference getExecutionBlock_ExecutionStatements();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDJump <em>FBD Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FBD Jump</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDJump
	 * @generated
	 */
	EClass getFBDJump();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElementType <em>FBD Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>FBD Element Type</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElementType
	 * @generated
	 */
	EEnum getFBDElementType();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionOperation <em>Standard Function Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Standard Function Operation</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionOperation
	 * @generated
	 */
	EEnum getStandardFunctionOperation();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlockOperation <em>Standard Function Block Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Standard Function Block Operation</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlockOperation
	 * @generated
	 */
	EEnum getStandardFunctionBlockOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionBlockDiagramFactory getFunctionBlockDiagramFactory();

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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FBDElementImpl <em>FBD Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FBDElementImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getFBDElement()
		 * @generated
		 */
		EClass FBD_ELEMENT = eINSTANCE.getFBDElement();

		/**
		 * The meta object literal for the '<em><b>FBD Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FBD_ELEMENT__FBD_ELEMENT_TYPE = eINSTANCE.getFBDElement_FBDElementType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FBD_ELEMENT__NAME = eINSTANCE.getFBDElement_Name();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FBDPOUImpl <em>FBDPOU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FBDPOUImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getFBDPOU()
		 * @generated
		 */
		EClass FBDPOU = eINSTANCE.getFBDPOU();

		/**
		 * The meta object literal for the '<em><b>Ref POU</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FBDPOU__REF_POU = eINSTANCE.getFBDPOU_RefPOU();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.StandardFunctionImpl <em>Standard Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.StandardFunctionImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getStandardFunction()
		 * @generated
		 */
		EClass STANDARD_FUNCTION = eINSTANCE.getStandardFunction();

		/**
		 * The meta object literal for the '<em><b>Function Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_FUNCTION__FUNCTION_OPERATION = eINSTANCE.getStandardFunction_FunctionOperation();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.StandardFunctionBlockImpl <em>Standard Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.StandardFunctionBlockImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getStandardFunctionBlock()
		 * @generated
		 */
		EClass STANDARD_FUNCTION_BLOCK = eINSTANCE.getStandardFunctionBlock();

		/**
		 * The meta object literal for the '<em><b>Function Block Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_FUNCTION_BLOCK__FUNCTION_BLOCK_OPERATION = eINSTANCE.getStandardFunctionBlock_FunctionBlockOperation();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.ExecutionBlockImpl <em>Execution Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.ExecutionBlockImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getExecutionBlock()
		 * @generated
		 */
		EClass EXECUTION_BLOCK = eINSTANCE.getExecutionBlock();

		/**
		 * The meta object literal for the '<em><b>Execution Statements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_BLOCK__EXECUTION_STATEMENTS = eINSTANCE.getExecutionBlock_ExecutionStatements();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FBDJumpImpl <em>FBD Jump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FBDJumpImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getFBDJump()
		 * @generated
		 */
		EClass FBD_JUMP = eINSTANCE.getFBDJump();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElementType <em>FBD Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElementType
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getFBDElementType()
		 * @generated
		 */
		EEnum FBD_ELEMENT_TYPE = eINSTANCE.getFBDElementType();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionOperation <em>Standard Function Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionOperation
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getStandardFunctionOperation()
		 * @generated
		 */
		EEnum STANDARD_FUNCTION_OPERATION = eINSTANCE.getStandardFunctionOperation();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlockOperation <em>Standard Function Block Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlockOperation
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramPackageImpl#getStandardFunctionBlockOperation()
		 * @generated
		 */
		EEnum STANDARD_FUNCTION_BLOCK_OPERATION = eINSTANCE.getStandardFunctionBlockOperation();

	}

} //FunctionBlockDiagramPackage
