package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.policies;

import java.util.Iterator;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.AndCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.CompositionCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.CompositionReorientCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.MandatoryCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.MandatoryReorientCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.MutexCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.MutexReorientCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.OptCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.OptionalCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.OptionalReorientCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.OrCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.RequireCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.RequireReorientCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands.XorCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.AndEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.CompositionEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.MandatoryEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.MutexEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.OptEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.OptionalEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.OrEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.RequireEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts.XorEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlVisualIDRegistry;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.providers.ProductlineadlElementTypes;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class FeatureItemSemanticEditPolicy extends
		ProductlineadlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FeatureItemSemanticEditPolicy() {
		super(ProductlineadlElementTypes.Feature_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ProductlineadlElementTypes.Opt_3014 == req.getElementType()) {
			return getGEFWrapper(new OptCreateCommand(req));
		}
		if (ProductlineadlElementTypes.And_3015 == req.getElementType()) {
			return getGEFWrapper(new AndCreateCommand(req));
		}
		if (ProductlineadlElementTypes.Xor_3016 == req.getElementType()) {
			return getGEFWrapper(new XorCreateCommand(req));
		}
		if (ProductlineadlElementTypes.Or_3017 == req.getElementType()) {
			return getGEFWrapper(new OrCreateCommand(req));
		}
		return super.getCreateCommand(req);
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
			if (ProductlineadlVisualIDRegistry.getVisualID(incomingLink) == MandatoryEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ProductlineadlVisualIDRegistry.getVisualID(incomingLink) == OptionalEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ProductlineadlVisualIDRegistry.getVisualID(incomingLink) == CompositionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ProductlineadlVisualIDRegistry.getVisualID(incomingLink) == RequireEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ProductlineadlVisualIDRegistry.getVisualID(incomingLink) == MutexEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ProductlineadlVisualIDRegistry.getVisualID(outgoingLink) == MandatoryEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ProductlineadlVisualIDRegistry.getVisualID(outgoingLink) == OptionalEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ProductlineadlVisualIDRegistry.getVisualID(outgoingLink) == CompositionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ProductlineadlVisualIDRegistry.getVisualID(outgoingLink) == RequireEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ProductlineadlVisualIDRegistry.getVisualID(outgoingLink) == MutexEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (ProductlineadlVisualIDRegistry.getVisualID(node)) {
			case OptEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case AndEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case XorEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case OrEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
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
		if (ProductlineadlElementTypes.Mandatory_4011 == req.getElementType()) {
			return getGEFWrapper(new MandatoryCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ProductlineadlElementTypes.Optional_4012 == req.getElementType()) {
			return getGEFWrapper(new OptionalCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ProductlineadlElementTypes.Composition_4013 == req.getElementType()) {
			return getGEFWrapper(new CompositionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ProductlineadlElementTypes.Require_4014 == req.getElementType()) {
			return getGEFWrapper(new RequireCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (ProductlineadlElementTypes.Mutex_4015 == req.getElementType()) {
			return getGEFWrapper(new MutexCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ProductlineadlElementTypes.Mandatory_4011 == req.getElementType()) {
			return getGEFWrapper(new MandatoryCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ProductlineadlElementTypes.Optional_4012 == req.getElementType()) {
			return getGEFWrapper(new OptionalCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ProductlineadlElementTypes.Composition_4013 == req.getElementType()) {
			return getGEFWrapper(new CompositionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ProductlineadlElementTypes.Require_4014 == req.getElementType()) {
			return getGEFWrapper(new RequireCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (ProductlineadlElementTypes.Mutex_4015 == req.getElementType()) {
			return getGEFWrapper(new MutexCreateCommand(req, req.getSource(),
					req.getTarget()));
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
		case MandatoryEditPart.VISUAL_ID:
			return getGEFWrapper(new MandatoryReorientCommand(req));
		case OptionalEditPart.VISUAL_ID:
			return getGEFWrapper(new OptionalReorientCommand(req));
		case CompositionEditPart.VISUAL_ID:
			return getGEFWrapper(new CompositionReorientCommand(req));
		case RequireEditPart.VISUAL_ID:
			return getGEFWrapper(new RequireReorientCommand(req));
		case MutexEditPart.VISUAL_ID:
			return getGEFWrapper(new MutexReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
