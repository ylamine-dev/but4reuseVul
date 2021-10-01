package org.but4reuse.archmodel.synthesis.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;
import org.but4reuse.artefactmodel.Artefact;
import org.but4reuse.artefactmodel.ArtefactModelFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/***
 * This class is used to load and save models that are conform to our SAPL
 * metamodel
 * 
 * @author kerdoudi
 *
 */
public class ArchitectureTools {

	private ResourceSetImpl resourceSet;

	public ArchitectureTools() {
		initialize();
	}

	private void initialize() {
		// Create a resource set to hold the resources.
		resourceSet = new ResourceSetImpl();
		// Register the appropriate resource factory to handle all file
		// extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(ProductlineadlPackage.eNS_URI, ProductlineadlPackage.eINSTANCE);
	}

	/**
	 * Load block architecture
	 * 
	 * @param compositeFile
	 * @return
	 */
	public CompositeElement loadFeatureArchitecture(File compositeFile) {
		CompositeElement featureArchitecture = null;
		URI uri = URI.createFileURI(compositeFile.getAbsolutePath());
		try {
			Resource resource = resourceSet.getResource(uri, true);
			Feature feature = (Feature) resource.getContents().get(0);
			featureArchitecture = feature.getModel().get(0);

		} catch (Exception e) {
			// e.printStackTrace();
		}
		return featureArchitecture;
	}

	/**
	 * load SAPL Architecture
	 * 
	 * @param architecture
	 * @return
	 */
	public SoftwareProductLineArchitecture loadSAPLArchitecture(File architecture) {
		URI uri = URI.createFileURI(architecture.getAbsolutePath());
		if (!architecture.isDirectory()) {
			// Register the appropriate resource factory to handle all file
			// extensions.
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

			// Register the package to ensure it is available during loading.
			resourceSet.getPackageRegistry().put(ProductlineadlPackage.eNS_URI, ProductlineadlPackage.eINSTANCE);
			Resource resource = resourceSet.getResource(uri, true);
			SoftwareProductLineArchitecture softwareArchitectureProductLineModel = (SoftwareProductLineArchitecture) resource
					.getContents().get(0);

			return softwareArchitectureProductLineModel;

		} else {
			System.err.println(architecture.getAbsolutePath() + " is not a valide SAPL");
			return null;
		}

	}

	/***
	 * save SAPL Architecture
	 * 
	 * @param saplaFile
	 * @param saplModel
	 */
	public void saveSAPLArchitecture(File saplaFile, SoftwareProductLineArchitecture saplModel) {

		// Create a resource set to hold the resources.
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		// Register the appropriate resource factory to handle all file
		// extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(ProductlineadlPackage.eNS_URI, ProductlineadlPackage.eINSTANCE);

		// Create a resource set to hold the resources.
		//
		resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(ProductlineadlPackage.eNS_URI, ProductlineadlPackage.eINSTANCE);

		// save the model

		try {
			File outputFile = new File(saplaFile.getAbsolutePath());
			org.eclipse.emf.common.util.URI outputFileURI = org.eclipse.emf.common.util.URI
					.createFileURI(outputFile.getAbsolutePath());
			Resource resource = resourceSet.createResource(outputFileURI);
			resource.getContents().add(saplModel);
			resource.save(null);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

	public void saveFeatureArchitecture(String fileName, String outputPath, Feature feature) {

		// Create a resource set to hold the resources.
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		// Register the appropriate resource factory to handle all file
		// extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(ProductlineadlPackage.eNS_URI, ProductlineadlPackage.eINSTANCE);

		// Create a resource set to hold the resources.
		//
		resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(ProductlineadlPackage.eNS_URI, ProductlineadlPackage.eINSTANCE);

		// save the model

		try {
			File outputFile = new File(outputPath + File.separator + fileName + ".xmi");
			org.eclipse.emf.common.util.URI outputFileURI = org.eclipse.emf.common.util.URI
					.createFileURI(outputFile.getAbsolutePath());
			Resource resource = resourceSet.createResource(outputFileURI);
			resource.getContents().add(feature);
			resource.save(null);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ArchitectureTools a = new ArchitectureTools();
		// SoftwareProductLineArchitecture p = a.loadSAPLArchitecture(new
		// File("C:\\Users\\kerdoudi\\gitbut4reuse\\but4reuse\\plugins\\org.but4reuse.archmodel.synthesis\\xtextConfig\\PLArchitectureCreatorOsgi.xml"));

		SoftwareProductLineArchitecture p = a.loadSAPLArchitecture(new File(
				"C:\\Users\\kerdoudi\\but4reuse\\IST\\eclipse-modeling-neon-2-win32-x86_64\\eclipse\\runtime-EclipseApplication\\Keplervariants\\modeling2019_arandom_12_extension\\productLineArchitectures\\FlatOsgiSAPLArchitectureCreator.xml"));
		File variantsPath = new File("C:\\Users\\kerdoudi");
		List<File> allFeaturesInInputVariants = getallFeaturesInInputVars(variantsPath, 12);

		System.out.println(p.getFeatures().size());
		
		for (Feature feature : p.getFeatures()) {
			if(feature.getModel()!= null){
				if(feature.getModel().size() > 0 ){
					
					CompositeElement compo = feature.getModel().get(0);
					if(compo != null){
					   compo.getComponents();
					   System.out.println("");
					   System.out.println("------> plugins for :" +feature.getName() );
					   System.out.println("");
					   FeatureIdentificationEvaluation featureIdentificationEvaluation = new FeatureIdentificationEvaluation();
					   featureIdentificationEvaluation.getTruePositives();
					   
					   
					}
				}
			}
		}
	}


	private static List<File> getallFeaturesInInputVars(File variantsPath, int i) {

		List<File> allFeaturesInInputVariants =new ArrayList<File>();
		if(variantsPath.isDirectory()){
			File[] variants = variantsPath.listFiles();
			for (int j = 0; j < i; j++) {
				File currentDistribution = variants[j];
				System.out.println("variant :"+currentDistribution.getName());
				
				  if (currentDistribution.exists() && currentDistribution.isDirectory()){
		               File currentFeatures = new File(currentDistribution.getAbsolutePath()+"/eclipse/features");
	                 if(!currentFeatures.exists()){
	               	   currentFeatures = new File(currentDistribution.getAbsolutePath()+"/features");
	                 }
	                 if(currentFeatures!= null && currentFeatures.exists()){
	   		    		for (File featurei : currentFeatures.listFiles()) {
	   		    			
	   		    		   if(featurei.getName().endsWith(".xml")){
	   		    			   allFeaturesInInputVariants.add(featurei);
	   		    		   }
	   		    		}
	                 }
				  }
			}
		}
				
			
		return allFeaturesInInputVariants;
	}
}
