package org.but4reuse.adapters.softarchitectures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;
import org.but4reuse.adapters.softarchitectures.similarity.packageelement.MinimalPackageElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.pluginelement.AveragePluginElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.pluginelement.MinimalPluginElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.pluginelement.OnOffControlPluginElementStrategy;
import org.but4reuse.utils.strings.StringUtils;

/**
 * Plugin Element
 * 
 * @author Diana MALABARD
 * @author Jason CHUMMUN
 * 
 */
public class PluginElement extends FileElement {

	private String pluginSymbName;
	private String pluginVersion;
	private String bundleInfoLine;
	private String fragmentHost;
	private String name;
	// each pluginElement in require_Bundles, the list of require_Bundle will be
	// empty.
	// because we do not know the dependencies
	// The same thing for absoluthPath
	private ArrayList<String> require_Bundles;
	
	
	//PSTL ADD
	private List<PackageElement> import_packages;
	private List<PackageElement> export_packages;
	
	private List<ServiceElement> registeredServices;
	private List<ServiceElement> consumedServices;
	
	private List<InterfaceElement> requiredInterfaces;
	private List<InterfaceElement> providedInterfaces;
	
	private List<ExtensionPointElement> extensionPoints;
	private List<ExtensionElement> extensions;

//	private Map<String,String> services;
//	private List<String> consumed_services;
	private ISimilarity similarityStrategy = new OnOffControlPluginElementStrategy();
	
	
	private String absolutePath;
	private boolean isJar;

	public PluginElement() {
		require_Bundles = new ArrayList<String>();
		import_packages = new ArrayList<PackageElement>();
		export_packages = new ArrayList<PackageElement>();
	//	services = new HashMap<String, String>();
		consumedServices = new ArrayList<ServiceElement>();
		registeredServices=new ArrayList<ServiceElement>();
		
		requiredInterfaces = new ArrayList<InterfaceElement>();
		providedInterfaces = new ArrayList<InterfaceElement>();

		extensionPoints = new ArrayList<ExtensionPointElement>();
		extensions = new ArrayList<ExtensionElement>();
	}
	
/*	public Map<String,String> getServices(){
		return services;
	}
	*/
	/*public List<String> getConsumedServices(){
		return consumed_services;
	}*/
	
	public List<PackageElement> getImport_packages(){
		return import_packages;
	}
	
	public List<PackageElement> getExport_packages(){
		return export_packages;
	}
	
	public List<InterfaceElement> getRequiredInterfaces() {
		return requiredInterfaces;
	}

	public void setRequiredInterfaces(List<InterfaceElement> requiredInterfaces) {
		this.requiredInterfaces = requiredInterfaces;
	}

	public List<InterfaceElement> getProvidedInterfaces() {
		return providedInterfaces;
	}

	public void setProvidedInterfaces(List<InterfaceElement> providedInterfaces) {
		this.providedInterfaces = providedInterfaces;
	}

	public void setSimilarityStrategy(ISimilarity strategy){
		this.similarityStrategy = strategy;
	}
	
	
	@Override
	public double similarity(IElement anotherElement) {
		//System.out.println(this.getSymbName()+" "+((anotherElement instanceof PluginElement)?((PluginElement)anotherElement).getSymbName():"")+" "+similarityStrategy.similarity(this, anotherElement));
		return similarityStrategy.similarity(this, anotherElement);
	}

	public ArrayList<String> getRequire_Bundles() {
		return require_Bundles;
	}

	

	public String getSymbName() {
		return pluginSymbName;
	}

	public void setSymbName(String pluginSymbName) {
		this.pluginSymbName = pluginSymbName;
	}

	public void addRequire_bundle(String require_bundle) {
		this.require_Bundles.add(require_bundle);
	}

	public void removeRequire_bundle(String require_bundle) {
		this.require_Bundles.remove(require_bundle);
	}

	

	@Override
	public String getText() {
		String result = "[PLUGIN ELEMENT] "+name + "  " + pluginSymbName + " " + pluginVersion+"\n";
	
		
		return result;
		
	}
	public boolean isJar() {
		return isJar;
	}

	public void setJar(boolean isJar) {
		this.isJar = isJar;
	}

	public String getAbsolutePath() {
		return absolutePath;
	}

	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}

	public String getVersion() {
		return pluginVersion;
	}

	public void setVersion(String pluginVersion) {
		this.pluginVersion = pluginVersion;
	}

	public String getBundleInfoLine() {
		return bundleInfoLine;
	}

	public void setBundleInfoLine(String bundleInfoLine) {
		this.bundleInfoLine = bundleInfoLine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFragmentHost() {
		return fragmentHost;
	}

	public void setFragmentHost(String fragmentHost) {
		this.fragmentHost = fragmentHost;
	}

	public boolean isFragment() {
		return fragmentHost != null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getSymbName() == null) ? 0 : getSymbName().hashCode());
		return result;
	}

	@Override
	public List<String> getWords() {
		List<String> words = new ArrayList<String>();
		
		if (name != null) {
			for (String s : StringUtils.tokenizeString(name)) {
				if(OSGiSoftArchiAdapter.isNotKeyWord(s)  )
								  words.add(s);
			}
		}
		
		if (getSymbName() != null) {
			for (String s : StringUtils.tokenizeString(getSymbName())) {
				if(OSGiSoftArchiAdapter.isNotKeyWord(s)  )
					  words.add(s);
			}
		}
		return words;
	}

	

	public List<ServiceElement> getRegisteredServices() {
		return registeredServices;
	}

	public void setRegisteredServices(List<ServiceElement> registeredServices) {
		this.registeredServices = registeredServices;
	}

	public List<ServiceElement> getConsumedServices() {
		return consumedServices;
	}

	public void setConsumedServices(List<ServiceElement> consumedServices) {
		this.consumedServices = consumedServices;
	}

	public List<ExtensionPointElement> getExtensionPoints() {
		return extensionPoints;
	}

	public void setExtensionPoints(List<ExtensionPointElement> extensionPoints) {
		this.extensionPoints = extensionPoints;
	}

	public List<ExtensionElement> getExtensions() {
		return extensions;
	}

	public void setExtensions(List<ExtensionElement> extensions) {
		this.extensions = extensions;
	}
}