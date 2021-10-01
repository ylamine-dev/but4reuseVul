package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.CompositeElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.CompositeElementNameEditPart;
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
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.PluginElementNameEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ProvidedInterfaceElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.RegisteredServiceElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.RequiredInterfaceElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ServiceConnectorEditPart;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ProductlineadlVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.but4reuse.archmodel.synthesis.subdiagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (FeatureEditPart.MODEL_ID.equals(view.getType())) {
				return FeatureEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ProductlineadlDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ProductlineadlPackage.eINSTANCE.getFeature().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Feature) domainElement)) {
			return FeatureEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry
				.getModelID(containerView);
		if (!FeatureEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (FeatureEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FeatureEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case FeatureEditPart.VISUAL_ID:
			if (ProductlineadlPackage.eINSTANCE.getCompositeElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return CompositeElementEditPart.VISUAL_ID;
			}
			break;
		case CompositeElementEditPart.VISUAL_ID:
			if (ProductlineadlPackage.eINSTANCE.getPluginElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return PluginElementEditPart.VISUAL_ID;
			}
			break;
		case PluginElementEditPart.VISUAL_ID:
			if (ProductlineadlPackage.eINSTANCE.getRequiredInterfaceElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return RequiredInterfaceElementEditPart.VISUAL_ID;
			}
			if (ProductlineadlPackage.eINSTANCE.getExportedPackageElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ExportedPackageElementEditPart.VISUAL_ID;
			}
			if (ProductlineadlPackage.eINSTANCE.getImportedPackageElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ImportedPackageElementEditPart.VISUAL_ID;
			}
			if (ProductlineadlPackage.eINSTANCE.getProvidedInterfaceElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ProvidedInterfaceElementEditPart.VISUAL_ID;
			}
			if (ProductlineadlPackage.eINSTANCE.getExtensionPointElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ExtensionPointElementEditPart.VISUAL_ID;
			}
			if (ProductlineadlPackage.eINSTANCE.getRegisteredServiceElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return RegisteredServiceElementEditPart.VISUAL_ID;
			}
			if (ProductlineadlPackage.eINSTANCE.getExtensionElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ExtensionElementEditPart.VISUAL_ID;
			}
			if (ProductlineadlPackage.eINSTANCE.getConsumedServiceElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ConsumedServiceElementEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry
				.getModelID(containerView);
		if (!FeatureEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (FeatureEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FeatureEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case FeatureEditPart.VISUAL_ID:
			if (CompositeElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositeElementEditPart.VISUAL_ID:
			if (CompositeElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PluginElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PluginElementEditPart.VISUAL_ID:
			if (PluginElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RequiredInterfaceElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExportedPackageElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImportedPackageElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProvidedInterfaceElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionPointElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RegisteredServiceElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtensionElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConsumedServiceElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ProductlineadlPackage.eINSTANCE.getInterfaceConnector()
				.isSuperTypeOf(domainElement.eClass())) {
			return InterfaceConnectorEditPart.VISUAL_ID;
		}
		if (ProductlineadlPackage.eINSTANCE.getServiceConnector()
				.isSuperTypeOf(domainElement.eClass())) {
			return ServiceConnectorEditPart.VISUAL_ID;
		}
		if (ProductlineadlPackage.eINSTANCE.getPackageConnector()
				.isSuperTypeOf(domainElement.eClass())) {
			return PackageConnectorEditPart.VISUAL_ID;
		}
		if (ProductlineadlPackage.eINSTANCE.getExtensionConnector()
				.isSuperTypeOf(domainElement.eClass())) {
			return ExtensionConnectorEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Feature element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case FeatureEditPart.VISUAL_ID:
			return false;
		case ProvidedInterfaceElementEditPart.VISUAL_ID:
		case RequiredInterfaceElementEditPart.VISUAL_ID:
		case RegisteredServiceElementEditPart.VISUAL_ID:
		case ConsumedServiceElementEditPart.VISUAL_ID:
		case ExtensionPointElementEditPart.VISUAL_ID:
		case ExtensionElementEditPart.VISUAL_ID:
		case ExportedPackageElementEditPart.VISUAL_ID:
		case ImportedPackageElementEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
