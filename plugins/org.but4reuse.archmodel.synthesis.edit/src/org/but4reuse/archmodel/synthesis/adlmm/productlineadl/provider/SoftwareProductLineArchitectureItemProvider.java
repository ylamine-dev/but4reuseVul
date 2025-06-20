/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.provider;


import java.util.Collection;
import java.util.List;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareProductLineArchitectureItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareProductLineArchitectureItemProvider(AdapterFactory adapterFactory) {
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

			addGraphTypeTreePropertyDescriptor(object);
			addRootPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Graph Type Tree feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGraphTypeTreePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareProductLineArchitecture_graphTypeTree_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareProductLineArchitecture_graphTypeTree_feature", "_UI_SoftwareProductLineArchitecture_type"),
				 ProductlineadlPackage.Literals.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__GRAPH_TYPE_TREE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Root feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareProductLineArchitecture_root_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareProductLineArchitecture_root_feature", "_UI_SoftwareProductLineArchitecture_type"),
				 ProductlineadlPackage.Literals.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__ROOT,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ProductlineadlPackage.Literals.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES);
			childrenFeatures.add(ProductlineadlPackage.Literals.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__CONSTRAINTS);
			childrenFeatures.add(ProductlineadlPackage.Literals.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPOSITES);
			childrenFeatures.add(ProductlineadlPackage.Literals.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPONENTS);
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
	 * This returns SoftwareProductLineArchitecture.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SoftwareProductLineArchitecture"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Boolean labelValue = ((SoftwareProductLineArchitecture)object).getGraphTypeTree();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SoftwareProductLineArchitecture_type") :
			getString("_UI_SoftwareProductLineArchitecture_type") + " " + label;
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

		switch (notification.getFeatureID(SoftwareProductLineArchitecture.class)) {
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__GRAPH_TYPE_TREE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES:
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__CONSTRAINTS:
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPOSITES:
			case ProductlineadlPackage.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPONENTS:
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
				(ProductlineadlPackage.Literals.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__FEATURES,
				 ProductlineadlFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__CONSTRAINTS,
				 ProductlineadlFactory.eINSTANCE.createRequire()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__CONSTRAINTS,
				 ProductlineadlFactory.eINSTANCE.createMutex()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPOSITES,
				 ProductlineadlFactory.eINSTANCE.createCompositeElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.SOFTWARE_PRODUCT_LINE_ARCHITECTURE__COMPONENTS,
				 ProductlineadlFactory.eINSTANCE.createPluginElement()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ProductlineadlEditPlugin.INSTANCE;
	}

}
