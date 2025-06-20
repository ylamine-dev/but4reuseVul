package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.policies.InterfaceConnectorItemSemanticEditPolicy;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class InterfaceConnectorEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public InterfaceConnectorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InterfaceConnectorItemSemanticEditPolicy());
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
		return new InterfaceConnectorFigure();
	}

	/**
	 * @generated
	 */
	public InterfaceConnectorFigure getPrimaryShape() {
		return (InterfaceConnectorFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class InterfaceConnectorFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInterfaceConnectorValueFigure;

		/**
		 * @generated
		 */
		public InterfaceConnectorFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.darkGray);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInterfaceConnectorValueFigure = new WrappingLabel();

			fFigureInterfaceConnectorValueFigure.setText("<...>");

			this.add(fFigureInterfaceConnectorValueFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(2);
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInterfaceConnectorValueFigure() {
			return fFigureInterfaceConnectorValueFigure;
		}

	}

}
