package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.policies;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.FeatureCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.providers.ProductlineadlElementTypes;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class SoftwareProductLineArchitectureItemSemanticEditPolicy extends
		ProductlineadlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SoftwareProductLineArchitectureItemSemanticEditPolicy() {
		super(ProductlineadlElementTypes.SoftwareProductLineArchitecture_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ProductlineadlElementTypes.Feature_2003 == req.getElementType()) {
			return getGEFWrapper(new FeatureCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
