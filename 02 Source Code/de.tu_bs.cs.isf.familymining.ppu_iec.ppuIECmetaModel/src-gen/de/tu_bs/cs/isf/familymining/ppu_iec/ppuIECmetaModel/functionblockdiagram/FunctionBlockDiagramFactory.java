/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage
 * @generated
 */
public interface FunctionBlockDiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionBlockDiagramFactory eINSTANCE = de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FunctionBlockDiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>FBD Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FBD Element</em>'.
	 * @generated
	 */
	FBDElement createFBDElement();

	/**
	 * Returns a new object of class '<em>FBDPOU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FBDPOU</em>'.
	 * @generated
	 */
	FBDPOU createFBDPOU();

	/**
	 * Returns a new object of class '<em>Standard Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Function</em>'.
	 * @generated
	 */
	StandardFunction createStandardFunction();

	/**
	 * Returns a new object of class '<em>Standard Function Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Function Block</em>'.
	 * @generated
	 */
	StandardFunctionBlock createStandardFunctionBlock();

	/**
	 * Returns a new object of class '<em>Execution Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Block</em>'.
	 * @generated
	 */
	ExecutionBlock createExecutionBlock();

	/**
	 * Returns a new object of class '<em>FBD Jump</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FBD Jump</em>'.
	 * @generated
	 */
	FBDJump createFBDJump();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FunctionBlockDiagramPackage getFunctionBlockDiagramPackage();

} //FunctionBlockDiagramFactory
