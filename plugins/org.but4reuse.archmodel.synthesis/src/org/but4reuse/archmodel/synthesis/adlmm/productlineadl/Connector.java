/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Connector#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getConnector()
 * @model abstract="true"
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getConnector_Value()
	 * @model dataType="org.but4reuse.archmodel.synthesis.adlmm.productlineadl.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Connector#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Connector
