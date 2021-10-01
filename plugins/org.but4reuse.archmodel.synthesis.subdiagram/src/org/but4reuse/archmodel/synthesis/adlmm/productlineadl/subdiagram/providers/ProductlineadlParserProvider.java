package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.providers;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.CompositeElementNameEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.edit.parts.PluginElementNameEditPart;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.parsers.MessageFormatParser;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part.ProductlineadlVisualIDRegistry;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ProductlineadlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser compositeElementName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getCompositeElementName_5009Parser() {
		if (compositeElementName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ProductlineadlPackage.eINSTANCE
					.getCompositeElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositeElementName_5009Parser = parser;
		}
		return compositeElementName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser pluginElementName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getPluginElementName_5010Parser() {
		if (pluginElementName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ProductlineadlPackage.eINSTANCE
					.getPluginElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pluginElementName_5010Parser = parser;
		}
		return pluginElementName_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CompositeElementNameEditPart.VISUAL_ID:
			return getCompositeElementName_5009Parser();
		case PluginElementNameEditPart.VISUAL_ID:
			return getPluginElementName_5010Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ProductlineadlVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ProductlineadlVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ProductlineadlElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
