package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Composition;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Mandatory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Mutex;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Operator;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Optional;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Require;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.AndEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.CompositionEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.FeatureEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.MandatoryEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.MutexEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.OptEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.OptionalEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.OrEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.RequireEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.SoftwareProductLineArchitectureEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.XorEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.providers.ProductlineadlElementTypes;
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
		case SoftwareProductLineArchitectureEditPart.VISUAL_ID:
			return getSoftwareProductLineArchitecture_1000SemanticChildren(view);
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlNodeDescriptor> getSoftwareProductLineArchitecture_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SoftwareProductLineArchitecture modelElement = (SoftwareProductLineArchitecture) view
				.getElement();
		LinkedList<ProductlineadlNodeDescriptor> result = new LinkedList<ProductlineadlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFeatures().iterator(); it
				.hasNext();) {
			Feature childElement = (Feature) it.next();
			int visualID = ProductlineadlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FeatureEditPart.VISUAL_ID) {
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
	public static List<ProductlineadlNodeDescriptor> getFeature_2003SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Feature modelElement = (Feature) view.getElement();
		LinkedList<ProductlineadlNodeDescriptor> result = new LinkedList<ProductlineadlNodeDescriptor>();
		{
			Operator childElement = modelElement.getOperator();
			int visualID = ProductlineadlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OptEditPart.VISUAL_ID) {
				result.add(new ProductlineadlNodeDescriptor(childElement,
						visualID));
			}
			if (visualID == AndEditPart.VISUAL_ID) {
				result.add(new ProductlineadlNodeDescriptor(childElement,
						visualID));
			}
			if (visualID == XorEditPart.VISUAL_ID) {
				result.add(new ProductlineadlNodeDescriptor(childElement,
						visualID));
			}
			if (visualID == OrEditPart.VISUAL_ID) {
				result.add(new ProductlineadlNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getContainedLinks(View view) {
		switch (ProductlineadlVisualIDRegistry.getVisualID(view)) {
		case SoftwareProductLineArchitectureEditPart.VISUAL_ID:
			return getSoftwareProductLineArchitecture_1000ContainedLinks(view);
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2003ContainedLinks(view);
		case OptEditPart.VISUAL_ID:
			return getOpt_3014ContainedLinks(view);
		case AndEditPart.VISUAL_ID:
			return getAnd_3015ContainedLinks(view);
		case XorEditPart.VISUAL_ID:
			return getXor_3016ContainedLinks(view);
		case OrEditPart.VISUAL_ID:
			return getOr_3017ContainedLinks(view);
		case MandatoryEditPart.VISUAL_ID:
			return getMandatory_4011ContainedLinks(view);
		case OptionalEditPart.VISUAL_ID:
			return getOptional_4012ContainedLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4013ContainedLinks(view);
		case RequireEditPart.VISUAL_ID:
			return getRequire_4014ContainedLinks(view);
		case MutexEditPart.VISUAL_ID:
			return getMutex_4015ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getIncomingLinks(View view) {
		switch (ProductlineadlVisualIDRegistry.getVisualID(view)) {
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2003IncomingLinks(view);
		case OptEditPart.VISUAL_ID:
			return getOpt_3014IncomingLinks(view);
		case AndEditPart.VISUAL_ID:
			return getAnd_3015IncomingLinks(view);
		case XorEditPart.VISUAL_ID:
			return getXor_3016IncomingLinks(view);
		case OrEditPart.VISUAL_ID:
			return getOr_3017IncomingLinks(view);
		case MandatoryEditPart.VISUAL_ID:
			return getMandatory_4011IncomingLinks(view);
		case OptionalEditPart.VISUAL_ID:
			return getOptional_4012IncomingLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4013IncomingLinks(view);
		case RequireEditPart.VISUAL_ID:
			return getRequire_4014IncomingLinks(view);
		case MutexEditPart.VISUAL_ID:
			return getMutex_4015IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getOutgoingLinks(View view) {
		switch (ProductlineadlVisualIDRegistry.getVisualID(view)) {
		case FeatureEditPart.VISUAL_ID:
			return getFeature_2003OutgoingLinks(view);
		case OptEditPart.VISUAL_ID:
			return getOpt_3014OutgoingLinks(view);
		case AndEditPart.VISUAL_ID:
			return getAnd_3015OutgoingLinks(view);
		case XorEditPart.VISUAL_ID:
			return getXor_3016OutgoingLinks(view);
		case OrEditPart.VISUAL_ID:
			return getOr_3017OutgoingLinks(view);
		case MandatoryEditPart.VISUAL_ID:
			return getMandatory_4011OutgoingLinks(view);
		case OptionalEditPart.VISUAL_ID:
			return getOptional_4012OutgoingLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4013OutgoingLinks(view);
		case RequireEditPart.VISUAL_ID:
			return getRequire_4014OutgoingLinks(view);
		case MutexEditPart.VISUAL_ID:
			return getMutex_4015OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getSoftwareProductLineArchitecture_1000ContainedLinks(
			View view) {
		SoftwareProductLineArchitecture modelElement = (SoftwareProductLineArchitecture) view
				.getElement();
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Require_4014(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Mutex_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getFeature_2003ContainedLinks(
			View view) {
		Feature modelElement = (Feature) view.getElement();
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Mandatory_4011(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Optional_4012(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Composition_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getOpt_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getAnd_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getXor_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getOr_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getMandatory_4011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getOptional_4012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getComposition_4013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getRequire_4014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getMutex_4015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getFeature_2003IncomingLinks(
			View view) {
		Feature modelElement = (Feature) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Mandatory_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Optional_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Require_4014(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mutex_4015(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getOpt_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getAnd_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getXor_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getOr_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getMandatory_4011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getOptional_4012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getComposition_4013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getRequire_4014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getMutex_4015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getFeature_2003OutgoingLinks(
			View view) {
		Feature modelElement = (Feature) view.getElement();
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Mandatory_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Optional_4012(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4013(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Require_4014(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Mutex_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getOpt_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getAnd_3015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getXor_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getOr_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getMandatory_4011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getOptional_4012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getComposition_4013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getRequire_4014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProductlineadlLinkDescriptor> getMutex_4015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getContainedTypeModelFacetLinks_Mandatory_4011(
			Feature container) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getOutgoingEdge().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Mandatory) {
				continue;
			}
			Mandatory link = (Mandatory) linkObject;
			if (MandatoryEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getChild();
			Feature src = link.getParent();
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.Mandatory_4011,
					MandatoryEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getContainedTypeModelFacetLinks_Optional_4012(
			Feature container) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getOutgoingEdge().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Optional) {
				continue;
			}
			Optional link = (Optional) linkObject;
			if (OptionalEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getChild();
			Feature src = link.getParent();
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.Optional_4012,
					OptionalEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getContainedTypeModelFacetLinks_Composition_4013(
			Feature container) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getOutgoingEdge().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Composition) {
				continue;
			}
			Composition link = (Composition) linkObject;
			if (CompositionEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getChild();
			Feature src = link.getParent();
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.Composition_4013,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getContainedTypeModelFacetLinks_Require_4014(
			SoftwareProductLineArchitecture container) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Require) {
				continue;
			}
			Require link = (Require) linkObject;
			if (RequireEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTarget();
			Feature src = link.getSource();
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.Require_4014,
					RequireEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getContainedTypeModelFacetLinks_Mutex_4015(
			SoftwareProductLineArchitecture container) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Mutex) {
				continue;
			}
			Mutex link = (Mutex) linkObject;
			if (MutexEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTarget();
			Feature src = link.getSource();
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.Mutex_4015,
					MutexEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getIncomingTypeModelFacetLinks_Mandatory_4011(
			Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ProductlineadlPackage.eINSTANCE
					.getEdge_Child()
					|| false == setting.getEObject() instanceof Mandatory) {
				continue;
			}
			Mandatory link = (Mandatory) setting.getEObject();
			if (MandatoryEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature src = link.getParent();
			result.add(new ProductlineadlLinkDescriptor(src, target, link,
					ProductlineadlElementTypes.Mandatory_4011,
					MandatoryEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getIncomingTypeModelFacetLinks_Optional_4012(
			Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ProductlineadlPackage.eINSTANCE
					.getEdge_Child()
					|| false == setting.getEObject() instanceof Optional) {
				continue;
			}
			Optional link = (Optional) setting.getEObject();
			if (OptionalEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature src = link.getParent();
			result.add(new ProductlineadlLinkDescriptor(src, target, link,
					ProductlineadlElementTypes.Optional_4012,
					OptionalEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getIncomingTypeModelFacetLinks_Composition_4013(
			Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ProductlineadlPackage.eINSTANCE
					.getEdge_Child()
					|| false == setting.getEObject() instanceof Composition) {
				continue;
			}
			Composition link = (Composition) setting.getEObject();
			if (CompositionEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature src = link.getParent();
			result.add(new ProductlineadlLinkDescriptor(src, target, link,
					ProductlineadlElementTypes.Composition_4013,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getIncomingTypeModelFacetLinks_Require_4014(
			Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ProductlineadlPackage.eINSTANCE
					.getConstraint_Target()
					|| false == setting.getEObject() instanceof Require) {
				continue;
			}
			Require link = (Require) setting.getEObject();
			if (RequireEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature src = link.getSource();
			result.add(new ProductlineadlLinkDescriptor(src, target, link,
					ProductlineadlElementTypes.Require_4014,
					RequireEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getIncomingTypeModelFacetLinks_Mutex_4015(
			Feature target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ProductlineadlPackage.eINSTANCE
					.getConstraint_Target()
					|| false == setting.getEObject() instanceof Mutex) {
				continue;
			}
			Mutex link = (Mutex) setting.getEObject();
			if (MutexEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature src = link.getSource();
			result.add(new ProductlineadlLinkDescriptor(src, target, link,
					ProductlineadlElementTypes.Mutex_4015,
					MutexEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getOutgoingTypeModelFacetLinks_Mandatory_4011(
			Feature source) {
		Feature container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Feature) {
				container = (Feature) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getOutgoingEdge().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Mandatory) {
				continue;
			}
			Mandatory link = (Mandatory) linkObject;
			if (MandatoryEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getChild();
			Feature src = link.getParent();
			if (src != source) {
				continue;
			}
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.Mandatory_4011,
					MandatoryEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getOutgoingTypeModelFacetLinks_Optional_4012(
			Feature source) {
		Feature container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Feature) {
				container = (Feature) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getOutgoingEdge().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Optional) {
				continue;
			}
			Optional link = (Optional) linkObject;
			if (OptionalEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getChild();
			Feature src = link.getParent();
			if (src != source) {
				continue;
			}
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.Optional_4012,
					OptionalEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getOutgoingTypeModelFacetLinks_Composition_4013(
			Feature source) {
		Feature container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Feature) {
				container = (Feature) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getOutgoingEdge().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Composition) {
				continue;
			}
			Composition link = (Composition) linkObject;
			if (CompositionEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getChild();
			Feature src = link.getParent();
			if (src != source) {
				continue;
			}
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.Composition_4013,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getOutgoingTypeModelFacetLinks_Require_4014(
			Feature source) {
		SoftwareProductLineArchitecture container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SoftwareProductLineArchitecture) {
				container = (SoftwareProductLineArchitecture) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Require) {
				continue;
			}
			Require link = (Require) linkObject;
			if (RequireEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTarget();
			Feature src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.Require_4014,
					RequireEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProductlineadlLinkDescriptor> getOutgoingTypeModelFacetLinks_Mutex_4015(
			Feature source) {
		SoftwareProductLineArchitecture container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SoftwareProductLineArchitecture) {
				container = (SoftwareProductLineArchitecture) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ProductlineadlLinkDescriptor> result = new LinkedList<ProductlineadlLinkDescriptor>();
		for (Iterator<?> links = container.getConstraints().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Mutex) {
				continue;
			}
			Mutex link = (Mutex) linkObject;
			if (MutexEditPart.VISUAL_ID != ProductlineadlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Feature dst = link.getTarget();
			Feature src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ProductlineadlLinkDescriptor(src, dst, link,
					ProductlineadlElementTypes.Mutex_4015,
					MutexEditPart.VISUAL_ID));
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
