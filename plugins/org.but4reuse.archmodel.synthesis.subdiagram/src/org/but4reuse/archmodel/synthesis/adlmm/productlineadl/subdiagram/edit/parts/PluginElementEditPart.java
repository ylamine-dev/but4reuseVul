package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.policies.PluginElementCanonicalEditPolicy;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.policies.PluginElementItemSemanticEditPolicy;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.draw2d.CenterLayout;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class PluginElementEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public PluginElementEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						ProductlineadlVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PluginElementItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PluginElementCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (ProductlineadlVisualIDRegistry.getVisualID(childView)) {
				case RequiredInterfaceElementEditPart.VISUAL_ID:
				case ExportedPackageElementEditPart.VISUAL_ID:
				case ImportedPackageElementEditPart.VISUAL_ID:
				case ProvidedInterfaceElementEditPart.VISUAL_ID:
				case ExtensionPointElementEditPart.VISUAL_ID:
				case RegisteredServiceElementEditPart.VISUAL_ID:
				case ExtensionElementEditPart.VISUAL_ID:
				case ConsumedServiceElementEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new PluginElementFigure();
	}

	/**
	 * @generated
	 */
	public PluginElementFigure getPrimaryShape() {
		return (PluginElementFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PluginElementNameEditPart) {
			((PluginElementNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePluginElementNameFigure());
			return true;
		}
		if (childEditPart instanceof RequiredInterfaceElementEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((RequiredInterfaceElementEditPart) childEditPart)
							.getFigure(),
							locator);
			return true;
		}
		if (childEditPart instanceof ExportedPackageElementEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((ExportedPackageElementEditPart) childEditPart)
							.getFigure(),
							locator);
			return true;
		}
		if (childEditPart instanceof ImportedPackageElementEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((ImportedPackageElementEditPart) childEditPart)
							.getFigure(),
							locator);
			return true;
		}
		if (childEditPart instanceof ProvidedInterfaceElementEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((ProvidedInterfaceElementEditPart) childEditPart)
							.getFigure(),
							locator);
			return true;
		}
		if (childEditPart instanceof ExtensionPointElementEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((ExtensionPointElementEditPart) childEditPart)
							.getFigure(),
							locator);
			return true;
		}
		if (childEditPart instanceof RegisteredServiceElementEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((RegisteredServiceElementEditPart) childEditPart)
							.getFigure(),
							locator);
			return true;
		}
		if (childEditPart instanceof ExtensionElementEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure().getBorderItemContainer().add(
					((ExtensionElementEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof ConsumedServiceElementEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure()
					.getBorderItemContainer()
					.add(((ConsumedServiceElementEditPart) childEditPart)
							.getFigure(),
							locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PluginElementNameEditPart) {
			return true;
		}
		if (childEditPart instanceof RequiredInterfaceElementEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((RequiredInterfaceElementEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ExportedPackageElementEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((ExportedPackageElementEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ImportedPackageElementEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((ImportedPackageElementEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ProvidedInterfaceElementEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((ProvidedInterfaceElementEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ExtensionPointElementEditPart) {
			getBorderedFigure().getBorderItemContainer()
					.remove(((ExtensionPointElementEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof RegisteredServiceElementEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((RegisteredServiceElementEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof ExtensionElementEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((ExtensionElementEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ConsumedServiceElementEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((ConsumedServiceElementEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(180, 100);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ProductlineadlVisualIDRegistry
				.getType(PluginElementNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class PluginElementFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePluginElementNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePluginElementPluginSymbNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePluginElementPluginVersionFigure;

		/**
		 * @generated
		 */
		public PluginElementFigure() {
			this.setLayoutManager(new CenterLayout());
			this.setOutline(false);
			this.setForegroundColor(THIS_FORE);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(180),
					getMapMode().DPtoLP(100)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(200),
					getMapMode().DPtoLP(200)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePluginElementNameFigure = new WrappingLabel();

			fFigurePluginElementNameFigure.setText("<...>");

			fFigurePluginElementNameFigure
					.setFont(FFIGUREPLUGINELEMENTNAMEFIGURE_FONT);

			this.add(fFigurePluginElementNameFigure);

			fFigurePluginElementPluginSymbNameFigure = new WrappingLabel();

			fFigurePluginElementPluginSymbNameFigure.setText("<...>");

			this.add(fFigurePluginElementPluginSymbNameFigure);

			fFigurePluginElementPluginVersionFigure = new WrappingLabel();

			fFigurePluginElementPluginVersionFigure.setText("<...>");

			this.add(fFigurePluginElementPluginVersionFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePluginElementNameFigure() {
			return fFigurePluginElementNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePluginElementPluginSymbNameFigure() {
			return fFigurePluginElementPluginSymbNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePluginElementPluginVersionFigure() {
			return fFigurePluginElementPluginVersionFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 208, 208, 128);

	/**
	 * @generated
	 */
	static final Font FFIGUREPLUGINELEMENTNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 12, SWT.ITALIC);

}
