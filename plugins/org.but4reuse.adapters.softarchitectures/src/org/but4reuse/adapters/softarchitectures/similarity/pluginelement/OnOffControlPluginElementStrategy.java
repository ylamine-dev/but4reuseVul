package org.but4reuse.adapters.softarchitectures.similarity.pluginelement;

import java.util.ArrayList;
import java.util.List;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.ExtensionElement;
import org.but4reuse.adapters.softarchitectures.ExtensionPointElement;
import org.but4reuse.adapters.softarchitectures.PackageElement;
import org.but4reuse.adapters.softarchitectures.PluginElement;
import org.but4reuse.adapters.softarchitectures.OSGiSoftArchiAdapter;
import org.but4reuse.adapters.softarchitectures.ServiceElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;
import org.but4reuse.adapters.softarchitectures.similarity.extensionelement.OnOffControlExtensionElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.extensionpointelement.OnOffControlExtensionPointElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.packageelement.OnOffControlPackageElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.serviceelement.OnOffControlServiceElementStrategy;

public class OnOffControlPluginElementStrategy implements ISimilarity {

	@Override
	public double similarity(IElement currentElement, IElement anotherElement) {
		
		if(currentElement instanceof PluginElement && anotherElement instanceof PluginElement){
			PluginElement currentPluginElement = (PluginElement)currentElement;
			PluginElement anotherPluginElement = (PluginElement)anotherElement;
			
			// Same symbolic name
			if (currentPluginElement.getSymbName().equals(anotherPluginElement.getSymbName())) {
							
				return 1;
			}	
			else{	
			// symbolic names are not the same
	
			if(OSGiSoftArchiAdapter.parsePackages){	
			  List<PackageElement> lsec = new ArrayList<>(currentPluginElement.getImport_packages());
			  List<PackageElement> lsea = new ArrayList<>(anotherPluginElement.getImport_packages());
			
			  for(PackageElement pelt: lsec){
				pelt.setSimilarityStrategy(new OnOffControlPackageElementStrategy());
			  }
			  for(PackageElement pelt: lsea){
				pelt.setSimilarityStrategy(new OnOffControlPackageElementStrategy());
			  }
			
			  int todelete = 0;
			  boolean found = false;
			  while(!lsec.isEmpty()){
				found = false;
				PackageElement search = lsec.remove(0);
				for(int i = 0; i < lsea.size(); i++){
					if(search.similarity(lsea.get(i)) == 1){
						found = true;
						todelete = i;
						break;
					}
				}
				
				if(found){
					lsea.remove(todelete);
				}else{
					return 0;
				}
			  }
			
			  if(lsec.size() != 0 || lsea.size() != 0){
				return 0;
			  }
			
			  lsec = new ArrayList<>(currentPluginElement.getExport_packages());
			  lsea = new ArrayList<>(anotherPluginElement.getExport_packages());
			
			
			  for(PackageElement pelt: lsec){
				pelt.setSimilarityStrategy(new OnOffControlPackageElementStrategy());
			  }
			  for(PackageElement pelt: lsea){
				pelt.setSimilarityStrategy(new OnOffControlPackageElementStrategy());
			  }
			
			  todelete = 0;
			  found = false;
			  while(!lsec.isEmpty()){
				found = false;
				PackageElement search = lsec.remove(0);
				for(int i = 0; i < lsea.size(); i++){
					if(search.similarity(lsea.get(i)) == 1){
						found = true;
						todelete = i;
						break;
					}
				}
				
				if(found){
					lsea.remove(todelete);
				}else{
					return 0;
				}
			  }
			
			  if(lsec.size() != 0 || lsea.size() != 0){
				return 0;
			  }
			
			}
		
			if(OSGiSoftArchiAdapter.parseServices){
				List<ServiceElement> lsecR = new ArrayList<>(currentPluginElement.getRegisteredServices());
				List<ServiceElement> lseaR = new ArrayList<>(anotherPluginElement.getRegisteredServices());
			
				for(ServiceElement pelt: lsecR){
					pelt.setSimilarityStrategy(new OnOffControlServiceElementStrategy());
				}
				for(ServiceElement pelt: lseaR){
					pelt.setSimilarityStrategy(new OnOffControlServiceElementStrategy());
				}
			
				int todelete = 0;
				boolean found = false;
				while(!lsecR.isEmpty()){
					found = false;
					ServiceElement search = lsecR.remove(0);
					for(int i = 0; i < lseaR.size(); i++){
						if(search.similarity(lseaR.get(i)) == 1){
							found = true;
							todelete = i;
							break;
						}
					}
				
					if(found){
						lseaR.remove(todelete);
					}else{
						return 0;
					}
				}
			
				if(lsecR.size() != 0 || lseaR.size() != 0){
					return 0;
				}

			
				lsecR = new ArrayList<>(currentPluginElement.getConsumedServices());
				lseaR = new ArrayList<>(anotherPluginElement.getConsumedServices());
			
				for(ServiceElement pelt: lsecR){
					pelt.setSimilarityStrategy(new OnOffControlServiceElementStrategy());
				}
				for(ServiceElement pelt: lseaR){
					pelt.setSimilarityStrategy(new OnOffControlServiceElementStrategy());
				}
			
				todelete = 0;
				found = false;
				while(!lsecR.isEmpty()){
					found = false;
					ServiceElement search = lsecR.remove(0);
					for(int i = 0; i < lseaR.size(); i++){
						if(search.similarity(lseaR.get(i)) == 1){
							found = true;
							todelete = i;
							break;
						}
					}
				
					if(found){
						lseaR.remove(todelete);
					}else{
						return 0;
					}
				}
			
				if(lsecR.size() != 0 || lseaR.size() != 0){
				return 0;
				}
			
			}	
			if(OSGiSoftArchiAdapter.parseExtensions){
				List<ExtensionPointElement> lsecEP = new ArrayList<>(currentPluginElement.getExtensionPoints());
				List<ExtensionPointElement> lseaEP = new ArrayList<>(anotherPluginElement.getExtensionPoints());
			
			for(ExtensionPointElement pelt: lsecEP){
				pelt.setSimilarityStrategy(new OnOffControlExtensionPointElementStrategy());
			}
			for(ExtensionPointElement pelt: lseaEP){
				pelt.setSimilarityStrategy(new OnOffControlExtensionPointElementStrategy());
			}
			
			int todelete = 0;
			boolean found = false;
			while(!lsecEP.isEmpty()){
				found = false;
				ExtensionPointElement search = lsecEP.remove(0);
				for(int i = 0; i < lseaEP.size(); i++){
					if(search.similarity(lseaEP.get(i)) == 1){
						found = true;
						todelete = i;
						break;
					}
				}
				
				if(found){
					lseaEP.remove(todelete);
				}else{
					return 0;
				}
			}
			
			if(lsecEP.size() != 0 || lseaEP.size() != 0){
				return 0;
			}

			

			List<ExtensionElement> lsecE = new ArrayList<>(currentPluginElement.getExtensions());
			List<ExtensionElement> lseaE = new ArrayList<>(anotherPluginElement.getExtensions());
			
			for(ExtensionElement pelt: lsecE){
				pelt.setSimilarityStrategy(new OnOffControlExtensionElementStrategy());
			}
			for(ExtensionElement pelt: lseaE){
				pelt.setSimilarityStrategy(new OnOffControlExtensionElementStrategy());
			}
			
			 todelete = 0;
			 found = false;
			while(!lsecE.isEmpty()){
				found = false;
				ExtensionElement search = lsecE.remove(0);
				for(int i = 0; i < lseaE.size(); i++){
					if(search.similarity(lseaE.get(i)) == 1){
						found = true;
						todelete = i;
						break;
					}
				}
				
				if(found){
					lseaE.remove(todelete);
				}else{
					return 0;
				}
			}
			
			if(lsecE.size() != 0 || lseaE.size() != 0){
				return 0;
			}
			}
			
			
			
			
		//	return 1;
			}
		}
			
			return 0;
			
		
	}
		
}	


