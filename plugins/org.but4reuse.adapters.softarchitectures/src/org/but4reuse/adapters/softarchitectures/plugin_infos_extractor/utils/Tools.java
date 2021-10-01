package org.but4reuse.adapters.softarchitectures.plugin_infos_extractor.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.but4reuse.adaptedmodel.Block;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;
import org.but4reuse.feature.constraints.BasicExcludesConstraint;
import org.but4reuse.feature.constraints.BasicRequiresConstraint;
import org.eclipse.emf.common.util.EList;

import de.ovgu.featureide.fm.core.ConstraintAttribute;
import de.ovgu.featureide.fm.core.FeatureModelAnalyzer;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.impl.Constraint;
import de.ovgu.featureide.fm.core.job.monitor.NullMonitor;

public class Tools {
	/**
	 * Remove redundant constraints
	 * @param saplArchitecture 
	 * 
	 * @param fm
	 */
	public static void removeRedundantConstraints(IFeatureModel fm, SoftwareProductLineArchitecture saplArchitecture) {
		
		
		Iterator<org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint> iterator = saplArchitecture.getConstraints().iterator();
		while (iterator.hasNext()) {
			org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint constraint = iterator.next(); 
	
			boolean keep=false;
			 for (de.ovgu.featureide.fm.core.base.IConstraint fmConstraint : fm.getConstraints()) {
				 
				 System.out.println(fmConstraint.getClass()); 
					Constraint requireConstraint = (Constraint)  fmConstraint;
					 System.out.println(requireConstraint.getDisplayName()); 
					 System.out.println(constraint.getSource().getName()+"  =>  "+constraint.getTarget().getName());

					if(requireConstraint.getDisplayName().equals(constraint.getSource().getName()+"  =>  "+constraint.getTarget().getName())){
							keep =true;
					}
			}
		if(!keep){
			iterator.remove();
		}
	}
			
		
		
	}


	public static void main(String[] args) {
		Path path = Paths.get("F:\\results\\modeling2019_arandom_100_extension\\metrics\\default_metrics.txt");
		try {
			List<String> lines = Files.readAllLines(path);
			for (String string : lines) {
			//	System.out.println(string);
				String s = string.substring(string.indexOf("=")+1);
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	


	public static Feature getFeatureForBlock(EList<Feature> features,  String blockName) {

        for (Feature feature : features) {
			if(feature.getName().equals(blockName)){
				return feature;
			}
		}
		return null;
	}


}
