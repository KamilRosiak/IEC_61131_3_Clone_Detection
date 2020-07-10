/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage
 * @generated
 */
public interface MergedModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MergedModelFactory eINSTANCE = de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.MergedModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Family Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family Model</em>'.
	 * @generated
	 */
	FamilyModel createFamilyModel();

	/**
	 * Returns a new object of class '<em>Element Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Comparison</em>'.
	 * @generated
	 */
	ElementComparison createElementComparison();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MergedModelPackage getMergedModelPackage();

} //MergedModelFactory
