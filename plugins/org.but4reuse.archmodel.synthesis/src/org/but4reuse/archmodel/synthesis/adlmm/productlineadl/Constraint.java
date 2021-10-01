/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint#getTarget <em>Target</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint#getSource <em>Source</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Feature)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getConstraint_Target()
	 * @model
	 * @generated
	 */
	Feature getTarget();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Feature value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Feature)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getConstraint_Source()
	 * @model
	 * @generated
	 */
	Feature getSource();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Feature value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getConstraint_Text()
	 * @model dataType="org.but4reuse.archmodel.synthesis.adlmm.productlineadl.String"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Constraint
