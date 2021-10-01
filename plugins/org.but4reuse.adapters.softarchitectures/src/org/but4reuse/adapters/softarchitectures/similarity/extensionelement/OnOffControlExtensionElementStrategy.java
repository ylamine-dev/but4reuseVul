package org.but4reuse.adapters.softarchitectures.similarity.extensionelement; 

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.ExtensionElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;

public class OnOffControlExtensionElementStrategy implements ISimilarity {

	
	
	
	@Override
	public double similarity(IElement currentElement, IElement anotherElement) {
		if (currentElement instanceof ExtensionElement && anotherElement instanceof ExtensionElement) {
			ExtensionElement currentExtensionElement = ((ExtensionElement) currentElement);
			ExtensionElement anotherExtensionElement = ((ExtensionElement) anotherElement);
			
			if(currentExtensionElement.getPoint().equals(anotherExtensionElement.getPoint())){
		//		if(currentExtensionElement.getClassName().equals(anotherExtensionElement.getClassName())){
					
					//comparer les deux balises filles
					return 1;
					
			//	}
			}
		}
		return 0;
	}
}
