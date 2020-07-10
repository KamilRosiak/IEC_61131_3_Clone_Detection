/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram;

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
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramFactory
 * @model kind="package"
 * @generated
 */
public interface DiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ppuIECScenario/Diagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "D";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramPackage eINSTANCE = de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PARENT_ELEMENT = LanguageElementPackage.LANGUAGE_ELEMENT__PARENT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CHILD_ELEMENTS = LanguageElementPackage.LANGUAGE_ELEMENT__CHILD_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__LABEL = LanguageElementPackage.LANGUAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__COMMENTS = LanguageElementPackage.LANGUAGE_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = LanguageElementPackage.LANGUAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NETWORKS = LanguageElementPackage.LANGUAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__TYPE = LanguageElementPackage.LANGUAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = LanguageElementPackage.LANGUAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OPERATION_COUNT = LanguageElementPackage.LANGUAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.NetworkImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Network Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NETWORK_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__POSITION = 3;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramElementImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__INPUT_PORTS = 0;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__OUTPUT_PORTS = 1;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__SOURCE_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__TARGET_ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__LOCAL_ID = 4;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__LEVEL = 5;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.PortImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Attached Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ATTACHED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Connected Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONNECTED_PORTS = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.ReturnImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 4;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__INPUT_PORTS = DIAGRAM_ELEMENT__INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__OUTPUT_PORTS = DIAGRAM_ELEMENT__OUTPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__SOURCE_ELEMENTS = DIAGRAM_ELEMENT__SOURCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__TARGET_ELEMENTS = DIAGRAM_ELEMENT__TARGET_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__LOCAL_ID = DIAGRAM_ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__LEVEL = DIAGRAM_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Target POU</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__TARGET_POU = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.JumpImpl <em>Jump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.JumpImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getJump()
	 * @generated
	 */
	int JUMP = 5;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__INPUT_PORTS = DIAGRAM_ELEMENT__INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__OUTPUT_PORTS = DIAGRAM_ELEMENT__OUTPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__SOURCE_ELEMENTS = DIAGRAM_ELEMENT__SOURCE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__TARGET_ELEMENTS = DIAGRAM_ELEMENT__TARGET_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__LOCAL_ID = DIAGRAM_ELEMENT__LOCAL_ID;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__LEVEL = DIAGRAM_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Target Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__TARGET_NETWORK = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jump Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__JUMP_LABEL = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_OPERATION_COUNT = DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.FBPortImpl <em>FB Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.FBPortImpl
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getFBPort()
	 * @generated
	 */
	int FB_PORT = 6;

	/**
	 * The feature id for the '<em><b>Attached Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_PORT__ATTACHED_ELEMENT = PORT__ATTACHED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Connected Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_PORT__CONNECTED_PORTS = PORT__CONNECTED_PORTS;

	/**
	 * The feature id for the '<em><b>Port Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_PORT__PORT_VARIABLE = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_PORT__NEGATED = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assigned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_PORT__ASSIGNED_VALUE = PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_PORT__CONNECTED = PORT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>FB Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>FB Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FB_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramType
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getDiagramType()
	 * @generated
	 */
	int DIAGRAM_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram#getNetworks()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Networks();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram#getType()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Type();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getLabel()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getNetworkElements <em>Network Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network Elements</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getNetworkElements()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_NetworkElements();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getDiagram()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Diagram();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network#getPosition()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Position();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Ports</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement#getInputPorts()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_InputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement#getOutputPorts <em>Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Ports</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement#getOutputPorts()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_OutputPorts();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement#getSourceElements <em>Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Elements</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement#getSourceElements()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_SourceElements();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement#getTargetElements <em>Target Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Elements</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement#getTargetElements()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_TargetElements();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement#getLocalId()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement#getLevel()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EAttribute getDiagramElement_Level();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port#getAttachedElement <em>Attached Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attached Element</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port#getAttachedElement()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_AttachedElement();

	/**
	 * Returns the meta object for the reference list '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port#getConnectedPorts <em>Connected Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Ports</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port#getConnectedPorts()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_ConnectedPorts();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Return#getTargetPOU <em>Target POU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target POU</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Return#getTargetPOU()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_TargetPOU();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump
	 * @generated
	 */
	EClass getJump();

	/**
	 * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump#getTargetNetwork <em>Target Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Network</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump#getTargetNetwork()
	 * @see #getJump()
	 * @generated
	 */
	EReference getJump_TargetNetwork();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump#getJumpLabel <em>Jump Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jump Label</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump#getJumpLabel()
	 * @see #getJump()
	 * @generated
	 */
	EAttribute getJump_JumpLabel();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort <em>FB Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FB Port</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort
	 * @generated
	 */
	EClass getFBPort();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#getPortVariable <em>Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port Variable</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#getPortVariable()
	 * @see #getFBPort()
	 * @generated
	 */
	EReference getFBPort_PortVariable();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#isNegated()
	 * @see #getFBPort()
	 * @generated
	 */
	EAttribute getFBPort_Negated();

	/**
	 * Returns the meta object for the containment reference '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#getAssignedValue <em>Assigned Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Value</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#getAssignedValue()
	 * @see #getFBPort()
	 * @generated
	 */
	EReference getFBPort_AssignedValue();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort#isConnected()
	 * @see #getFBPort()
	 * @generated
	 */
	EAttribute getFBPort_Connected();

	/**
	 * Returns the meta object for enum '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramType
	 * @generated
	 */
	EEnum getDiagramType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiagramFactory getDiagramFactory();

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
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__NETWORKS = eINSTANCE.getDiagram_Networks();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__TYPE = eINSTANCE.getDiagram_Type();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.NetworkImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__LABEL = eINSTANCE.getNetwork_Label();

		/**
		 * The meta object literal for the '<em><b>Network Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__NETWORK_ELEMENTS = eINSTANCE.getNetwork_NetworkElements();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__DIAGRAM = eINSTANCE.getNetwork_Diagram();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__POSITION = eINSTANCE.getNetwork_Position();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramElementImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getDiagramElement()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__INPUT_PORTS = eINSTANCE.getDiagramElement_InputPorts();

		/**
		 * The meta object literal for the '<em><b>Output Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__OUTPUT_PORTS = eINSTANCE.getDiagramElement_OutputPorts();

		/**
		 * The meta object literal for the '<em><b>Source Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__SOURCE_ELEMENTS = eINSTANCE.getDiagramElement_SourceElements();

		/**
		 * The meta object literal for the '<em><b>Target Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__TARGET_ELEMENTS = eINSTANCE.getDiagramElement_TargetElements();

		/**
		 * The meta object literal for the '<em><b>Local Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__LOCAL_ID = eINSTANCE.getDiagramElement_LocalId();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_ELEMENT__LEVEL = eINSTANCE.getDiagramElement_Level();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.PortImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Attached Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__ATTACHED_ELEMENT = eINSTANCE.getPort_AttachedElement();

		/**
		 * The meta object literal for the '<em><b>Connected Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__CONNECTED_PORTS = eINSTANCE.getPort_ConnectedPorts();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.ReturnImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Target POU</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__TARGET_POU = eINSTANCE.getReturn_TargetPOU();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.JumpImpl <em>Jump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.JumpImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getJump()
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
		 * The meta object literal for the '<em><b>Jump Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP__JUMP_LABEL = eINSTANCE.getJump_JumpLabel();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.FBPortImpl <em>FB Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.FBPortImpl
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getFBPort()
		 * @generated
		 */
		EClass FB_PORT = eINSTANCE.getFBPort();

		/**
		 * The meta object literal for the '<em><b>Port Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FB_PORT__PORT_VARIABLE = eINSTANCE.getFBPort_PortVariable();

		/**
		 * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FB_PORT__NEGATED = eINSTANCE.getFBPort_Negated();

		/**
		 * The meta object literal for the '<em><b>Assigned Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FB_PORT__ASSIGNED_VALUE = eINSTANCE.getFBPort_AssignedValue();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FB_PORT__CONNECTED = eINSTANCE.getFBPort_Connected();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramType
		 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramPackageImpl#getDiagramType()
		 * @generated
		 */
		EEnum DIAGRAM_TYPE = eINSTANCE.getDiagramType();

	}

} //DiagramPackage
