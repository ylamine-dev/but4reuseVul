package org.but4reuse.adapters.softarchitectures.similarity.pluginelement;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.ExtensionElement;
import org.but4reuse.adapters.softarchitectures.ExtensionPointElement;
import org.but4reuse.adapters.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.softarchitectures.PackageElement;
import org.but4reuse.adapters.softarchitectures.PluginElement;
import org.but4reuse.adapters.softarchitectures.ServiceElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;
import org.but4reuse.adapters.softarchitectures.similarity.extensionelement.AverageExtensionElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.extensionpointelement.AverageExtensionPointElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.interfaceelement.AverageInterfaceElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.packageelement.AveragePackageElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.serviceelement.AverageServiceElementStrategy;

public class AveragePluginElementStrategy implements ISimilarity {

	@Override
	public double similarity(IElement currentElement, IElement anotherElement) {
		double quotient = 0;
		int coefficient = 5;
		int i=0;
		boolean bool = false;
		if (currentElement instanceof PluginElement && anotherElement instanceof PluginElement) {
			PluginElement currentPluginElement = ((PluginElement) currentElement);
			PluginElement anotherPluginElement = ((PluginElement) anotherElement);
			double sum1=0;
			// Same symbolic name
			if (currentPluginElement.getSymbName().equals(anotherPluginElement.getSymbName())){ 
				
				sum1 =1;
		
			// different symb names but may be the same package, services or interfaces,....
			
				
				
				if(currentPluginElement.getImport_packages().size()!=0){
					for(PackageElement importPack : currentPluginElement.getImport_packages()){
						
						double sum=0;
						
						importPack.setSimilarityStrategy(new AveragePackageElementStrategy());
						
						for(PackageElement importPack2 : anotherPluginElement.getImport_packages()){
							
							importPack2.setSimilarityStrategy(new AveragePackageElementStrategy());
							sum += importPack.similarity(importPack2);
						}
						i++;

						quotient+=sum;
					}
				}
				if(currentPluginElement.getExport_packages().size()!=0){
					for(PackageElement exportPack : currentPluginElement.getExport_packages()){
						
						double sum=0;
						
						exportPack.setSimilarityStrategy(new AveragePackageElementStrategy());
						
						for(PackageElement exportPack2 : anotherPluginElement.getExport_packages()){
							
							exportPack2.setSimilarityStrategy(new AveragePackageElementStrategy());
							
							sum+= exportPack.similarity(exportPack2);
							
						}
						i++;

						quotient+=sum;
					}
				}

				if(currentPluginElement.getRegisteredServices().size()!=0){
					for(ServiceElement regServ : currentPluginElement.getRegisteredServices()){
						
						double sum=0;
						
						regServ.setSimilarityStrategy(new AverageServiceElementStrategy());
						
						for(ServiceElement regServ2 : anotherPluginElement.getRegisteredServices()){
							
							regServ2.setSimilarityStrategy(new AverageServiceElementStrategy());
							
							sum+= regServ.similarity(regServ2);
							
						}
						i++;

						quotient+=sum;
					}
				}
				
				if(currentPluginElement.getConsumedServices().size()!=0){
					for(ServiceElement regServ : currentPluginElement.getConsumedServices()){
						
						double sum=0;
						
						regServ.setSimilarityStrategy(new AverageServiceElementStrategy());
						
						for(ServiceElement regServ2 : anotherPluginElement.getConsumedServices()){
							
							regServ2.setSimilarityStrategy(new AverageServiceElementStrategy());
							
							sum+= regServ.similarity(regServ2);
							
						}
						i++;

						quotient+=sum;
					}
				}
				
				
				if(currentPluginElement.getExtensionPoints().size()!=0){
					for(ExtensionPointElement extP : currentPluginElement.getExtensionPoints()){
						
						double sum=0;
						
						extP.setSimilarityStrategy(new AverageExtensionPointElementStrategy());
						
						for(ExtensionPointElement extP2 : anotherPluginElement.getExtensionPoints()){
							
							extP2.setSimilarityStrategy(new AverageExtensionPointElementStrategy());
							
							sum+= extP.similarity(extP2);
							
						}
						i++;

						quotient+=sum;
					}
				}
		/*		
				
				if(currentPluginElement.getExtensions().size()!=0){
					for(ExtensionElement ext : currentPluginElement.getExtensions()){
						
						double sum=0;
						
						ext.setSimilarityStrategy(new AverageExtensionElementStrategy());
						
						for(ExtensionElement ext2 : anotherPluginElement.getExtensions()){
							
							ext2.setSimilarityStrategy(new AverageExtensionElementStrategy());
							
							sum+= ext.similarity(ext2);
							
						}
						i++;

						quotient+=sum;
					}
				}
				
			*/	
				quotient += sum1 *coefficient;
				// TODO à revoir l'histoire du quotient
				if(quotient==0 || i==0)
					return 0;
				//System.out.println(quotient/i);
				return quotient / i +coefficient;
			
				
			}
		
		}
		return 0;
	}

}
