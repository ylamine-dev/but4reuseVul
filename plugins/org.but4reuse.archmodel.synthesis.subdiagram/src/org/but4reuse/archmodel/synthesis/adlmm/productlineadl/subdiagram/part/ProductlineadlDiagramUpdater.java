package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExportedPackageElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionConnector;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ImportedPackageElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.InterfaceConnector;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PackageConnector;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedInterfaceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ServiceConnector;
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
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.providers.ProductlineadlElementTypes;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class ProductlineadlDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ProductlineadlNodeDescriptor> getSemanticChildren(
			View view) {
		switch (ProductlineadlVisualIDRegistry.getVisualID(view)) {
		case FeatureEditPart.VISUAL_ID:
			return getFeature_1000SemanticChildren(view);
		case CompositeElementEditPart.VISUAL_ID:
			return getCompositeElement_2001SemanticChildren(view);
		case PluginElementEditPart.VISUAL_ID:
			return getPluginElement_3001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlNodeDescriptor> getFeature_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Feature modelElement = (Feature) view.getElement();
		LinkedList<ProductlineadlNodeDescriptor> result = new LinkedList<ProductlineadlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModel().iterator(); it.hasNext();) {
			CompositeElement childElement = (CompositeElement) it.next();
			int visualID = ProductlineadlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CompositeElementEditPart.VISUAL_ID) {
				result.add(new ProductlineadlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlNodeDescriptor> getCompositeElement_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CompositeElement modelElement = (CompositeElement) view.getElement();
		LinkedList<ProductlineadlNodeDescriptor> result = new LinkedList<ProductlineadlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			ComponentElement childElement = (ComponentElement) it.next();
			int visualID = ProductlineadlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PluginElementEditPart.VISUAL_ID) {
				result.add(new ProductlineadlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlNodeDescriptor> getPluginElement_3001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		PluginElement modelElement = (PluginElement) view.getElement();
		LinkedList<ProductlineadlNodeDescriptor> result = new LinkedList<ProductlineadlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRequiredInterfaces().iterator(); it
				.hasNext();) {
			RequiredInterfaceElement childElement = (RequiredInterfaceElement) it
					.next();
			int visualID = ProductlineadlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RequiredInterfaceElementEditPart.VISUAL_ID) {
				result.add(new ProductlineadlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getExport_packages().iterator(); it
				.hasNext();) {
			ExportedPackageElement childElement = (ExportedPackageElement) it
					.next();
			int visualID = ProductlineadlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExportedPackageElementEditPart.VISUAL_ID) {
				result.add(new ProductlineadlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getImport_packages().iterator(); it
				.hasNext();) {
			ImportedPackageElement childElement = (ImportedPackageElement) it
					.next();
			int visualID = ProductlineadlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ImportedPackageElementEditPart.VISUAL_ID) {
				result.add(new ProductlineadlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getProvidedInterfaces().iterator(); it
				.hasNext();) {
			ProvidedInterfaceElement childElement = (ProvidedInterfaceElement) it
					.next();
			int visualID = ProductlineadlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProvidedInterfaceElementEditPart.VISUAL_ID) {
				result.add(new ProductlineadlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getExtensionPoints().iterator(); it
				.hasNext();) {
			ExtensionPointElement childElement = (ExtensionPointElement) it
					.next();
			int visualID = ProductlineadlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExtensionPointElementEditPart.VISUAL_ID) {
				result.add(new ProductlineadlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRegisteredServices().iterator(); it
				.hasNext();) {
			RegisteredServiceElement childElement = (RegisteredServiceElement) it
					.next();
			int visualID = ProductlineadlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RegisteredServiceElementEditPart.VISUAL_ID) {
				result.add(new ProductlineadlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getExtensions().iterator(); it
				.hasNext();) {
			ExtensionElement childElement = (ExtensionElement) it.next();
			int visualID = ProductlineadlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExtensionElementEditPart.VISUAL_ID) {
				result.add(new ProductlineadlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getConsumedServices().iterator(); it
				.hasNext();) {
			ConsumedServiceElement childElement = (ConsumedServiceElement) it
					.next();
			int visualID = ProductlineadlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConsumedServiceElementEditPart.VISUAL_ID) {
				result.add(new ProductlineadlNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getContainedLinks(View view) {
		switch (ProductlineadlVisualIDRegistry.getVisualID(view)) {
		case FeatureEditPart.VISUAL_ID:
			return getFeature_1000ContainedLinks(view);
		case CompositeElementEditPart.VISUAL_ID:
			return getCompositeElement_2001ContainedLinks(view);
		case PluginElementEditPart.VISUAL_ID:
			return getPluginElement_3001ContainedLinks(view);
		case RequiredInterfaceElementEditPart.VISUAL_ID:
			return getRequiredInterfaceElement_3003ContainedLinks(view);
		case ExportedPackageElementEditPart.VISUAL_ID:
			return getExportedPackageElement_3008ContainedLinks(view);
		case ImportedPackageElementEditPart.VISUAL_ID:
			return getImportedPackageElement_3009ContainedLinks(view);
		case ProvidedInterfaceElementEditPart.VISUAL_ID:
			return getProvidedInterfaceElement_3002ContainedLinks(view);
		case ExtensionPointElementEditPart.VISUAL_ID:
			return getExtensionPointElement_3006ContainedLinks(view);
		case RegisteredServiceElementEditPart.VISUAL_ID:
			return getRegisteredServiceElement_3004ContainedLinks(view);
		case ExtensionElementEditPart.VISUAL_ID:
			return getExtensionElement_3007ContainedLinks(view);
		case ConsumedServiceElementEditPart.VISUAL_ID:
			return getConsumedServiceElement_3005ContainedLinks(view);
		case InterfaceConnectorEditPart.VISUAL_ID:
			return getInterfaceConnector_4002ContainedLinks(view);
		case ServiceConnectorEditPart.VISUAL_ID:
			return getServiceConnector_4004ContainedLinks(view);
		case PackageConnectorEditPart.VISUAL_ID:
			return getPackageConnector_4003ContainedLinks(view);
		case ExtensionConnectorEditPart.VISUAL_ID:
			return getExtensionConnector_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getIncomingLinks(View view) {
		switch (ProductlineadlVisualIDRegistry.getVisualID(view)) {
		case CompositeElementEditPart.VISUAL_ID:
			return getCompositeElement_2001IncomingLinks(view);
		case PluginElementEditPart.VISUAL_ID:
			return getPluginElement_3001IncomingLinks(view);
		case RequiredInterfaceElementEditPart.VISUAL_ID:
			return getRequiredInterfaceElement_3003IncomingLinks(view);
		case ExportedPackageElementEditPart.VISUAL_ID:
			return getExportedPackageElement_3008IncomingLinks(view);
		case ImportedPackageElementEditPart.VISUAL_ID:
			return getImportedPackageElement_3009IncomingLinks(view);
		case ProvidedInterfaceElementEditPart.VISUAL_ID:
			return getProvidedInterfaceElement_3002IncomingLinks(view);
		case ExtensionPointElementEditPart.VISUAL_ID:
			return getExtensionPointElement_3006IncomingLinks(view);
		case RegisteredServiceElementEditPart.VISUAL_ID:
			return getRegisteredServiceElement_3004IncomingLinks(view);
		case ExtensionElementEditPart.VISUAL_ID:
			return getExtensionElement_3007IncomingLinks(view);
		case ConsumedServiceElementEditPart.VISUAL_ID:
			return getConsumedServiceElement_3005IncomingLinks(view);
		case InterfaceConnectorEditPart.VISUAL_ID:
			return getInterfaceConnector_4002IncomingLinks(view);
		case ServiceConnectorEditPart.VISUAL_ID:
			return getServiceConnector_4004IncomingLinks(view);
		case PackageConnectorEditPart.VISUAL_ID:
			return getPackageConnector_4003IncomingLinks(view);
		case ExtensionConnectorEditPart.VISUAL_ID:
			return getExtensionConnector_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getOutgoingLinks(View view) {
		switch (ProductlineadlVisualIDRegistry.getVisualID(view)) {
		case CompositeElementEditPart.VISUAL_ID:
			return getCompositeElement_2001OutgoingLinks(view);
		case PluginElementEditPart.VISUAL_ID:
			return getPluginElement_3001OutgoingLinks(view);
		case RequiredInterfaceElementEditPart.VISUAL_ID:
			return getRequiredInterfaceElement_3003OutgoingLinks(view);
		case ExportedPackageElementEditPart.VISUAL_ID:
			return getExportedPackageElement_3008OutgoingLinks(view);
		case ImportedPackageElementEditPart.VISUAL_ID:
			return getImportedPackageElement_3009OutgoingLinks(view);
		case ProvidedInterfaceElementEditPart.VISUAL_ID:
			return getProvidedInterfaceElement_3002OutgoingLinks(view);
		case ExtensionPointElementEditPart.VISUAL_ID:
			return getExtensionPointElement_3006OutgoingLinks(view);
		case RegisteredServiceElementEditPart.VISUAL_ID:
			return getRegisteredServiceElement_3004OutgoingLinks(view);
		case ExtensionElementEditPart.VISUAL_ID:
			return getExtensionElement_3007OutgoingLinks(view);
		case ConsumedServiceElementEditPart.VISUAL_ID:
			return getConsumedServiceElement_3005OutgoingLinks(view);
		case InterfaceConnectorEditPart.VISUAL_ID:
			return getInterfaceConnector_4002OutgoingLinks(view);
		case ServiceConnectorEditPart.VISUAL_ID:
			return getServiceConnector_4004OutgoingLinks(view);
		case PackageConnectorEditPart.VISUAL_ID:
			return getPackageConnector_4003OutgoingLinks(view);
		case ExtensionConnectorEditPart.VISUAL_ID:
			return getExtensionConnector_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getFeature_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getCompositeElement_2001ContainedLinks(
			View view) {
		CompositeElement modelElement = (CompositeElement) view.getElement();
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InterfaceConnector_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ServiceConnector_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_PackageConnector_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExtensionConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getPluginElement_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getRequiredInterfaceElement_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getExportedPackageElement_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getImportedPackageElement_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getProvidedInterfaceElement_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getExtensionPointElement_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getRegisteredServiceElement_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getExtensionElement_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getConsumedServiceElement_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getInterfaceConnector_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getServiceConnector_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getPackageConnector_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getExtensionConnector_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getCompositeElement_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getPluginElement_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getRequiredInterfaceElement_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getExportedPackageElement_3008IncomingLinks(
			View view) {
		ExportedPackageElement modelElement = (ExportedPackageElement) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_PackageConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getImportedPackageElement_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getProvidedInterfaceElement_3002IncomingLinks(
			View view) {
		ProvidedInterfaceElement modelElement = (ProvidedInterfaceElement) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterfaceConnector_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getExtensionPointElement_3006IncomingLinks(
			View view) {
		ExtensionPointElement modelElement = (ExtensionPointElement) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ExtensionConnector_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getRegisteredServiceElement_3004IncomingLinks(
			View view) {
		RegisteredServiceElement modelElement = (RegisteredServiceElement) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ServiceConnector_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getExtensionElement_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getConsumedServiceElement_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getInterfaceConnector_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getServiceConnector_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getPackageConnector_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getExtensionConnector_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getCompositeElement_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getPluginElement_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getRequiredInterfaceElement_3003OutgoingLinks(
			View view) {
		RequiredInterfaceElement modelElement = (RequiredInterfaceElement) view
				.getElement();
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterfaceConnector_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getExportedPackageElement_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getImportedPackageElement_3009OutgoingLinks(
			View view) {
		ImportedPackageElement modelElement = (ImportedPackageElement) view
				.getElement();
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PackageConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getProvidedInterfaceElement_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getExtensionPointElement_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getRegisteredServiceElement_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getExtensionElement_3007OutgoingLinks(
			View view) {
		ExtensionElement modelElement = (ExtensionElement) view.getElement();
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ExtensionConnector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getConsumedServiceElement_3005OutgoingLinks(
			View view) {
		ConsumedServiceElement modelElement = (ConsumedServiceElement) view
				.getElement();
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ServiceConnector_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getInterfaceConnector_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getServiceConnector_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getPackageConnector_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getExtensionConnector_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getContainedTypeModelFacetLinks_InterfaceConnector_4002(
			CompositeElement container) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InterfaceConnector) {
				continue;
			}
			InterfaceConnector link = (InterfaceConnector) linkObject;
			if (InterfaceConnectorEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ProvidedInterfaceElement dst = link.getTarget();
			RequiredInterfaceElement src = link.getSource();
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.InterfaceConnector_4002,
					InterfaceConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getContainedTypeModelFacetLinks_ServiceConnector_4004(
			CompositeElement container) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ServiceConnector) {
				continue;
			}
			ServiceConnector link = (ServiceConnector) linkObject;
			if (ServiceConnectorEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			RegisteredServiceElement dst = link.getTarget();
			ConsumedServiceElement src = link.getSource();
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.ServiceConnector_4004,
					ServiceConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getContainedTypeModelFacetLinks_PackageConnector_4003(
			CompositeElement container) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PackageConnector) {
				continue;
			}
			PackageConnector link = (PackageConnector) linkObject;
			if (PackageConnectorEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ExportedPackageElement dst = link.getTarget();
			ImportedPackageElement src = link.getSource();
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.PackageConnector_4003,
					PackageConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getContainedTypeModelFacetLinks_ExtensionConnector_4001(
			CompositeElement container) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExtensionConnector) {
				continue;
			}
			ExtensionConnector link = (ExtensionConnector) linkObject;
			if (ExtensionConnectorEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ExtensionPointElement dst = link.getTarget();
			ExtensionElement src = link.getSource();
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.ExtensionConnector_4001,
					ExtensionConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getIncomingTypeModelFacetLinks_InterfaceConnector_4002(
			ProvidedInterfaceElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ProductlineadlPackage.eINSTANCE
					.getInterfaceConnector_Target()
					|| false == setting.getEObject() instanceof InterfaceConnector) {
				continue;
			}
			InterfaceConnector link = (InterfaceConnector) setting.getEObject();
			if (InterfaceConnectorEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			RequiredInterfaceElement src = link.getSource();
			result.add(new ProductlineadlLinkDescriptor(src, target, link,
					ProductlineadlElementTypes.InterfaceConnector_4002,
					InterfaceConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getIncomingTypeModelFacetLinks_ServiceConnector_4004(
			RegisteredServiceElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ProductlineadlPackage.eINSTANCE
					.getServiceConnector_Target()
					|| false == setting.getEObject() instanceof ServiceConnector) {
				continue;
			}
			ServiceConnector link = (ServiceConnector) setting.getEObject();
			if (ServiceConnectorEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ConsumedServiceElement src = link.getSource();
			result.add(new ProductlineadlLinkDescriptor(src, target, link,
					ProductlineadlElementTypes.ServiceConnector_4004,
					ServiceConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getIncomingTypeModelFacetLinks_PackageConnector_4003(
			ExportedPackageElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ProductlineadlPackage.eINSTANCE
					.getPackageConnector_Target()
					|| false == setting.getEObject() instanceof PackageConnector) {
				continue;
			}
			PackageConnector link = (PackageConnector) setting.getEObject();
			if (PackageConnectorEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ImportedPackageElement src = link.getSource();
			result.add(new ProductlineadlLinkDescriptor(src, target, link,
					ProductlineadlElementTypes.PackageConnector_4003,
					PackageConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getIncomingTypeModelFacetLinks_ExtensionConnector_4001(
			ExtensionPointElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ProductlineadlPackage.eINSTANCE
					.getExtensionConnector_Target()
					|| false == setting.getEObject() instanceof ExtensionConnector) {
				continue;
			}
			ExtensionConnector link = (ExtensionConnector) setting.getEObject();
			if (ExtensionConnectorEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ExtensionElement src = link.getSource();
			result.add(new ProductlineadlLinkDescriptor(src, target, link,
					ProductlineadlElementTypes.ExtensionConnector_4001,
					ExtensionConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getOutgoingTypeModelFacetLinks_InterfaceConnector_4002(
			RequiredInterfaceElement source) {
		CompositeElement container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof CompositeElement) {
				container = (CompositeElement) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InterfaceConnector) {
				continue;
			}
			InterfaceConnector link = (InterfaceConnector) linkObject;
			if (InterfaceConnectorEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ProvidedInterfaceElement dst = link.getTarget();
			RequiredInterfaceElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.InterfaceConnector_4002,
					InterfaceConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getOutgoingTypeModelFacetLinks_ServiceConnector_4004(
			ConsumedServiceElement source) {
		CompositeElement container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof CompositeElement) {
				container = (CompositeElement) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ServiceConnector) {
				continue;
			}
			ServiceConnector link = (ServiceConnector) linkObject;
			if (ServiceConnectorEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			RegisteredServiceElement dst = link.getTarget();
			ConsumedServiceElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.ServiceConnector_4004,
					ServiceConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getOutgoingTypeModelFacetLinks_PackageConnector_4003(
			ImportedPackageElement source) {
		CompositeElement container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof CompositeElement) {
				container = (CompositeElement) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PackageConnector) {
				continue;
			}
			PackageConnector link = (PackageConnector) linkObject;
			if (PackageConnectorEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ExportedPackageElement dst = link.getTarget();
			ImportedPackageElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.PackageConnector_4003,
					PackageConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getOutgoingTypeModelFacetLinks_ExtensionConnector_4001(
			ExtensionElement source) {
		CompositeElement container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof CompositeElement) {
				container = (CompositeElement) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExtensionConnector) {
				continue;
			}
			ExtensionConnector link = (ExtensionConnector) linkObject;
			if (ExtensionConnectorEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ExtensionPointElement dst = link.getTarget();
			ExtensionElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.ExtensionConnector_4001,
					ExtensionConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<ProductlineadlNodeDescriptor> getSemanticChildren(View view) {
			return ProductlineadlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ProductlineadlLinkDescriptor> getContainedLinks(View view) {
			return ProductlineadlDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ProductlineadlLinkDescriptor> getIncomingLinks(View view) {
			return ProductlineadlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ProductlineadlLinkDescriptor> getOutgoingLinks(View view) {
			return ProductlineadlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
