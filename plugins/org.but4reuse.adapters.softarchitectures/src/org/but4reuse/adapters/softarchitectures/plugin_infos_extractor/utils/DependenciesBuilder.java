package org.but4reuse.adapters.softarchitectures.plugin_infos_extractor.utils;

import java.util.List;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.ExtensionElement;
import org.but4reuse.adapters.softarchitectures.ExtensionPointElement;
import org.but4reuse.adapters.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.softarchitectures.PackageElement;
import org.but4reuse.adapters.softarchitectures.PluginElement;
import org.but4reuse.adapters.softarchitectures.OSGiSoftArchiAdapter;
import org.but4reuse.adapters.softarchitectures.ServiceElement;

/**
 * @author Diana Malabard
 * 
 */
public class DependenciesBuilder {

	public static void build(PluginElement plugin, List<IElement> pluginsSet) {

		// Required bundles
		for (String dependency_symbName : plugin.getRequire_Bundles()) {
			
			for (IElement elem : pluginsSet) {
				if (elem instanceof PluginElement) {
					PluginElement pe = (PluginElement) elem;
					if (pe.getSymbName().equalsIgnoreCase(dependency_symbName)) {
						// TODO check versions
						plugin.addDependency("requiredBundle", pe);
			//			System.out.println(pe.getSymbName());
				//		plugin.addDependency("importPackages", pe);
				//		plugin.addDependency("exportPackages", pe);
						break;
					}
				}
			}
		}
		
		
		/*
		

		// consume Service dependency
				if(PluginOsgiAdapter.parseServices){
						for (ServiceElement dependency_service : plugin.getConsumedServices()) {
							
							
							for (IElement elem : pluginsSet) {
								if (elem instanceof PluginElement) {
									PluginElement pe = (PluginElement) elem;
									
									for (ServiceElement regisretedService : pe.getRegisteredServices()) {
										
										if(regisretedService.isInterface()){
											if(dependency_service.isInterface()){
												if(dependency_service.getInterfaceName().equals(regisretedService.getInterfaceName())){
													plugin.addDependency("consumeService", pe);
												}
											}
										}
										else{
											if(dependency_service.getObjName().equals(regisretedService.getObjName())){
												plugin.addDependency("consumeService", pe);
											}
										}
										  
										
									}
								}
							}
						}
				}
		
				// extend bundle dependency
				if(PluginOsgiAdapter.parseExtensions){
						for (ExtensionElement dependency_extension : plugin.getExtensions()) {
							
							String point = dependency_extension.getPoint();
							for (IElement elem : pluginsSet) {
								if (elem instanceof PluginElement) {
									PluginElement pe = (PluginElement) elem;
									
									for (ExtensionPointElement extensionPoint : pe.getExtensionPoints()) {
										
										if(extensionPoint.getId().equals(point)){
											plugin.addDependency("extendBundle", pe);
										}
										else{
											if(point.endsWith(extensionPoint.getId())){
												plugin.addDependency("extendBundle", pe);

											}
										}
									}
								}
							}
						}
				}
				// require interface dependency
				if(PluginOsgiAdapter.parseInterfaces){
						for (InterfaceElement dependency_requireInterface : plugin.getRequiredInterfaces()) {
							
							for (IElement elem : pluginsSet) {
								if (elem instanceof PluginElement) {
									PluginElement pe = (PluginElement) elem;
									
									for (InterfaceElement providedInterface : pe.getProvidedInterfaces()) {
										if(dependency_requireInterface.getInterfaceName().equals(providedInterface.getInterfaceName())){
											plugin.addDependency("requireInterface", pe);
										}
									}
								}
							}
						}
				}		
				
				
				// require interface dependency
				if(PluginOsgiAdapter.parsePackages){
						for (PackageElement dependency_importPackage : plugin.getImport_packages()) {
							
							for (IElement elem : pluginsSet) {
								if (elem instanceof PluginElement) {
									PluginElement pe = (PluginElement) elem;
									
									for (PackageElement exportPackage : pe.getExport_packages()) {
										if(dependency_importPackage.getName().equals(exportPackage.getName())){
											plugin.addDependency("importPackage", pe);
										}
									}
								}
							}
						}
				}	
				*/
		// In case of a fragment
		if (plugin.isFragment()) {
			String hostSymbName = plugin.getFragmentHost();
			// check if they already included, it is not needed for fragments
			// but who knows. We put this to avoid duplicate dependencies
			if (!plugin.getRequire_Bundles().contains(hostSymbName)) {
				for (IElement elem : pluginsSet) {
					if (elem instanceof PluginElement) {
						PluginElement pe = (PluginElement) elem;
						if (hostSymbName != null && hostSymbName.equalsIgnoreCase(pe.getSymbName())) {
							// TODO check versions
							// TODO maybe use another name for the dependency
							plugin.addDependency("requiredFragment", pe);

						//	plugin.addDependency("requiredBundle", pe);
						//	plugin.addDependency("importPackages", pe);
						//	plugin.addDependency("exportPackages", pe);
							break;
						}
					}
				}
			}
		}
	}
	

}
