/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramElementImpl#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramElementImpl#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramElementImpl#getSourceElements <em>Source Elements</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramElementImpl#getTargetElements <em>Target Elements</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramElementImpl#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramElementImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramElementImpl extends MinimalEObjectImpl.Container implements DiagramElement {
	/**
	 * The cached value of the '{@link #getInputPorts() <em>Input Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> inputPorts;

	/**
	 * The cached value of the '{@link #getOutputPorts() <em>Output Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> outputPorts;

	/**
	 * The cached value of the '{@link #getSourceElements() <em>Source Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramElement> sourceElements;

	/**
	 * The cached value of the '{@link #getTargetElements() <em>Target Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramElement> targetElements;

	/**
	 * The default value of the '{@link #getLocalId() <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalId() <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalId()
	 * @generated
	 * @ordered
	 */
	protected String localId = LOCAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LEVEL_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Integer level = LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getInputPorts() {
		if (inputPorts == null) {
			inputPorts = new EObjectContainmentEList<Port>(Port.class, this, DiagramPackage.DIAGRAM_ELEMENT__INPUT_PORTS);
		}
		return inputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getOutputPorts() {
		if (outputPorts == null) {
			outputPorts = new EObjectContainmentEList<Port>(Port.class, this, DiagramPackage.DIAGRAM_ELEMENT__OUTPUT_PORTS);
		}
		return outputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiagramElement> getSourceElements() {
		if (sourceElements == null) {
			sourceElements = new EObjectResolvingEList<DiagramElement>(DiagramElement.class, this, DiagramPackage.DIAGRAM_ELEMENT__SOURCE_ELEMENTS);
		}
		return sourceElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DiagramElement> getTargetElements() {
		if (targetElements == null) {
			targetElements = new EObjectResolvingEList<DiagramElement>(DiagramElement.class, this, DiagramPackage.DIAGRAM_ELEMENT__TARGET_ELEMENTS);
		}
		return targetElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalId() {
		return localId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalId(String newLocalId) {
		String oldLocalId = localId;
		localId = newLocalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIAGRAM_ELEMENT__LOCAL_ID, oldLocalId, localId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(Integer newLevel) {
		Integer oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIAGRAM_ELEMENT__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramPackage.DIAGRAM_ELEMENT__INPUT_PORTS:
				return ((InternalEList<?>)getInputPorts()).basicRemove(otherEnd, msgs);
			case DiagramPackage.DIAGRAM_ELEMENT__OUTPUT_PORTS:
				return ((InternalEList<?>)getOutputPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramPackage.DIAGRAM_ELEMENT__INPUT_PORTS:
				return getInputPorts();
			case DiagramPackage.DIAGRAM_ELEMENT__OUTPUT_PORTS:
				return getOutputPorts();
			case DiagramPackage.DIAGRAM_ELEMENT__SOURCE_ELEMENTS:
				return getSourceElements();
			case DiagramPackage.DIAGRAM_ELEMENT__TARGET_ELEMENTS:
				return getTargetElements();
			case DiagramPackage.DIAGRAM_ELEMENT__LOCAL_ID:
				return getLocalId();
			case DiagramPackage.DIAGRAM_ELEMENT__LEVEL:
				return getLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagramPackage.DIAGRAM_ELEMENT__INPUT_PORTS:
				getInputPorts().clear();
				getInputPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__OUTPUT_PORTS:
				getOutputPorts().clear();
				getOutputPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__SOURCE_ELEMENTS:
				getSourceElements().clear();
				getSourceElements().addAll((Collection<? extends DiagramElement>)newValue);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__TARGET_ELEMENTS:
				getTargetElements().clear();
				getTargetElements().addAll((Collection<? extends DiagramElement>)newValue);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__LOCAL_ID:
				setLocalId((String)newValue);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__LEVEL:
				setLevel((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiagramPackage.DIAGRAM_ELEMENT__INPUT_PORTS:
				getInputPorts().clear();
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__OUTPUT_PORTS:
				getOutputPorts().clear();
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__SOURCE_ELEMENTS:
				getSourceElements().clear();
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__TARGET_ELEMENTS:
				getTargetElements().clear();
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__LOCAL_ID:
				setLocalId(LOCAL_ID_EDEFAULT);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiagramPackage.DIAGRAM_ELEMENT__INPUT_PORTS:
				return inputPorts != null && !inputPorts.isEmpty();
			case DiagramPackage.DIAGRAM_ELEMENT__OUTPUT_PORTS:
				return outputPorts != null && !outputPorts.isEmpty();
			case DiagramPackage.DIAGRAM_ELEMENT__SOURCE_ELEMENTS:
				return sourceElements != null && !sourceElements.isEmpty();
			case DiagramPackage.DIAGRAM_ELEMENT__TARGET_ELEMENTS:
				return targetElements != null && !targetElements.isEmpty();
			case DiagramPackage.DIAGRAM_ELEMENT__LOCAL_ID:
				return LOCAL_ID_EDEFAULT == null ? localId != null : !LOCAL_ID_EDEFAULT.equals(localId);
			case DiagramPackage.DIAGRAM_ELEMENT__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (localId: ");
		result.append(localId);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //DiagramElementImpl
