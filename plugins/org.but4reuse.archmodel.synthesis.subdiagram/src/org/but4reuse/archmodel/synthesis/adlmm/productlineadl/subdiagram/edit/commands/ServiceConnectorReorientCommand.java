package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.commands;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ServiceConnector;
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
public class ServiceConnectorReorientCommand extends EditElementCommand {

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
	public ServiceConnectorReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ServiceConnector) {
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
		if (!(oldEnd instanceof ConsumedServiceElement && newEnd instanceof ConsumedServiceElement)) {
			return false;
		}
		RegisteredServiceElement target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof CompositeElement)) {
			return false;
		}
		CompositeElement container = (CompositeElement) getLink().eContainer();
		return ProductlineadlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistServiceConnector_4004(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof RegisteredServiceElement && newEnd instanceof RegisteredServiceElement)) {
			return false;
		}
		ConsumedServiceElement source = getLink().getSource();
		if (!(getLink().eContainer() instanceof CompositeElement)) {
			return false;
		}
		CompositeElement container = (CompositeElement) getLink().eContainer();
		return ProductlineadlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistServiceConnector_4004(container, getLink(), source,
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
	protected ServiceConnector getLink() {
		return (ServiceConnector) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ConsumedServiceElement getOldSource() {
		return (ConsumedServiceElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ConsumedServiceElement getNewSource() {
		return (ConsumedServiceElement) newEnd;
	}

	/**
	 * @generated
	 */
	protected RegisteredServiceElement getOldTarget() {
		return (RegisteredServiceElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected RegisteredServiceElement getNewTarget() {
		return (RegisteredServiceElement) newEnd;
	}
}
