/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Operator#getOwningFeature <em>Owning Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Feature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Feature</em>' container reference.
	 * @see #setOwningFeature(Feature)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getOperator_OwningFeature()
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOperator
	 * @model opposite="operator" transient="false"
	 * @generated
	 */
	Feature getOwningFeature();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Operator#getOwningFeature <em>Owning Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Feature</em>' container reference.
	 * @see #getOwningFeature()
	 * @generated
	 */
	void setOwningFeature(Feature value);

} // Operator
