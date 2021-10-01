package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.CompositeElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ConsumedServiceElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ExportedPackageElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ExtensionConnectorEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ExtensionElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ExtensionPointElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.FeatureEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ImportedPackageElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.InterfaceConnectorEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.PackageConnectorEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.PluginElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ProvidedInterfaceElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.RegisteredServiceElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.RequiredInterfaceElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ServiceConnectorEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlDiagramEditorPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ProductlineadlElementTypes {

	/**
	 * @generated
	 */
	private ProductlineadlElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ProductlineadlDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Feature_1000 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.Feature_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeElement_2001 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.CompositeElement_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PluginElement_3001 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.PluginElement_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RequiredInterfaceElement_3003 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.RequiredInterfaceElement_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExportedPackageElement_3008 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.ExportedPackageElement_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ImportedPackageElement_3009 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.ImportedPackageElement_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProvidedInterfaceElement_3002 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.ProvidedInterfaceElement_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionPointElement_3006 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.ExtensionPointElement_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RegisteredServiceElement_3004 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.RegisteredServiceElement_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionElement_3007 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.ExtensionElement_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConsumedServiceElement_3005 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.ConsumedServiceElement_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InterfaceConnector_4002 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.InterfaceConnector_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ServiceConnector_4004 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.ServiceConnector_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PackageConnector_4003 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.PackageConnector_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExtensionConnector_4001 = getElementType("org.but4reuse.archmodel.synthesis.subdiagram.ExtensionConnector_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Feature_1000,
					ProductlineadlPackage.eINSTANCE.getFeature());

			elements.put(CompositeElement_2001,
					ProductlineadlPackage.eINSTANCE.getCompositeElement());

			elements.put(PluginElement_3001,
					ProductlineadlPackage.eINSTANCE.getPluginElement());

			elements.put(RequiredInterfaceElement_3003,
					ProductlineadlPackage.eINSTANCE
							.getRequiredInterfaceElement());

			elements.put(ExportedPackageElement_3008,
					ProductlineadlPackage.eINSTANCE.getExportedPackageElement());

			elements.put(ImportedPackageElement_3009,
					ProductlineadlPackage.eINSTANCE.getImportedPackageElement());

			elements.put(ProvidedInterfaceElement_3002,
					ProductlineadlPackage.eINSTANCE
							.getProvidedInterfaceElement());

			elements.put(ExtensionPointElement_3006,
					ProductlineadlPackage.eINSTANCE.getExtensionPointElement());

			elements.put(RegisteredServiceElement_3004,
					ProductlineadlPackage.eINSTANCE
							.getRegisteredServiceElement());

			elements.put(ExtensionElement_3007,
					ProductlineadlPackage.eINSTANCE.getExtensionElement());

			elements.put(ConsumedServiceElement_3005,
					ProductlineadlPackage.eINSTANCE.getConsumedServiceElement());

			elements.put(InterfaceConnector_4002,
					ProductlineadlPackage.eINSTANCE.getInterfaceConnector());

			elements.put(ServiceConnector_4004,
					ProductlineadlPackage.eINSTANCE.getServiceConnector());

			elements.put(PackageConnector_4003,
					ProductlineadlPackage.eINSTANCE.getPackageConnector());

			elements.put(ExtensionConnector_4001,
					ProductlineadlPackage.eINSTANCE.getExtensionConnector());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Feature_1000);
			KNOWN_ELEMENT_TYPES.add(CompositeElement_2001);
			KNOWN_ELEMENT_TYPES.add(PluginElement_3001);
			KNOWN_ELEMENT_TYPES.add(RequiredInterfaceElement_3003);
			KNOWN_ELEMENT_TYPES.add(ExportedPackageElement_3008);
			KNOWN_ELEMENT_TYPES.add(ImportedPackageElement_3009);
			KNOWN_ELEMENT_TYPES.add(ProvidedInterfaceElement_3002);
			KNOWN_ELEMENT_TYPES.add(ExtensionPointElement_3006);
			KNOWN_ELEMENT_TYPES.add(RegisteredServiceElement_3004);
			KNOWN_ELEMENT_TYPES.add(ExtensionElement_3007);
			KNOWN_ELEMENT_TYPES.add(ConsumedServiceElement_3005);
			KNOWN_ELEMENT_TYPES.add(InterfaceConnector_4002);
			KNOWN_ELEMENT_TYPES.add(ServiceConnector_4004);
			KNOWN_ELEMENT_TYPES.add(PackageConnector_4003);
			KNOWN_ELEMENT_TYPES.add(ExtensionConnector_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case FeatureEditPart.VISUAL_ID:
			return Feature_1000;
		case CompositeElementEditPart.VISUAL_ID:
			return CompositeElement_2001;
		case PluginElementEditPart.VISUAL_ID:
			return PluginElement_3001;
		case RequiredInterfaceElementEditPart.VISUAL_ID:
			return RequiredInterfaceElement_3003;
		case ExportedPackageElementEditPart.VISUAL_ID:
			return ExportedPackageElement_3008;
		case ImportedPackageElementEditPart.VISUAL_ID:
			return ImportedPackageElement_3009;
		case ProvidedInterfaceElementEditPart.VISUAL_ID:
			return ProvidedInterfaceElement_3002;
		case ExtensionPointElementEditPart.VISUAL_ID:
			return ExtensionPointElement_3006;
		case RegisteredServiceElementEditPart.VISUAL_ID:
			return RegisteredServiceElement_3004;
		case ExtensionElementEditPart.VISUAL_ID:
			return ExtensionElement_3007;
		case ConsumedServiceElementEditPart.VISUAL_ID:
			return ConsumedServiceElement_3005;
		case InterfaceConnectorEditPart.VISUAL_ID:
			return InterfaceConnector_4002;
		case ServiceConnectorEditPart.VISUAL_ID:
			return ServiceConnector_4004;
		case PackageConnectorEditPart.VISUAL_ID:
			return PackageConnector_4003;
		case ExtensionConnectorEditPart.VISUAL_ID:
			return ExtensionConnector_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.providers.ProductlineadlElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.providers.ProductlineadlElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.providers.ProductlineadlElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
