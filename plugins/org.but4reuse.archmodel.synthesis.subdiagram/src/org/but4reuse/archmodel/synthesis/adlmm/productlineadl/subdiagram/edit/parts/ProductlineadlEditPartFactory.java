package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry;
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

			case FeatureEditPart.VISUAL_ID:
				return new FeatureEditPart(view);

			case CompositeElementEditPart.VISUAL_ID:
				return new CompositeElementEditPart(view);

			case CompositeElementNameEditPart.VISUAL_ID:
				return new CompositeElementNameEditPart(view);

			case PluginElementEditPart.VISUAL_ID:
				return new PluginElementEditPart(view);

			case PluginElementNameEditPart.VISUAL_ID:
				return new PluginElementNameEditPart(view);

			case RequiredInterfaceElementEditPart.VISUAL_ID:
				return new RequiredInterfaceElementEditPart(view);

			case ExportedPackageElementEditPart.VISUAL_ID:
				return new ExportedPackageElementEditPart(view);

			case ImportedPackageElementEditPart.VISUAL_ID:
				return new ImportedPackageElementEditPart(view);

			case ProvidedInterfaceElementEditPart.VISUAL_ID:
				return new ProvidedInterfaceElementEditPart(view);

			case ExtensionPointElementEditPart.VISUAL_ID:
				return new ExtensionPointElementEditPart(view);

			case RegisteredServiceElementEditPart.VISUAL_ID:
				return new RegisteredServiceElementEditPart(view);

			case ExtensionElementEditPart.VISUAL_ID:
				return new ExtensionElementEditPart(view);

			case ConsumedServiceElementEditPart.VISUAL_ID:
				return new ConsumedServiceElementEditPart(view);

			case InterfaceConnectorEditPart.VISUAL_ID:
				return new InterfaceConnectorEditPart(view);

			case ServiceConnectorEditPart.VISUAL_ID:
				return new ServiceConnectorEditPart(view);

			case PackageConnectorEditPart.VISUAL_ID:
				return new PackageConnectorEditPart(view);

			case ExtensionConnectorEditPart.VISUAL_ID:
				return new ExtensionConnectorEditPart(view);

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
