/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl;

import java.util.Collection;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredElement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ComponentElementImpl#getRequiredElements <em>Required Elements</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ComponentElementImpl#getProvidedElements <em>Provided Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentElementImpl extends MinimalEObjectImpl.Container implements ComponentElement {
	/**
	 * The cached value of the '{@link #getRequiredElements() <em>Required Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredElements()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredElement> requiredElements;

	/**
	 * The cached value of the '{@link #getProvidedElements() <em>Provided Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedElement> providedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductlineadlPackage.Literals.COMPONENT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredElement> getRequiredElements() {
		if (requiredElements == null) {
			requiredElements = new EObjectContainmentEList<RequiredElement>(RequiredElement.class, this, ProductlineadlPackage.COMPONENT_ELEMENT__REQUIRED_ELEMENTS);
		}
		return requiredElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedElement> getProvidedElements() {
		if (providedElements == null) {
			providedElements = new EObjectContainmentEList<ProvidedElement>(ProvidedElement.class, this, ProductlineadlPackage.COMPONENT_ELEMENT__PROVIDED_ELEMENTS);
		}
		return providedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductlineadlPackage.COMPONENT_ELEMENT__REQUIRED_ELEMENTS:
				return ((InternalEList<?>)getRequiredElements()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.COMPONENT_ELEMENT__PROVIDED_ELEMENTS:
				return ((InternalEList<?>)getProvidedElements()).basicRemove(otherEnd, msgs);
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
			case ProductlineadlPackage.COMPONENT_ELEMENT__REQUIRED_ELEMENTS:
				return getRequiredElements();
			case ProductlineadlPackage.COMPONENT_ELEMENT__PROVIDED_ELEMENTS:
				return getProvidedElements();
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
			case ProductlineadlPackage.COMPONENT_ELEMENT__REQUIRED_ELEMENTS:
				getRequiredElements().clear();
				getRequiredElements().addAll((Collection<? extends RequiredElement>)newValue);
				return;
			case ProductlineadlPackage.COMPONENT_ELEMENT__PROVIDED_ELEMENTS:
				getProvidedElements().clear();
				getProvidedElements().addAll((Collection<? extends ProvidedElement>)newValue);
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
			case ProductlineadlPackage.COMPONENT_ELEMENT__REQUIRED_ELEMENTS:
				getRequiredElements().clear();
				return;
			case ProductlineadlPackage.COMPONENT_ELEMENT__PROVIDED_ELEMENTS:
				getProvidedElements().clear();
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
			case ProductlineadlPackage.COMPONENT_ELEMENT__REQUIRED_ELEMENTS:
				return requiredElements != null && !requiredElements.isEmpty();
			case ProductlineadlPackage.COMPONENT_ELEMENT__PROVIDED_ELEMENTS:
				return providedElements != null && !providedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentElementImpl
