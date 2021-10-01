package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.policies.FeatureCanonicalEditPolicy;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.policies.FeatureItemSemanticEditPolicy;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.policies.OpenDiagramEditPolicy;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part.ProductlineadlVisualIDRegistry;
import org.eclipse.draw2d.FreeformLayout;
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
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class FeatureEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

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
	public FeatureEditPart(View view) {
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
				new FeatureItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new FeatureCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (ProductlineadlVisualIDRegistry.getVisualID(childView)) {
				case OptEditPart.VISUAL_ID:
				case AndEditPart.VISUAL_ID:
				case XorEditPart.VISUAL_ID:
				case OrEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new FeatureFigure() {
			protected boolean useLocalCoordinates() {
				return true;
			}
		};
	}

	/**
	 * @generated
	 */
	public FeatureFigure getPrimaryShape() {
		return (FeatureFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FeatureIdEditPart) {
			((FeatureIdEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureFeatureIdFigure());
			return true;
		}
		if (childEditPart instanceof OptEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure().getBorderItemContainer().add(
					((OptEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof AndEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure().getBorderItemContainer().add(
					((AndEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof XorEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure().getBorderItemContainer().add(
					((XorEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof OrEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure().getBorderItemContainer().add(
					((OrEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FeatureIdEditPart) {
			return true;
		}
		if (childEditPart instanceof OptEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((OptEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof AndEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((AndEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof XorEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((XorEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof OrEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((OrEditPart) childEditPart).getFigure());
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(150, 50);
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
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
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
				.getType(FeatureIdEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class FeatureFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFeatureIdFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFeatureNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFeatureSelectedFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFeatureMandatoryFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFeatureDescriptionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFeatureAbstractFigure;

		/**
		 * @generated
		 */
		public FeatureFigure() {
			this.setLayoutManager(new XYLayout());
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(150),
					getMapMode().DPtoLP(50)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureFeatureIdFigure = new WrappingLabel();

			fFigureFeatureIdFigure.setText("<...>");

			fFigureFeatureIdFigure.setFont(FFIGUREFEATUREIDFIGURE_FONT);

			this.add(fFigureFeatureIdFigure);

			fFigureFeatureNameFigure = new WrappingLabel();

			fFigureFeatureNameFigure.setText("<...>");

			this.add(fFigureFeatureNameFigure);

			fFigureFeatureSelectedFigure = new WrappingLabel();

			fFigureFeatureSelectedFigure.setText("<...>");

			this.add(fFigureFeatureSelectedFigure);

			fFigureFeatureMandatoryFigure = new WrappingLabel();

			fFigureFeatureMandatoryFigure.setText("<...>");

			this.add(fFigureFeatureMandatoryFigure);

			fFigureFeatureDescriptionFigure = new WrappingLabel();

			fFigureFeatureDescriptionFigure.setText("<...>");

			this.add(fFigureFeatureDescriptionFigure);

			fFigureFeatureAbstractFigure = new WrappingLabel();

			fFigureFeatureAbstractFigure.setText("<...>");

			this.add(fFigureFeatureAbstractFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFeatureIdFigure() {
			return fFigureFeatureIdFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFeatureNameFigure() {
			return fFigureFeatureNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFeatureSelectedFigure() {
			return fFigureFeatureSelectedFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFeatureMandatoryFigure() {
			return fFigureFeatureMandatoryFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFeatureDescriptionFigure() {
			return fFigureFeatureDescriptionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFeatureAbstractFigure() {
			return fFigureFeatureAbstractFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREFEATUREIDFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 12, SWT.BOLD);

}
