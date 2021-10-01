package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.policies;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.providers.ProductlineadlElementTypes;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class OptionalItemSemanticEditPolicy extends
		ProductlineadlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OptionalItemSemanticEditPolicy() {
		super(ProductlineadlElementTypes.Optional_4012);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
