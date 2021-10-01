/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage
 * @generated
 */
public interface ProductlineadlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductlineadlFactory eINSTANCE = org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Software Product Line Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Product Line Architecture</em>'.
	 * @generated
	 */
	SoftwareProductLineArchitecture createSoftwareProductLineArchitecture();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Opt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opt</em>'.
	 * @generated
	 */
	Opt createOpt();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>Xor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xor</em>'.
	 * @generated
	 */
	Xor createXor();

	/**
	 * Returns a new object of class '<em>Require</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Require</em>'.
	 * @generated
	 */
	Require createRequire();

	/**
	 * Returns a new object of class '<em>Mutex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mutex</em>'.
	 * @generated
	 */
	Mutex createMutex();

	/**
	 * Returns a new object of class '<em>Composite Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Element</em>'.
	 * @generated
	 */
	CompositeElement createCompositeElement();

	/**
	 * Returns a new object of class '<em>Plugin Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plugin Element</em>'.
	 * @generated
	 */
	PluginElement createPluginElement();

	/**
	 * Returns a new object of class '<em>Provided Interface Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Interface Element</em>'.
	 * @generated
	 */
	ProvidedInterfaceElement createProvidedInterfaceElement();

	/**
	 * Returns a new object of class '<em>Consumed Service Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consumed Service Element</em>'.
	 * @generated
	 */
	ConsumedServiceElement createConsumedServiceElement();

	/**
	 * Returns a new object of class '<em>Extension Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Element</em>'.
	 * @generated
	 */
	ExtensionElement createExtensionElement();

	/**
	 * Returns a new object of class '<em>Extension Point Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Point Element</em>'.
	 * @generated
	 */
	ExtensionPointElement createExtensionPointElement();

	/**
	 * Returns a new object of class '<em>Imported Package Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imported Package Element</em>'.
	 * @generated
	 */
	ImportedPackageElement createImportedPackageElement();

	/**
	 * Returns a new object of class '<em>Registered Service Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registered Service Element</em>'.
	 * @generated
	 */
	RegisteredServiceElement createRegisteredServiceElement();

	/**
	 * Returns a new object of class '<em>Required Interface Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Interface Element</em>'.
	 * @generated
	 */
	RequiredInterfaceElement createRequiredInterfaceElement();

	/**
	 * Returns a new object of class '<em>Exported Package Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exported Package Element</em>'.
	 * @generated
	 */
	ExportedPackageElement createExportedPackageElement();

	/**
	 * Returns a new object of class '<em>Extension Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Connector</em>'.
	 * @generated
	 */
	ExtensionConnector createExtensionConnector();

	/**
	 * Returns a new object of class '<em>Interface Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Connector</em>'.
	 * @generated
	 */
	InterfaceConnector createInterfaceConnector();

	/**
	 * Returns a new object of class '<em>Service Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Connector</em>'.
	 * @generated
	 */
	ServiceConnector createServiceConnector();

	/**
	 * Returns a new object of class '<em>Package Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Connector</em>'.
	 * @generated
	 */
	PackageConnector createPackageConnector();

	/**
	 * Returns a new object of class '<em>Mandatory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mandatory</em>'.
	 * @generated
	 */
	Mandatory createMandatory();

	/**
	 * Returns a new object of class '<em>Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optional</em>'.
	 * @generated
	 */
	Optional createOptional();

	/**
	 * Returns a new object of class '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition</em>'.
	 * @generated
	 */
	Composition createComposition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProductlineadlPackage getProductlineadlPackage();

} //ProductlineadlFactory
