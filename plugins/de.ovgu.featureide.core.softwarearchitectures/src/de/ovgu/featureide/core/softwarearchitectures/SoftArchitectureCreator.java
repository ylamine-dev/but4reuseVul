package de.ovgu.featureide.core.softwarearchitectures;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.but4reuse.adapters.IElement;
/*import org.but4reuse.adapters.eclipse.softarchitectures.ExtensionElement;
import org.but4reuse.adapters.eclipse.softarchitectures.ExtensionPointElement;
import org.but4reuse.adapters.eclipse.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.eclipse.softarchitectures.PackageElement;
import org.but4reuse.adapters.eclipse.softarchitectures.PluginElement;
import org.but4reuse.adapters.eclipse.softarchitectures.ServiceElement;*/
import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureProductLineSynthesis;
import org.but4reuse.archmodel.synthesis.IFeatureArchitectureSynthesis;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.*;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl;
import org.but4reuse.archmodel.synthesis.utils.ArchitectureTools;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * create an architecture for each feature
 * @author kerdoudi
 *
 */
public class SoftArchitectureCreator implements IFeatureArchitectureSynthesis{

	
	public static boolean interfaceView = false;
	public static boolean serviceView=false;
	public static boolean extensionView=false;
	public static boolean packageView=true;

	
	

     /**
      * This is used for creating a feature software architecture	
      * @param name
      * @param elements
      * @param factory
      * @return
      */
	public static CompositeElement createCompositeModel(String name, List<IElement> elements,ProductlineadlFactory factory) {



			CompositeElement compositeElement = factory.createCompositeElement();
			compositeElement.setName(name);
			
			
				
			        addInnerConnectors(compositeElement,factory);
					return compositeElement;
					
					
					
		}
	
	
	
	@Override
	public CompositeElement createCompositeModel(String name, SoftwareProductLineArchitecture productLineArchitecture,ProductlineadlFactory factory) {


		CompositeElement compositeElement = factory.createCompositeElement();
		compositeElement.setName(name);
		
		for (Feature feature : productLineArchitecture.getFeatures()) {
	    	   
	    	   if(feature.getSelected()){
	    		   
		    		 CompositeElement composite = feature.getModel().get(0);

	    		   
	    		     for (ComponentElement iterable_element : composite.getComponents()) {
	    		    	 org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement pe = (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement) iterable_element;
	    					
	    					org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement emfPluginElement = factory.createPluginElement();
	    					emfPluginElement.setName(pe.getName());
	    					emfPluginElement.setPluginSymbName(pe.getPluginSymbName());
	    					emfPluginElement.setPluginVersion(pe.getPluginVersion());

	    	                
	    	                	for (ProvidedInterfaceElement providedInterface : pe.getProvidedInterfaces()) {
	    	                	
	    	                	  ProvidedInterfaceElement emfProvidedInterface;
	    	                	  emfProvidedInterface = factory.createProvidedInterfaceElement();
	    	                	  emfProvidedInterface.setInterfaceName(providedInterface.getInterfaceName());
	    	                	
	    						  emfPluginElement.getProvidedInterfaces().add(emfProvidedInterface);
	    					    }
	    					
	    	                    for (RequiredInterfaceElement requiredInterface : pe.getRequiredInterfaces()) {

	    	                    	RequiredInterfaceElement emfRequiredInterface;
	    	                	  emfRequiredInterface = factory.createRequiredInterfaceElement();
	    	                	  emfRequiredInterface.setInterfaceName(requiredInterface.getInterfaceName());
	    	                	
	    						  emfPluginElement.getRequiredInterfaces().add(emfRequiredInterface);
	    					   }
	    	                    
	    	                    for (ImportedPackageElement importElement : pe.getImport_packages()) {
	    	    					
	    	  					  ImportedPackageElement emfImportElement;
	    	  					  emfImportElement = factory.createImportedPackageElement();
	    	  					  emfImportElement.setName(importElement.getName());
	    	  					
	    	  					  
	    	  					  emfPluginElement.getImport_packages().add(emfImportElement);
	    	                    }
	    	  				
	    	                     for (ExportedPackageElement exportElement : pe.getExport_packages()) {
	    	                  	   ExportedPackageElement emfExportElement;
	    	                  	   emfExportElement = factory.createExportedPackageElement();
	    	                  	   emfExportElement.setName(exportElement.getName());
	    	  					
	    	  					
	    	                  	   emfPluginElement.getExport_packages().add(emfExportElement);
	    	                     }
	    	                     for (RegisteredServiceElement registeredService : pe.getRegisteredServices()) {
		    	                   	  RegisteredServiceElement emfServiceElement;
		    	                   	  emfServiceElement = factory.createRegisteredServiceElement();
		    	                   	  emfServiceElement.setObjName(registeredService.getObjName());
		    	                   	  emfServiceElement.setInterfaceName(registeredService.getInterfaceName()) ;

		    	                
		    	                   	  emfPluginElement.getRegisteredServices().add(emfServiceElement);
	    	                      }
	    	                   	  

	    	   				   
	    	   				
	    	                      for (ConsumedServiceElement consumedService : pe.getConsumedServices()) { 

	    	                    	  ConsumedServiceElement emfServiceElement;
	    	                    	  emfServiceElement = factory.createConsumedServiceElement();
	    	                    	  emfServiceElement.setObjName(consumedService.getObjName());
	    	                	      emfServiceElement.setInterfaceName(consumedService.getInterfaceName()) ;

	    	              
	    	                	      emfPluginElement.getConsumedServices().add(emfServiceElement);

	    	                      }
	    	                      
	    	                      for (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement extension : pe.getExtensions()) {
		    	      					
		    	                      	org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement emfExtensionElement;
		    	                      	emfExtensionElement = factory.createExtensionElement();
		    	                      	
		    	                      	emfExtensionElement.setPoint(extension.getPoint());
		    	                      	emfPluginElement.getExtensions().add(emfExtensionElement);
	    	      				  }
	    	      				
	    	                      for (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement extensionPoint : pe.getExtensionPoints()) {
	    	      						org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement extensionPointElement;
		    	      					extensionPointElement = factory.createExtensionPointElement();
		    	      					
		    	      					extensionPointElement.setId(extensionPoint.getId());
		    	      					
		    	      					if(extensionPoint.getName()!=null)
		    	      					  extensionPointElement.setName(extensionPoint.getName());
		    	      					
		    	      					if(extensionPoint.getSchema()!=null)
		    	      					extensionPointElement.setSchema(extensionPoint.getSchema());
		    	      					
		    	      					emfPluginElement.getExtensionPoints().add(extensionPointElement);
	    	      				   }
	    	                      compositeElement.getComponents().add(emfPluginElement);

	    		     }
	    	                      
	    	                   
	    	   }
		}
		 addInnerConnectors(compositeElement,factory);
	 return compositeElement;
	}
	    	   
		
	/***
	 * 	This is used for deriving new feature software architecture (used by our composer)
	 * @param name
	 * @param featureSoftArchModels
	 * @param factory
	 * @return
	 */
	public static CompositeElement createCompositeModel(String name, ArrayList<CompositeElement> featureSoftArchModels,ProductlineadlFactory factory) {


		CompositeElement compositeElement = factory.createCompositeElement();
		compositeElement.setName(name);
		
		for (CompositeElement composite : featureSoftArchModels) {
	    	   
	    		     for (ComponentElement iterable_element : composite.getComponents()) {
	    		    	 org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement pe = (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement) iterable_element;
	    					
	    					org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement emfPluginElement = factory.createPluginElement();
	    					emfPluginElement.setName(pe.getName());
	    					emfPluginElement.setPluginSymbName(pe.getPluginSymbName());
	    					emfPluginElement.setPluginVersion(pe.getPluginVersion());

	    	                
	    	                	for (ProvidedInterfaceElement providedInterface : pe.getProvidedInterfaces()) {
	    	                	
	    	                	  ProvidedInterfaceElement emfProvidedInterface;
	    	                	  emfProvidedInterface = factory.createProvidedInterfaceElement();
	    	                	  emfProvidedInterface.setInterfaceName(providedInterface.getInterfaceName());
	    	                	
	    						  emfPluginElement.getProvidedInterfaces().add(emfProvidedInterface);
	    					    }
	    					
	    	                    for (RequiredInterfaceElement requiredInterface : pe.getRequiredInterfaces()) {

	    	                    	RequiredInterfaceElement emfRequiredInterface;
	    	                	  emfRequiredInterface = factory.createRequiredInterfaceElement();
	    	                	  emfRequiredInterface.setInterfaceName(requiredInterface.getInterfaceName());
	    	                	
	    						  emfPluginElement.getRequiredInterfaces().add(emfRequiredInterface);
	    					   }
	    	                    
	    	                    for (ImportedPackageElement importElement : pe.getImport_packages()) {
	    	    					
	    	  					  ImportedPackageElement emfImportElement;
	    	  					  emfImportElement = factory.createImportedPackageElement();
	    	  					  emfImportElement.setName(importElement.getName());
	    	  					
	    	  					  
	    	  					  emfPluginElement.getImport_packages().add(emfImportElement);
	    	                    }
	    	  				
	    	                     for (ExportedPackageElement exportElement : pe.getExport_packages()) {
	    	                  	   ExportedPackageElement emfExportElement;
	    	                  	   emfExportElement = factory.createExportedPackageElement();
	    	                  	   emfExportElement.setName(exportElement.getName());
	    	  					
	    	  					
	    	                  	   emfPluginElement.getExport_packages().add(emfExportElement);
	    	                     }
	    	                     for (RegisteredServiceElement registeredService : pe.getRegisteredServices()) {
		    	                   	  RegisteredServiceElement emfServiceElement;
		    	                   	  emfServiceElement = factory.createRegisteredServiceElement();
		    	                   	  emfServiceElement.setObjName(registeredService.getObjName());
		    	                   	  emfServiceElement.setInterfaceName(registeredService.getInterfaceName()) ;

		    	                
		    	                   	  emfPluginElement.getRegisteredServices().add(emfServiceElement);
	    	                      }
	    	                   	  

	    	   				   
	    	   				
	    	                      for (ConsumedServiceElement consumedService : pe.getConsumedServices()) { 

	    	                    	  ConsumedServiceElement emfServiceElement;
	    	                    	  emfServiceElement = factory.createConsumedServiceElement();
	    	                    	  emfServiceElement.setObjName(consumedService.getObjName());
	    	                	      emfServiceElement.setInterfaceName(consumedService.getInterfaceName()) ;

	    	              
	    	                	      emfPluginElement.getConsumedServices().add(emfServiceElement);

	    	                      }
	    	                      
	    	                      for (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement extension : pe.getExtensions()) {
		    	      					
		    	                      	org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement emfExtensionElement;
		    	                      	emfExtensionElement = factory.createExtensionElement();
		    	                      	
		    	                      	emfExtensionElement.setPoint(extension.getPoint());
		    	                      	emfPluginElement.getExtensions().add(emfExtensionElement);
	    	      				  }
	    	      				
	    	                      for (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement extensionPoint : pe.getExtensionPoints()) {
	    	      						org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement extensionPointElement;
		    	      					extensionPointElement = factory.createExtensionPointElement();
		    	      					
		    	      					extensionPointElement.setId(extensionPoint.getId());
		    	      					
		    	      					if(extensionPoint.getName()!=null)
		    	      					  extensionPointElement.setName(extensionPoint.getName());
		    	      					
		    	      					if(extensionPoint.getSchema()!=null)
		    	      					extensionPointElement.setSchema(extensionPoint.getSchema());
		    	      					
		    	      					emfPluginElement.getExtensionPoints().add(extensionPointElement);
	    	      				   }
	    	                      compositeElement.getComponents().add(emfPluginElement);

	    		     }
	    	                      
	    	                   
	    	  
		}
		 addInnerConnectors(compositeElement,factory);
	 return compositeElement;
	}
		
/**
 * create a feature architecture 		
 */
	public void createFeatureArchitecture(String fileName, List<IElement> elements, String outputPath) {
		if(elements !=null){

		ProductlineadlPackageImpl.init();
		ProductlineadlFactory factory = ProductlineadlFactory.eINSTANCE;
		SoftwareProductLineArchitecture productLineArchitecture = factory.createSoftwareProductLineArchitecture();
		Feature feature =factory.createFeature();
		productLineArchitecture.getFeatures().add(feature);
		feature.setName(fileName);
		feature.setId(fileName);

		
	    CompositeElement  compositeElement = createCompositeModel(fileName, elements, factory);
		
		feature.getModel().add(compositeElement);
		 ArchitectureTools archTool  = new ArchitectureTools();

			// Save
			 archTool.saveFeatureArchitecture(fileName, outputPath, feature);
		//saveArchitecture(fileName, outputPath, feature);
		}
	}

	
	
	private static void    addInnerConnectors(CompositeElement compositeElement, ProductlineadlFactory factory) {


		
		 for (ComponentElement component : compositeElement.getComponents()) {
			
			 if (component instanceof org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement){
				 org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement	emfPluginElement =  (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement) component;
				 
				 
				 
				 for (ProvidedInterfaceElement providedElement : emfPluginElement.getProvidedInterfaces()) {
					 List<RequiredInterfaceElement>	requiredElements = getRequiredInterfaceElements(compositeElement, component, providedElement );
					 if(requiredElements != null)
					 for (RequiredInterfaceElement requiredElement : requiredElements) {
						 InterfaceConnector connector = factory.createInterfaceConnector();
						 connector.setSource(requiredElement);
						 connector.setTarget(providedElement);
					//	 connector.setValue(emfPluginElement.get);
						 compositeElement.getConnectors().add(connector);
					 }
				 }
				 
				 for (RegisteredServiceElement providedElement :  emfPluginElement.getRegisteredServices()) {
					 List<ConsumedServiceElement>	requiredElements = getConsumedServiceElements(compositeElement, component, providedElement );
					 if(requiredElements != null)
					 for (ConsumedServiceElement requiredElement : requiredElements) {
						 ServiceConnector connector = factory.createServiceConnector();
						 connector.setSource(requiredElement);
						 connector.setTarget(providedElement);
						 compositeElement.getConnectors().add(connector);

					 }
				 }
				 
				 for (ExportedPackageElement providedElement :  emfPluginElement.getExport_packages()) {
					 List<ImportedPackageElement>	requiredElements = getImportPackageElements(compositeElement, component, providedElement );
					 if(requiredElements != null)
					 for (ImportedPackageElement requiredElement : requiredElements) {
						 PackageConnector connector = factory.createPackageConnector();
						 connector.setSource(requiredElement);
						 connector.setTarget(providedElement);
						 compositeElement.getConnectors().add(connector);

					 }
				 }
				 for (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement providedElement :  emfPluginElement.getExtensionPoints()) {
					 List<org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement>	requiredElements = getExtensionElements(compositeElement, component, providedElement );
					 if(requiredElements != null)
					 for (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement requiredElement : requiredElements) {
						 ExtensionConnector connector = factory.createExtensionConnector();
						 connector.setSource(requiredElement);
						 connector.setTarget(providedElement);
						 compositeElement.getConnectors().add(connector);

					 }
				 }
			 }
		 }
		
	}



	private static List<org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement> getExtensionElements(
			CompositeElement compositeElement, ComponentElement component,
			org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement providedElement) {


		List<org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement> extensionElements = new ArrayList<org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement>();
		if(component instanceof org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement){
			org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement pluginElement =  (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement) component;
			for (ComponentElement component1 : compositeElement.getComponents()) {
			
				org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement pluginElement1 =  (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement) component1;

				if( !pluginElement.getPluginSymbName().equals(pluginElement1.getPluginSymbName())){
					for (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement extensionElement : pluginElement1.getExtensions()) {					
							if(extensionElement.getPoint().equals(providedElement.getId())){
								
								extensionElements.add(extensionElement);
							}
						}
					}
				}
			}
			
		
		return extensionElements;
	}



	private static List<ImportedPackageElement> getImportPackageElements(CompositeElement compositeElement,
			ComponentElement component, ExportedPackageElement providedElement) {

		List<ImportedPackageElement> importedPackageElements = new ArrayList<ImportedPackageElement>();
		if(component instanceof org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement){
			org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement pluginElement =  (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement) component;
			for (ComponentElement component1 : compositeElement.getComponents()) {
			
				org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement pluginElement1 =  (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement) component1;

				if( !pluginElement.getPluginSymbName().equals(pluginElement1.getPluginSymbName())){
					for (ImportedPackageElement importedPackageElement : pluginElement1.getImport_packages()) {
							
							
							if(importedPackageElement.getName().equals(providedElement.getName())){
								
								importedPackageElements.add(importedPackageElement);
							}
						}
					}
				}
			
			
		}
		return importedPackageElements;
	}



	private static List<ConsumedServiceElement> getConsumedServiceElements(CompositeElement compositeElement,
			ComponentElement component, RegisteredServiceElement providedElement) {

		List<ConsumedServiceElement> consumedServiceElements = new ArrayList<ConsumedServiceElement>();
		if(component instanceof org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement){
			org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement pluginElement =  (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement) component;
			for (ComponentElement component1 : compositeElement.getComponents()) {
			
				org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement pluginElement1 =  (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement) component1;

				if( !pluginElement.getPluginSymbName().equals(pluginElement1.getPluginSymbName())){
					for (ConsumedServiceElement consumedServiceElement : pluginElement1.getConsumedServices()) {
							
							if(consumedServiceElement.getInterfaceName().equals(providedElement.getInterfaceName())){
								
								consumedServiceElements.add(consumedServiceElement);
							}
							else{
								
								if(consumedServiceElement.getObjName().equals(providedElement.getObjName())){
									
									consumedServiceElements.add(consumedServiceElement);
								}
							}
						}
					}
				}
			}
			
		
		return consumedServiceElements;
	}



	private static List<RequiredInterfaceElement> getRequiredInterfaceElements(CompositeElement compositeElement,
			ComponentElement component, ProvidedInterfaceElement providedElement) {

		List<RequiredInterfaceElement> requiredInterfaceElements = new ArrayList<RequiredInterfaceElement>();
		
		if(component instanceof org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement){
			org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement pluginElement =  (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement) component;
			for (ComponentElement component1 : compositeElement.getComponents()) {
			
				org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement pluginElement1 =  (org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement) component1;

				if( !pluginElement.getPluginSymbName().equals(pluginElement1.getPluginSymbName())){
					for (RequiredInterfaceElement requiredInterfaceElement : pluginElement1.getRequiredInterfaces()) {
						
							if(requiredInterfaceElement.getInterfaceName().equals(providedElement.getInterfaceName())){
								
								requiredInterfaceElements.add(requiredInterfaceElement);
							}
						
					}
				}
			}
			
		}
		return requiredInterfaceElements;
	}




	@Override
	public void saveArchitecture(String fileName, String outputPath, Feature feature) {
		
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(ProductlineadlPackage.eNS_URI, ProductlineadlPackage.eINSTANCE);
		
		// save the model
		
		try {
			File outputFile = new File(outputPath+File.separator+fileName+".xmi" );
			
			
			org.eclipse.emf.common.util.URI outputFileURI= org.eclipse.emf.common.util.URI.createFileURI(outputFile.getAbsolutePath());

			
			Resource resource = resourceSet.createResource(outputFileURI);
			resource.getContents().add(feature);
			resource.save(null);
		}
		catch (IOException exception) {
			exception.printStackTrace();
		}
	}




}
