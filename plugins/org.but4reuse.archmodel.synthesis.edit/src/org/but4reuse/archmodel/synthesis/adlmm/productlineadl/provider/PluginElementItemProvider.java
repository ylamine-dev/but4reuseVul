/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.provider;


import java.util.Collection;
import java.util.List;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PluginElementItemProvider extends ComponentElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addPluginSymbNamePropertyDescriptor(object);
			addPluginVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginElement_name_feature", "_UI_PluginElement_type"),
				 ProductlineadlPackage.Literals.PLUGIN_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugin Symb Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPluginSymbNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginElement_pluginSymbName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginElement_pluginSymbName_feature", "_UI_PluginElement_type"),
				 ProductlineadlPackage.Literals.PLUGIN_ELEMENT__PLUGIN_SYMB_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugin Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPluginVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginElement_pluginVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginElement_pluginVersion_feature", "_UI_PluginElement_type"),
				 ProductlineadlPackage.Literals.PLUGIN_ELEMENT__PLUGIN_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__IMPORT_PACKAGES);
			childrenFeatures.add(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__EXPORT_PACKAGES);
			childrenFeatures.add(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__REGISTERED_SERVICES);
			childrenFeatures.add(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__CONSUMED_SERVICES);
			childrenFeatures.add(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__REQUIRED_INTERFACES);
			childrenFeatures.add(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__PROVIDED_INTERFACES);
			childrenFeatures.add(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__EXTENSION_POINTS);
			childrenFeatures.add(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__EXTENSIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PluginElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PluginElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PluginElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PluginElement_type") :
			getString("_UI_PluginElement_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PluginElement.class)) {
			case ProductlineadlPackage.PLUGIN_ELEMENT__NAME:
			case ProductlineadlPackage.PLUGIN_ELEMENT__PLUGIN_SYMB_NAME:
			case ProductlineadlPackage.PLUGIN_ELEMENT__PLUGIN_VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProductlineadlPackage.PLUGIN_ELEMENT__IMPORT_PACKAGES:
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXPORT_PACKAGES:
			case ProductlineadlPackage.PLUGIN_ELEMENT__REGISTERED_SERVICES:
			case ProductlineadlPackage.PLUGIN_ELEMENT__CONSUMED_SERVICES:
			case ProductlineadlPackage.PLUGIN_ELEMENT__REQUIRED_INTERFACES:
			case ProductlineadlPackage.PLUGIN_ELEMENT__PROVIDED_INTERFACES:
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXTENSION_POINTS:
			case ProductlineadlPackage.PLUGIN_ELEMENT__EXTENSIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__IMPORT_PACKAGES,
				 ProductlineadlFactory.eINSTANCE.createImportedPackageElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__EXPORT_PACKAGES,
				 ProductlineadlFactory.eINSTANCE.createExportedPackageElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__REGISTERED_SERVICES,
				 ProductlineadlFactory.eINSTANCE.createRegisteredServiceElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__CONSUMED_SERVICES,
				 ProductlineadlFactory.eINSTANCE.createConsumedServiceElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__REQUIRED_INTERFACES,
				 ProductlineadlFactory.eINSTANCE.createRequiredInterfaceElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__PROVIDED_INTERFACES,
				 ProductlineadlFactory.eINSTANCE.createProvidedInterfaceElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__EXTENSION_POINTS,
				 ProductlineadlFactory.eINSTANCE.createExtensionPointElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.PLUGIN_ELEMENT__EXTENSIONS,
				 ProductlineadlFactory.eINSTANCE.createExtensionElement()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ProductlineadlPackage.Literals.COMPONENT_ELEMENT__REQUIRED_ELEMENTS ||
			childFeature == ProductlineadlPackage.Literals.PLUGIN_ELEMENT__CONSUMED_SERVICES ||
			childFeature == ProductlineadlPackage.Literals.PLUGIN_ELEMENT__EXTENSIONS ||
			childFeature == ProductlineadlPackage.Literals.PLUGIN_ELEMENT__IMPORT_PACKAGES ||
			childFeature == ProductlineadlPackage.Literals.PLUGIN_ELEMENT__REQUIRED_INTERFACES ||
			childFeature == ProductlineadlPackage.Literals.COMPONENT_ELEMENT__PROVIDED_ELEMENTS ||
			childFeature == ProductlineadlPackage.Literals.PLUGIN_ELEMENT__PROVIDED_INTERFACES ||
			childFeature == ProductlineadlPackage.Literals.PLUGIN_ELEMENT__EXTENSION_POINTS ||
			childFeature == ProductlineadlPackage.Literals.PLUGIN_ELEMENT__REGISTERED_SERVICES ||
			childFeature == ProductlineadlPackage.Literals.PLUGIN_ELEMENT__EXPORT_PACKAGES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
