/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.And;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Composition;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Connector;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExportedPackageElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionConnector;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ImportedPackageElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.InterfaceConnector;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Mandatory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Mutex;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Operator;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Opt;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Optional;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Or;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PackageConnector;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedInterfaceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Require;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ServiceConnector;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Xor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductlineadlPackageImpl extends EPackageImpl implements ProductlineadlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareProductLineArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedInterfaceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumedServiceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionPointElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importedPackageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registeredServiceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredInterfaceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportedPackageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandatoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProductlineadlPackageImpl() {
		super(eNS_URI, ProductlineadlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProductlineadlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProductlineadlPackage init() {
		if (isInited) return (ProductlineadlPackage)EPackage.Registry.INSTANCE.getEPackage(ProductlineadlPackage.eNS_URI);

		// Obtain or create and register package
		ProductlineadlPackageImpl theProductlineadlPackage = (ProductlineadlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProductlineadlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProductlineadlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theProductlineadlPackage.createPackageContents();

		// Initialize created meta-data
		theProductlineadlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProductlineadlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProductlineadlPackage.eNS_URI, theProductlineadlPackage);
		return theProductlineadlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareProductLineArchitecture() {
		return softwareProductLineArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftwareProductLineArchitecture_GraphTypeTree() {
		return (EAttribute)softwareProductLineArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareProductLineArchitecture_Features() {
		return (EReference)softwareProductLineArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareProductLineArchitecture_Root() {
		return (EReference)softwareProductLineArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareProductLineArchitecture_Constraints() {
		return (EReference)softwareProductLineArchitectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareProductLineArchitecture_Composites() {
		return (EReference)softwareProductLineArchitectureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareProductLineArchitecture_Components() {
		return (EReference)softwareProductLineArchitectureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Id() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_OutgoingEdge() {
		return (EReference)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_IncomingEdge() {
		return (EReference)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_OwningFeatureDiagram() {
		return (EReference)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Operator() {
		return (EReference)featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Model() {
		return (EReference)featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Selected() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Mandatory() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Description() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Abstract() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_DetailedModel() {
		return (EReference)featureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_RequiredElements() {
		return (EReference)featureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_ProvidedElements() {
		return (EReference)featureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Parent() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Child() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Value() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Target() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Source() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Text() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_OwningFeature() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpt() {
		return optEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXor() {
		return xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequire() {
		return requireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMutex() {
		return mutexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeElement() {
		return compositeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeElement_Components() {
		return (EReference)compositeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeElement_Name() {
		return (EAttribute)compositeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeElement_Connectors() {
		return (EReference)compositeElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginElement() {
		return pluginElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginElement_Name() {
		return (EAttribute)pluginElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginElement_PluginSymbName() {
		return (EAttribute)pluginElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginElement_Import_packages() {
		return (EReference)pluginElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginElement_Export_packages() {
		return (EReference)pluginElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginElement_RegisteredServices() {
		return (EReference)pluginElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginElement_ConsumedServices() {
		return (EReference)pluginElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginElement_RequiredInterfaces() {
		return (EReference)pluginElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginElement_ProvidedInterfaces() {
		return (EReference)pluginElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginElement_ExtensionPoints() {
		return (EReference)pluginElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginElement_Extensions() {
		return (EReference)pluginElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginElement_PluginVersion() {
		return (EAttribute)pluginElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedInterfaceElement() {
		return providedInterfaceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidedInterfaceElement_InterfaceName() {
		return (EAttribute)providedInterfaceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvidedInterfaceElement_Operations() {
		return (EAttribute)providedInterfaceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsumedServiceElement() {
		return consumedServiceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsumedServiceElement_ObjName() {
		return (EAttribute)consumedServiceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsumedServiceElement_InterfaceName() {
		return (EAttribute)consumedServiceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionElement() {
		return extensionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionElement_Point() {
		return (EAttribute)extensionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionElement_ClassName() {
		return (EAttribute)extensionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionPointElement() {
		return extensionPointElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionPointElement_Id() {
		return (EAttribute)extensionPointElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionPointElement_Name() {
		return (EAttribute)extensionPointElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionPointElement_Schema() {
		return (EAttribute)extensionPointElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportedPackageElement() {
		return importedPackageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportedPackageElement_Name() {
		return (EAttribute)importedPackageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentElement() {
		return componentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentElement_RequiredElements() {
		return (EReference)componentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentElement_ProvidedElements() {
		return (EReference)componentElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Value() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedElement() {
		return providedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredElement() {
		return requiredElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisteredServiceElement() {
		return registeredServiceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredServiceElement_ObjName() {
		return (EAttribute)registeredServiceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredServiceElement_InterfaceName() {
		return (EAttribute)registeredServiceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredInterfaceElement() {
		return requiredInterfaceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredInterfaceElement_InterfaceName() {
		return (EAttribute)requiredInterfaceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredInterfaceElement_Operations() {
		return (EAttribute)requiredInterfaceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportedPackageElement() {
		return exportedPackageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExportedPackageElement_Name() {
		return (EAttribute)exportedPackageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionConnector() {
		return extensionConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionConnector_Source() {
		return (EReference)extensionConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionConnector_Target() {
		return (EReference)extensionConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceConnector() {
		return interfaceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnector_Source() {
		return (EReference)interfaceConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceConnector_Target() {
		return (EReference)interfaceConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceConnector() {
		return serviceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConnector_Source() {
		return (EReference)serviceConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConnector_Target() {
		return (EReference)serviceConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageConnector() {
		return packageConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageConnector_Source() {
		return (EReference)packageConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageConnector_Target() {
		return (EReference)packageConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandatory() {
		return mandatoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptional() {
		return optionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductlineadlFactory getProductlineadlFactory() {
		return (ProductlineadlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		softwareProductLineArchitectureEClass = createEClass(SOFTWARE_PRODUCT_LINE_ARCHITECTURE);
		createEAttribute(softwareProductLineArchitectureEClass, SOFTWARE_PRODUCT_LINE_ARCHITECTURE__GRAPH_TYPE_TREE);
		createEReference(softwareProductLineArchitectureEClass, SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES);
		createEReference(softwareProductLineArchitectureEClass, SOFTWARE_PRODUCT_LINE_ARCHITECTURE__ROOT);
		createEReference(softwareProductLineArchitectureEClass, SOFTWARE_PRODUCT_LINE_ARCHITECTURE__CONSTRAINTS);
		createEReference(softwareProductLineArchitectureEClass, SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPOSITES);
		createEReference(softwareProductLineArchitectureEClass, SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPONENTS);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__ID);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEReference(featureEClass, FEATURE__OUTGOING_EDGE);
		createEReference(featureEClass, FEATURE__INCOMING_EDGE);
		createEReference(featureEClass, FEATURE__OWNING_FEATURE_DIAGRAM);
		createEReference(featureEClass, FEATURE__OPERATOR);
		createEReference(featureEClass, FEATURE__MODEL);
		createEAttribute(featureEClass, FEATURE__SELECTED);
		createEAttribute(featureEClass, FEATURE__MANDATORY);
		createEAttribute(featureEClass, FEATURE__DESCRIPTION);
		createEAttribute(featureEClass, FEATURE__ABSTRACT);
		createEReference(featureEClass, FEATURE__DETAILED_MODEL);
		createEReference(featureEClass, FEATURE__REQUIRED_ELEMENTS);
		createEReference(featureEClass, FEATURE__PROVIDED_ELEMENTS);

		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__PARENT);
		createEReference(edgeEClass, EDGE__CHILD);
		createEAttribute(edgeEClass, EDGE__VALUE);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__TARGET);
		createEReference(constraintEClass, CONSTRAINT__SOURCE);
		createEAttribute(constraintEClass, CONSTRAINT__TEXT);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__OWNING_FEATURE);

		optEClass = createEClass(OPT);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		xorEClass = createEClass(XOR);

		requireEClass = createEClass(REQUIRE);

		mutexEClass = createEClass(MUTEX);

		compositeElementEClass = createEClass(COMPOSITE_ELEMENT);
		createEReference(compositeElementEClass, COMPOSITE_ELEMENT__COMPONENTS);
		createEAttribute(compositeElementEClass, COMPOSITE_ELEMENT__NAME);
		createEReference(compositeElementEClass, COMPOSITE_ELEMENT__CONNECTORS);

		pluginElementEClass = createEClass(PLUGIN_ELEMENT);
		createEAttribute(pluginElementEClass, PLUGIN_ELEMENT__NAME);
		createEAttribute(pluginElementEClass, PLUGIN_ELEMENT__PLUGIN_SYMB_NAME);
		createEReference(pluginElementEClass, PLUGIN_ELEMENT__IMPORT_PACKAGES);
		createEReference(pluginElementEClass, PLUGIN_ELEMENT__EXPORT_PACKAGES);
		createEReference(pluginElementEClass, PLUGIN_ELEMENT__REGISTERED_SERVICES);
		createEReference(pluginElementEClass, PLUGIN_ELEMENT__CONSUMED_SERVICES);
		createEReference(pluginElementEClass, PLUGIN_ELEMENT__REQUIRED_INTERFACES);
		createEReference(pluginElementEClass, PLUGIN_ELEMENT__PROVIDED_INTERFACES);
		createEReference(pluginElementEClass, PLUGIN_ELEMENT__EXTENSION_POINTS);
		createEReference(pluginElementEClass, PLUGIN_ELEMENT__EXTENSIONS);
		createEAttribute(pluginElementEClass, PLUGIN_ELEMENT__PLUGIN_VERSION);

		providedInterfaceElementEClass = createEClass(PROVIDED_INTERFACE_ELEMENT);
		createEAttribute(providedInterfaceElementEClass, PROVIDED_INTERFACE_ELEMENT__INTERFACE_NAME);
		createEAttribute(providedInterfaceElementEClass, PROVIDED_INTERFACE_ELEMENT__OPERATIONS);

		consumedServiceElementEClass = createEClass(CONSUMED_SERVICE_ELEMENT);
		createEAttribute(consumedServiceElementEClass, CONSUMED_SERVICE_ELEMENT__OBJ_NAME);
		createEAttribute(consumedServiceElementEClass, CONSUMED_SERVICE_ELEMENT__INTERFACE_NAME);

		extensionElementEClass = createEClass(EXTENSION_ELEMENT);
		createEAttribute(extensionElementEClass, EXTENSION_ELEMENT__POINT);
		createEAttribute(extensionElementEClass, EXTENSION_ELEMENT__CLASS_NAME);

		extensionPointElementEClass = createEClass(EXTENSION_POINT_ELEMENT);
		createEAttribute(extensionPointElementEClass, EXTENSION_POINT_ELEMENT__ID);
		createEAttribute(extensionPointElementEClass, EXTENSION_POINT_ELEMENT__NAME);
		createEAttribute(extensionPointElementEClass, EXTENSION_POINT_ELEMENT__SCHEMA);

		importedPackageElementEClass = createEClass(IMPORTED_PACKAGE_ELEMENT);
		createEAttribute(importedPackageElementEClass, IMPORTED_PACKAGE_ELEMENT__NAME);

		componentElementEClass = createEClass(COMPONENT_ELEMENT);
		createEReference(componentElementEClass, COMPONENT_ELEMENT__REQUIRED_ELEMENTS);
		createEReference(componentElementEClass, COMPONENT_ELEMENT__PROVIDED_ELEMENTS);

		connectorEClass = createEClass(CONNECTOR);
		createEAttribute(connectorEClass, CONNECTOR__VALUE);

		providedElementEClass = createEClass(PROVIDED_ELEMENT);

		requiredElementEClass = createEClass(REQUIRED_ELEMENT);

		registeredServiceElementEClass = createEClass(REGISTERED_SERVICE_ELEMENT);
		createEAttribute(registeredServiceElementEClass, REGISTERED_SERVICE_ELEMENT__OBJ_NAME);
		createEAttribute(registeredServiceElementEClass, REGISTERED_SERVICE_ELEMENT__INTERFACE_NAME);

		requiredInterfaceElementEClass = createEClass(REQUIRED_INTERFACE_ELEMENT);
		createEAttribute(requiredInterfaceElementEClass, REQUIRED_INTERFACE_ELEMENT__INTERFACE_NAME);
		createEAttribute(requiredInterfaceElementEClass, REQUIRED_INTERFACE_ELEMENT__OPERATIONS);

		exportedPackageElementEClass = createEClass(EXPORTED_PACKAGE_ELEMENT);
		createEAttribute(exportedPackageElementEClass, EXPORTED_PACKAGE_ELEMENT__NAME);

		extensionConnectorEClass = createEClass(EXTENSION_CONNECTOR);
		createEReference(extensionConnectorEClass, EXTENSION_CONNECTOR__SOURCE);
		createEReference(extensionConnectorEClass, EXTENSION_CONNECTOR__TARGET);

		interfaceConnectorEClass = createEClass(INTERFACE_CONNECTOR);
		createEReference(interfaceConnectorEClass, INTERFACE_CONNECTOR__SOURCE);
		createEReference(interfaceConnectorEClass, INTERFACE_CONNECTOR__TARGET);

		serviceConnectorEClass = createEClass(SERVICE_CONNECTOR);
		createEReference(serviceConnectorEClass, SERVICE_CONNECTOR__SOURCE);
		createEReference(serviceConnectorEClass, SERVICE_CONNECTOR__TARGET);

		packageConnectorEClass = createEClass(PACKAGE_CONNECTOR);
		createEReference(packageConnectorEClass, PACKAGE_CONNECTOR__SOURCE);
		createEReference(packageConnectorEClass, PACKAGE_CONNECTOR__TARGET);

		mandatoryEClass = createEClass(MANDATORY);

		optionalEClass = createEClass(OPTIONAL);

		compositionEClass = createEClass(COMPOSITION);

		// Create data types
		booleanEDataType = createEDataType(BOOLEAN);
		stringEDataType = createEDataType(STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		optEClass.getESuperTypes().add(this.getOperator());
		andEClass.getESuperTypes().add(this.getOperator());
		orEClass.getESuperTypes().add(this.getOperator());
		xorEClass.getESuperTypes().add(this.getOperator());
		requireEClass.getESuperTypes().add(this.getConstraint());
		mutexEClass.getESuperTypes().add(this.getConstraint());
		pluginElementEClass.getESuperTypes().add(this.getComponentElement());
		providedInterfaceElementEClass.getESuperTypes().add(this.getProvidedElement());
		consumedServiceElementEClass.getESuperTypes().add(this.getRequiredElement());
		extensionElementEClass.getESuperTypes().add(this.getRequiredElement());
		extensionPointElementEClass.getESuperTypes().add(this.getProvidedElement());
		importedPackageElementEClass.getESuperTypes().add(this.getRequiredElement());
		registeredServiceElementEClass.getESuperTypes().add(this.getProvidedElement());
		requiredInterfaceElementEClass.getESuperTypes().add(this.getRequiredElement());
		exportedPackageElementEClass.getESuperTypes().add(this.getProvidedElement());
		extensionConnectorEClass.getESuperTypes().add(this.getConnector());
		interfaceConnectorEClass.getESuperTypes().add(this.getConnector());
		serviceConnectorEClass.getESuperTypes().add(this.getConnector());
		packageConnectorEClass.getESuperTypes().add(this.getConnector());
		mandatoryEClass.getESuperTypes().add(this.getEdge());
		optionalEClass.getESuperTypes().add(this.getEdge());
		compositionEClass.getESuperTypes().add(this.getEdge());

		// Initialize classes, features, and operations; add parameters
		initEClass(softwareProductLineArchitectureEClass, SoftwareProductLineArchitecture.class, "SoftwareProductLineArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareProductLineArchitecture_GraphTypeTree(), this.getBoolean(), "graphTypeTree", "true", 1, 1, SoftwareProductLineArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareProductLineArchitecture_Features(), this.getFeature(), this.getFeature_OwningFeatureDiagram(), "features", null, 0, -1, SoftwareProductLineArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareProductLineArchitecture_Root(), this.getFeature(), null, "root", null, 1, 1, SoftwareProductLineArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareProductLineArchitecture_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, SoftwareProductLineArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareProductLineArchitecture_Composites(), this.getCompositeElement(), null, "composites", null, 0, -1, SoftwareProductLineArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareProductLineArchitecture_Components(), this.getComponentElement(), null, "components", null, 0, -1, SoftwareProductLineArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Id(), ecorePackage.getEString(), "id", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Name(), this.getString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_OutgoingEdge(), this.getEdge(), this.getEdge_Parent(), "outgoingEdge", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_IncomingEdge(), this.getEdge(), this.getEdge_Child(), "incomingEdge", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_OwningFeatureDiagram(), this.getSoftwareProductLineArchitecture(), this.getSoftwareProductLineArchitecture_Features(), "owningFeatureDiagram", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Operator(), this.getOperator(), this.getOperator_OwningFeature(), "operator", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Model(), this.getCompositeElement(), null, "model", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Selected(), this.getBoolean(), "selected", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Mandatory(), this.getBoolean(), "mandatory", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Description(), this.getString(), "description", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Abstract(), this.getBoolean(), "abstract", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_DetailedModel(), this.getCompositeElement(), null, "detailedModel", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_RequiredElements(), this.getRequiredElement(), null, "requiredElements", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_ProvidedElements(), this.getProvidedElement(), null, "providedElements", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_Parent(), this.getFeature(), this.getFeature_OutgoingEdge(), "parent", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Child(), this.getFeature(), this.getFeature_IncomingEdge(), "child", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Value(), this.getString(), "value", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Target(), this.getFeature(), null, "target", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Source(), this.getFeature(), null, "source", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_Text(), this.getString(), "text", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_OwningFeature(), this.getFeature(), this.getFeature_Operator(), "owningFeature", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optEClass, Opt.class, "Opt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorEClass, Xor.class, "Xor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requireEClass, Require.class, "Require", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mutexEClass, Mutex.class, "Mutex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeElementEClass, CompositeElement.class, "CompositeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeElement_Components(), this.getComponentElement(), null, "components", null, 0, -1, CompositeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, CompositeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeElement_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, CompositeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginElementEClass, PluginElement.class, "PluginElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPluginElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, PluginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginElement_PluginSymbName(), ecorePackage.getEString(), "pluginSymbName", null, 0, 1, PluginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginElement_Import_packages(), this.getImportedPackageElement(), null, "import_packages", null, 0, -1, PluginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginElement_Export_packages(), this.getExportedPackageElement(), null, "export_packages", null, 0, -1, PluginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginElement_RegisteredServices(), this.getRegisteredServiceElement(), null, "registeredServices", null, 0, -1, PluginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginElement_ConsumedServices(), this.getConsumedServiceElement(), null, "consumedServices", null, 0, -1, PluginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginElement_RequiredInterfaces(), this.getRequiredInterfaceElement(), null, "requiredInterfaces", null, 0, -1, PluginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginElement_ProvidedInterfaces(), this.getProvidedInterfaceElement(), null, "providedInterfaces", null, 0, -1, PluginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginElement_ExtensionPoints(), this.getExtensionPointElement(), null, "extensionPoints", null, 0, -1, PluginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginElement_Extensions(), this.getExtensionElement(), null, "extensions", null, 0, -1, PluginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginElement_PluginVersion(), ecorePackage.getEString(), "pluginVersion", null, 0, 1, PluginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedInterfaceElementEClass, ProvidedInterfaceElement.class, "ProvidedInterfaceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvidedInterfaceElement_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 0, 1, ProvidedInterfaceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvidedInterfaceElement_Operations(), ecorePackage.getEString(), "operations", null, 0, -1, ProvidedInterfaceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consumedServiceElementEClass, ConsumedServiceElement.class, "ConsumedServiceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsumedServiceElement_ObjName(), ecorePackage.getEString(), "objName", null, 0, 1, ConsumedServiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsumedServiceElement_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 0, 1, ConsumedServiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionElementEClass, ExtensionElement.class, "ExtensionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensionElement_Point(), ecorePackage.getEString(), "point", null, 0, 1, ExtensionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtensionElement_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, ExtensionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionPointElementEClass, ExtensionPointElement.class, "ExtensionPointElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensionPointElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, ExtensionPointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtensionPointElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExtensionPointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtensionPointElement_Schema(), ecorePackage.getEString(), "schema", null, 0, 1, ExtensionPointElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importedPackageElementEClass, ImportedPackageElement.class, "ImportedPackageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportedPackageElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImportedPackageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentElementEClass, ComponentElement.class, "ComponentElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentElement_RequiredElements(), this.getRequiredElement(), null, "requiredElements", null, 0, -1, ComponentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentElement_ProvidedElements(), this.getProvidedElement(), null, "providedElements", null, 0, -1, ComponentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnector_Value(), this.getString(), "value", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedElementEClass, ProvidedElement.class, "ProvidedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredElementEClass, RequiredElement.class, "RequiredElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(registeredServiceElementEClass, RegisteredServiceElement.class, "RegisteredServiceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegisteredServiceElement_ObjName(), ecorePackage.getEString(), "objName", null, 0, 1, RegisteredServiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegisteredServiceElement_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 0, 1, RegisteredServiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredInterfaceElementEClass, RequiredInterfaceElement.class, "RequiredInterfaceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredInterfaceElement_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 0, 1, RequiredInterfaceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequiredInterfaceElement_Operations(), ecorePackage.getEString(), "operations", null, 0, -1, RequiredInterfaceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportedPackageElementEClass, ExportedPackageElement.class, "ExportedPackageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExportedPackageElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExportedPackageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionConnectorEClass, ExtensionConnector.class, "ExtensionConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensionConnector_Source(), this.getExtensionElement(), null, "source", null, 1, 1, ExtensionConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionConnector_Target(), this.getExtensionPointElement(), null, "target", null, 1, 1, ExtensionConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceConnectorEClass, InterfaceConnector.class, "InterfaceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceConnector_Source(), this.getRequiredInterfaceElement(), null, "source", null, 1, 1, InterfaceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceConnector_Target(), this.getProvidedInterfaceElement(), null, "target", null, 1, 1, InterfaceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConnectorEClass, ServiceConnector.class, "ServiceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceConnector_Source(), this.getConsumedServiceElement(), null, "source", null, 1, 1, ServiceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConnector_Target(), this.getRegisteredServiceElement(), null, "target", null, 1, 1, ServiceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageConnectorEClass, PackageConnector.class, "PackageConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageConnector_Source(), this.getImportedPackageElement(), null, "source", null, 1, 1, PackageConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageConnector_Target(), this.getExportedPackageElement(), null, "target", null, 1, 1, PackageConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mandatoryEClass, Mandatory.class, "Mandatory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(optionalEClass, Optional.class, "Optional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// TextualConstraint
		createTextualConstraintAnnotations();
	}

	/**
	 * Initializes the annotations for <b>TextualConstraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTextualConstraintAnnotations() {
		String source = "TextualConstraint";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

} //ProductlineadlPackageImpl
