package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.part;

import java.util.Collections;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.diagram.providers.ProductlineadlElementTypes;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class ProductlineadlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createFeatureModelElements1Group());
		paletteRoot.add(createFeatureModelOperators2Group());
		paletteRoot.add(createConstraintsElements3Group());
	}

	/**
	 * Creates "Feature Model Elements" palette tool group
	 * @generated
	 */
	private PaletteContainer createFeatureModelElements1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.FeatureModelElements1Group_title);
		paletteContainer.setId("createFeatureModelElements1Group"); //$NON-NLS-1$
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createFeature2CreationTool());
		paletteContainer.add(createMandatory3CreationTool());
		paletteContainer.add(createOptional4CreationTool());
		paletteContainer.add(createComposition5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Feature Model Operators" palette tool group
	 * @generated
	 */
	private PaletteContainer createFeatureModelOperators2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.FeatureModelOperators2Group_title);
		paletteContainer.setId("createFeatureModelOperators2Group"); //$NON-NLS-1$
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createOpt2CreationTool());
		paletteContainer.add(createAnd3CreationTool());
		paletteContainer.add(createOr4CreationTool());
		paletteContainer.add(createXor5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Constraints Elements" palette tool group
	 * @generated
	 */
	private PaletteContainer createConstraintsElements3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ConstraintsElements3Group_title);
		paletteContainer.setId("createConstraintsElements3Group"); //$NON-NLS-1$
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createRequire2CreationTool());
		paletteContainer.add(createMutex3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFeature2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Feature2CreationTool_title,
				Messages.Feature2CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.Feature_2003));
		entry.setId("createFeature2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.Feature_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMandatory3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Mandatory3CreationTool_title,
				Messages.Mandatory3CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.Mandatory_4011));
		entry.setId("createMandatory3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.Mandatory_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOptional4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Optional4CreationTool_title,
				Messages.Optional4CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.Optional_4012));
		entry.setId("createOptional4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.Optional_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComposition5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Composition5CreationTool_title,
				Messages.Composition5CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.Composition_4013));
		entry.setId("createComposition5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.Composition_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOpt2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Opt2CreationTool_title,
				Messages.Opt2CreationTool_desc,
				Collections.singletonList(ProductlineadlElementTypes.Opt_3014));
		entry.setId("createOpt2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.Opt_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnd3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.And3CreationTool_title,
				Messages.And3CreationTool_desc,
				Collections.singletonList(ProductlineadlElementTypes.And_3015));
		entry.setId("createAnd3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.And_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOr4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Or4CreationTool_title, Messages.Or4CreationTool_desc,
				Collections.singletonList(ProductlineadlElementTypes.Or_3017));
		entry.setId("createOr4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.Or_3017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXor5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Xor5CreationTool_title,
				Messages.Xor5CreationTool_desc,
				Collections.singletonList(ProductlineadlElementTypes.Xor_3016));
		entry.setId("createXor5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.Xor_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRequire2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Require2CreationTool_title,
				Messages.Require2CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.Require_4014));
		entry.setId("createRequire2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.Require_4014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMutex3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Mutex3CreationTool_title,
				Messages.Mutex3CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.Mutex_4015));
		entry.setId("createMutex3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.Mutex_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
