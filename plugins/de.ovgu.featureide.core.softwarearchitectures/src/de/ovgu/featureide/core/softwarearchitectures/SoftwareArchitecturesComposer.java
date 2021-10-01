package de.ovgu.featureide.core.softwarearchitectures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URI;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.but4reuse.archmodel.synthesis.IFeatureArchitectureSynthesis;
import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureVariantRecovery;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExportedPackageElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ImportedPackageElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedInterfaceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl;
import org.but4reuse.archmodel.synthesis.helper.ArchtectureVariantRecoverHelper;
import org.but4reuse.archmodel.synthesis.utils.ArchitectureTools;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;

import de.ovgu.featureide.core.builder.ComposerExtensionClass;
import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.configuration.Configuration;

public class SoftwareArchitecturesComposer extends ComposerExtensionClass {

	

	/**
	 * This is call when the project builds using the currently selected
	 * configuration by the user
	 */
//	@Override
	public void performFullBuild(Path config) {

		System.out.println("software architecture composer is started..");

		// Get the selected features and order them
		final List<String> selectedFeatures = getSelectedNonAbstractFeatures(config);
		final List<String> orderedFeatures = orderSelectedFeatures(selectedFeatures);
		System.out.println("selected features size : " + selectedFeatures.size());

		if (selectedFeatures.size() > 0) {
		// We assume that the user gives a valid input files and folders
			File modelFile = featureProject.getModelFile().getRawLocation().makeAbsolute().toFile();
			//compose(orderedFeatures, modelFile);
			composeSA(orderedFeatures);
		}
	}

	/**
	 * This is call when we want to generate all valid configurations or in
	 * other user actions
	 */
	@Override
	public void buildConfiguration(IFolder folder, Configuration configuration, String configurationName) {
		// call super to save the config file and others
		System.out.println("software architecture composer is started");

		super.buildConfiguration(folder, configuration, configurationName);
		final List<String> orderedFeatures = orderSelectedFeatures(configuration.getSelectedFeatureNames());
		System.out.println("je suis dans buildConfiguration");
		System.out.println("selected features size : " + orderedFeatures.size());

		if (orderedFeatures.size() > 0) {
		// We assume that the user gives a valid input files and folders
			File modelFile = featureProject.getModelFile().getRawLocation().makeAbsolute().toFile();
		//	compose(orderedFeatures, modelFile);
			composeSA(orderedFeatures);
		}
	}

	
	/**
	 * Get selected non abstract features
	 *
	 * @param config
	 * @return features
	 */
	protected List<String> getSelectedNonAbstractFeatures(Path config) {
		final List<String> selectedFeatures = new ArrayList<>();
		final Configuration configuration =featureProject.loadCurrentConfiguration();
	//	final Configuration configuration = (Configuration) featureProject.getCurrentConfiguration();
		if (configuration != null) {
			for (final IFeature f : configuration.getSelectedFeatures()) {
				if (!f.getStructure().isAbstract()) {
					selectedFeatures.add(f.getName());
				}
			} 
		}
		return selectedFeatures;
	}

	/**
	 * Order the features in case of user-defined ordering
	 *
	 * @param selectedFeatures
	 * @return ordered features
	 */
	protected List<String> orderSelectedFeatures(Collection<String> selectedFeatures) {
		// Order them if needed
		final List<String> orderedFeatures = new ArrayList<String>();
		if (featureProject.getFeatureModel().isFeatureOrderUserDefined()) {
			final List<String> featureOrderList = featureProject.getFeatureModel().getFeatureOrderList();
			for (final String feature : featureOrderList) {
				if (selectedFeatures.contains(feature)) {
					orderedFeatures.add(feature);
				}
			}
		} else {
			orderedFeatures.addAll(selectedFeatures);
		}
		return orderedFeatures;
	}


	
	private void composeSA(final List<String> orderedFeatures) {
		
		ArchitectureTools archTool = new ArchitectureTools();
		ArrayList<CompositeElement> featureSoftArchModels = new ArrayList<CompositeElement>();
		for (int i = 0; i < orderedFeatures.size(); i++) {
			 IFolder f = featureProject.getSourceFolder().getFolder(orderedFeatures.get(i));
	//		System.out.println(f.getName());
			 File folder = f.getRawLocation().makeAbsolute().toFile();
		//	System.out.println(folder.getAbsolutePath());
			
			File featureSoftArchFile = new File(folder.getAbsolutePath()+File.separator+f.getName()+".xmi");
			System.out.println(featureSoftArchFile.getAbsolutePath());

			if(featureSoftArchFile.exists()){
				CompositeElement featureSoftArchModel = archTool.loadFeatureArchitecture(featureSoftArchFile)	;
				System.out.println("Components size "+featureSoftArchModel.getComponents().size());
				System.out.println("Connectors size "+featureSoftArchModel.getConnectors().size());
				featureSoftArchModels.add(featureSoftArchModel);
			}
		
		}
		
		deriveNewSoftArchiVariant(null, featureSoftArchModels);
		
	}

	
	private void deriveNewSoftArchiVariant(String SAVariantName, ArrayList<CompositeElement> featureSoftArchModels) {

		// IFeatureArchitectureSynthesis osgiFeatureArchitectureCreator =
		// prepareSoftArchiComposition(orderedFeatures,
		// productLineArchitecture);
		if (featureSoftArchModels.size() != 0) {
			System.out.println("start deriving ");
			// Default output folder
			File outputContainerFile = featureProject.getBuildFolder().getRawLocation().makeAbsolute().toFile();

			ProductlineadlPackageImpl.init();
			ProductlineadlFactory factory = ProductlineadlFactory.eINSTANCE;
			Feature newFeature = factory.createFeature();
			String defalutName = "newSoftArchVariant";
			if (SAVariantName == null) {
				SAVariantName = defalutName;
			}
			newFeature.setName(SAVariantName);
			newFeature.setId(SAVariantName);

			// create a software architecture variant from the selected features
			// in the SAPL
			SoftArchitectureCreator osgiFeatureArchitectureCreator = new SoftArchitectureCreator();

			CompositeElement compositeElement = osgiFeatureArchitectureCreator.createCompositeModel(SAVariantName,featureSoftArchModels, factory);

			newFeature.getModel().add(compositeElement);
			osgiFeatureArchitectureCreator.saveArchitecture(SAVariantName, outputContainerFile.getAbsolutePath(),
					newFeature);

			// this part is used for evaluation
			File rsfFile = new File(outputContainerFile.getAbsolutePath(), SAVariantName + ".rsf");

			createRSFFile(rsfFile, compositeElement);

		}
	}

	/**
	 * This is used for evaluation
	 * @param rsfFile
	 * @param compositeElement
	 */
	public static void createRSFFile(File rsfFile, CompositeElement compositeElement) {

		StringBuilder text = new StringBuilder();

		for (ComponentElement component : compositeElement.getComponents()) {

			PluginElement pl = (PluginElement) component;

			for (ConsumedServiceElement relement : pl.getConsumedServices()) {

				text.append("contain " + pl.getPluginSymbName() + " Consumed" + relement.getInterfaceName() + "\n");
			}

			for (RegisteredServiceElement celement : pl.getRegisteredServices()) {

				text.append("contain " + pl.getPluginSymbName() + " Registered" + celement.getInterfaceName() + "\n");
			}

			for (RequiredInterfaceElement relement : pl.getRequiredInterfaces()) {

				text.append("contain " + pl.getPluginSymbName() + " Required" + relement.getInterfaceName() + "\n");
			}

			for (ProvidedInterfaceElement celement : pl.getProvidedInterfaces()) {

				text.append("contain " + pl.getPluginSymbName() + " Provided" + celement.getInterfaceName() + "\n");
			}

			for (ImportedPackageElement relement : pl.getImport_packages()) {

				text.append("contain " + pl.getPluginSymbName() + " Imported" + relement.getName() + "\n");
			}

			for (ExportedPackageElement celement : pl.getExport_packages()) {

				text.append("contain " + pl.getPluginSymbName() + " Exported" + celement.getName() + "\n");
			}

			for (ExtensionElement relement : pl.getExtensions()) {

				text.append("contain " + pl.getPluginSymbName() + " Extension" + relement.getPoint() + "\n");
			}

			for (ExtensionPointElement celement : pl.getExtensionPoints()) {

				text.append("contain " + pl.getPluginSymbName() + " ExtensionPoint" + celement.getId() + "\n");
			}

		}
		saveInFile(text.toString(), rsfFile);

	}

	public static void saveInFile(String text, File file) {
		PrintStream io = null;
		if (io == null) {
			try {
				io = new PrintStream(new FileOutputStream(file.getAbsolutePath()));
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
		}
		io.print(text);
	}


///// an other composer based on SAPL filtering 	
	
	private void compose(final List<String> orderedFeatures, File modelFile) {
		File saplArchitecture = new File(modelFile.getAbsolutePath().replace(".xml", ".sapl"));

		if (saplArchitecture.exists()) {

			ArchitectureTools archTool = new ArchitectureTools();
			SoftwareProductLineArchitecture inputSAPLArchitecture = archTool.loadSAPLArchitecture(saplArchitecture);

			if (inputSAPLArchitecture != null) {
				deriveSoftArchiVariant(inputSAPLArchitecture,orderedFeatures, null);
			}
		}
	}
	
	
	
	public void deriveSoftArchiVariant(SoftwareProductLineArchitecture productLineArchitecture, List<String> orderedFeatures, String SAVariantName) {

		
		prepareSoftArchiComposition(orderedFeatures, productLineArchitecture);

		// Default output folder
		File outputContainerFile = featureProject.getBuildFolder().getRawLocation().makeAbsolute().toFile();

		ProductlineadlPackageImpl.init();
		ProductlineadlFactory factory = ProductlineadlFactory.eINSTANCE;
		Feature newFeature = factory.createFeature();
		String defalutName = "newSAVariant";
		if (SAVariantName == null) {
			SAVariantName = defalutName;
		}
		newFeature.setName(SAVariantName);
		newFeature.setId(SAVariantName);

		// create a software architecture variant from the selected features in the SAPL
		IFeatureArchitectureSynthesis osgiFeatureArchitectureCreator = new SoftArchitectureCreator(); 
		CompositeElement compositeElement = osgiFeatureArchitectureCreator.createCompositeModel(SAVariantName,productLineArchitecture, factory);
		newFeature.getModel().add(compositeElement);
		osgiFeatureArchitectureCreator.saveArchitecture(SAVariantName, outputContainerFile.getAbsolutePath(), newFeature);

		// this part is used for evaluation
		File rsfFile = new File(outputContainerFile.getAbsolutePath(), SAVariantName + ".rsf");

		createRSFFile(rsfFile, compositeElement);

		// WorkbenchUtils.refreshIResource(AdaptedModelManager.getDefaultOutput());
	}

	
	private void prepareSoftArchiComposition(final List<String> orderedFeatures,
			SoftwareProductLineArchitecture inputSAPLArchitecture) {
		
		tagSelectedFeaturesInSAPL(inputSAPLArchitecture, orderedFeatures);
		removeUnselectedFeaturesSAPL(inputSAPLArchitecture);
		
	}

	private void tagSelectedFeaturesInSAPL(SoftwareProductLineArchitecture inputSAPLArchitecture,
			List<String> orderedFeatures) {

		for (String feature : orderedFeatures) {
			System.out.println(feature);
			tagFeature(feature, inputSAPLArchitecture);
		}
	}

	private void tagFeature(String selectedFeatureName, SoftwareProductLineArchitecture productLineArchitecture) {

		for (Feature feature : productLineArchitecture.getFeatures()) {
			if (feature.getName().equals(selectedFeatureName)) {
				feature.setSelected(true);
			}
		}

	}

	private void removeUnselectedFeaturesSAPL(SoftwareProductLineArchitecture productLineArchitecture) {

		Iterator<Feature> iterator = productLineArchitecture.getFeatures().iterator();
		while (iterator.hasNext()) {
			Feature feature = iterator.next();
			if (feature.getSelected() == false && !feature.getName().equals("SoftwareProductLineArchitecture")) {
				System.out.println(feature.getName() + "is removed");
				iterator.remove();
			}
		}

	}
/*
	@Override
	public void performFullBuild(IFile config) {
		// TODO Auto-generated method stub
		System.out.println("new software architecture composer is started");

	}
*/
		
	

		
	
	

}
