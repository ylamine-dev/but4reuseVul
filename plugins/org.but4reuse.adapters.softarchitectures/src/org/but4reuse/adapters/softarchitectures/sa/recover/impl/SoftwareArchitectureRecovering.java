package org.but4reuse.adapters.softarchitectures.sa.recover.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import org.but4reuse.adaptedmodel.AdaptedArtefact;
import org.but4reuse.adaptedmodel.AdaptedModel;
import org.but4reuse.adaptedmodel.helpers.AdaptedModelHelper;
import org.but4reuse.adaptedmodel.manager.AdaptedModelManager;
import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.sapl.synthesis.OsgiFeatureArchitectureCreator;
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
import org.but4reuse.utils.files.FileUtils;
import org.but4reuse.utils.workbench.WorkbenchUtils;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;

public class SoftwareArchitectureRecovering implements ISoftwareArchitectureVariantRecovery {

	IFeatureArchitectureSynthesis osgiFeatureArchitectureCreator ;
	private boolean headless = false;
	File outputFile;
	@Override
	public void recoverSoftwareArchitectureVariants(File outputContainer,	IProgressMonitor monitor) {
		
		 IContainer output = AdaptedModelManager.getDefaultOutput();
		 File outputFile = outputContainer;
		 if(outputContainer==null){
			 outputFile = WorkbenchUtils.getFileFromIResource(output);
		 }

			// create folder
			File artifactArchitecturesFolder = new File(outputFile, this.getClass().getSimpleName());
			if(!artifactArchitecturesFolder.exists())
			  artifactArchitecturesFolder.mkdir();
		
		AdaptedModel adaptedModel = AdaptedModelManager.getAdaptedModel();
		EList<AdaptedArtefact> adaptedArtefacts = adaptedModel.getOwnedAdaptedArtefacts();
		for (AdaptedArtefact adaptedArtefact2 : adaptedArtefacts) {
		  List<IElement> elements = AdaptedModelHelper.getElementsOfAdaptedArtefact(adaptedArtefact2);
			
		  
		  createArchitecture(artifactArchitecturesFolder, adaptedArtefact2.getArtefact().getName(),	elements);
		}
	
	}

	

	private void createArchitecture(File artifactArchitecturesFolder,String adaptedArtefactName, List<IElement> elements) {
		ProductlineadlPackageImpl.init();
			ProductlineadlFactory factory = ProductlineadlFactory.eINSTANCE;
			SoftwareProductLineArchitecture productLineArchitecture = factory.createSoftwareProductLineArchitecture();
			Feature feature =factory.createFeature();
			productLineArchitecture.getFeatures().add(feature);
			feature.setName(adaptedArtefactName);
			feature.setId(adaptedArtefactName);

			CompositeElement  compositeElement = OsgiFeatureArchitectureCreator.createCompositeModel(adaptedArtefactName, elements, factory);
			
			feature.getModel().add(compositeElement);
			
			getFeatureArchitectureCreator().saveArchitecture(adaptedArtefactName, artifactArchitecturesFolder.getAbsolutePath(), feature);
	//		OsgiBlockArchitectureCreator.saveArchitecture(adaptedArtefact2.getArtefact().getName(), artifactArchitecturesFolder.getAbsolutePath(), compositeElement);
			
			File rsfFile = new File(artifactArchitecturesFolder, adaptedArtefactName+".rsf");

			createRSFFile(rsfFile,compositeElement);
	}
	

	@Override
	public void recoverSoftwareArchitectureVariant(List<IElement> elements, String artefactName, 	IProgressMonitor monitor) {
		
		 IContainer output = AdaptedModelManager.getDefaultOutput();
			File outputFile = WorkbenchUtils.getFileFromIResource(output);
			

			// create folder
			File artifactArchitecturesFolder = new File(outputFile, this.getClass().getSimpleName());
			if(!artifactArchitecturesFolder.exists())
			  artifactArchitecturesFolder.mkdir();
		  
			  createArchitecture(artifactArchitecturesFolder, artefactName,	elements);

		
	
	}

	
	public static void createRSFFile(File rsfFile, CompositeElement compositeElement) {

		StringBuilder text = new StringBuilder();
		
		for (ComponentElement component : compositeElement.getComponents()) {
			
	      PluginElement   pl = (PluginElement) component;
	      
	      for (ConsumedServiceElement relement : pl.getConsumedServices()) {
			
		
		      text.append("contain " + pl.getPluginSymbName() + " Consumed"+ relement.getInterfaceName()+ "\n");
	      }
	      
	      for (RegisteredServiceElement celement : pl.getRegisteredServices()) {
				
	  		
		      text.append("contain " + pl.getPluginSymbName() + " Registered"+ celement.getInterfaceName()+ "\n");
	      }
	      
	      
	      for (RequiredInterfaceElement relement : pl.getRequiredInterfaces()) {
				
	  		
		      text.append("contain " + pl.getPluginSymbName() + " Required"+ relement.getInterfaceName()+ "\n");
	      }
	      
	      for (ProvidedInterfaceElement celement : pl.getProvidedInterfaces()) {
				
	  		
		      text.append("contain " + pl.getPluginSymbName() + " Provided"+ celement.getInterfaceName()+ "\n");
	      }
	      
	      for (ImportedPackageElement relement : pl.getImport_packages()) {
				
		  		
		      text.append("contain " + pl.getPluginSymbName() + " Imported"+ relement.getName()+ "\n");
	      }
	      
	      for (ExportedPackageElement celement : pl.getExport_packages()) {
				
	  		
		      text.append("contain " + pl.getPluginSymbName() + " Exported"+ celement.getName()+ "\n");
	      }
	      
	      
	      for (ExtensionElement relement : pl.getExtensions()) {
				
		  		
		      text.append("contain " + pl.getPluginSymbName() + " Extension"+ relement.getPoint()+ "\n");
	      }
	      
	      for (ExtensionPointElement celement : pl.getExtensionPoints()) {
				
	  		
		      text.append("contain " + pl.getPluginSymbName() + " ExtensionPoint"+ celement.getId()+ "\n");
	      }
	      
		} 
		saveInFile(text.toString(),rsfFile);

		
	}
	
	public static void saveInFile(String text,File file){
		PrintStream io = null;
		 if(io ==null){ 
			try {
				io = new PrintStream(new FileOutputStream(file.getAbsolutePath()));
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		 }
			io.print(text);
		}

	
	@Override
	public IFeatureArchitectureSynthesis getFeatureArchitectureCreator() {
		return new OsgiFeatureArchitectureCreator();
	}

	public boolean isHeadless() {
		return headless;
	}
	/***
	 * This method is invoked only if the but4reuse is run in headless
	 * Set the outputfolder 
	 * @param headless
	 * @param outputFolder
	 */
	public void setHeadless(File outputFolder ) {
		this.headless = true;
		this.outputFile =outputFolder;
	}
	

}
