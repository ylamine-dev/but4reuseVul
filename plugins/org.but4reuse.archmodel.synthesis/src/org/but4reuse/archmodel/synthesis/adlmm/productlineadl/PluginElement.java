/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getName <em>Name</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getPluginSymbName <em>Plugin Symb Name</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getImport_packages <em>Import packages</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getExport_packages <em>Export packages</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getRegisteredServices <em>Registered Services</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getConsumedServices <em>Consumed Services</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getPluginVersion <em>Plugin Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getPluginElement()
 * @model
 * @generated
 */
public interface PluginElement extends ComponentElement {
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
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getPluginElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Plugin Symb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Symb Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Symb Name</em>' attribute.
	 * @see #setPluginSymbName(String)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getPluginElement_PluginSymbName()
	 * @model
	 * @generated
	 */
	String getPluginSymbName();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getPluginSymbName <em>Plugin Symb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Symb Name</em>' attribute.
	 * @see #getPluginSymbName()
	 * @generated
	 */
	void setPluginSymbName(String value);

	/**
	 * Returns the value of the '<em><b>Import packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ImportedPackageElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import packages</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getPluginElement_Import_packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportedPackageElement> getImport_packages();

	/**
	 * Returns the value of the '<em><b>Export packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExportedPackageElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export packages</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getPluginElement_Export_packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExportedPackageElement> getExport_packages();

	/**
	 * Returns the value of the '<em><b>Registered Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Services</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getPluginElement_RegisteredServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<RegisteredServiceElement> getRegisteredServices();

	/**
	 * Returns the value of the '<em><b>Consumed Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumed Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed Services</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getPluginElement_ConsumedServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConsumedServiceElement> getConsumedServices();

	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getPluginElement_RequiredInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredInterfaceElement> getRequiredInterfaces();

	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedInterfaceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getPluginElement_ProvidedInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedInterfaceElement> getProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Extension Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Points</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getPluginElement_ExtensionPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtensionPointElement> getExtensionPoints();

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getPluginElement_Extensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtensionElement> getExtensions();

	/**
	 * Returns the value of the '<em><b>Plugin Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Version</em>' attribute.
	 * @see #setPluginVersion(String)
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#getPluginElement_PluginVersion()
	 * @model
	 * @generated
	 */
	String getPluginVersion();

	/**
	 * Sets the value of the '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement#getPluginVersion <em>Plugin Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Version</em>' attribute.
	 * @see #getPluginVersion()
	 * @generated
	 */
	void setPluginVersion(String value);

} // PluginElement
