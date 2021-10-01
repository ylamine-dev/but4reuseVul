/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Product Line Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getGraphTypeTree <em>Graph Type Tree</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getRoot <em>Root</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getComposites <em>Composites</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getSoftwareProductLineArchitecture()
 * @model
 * @generated
 */
public interface SoftwareProductLineArchitecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Graph Type Tree</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Type Tree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Type Tree</em>' attribute.
	 * @see #setGraphTypeTree(Boolean)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getSoftwareProductLineArchitecture_GraphTypeTree()
	 * @model default="true" dataType="org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Boolean" required="true"
	 * @generated
	 */
	Boolean getGraphTypeTree();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getGraphTypeTree <em>Graph Type Tree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Type Tree</em>' attribute.
	 * @see #getGraphTypeTree()
	 * @generated
	 */
	void setGraphTypeTree(Boolean value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature}.
	 * It is bidirectional and its opposite is '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOwningFeatureDiagram <em>Owning Feature Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getSoftwareProductLineArchitecture_Features()
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOwningFeatureDiagram
	 * @model opposite="owningFeatureDiagram" containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Feature)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getSoftwareProductLineArchitecture_Root()
	 * @model required="true"
	 * @generated
	 */
	Feature getRoot();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Feature value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getSoftwareProductLineArchitecture_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Composites</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composites</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getSoftwareProductLineArchitecture_Composites()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeElement> getComposites();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getSoftwareProductLineArchitecture_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentElement> getComponents();

} // SoftwareProductLineArchitecture
