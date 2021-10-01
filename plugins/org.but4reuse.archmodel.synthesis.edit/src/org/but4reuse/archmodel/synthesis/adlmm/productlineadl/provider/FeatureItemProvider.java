/**
 */
package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.provider;


import java.util.Collection;
import java.util.List;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;

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
 * This is the item provider adapter for a {@link org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureItemProvider 
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
	public FeatureItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addIncomingEdgePropertyDescriptor(object);
			addSelectedPropertyDescriptor(object);
			addMandatoryPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addAbstractPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_id_feature", "_UI_Feature_type"),
				 ProductlineadlPackage.Literals.FEATURE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Feature_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_name_feature", "_UI_Feature_type"),
				 ProductlineadlPackage.Literals.FEATURE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incoming Edge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingEdgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_incomingEdge_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_incomingEdge_feature", "_UI_Feature_type"),
				 ProductlineadlPackage.Literals.FEATURE__INCOMING_EDGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_selected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_selected_feature", "_UI_Feature_type"),
				 ProductlineadlPackage.Literals.FEATURE__SELECTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mandatory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMandatoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_mandatory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_mandatory_feature", "_UI_Feature_type"),
				 ProductlineadlPackage.Literals.FEATURE__MANDATORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_description_feature", "_UI_Feature_type"),
				 ProductlineadlPackage.Literals.FEATURE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_abstract_feature", "_UI_Feature_type"),
				 ProductlineadlPackage.Literals.FEATURE__ABSTRACT,
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
			childrenFeatures.add(ProductlineadlPackage.Literals.FEATURE__OUTGOING_EDGE);
			childrenFeatures.add(ProductlineadlPackage.Literals.FEATURE__OPERATOR);
			childrenFeatures.add(ProductlineadlPackage.Literals.FEATURE__MODEL);
			childrenFeatures.add(ProductlineadlPackage.Literals.FEATURE__DETAILED_MODEL);
			childrenFeatures.add(ProductlineadlPackage.Literals.FEATURE__REQUIRED_ELEMENTS);
			childrenFeatures.add(ProductlineadlPackage.Literals.FEATURE__PROVIDED_ELEMENTS);
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
	 * This returns Feature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Feature"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Feature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Feature_type") :
			getString("_UI_Feature_type") + " " + label;
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

		switch (notification.getFeatureID(Feature.class)) {
			case ProductlineadlPackage.FEATURE__ID:
			case ProductlineadlPackage.FEATURE__NAME:
			case ProductlineadlPackage.FEATURE__SELECTED:
			case ProductlineadlPackage.FEATURE__MANDATORY:
			case ProductlineadlPackage.FEATURE__DESCRIPTION:
			case ProductlineadlPackage.FEATURE__ABSTRACT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProductlineadlPackage.FEATURE__OUTGOING_EDGE:
			case ProductlineadlPackage.FEATURE__OPERATOR:
			case ProductlineadlPackage.FEATURE__MODEL:
			case ProductlineadlPackage.FEATURE__DETAILED_MODEL:
			case ProductlineadlPackage.FEATURE__REQUIRED_ELEMENTS:
			case ProductlineadlPackage.FEATURE__PROVIDED_ELEMENTS:
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
				(ProductlineadlPackage.Literals.FEATURE__OUTGOING_EDGE,
				 ProductlineadlFactory.eINSTANCE.createMandatory()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__OUTGOING_EDGE,
				 ProductlineadlFactory.eINSTANCE.createOptional()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__OUTGOING_EDGE,
				 ProductlineadlFactory.eINSTANCE.createComposition()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__OPERATOR,
				 ProductlineadlFactory.eINSTANCE.createOpt()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__OPERATOR,
				 ProductlineadlFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__OPERATOR,
				 ProductlineadlFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__OPERATOR,
				 ProductlineadlFactory.eINSTANCE.createXor()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__MODEL,
				 ProductlineadlFactory.eINSTANCE.createCompositeElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__DETAILED_MODEL,
				 ProductlineadlFactory.eINSTANCE.createCompositeElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__REQUIRED_ELEMENTS,
				 ProductlineadlFactory.eINSTANCE.createConsumedServiceElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__REQUIRED_ELEMENTS,
				 ProductlineadlFactory.eINSTANCE.createExtensionElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__REQUIRED_ELEMENTS,
				 ProductlineadlFactory.eINSTANCE.createImportedPackageElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__REQUIRED_ELEMENTS,
				 ProductlineadlFactory.eINSTANCE.createRequiredInterfaceElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__PROVIDED_ELEMENTS,
				 ProductlineadlFactory.eINSTANCE.createProvidedInterfaceElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__PROVIDED_ELEMENTS,
				 ProductlineadlFactory.eINSTANCE.createExtensionPointElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__PROVIDED_ELEMENTS,
				 ProductlineadlFactory.eINSTANCE.createRegisteredServiceElement()));

		newChildDescriptors.add
			(createChildParameter
				(ProductlineadlPackage.Literals.FEATURE__PROVIDED_ELEMENTS,
				 ProductlineadlFactory.eINSTANCE.createExportedPackageElement()));
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
			childFeature == ProductlineadlPackage.Literals.FEATURE__MODEL ||
			childFeature == ProductlineadlPackage.Literals.FEATURE__DETAILED_MODEL;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
