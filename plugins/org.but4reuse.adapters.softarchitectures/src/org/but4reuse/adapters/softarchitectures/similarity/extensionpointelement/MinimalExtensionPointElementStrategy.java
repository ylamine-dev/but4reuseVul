package org.but4reuse.adapters.softarchitectures.similarity.extensionpointelement;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.ExtensionPointElement;
import org.but4reuse.adapters.softarchitectures.ServiceElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;

public class MinimalExtensionPointElementStrategy implements ISimilarity {

	@Override
	public double similarity(IElement currentElement, IElement anotherElement) {
		
		if (currentElement instanceof ExtensionPointElement && anotherElement instanceof ExtensionPointElement) {
			ExtensionPointElement currentExtensionPointElement = ((ExtensionPointElement) currentElement);
			ExtensionPointElement anotherExtensionPointElement = ((ExtensionPointElement) anotherElement);
			
			if(currentExtensionPointElement.getId().equals(anotherExtensionPointElement.getId())){
				
				return 1;
			}
		}
		return 0;
	}

}
