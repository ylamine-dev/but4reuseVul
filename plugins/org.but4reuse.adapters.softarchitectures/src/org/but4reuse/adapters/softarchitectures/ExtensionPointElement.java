package org.but4reuse.adapters.softarchitectures;

import java.util.ArrayList;
import java.util.List;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.impl.AbstractElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;
import org.but4reuse.adapters.softarchitectures.similarity.extensionpointelement.AverageExtensionPointElementStrategy;
import org.but4reuse.utils.strings.StringUtils;

public class ExtensionPointElement extends AbstractElement {
 
	String id;
	String name;
	String schema;
	
	private ISimilarity similarityStrategy = new AverageExtensionPointElementStrategy();

	public ExtensionPointElement(String idValue, String nameValue, String schemaValue) {
		 id=idValue;
		 name=nameValue;
		 schema=schemaValue;
	}

	@Override
	public double similarity(IElement anotherElement) {
		
		return similarityStrategy.similarity(this, anotherElement);
	}

	@Override
	public String getText() {
		return "[Extension-Point (id) ELEMENT] "+id + "[Extension-Point (name) ELEMENT]"+name  ;
	}

	public String getId() {
		return id;
	}

	
	@Override
	public List<String> getWords() {
		List<String> words = new ArrayList<String>();
		if(OSGiSoftArchiAdapter.parseExtensions){

		  String[] names = getName().split("(?<=.)(?=\\p{Upper})");
   	   for (String exName : names) {
   		   for (String s : StringUtils.tokenizeString(exName)) {
   			if(OSGiSoftArchiAdapter.isNotKeyWord(s)  )
			words.add(s);
				}
		   }
		}
	return words;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public ISimilarity getSimilarityStrategy() {
		return similarityStrategy;
	}

	public void setSimilarityStrategy(ISimilarity similarityStrategy) {
		this.similarityStrategy = similarityStrategy;
	}

}
