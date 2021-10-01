/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement#getRequiredElements <em>Required Elements</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement#getProvidedElements <em>Provided Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getComponentElement()
 * @model abstract="true"
 * @generated
 */
public interface ComponentElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Elements</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getComponentElement_RequiredElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredElement> getRequiredElements();

	/**
	 * Returns the value of the '<em><b>Provided Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Elements</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getComponentElement_ProvidedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedElement> getProvidedElements();

} // ComponentElement
