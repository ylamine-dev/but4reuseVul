package org.but4reuse.adapters.softarchitectures.similarity.pluginelement;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.ExtensionElement;
import org.but4reuse.adapters.softarchitectures.ExtensionPointElement;
import org.but4reuse.adapters.softarchitectures.PackageElement;
import org.but4reuse.adapters.softarchitectures.PluginElement;
import org.but4reuse.adapters.softarchitectures.ServiceElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;
import org.but4reuse.adapters.softarchitectures.similarity.extensionelement.MinimalExtensionElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.extensionpointelement.MinimalExtensionPointElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.packageelement.MinimalPackageElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.serviceelement.MinimalServiceElementStrategy;

public class MinimalPluginElementStrategy implements ISimilarity {

	@Override
	public double similarity(IElement currentElement, IElement anotherElement) {
		if(currentElement instanceof PluginElement && anotherElement instanceof PluginElement){
			PluginElement currentplugin = (PluginElement)currentElement;
			PluginElement anotherplugin = (PluginElement)anotherElement;
			
			// Same symbolic name
			if (currentplugin.getSymbName().equals(anotherplugin.getSymbName())) 
				
				return 1;
				
			// at least similar export package  or registered service or consumed service or extension or extension point
		   	 for(PackageElement pe: currentplugin.getExport_packages()){
				
				pe.setSimilarityStrategy(new MinimalPackageElementStrategy());
				
				for(PackageElement pee: anotherplugin.getExport_packages()){
					
					pee.setSimilarityStrategy(new MinimalPackageElementStrategy());
					if(pe.similarity(pee) == 1){
						return 1;
					}
				}
			 }
		   	
			 
			 
			 for(ServiceElement se: currentplugin.getRegisteredServices()){
					
				 se.setSimilarityStrategy(new MinimalServiceElementStrategy());
					
					for(ServiceElement see: anotherplugin.getRegisteredServices()){
						
						see.setSimilarityStrategy(new MinimalServiceElementStrategy());
						if(se.similarity(see) == 1){
							return 1;
						}
					}
			}
			
			 
			 
			 for(ExtensionPointElement se: currentplugin.getExtensionPoints()){
					
				 se.setSimilarityStrategy(new MinimalExtensionPointElementStrategy());
					
					for(ExtensionPointElement see: anotherplugin.getExtensionPoints()){
						
						see.setSimilarityStrategy(new MinimalExtensionPointElementStrategy());
						if(se.similarity(see) == 1){
							return 1;
						}
					}
			 }
			 
			 
			 
			
		}
		
		return 0;
	}

}
