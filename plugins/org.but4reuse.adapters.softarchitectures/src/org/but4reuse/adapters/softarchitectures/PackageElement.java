package org.but4reuse.adapters.softarchitectures;

import java.util.ArrayList;
import java.util.List;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.impl.AbstractElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;
import org.but4reuse.adapters.softarchitectures.similarity.packageelement.AveragePackageElementStrategy;
import org.but4reuse.utils.strings.StringUtils;

public class PackageElement extends AbstractElement {
	
	private String name;
//	private List<ServiceElement> services = new ArrayList<>();
	private List<InterfaceElement> interfaces = new ArrayList<>();
	private ISimilarity strategy = new AveragePackageElementStrategy();
	
	public PackageElement(String name){
		this.name = name;
		this.interfaces = new  ArrayList<InterfaceElement>();
	}
	
	public String getName(){
		return name;
	}
	
/*	public List<ServiceElement> getServices(){
		return services;
	}
	*/
	public void setSimilarityStrategy(ISimilarity strategy){
		this.strategy = strategy;
	}
/*	public void addService(ServiceElement serv){
		//equals method of ServiceElement has been redefined
		if(!services.contains(serv))
			services.add(serv);
	}
	*/
	@Override
	public double similarity(IElement anotherElement) {
		return strategy.similarity(this, anotherElement);
	}

	@Override
	public String getText() {
		
		return "[PACKAGE ELEMENT] "+name;   
	}
	@Override
	public List<String> getWords() {
		List<String> words = new ArrayList<String>();
		 if(OSGiSoftArchiAdapter.parsePackages){
		     
		    	
		    	for (String s : StringUtils.tokenizeString(getName())) {
		    		if(OSGiSoftArchiAdapter.isNotKeyWord(s)  )
						words.add(s);
				}
		      
		 }
		return words;
	}
	public List<InterfaceElement> getInterfaces() {
		return interfaces;
	}

	public void addInterface(InterfaceElement itf) {
		if(!interfaces.contains(itf)){
			interfaces.add(itf);
		}
	}
}
