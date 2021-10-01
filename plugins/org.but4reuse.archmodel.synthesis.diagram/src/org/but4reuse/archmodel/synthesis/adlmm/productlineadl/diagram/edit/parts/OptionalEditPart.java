package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.parts;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.edit.policies.OptionalItemSemanticEditPolicy;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class OptionalEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4012;

	/**
	 * @generated
	 */
	public OptionalEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OptionalItemSemanticEditPolicy());
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
		return new OptionalFigure();
	}

	/**
	 * @generated
	 */
	public OptionalFigure getPrimaryShape() {
		return (OptionalFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class OptionalFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureOptionalValueFigure;

		/**
		 * @generated
		 */
		public OptionalFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.darkGray);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureOptionalValueFigure = new WrappingLabel();

			fFigureOptionalValueFigure.setText("<...>");

			this.add(fFigureOptionalValueFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOptionalValueFigure() {
			return fFigureOptionalValueFigure;
		}

	}

}
