package org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.part;

import java.util.Collections;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.subdiagram.providers.ProductlineadlElementTypes;
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
		paletteRoot.add(createCompoisteElements1Group());
		paletteRoot.add(createExtensionView2Group());
		paletteRoot.add(createServiceView3Group());
		paletteRoot.add(createInterfaceView4Group());
		paletteRoot.add(createPackageView5Group());
	}

	/**
	 * Creates "Compoiste Elements" palette tool group
	 * @generated
	 */
	private PaletteContainer createCompoisteElements1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.CompoisteElements1Group_title);
		paletteContainer.setId("createCompoisteElements1Group"); //$NON-NLS-1$
		paletteContainer.add(createCompositeElement1CreationTool());
		paletteContainer.add(createPluginElement2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Extension View" palette tool group
	 * @generated
	 */
	private PaletteContainer createExtensionView2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ExtensionView2Group_title);
		paletteContainer.setId("createExtensionView2Group"); //$NON-NLS-1$
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createExtensionPointElement2CreationTool());
		paletteContainer.add(createExtensionElement3CreationTool());
		paletteContainer.add(createExtensionConnector4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Service View" palette tool group
	 * @generated
	 */
	private PaletteContainer createServiceView3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.ServiceView3Group_title);
		paletteContainer.setId("createServiceView3Group"); //$NON-NLS-1$
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createConsumedServiceElement2CreationTool());
		paletteContainer.add(createRegisteredServiceElement3CreationTool());
		paletteContainer.add(createServiceConnector4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Interface View" palette tool group
	 * @generated
	 */
	private PaletteContainer createInterfaceView4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.InterfaceView4Group_title);
		paletteContainer.setId("createInterfaceView4Group"); //$NON-NLS-1$
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createProvidedInterfaceElement2CreationTool());
		paletteContainer.add(createRequiredInterfaceElement3CreationTool());
		paletteContainer.add(createInterfaceConnector4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Package View" palette tool group
	 * @generated
	 */
	private PaletteContainer createPackageView5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.PackageView5Group_title);
		paletteContainer.setId("createPackageView5Group"); //$NON-NLS-1$
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createExportedPackageElement2CreationTool());
		paletteContainer.add(createImportedPackageElement3CreationTool());
		paletteContainer.add(createPackageConnector4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositeElement1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.CompositeElement1CreationTool_title,
				Messages.CompositeElement1CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.CompositeElement_2001));
		entry.setId("createCompositeElement1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.CompositeElement_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPluginElement2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.PluginElement2CreationTool_title,
				Messages.PluginElement2CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.PluginElement_3001));
		entry.setId("createPluginElement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.PluginElement_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExtensionPointElement2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ExtensionPointElement2CreationTool_title,
				Messages.ExtensionPointElement2CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.ExtensionPointElement_3006));
		entry.setId("createExtensionPointElement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.ExtensionPointElement_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExtensionElement3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ExtensionElement3CreationTool_title,
				Messages.ExtensionElement3CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.ExtensionElement_3007));
		entry.setId("createExtensionElement3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.ExtensionElement_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExtensionConnector4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ExtensionConnector4CreationTool_title,
				Messages.ExtensionConnector4CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.ExtensionConnector_4001));
		entry.setId("createExtensionConnector4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.ExtensionConnector_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConsumedServiceElement2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ConsumedServiceElement2CreationTool_title,
				Messages.ConsumedServiceElement2CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.ConsumedServiceElement_3005));
		entry.setId("createConsumedServiceElement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.ConsumedServiceElement_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegisteredServiceElement3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.RegisteredServiceElement3CreationTool_title,
				Messages.RegisteredServiceElement3CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.RegisteredServiceElement_3004));
		entry.setId("createRegisteredServiceElement3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.RegisteredServiceElement_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createServiceConnector4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ServiceConnector4CreationTool_title,
				Messages.ServiceConnector4CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.ServiceConnector_4004));
		entry.setId("createServiceConnector4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.ServiceConnector_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProvidedInterfaceElement2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ProvidedInterfaceElement2CreationTool_title,
				Messages.ProvidedInterfaceElement2CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.ProvidedInterfaceElement_3002));
		entry.setId("createProvidedInterfaceElement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.ProvidedInterfaceElement_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRequiredInterfaceElement3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.RequiredInterfaceElement3CreationTool_title,
				Messages.RequiredInterfaceElement3CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.RequiredInterfaceElement_3003));
		entry.setId("createRequiredInterfaceElement3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.RequiredInterfaceElement_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterfaceConnector4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.InterfaceConnector4CreationTool_title,
				Messages.InterfaceConnector4CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.InterfaceConnector_4002));
		entry.setId("createInterfaceConnector4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.InterfaceConnector_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExportedPackageElement2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ExportedPackageElement2CreationTool_title,
				Messages.ExportedPackageElement2CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.ExportedPackageElement_3008));
		entry.setId("createExportedPackageElement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.ExportedPackageElement_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImportedPackageElement3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ImportedPackageElement3CreationTool_title,
				Messages.ImportedPackageElement3CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.ImportedPackageElement_3009));
		entry.setId("createImportedPackageElement3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.ImportedPackageElement_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackageConnector4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.PackageConnector4CreationTool_title,
				Messages.PackageConnector4CreationTool_desc,
				Collections
						.singletonList(ProductlineadlElementTypes.PackageConnector_4003));
		entry.setId("createPackageConnector4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProductlineadlElementTypes
				.getImageDescriptor(ProductlineadlElementTypes.PackageConnector_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
