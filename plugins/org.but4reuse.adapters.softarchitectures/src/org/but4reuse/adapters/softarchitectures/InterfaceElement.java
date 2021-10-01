package org.but4reuse.adapters.softarchitectures;

import java.util.ArrayList;
import java.util.List;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.impl.AbstractElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;
import org.but4reuse.adapters.softarchitectures.similarity.interfaceelement.MinimalInterfaceElementStrategy;
import org.but4reuse.utils.strings.StringUtils;

public class InterfaceElement extends AbstractElement {

	private String interfaceName;
	private List<String> operations;
	
	private ISimilarity strategy = new MinimalInterfaceElementStrategy();
   public InterfaceElement(String interfaceName) {
	   this.interfaceName = interfaceName;
	   setOperations(new ArrayList<String>());
	// TODO Auto-generated constructor stub
   } 
	
	@Override
	public double similarity(IElement anotherElement) {
		return strategy.similarity(this, anotherElement);
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "[INTERFACE ELEMENT] "+interfaceName;
	}
	@Override
	public List<String> getWords() {
		List<String> words = new ArrayList<String>();
		if(OSGiSoftArchiAdapter.parseInterfaces){

    	for (String s : StringUtils.tokenizeString(getInterfaceName())) {
    		if(OSGiSoftArchiAdapter.isNotKeyWord(s)  )
			  words.add(s);
		}
		}
		return words;
	}
	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public ISimilarity getStrategy() {
		return strategy;
	}

	public void setStrategy(ISimilarity strategy) {
		this.strategy = strategy;
	}

	
	public List<String> getOperations() {
		return operations;
	}

	public void setOperations(List<String> operations) {
		this.operations = operations;
	}

}
