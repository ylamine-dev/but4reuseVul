package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.policies.CompositionItemSemanticEditPolicy;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CompositionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4013;

	/**
	 * @generated
	 */
	public CompositionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositionItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new CompositionFigure();
	}

	/**
	 * @generated
	 */
	public CompositionFigure getPrimaryShape() {
		return (CompositionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class CompositionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCompositionValueFigure;

		/**
		 * @generated
		 */
		public CompositionFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.gray);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureCompositionValueFigure = new WrappingLabel();

			fFigureCompositionValueFigure.setText("<...>");

			this.add(fFigureCompositionValueFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCompositionValueFigure() {
			return fFigureCompositionValueFigure;
		}

	}

}
