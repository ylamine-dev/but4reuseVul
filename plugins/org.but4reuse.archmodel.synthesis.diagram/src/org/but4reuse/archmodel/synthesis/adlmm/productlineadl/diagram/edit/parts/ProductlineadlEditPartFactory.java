package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlVisualIDRegistry;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ProductlineadlEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ProductlineadlVisualIDRegistry.getVisualID(view)) {

			case SoftwareProductLineArchitectureEditPart.VISUAL_ID:
				return new SoftwareProductLineArchitectureEditPart(view);

			case FeatureEditPart.VISUAL_ID:
				return new FeatureEditPart(view);

			case FeatureIdEditPart.VISUAL_ID:
				return new FeatureIdEditPart(view);

			case OptEditPart.VISUAL_ID:
				return new OptEditPart(view);

			case AndEditPart.VISUAL_ID:
				return new AndEditPart(view);

			case XorEditPart.VISUAL_ID:
				return new XorEditPart(view);

			case OrEditPart.VISUAL_ID:
				return new OrEditPart(view);

			case MandatoryEditPart.VISUAL_ID:
				return new MandatoryEditPart(view);

			case OptionalEditPart.VISUAL_ID:
				return new OptionalEditPart(view);

			case CompositionEditPart.VISUAL_ID:
				return new CompositionEditPart(view);

			case RequireEditPart.VISUAL_ID:
				return new RequireEditPart(view);

			case MutexEditPart.VISUAL_ID:
				return new MutexEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
