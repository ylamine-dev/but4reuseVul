/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl;

import java.util.Collection;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExportedPackageElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ImportedPackageElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedInterfaceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl#getPluginSymbName <em>Plugin Symb Name</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl#getImport_packages <em>Import packages</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl#getExport_packages <em>Export packages</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl#getRegisteredServices <em>Registered Services</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl#getConsumedServices <em>Consumed Services</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.PluginElementImpl#getPluginVersion <em>Plugin Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PluginElementImpl extends ComponentElementImpl implements PluginElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluginSymbName() <em>Plugin Symb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginSymbName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_SYMB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginSymbName() <em>Plugin Symb Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginSymbName()
	 * @generated
	 * @ordered
	 */
	protected String pluginSymbName = PLUGIN_SYMB_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImport_packages() <em>Import packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport_packages()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportedPackageElement> import_packages;

	/**
	 * The cached value of the '{@link #getExport_packages() <em>Export packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport_packages()
	 * @generated
	 * @ordered
	 */
	protected EList<ExportedPackageElement> export_packages;

	/**
	 * The cached value of the '{@link #getRegisteredServices() <em>Registered Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredServices()
	 * @generated
	 * @ordered
	 */
	protected EList<RegisteredServiceElement> registeredServices;

	/**
	 * The cached value of the '{@link #getConsumedServices() <em>Consumed Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsumedServiceElement> consumedServices;

	/**
	 * The cached value of the '{@link #getRequiredInterfaces() <em>Required Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredInterfaceElement> requiredInterfaces;

	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedInterfaceElement> providedInterfaces;

	/**
	 * The cached value of the '{@link #getExtensionPoints() <em>Extension Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionPointElement> extensionPoints;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionElement> extensions;

	/**
	 * The default value of the '{@link #getPluginVersion() <em>Plugin Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginVersion() <em>Plugin Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginVersion()
	 * @generated
	 * @ordered
	 */
	protected String pluginVersion = PLUGIN_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductlineadlPackage.Literals.PLUGIN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductlineadlPackage.PLUGIN_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginSymbName() {
		return pluginSymbName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginSymbName(String newPluginSymbName) {
		String oldPluginSymbName = pluginSymbName;
		pluginSymbName = newPluginSymbName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductlineadlPackage.PLUGIN_ELEMENT__PLUGIN_SYMB_NAME, oldPluginSymbName, pluginSymbName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportedPackageElement> getImport_packages() {
		if (import_packages == null) {
			import_packages = new EObjectContainmentEList<ImportedPackageElement>(ImportedPackageElement.class, this, ProductlineadlPackage.PLUGIN_ELEMENT__IMPORT_PACKAGES);
		}
		return import_packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExportedPackageElement> getExport_packages() {
		if (export_packages == null) {
			export_packages = new EObjectContainmentEList<ExportedPackageElement>(ExportedPackageElement.class, this, ProductlineadlPackage.PLUGIN_ELEMENT__EXPORT_PACKAGES);
		}
		return export_packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisteredServiceElement> getRegisteredServices() {
		if (registeredServices == null) {
			registeredServices = new EObjectContainmentEList<RegisteredServiceElement>(RegisteredServiceElement.class, this, ProductlineadlPackage.PLUGIN_ELEMENT__REGISTERED_SERVICES);
		}
		return registeredServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConsumedServiceElement> getConsumedServices() {
		if (consumedServices == null) {
			consumedServices = new EObjectContainmentEList<ConsumedServiceElement>(ConsumedServiceElement.class, this, ProductlineadlPackage.PLUGIN_ELEMENT__CONSUMED_SERVICES);
		}
		return consumedServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredInterfaceElement> getRequiredInterfaces() {
		if (requiredInterfaces == null) {
			requiredInterfaces = new EObjectContainmentEList<RequiredInterfaceElement>(RequiredInterfaceElement.class, this, ProductlineadlPackage.PLUGIN_ELEMENT__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedInterfaceElement> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectContainmentEList<ProvidedInterfaceElement>(ProvidedInterfaceElement.class, this, ProductlineadlPackage.PLUGIN_ELEMENT__PROVIDED_INTERFACES);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionPointElement> getExtensionPoints() {
		if (extensionPoints == null) {
			extensionPoints = new EObjectContainmentEList<ExtensionPointElement>(ExtensionPointElement.class, this, ProductlineadlPackage.PLUGIN_ELEMENT__EXTENSION_POINTS);
		}
		return extensionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionElement> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentEList<ExtensionElement>(ExtensionElement.class, this, ProductlineadlPackage.PLUGIN_ELEMENT__EXTENSIONS);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginVersion() {
		return pluginVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginVersion(String newPluginVersion) {
		String oldPluginVersion = pluginVersion;
		pluginVersion = newPluginVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductlineadlPackage.PLUGIN_ELEMENT__PLUGIN_VERSION, oldPluginVersion, pluginVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductlineadlPackage.PLUGIN_ELEMENT__IMPORT_PACKAGES:
				return ((InternalEList<?>)getImport_packages()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXPORT_PACKAGES:
				return ((InternalEList<?>)getExport_packages()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.PLUGIN_ELEMENT__REGISTERED_SERVICES:
				return ((InternalEList<?>)getRegisteredServices()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.PLUGIN_ELEMENT__CONSUMED_SERVICES:
				return ((InternalEList<?>)getConsumedServices()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.PLUGIN_ELEMENT__REQUIRED_INTERFACES:
				return ((InternalEList<?>)getRequiredInterfaces()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.PLUGIN_ELEMENT__PROVIDED_INTERFACES:
				return ((InternalEList<?>)getProvidedInterfaces()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXTENSION_POINTS:
				return ((InternalEList<?>)getExtensionPoints()).basicRemove(otherEnd, msgs);
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductlineadlPackage.PLUGIN_ELEMENT__NAME:
				return getName();
			case ProductlineadlPackage.PLUGIN_ELEMENT__PLUGIN_SYMB_NAME:
				return getPluginSymbName();
			case ProductlineadlPackage.PLUGIN_ELEMENT__IMPORT_PACKAGES:
				return getImport_packages();
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXPORT_PACKAGES:
				return getExport_packages();
			case ProductlineadlPackage.PLUGIN_ELEMENT__REGISTERED_SERVICES:
				return getRegisteredServices();
			case ProductlineadlPackage.PLUGIN_ELEMENT__CONSUMED_SERVICES:
				return getConsumedServices();
			case ProductlineadlPackage.PLUGIN_ELEMENT__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case ProductlineadlPackage.PLUGIN_ELEMENT__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXTENSION_POINTS:
				return getExtensionPoints();
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXTENSIONS:
				return getExtensions();
			case ProductlineadlPackage.PLUGIN_ELEMENT__PLUGIN_VERSION:
				return getPluginVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductlineadlPackage.PLUGIN_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__PLUGIN_SYMB_NAME:
				setPluginSymbName((String)newValue);
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__IMPORT_PACKAGES:
				getImport_packages().clear();
				getImport_packages().addAll((Collection<? extends ImportedPackageElement>)newValue);
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXPORT_PACKAGES:
				getExport_packages().clear();
				getExport_packages().addAll((Collection<? extends ExportedPackageElement>)newValue);
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__REGISTERED_SERVICES:
				getRegisteredServices().clear();
				getRegisteredServices().addAll((Collection<? extends RegisteredServiceElement>)newValue);
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__CONSUMED_SERVICES:
				getConsumedServices().clear();
				getConsumedServices().addAll((Collection<? extends ConsumedServiceElement>)newValue);
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				getRequiredInterfaces().addAll((Collection<? extends RequiredInterfaceElement>)newValue);
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				getProvidedInterfaces().addAll((Collection<? extends ProvidedInterfaceElement>)newValue);
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXTENSION_POINTS:
				getExtensionPoints().clear();
				getExtensionPoints().addAll((Collection<? extends ExtensionPointElement>)newValue);
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXTENSIONS:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends ExtensionElement>)newValue);
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__PLUGIN_VERSION:
				setPluginVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProductlineadlPackage.PLUGIN_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__PLUGIN_SYMB_NAME:
				setPluginSymbName(PLUGIN_SYMB_NAME_EDEFAULT);
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__IMPORT_PACKAGES:
				getImport_packages().clear();
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXPORT_PACKAGES:
				getExport_packages().clear();
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__REGISTERED_SERVICES:
				getRegisteredServices().clear();
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__CONSUMED_SERVICES:
				getConsumedServices().clear();
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXTENSION_POINTS:
				getExtensionPoints().clear();
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXTENSIONS:
				getExtensions().clear();
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__PLUGIN_VERSION:
				setPluginVersion(PLUGIN_VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProductlineadlPackage.PLUGIN_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProductlineadlPackage.PLUGIN_ELEMENT__PLUGIN_SYMB_NAME:
				return PLUGIN_SYMB_NAME_EDEFAULT == null ? pluginSymbName != null : !PLUGIN_SYMB_NAME_EDEFAULT.equals(pluginSymbName);
			case ProductlineadlPackage.PLUGIN_ELEMENT__IMPORT_PACKAGES:
				return import_packages != null && !import_packages.isEmpty();
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXPORT_PACKAGES:
				return export_packages != null && !export_packages.isEmpty();
			case ProductlineadlPackage.PLUGIN_ELEMENT__REGISTERED_SERVICES:
				return registeredServices != null && !registeredServices.isEmpty();
			case ProductlineadlPackage.PLUGIN_ELEMENT__CONSUMED_SERVICES:
				return consumedServices != null && !consumedServices.isEmpty();
			case ProductlineadlPackage.PLUGIN_ELEMENT__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case ProductlineadlPackage.PLUGIN_ELEMENT__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXTENSION_POINTS:
				return extensionPoints != null && !extensionPoints.isEmpty();
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXTENSIONS:
				return extensions != null && !extensions.isEmpty();
			case ProductlineadlPackage.PLUGIN_ELEMENT__PLUGIN_VERSION:
				return PLUGIN_VERSION_EDEFAULT == null ? pluginVersion != null : !PLUGIN_VERSION_EDEFAULT.equals(pluginVersion);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", pluginSymbName: ");
		result.append(pluginSymbName);
		result.append(", pluginVersion: ");
		result.append(pluginVersion);
		result.append(')');
		return result.toString();
	}

} //PluginElementImpl
