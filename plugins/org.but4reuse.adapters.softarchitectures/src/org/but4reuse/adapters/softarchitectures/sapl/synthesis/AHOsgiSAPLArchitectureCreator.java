package org.but4reuse.adapters.softarchitectures.sapl.synthesis;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.but4reuse.adaptedmodel.AdaptedArtefact;
import org.but4reuse.adaptedmodel.AdaptedModel;
import org.but4reuse.adaptedmodel.Block;
import org.but4reuse.adaptedmodel.BlockElement;
import org.but4reuse.adaptedmodel.helpers.AdaptedModelHelper;
import org.but4reuse.adaptedmodel.manager.AdaptedModelManager;
import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.ExtensionElement;
import org.but4reuse.adapters.softarchitectures.ExtensionPointElement;
import org.but4reuse.adapters.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.softarchitectures.PackageElement;
import org.but4reuse.adapters.softarchitectures.PluginElement;
import org.but4reuse.adapters.softarchitectures.OSGiSoftArchiAdapter;
import org.but4reuse.adapters.softarchitectures.ServiceElement;
import org.but4reuse.adapters.softarchitectures.plugin_infos_extractor.utils.Tools;
import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureProductLineSynthesis;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.And;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint;
//import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ConsumedServiceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ExportedPackageElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ImportedPackageElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Operator;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlPackage;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProvidedInterfaceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RegisteredServiceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.RequiredInterfaceElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.impl.ProductlineadlPackageImpl;
import org.but4reuse.archmodel.synthesis.utils.FeatureTools;
import org.but4reuse.feature.constraints.BasicExcludesConstraint;
import org.but4reuse.feature.constraints.BasicRequiresConstraint;
import org.but4reuse.feature.constraints.IConstraint;
import org.but4reuse.feature.constraints.impl.ConstraintsHelper;
//import org.but4reuse.featuremodel.synthesis.FeatureCreator;
import org.but4reuse.utils.files.FileUtils;
import org.but4reuse.utils.strings.StringUtils;
import org.but4reuse.utils.workbench.WorkbenchUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.ovgu.featureide.fm.core.base.IFeatureModel;


//import de.ovgu.featureide.fm.core.base.IFeatureModel;



public class AHOsgiSAPLArchitectureCreator implements ISoftwareArchitectureProductLineSynthesis {

	ProductlineadlFactory factory ;
	SoftwareProductLineArchitecture saplArchitecture;
	List<CompositeElement> compositeElementsList ;

	@Override
	public void createSoftwareArchitectureProductLineModel(URI outputContainer, IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		  
         AdaptedModel adaptedModel = AdaptedModelManager.getAdaptedModel();
		if(adaptedModel != null){
		 doCreateSoftwareArchitectureProductLine(adaptedModel);
	
		
		 FeatureCreator fmCreator = new FeatureCreator();
		 IFeatureModel fm =fmCreator.doCreateABHFM(adaptedModel);
			// Remove redundant constraints
			//TODO
			Tools.removeRedundantConstraints(fm,saplArchitecture);

		
			
		// Save

		URI plaURI;
			try {
				plaURI = new URI(outputContainer + this.getClass().getSimpleName() + ".xml");
				File plaFile = FileUtils.getFile(plaURI);
				FileUtils.createFile(plaFile);
				saveArch(this.getClass().getSimpleName() , plaFile);
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WorkbenchUtils.refreshIResource(AdaptedModelManager.getDefaultOutput());

		}

}

	


	public void doCreateSoftwareArchitectureProductLine(
			AdaptedModel adaptedModel) {
	
		
		// TODO Check for loops in the Requires graph.
		// Assumption is that there are no loops in the Requires constraints
		// between blocks as it happens with the default block identification
		// algorithm.
		
		
		ProductlineadlPackageImpl.init();
		factory = ProductlineadlFactory.eINSTANCE;
		saplArchitecture = factory.createSoftwareProductLineArchitecture();
	    compositeElementsList = new ArrayList<CompositeElement>();
		
		
//		FeatureModel fm = new FeatureModel(DefaultFeatureModelFactory.ID);
		// fm.getFeatures returns a collection with random ordering...
		// let's keep our own list of features
//		List<Feature> plaFeatures = new ArrayList<Feature>();
		
		String rootName = AdaptedModelHelper.getName(adaptedModel);
		if (rootName == null) {
			rootName = "SoftwareProductLineArchitecture";
		} else {
			rootName = StringUtils.validName(rootName);
		}
		
		Feature featureRoot =factory.createFeature();
		saplArchitecture.getFeatures().add(featureRoot);
		
		featureRoot.setName(rootName);
		featureRoot.setId(rootName);

		Operator andOp = factory.createAnd();
		featureRoot.setOperator(andOp);
		featureRoot.setMandatory(true);
		saplArchitecture.setRoot(featureRoot);

//		FeatureUtils.setAnd(root, true);

		List<Feature> parentAssigned = new ArrayList<Feature>();

//		FeatureUtils.setRoot(fm, root);
//		FeatureUtils.addFeature(fm, root);

//		fm.addFeature(root);
//		fmFeatures.add(root);

		// Common blocks (probably mandatory)
		List<Block> common = AdaptedModelHelper.getCommonBlocks(adaptedModel);
	    
		// Add blocks as features
		for (Block block : adaptedModel.getOwnedBlocks()) {
		
			Feature f =factory.createFeature();
			f.setName(StringUtils.validName(block.getName()));
		    f.setId(StringUtils.validName(block.getName()));

			f.setAbstract(false);
			if (common.contains(block)) {
				f.setMandatory(true);
			}
			else{
			    f.setMandatory(false);
			}
//		    Edge outEdge = factory.createEdge();
//			featureRoot.getOutgoingEdge().add(outEdge);
//			outEdge.setParent(featureRoot);
//		    outEdge.setChild(f);

		
		    saplArchitecture.getFeatures().add(f);
			
		    java.util.List<IElement> elements = AdaptedModelHelper.getElementsOfBlock(block);
	           // utiliser un autre plugin qui fait ça
		    CompositeElement  compositeElement = OsgiFeatureArchitectureCreator.createCompositeModel(block.getName(), elements,factory);
		    compositeElementsList.add(compositeElement);
		    
		    f.getModel().add(compositeElement);

		}	
			

		
	//   System.out.println(" blocks are added in feature model");
		// Add constraints
		for (IConstraint constraint : ConstraintsHelper.getCalculatedConstraints(adaptedModel)) {
			
			if(constraint instanceof BasicRequiresConstraint){
				
				BasicRequiresConstraint requireConstraint = (BasicRequiresConstraint)  constraint;
				Block block1 = requireConstraint.getBlock1();
				Block block2 = requireConstraint.getBlock2();
				Feature feature1 =getFeatureForBlock(block1);
				Feature feature2 =getFeatureForBlock(block2);
				
				Constraint reqConstraint = factory.createRequire();
				reqConstraint.setSource(feature1);
				reqConstraint.setTarget(feature2);
				reqConstraint.setText(constraint.getText());
				saplArchitecture.getConstraints().add(reqConstraint);
			}

			if(constraint instanceof BasicExcludesConstraint ){
				
				BasicExcludesConstraint excludeConstraint = (BasicExcludesConstraint)  constraint;
				Block block1 = excludeConstraint.getBlock1();
				Block block2 = excludeConstraint.getBlock2();
				Feature feature1 =getFeatureForBlock(block1);
				Feature feature2 =getFeatureForBlock(block2);
				
				Constraint exclConstraint = factory.createMutex();
				exclConstraint.setSource(feature1);
				exclConstraint.setTarget(feature2);
				exclConstraint.setText(constraint.getText());
				saplArchitecture.getConstraints().add(exclConstraint);

			}

		}

		// Identify alt groups
		AltGroupList altGroupList = new AltGroupList();
		List<IConstraint> constraints = ConstraintsHelper.getCalculatedConstraints(adaptedModel);
		for (IConstraint constraint : constraints) {
			if (constraint instanceof BasicExcludesConstraint) {
				BasicExcludesConstraint c = (BasicExcludesConstraint)constraint;
				Feature feature1 =getFeatureForBlock(c.getBlock1());
				Feature feature2 =getFeatureForBlock(c.getBlock2());
				// any of them exists in previous?
				AltGroup altF1 = altGroupList.getAltGroupOfFeature(feature1);
				AltGroup altF2 = altGroupList.getAltGroupOfFeature(feature2);
				// Completely new alt group
				if (altF1 == null && altF2 == null) {
					altGroupList.addAltGroup(feature1, feature2);
				}
				// feature2 already was in a alt group so check if for all the
				// features of this alt group feature1 is also excluded
				else if (altF1 == null) {
					boolean allFound = true;
					for (Feature f : altF2.features) {
						if (!f.equals(feature2)) {
							if (!FeatureTools.existsExcludeConstraint(constraints, f, feature1)) {
								allFound = false;
								break;
							}
						}
					}
					if (allFound) {
						altF2.features.add(feature1);
					}
				}
				// feature1 already was in an alt group
				else if (altF2 == null) {
					boolean allFound = true;
					for (Feature f : altF1.features) {
						if (!f.equals(feature1)) {
							if (!FeatureTools.existsExcludeConstraint(constraints, f, feature2)) {
								allFound = false;
								break;
							}
						}
					}
					if (allFound) {
						altF1.features.add(feature2);
					}
				}
			}
		}

		// Create alt groups in the fm
		for (AltGroup altGroup : altGroupList.altGroups) {
			Feature fakeAltFeature =factory.createFeature();
			fakeAltFeature.setName("Alternative_" + altGroup.id);
			fakeAltFeature.setId("Alternative_" + altGroup.id);

		//	Feature fakeAltFeature = new Feature(fm, "Alternative_" + altGroup.id);
			altGroup.altRoot = fakeAltFeature;
		
		//	FeatureUtils.setAlternative(fakeAltFeature); TODO voir avec Tewfik
			fakeAltFeature.setAbstract(true);
			fakeAltFeature.setMandatory(false);
			Operator altOp = factory.createOr();
			fakeAltFeature.setOperator(altOp);
			
		    
		//	FeatureTools.setChildren(fakeAltFeature, altGroup.features);
			
			FeatureTools.setChildren(factory, fakeAltFeature, altGroup.features);
			
			
			saplArchitecture.getFeatures().add(fakeAltFeature);
			
			saplArchitecture.getFeatures().add(fakeAltFeature);
		//	fm.addFeature(fakeAltFeature);
		//	fmFeatures.add(fakeAltFeature);
		}

		// Create hierarchy with the Requires
		for (Feature f : saplArchitecture.getFeatures()) {

			// check if the feature belongs to an alternative group
			AltGroup altGroup = altGroupList.getAltGroupOfFeature(f);

			List<Feature> parentCandidates;
			if (altGroup == null) {
				// normal feature
				parentCandidates = FeatureTools.getFeatureRequiredFeatures(saplArchitecture.getFeatures(), constraints, f);
			} else {
				// feature inside an alt group
				// the parent candidates will be those that are shared parent
				// candidates for all the alt group
				parentCandidates = FeatureTools.getFeatureRequiredFeatures(saplArchitecture.getFeatures(), constraints, f);
				for (Feature altf : altGroup.features) {
					parentCandidates.retainAll(FeatureTools.getFeatureRequiredFeatures(saplArchitecture.getFeatures(), constraints, altf));
				}
			}
			List<Feature> definitiveList = new ArrayList<Feature>();
			for (Feature pc : parentCandidates) {
				definitiveList.add(pc);
			}

			// Reduce the parent candidates, remove ancestors
			for (Feature pc1 : parentCandidates) {
				for (Feature pc2 : parentCandidates) {
					if (pc1 != pc2) {
						/*
						if (FeatureTools.isAncestorFeature1ofFeature2(saplArchitecture.getFeatures(), constraints, pc1, pc2)) {
							definitiveList.remove(pc1);
						} else if (FeatureTools.isAncestorFeature1ofFeature2(saplArchitecture.getFeatures(), constraints, pc2, pc1)) {
							definitiveList.remove(pc2);
						}*/
						
						List<Feature> featureTrace = new ArrayList<Feature>();
						featureTrace.add(pc2);
						System.out.println(pc1.getName() +" isAncestor of .. "+pc2.getName()+" ?");

						boolean isAncestorPc1ofPc2 = FeatureTools.isAncestorFeature1ofFeature2(saplArchitecture.getFeatures(), constraints, pc1, pc2, featureTrace);
						if (isAncestorPc1ofPc2) {
							definitiveList.remove(pc1);
						} else{ 
							System.out.println(pc2.getName() +" isAncestor of "+pc1.getName()+" ?");

							featureTrace.add(pc1);
							boolean isAncestorPc2ofPc1 = FeatureTools.isAncestorFeature1ofFeature2(saplArchitecture.getFeatures(), constraints, pc2, pc1,featureTrace);
						
							if (isAncestorPc2ofPc1) {
							definitiveList.remove(pc2);
							}
						}
					}
				}
			}

			// Select one
			if (!definitiveList.isEmpty()) {
				Feature parent = null;

				// Preference to parents in alternative groups
				// TODO for the moment get the first alternative group
				for (Feature dp : definitiveList) {
					if (altGroupList.getAltGroupOfFeature(dp) != null) {
						parent = dp;
						break;
					}
				}

				// If no parent in alternative group
				// Get the one with higher number of reasons in the requires
				// constraint
				if (parent == null) {
					int maximumReasons = Integer.MIN_VALUE;
					for (Feature dp : definitiveList) {
						int reasons = FeatureTools.getNumberOfReasonsOfRequiresConstraint(constraints, f, dp);
						if (reasons > maximumReasons) {
							parent = dp;
						}
					}
				}

				// And add it
				
				Operator parentAndOp = factory.createAnd();
				parent.setOperator(parentAndOp);
				if (altGroup == null) {
					
					
					  Edge outEdge1 = factory.createComposition();
						parent.getOutgoingEdge().add(outEdge1);
						outEdge1.setParent(parent);
					    outEdge1.setChild(f);
					    parentAssigned.add(f);
				} else {
					// Only once for the whole alt group
					if (!parentAssigned.contains(altGroup.altRoot)) {
						
						 Edge outEdge1 = factory.createComposition();
							parent.getOutgoingEdge().add(outEdge1);
							outEdge1.setParent(parent);
						    outEdge1.setChild(altGroup.altRoot);
						    parentAssigned.add(altGroup.altRoot);
						
						
					}
				}
			}
		}

		// Features without parent are added to the root
		LinkedList<Feature> toTheRoot = new LinkedList<Feature>();
		for (Feature f : saplArchitecture.getFeatures()) {
			if(!saplArchitecture.getRoot().equals(f)){
			//if (!f.equals(root)) {
				AltGroup altGroup = altGroupList.getAltGroupOfFeature(f);
				if (altGroup != null) {
					f = altGroup.altRoot;
				}
				if (!parentAssigned.contains(f)) {
					toTheRoot.add(f);
					
			/*		 Edge outEdge1 = factory.createEdge();
						featureRoot.getOutgoingEdge().add(outEdge1);
						outEdge1.setParent(featureRoot);
					    outEdge1.setChild(f);*/
					    parentAssigned.add(f);
					    
					    
					
				}
			}
		}
		
		
		FeatureTools.setChildren(factory,featureRoot, toTheRoot);
		 
		

	
		
	}






	private Feature getFeatureForBlock(Block block1) {

        for (Feature feature : saplArchitecture.getFeatures()) {
			if(feature.getName().equals(StringUtils.validName(block1.getName()))){
				return feature;
			}
		}
		return null;
	}
	
	void saveArch(String fileName,File plaFile){
		
		
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
					File outputFile = new File(plaFile.getAbsolutePath());
					org.eclipse.emf.common.util.URI outputFileURI= org.eclipse.emf.common.util.URI.createFileURI(outputFile.getAbsolutePath());
					Resource resource = resourceSet.createResource(outputFileURI);
					resource.getContents().add(saplArchitecture);
					resource.save(null);
				}
				catch (IOException exception) {
					exception.printStackTrace();
				}
	}
	
	
	public CompositeElement createCompositeModel(String name, List<IElement> elements) {



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
		
		
				return compositeElement;
				
				
				
	}
	
/**
 * Auxiliary classes
 */
public class AltGroup {
	LinkedList<Feature> features = new LinkedList<Feature>();
	int id;
	Feature altRoot;
}

public class AltGroupList {
	List<AltGroup> altGroups = new ArrayList<AltGroup>();

	public AltGroup getAltGroupOfFeature(Feature feature) {
		for (AltGroup altGroup : altGroups) {
			if (altGroup.features.contains(feature)) {
				return altGroup;
			}
		}
		return null;
	}

	public void addAltGroup(Feature... features) {
		AltGroup altGroup = new AltGroup();
		// Automatically set the id
		altGroup.id = altGroups.size() + 1;
		for (Feature feature : features) {
			altGroup.features.add(feature);
		}
		altGroups.add(altGroup);
	}
}






}
