package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.providers;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.FeatureEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.ProductlineadlEditPartFactory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry;
import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class ProductlineadlEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public ProductlineadlEditPartProvider() {
		super(new ProductlineadlEditPartFactory(),
				ProductlineadlVisualIDRegistry.TYPED_INSTANCE,
				FeatureEditPart.MODEL_ID);
	}

}
