package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.providers;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ProductlineadlDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			ProductlineadlDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
