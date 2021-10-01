/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.util;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage
 * @generated
 */
public class ProductlineadlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProductlineadlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductlineadlSwitch() {
		if (modelPackage == null) {
			modelPackage = ProductlineadlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE: {
				SoftwareProductLineArchitecture softwareProductLineArchitecture = (SoftwareProductLineArchitecture)theEObject;
				T result = caseSoftwareProductLineArchitecture(softwareProductLineArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.OPT: {
				Opt opt = (Opt)theEObject;
				T result = caseOpt(opt);
				if (result == null) result = caseOperator(opt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseOperator(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseOperator(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.XOR: {
				Xor xor = (Xor)theEObject;
				T result = caseXor(xor);
				if (result == null) result = caseOperator(xor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.REQUIRE: {
				Require require = (Require)theEObject;
				T result = caseRequire(require);
				if (result == null) result = caseConstraint(require);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.MUTEX: {
				Mutex mutex = (Mutex)theEObject;
				T result = caseMutex(mutex);
				if (result == null) result = caseConstraint(mutex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.COMPOSITE_ELEMENT: {
				CompositeElement compositeElement = (CompositeElement)theEObject;
				T result = caseCompositeElement(compositeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.PLUGIN_ELEMENT: {
				PluginElement pluginElement = (PluginElement)theEObject;
				T result = casePluginElement(pluginElement);
				if (result == null) result = caseComponentElement(pluginElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.PROVIDED_INTERFACE_ELEMENT: {
				ProvidedInterfaceElement providedInterfaceElement = (ProvidedInterfaceElement)theEObject;
				T result = caseProvidedInterfaceElement(providedInterfaceElement);
				if (result == null) result = caseProvidedElement(providedInterfaceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.CONSUMED_SERVICE_ELEMENT: {
				ConsumedServiceElement consumedServiceElement = (ConsumedServiceElement)theEObject;
				T result = caseConsumedServiceElement(consumedServiceElement);
				if (result == null) result = caseRequiredElement(consumedServiceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.EXTENSION_ELEMENT: {
				ExtensionElement extensionElement = (ExtensionElement)theEObject;
				T result = caseExtensionElement(extensionElement);
				if (result == null) result = caseRequiredElement(extensionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.EXTENSION_POINT_ELEMENT: {
				ExtensionPointElement extensionPointElement = (ExtensionPointElement)theEObject;
				T result = caseExtensionPointElement(extensionPointElement);
				if (result == null) result = caseProvidedElement(extensionPointElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.IMPORTED_PACKAGE_ELEMENT: {
				ImportedPackageElement importedPackageElement = (ImportedPackageElement)theEObject;
				T result = caseImportedPackageElement(importedPackageElement);
				if (result == null) result = caseRequiredElement(importedPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.COMPONENT_ELEMENT: {
				ComponentElement componentElement = (ComponentElement)theEObject;
				T result = caseComponentElement(componentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.PROVIDED_ELEMENT: {
				ProvidedElement providedElement = (ProvidedElement)theEObject;
				T result = caseProvidedElement(providedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.REQUIRED_ELEMENT: {
				RequiredElement requiredElement = (RequiredElement)theEObject;
				T result = caseRequiredElement(requiredElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.REGISTERED_SERVICE_ELEMENT: {
				RegisteredServiceElement registeredServiceElement = (RegisteredServiceElement)theEObject;
				T result = caseRegisteredServiceElement(registeredServiceElement);
				if (result == null) result = caseProvidedElement(registeredServiceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.REQUIRED_INTERFACE_ELEMENT: {
				RequiredInterfaceElement requiredInterfaceElement = (RequiredInterfaceElement)theEObject;
				T result = caseRequiredInterfaceElement(requiredInterfaceElement);
				if (result == null) result = caseRequiredElement(requiredInterfaceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.EXPORTED_PACKAGE_ELEMENT: {
				ExportedPackageElement exportedPackageElement = (ExportedPackageElement)theEObject;
				T result = caseExportedPackageElement(exportedPackageElement);
				if (result == null) result = caseProvidedElement(exportedPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.EXTENSION_CONNECTOR: {
				ExtensionConnector extensionConnector = (ExtensionConnector)theEObject;
				T result = caseExtensionConnector(extensionConnector);
				if (result == null) result = caseConnector(extensionConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.INTERFACE_CONNECTOR: {
				InterfaceConnector interfaceConnector = (InterfaceConnector)theEObject;
				T result = caseInterfaceConnector(interfaceConnector);
				if (result == null) result = caseConnector(interfaceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.SERVICE_CONNECTOR: {
				ServiceConnector serviceConnector = (ServiceConnector)theEObject;
				T result = caseServiceConnector(serviceConnector);
				if (result == null) result = caseConnector(serviceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.PACKAGE_CONNECTOR: {
				PackageConnector packageConnector = (PackageConnector)theEObject;
				T result = casePackageConnector(packageConnector);
				if (result == null) result = caseConnector(packageConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.MANDATORY: {
				Mandatory mandatory = (Mandatory)theEObject;
				T result = caseMandatory(mandatory);
				if (result == null) result = caseEdge(mandatory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.OPTIONAL: {
				Optional optional = (Optional)theEObject;
				T result = caseOptional(optional);
				if (result == null) result = caseEdge(optional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProductlineadlPackage.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				T result = caseComposition(composition);
				if (result == null) result = caseEdge(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Product Line Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Product Line Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareProductLineArchitecture(SoftwareProductLineArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpt(Opt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXor(Xor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Require</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Require</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequire(Require object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mutex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mutex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMutex(Mutex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeElement(CompositeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePluginElement(PluginElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Interface Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Interface Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedInterfaceElement(ProvidedInterfaceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumed Service Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumed Service Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumedServiceElement(ConsumedServiceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionElement(ExtensionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Point Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Point Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionPointElement(ExtensionPointElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imported Package Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imported Package Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportedPackageElement(ImportedPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentElement(ComponentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedElement(ProvidedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredElement(RequiredElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registered Service Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registered Service Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisteredServiceElement(RegisteredServiceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Interface Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Interface Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredInterfaceElement(RequiredInterfaceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exported Package Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exported Package Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportedPackageElement(ExportedPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionConnector(ExtensionConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceConnector(InterfaceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceConnector(ServiceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageConnector(PackageConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatory(Mandatory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptional(Optional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProductlineadlSwitch
