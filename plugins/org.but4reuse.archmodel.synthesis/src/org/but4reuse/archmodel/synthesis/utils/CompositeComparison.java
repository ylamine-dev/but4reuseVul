package org.but4reuse.archmodel.synthesis.utils;

import java.io.File;
import java.util.Iterator;
import java.util.Vector;

import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.PluginElement;

/***
 * this class is not used 
 * @author kerdoudi
 *
 */
public class CompositeComparison {

	
	
	 
    public Vector<PluginElement> getSimilarComponentsInComposites(CompositeElement compositeElement , CompositeElement anOtherCompositeElement ){
		 
		 Vector<PluginElement> similarComponents = new Vector<PluginElement>(); 
		 Vector<PluginElement> onlyInCompositeElement = new Vector<PluginElement>();

		 Vector<String> textSimilar = new Vector<String>();

		 
		 for (ComponentElement compoElement : compositeElement.getComponents()) {
	    	if(compoElement instanceof PluginElement){
	    		
	    		PluginElement pluginElement = (PluginElement) compoElement;	

	    		boolean bool =false;
	    		for (ComponentElement compoElement2 : anOtherCompositeElement.getComponents()) {
		    		if(compoElement2 instanceof PluginElement){
					 
		        		PluginElement pluginElement2 = (PluginElement) compoElement2;

					//	System.out.println(compositeElement.getName()+ " :: "+ pluginElement.getPluginSymbName()+"  with "+
					//			anOtherCompositeElement.getName()+ " :: "+pluginElement2.getPluginSymbName());

						 if(pluginElement.getPluginSymbName().equals(pluginElement2.getPluginSymbName())){
						//	 if(pluginElement.getPluginVersion().equals(pluginElement2.getPluginVersion())){
								 similarComponents.add(pluginElement);	
								 textSimilar.add(compositeElement.getName()+ " :: "+ pluginElement.getPluginSymbName()+"  with "+
								anOtherCompositeElement.getName()+ " :: "+pluginElement2.getPluginSymbName());
								 bool= true;
							//	 System.out.println("found");
								 break;
						//	 } 
							 
						 }
		    		}
				 }
	    	
	    	
				 if(!bool){
					 onlyInCompositeElement.add(pluginElement);
				 }
	    	}
		 }
		 
		 if(onlyInCompositeElement.size()>0)

		 System.out.println("plugins only In First composite : CompositeElement");
		 for (PluginElement pluginElement : onlyInCompositeElement) {
			 System.out.println(compositeElement.getName()+" :: "+  pluginElement.getPluginSymbName());

		  }
		 if(textSimilar.size()>0)
	//	 System.out.println("similar plugins ");

		 for (String string : textSimilar) {
	//		 System.out.println(string);
		} 
		 System.out.println("ok terminated");
		 return similarComponents;
	 }
    
    public void compareAllEMFComposites(File dir){
    	 File[] files = dir.listFiles(new XMIFileFilter());
		 Vector<CompositeElement> composites = new Vector<CompositeElement>();
		 Vector<CompositeElement> compositesToCompare = new Vector<CompositeElement>();

		 for (File file2 : files) {
			 ArchitectureTools archTool  = new ArchitectureTools();
			 CompositeElement arch = archTool.loadFeatureArchitecture(file2);
			 
			 composites.add(arch);
			 compositesToCompare.add(arch);

	     } 
		 
		 System.out.println("start comparing : ..");

		for (CompositeElement compositeElement : composites) {
			System.out.println("..." +compositeElement.getComponents().size()+compositeElement.getName());
		//	compositesToCompare.remove(compositeElement);
			for (CompositeElement compositeElement2 : compositesToCompare) {

				if(!(compositeElement.equals(compositeElement2))){
					System.out.println(" with "+compositeElement2.getComponents().size() + " "+compositeElement2.getName()  );

					 Vector<PluginElement> result = getSimilarComponentsInComposites(compositeElement, compositeElement2);
					 System.out.println("similar "+ result.size());
				/*	 for (PluginElement pluginElement : result) {
						System.out.println();
					}*/
					
					
				}
			} 
		} 
    }
    
    

    public void showInfosAll(File dirFile){
    	
    	 File[] files = dirFile.listFiles(new XMIFileFilter());
		 Vector<CompositeElement> composites = new Vector<CompositeElement>();

		 for (File file2 : files) {
			 ArchitectureTools archTool  = new ArchitectureTools();

			 CompositeElement arch = archTool.loadFeatureArchitecture(file2);
			 
			 composites.add(arch);

	     } 
		 

		for (CompositeElement compositeElement : composites) {
			System.out.println("======>"+compositeElement.getName());
			showInfo(compositeElement);
		} 
    	
    }
    
    
    public void showInfo(CompositeElement compositeElement){
    	
    	System.out.println("number of plugins"+ compositeElement.getComponents().size());
    	int sumConsumedServices = 0;
    	int sumRegisteredServices = 0;
    	for (ComponentElement compoElement : compositeElement.getComponents()) {
    		if(compoElement instanceof PluginElement){
    		PluginElement pluginElement = (PluginElement) compoElement;
    		sumConsumedServices += pluginElement.getConsumedServices().size();
    		sumRegisteredServices += pluginElement.getRegisteredServices().size();
    		}
		}
    	
    	int sumImportedPackages = 0;
    	int sumExportedPackages  = 0;
    	for (ComponentElement compoElement : compositeElement.getComponents()) {
    		if(compoElement instanceof PluginElement){
    		PluginElement pluginElement = (PluginElement) compoElement;
    		sumImportedPackages += pluginElement.getImport_packages().size();
    		sumExportedPackages += pluginElement.getExport_packages().size();
    		}
		}
    	
    	int sumExtensions = 0;
    	int sumExtensionPoints = 0;
    	for (ComponentElement compoElement : compositeElement.getComponents()) {
    		if(compoElement instanceof PluginElement){
    		PluginElement pluginElement = (PluginElement) compoElement;    		
    		sumExtensions += pluginElement.getExtensions().size();
    		sumExtensionPoints += pluginElement.getExtensionPoints().size();
    		}
		}
    	
    	int sumRequiredInterfaces = 0;
    	int sumProvidedInterfaces = 0;
    	for (ComponentElement compoElement : compositeElement.getComponents()) {
    		if(compoElement instanceof PluginElement){
    		PluginElement pluginElement = (PluginElement) compoElement;    		
    		sumRequiredInterfaces += pluginElement.getRequiredInterfaces().size();
    		sumProvidedInterfaces += pluginElement.getProvidedInterfaces().size();
    		}
		}
    	
    	
    	
    	
    	
    	if(sumConsumedServices>0){
        	System.out.println("number of Consumed Services : "+sumConsumedServices);

    	}
    	if(sumRegisteredServices>0){
        	System.out.println("number of Registered Services : "+sumRegisteredServices);

    	}
    	
    	if(sumImportedPackages>0){
        	System.out.println("number of Imported Packages : "+sumImportedPackages);

    	}
    	if(sumExportedPackages>0){
        	System.out.println("number of Exported Packages : "+sumExportedPackages);

    	}
    	
    	
    	if(sumExtensions>0){
        	System.out.println("number of Extensions : "+sumExtensions);

    	}
    	if(sumExtensionPoints>0){
        	System.out.println("number of Extension Points : "+sumExtensionPoints);

    	}
    	
    	if(sumRequiredInterfaces>0){
        	System.out.println("number of Consumed Services : "+sumRequiredInterfaces);

    	}
    	if(sumProvidedInterfaces>0){
        	System.out.println("number of Registered Services : "+sumRegisteredServices);

    	}
    	
    	
    }
    
    public static void main(String[] args) {
		
    	File firstDir = new File("derivedinputvariants/");
		
		File secondDir = new File("input/manualArch/SoftwareArchitectureRecovering/");
	
		File thirdDir = new File("ist2020/inputvariants/");

    	CompositeComparison c = new CompositeComparison();
    	c.compareAllEMFComposites(thirdDir);
	}
}
