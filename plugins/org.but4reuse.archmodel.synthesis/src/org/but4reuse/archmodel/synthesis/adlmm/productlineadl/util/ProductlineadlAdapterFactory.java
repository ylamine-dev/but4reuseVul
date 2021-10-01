/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.util;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage
 * @generated
 */
public class ProductlineadlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProductlineadlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductlineadlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProductlineadlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductlineadlSwitch<Adapter> modelSwitch =
		new ProductlineadlSwitch<Adapter>() {
			@Override
			public Adapter caseSoftwareProductLineArchitecture(SoftwareProductLineArchitecture object) {
				return createSoftwareProductLineArchitectureAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseOpt(Opt object) {
				return createOptAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseXor(Xor object) {
				return createXorAdapter();
			}
			@Override
			public Adapter caseRequire(Require object) {
				return createRequireAdapter();
			}
			@Override
			public Adapter caseMutex(Mutex object) {
				return createMutexAdapter();
			}
			@Override
			public Adapter caseCompositeElement(CompositeElement object) {
				return createCompositeElementAdapter();
			}
			@Override
			public Adapter casePluginElement(PluginElement object) {
				return createPluginElementAdapter();
			}
			@Override
			public Adapter caseProvidedInterfaceElement(ProvidedInterfaceElement object) {
				return createProvidedInterfaceElementAdapter();
			}
			@Override
			public Adapter caseConsumedServiceElement(ConsumedServiceElement object) {
				return createConsumedServiceElementAdapter();
			}
			@Override
			public Adapter caseExtensionElement(ExtensionElement object) {
				return createExtensionElementAdapter();
			}
			@Override
			public Adapter caseExtensionPointElement(ExtensionPointElement object) {
				return createExtensionPointElementAdapter();
			}
			@Override
			public Adapter caseImportedPackageElement(ImportedPackageElement object) {
				return createImportedPackageElementAdapter();
			}
			@Override
			public Adapter caseComponentElement(ComponentElement object) {
				return createComponentElementAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseProvidedElement(ProvidedElement object) {
				return createProvidedElementAdapter();
			}
			@Override
			public Adapter caseRequiredElement(RequiredElement object) {
				return createRequiredElementAdapter();
			}
			@Override
			public Adapter caseRegisteredServiceElement(RegisteredServiceElement object) {
				return createRegisteredServiceElementAdapter();
			}
			@Override
			public Adapter caseRequiredInterfaceElement(RequiredInterfaceElement object) {
				return createRequiredInterfaceElementAdapter();
			}
			@Override
			public Adapter caseExportedPackageElement(ExportedPackageElement object) {
				return createExportedPackageElementAdapter();
			}
			@Override
			public Adapter caseExtensionConnector(ExtensionConnector object) {
				return createExtensionConnectorAdapter();
			}
			@Override
			public Adapter caseInterfaceConnector(InterfaceConnector object) {
				return createInterfaceConnectorAdapter();
			}
			@Override
			public Adapter caseServiceConnector(ServiceConnector object) {
				return createServiceConnectorAdapter();
			}
			@Override
			public Adapter casePackageConnector(PackageConnector object) {
				return createPackageConnectorAdapter();
			}
			@Override
			public Adapter caseMandatory(Mandatory object) {
				return createMandatoryAdapter();
			}
			@Override
			public Adapter caseOptional(Optional object) {
				return createOptionalAdapter();
			}
			@Override
			public Adapter caseComposition(Composition object) {
				return createCompositionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture <em>Software Product Line Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture
	 * @generated
	 */
	public Adapter createSoftwareProductLineArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Opt <em>Opt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Opt
	 * @generated
	 */
	public Adapter createOptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Xor
	 * @generated
	 */
	public Adapter createXorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Require <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Require
	 * @generated
	 */
	public Adapter createRequireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Mutex <em>Mutex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Mutex
	 * @generated
	 */
	public Adapter createMutexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement <em>Composite Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement
	 * @generated
	 */
	public Adapter createCompositeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement <em>Plugin Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement
	 * @generated
	 */
	public Adapter createPluginElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedInterfaceElement <em>Provided Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedInterfaceElement
	 * @generated
	 */
	public Adapter createProvidedInterfaceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement <em>Consumed Service Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement
	 * @generated
	 */
	public Adapter createConsumedServiceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement <em>Extension Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement
	 * @generated
	 */
	public Adapter createExtensionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement <em>Extension Point Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement
	 * @generated
	 */
	public Adapter createExtensionPointElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ImportedPackageElement <em>Imported Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ImportedPackageElement
	 * @generated
	 */
	public Adapter createImportedPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement <em>Component Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement
	 * @generated
	 */
	public Adapter createComponentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedElement <em>Provided Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedElement
	 * @generated
	 */
	public Adapter createProvidedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredElement <em>Required Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredElement
	 * @generated
	 */
	public Adapter createRequiredElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement <em>Registered Service Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement
	 * @generated
	 */
	public Adapter createRegisteredServiceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement <em>Required Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement
	 * @generated
	 */
	public Adapter createRequiredInterfaceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExportedPackageElement <em>Exported Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExportedPackageElement
	 * @generated
	 */
	public Adapter createExportedPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionConnector <em>Extension Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionConnector
	 * @generated
	 */
	public Adapter createExtensionConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.InterfaceConnector <em>Interface Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.InterfaceConnector
	 * @generated
	 */
	public Adapter createInterfaceConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ServiceConnector <em>Service Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ServiceConnector
	 * @generated
	 */
	public Adapter createServiceConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PackageConnector <em>Package Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PackageConnector
	 * @generated
	 */
	public Adapter createPackageConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Mandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Mandatory
	 * @generated
	 */
	public Adapter createMandatoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Optional
	 * @generated
	 */
	public Adapter createOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProductlineadlAdapterFactory
