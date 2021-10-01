package org.but4reuse.adapters.softarchitectures.similarity.packageelement;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.softarchitectures.PackageElement;
import org.but4reuse.adapters.softarchitectures.ServiceElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;
import org.but4reuse.adapters.softarchitectures.similarity.interfaceelement.AverageInterfaceElementStrategy;

public class MinimalPackageElementStrategy implements ISimilarity {

	@Override
	public double similarity(IElement currentElement, IElement anotherElement) {
		if (currentElement instanceof PackageElement && anotherElement instanceof PackageElement) {
			PackageElement currentPackageElement = ((PackageElement) currentElement);
			PackageElement anotherPackageElement = ((PackageElement) anotherElement);
			
			if(currentPackageElement.getName().equals(anotherPackageElement.getName()))
				return 1;
				
		//		if(currentPackageElement.getInterfaces().size()==0 && anotherPackageElement.getInterfaces().size()==0)
			//		return 1;
			// au moin une interface similaire
				for(InterfaceElement itf1: currentPackageElement.getInterfaces()){
					itf1.setStrategy(new AverageInterfaceElementStrategy());

				  for(InterfaceElement itf2: anotherPackageElement.getInterfaces()){
					if(itf1.similarity(itf2) == 1){
						return 1;
					}
				  }
			   }
			//}
		}
		
		return 0;
	}

}
