package org.but4reuse.adapters.softarchitectures.similarity.interfaceelement;

import java.util.ArrayList;
import java.util.List;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;

public class OnOffControlInterfaceElementStrategy implements ISimilarity {

	@Override
	public double similarity(IElement currentElement, IElement anotherElement) {
		double sum1=0;
		double sum2=0;
		if (currentElement instanceof InterfaceElement && anotherElement instanceof InterfaceElement) {
			InterfaceElement currentInterfaceElement = ((InterfaceElement) currentElement);
			InterfaceElement anotherInterfaceElement = ((InterfaceElement) anotherElement);
	
	       if(currentInterfaceElement.getInterfaceName().equals(anotherInterfaceElement.getInterfaceName())){

             return 1;
	       }
	       else{
		     
		        // comparer la similarite des operation
	    	   //TODO compare input and output params (min, average, onOff strategy)
		    	 if(currentInterfaceElement.getOperations()!=null && anotherInterfaceElement.getOperations()!=null){
			     		
		 			 
		    	 
		    	 List<String> lsec = new ArrayList<>(currentInterfaceElement.getOperations());
					List<String> lsea = new ArrayList<>(anotherInterfaceElement.getOperations());
					
					int todelete = 0;
					boolean found = false;
					while(!lsec.isEmpty()){
						found = false;
						String search = lsec.remove(0);
						for(int i = 0; i < lsea.size(); i++){
							if(search.equals(lsea.get(i))){
								found = true;
								todelete = i;
								break;
							}
						}
						
						if(found){
							lsea.remove(todelete);
						}else{
							return 0;
						}
					}
					
					if(lsec.size() == 0 && lsea.size() == 0){
						return 1;
					}
		    	 }
		    	 
		    
	       }
		}
		return 0;
	}

}
