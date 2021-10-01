package org.but4reuse.archmodel.synthesis.helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.but4reuse.adaptedmodel.manager.AdaptedModelManager;
import org.but4reuse.archmodel.synthesis.IFeatureArchitectureSynthesis;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint;
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
import org.but4reuse.archmodel.synthesis.utils.ArchitectureTools;
import org.but4reuse.utils.files.FileUtils;
import org.but4reuse.utils.workbench.WorkbenchUtils;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DeriveNewSoftwareArchitectures {

	
	/**
	 * 
	 * @param inputConfigFile
	 * @param inputSAPLArchitecture
	 * @param outputContainerURI
	 * @param saName
	 * @param featureArchitectureCreator
	 */
	public static void derive(File inputConfigFile, SoftwareProductLineArchitecture inputSAPLArchitecture, File outputContainerURI, String saName, IFeatureArchitectureSynthesis featureArchitectureCreator ){

				tagSelectedFeaturesArchitecture(inputSAPLArchitecture, inputConfigFile );
			//	removeConstraints(inputSAPLArchitecture);
				
				removeUnselectedFeaturesArchitecture(inputSAPLArchitecture);
		        generateNewSoftwareArchitectureVariant(inputSAPLArchitecture,outputContainerURI,saName,featureArchitectureCreator);
		  	      
			     

	}
	public static void tagSelectedFeaturesArchitecture(SoftwareProductLineArchitecture productLineArchitecture, File configFile){
		
		  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder;
			try {
				dBuilder = dbFactory.newDocumentBuilder();
			
	         Document doc = dBuilder.parse(configFile);
	         doc.getDocumentElement().normalize();
	  //       System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	         if( doc.getDocumentElement().getNodeName().equals("configuration")){
	        	 
	        	 NodeList nList = doc.getElementsByTagName("feature");
	        	 if(nList != null){
	        		 
	        		 for (int temp = 0; temp < nList.getLength(); temp++) {
	     	            Node nNode = nList.item(temp);
	     //	           System.out.println("\nCurrent Feature :" + nNode.getNodeName());

	     	           if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	     	        	   Element eElement = (Element) nNode;	
	   	               //    System.out.println(eElement.getAttribute("automatic"));
	   	             //      System.out.println(eElement.getAttribute("name"));
                            tagFeature(eElement.getAttribute("name"), productLineArchitecture);
	     	           }
	        		 }
	        	 }
	         }
	         
			 } catch (Exception e) {
		         e.printStackTrace();
		      }
		
	}
	private static void tagFeature(String selectedFeatureName, SoftwareProductLineArchitecture productLineArchitecture) {

       for (Feature feature : productLineArchitecture.getFeatures()) {
		  if(feature.getName().equals(selectedFeatureName)){
			  feature.setSelected(true); 
		  }
	   }
		
	}
	
	static void generateNewSoftwareArchitectureVariant(SoftwareProductLineArchitecture productLineArchitecture, File outputContainerFile,  String name, IFeatureArchitectureSynthesis osgiFeatureArchitectureCreator) {

		
		 ProductlineadlPackageImpl.init();
			ProductlineadlFactory factory = ProductlineadlFactory.eINSTANCE;
			Feature newFeature =factory.createFeature();
			 String defalutName ="newSAVariant" ;
			 if(name==null){
				 name = defalutName;
			 }
			newFeature.setName(name);
			newFeature.setId(name);
			
			//	create a software architecture variant from the selected features in the SAPL
			CompositeElement  compositeElement =  osgiFeatureArchitectureCreator.createCompositeModel(name, productLineArchitecture, factory);
 		   newFeature.getModel().add(compositeElement);
 		   
 		   
 		 
			
 		   
 		  osgiFeatureArchitectureCreator.saveArchitecture(name,outputContainerFile.getAbsolutePath(), newFeature);
			File rsfFile = new File(outputContainerFile.getAbsolutePath(), name+".rsf");

			
			
			createRSFFile(rsfFile, compositeElement);

	//		WorkbenchUtils.refreshIResource(AdaptedModelManager.getDefaultOutput());
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

	private static void removeConstraints(SoftwareProductLineArchitecture productLineArchitecture) {
		   
		   Iterator<Constraint> iteratorC = productLineArchitecture.getConstraints().iterator();
			while (iteratorC.hasNext()) {
				Constraint constraint = iteratorC.next(); 
			 
				iteratorC.remove();
			}
	   }
	
	
	public static void main(String[] args) {
		 ArchitectureTools archTool  = new ArchitectureTools();

		 SoftwareProductLineArchitecture productLineArchitecture= archTool.loadSAPLArchitecture(new File("productLineArchitectures/AHEclipseSAPLArchitectureCreator.xml"));
		 for (Feature feature : productLineArchitecture.getFeatures()) {
	    	   
	    	  
		    	if(feature.getModel()!=null && feature.getModel().size()>0){	    
			    		 CompositeElement composite = feature.getModel().get(0);

		    		     System.out.println(composite.getComponents().size());
		    		     
		    		     for (ComponentElement iterable_element : composite.getComponents()) {
		    		    	 org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement pe = (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement) iterable_element;
		    		    	 System.out.println(pe.getPluginSymbName());
		    		     }
		    	}
		    	 
			}
	}
	/*public static void main(String[] args) {

	//	 derive new product

//		 ft.compareAllEMFComposites(file);
	//		 System.out.println("show info");
		//	 fc.showInfosAll(file);
		 ArchitectureTools archTool  = new ArchitectureTools();

			 SoftwareProductLineArchitecture productLineArchitecture= archTool.loadSAPLArchitecture(new File("xtextConfig/PLArchitectureCreatorOsgi.xml"));

			 File configFile = new File("xtextConfig/default.xml");
			 
//			 ProductLineArchitecture productArchitecture = EcoreUtil.copy(productLineArchitecture);
			tagSelectedFeaturesArchitecture(productLineArchitecture, configFile );
			
			removeConstraints(productLineArchitecture);
			 File	 plaFile = new File("xtextConfig/newXtextVariantArch.xml");

			 archTool.saveSAPLArchitecture( plaFile, productLineArchitecture);

			 File	 newArch = new File("xtextConfig/");
			 IFeatureArchitectureSynthesis osgiFeatureArchitectureCreator = new OsgiFeatureArchitectureCreator();
	        generateNewSoftwareArchitectureVariant(productLineArchitecture,newArch,"newXtextVariantArchitecture", osgiFeatureArchitectureCreator);
	  //      removeUnselectedFeaturesArchitecture(productLineArchitecture);
	    //    fc.saveArch( plaFile, productLineArchitecture);
		


	}
	*/

	private static void removeUnselectedFeaturesArchitecture(SoftwareProductLineArchitecture productLineArchitecture) {
		
		Iterator<Feature> iterator = productLineArchitecture.getFeatures().iterator();
		while (iterator.hasNext()) {
			Feature feature = iterator.next(); 
			if(feature.getSelected() == false && !feature.getName().equals("SoftwareProductLineArchitecture")){
				System.out.println( feature.getName() +"is removed");
			  iterator.remove();
			}
		}
		
		
	}


	
	

}
