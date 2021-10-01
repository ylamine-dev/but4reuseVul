package org.but4reuse.adapters.softarchitectures.similarity.interfaceelement;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.softarchitectures.PackageElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;

public class MinimalInterfaceElementStrategy implements ISimilarity {

	@Override
	public double similarity(IElement currentElement, IElement anotherElement) {

		if (currentElement instanceof InterfaceElement && anotherElement instanceof InterfaceElement) {
			InterfaceElement currentInterfaceElement = ((InterfaceElement) currentElement);
			InterfaceElement anotherInterfaceElement = ((InterfaceElement) anotherElement);
	
	       if(currentInterfaceElement.getInterfaceName().equals(anotherInterfaceElement.getInterfaceName())){
		
	    	   return 1;
	       }
		    
		}
		return 0;

	}
}

