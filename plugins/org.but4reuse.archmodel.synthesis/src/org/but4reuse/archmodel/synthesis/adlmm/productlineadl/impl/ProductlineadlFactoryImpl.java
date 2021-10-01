/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductlineadlFactoryImpl extends EFactoryImpl implements ProductlineadlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductlineadlFactory init() {
		try {
			ProductlineadlFactory theProductlineadlFactory = (ProductlineadlFactory)EPackage.Registry.INSTANCE.getEFactory(ProductlineadlPackage.eNS_URI);
			if (theProductlineadlFactory != null) {
				return theProductlineadlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductlineadlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductlineadlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE: return createSoftwareProductLineArchitecture();
			case ProductlineadlPackage.FEATURE: return createFeature();
			case ProductlineadlPackage.OPT: return createOpt();
			case ProductlineadlPackage.AND: return createAnd();
			case ProductlineadlPackage.OR: return createOr();
			case ProductlineadlPackage.XOR: return createXor();
			case ProductlineadlPackage.REQUIRE: return createRequire();
			case ProductlineadlPackage.MUTEX: return createMutex();
			case ProductlineadlPackage.COMPOSITE_ELEMENT: return createCompositeElement();
			case ProductlineadlPackage.PLUGIN_ELEMENT: return createPluginElement();
			case ProductlineadlPackage.PROVIDED_INTERFACE_ELEMENT: return createProvidedInterfaceElement();
			case ProductlineadlPackage.CONSUMED_SERVICE_ELEMENT: return createConsumedServiceElement();
			case ProductlineadlPackage.EXTENSION_ELEMENT: return createExtensionElement();
			case ProductlineadlPackage.EXTENSION_POINT_ELEMENT: return createExtensionPointElement();
			case ProductlineadlPackage.IMPORTED_PACKAGE_ELEMENT: return createImportedPackageElement();
			case ProductlineadlPackage.REGISTERED_SERVICE_ELEMENT: return createRegisteredServiceElement();
			case ProductlineadlPackage.REQUIRED_INTERFACE_ELEMENT: return createRequiredInterfaceElement();
			case ProductlineadlPackage.EXPORTED_PACKAGE_ELEMENT: return createExportedPackageElement();
			case ProductlineadlPackage.EXTENSION_CONNECTOR: return createExtensionConnector();
			case ProductlineadlPackage.INTERFACE_CONNECTOR: return createInterfaceConnector();
			case ProductlineadlPackage.SERVICE_CONNECTOR: return createServiceConnector();
			case ProductlineadlPackage.PACKAGE_CONNECTOR: return createPackageConnector();
			case ProductlineadlPackage.MANDATORY: return createMandatory();
			case ProductlineadlPackage.OPTIONAL: return createOptional();
			case ProductlineadlPackage.COMPOSITION: return createComposition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ProductlineadlPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case ProductlineadlPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ProductlineadlPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case ProductlineadlPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareProductLineArchitecture createSoftwareProductLineArchitecture() {
		SoftwareProductLineArchitectureImpl softwareProductLineArchitecture = new SoftwareProductLineArchitectureImpl();
		return softwareProductLineArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Opt createOpt() {
		OptImpl opt = new OptImpl();
		return opt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xor createXor() {
		XorImpl xor = new XorImpl();
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Require createRequire() {
		RequireImpl require = new RequireImpl();
		return require;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mutex createMutex() {
		MutexImpl mutex = new MutexImpl();
		return mutex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeElement createCompositeElement() {
		CompositeElementImpl compositeElement = new CompositeElementImpl();
		return compositeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginElement createPluginElement() {
		PluginElementImpl pluginElement = new PluginElementImpl();
		return pluginElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedInterfaceElement createProvidedInterfaceElement() {
		ProvidedInterfaceElementImpl providedInterfaceElement = new ProvidedInterfaceElementImpl();
		return providedInterfaceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsumedServiceElement createConsumedServiceElement() {
		ConsumedServiceElementImpl consumedServiceElement = new ConsumedServiceElementImpl();
		return consumedServiceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionElement createExtensionElement() {
		ExtensionElementImpl extensionElement = new ExtensionElementImpl();
		return extensionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPointElement createExtensionPointElement() {
		ExtensionPointElementImpl extensionPointElement = new ExtensionPointElementImpl();
		return extensionPointElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportedPackageElement createImportedPackageElement() {
		ImportedPackageElementImpl importedPackageElement = new ImportedPackageElementImpl();
		return importedPackageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredServiceElement createRegisteredServiceElement() {
		RegisteredServiceElementImpl registeredServiceElement = new RegisteredServiceElementImpl();
		return registeredServiceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredInterfaceElement createRequiredInterfaceElement() {
		RequiredInterfaceElementImpl requiredInterfaceElement = new RequiredInterfaceElementImpl();
		return requiredInterfaceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportedPackageElement createExportedPackageElement() {
		ExportedPackageElementImpl exportedPackageElement = new ExportedPackageElementImpl();
		return exportedPackageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionConnector createExtensionConnector() {
		ExtensionConnectorImpl extensionConnector = new ExtensionConnectorImpl();
		return extensionConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConnector createInterfaceConnector() {
		InterfaceConnectorImpl interfaceConnector = new InterfaceConnectorImpl();
		return interfaceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConnector createServiceConnector() {
		ServiceConnectorImpl serviceConnector = new ServiceConnectorImpl();
		return serviceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageConnector createPackageConnector() {
		PackageConnectorImpl packageConnector = new PackageConnectorImpl();
		return packageConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mandatory createMandatory() {
		MandatoryImpl mandatory = new MandatoryImpl();
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optional createOptional() {
		OptionalImpl optional = new OptionalImpl();
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductlineadlPackage getProductlineadlPackage() {
		return (ProductlineadlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductlineadlPackage getPackage() {
		return ProductlineadlPackage.eINSTANCE;
	}

} //ProductlineadlFactoryImpl
