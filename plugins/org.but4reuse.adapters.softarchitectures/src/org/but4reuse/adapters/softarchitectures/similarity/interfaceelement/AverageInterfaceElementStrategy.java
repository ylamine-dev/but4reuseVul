package org.but4reuse.adapters.softarchitectures.similarity.interfaceelement;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;

public class AverageInterfaceElementStrategy implements ISimilarity {

	@Override
	public double similarity(IElement currentElement, IElement anotherElement) {
		
		double sum1=0;
		if (currentElement instanceof InterfaceElement && anotherElement instanceof InterfaceElement) {
			InterfaceElement currentInterfaceElement = ((InterfaceElement) currentElement);
			InterfaceElement anotherInterfaceElement = ((InterfaceElement) anotherElement);
	
	       if(currentInterfaceElement.getInterfaceName().equals((anotherInterfaceElement.getInterfaceName()))){
	    		
	    	   return 1;
	       }
	       else
	       {
			// TODO see the average of operations
		   
		   
		       if(currentInterfaceElement.getOperations()!=null && anotherInterfaceElement.getOperations()!=null){
		     		
			      for(String op: currentInterfaceElement.getOperations()){
				    for(String ope: anotherInterfaceElement.getOperations()){
					  if(op.equals(ope)){
						sum1 ++;
					  }
				    }
			      }  
			  
		
			      if(sum1==0)
						return 0;
				double average1 = sum1/(currentInterfaceElement.getOperations().size());
				return average1;
		       }
	       }
		   
		}
		return 0;
	}

}
