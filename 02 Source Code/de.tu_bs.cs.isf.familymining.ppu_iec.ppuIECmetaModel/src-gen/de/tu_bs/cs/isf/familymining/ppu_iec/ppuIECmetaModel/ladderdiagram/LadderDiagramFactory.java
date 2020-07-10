/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage
 * @generated
 */
public interface LadderDiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LadderDiagramFactory eINSTANCE = de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl.LadderDiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>LL Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LL Element</em>'.
	 * @generated
	 */
	LLElement createLLElement();

	/**
	 * Returns a new object of class '<em>Ladder Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ladder Network</em>'.
	 * @generated
	 */
	LadderNetwork createLadderNetwork();

	/**
	 * Returns a new object of class '<em>LD Jump</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LD Jump</em>'.
	 * @generated
	 */
	LDJump createLDJump();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LadderDiagramPackage getLadderDiagramPackage();

} //LadderDiagramFactory
