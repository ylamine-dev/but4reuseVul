package org.but4reuse.adapters.softarchitectures.similarity.packageelement;

import java.util.ArrayList;
import java.util.List;

import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.softarchitectures.InterfaceElement;
import org.but4reuse.adapters.softarchitectures.PackageElement;
import org.but4reuse.adapters.softarchitectures.similarity.ISimilarity;

public class OnOffControlPackageElementStrategy implements ISimilarity {

	@Override
	public double similarity(IElement currentElement, IElement anotherElement) {
		
		if(currentElement instanceof PackageElement && anotherElement instanceof PackageElement){
			PackageElement current = (PackageElement)currentElement;
			PackageElement another = (PackageElement)anotherElement;
			
			List<InterfaceElement> lsec = new ArrayList<>(current.getInterfaces());
			List<InterfaceElement> lsea = new ArrayList<>(another.getInterfaces());
			
			int todelete = 0;
			boolean found = false;
			while(!lsec.isEmpty()){
				found = false;
				InterfaceElement search = lsec.remove(0);
				
				for(int i = 0; i < lsea.size(); i++){
					if(search.similarity(lsea.get(i)) == 1){
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
		
		return 0;
	}

}
