package org.but4reuse.adapters.softarchitectures.sapl.synthesis;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.but4reuse.adaptedmodel.AdaptedModel;
import org.but4reuse.adaptedmodel.Block;
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
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint;
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
import org.but4reuse.featuremodel.synthesis.FeatureCreator;
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



public class FlatOsgiSAPLArchitectureCreator implements ISoftwareArchitectureProductLineSynthesis {

	ProductlineadlFactory factory ;
	SoftwareProductLineArchitecture saplArchitecture;
	@Override
	public void createSoftwareArchitectureProductLineModel(URI outputContainer, IProgressMonitor monitor) {
		
		AdaptedModel adaptedModel = AdaptedModelManager.getAdaptedModel();
		if(adaptedModel != null){

		doCreateSoftwareArchitectureProductLine(adaptedModel);
		
		 FeatureCreator fmCreator = new FeatureCreator();
		 IFeatureModel fm =fmCreator.doCreateFlatFeatureModel(adaptedModel);
			// Remove redundant constraints
			//TODO
			Tools.removeRedundantConstraints(fm,saplArchitecture);
		
	//	removeRedundantConstraints(plArchitecture);
		URI plaURI;
		try {
			plaURI = new URI(outputContainer + this.getClass().getSimpleName() + ".xml");
			File plaFile = FileUtils.getFile(plaURI);
			FileUtils.createFile(plaFile);
			// Save
			saveArch(this.getClass().getSimpleName() , plaFile);
			File rsfFile = new File(plaFile.getParent(), this.getClass().getSimpleName()+".rsf");
			
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
	
	
	/***
	 * This method can personalized depending to the used CBS meta-model
	 * @param adaptedModel
	 * @return
	 */
         
	  public SoftwareProductLineArchitecture doCreateSoftwareArchitectureProductLine(AdaptedModel adaptedModel) {
		  
		  
		  
			ProductlineadlPackageImpl.init();
			factory = ProductlineadlFactory.eINSTANCE;
			saplArchitecture = factory.createSoftwareProductLineArchitecture();
			List<CompositeElement> compositeElementsList = new ArrayList<CompositeElement>();

			String rootName = AdaptedModelHelper.getName(adaptedModel);
			if (rootName == null) {
				rootName = "SoftwareProductLineArchitecture";
			} else {
				rootName = StringUtils.validName(rootName);
			}
			
		    Feature featureRoot =factory.createFeature();
			
			
			featureRoot.setName(rootName);
			featureRoot.setId(rootName);

			Operator andOp = factory.createAnd();
			featureRoot.setAbstract(false);
	//		featureRoot.setOperator(andOp);
	//		featureRoot.setMandatory(true);
			saplArchitecture.setRoot(featureRoot);
			
			saplArchitecture.getFeatures().add(featureRoot);
			

		LinkedList<Feature> children = new LinkedList<Feature>();
		// Add blocks as features
		for (Block block : adaptedModel.getOwnedBlocks()) {
		    Feature f =factory.createFeature();
		    f.setName(StringUtils.validName(block.getName()));
		    f.setId(StringUtils.validName(block.getName()));
		    f.setAbstract(false);
		    f.setMandatory(false);
		    
		    Edge outEdge = factory.createOptional();
			featureRoot.getOutgoingEdge().add(outEdge);
			outEdge.setParent(featureRoot);
		    outEdge.setChild(f);

		    children.add(f);
		    saplArchitecture.getFeatures().add(f);
		    
		    java.util.List<IElement> elements = AdaptedModelHelper.getElementsOfBlock(block);

		    CompositeElement  compositeElement = OsgiFeatureArchitectureCreator.createCompositeModel(block.getName(), elements, factory);
		    compositeElementsList.add(compositeElement);

		    
		    f.getModel().add(compositeElement);
         
		    

		}
//		FeatureUtils.setChildren(root, children);

		// Add constraints
		for (IConstraint constraint : ConstraintsHelper.getCalculatedConstraints(adaptedModel)) {
			
			if(constraint instanceof BasicRequiresConstraint){
				
				BasicRequiresConstraint requireConstraint = (BasicRequiresConstraint)  constraint;
				Block block1 = requireConstraint.getBlock1();
				Block block2 = requireConstraint.getBlock2();
				Feature feature1 =FeatureTools.getFeatureForBlock(saplArchitecture.getFeatures(),StringUtils.validName(block1.getName()));
				Feature feature2 =FeatureTools.getFeatureForBlock(saplArchitecture.getFeatures(),StringUtils.validName(block2.getName()));
				
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
				Feature feature1 =FeatureTools.getFeatureForBlock(saplArchitecture.getFeatures(),StringUtils.validName(block1.getName()));
				Feature feature2 =FeatureTools.getFeatureForBlock(saplArchitecture.getFeatures(),StringUtils.validName(block2.getName()));
			
				Constraint exclConstraint = factory.createRequire();
				exclConstraint.setSource(feature1);
				exclConstraint.setTarget(feature2);
				exclConstraint.setText(constraint.getText());
				saplArchitecture.getConstraints().add(exclConstraint);

			}
			
		}
		return saplArchitecture;
			
		}








	
	
	   public void saveArch(String fileName,File plaFile){
			
			
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
						File outputFile = new File(plaFile.getAbsolutePath() );
						org.eclipse.emf.common.util.URI outputFileURI= org.eclipse.emf.common.util.URI.createFileURI(outputFile.getAbsolutePath());
						Resource resource = resourceSet.createResource(outputFileURI);
						resource.getContents().add(saplArchitecture);
						resource.save(null);
					}
					catch (IOException exception) {
						exception.printStackTrace();
					}
		}
}
