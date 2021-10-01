package org.but4reuse.adapters.softarchitectures;

import java.util.ArrayList;
import java.util.List;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.impl.AbstractElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;
import org.but4reuse.adapters.softarchitectures.similarity.extensionelement.MinimalExtensionElementStrategy;
import org.but4reuse.utils.strings.StringUtils;

public class ExtensionElement extends AbstractElement {

	String point;
	public ExtensionElement(String pointValue) {

    this.point= pointValue;
	}
  
	public String getPoint() {
		return point;
	}

	public String getClassName() {
		return className;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	String className;
	private ISimilarity similarityStrategy = new MinimalExtensionElementStrategy();

	@Override
	public double similarity(IElement anotherElement) {
		return similarityStrategy.similarity(this, anotherElement);

	}

	@Override
	public String getText() {
		
		return "[Extension (pt) ELEMENT] "+point + "[Extension (className) ELEMENT]"+className  ;

	}

	@Override
	public List<String> getWords() {
		List<String> words = new ArrayList<String>();

		if(OSGiSoftArchiAdapter.parseExtensions){

		  String point = getPoint();
	    	 if(point.contains(".")){
	    		 point=point.substring(point.lastIndexOf(".")); 
	    	 }
	    	  String[] names = point.split("(?<=.)(?=\\p{Upper})");
	    	   for (String exName : names) {
	    	     for (String s : StringUtils.tokenizeString(exName)) {
	    	    	 if(OSGiSoftArchiAdapter.isNotKeyWord(s)  )
				words.add(s);
			 }
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

}
