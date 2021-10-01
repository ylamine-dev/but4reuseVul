package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.policies;

import java.util.Iterator;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.commands.ConsumedServiceElementCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.commands.ExportedPackageElementCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.commands.ExtensionElementCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.commands.ExtensionPointElementCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.commands.ImportedPackageElementCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.commands.ProvidedInterfaceElementCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.commands.RegisteredServiceElementCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.commands.RequiredInterfaceElementCreateCommand;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ConsumedServiceElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ExportedPackageElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ExtensionConnectorEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ExtensionElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ExtensionPointElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ImportedPackageElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.InterfaceConnectorEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.PackageConnectorEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ProvidedInterfaceElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.RegisteredServiceElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.RequiredInterfaceElementEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ServiceConnectorEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.providers.ProductlineadlElementTypes;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PluginElementItemSemanticEditPolicy extends
		ProductlineadlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PluginElementItemSemanticEditPolicy() {
		super(ProductlineadlElementTypes.PluginElement_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ProductlineadlElementTypes.RequiredInterfaceElement_3003 == req
				.getElementType()) {
			return getGEFWrapper(new RequiredInterfaceElementCreateCommand(req));
		}
		if (ProductlineadlElementTypes.ExportedPackageElement_3008 == req
				.getElementType()) {
			return getGEFWrapper(new ExportedPackageElementCreateCommand(req));
		}
		if (ProductlineadlElementTypes.ImportedPackageElement_3009 == req
				.getElementType()) {
			return getGEFWrapper(new ImportedPackageElementCreateCommand(req));
		}
		if (ProductlineadlElementTypes.ProvidedInterfaceElement_3002 == req
				.getElementType()) {
			return getGEFWrapper(new ProvidedInterfaceElementCreateCommand(req));
		}
		if (ProductlineadlElementTypes.ExtensionPointElement_3006 == req
				.getElementType()) {
			return getGEFWrapper(new ExtensionPointElementCreateCommand(req));
		}
		if (ProductlineadlElementTypes.RegisteredServiceElement_3004 == req
				.getElementType()) {
			return getGEFWrapper(new RegisteredServiceElementCreateCommand(req));
		}
		if (ProductlineadlElementTypes.ExtensionElement_3007 == req
				.getElementType()) {
			return getGEFWrapper(new ExtensionElementCreateCommand(req));
		}
		if (ProductlineadlElementTypes.ConsumedServiceElement_3005 == req
				.getElementType()) {
			return getGEFWrapper(new ConsumedServiceElementCreateCommand(req));
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
			case RequiredInterfaceElementEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (ProductlineadlVisualIDRegistry
							.getVisualID(outgoingLink) == InterfaceConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case ExportedPackageElementEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (ProductlineadlVisualIDRegistry
							.getVisualID(incomingLink) == PackageConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case ImportedPackageElementEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (ProductlineadlVisualIDRegistry
							.getVisualID(outgoingLink) == PackageConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case ProvidedInterfaceElementEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (ProductlineadlVisualIDRegistry
							.getVisualID(incomingLink) == InterfaceConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case ExtensionPointElementEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (ProductlineadlVisualIDRegistry
							.getVisualID(incomingLink) == ExtensionConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case RegisteredServiceElementEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (ProductlineadlVisualIDRegistry
							.getVisualID(incomingLink) == ServiceConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case ExtensionElementEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (ProductlineadlVisualIDRegistry
							.getVisualID(outgoingLink) == ExtensionConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case ConsumedServiceElementEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (ProductlineadlVisualIDRegistry
							.getVisualID(outgoingLink) == ServiceConnectorEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
	}

}
