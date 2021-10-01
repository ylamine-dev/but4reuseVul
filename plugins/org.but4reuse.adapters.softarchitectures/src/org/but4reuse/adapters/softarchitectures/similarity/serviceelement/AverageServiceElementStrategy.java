package org.but4reuse.adapters.softarchitectures.similarity.serviceelement;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.softarchitectures.ServiceElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;
import org.but4reuse.adapters.softarchitectures.similarity.interfaceelement.AverageInterfaceElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.packageelement.AveragePackageElementStrategy;

public class AverageServiceElementStrategy implements ISimilarity {

	@Override
	public double similarity(IElement currentElement, IElement anotherElement) {

		double sum1=0;
		double sum2=0;

		if (currentElement instanceof ServiceElement && anotherElement instanceof ServiceElement) {
			ServiceElement currentServiceElement = ((ServiceElement) currentElement);
			ServiceElement anotherServiceElement = ((ServiceElement) anotherElement);
			
			
			
				 
			  if(currentServiceElement.getInterfaceElement()!=null && anotherServiceElement.getInterfaceElement()!=null){
					 
				if (currentServiceElement.equals(anotherServiceElement)){
	  
					InterfaceElement currentInterfaceElement = currentServiceElement.getInterfaceElement();
					InterfaceElement anotherInterfaceElement = anotherServiceElement.getInterfaceElement();

					currentInterfaceElement.setStrategy(new AverageInterfaceElementStrategy());
					anotherInterfaceElement.setStrategy(new AverageInterfaceElementStrategy());

					
					double average1 = currentInterfaceElement.similarity(anotherInterfaceElement);
			
					return average1;
				}
			  }
			  else if (currentServiceElement.equals(anotherServiceElement)){
					return 1;
			  }
		}
		
		return 0;
		
		
	}

}
