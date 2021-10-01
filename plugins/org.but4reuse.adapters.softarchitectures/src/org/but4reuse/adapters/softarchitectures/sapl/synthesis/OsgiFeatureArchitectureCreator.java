package org.but4reuse.adapters.softarchitectures.sapl.synthesis;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.ExtensionElement;
import org.but4reuse.adapters.softarchitectures.ExtensionPointElement;
import org.but4reuse.adapters.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.softarchitectures.PackageElement;
import org.but4reuse.adapters.softarchitectures.PluginElement;
import org.but4reuse.adapters.softarchitectures.OSGiSoftArchiAdapter;
import org.but4reuse.adapters.softarchitectures.ServiceElement;
import org.but4reuse.adapters.softarchitectures.sa.recover.impl.SoftwareArchitectureRecovering;
import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureProductLineSynthesis;
import org.but4reuse.archmodel.synthesis.IFeatureArchitectureSynthesis;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.*;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl;
import org.but4reuse.utils.files.FileUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * create an architecture for each feature
 * @author kerdoudi
 *
 */
public class OsgiFeatureArchitectureCreator implements IFeatureArchitectureSynthesis{

	
	

	/***
	 * For each a feature we generate the corresponding architecture
	 */
	public void createFeatureArchitecture(String fileName, List<IElement> elements, String outputPath) {
	
		if (elements != null) {
			ProductlineadlPackageImpl.init();
			ProductlineadlFactory factory = ProductlineadlFactory.eINSTANCE;
			SoftwareProductLineArchitecture productLineArchitecture = factory.createSoftwareProductLineArchitecture();
			Feature feature = factory.createFeature();
			productLineArchitecture.getFeatures().add(feature);
			feature.setName(fileName);
			feature.setId(fileName);

			CompositeElement compositeElement = OsgiFeatureArchitectureCreator.createCompositeModel(fileName, elements,
					factory);

			feature.getModel().add(compositeElement);
             if(compositeElement.getComponents().size()>0 ){
				saveArchitecture(fileName, outputPath, feature);
				File rsfFile = new File(outputPath, fileName+".rsf");
	
			    SoftwareArchitectureRecovering.createRSFFile(rsfFile,compositeElement);
             }
		}
	}

	
	public static CompositeElement createCompositeModel(String name, List<IElement> elements,ProductlineadlFactory factory) {



			CompositeElement compositeElement = factory.createCompositeElement();
			compositeElement.setName(name);
			
			
			for (IElement elem : elements) {
				if (elem instanceof PluginElement) {
					PluginElement pe = (PluginElement) elem;
					
					org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement emfPluginElement = factory.createPluginElement();
					emfPluginElement.setName(pe.getName());
					emfPluginElement.setPluginSymbName(pe.getSymbName());
					emfPluginElement.setPluginVersion(pe.getVersion());
					//emfPluginElement.setBundleInfoLine(pe.getBundleInfoLine());
					
					if(OSGiSoftArchiAdapter.parseInterfaces){
	                     for (InterfaceElement providedInterface : pe.getProvidedInterfaces()) {
	                	
	                	  ProvidedInterfaceElement emfProvidedInterface;
	                	  emfProvidedInterface = factory.createProvidedInterfaceElement();
	                	  emfProvidedInterface.setInterfaceName(providedInterface.getInterfaceName());
	                	
						  emfPluginElement.getProvidedInterfaces().add(emfProvidedInterface);
					    }
					
	                    for (InterfaceElement requiredInterface : pe.getRequiredInterfaces()) {

	                    	RequiredInterfaceElement emfRequiredInterface;
	                	  emfRequiredInterface = factory.createRequiredInterfaceElement();
	                	  emfRequiredInterface.setInterfaceName(requiredInterface.getInterfaceName());
	                	
						  emfPluginElement.getRequiredInterfaces().add(emfRequiredInterface);
					   }
	                    
	                 //   addInterfaceConnectors();
					}
					
					
					if(OSGiSoftArchiAdapter.parsePackages){
					   for (PackageElement importElement : pe.getImport_packages()) {
						
						  ImportedPackageElement emfImportElement;
						  emfImportElement = factory.createImportedPackageElement();
						  emfImportElement.setName(importElement.getName());
						
						  for (InterfaceElement itfElement : importElement.getInterfaces()) {
							InterfaceElement emfItfElemt;

					/*		for (RequiredInterfaceElement emfItfElement : emfPluginElement.getRequiredInterfaces()) {
								if(emfItfElement.getInterfaceName().equals(itfElement.getInterfaceName())){
									emfImportElement.getInterfaces().add(emfItfElement);
									break;
								}
									
							}*/
						  }
						  emfPluginElement.getImport_packages().add(emfImportElement);
					   }
					
	                   for (PackageElement exportElement : pe.getExport_packages()) {
	                	   ExportedPackageElement emfExportElement;
	                	emfExportElement = factory.createExportedPackageElement();
	                	emfExportElement.setName(exportElement.getName());
						
						for (InterfaceElement itfElement : exportElement.getInterfaces()) {
							InterfaceElement emfItfElemt;

					/*		for (ProvidedInterfaceElement emfItfElement : emfPluginElement.getProvidedInterfaces()) {
								if(emfItfElement.getInterfaceName().equals(itfElement.getInterfaceName())){
									emfExportElement.getInterfaces().add(emfItfElement);
									break;
								}
									
							}*/
						}
						emfPluginElement.getExport_packages().add(emfExportElement);
					  }
					}
	                if(OSGiSoftArchiAdapter.parseServices){
	                	
	                   for (ServiceElement registeredService : pe.getRegisteredServices()) {
	                	  RegisteredServiceElement emfServiceElement;
	                	  emfServiceElement = factory.createRegisteredServiceElement();
	                	  emfServiceElement.setObjName(registeredService.getObjName());
	          	    	  emfServiceElement.setInterfaceName(registeredService.getInterfaceName()) ;

	              /*        if(PluginOsgiAdapter.parseInterfaces){

	                	    if(registeredService.getInterfaceElement()!=null){
	                	       for (ProvidedInterfaceElement emfProvidedInterface : emfPluginElement.getProvidedInterfaces()) {
	                    	
	                    	    if(emfProvidedInterface.getInterfaceName().equals(registeredService.getInterfaceElement().getInterfaceName())){
	                    		
	                    		   emfServiceElement.setInterfaceElement(emfProvidedInterface);
	                    		   break;
	                    	    }
	                	      }
	                	    }
	                      }*/
	 					    emfPluginElement.getRegisteredServices().add(emfServiceElement);
	                   }
	                	  

					   
					
	                   for (ServiceElement consumedService : pe.getConsumedServices()) { 

	                	  ConsumedServiceElement emfServiceElement;
	                	  emfServiceElement = factory.createConsumedServiceElement();
	                	  emfServiceElement.setObjName(consumedService.getObjName());
	             	      emfServiceElement.setInterfaceName(consumedService.getInterfaceName()) ;

	            /*          if(PluginOsgiAdapter.parseInterfaces){

	                	  if(consumedService.getInterfaceElement()!=null){
	                	   for (org.but4reuse.adapters.pluginosgi.emfmm.composite.InterfaceElement emfRequiredInterface : emfPluginElement.getRequiredInterfaces()) {
	                    	
	                    	if(emfRequiredInterface.getInterfaceName().equals(consumedService.getInterfaceElement().getInterfaceName())){
	                    		
	                    		emfServiceElement.setInterfaceElement(emfRequiredInterface);
	                    	}
	    				   }
	                	  }

					     }*/
	              	  
						  emfPluginElement.getConsumedServices().add(emfServiceElement);

	                   }
	                
	                }
	               if(OSGiSoftArchiAdapter.parseExtensions){
	                   for (ExtensionElement extension : pe.getExtensions()) {
						
	                	org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionElement emfExtensionElement;
	                	emfExtensionElement = factory.createExtensionElement();
	                	
	                	emfExtensionElement.setPoint(extension.getPoint());
	                	emfPluginElement.getExtensions().add(emfExtensionElement);
					  }
					
	                  for (ExtensionPointElement extensionPoint : pe.getExtensionPoints()) {
						org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExtensionPointElement extensionPointElement;
						extensionPointElement = factory.createExtensionPointElement();
						
						extensionPointElement.setId(extensionPoint.getId());
						
						if(extensionPoint.getName()!=null)
						  extensionPointElement.setName(extensionPoint.getName());
						
						if(extensionPoint.getSchema()!=null)
						extensionPointElement.setSchema(extensionPoint.getSchema());
						
						emfPluginElement.getExtensionPoints().add(extensionPointElement);
					   }
	                }
	                
	                compositeElement.getComponents().add(emfPluginElement);
	                
				}
			}
			
			        addInnerConnectors(compositeElement,factory);
					return compositeElement;
					
					
					
		}
	
	
	
	/***
	 * create a software architecture variant from the selected features in the SAPL
	 * @param name
	 * @param productLineArchitecture
	 * @param factory
	 * @return
	 */
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
