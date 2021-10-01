package org.but4reuse.adapters.softarchitectures.similarity.packageelement;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.softarchitectures.PackageElement;
import org.but4reuse.adapters.softarchitectures.ServiceElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;
import org.but4reuse.adapters.softarchitectures.similarity.interfaceelement.AverageInterfaceElementStrategy;
import org.but4reuse.adapters.softarchitectures.similarity.interfaceelement.OnOffControlInterfaceElementStrategy;

public class AveragePackageElementStrategy implements ISimilarity {

	@Override
	public double similarity(IElement currentElement, IElement anotherElement) {
		
		double sum1=0;
	//	double sum2=0;

		//similarity relies on the offered services & needed services
		if (currentElement instanceof PackageElement && anotherElement instanceof PackageElement) {
			PackageElement currentPackageElement = ((PackageElement) currentElement);
			PackageElement anotherPackageElement = ((PackageElement) anotherElement);
			
			if(currentPackageElement.getName().equals(anotherPackageElement.getName())){
				
				if(currentPackageElement.getInterfaces().size()==0 && anotherPackageElement.getInterfaces().size()==0 ){  
					return 1;
				}
			      
				
				for(InterfaceElement serv : currentPackageElement.getInterfaces()){
				    serv.setStrategy(new AverageInterfaceElementStrategy());
				    for(InterfaceElement serv2 : anotherPackageElement.getInterfaces()){
					sum1 += serv.similarity(serv2);
					
				    }
				}
			
   /*         for(InterfaceElement serv : anotherPackageElement.getInterfaces()){
				
				for(InterfaceElement serv2 : currentPackageElement.getInterfaces()){
					sum2 += serv.similarity(serv2);
					
				}
			}
	*/		
		//	if(sum1==0 && sum2 ==0)
		//		return 0;
			
			if(sum1==0 )
				return 0;
			double average1 = sum1/(currentPackageElement.getInterfaces().size());
		//	double average2 = sum2/(anotherPackageElement.getInterfaces().size());

			return average1;
			}
			
		//	return average1+average2/2;
		}
		return 0;
	}

}
