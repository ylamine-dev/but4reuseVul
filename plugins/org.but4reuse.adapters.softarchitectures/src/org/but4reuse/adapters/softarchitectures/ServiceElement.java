package org.but4reuse.adapters.softarchitectures;

import java.util.ArrayList;
import java.util.List;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.impl.AbstractElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;
import org.but4reuse.adapters.softarchitectures.similarity.serviceelement.MinimalServiceElementStrategy;
import org.but4reuse.utils.strings.StringUtils;

public class ServiceElement extends AbstractElement {
	
	private InterfaceElement interfaceElement;
	private String interfaceName;
	private String objName;
	

	private boolean isInterface;
	private boolean isObj;
	
	private ISimilarity similarityStrategy = new MinimalServiceElementStrategy();

/*	
	public ServiceElement(String interfaceName, String objName){
		this.interfaceName = interfaceName;
		this.objName = objName;
		if(interfaceName.equals("")){
			isInterface = false;
		}else{
			isInterface = true;
		}
		
		if(objName.equals("")){
			isObj = false;
		}else{
			isObj = true;
		}
	}
*/	
	public ServiceElement(InterfaceElement interfaceEle,String interfaceName, String objName){
		
		this.objName = objName;
		this.interfaceName = interfaceName;

		if(OSGiSoftArchiAdapter.parseInterfaces){
		this.interfaceElement = interfaceEle;
		}
		else{
		
		  if(interfaceName.equals("")){
			isInterface = false;
		  }else{
			isInterface = true;
		  }
		}
		
		if(objName.equals("")){
			isObj = false;
		}else{
			isObj = true;
		}
	}
	
	@Override
	public double similarity(IElement anotherElement) {
		//if they implements the same interface
			// Same interface -> see redef of equals method
		return similarityStrategy.similarity(this, anotherElement);
	/*	
		if (this.equals(anotherElement)) {
			return 1;
		}
		return 0;*/
	}
	
	
	public String getObjName(){
		return objName;
	}
	
	public void setObjName(String objName) {
		this.objName = objName;
	}
	
	public boolean isInterface(){
		return isInterface;
	}
	
	public boolean isObj(){
		return isObj;
	}
	
/*	@Override
	public boolean equals(Object o){
		if(o==null) return false;
		if(o==this) return true;
		if(!(o instanceof ServiceElement)) return false;
		if(this.interfaceName==""){
			return this.objName.equals( ((ServiceElement) o).objName);
		}
		return this.interfaceName.equals( ((ServiceElement) o).interfaceName);
	}
*/
	@Override // ajouter minimal similarity
	public boolean equals(Object o){
		if(o==null) return false;
		if(o==this) return true;
		if(!(o instanceof ServiceElement)) return false;
		if(OSGiSoftArchiAdapter.parseInterfaces){
		  if(this.interfaceElement==null){
			return this.objName.equals( ((ServiceElement) o).objName);
		  }
		}
		else{
			if(this.interfaceName==""){
				return this.objName.equals( ((ServiceElement) o).objName);
			}
		}
			
		return this.getInterfaceName().equals( ((ServiceElement) o).getInterfaceName());
	}
	@Override
	public String getText() {
		String itfText=interfaceName;
	/*	if(PluginOsgiAdapter.parseInterfaces){
		  if(interfaceElement!=null){
			itfText=  interfaceElement.getInterfaceName();
		  }
		}
		*/
		
		  return "[SERVICE (ITF) ELEMENT] : "+itfText+" [SERVICE (OBJ) ELEMENT] : " +objName;
		
	}
	@Override
	public List<String> getWords() {
		List<String> words = new ArrayList<String>();
		
		if(OSGiSoftArchiAdapter.parseServices){

		for (String s : StringUtils.tokenizeString(getInterfaceName())) {
    		if(OSGiSoftArchiAdapter.isNotKeyWord(s)  )
				words.add(s);
		}
		}
		return words;
	}
	public ISimilarity getSimilarityStrategy() {
		return similarityStrategy;
	}

	public void setSimilarityStrategy(ISimilarity similarityStrategy) {
		this.similarityStrategy = similarityStrategy;
	}

	public InterfaceElement getInterfaceElement() {
		return interfaceElement;
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

}
