package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part;

import org.eclipse.gmf.tooling.runtime.part.DefaultModelElementSelectionPage;

/**
 * Wizard page that allows to select element from model.
 * @generated
 */
public class ModelElementSelectionPage extends DefaultModelElementSelectionPage {

	/**
	 * @generated
	 */
	public ModelElementSelectionPage(String pageName) {
		super(ProductlineadlDiagramEditorPlugin.getInstance()
				.getItemProvidersAdapterFactory(), pageName);
	}

	/**
	 * Override to provide custom model element description.
	 * @generated
	 */
	protected String getSelectionTitle() {
		return Messages.ModelElementSelectionPageMessage;
	}

}
