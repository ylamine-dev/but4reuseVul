package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.commands;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Mutex;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.policies.ProductlineadlBaseItemSemanticEditPolicy;
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
public class MutexReorientCommand extends EditElementCommand {

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
	public MutexReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Mutex) {
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
		if (!(oldEnd instanceof Feature && newEnd instanceof Feature)) {
			return false;
		}
		Feature target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof SoftwareProductLineArchitecture)) {
			return false;
		}
		SoftwareProductLineArchitecture container = (SoftwareProductLineArchitecture) getLink()
				.eContainer();
		return ProductlineadlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistMutex_4015(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Feature && newEnd instanceof Feature)) {
			return false;
		}
		Feature source = getLink().getSource();
		if (!(getLink().eContainer() instanceof SoftwareProductLineArchitecture)) {
			return false;
		}
		SoftwareProductLineArchitecture container = (SoftwareProductLineArchitecture) getLink()
				.eContainer();
		return ProductlineadlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistMutex_4015(container, getLink(), source,
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
	protected Mutex getLink() {
		return (Mutex) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Feature getOldSource() {
		return (Feature) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Feature getNewSource() {
		return (Feature) newEnd;
	}

	/**
	 * @generated
	 */
	protected Feature getOldTarget() {
		return (Feature) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Feature getNewTarget() {
		return (Feature) newEnd;
	}
}
