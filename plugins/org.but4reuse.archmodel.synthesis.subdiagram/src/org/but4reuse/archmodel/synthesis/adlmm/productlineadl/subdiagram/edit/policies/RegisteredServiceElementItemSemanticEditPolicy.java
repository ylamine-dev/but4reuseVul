package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.policies;

import java.util.Iterator;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.commands.ServiceConnectorCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.commands.ServiceConnectorReorientCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ServiceConnectorEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.providers.ProductlineadlElementTypes;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RegisteredServiceElementItemSemanticEditPolicy extends
		ProductlineadlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RegisteredServiceElementItemSemanticEditPolicy() {
		super(ProductlineadlElementTypes.RegisteredServiceElement_3004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ProductlineadlVisualIDRegistry.getVisualID(incomingLink) == ServiceConnectorEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ProductlineadlElementTypes.ServiceConnector_4004 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ProductlineadlElementTypes.ServiceConnector_4004 == req
				.getElementType()) {
			return getGEFWrapper(new ServiceConnectorCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ServiceConnectorEditPart.VISUAL_ID:
			return getGEFWrapper(new ServiceConnectorReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
