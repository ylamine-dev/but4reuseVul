package org.but4reuse.adapters.softarchitectures.plugin_infos_extractor.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.softarchitectures.PackageElement;
import org.but4reuse.adapters.softarchitectures.PluginElement;
import org.but4reuse.adapters.softarchitectures.OSGiSoftArchiAdapter;
import org.but4reuse.adapters.softarchitectures.ServiceElement;
import org.but4reuse.adapters.softarchitectures.bytecode.parser.PluginsServiceParser;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;
import org.but4reuse.adapters.softarchitectures.similarity.pluginelement.AveragePluginElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.pluginelement.MinimalPluginElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.pluginelement.OnOffControlPluginElementStrategy;
import org.but4reuse.utils.files.FileUtils;


public class PluginInfosExtractor {

	
	public static final String EXTRACTION_PATH = createOutputPath(); 

	public static final String BUNDLESINFO_RELATIVEPATH = "configuration/org.eclipse.equinox.simpleconfigurator/bundles.info";
	private static final String BUNDLE_VERSION = "Bundle-Version";
	private static final String BUNDLE_NAME = "Bundle-Name";
	private static final String REQUIRE_BUNDLE = "Require-Bundle";
	private static final String BUNDLE_SYMBOLIC_NAME = "Bundle-SymbolicName";
	private static final String BUNDLE_LOCALIZATION = "Bundle-Localization";
	
	
	// as used in org.google.guava for example
	private static final String DEFAULT_LOCALIZATION = "OSGI-INF/l10n/bundle";

	private static final String FRAGMENT_HOST = "Fragment-Host";

	private static String currentLocalization = null;

	
	//ADD PSTL
	private static final String IMPORT_PACKAGE = "Import-Package";
	private static final String EXPORT_PACKAGE = "Export-Package";
	private static final String SERVICE_COMPONENT=  "Service-Component";
	private static final String BUNDLE_ACTIVATOR = "Bundle-Activator";
	private static final boolean exhaustive = true;

	private static String PATH = null;

	// we need to choose
//	private static ISimilarity strategy = new MinimalPluginElementStrategy();
//	private static ISimilarity strategy = new AveragePluginElementStrategy();
	private static ISimilarity strategy = new OnOffControlPluginElementStrategy();


	public static long parserBytecode =0 ;
	public static long parserDS = 0;
	public static long parserJava =0;
	public static long extraction =0;
	public static long nbrParsedPlugins =0;
	public static List<String> pluginsHaveNoSources =new ArrayList<String>();
	
	public static long declarativeservices = 0;
	public static long clients4declarativeservices = 0;

	public static int nbservices = 0;
	public static int nbservices2 = 0;

	public static int nbserviceclients=0;
	public static int nbserviceclients2=0;

	
	
	private static void fillPluginElementInfo(PluginElement plugin, Manifest manifest, List<IElement> elements) {
		
		nbrParsedPlugins++;
		Attributes attributes = manifest.getMainAttributes();
		String value = attributes.getValue(BUNDLE_SYMBOLIC_NAME);
		int i = value.indexOf(';');
		if (i != -1)
			value = value.substring(0, i);
		
		if(value.endsWith(".source")){
			plugin.setSymbName(value.substring(0,value.indexOf(".source")));
			
		}
		

		// Fragment info
		String fragmentHost = attributes.getValue(FRAGMENT_HOST);
		if (fragmentHost != null) {
			i = fragmentHost.indexOf(';');
			if (i != -1)
				fragmentHost = fragmentHost.substring(0, i);
			plugin.setFragmentHost(fragmentHost);
		}

		String version = attributes.getValue(BUNDLE_VERSION);
		plugin.setVersion(version);
		value = attributes.getValue(REQUIRE_BUNDLE);
		if (value != null) {
			getRequireBundlesSymbNames(value, plugin);
		}
		
		
		//ADD PSTL
		//Import and export packages
//	if(PluginOsgiAdapter.parsePackages){
		String import_package = attributes.getValue(IMPORT_PACKAGE);
		
		if(import_package != null){
			String[] package_names;
			List<PackageElement> limport = plugin.getImport_packages();
			package_names = import_package.split(",\\s+|,");
			for(String name: package_names){
				if(name.split("\"|;").length>  0){

				String p = name.split("\"|;")[0];
				
				if(p.contains(")"))
					continue;
				
	//			System.err.println("=====>Creattinh PackageElement -- IMPORT : "+p);
				PackageElement pe = new PackageElement(p);

				if(OSGiSoftArchiAdapter.parsePackages){

				limport.add(pe);
 			    elements.add(pe);
				}
				///  add required  interfaces
				add_interfaceElements(plugin,pe,true, elements);
			   }
			}
		}
		
		String export_package = attributes.getValue(EXPORT_PACKAGE);
		if(export_package != null){
			String[] package_names;
			List<PackageElement> lexport = plugin.getExport_packages();
			package_names = export_package.split(",\\s+|,");
			for(String name: package_names){
				if(name.split("\"|;").length>  0){
				  String p = name.split("\"|;")[0];
				
				
				if(p.contains(")") || p.contains("META-INF"))
					continue;
				
		//		System.err.println("===== >Creattinh PackageElement -- EXPORT : "+p);
				PackageElement pe = new PackageElement(p);

				if(OSGiSoftArchiAdapter.parsePackages){

				
				lexport.add(pe);
				elements.add(pe);

				}
				///  add provided interfaces
				add_interfaceElements(plugin,pe,false, elements);
				}
			}
		}
		
//	}	
		//extraction du jar
		boolean deleteDirectory = false;
		
		PATH = plugin.getAbsolutePath();
/*	
 * extraction du jar 
 * */
    if(!OSGiSoftArchiAdapter.parseInterfaces){ // if they are not already extracted before
		
		if(PATH.endsWith(".jar")){
			try {
				long start = java.lang.System.currentTimeMillis();
				ZipExtractor.unZipAll(new File(PATH), new File(PATH.substring(0, PATH.length()-4)));
				long end = java.lang.System.currentTimeMillis();
		//	    System.out.println("Extraction "+ printTime(end-start) );
				extraction += (end-start);
				PATH = PATH.substring(0, PATH.length()-4);
			} catch (IOException e) {
				e.printStackTrace();
			}
			deleteDirectory = true;
		}
	
    }
    else{
	// get the extraction path
		 if(PATH.endsWith(".jar")){
		   PATH = PATH.substring(0, PATH.length()-4);
		   deleteDirectory = true;
		 }
    }
    
      if(OSGiSoftArchiAdapter.parseServices){
		File sourceFile =null;
        boolean isSCParsed = false;
		if(!PATH.contains(".source_"))  {
		//	  System.out.println("searching a source for "+PATH);

		 File pluginFile = new File(PATH);
	//	  System.out.println("search in"+ java.lang.System.getProperty("user.home")+File.separator+"bundle_sources");
		   sourceFile = SourceCodeFinder.findSourceFor(pluginFile, java.lang.System.getProperty("user.home")+File.separator+"bundle_sources");

			  if(sourceFile !=null){
			 
				String intputSourcePath = sourceFile.getAbsolutePath();
				String outputSourcePath=sourceFile.getAbsolutePath();
				if(intputSourcePath.endsWith(".jar")){

					 outputSourcePath = EXTRACTION_PATH+sourceFile.getName().substring(0,sourceFile.getName().lastIndexOf('.'))+File.separator;

					try {
						long start = java.lang.System.currentTimeMillis();
						ZipExtractor.unZipAll(new File(intputSourcePath), new File(outputSourcePath));
						long end = java.lang.System.currentTimeMillis();
						extraction += (end-start);
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
				
				
				        System.out.println("Parsing Sources in  :"+outputSourcePath);
                         
						parsePluginSourceClasses(outputSourcePath, plugin, elements);
						parse_plugin_source_4_consumed_services(outputSourcePath,plugin,elements);
						
						isSCParsed=true;
					
			/*		
						ZipExtractor.deleteDirectory(new File(outputSourcePath));
					*/
				}
			  
		
		     else{
			  System.out.println(" source not found "+PATH);
		     }
	      }
		
		
		if(!isSCParsed){	
		   //  parsing source code
		   if(exhaustive) {
			    if(PATH.contains(".source_")){
			       System.out.println("start parsing source code in "+plugin.getAbsolutePath());
			
		            parsePluginSourceClasses(PATH, plugin, elements);
		            parse_plugin_source_4_consumed_services(PATH,plugin,elements);
		            //	parse_plugin_bytecode_4_consumed_services(PATH,plugin, elements);
			    }
 	       }
		
		    if(!PATH.contains(".source_")){
		        //Service Identification
		        // Identification of provided services
		    	pluginsHaveNoSources.add(PATH);
		        parse_bytecode_PluginBClasses(PATH, plugin, elements);
         
		       // Identification of consumed services
		       parse_plugin_bytecode_4_consumed_services(PATH,plugin,elements);
		    }
		}
		
	//	System.out.println("NB SERVICEs in "+PATH +" is:"+nbservices);
		parse_declarativeServices(PATH, plugin, elements);

/*		String service_component = attributes.getValue(SERVICE_COMPONENT);
		
		if(service_component != null){
			System.out.println("---- Found a declarative service configuration");
			String[] uri_xml ;
		//	List<PackageElement> lexport_packages = plugin.getExport_packages();
		//	List<PackageElement> limport_packages = plugin.getImport_packages();
			
			uri_xml = service_component.split(",\\s+|,");
			
			long somme=0;
			for(String uri : uri_xml){
				//System.out.println(uri);
				long start = java.lang.System.currentTimeMillis();
		//		System.out.println("xml file for declarative service" +uri);
				List<List<String>> infos = parserDS(uri);
				long end = java.lang.System.currentTimeMillis();
				somme += (end-start);
				String implClass = null;
				
				if(infos==null) continue;
				
				List<String> implClassList = infos.get(0);
				if(!implClassList.isEmpty())
					implClass = implClassList.get(0);
				System.out.println("DS "+infos.size());
				//System.out.println("Implem : "+implClass);
				
				//for provided interfaces
		//		addPackages(implClass, infos.get(1), lexport_packages);
				
				//for required interfaces
			//	addPackages(implClass, infos.get(2), limport_packages);	
				

			}
			
			//System.out.println("Parsing DS "+ somme);
			
			parserDS += somme;
			
		}*/
      }

      
      // parsing plugin.xml file
		// extension point identification 
		
		parsePluginXmlFile(PATH, plugin,elements);
		// extension identification 

		if(deleteDirectory){
			ZipExtractor.deleteDirectory(new File(PATH));
		}
		// Name
		currentLocalization = attributes.getValue(BUNDLE_LOCALIZATION);
		if (currentLocalization == null) {
			currentLocalization = DEFAULT_LOCALIZATION;
		}
		String name = attributes.getValue(BUNDLE_NAME);
		plugin.setName(name);
	}
	/**
	 * 
	 * @param plugin
	 * @param pe
	 * @param areRequiredInterfaces
	 */
	private static void add_interfaceElements(PluginElement plugin, PackageElement pe, boolean isRequiredInterfaces,List<IElement> elements) {

		if(OSGiSoftArchiAdapter.parseInterfaces){

		Map<String, HashMap<String, ArrayList<InterfaceElement>>> pluginsInterfaces = OSGiSoftArchiAdapter.pluginsInterfaces;
		
		     HashMap<String, ArrayList<InterfaceElement>> pluginInterfaces = pluginsInterfaces.get(plugin.getSymbName()+"_"+plugin.getVersion());
		     		     
		     if(pluginInterfaces!= null){

		    	 ArrayList<InterfaceElement> interfaces = pluginInterfaces.get(pe.getName());
		    	 if(interfaces!=null){
		    	 for (InterfaceElement interfaceElem : interfaces) {
		    		 
		    		 if(isRequiredInterfaces){
		    	//	 InterfaceElement reqInterface = new InterfaceElement(interfaceName);
		    			if(! OSGiSoftArchiAdapter.interfaceIsExists(plugin.getRequiredInterfaces(), interfaceElem.getInterfaceName())){
					       plugin.getRequiredInterfaces().add(interfaceElem);
		    		       pe.getInterfaces().add(interfaceElem);

		    		       elements.add(interfaceElem);
		    			}
		    		 }
		    		 else{
		    				if(! OSGiSoftArchiAdapter.interfaceIsExists(plugin.getProvidedInterfaces(), interfaceElem.getInterfaceName())){
		    					
		    					//		  InterfaceElement provInterface = new InterfaceElement(interfaceName);
		    					plugin.getProvidedInterfaces().add(interfaceElem);
		    					pe.getInterfaces().add(interfaceElem);
		    					elements.add(interfaceElem);
		    				}
		    		 }
		    	 }
		    	 }
		     }
			 
		
		} 
	}

	private static void parsePluginXmlFile(String path, PluginElement plugin, List<IElement> elements) {
		
      if(OSGiSoftArchiAdapter.parseExtensions){
		File pluginxml = new File(path+File.separator+"plugin.xml");
		if(pluginxml.exists()){
	//		System.out.println("start parsing plugin.xml file");
			PluginXMLParser pxmlparser = new PluginXMLParser(pluginxml.getAbsolutePath());
			pxmlparser.getInformations();
			plugin.getExtensionPoints().addAll(pxmlparser.getExtensionPoints());
			plugin.getExtensions().addAll(pxmlparser.getExtensions());
			elements.addAll(pxmlparser.getExtensionPoints());
			elements.addAll(pxmlparser.getExtensions());

		}
      }
		
	}

	private static String createOutputPath() {
	       
		String output ;
		
		if(java.lang.System.getProperty("file.separator").equals("\\")){
			 // for windows
			output = java.lang.System.getProperty("java.io.tmpdir")+"archive_";
	    }
		else{
		   output = java.lang.System.getProperty("java.io.tmpdir")+File.separator+"archive_";
		   
		}
        File file = new File(output);
        if(!file.exists()){
        	file.mkdir();
        	
        }
		return output;
	}
	
/**
 * 
 * @param time
 * @return
 * @author kerdoudi
 */
	public static String printTime(long time) {
		int h=0,m=0,s=0;
		h = (int) time/3600000;
		time = time % 3600000;
		m = (int) time/60000;
		time = time % 60000;
		s = (int) time/1000;
	//	System.out.println("Consumed time: "+h+" hours "+m+" minutes "+s+" seconds ");
//		return "Consumed time: "+h+" hours "+m+" minutes "+s+" seconds ";
		return " : "+h+" hours "+m+" minutes "+s+" seconds ";
	}
	
	/*
	private static void add_provided_interfaces(String PATH2, PluginElement plugin) {
 		   File file = new File(PATH2);
			if (file.isDirectory()) {
				for (File f:file.listFiles()) {
					if (f.getAbsolutePath().endsWith(".class")) {
							try {
							
								FileInputStream fis = new FileInputStream(f);
  							    addInterfaces2Package(plugin, fis);
								fis.close();

								//
							} catch (FileNotFoundException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}
						
					}
					else add_provided_interfaces(f.getAbsolutePath(), plugin);
				}			
			}
			
	}
*/
	
	/***
	 * 
	 * @param PATH2
	 * @param plugin
	 * @param elements
	 * @return
	 */
		private static List<ServiceElement> parse_declarativeServices(String PATH2, PluginElement plugin, List<IElement> elements) {
			
			List<ServiceElement> result = new ArrayList<>();		
			//System.out.println("Parsing Bytecode Directory  PATH :"+PATH2);
				File file = new File(PATH2);
				
				if (file.isDirectory()) {
					
					for (File f:file.listFiles()) {
						
						if (f.getAbsolutePath().endsWith(".xml")) {
						
							if(f.getParentFile().getName().equals("OSGI-INF") || f.getParentFile().getParentFile().getName().equals("OSGI-INF")){
								
					//		System.out.println("Declarative service is found in "+plugin.getSymbName());
					//		String service_component = attributes.getValue(SERVICE_COMPONENT);

					//		if(service_component.contains(service_component));

							List<List<String>> infos = XMLParser.getInformations(f.getAbsolutePath());

							
							String implClass = null;
							
							if(infos==null) continue;
							
							List<String> implClassList = infos.get(0);
							if(!implClassList.isEmpty())
								implClass = implClassList.get(0);
							System.out.println("DS "+infos.size());
							//System.out.println("Implem : "+implClass);
							
							//for registered services
					//		addPackages(implClass, infos.get(1), lexport_packages);
							
							for(String interfaceName : infos.get(1) ) {
								
								if(!interfaceName.equals("") || !implClass.equals("")) {
									   InterfaceElement itfElement =null;
									   if(!interfaceName.equals("") &&  !interfaceName.startsWith("java.lang.")){
										   
										   itfElement=RegisterServiceParser.findInterfaceElement(interfaceName,plugin.getProvidedInterfaces());
										   
									   }
								      if(!RegisterServiceParser.serviceAlreadyExists(plugin.getRegisteredServices(),interfaceName, implClass)){
									     System.out.println("Registered SERVICE in DS component file : itf: "+interfaceName+"\t obj: "+implClass);
									     ServiceElement serElement = new ServiceElement(itfElement,interfaceName, "");
									     plugin.getRegisteredServices().add(serElement);
									     elements.add(serElement);
											declarativeservices++;

											nbservices2++;

								      }
								}
								
								nbservices++;
							}
								
								
							
							
							
							
							//for consumed services
				//			addPackages(implClass, infos.get(2), limport_packages);	

							for(String interfaceName : infos.get(2) ) {
								
								if(!interfaceName.equals("") || !implClass.equals("")) {
									   InterfaceElement itfElement =null;
									   if(!interfaceName.equals("") &&  !interfaceName.startsWith("java.lang.")){
										   
										   itfElement=RegisterServiceParser.findInterfaceElement(interfaceName,plugin.getRequiredInterfaces());
										   
									   }
								      if(!RegisterServiceParser.serviceAlreadyExists(plugin.getConsumedServices(),interfaceName, "")){
									     System.out.println("Consumed SERVICE in DS component file : itf: "+interfaceName+"\t obj: "+"");
									     ServiceElement serElement = new ServiceElement(itfElement,interfaceName, "");

									     plugin.getConsumedServices().add(serElement);
									     elements.add(serElement);

											clients4declarativeservices++;

											nbserviceclients2++;

								      }
								}
								nbserviceclients++;
							}
							
							
							}
						}
						else parse_declarativeServices(f.getAbsolutePath(), plugin, elements);
					}			
				}
			return result;		
		}
	
	private static List<ServiceElement> parse_plugin_source_4_consumed_services(String PATH, PluginElement plugin, List<IElement> elements) {
		List<ServiceElement> result = new ArrayList<>();
		
		//System.out.println("Parsing Source Directory  PATH for consumed services :"+PATH);
			File file = new File(PATH);
			
			if (file.isDirectory()) {
				
				for (File f:file.listFiles()) {
					
					if (f.getAbsolutePath().endsWith(".java")) {
						
						//System.out.println("Parsing Source File PATH :"+f.getAbsolutePath());
						long start = java.lang.System.currentTimeMillis();
			//			List<ServiceElement> consumedServiceElements = parseSourceFile4ConsumedServices(new File(PATH), plugin.getAbsolutePath(),plugin.getRequiredInterfaces(), result);
				//		if(consumedServiceElements!=null)		
				//	 	  plugin.getConsumedServices().addAll(consumedServiceElements);
						
						elements.addAll( parseSourceFile4ConsumedServices(new File(PATH), plugin.getAbsolutePath(),plugin.getRequiredInterfaces(),  plugin.getConsumedServices()));
						
						long end = java.lang.System.currentTimeMillis();
		
						//System.out.println("Parsing Java class"+ (end - start));
		
						parserJava += (end-start);
		
						
						
				/*		for(ServiceElement selts: result) {
							List<String> itfs = new ArrayList<>();
							itfs.add(selts.getInterfaceElement().getInterfaceName());
				//			addPackagesFromActivatorParser(selts, plugin.getImport_packages());
							
							System.out.println("Consumed InterfaceName "+selts.getInterfaceElement().getInterfaceName());
						//	System.out.println("ObjName "+selts.getObjName());
							System.out.println("Description "+selts.getText());

							
						}*/
					}
					else parse_plugin_source_4_consumed_services(f.getAbsolutePath(), plugin,elements);
				}
				nbserviceclients +=  plugin.getConsumedServices().size();

			}
			
					
		return result;
	}

	private static List<ServiceElement>  parsePluginSourceClasses(String PATH2, PluginElement plugin, List<IElement> elements) {
		
		
		List<ServiceElement> result = new ArrayList<>();
			
			File file = new File(PATH2);
			
			if (file.isDirectory()) {
				
				for (File f:file.listFiles()) {
					
					if (f.getAbsolutePath().endsWith(".java")) {
						
				//		System.out.println("Parsing Source File PATH :"+f.getAbsolutePath());
						long start = java.lang.System.currentTimeMillis();
				//		List<ServiceElement> registeredServiceElements = parseActivator(new File(PATH), plugin.getAbsolutePath(),plugin.getProvidedInterfaces(), result);
						
				//		plugin.getRegisteredServices().addAll(registeredServiceElements);
						
					elements.addAll(parseActivator(new File(PATH), plugin.getAbsolutePath(),plugin.getProvidedInterfaces(), plugin.getRegisteredServices()));
						
		
						long end = java.lang.System.currentTimeMillis();
		
						//System.out.println("Parsing Java class"+ (end - start));
		
						parserJava += (end-start);
		

				
						
						
					/*	
						for(ServiceElement selts: result) {
							List<String> itfs = new ArrayList<>();
							itfs.add(selts.getInterfaceElement().getInterfaceName());
					//		addPackagesFromActivatorParser(selts, plugin.getExport_packages());
							System.out.println("InterfaceName "+selts.getInterfaceElement().getInterfaceName());
							System.out.println("ObjName "+selts.getObjName());
							System.out.println("Description "+selts.getText());


						}*/
						
						
					}
					else parsePluginSourceClasses(f.getAbsolutePath(), plugin, elements);
				}
				nbservices += plugin.getRegisteredServices().size();


			}
			
					
		return result;
	}



/***
 * 
 * @param PATH2
 * @param plugin
 * @param elements
 * @return
 */
	private static List<ServiceElement> parse_bytecode_PluginBClasses(String PATH2, PluginElement plugin, List<IElement> elements) {
		
		List<ServiceElement> result = new ArrayList<>();		
		//System.out.println("Parsing Bytecode Directory  PATH :"+PATH2);
			File file = new File(PATH2);
			
			if (file.isDirectory()) {
				
				for (File f:file.listFiles()) {
					
					if (f.getAbsolutePath().endsWith(".class")) {
						
						//System.out.println("Parsing Bytecode File PATH :"+f.getAbsolutePath());
				
							try {
								long start= java.lang.System.currentTimeMillis(); 
								
								FileInputStream fis = new FileInputStream(f);
						//		List<ServiceElement> registeredServices = PluginsServiceParser.parsePluginClass(fis, plugin.getProvidedInterfaces(), plugin.getRegisteredServices());
						//		if(registeredServices!=null)
						//		   plugin.getRegisteredServices().addAll(registeredServices);
								
								
								elements.addAll(PluginsServiceParser.parsePluginClass(fis, plugin.getProvidedInterfaces(), plugin.getRegisteredServices()));
								
								fis.close();
							    long end = java.lang.System.currentTimeMillis(); 
							    
							   // System.out.println("Parsing ByteCode"+ (end - start)); 
								
							    parserBytecode += (end -start);
							    
								
					
								//
					/*			for(ServiceElement selts: result) {
								
							
									addPackagesFromByteCode(selts, plugin.getExport_packages());
								}
						*/		
							} catch (FileNotFoundException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}
						
					}
					else {
						parse_bytecode_PluginBClasses(f.getAbsolutePath(), plugin, elements);
					}
				}	
				nbservices += plugin.getRegisteredServices().size();

			}
		return result;		
	}
	



private static List<ServiceElement> parse_plugin_bytecode_4_consumed_services(String PATH2, PluginElement plugin, List<IElement> elements) {
		
		List<ServiceElement> result = new ArrayList<>();		
		//System.out.println("Parsing Bytecode Directory  PATH :"+PATH2);
			File file = new File(PATH2);
			
			if (file.isDirectory()) {
				
				for (File f:file.listFiles()) {
					
					if (f.getAbsolutePath().endsWith(".class")) {
						
					//	System.out.println("Parsing Bytecode File PATH :"+f.getAbsolutePath());
				
							try {
								long start= java.lang.System.currentTimeMillis(); 
								
								FileInputStream fis = new FileInputStream(f);
								//List<ServiceElement>  consumedServices = PluginsServiceParser.parsePluginClassForConsumedServ(fis, plugin.getRequiredInterfaces(),plugin.getConsumedServices());
								//plugin.getConsumedServices().addAll(consumedServices);
								
								elements.addAll( PluginsServiceParser.parsePluginClassForConsumedServ(fis, plugin.getRequiredInterfaces(),plugin.getConsumedServices()));
								fis.close();
							    long end = java.lang.System.currentTimeMillis(); 
							    
							    //System.out.println("Parsing ByteCode"+ (end - start)); 
								
							    parserBytecode += (end -start);
							    
								for(ServiceElement selts: result) {
									addPackagesFromByteCode(selts, plugin.getImport_packages());
								}
								
							} catch (FileNotFoundException e) {
								e.printStackTrace();
							} catch (IOException e) {
								e.printStackTrace();
							}
						
					}
					else 
						elements.addAll(parse_plugin_bytecode_4_consumed_services(f.getAbsolutePath(), plugin, elements));
				}	
			    nbserviceclients += plugin.getConsumedServices().size();

			}
		return result;		
	}
/**
 * 
 * @param f
 * @param classpath
 * @param providedInterfaces
 * @param listOfRegisteredServices
 * @return listOfRegisteredServices
 */

	public static List<ServiceElement> parseActivator(File f, String classpath,  List<InterfaceElement> providedInterfaces, List<ServiceElement> listOfRegisteredServices){
		//System.out.println(f.getAbsolutePath());
		if(f.isDirectory()){
			File[] listfiles = f.listFiles();
			for(File tmpf: listfiles){
				if(tmpf.isDirectory()){
					parseActivator(tmpf, classpath,providedInterfaces, listOfRegisteredServices);
				}else if(tmpf.getName().contains(".java") && existRegisterParser(tmpf.getAbsolutePath())){

			//		listOfRegisteredServices.addAll(RegisterServiceParser.computeRegisteredServiceElement(tmpf.getAbsolutePath(), classpath,providedInterfaces,listOfRegisteredServices));
					RegisterServiceParser.computeRegisteredServiceElement(tmpf.getAbsolutePath(), classpath,providedInterfaces,listOfRegisteredServices);					
				}
			}
		}
		return listOfRegisteredServices;
	}
	/**
	 * 
	 * @param f
	 * @param classpath
	 * @param requiredInterfaces
	 * @param consumedServiceElements
	 * @return consumedServiceElements
	 */
	private static List<ServiceElement> parseSourceFile4ConsumedServices(File f, String classpath, List<InterfaceElement> requiredInterfaces, List<ServiceElement> consumedServiceElements) {
		//System.out.println(f.getAbsolutePath());
				if(f.isDirectory()){
					File[] listfiles = f.listFiles();
					for(File tmpf: listfiles){
						if(tmpf.isDirectory()){
							parseSourceFile4ConsumedServices(tmpf, classpath,requiredInterfaces, consumedServiceElements);
						}else if(tmpf.getName().endsWith(".java") && existConsumedServParser(tmpf.getAbsolutePath())){
						//	System.out.println("Service Client Found"+tmpf.getAbsolutePath());
							//consumedServiceElements.addAll(RegisterServiceParser.computeConsumedServiceElement(tmpf.getAbsolutePath(), classpath,requiredInterfaces,consumedServiceElements));
							RegisterServiceParser.computeConsumedServiceElement(tmpf.getAbsolutePath(), classpath,requiredInterfaces,consumedServiceElements);
							
						}
					}
				}
				return consumedServiceElements;
	}
	
	/**
	 * Find if a file contains an invocation of registerService
	 * @param file Path of the file
	 * @return true if contains registerService/ false otherwise
	 */
	public static boolean existRegisterParser(String file) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(file));
			String currentLine = "";
			while(sc.hasNextLine()){
				currentLine = sc.nextLine();
				if(currentLine.contains("registerService")) {
			//		System.err.println("============> Found service registration");
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
		return false;
		
	}
	/**
	 * Find if a file contains an invocation of getServiceReference or getServiceReferences
	 * @param file
	 * @return
	 */
	public static boolean existConsumedServParser(String file) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(file));
			String currentLine = "";
			while(sc.hasNextLine()){
				currentLine = sc.nextLine();
				if(currentLine.contains("getServiceReference")) {
			//		System.err.println("============> Found service consumption");
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
		return false;
		
	}
	
	/**
	 * Browse all the file of the current file and apply the bytecode parser to .class file
	 * @param f the current file
	 * @param lse list of services found
	 * @return list of services found
	 */
/*	public static List<ServiceElement> parseBytecode(File f, List<ServiceElement> lse){
		if(f.isDirectory()){
			File[] listfiles = f.listFiles();
			for(File tmpf: listfiles){
				if(tmpf.isDirectory()){
					parseBytecode(tmpf, lse);
				}else if(tmpf.getName().endsWith(".class")){
					//System.out.println("BYTECODE TROUVE "+tmpf.getAbsolutePath());
					try {
						PluginsServiceParser.parsePluginClass(new FileInputStream(tmpf), lse);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return lse;
	}
	*/
	/*
	 * FOLDERS
	 */
	/**
	 * Extracts the plugin infos from its MANIFEST.MF file
	 * 
	 * @param manifestFile
	 *            the absolute path to the manifest
	 * @return a PluginElement containing all the required informations
	 * @throws FileNotFoundException
	 */
	public static PluginElement getPluginInfosFromManifest(String manifestFile, List<IElement> elements) {
		
		PluginElement plugin =null;
	/*	PluginElement plugin = new PluginElement();
		//setting the strategy we want
		plugin.setSimilarityStrategy(strategy);
		
		
		plugin.setJar(false);*/
	
		File f = new File(manifestFile);
		f = f.getParentFile().getParentFile();
		try {
			InputStream ips = new FileInputStream(manifestFile);
			Manifest manifest = new Manifest(ips);
			
			Attributes attributes = manifest.getMainAttributes();
			String symName = attributes.getValue(BUNDLE_SYMBOLIC_NAME);
			int i = symName.indexOf(';');
			if (i != -1)
				symName = symName.substring(0, i);
			
		//	System.out.println(symName);

			plugin = getPluginElement(symName,attributes.getValue(BUNDLE_VERSION),SourceCodeFinder.findSameVerion, elements);
			plugin.setAbsolutePath(f.getAbsolutePath());

		//	nbservices=0;
		//	nbserviceclients=0;
			fillPluginElementInfo(plugin, manifest, elements);
			ips.close();
			manifest = null;
			if (plugin.getName() != null && plugin.getName().contains("%")) {
				File localizationFile = new File(f, currentLocalization + ".properties");
				if (localizationFile.exists()) {
					Properties prop = new Properties();
					InputStream input = new FileInputStream(localizationFile);
					prop.load(input);
					// remove also whitespaces, as the problem with
					// org.eclipse.cdt.dsf.gdb.ui
					String name = prop.getProperty(plugin.getName().substring(1).replaceAll("\\s", ""));
					plugin.setName(name);
					input.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return plugin;
	}

	/*
	 * JARS
	 */
   /**
 *   if the plugin elment is already exit this method return that object or create a new plugin element
 * @param symName
 * @param version
 * @param findSameVerion
 * @param elements
 * @return
 */
	private static PluginElement getPluginElement(String symName, String version,boolean findSameVerion, List<IElement> elements) {
		PluginElement plugin;
        for (IElement iElement : elements) {
			if( iElement instanceof PluginElement ){
				PluginElement pluginElem = (PluginElement) iElement;
			//	System.out.println(pluginElem.getName());
				if(symName.equals(pluginElem.getSymbName()) || symName.equals(pluginElem.getSymbName()+".source")){
					//TODO check the version
					if(!findSameVerion){
						return pluginElem;
					}
					if(pluginElem.getVersion().equals(version)){
					return pluginElem;
					}
				}
			}
				
		}
		 plugin = new PluginElement();
			//setting the strategy we want
			plugin.setSimilarityStrategy(strategy);
			
			plugin.setSymbName(symName);
			
			if(symName.endsWith(".source")){
				plugin.setSymbName(symName.substring(0,symName.indexOf(".source")));
				String s= plugin.getSymbName();
			}
			plugin.setJar(false);
			elements.add(plugin);
		return plugin;
	}
	/**
	 * Extracts the plugin infos, considering that it is a jar file
	 * 
	 * @param jarFile
	 *            the absolute path to the jar file
	 * @param elements 
	 * @return the plugin element
	 */
	public static PluginElement getPluginInfosFromJar(String jarFile, List<IElement> elements) {
	/*	PluginElement plugin = new PluginElement();
		
		//setting the strategy we want
		plugin.setSimilarityStrategy(strategy);
		
		plugin.setJar(true);*/
	//	plugin.setAbsolutePath(jarFile);
		PluginElement plugin =null;

		try {
			File f = new File(jarFile);
			JarFile jar = new JarFile(f);
	//		nbservices=0;
	//		nbserviceclients=0;
			Manifest manifest = jar.getManifest();

			Attributes attributes = manifest.getMainAttributes();
			String symName = attributes.getValue(BUNDLE_SYMBOLIC_NAME);
			int i = symName.indexOf(';');
			if (i != -1)
				symName = symName.substring(0, i);
			
		//	System.out.println(symName);
			plugin = getPluginElement(symName,attributes.getValue(BUNDLE_VERSION),SourceCodeFinder.findSameVerion, elements);
			plugin.setAbsolutePath(f.getAbsolutePath());

			
			
			fillPluginElementInfo(plugin, jar.getManifest(), elements);
			if (plugin.getName() != null && plugin.getName().contains("%")) {
				ZipEntry zipEntry = jar.getEntry(currentLocalization + ".properties");
				if (zipEntry != null) {
					Properties prop = new Properties();
					prop.load(jar.getInputStream(zipEntry));
					String name = prop.getProperty(plugin.getName().substring(1).replaceAll("\\s", ""));
					plugin.setName(name);
				}
			}
			jar.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return plugin;
	}

	/*
	 * BOTH
	 */

	/**
	 * Extracts all the required plugins' symbolic names from the Require-Bundle
	 * field's value
	 * 
	 * @param value
	 *            a String containing the whole Require-Bundle field's value
	 * @param plugin
	 *            the PluginElement for which we are searching the required
	 *            plugins
	 */
	private static void getRequireBundlesSymbNames(String value, PluginElement plugin) {
		String[] values = value.split(",");
		String previous = "";
		for (String val : values) {
			if (!val.matches("\\s*[0-9].*")) {
				int i = val.indexOf(';');
				if (i != -1)
					val = val.substring(0, i);
				val = val.replaceAll("\\s", "");
				previous = val;
				plugin.addRequire_bundle(val);
			} else if (val.contains("resolution:=optional")) {
				plugin.removeRequire_bundle(previous);
			}
		}
	}

	public static Map<String, String> createBundlesInfoMap(URI uri) {
		Map<String, String> map = new HashMap<String, String>();
		File file = FileUtils.getFile(uri);
		File bundlesInfo = new File(file.getAbsolutePath() + "/" + BUNDLESINFO_RELATIVEPATH);
		if (bundlesInfo.exists()) {
			List<String> bundles = FileUtils.getLinesOfFile(bundlesInfo);
			for (String info : bundles) {
				int comma = info.indexOf(",");
				if (comma != -1) {
					map.put(info.substring(0, comma), info);
				}
			}
		}
		return map;
	}

	/**
	 * Check if a file is a plugin
	 * 
	 * @param file
	 * @return true if it is a plugin
	 */
	public static boolean isAPlugin(File file) {
		if (file.getParentFile().getName().equals("plugins") || file.getParentFile().getName().equals("dropins")) {
			if (file.isDirectory()) {
				File manif = new File(file.getAbsolutePath() + "/META-INF/MANIFEST.MF");
				if (manif.exists()) {
					return true;
				}
			} else if (FileUtils.getExtension(file).equalsIgnoreCase("jar")) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Check if a file is a plugin
	 * 
	 * @param file
	 * @return true if it is a plugin
	 */
	public static boolean isAnSoftArch(File file) {
		if (file.getParentFile().getName().equals("plugins") || file.getParentFile().getName().equals("dropins")) {
			if (file.isDirectory()) {
				File manif = new File(file.getAbsolutePath() + "/META-INF/MANIFEST.MF");
				if (manif.exists()) {
					return true;
				}
			} else if (FileUtils.getExtension(file).equalsIgnoreCase("jar")) {
				return true;
			}
		}
		return false;
	}
	
	private static List<List<String>> parserDS(String uri){
		
		List<List<String>> infos = new ArrayList<>();
		
		
		
		if(uri.charAt(0)!='/')
			uri = '/'+uri;
		
		if(uri.contains("*.xml")){	
			String newPath = PATH+uri.split("\\*.xml")[0];
			File file = new File(newPath);

			String[] list = file.list();
			
			for(int i=0; i<list.length; i++){
				if(list[i].endsWith(".xml")){
					infos = XMLParser.getInformations(newPath+list[i]);
				}
			}
			
		}
		else{
			
			infos = XMLParser.getInformations(PATH+uri);
		}
		
		
		return infos;
	}

	private static PackageElement findPackage(String name, List<PackageElement> packages){
		for(PackageElement p : packages){
			if(name.contains(p.getName())){
				return p;
			}
		}
		return null;
	}
	
	/**
	 * Creates the packages and services along a list of interfaces implemented by the implemention class, 
	 * and adds the created packages to the list of packages 
	 * @param implClass the name of the implemented class of the services
	 * @param interfaceNames the names of all the interfaces implemented 
	 * @param lpackages the list of packages where the new packages need to be added
	 */
	private static void addPackages(String implClass, List<String> interfaceNames, List<PackageElement> lpackages){
		
		PackageElement p ;
		
		for(String n : interfaceNames ) {
			
			
			String[] words = n.split("\\.");
			String packageName="";
			if(words.length > 1){
			 packageName = n.substring(0, n.length()- words[words.length-1].length()-1);
			}
			//System.out.println("Interface name "+n);
			
			if((p=findPackage(packageName, lpackages))==null){
				//System.out.println("Package name "+packageName);
		        System.out.println("addPackages is invoked for "+implClass);

				p = new PackageElement(packageName);
				lpackages.add(p);
			}
		//	p.addService(new ServiceElement(n, implClass));
		}
	}
	
	
	private static void addPackagesFromByteCode(ServiceElement se, List<PackageElement> lpackages){
		PackageElement p;
		String n = se.getObjName();
		String[] words = n.split("\\.");
		
		String packageName = n.substring(0, n.length()- words[words.length-1].length()-1);
		if((p=findPackage(packageName, lpackages))==null){
			//System.out.println("Package name "+packageName);
			
			p = new PackageElement(packageName);
			lpackages.add(p);
		}
		
	//	p.addService(se);
		
	}
	
	
	private static void addPackagesFromActivatorParser(ServiceElement se, List<PackageElement> lpackages){
		PackageElement p ;
		
		String packageName;
		
		if(se.getObjName().equals("")) {
			String n = se.getInterfaceElement().getInterfaceName();
			
			String[] words = n.split("\\.");
			if(words.length<=1)
				return;
			packageName = n.substring(0, n.length()- words[words.length-1].length()-1);
			
		}
		else{
			if(se.getInterfaceElement()==null) {
				String n = se.getObjName();
				String[] words = n.split("\\.");
				if(words.length<=1)
					return;
				packageName = n.substring(0, n.length()- words[words.length-1].length()-1);
				
			}
			else{

				String n = se.getInterfaceElement().getInterfaceName();
				
				String[] words = n.split("\\.");
				if(words.length<=1)
					return;
				packageName = n.substring(0, n.length()- words[words.length-1].length()-1);
			}
			
		}
		

		if((p=findPackage(packageName, lpackages))==null){
			//System.out.println("Package name "+packageName);
			
			p = new PackageElement(packageName);
			lpackages.add(p);
		}
		
	//	p.addService(se);

	}
	
	
	
}
