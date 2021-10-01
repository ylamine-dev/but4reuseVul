package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.commands;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionConnector;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.policies.ProductlineadlBaseItemSemanticEditPolicy;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ExtensionConnectorReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ExtensionConnectorReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ExtensionConnector) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ExtensionElement && newEnd instanceof ExtensionElement)) {
			return false;
		}
		ExtensionPointElement target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof CompositeElement)) {
			return false;
		}
		CompositeElement container = (CompositeElement) getLink().eContainer();
		return ProductlineadlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistExtensionConnector_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ExtensionPointElement && newEnd instanceof ExtensionPointElement)) {
			return false;
		}
		ExtensionElement source = getLink().getSource();
		if (!(getLink().eContainer() instanceof CompositeElement)) {
			return false;
		}
		CompositeElement container = (CompositeElement) getLink().eContainer();
		return ProductlineadlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistExtensionConnector_4001(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ExtensionConnector getLink() {
		return (ExtensionConnector) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ExtensionElement getOldSource() {
		return (ExtensionElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ExtensionElement getNewSource() {
		return (ExtensionElement) newEnd;
	}

	/**
	 * @generated
	 */
	protected ExtensionPointElement getOldTarget() {
		return (ExtensionPointElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ExtensionPointElement getNewTarget() {
		return (ExtensionPointElement) newEnd;
	}
}
