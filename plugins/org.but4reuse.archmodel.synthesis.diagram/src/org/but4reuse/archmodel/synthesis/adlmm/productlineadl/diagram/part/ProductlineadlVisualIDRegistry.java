package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.AndEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.CompositionEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.FeatureEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.FeatureIdEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.MandatoryEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.MutexEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.OptEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.OptionalEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.OrEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.RequireEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.SoftwareProductLineArchitectureEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.XorEditPart;
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
	private static final String DEBUG_KEY = "org.but4reuse.archmodel.synthesis.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SoftwareProductLineArchitectureEditPart.MODEL_ID.equals(view
					.getType())) {
				return SoftwareProductLineArchitectureEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlVisualIDRegistry
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
		if (ProductlineadlPackage.eINSTANCE
				.getSoftwareProductLineArchitecture().isSuperTypeOf(
						domainElement.eClass())
				&& isDiagram((SoftwareProductLineArchitecture) domainElement)) {
			return SoftwareProductLineArchitectureEditPart.VISUAL_ID;
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
		String containerModelID = org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlVisualIDRegistry
				.getModelID(containerView);
		if (!SoftwareProductLineArchitectureEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SoftwareProductLineArchitectureEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SoftwareProductLineArchitectureEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SoftwareProductLineArchitectureEditPart.VISUAL_ID:
			if (ProductlineadlPackage.eINSTANCE.getFeature().isSuperTypeOf(
					domainElement.eClass())) {
				return FeatureEditPart.VISUAL_ID;
			}
			break;
		case FeatureEditPart.VISUAL_ID:
			if (ProductlineadlPackage.eINSTANCE.getOpt().isSuperTypeOf(
					domainElement.eClass())) {
				return OptEditPart.VISUAL_ID;
			}
			if (ProductlineadlPackage.eINSTANCE.getAnd().isSuperTypeOf(
					domainElement.eClass())) {
				return AndEditPart.VISUAL_ID;
			}
			if (ProductlineadlPackage.eINSTANCE.getXor().isSuperTypeOf(
					domainElement.eClass())) {
				return XorEditPart.VISUAL_ID;
			}
			if (ProductlineadlPackage.eINSTANCE.getOr().isSuperTypeOf(
					domainElement.eClass())) {
				return OrEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlVisualIDRegistry
				.getModelID(containerView);
		if (!SoftwareProductLineArchitectureEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SoftwareProductLineArchitectureEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SoftwareProductLineArchitectureEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SoftwareProductLineArchitectureEditPart.VISUAL_ID:
			if (FeatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FeatureEditPart.VISUAL_ID:
			if (FeatureIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OptEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (XorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrEditPart.VISUAL_ID == nodeVisualID) {
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
		if (ProductlineadlPackage.eINSTANCE.getMandatory().isSuperTypeOf(
				domainElement.eClass())) {
			return MandatoryEditPart.VISUAL_ID;
		}
		if (ProductlineadlPackage.eINSTANCE.getOptional().isSuperTypeOf(
				domainElement.eClass())) {
			return OptionalEditPart.VISUAL_ID;
		}
		if (ProductlineadlPackage.eINSTANCE.getComposition().isSuperTypeOf(
				domainElement.eClass())) {
			return CompositionEditPart.VISUAL_ID;
		}
		if (ProductlineadlPackage.eINSTANCE.getRequire().isSuperTypeOf(
				domainElement.eClass())) {
			return RequireEditPart.VISUAL_ID;
		}
		if (ProductlineadlPackage.eINSTANCE.getMutex().isSuperTypeOf(
				domainElement.eClass())) {
			return MutexEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(SoftwareProductLineArchitecture element) {
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
		case SoftwareProductLineArchitectureEditPart.VISUAL_ID:
			return false;
		case OptEditPart.VISUAL_ID:
		case AndEditPart.VISUAL_ID:
		case XorEditPart.VISUAL_ID:
		case OrEditPart.VISUAL_ID:
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
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
