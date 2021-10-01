/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getId <em>Id</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getName <em>Name</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOutgoingEdge <em>Outgoing Edge</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getIncomingEdge <em>Incoming Edge</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOwningFeatureDiagram <em>Owning Feature Diagram</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getModel <em>Model</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getDescription <em>Description</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getDetailedModel <em>Detailed Model</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getRequiredElements <em>Required Elements</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getProvidedElements <em>Provided Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature_Name()
	 * @model dataType="org.but4reuse.archmodel.synthesis.adlmm.productlineadl.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing Edge</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge}.
	 * It is bidirectional and its opposite is '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edge</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature_OutgoingEdge()
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Edge> getOutgoingEdge();

	/**
	 * Returns the value of the '<em><b>Incoming Edge</b></em>' reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge}.
	 * It is bidirectional and its opposite is '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edge</em>' reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature_IncomingEdge()
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge#getChild
	 * @model opposite="child"
	 * @generated
	 */
	EList<Edge> getIncomingEdge();

	/**
	 * Returns the value of the '<em><b>Owning Feature Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Feature Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Feature Diagram</em>' container reference.
	 * @see #setOwningFeatureDiagram(SoftwareProductLineArchitecture)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature_OwningFeatureDiagram()
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture#getFeatures
	 * @model opposite="features" required="true" transient="false"
	 * @generated
	 */
	SoftwareProductLineArchitecture getOwningFeatureDiagram();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOwningFeatureDiagram <em>Owning Feature Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Feature Diagram</em>' container reference.
	 * @see #getOwningFeatureDiagram()
	 * @generated
	 */
	void setOwningFeatureDiagram(SoftwareProductLineArchitecture value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Operator#getOwningFeature <em>Owning Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Operator)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature_Operator()
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Operator#getOwningFeature
	 * @model opposite="owningFeature" containment="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature_Model()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeElement> getModel();

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(Boolean)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature_Selected()
	 * @model default="false" dataType="org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Boolean" required="true"
	 * @generated
	 */
	Boolean getSelected();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(Boolean value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(Boolean)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature_Mandatory()
	 * @model default="false" dataType="org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Boolean" required="true"
	 * @generated
	 */
	Boolean getMandatory();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #getMandatory()
	 * @generated
	 */
	void setMandatory(Boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature_Description()
	 * @model dataType="org.but4reuse.archmodel.synthesis.adlmm.productlineadl.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(Boolean)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature_Abstract()
	 * @model dataType="org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Boolean"
	 * @generated
	 */
	Boolean getAbstract();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Detailed Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detailed Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detailed Model</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature_DetailedModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeElement> getDetailedModel();

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
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature_RequiredElements()
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
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getFeature_ProvidedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedElement> getProvidedElements();

} // Feature
