package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
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
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlDiagramEditorPlugin;
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
	public static final IElementType SoftwareProductLineArchitecture_1000 = getElementType("org.but4reuse.archmodel.synthesis.diagram.SoftwareProductLineArchitecture_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Feature_2003 = getElementType("org.but4reuse.archmodel.synthesis.diagram.Feature_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Opt_3014 = getElementType("org.but4reuse.archmodel.synthesis.diagram.Opt_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType And_3015 = getElementType("org.but4reuse.archmodel.synthesis.diagram.And_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Xor_3016 = getElementType("org.but4reuse.archmodel.synthesis.diagram.Xor_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Or_3017 = getElementType("org.but4reuse.archmodel.synthesis.diagram.Or_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Mandatory_4011 = getElementType("org.but4reuse.archmodel.synthesis.diagram.Mandatory_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Optional_4012 = getElementType("org.but4reuse.archmodel.synthesis.diagram.Optional_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Composition_4013 = getElementType("org.but4reuse.archmodel.synthesis.diagram.Composition_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Require_4014 = getElementType("org.but4reuse.archmodel.synthesis.diagram.Require_4014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Mutex_4015 = getElementType("org.but4reuse.archmodel.synthesis.diagram.Mutex_4015"); //$NON-NLS-1$

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

			elements.put(SoftwareProductLineArchitecture_1000,
					ProductlineadlPackage.eINSTANCE
							.getSoftwareProductLineArchitecture());

			elements.put(Feature_2003,
					ProductlineadlPackage.eINSTANCE.getFeature());

			elements.put(Opt_3014, ProductlineadlPackage.eINSTANCE.getOpt());

			elements.put(And_3015, ProductlineadlPackage.eINSTANCE.getAnd());

			elements.put(Xor_3016, ProductlineadlPackage.eINSTANCE.getXor());

			elements.put(Or_3017, ProductlineadlPackage.eINSTANCE.getOr());

			elements.put(Mandatory_4011,
					ProductlineadlPackage.eINSTANCE.getMandatory());

			elements.put(Optional_4012,
					ProductlineadlPackage.eINSTANCE.getOptional());

			elements.put(Composition_4013,
					ProductlineadlPackage.eINSTANCE.getComposition());

			elements.put(Require_4014,
					ProductlineadlPackage.eINSTANCE.getRequire());

			elements.put(Mutex_4015, ProductlineadlPackage.eINSTANCE.getMutex());
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
			KNOWN_ELEMENT_TYPES.add(SoftwareProductLineArchitecture_1000);
			KNOWN_ELEMENT_TYPES.add(Feature_2003);
			KNOWN_ELEMENT_TYPES.add(Opt_3014);
			KNOWN_ELEMENT_TYPES.add(And_3015);
			KNOWN_ELEMENT_TYPES.add(Xor_3016);
			KNOWN_ELEMENT_TYPES.add(Or_3017);
			KNOWN_ELEMENT_TYPES.add(Mandatory_4011);
			KNOWN_ELEMENT_TYPES.add(Optional_4012);
			KNOWN_ELEMENT_TYPES.add(Composition_4013);
			KNOWN_ELEMENT_TYPES.add(Require_4014);
			KNOWN_ELEMENT_TYPES.add(Mutex_4015);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SoftwareProductLineArchitectureEditPart.VISUAL_ID:
			return SoftwareProductLineArchitecture_1000;
		case FeatureEditPart.VISUAL_ID:
			return Feature_2003;
		case OptEditPart.VISUAL_ID:
			return Opt_3014;
		case AndEditPart.VISUAL_ID:
			return And_3015;
		case XorEditPart.VISUAL_ID:
			return Xor_3016;
		case OrEditPart.VISUAL_ID:
			return Or_3017;
		case MandatoryEditPart.VISUAL_ID:
			return Mandatory_4011;
		case OptionalEditPart.VISUAL_ID:
			return Optional_4012;
		case CompositionEditPart.VISUAL_ID:
			return Composition_4013;
		case RequireEditPart.VISUAL_ID:
			return Require_4014;
		case MutexEditPart.VISUAL_ID:
			return Mutex_4015;
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
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.providers.ProductlineadlElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.providers.ProductlineadlElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.providers.ProductlineadlElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
