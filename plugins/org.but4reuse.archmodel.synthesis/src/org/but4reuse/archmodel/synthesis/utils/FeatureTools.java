package org.but4reuse.archmodel.synthesis.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.but4reuse.adaptedmodel.AdaptedModel;
import org.but4reuse.adaptedmodel.Block;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Edge;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;
import org.but4reuse.feature.constraints.BasicExcludesConstraint;
import org.but4reuse.feature.constraints.BasicRequiresConstraint;
import org.but4reuse.feature.constraints.IConstraint;
import org.but4reuse.utils.strings.StringUtils;
import org.eclipse.emf.common.util.EList;
/*
import de.ovgu.featureide.fm.core.ConstraintAttribute;
import de.ovgu.featureide.fm.core.FeatureModelAnalyzer;
import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.impl.Constraint;
import de.ovgu.featureide.fm.core.job.monitor.NullMonitor;

*/


public class FeatureTools {

	
	public static boolean existsExcludeConstraint(List<IConstraint> constraints, Feature f1, Feature f2) {
		for (IConstraint constraint : constraints) {
			if (constraint instanceof BasicExcludesConstraint) {
				BasicExcludesConstraint c = (BasicExcludesConstraint)constraint;
				// check f1 excludes f2 and viceversa
				if (f1.getName().equals(StringUtils.validName(c.getBlock1().getName()))
						&& f2.getName().equals(StringUtils.validName(c.getBlock2().getName()))) {
					return true;
				} else if (f2.getName().equals(StringUtils.validName(c.getBlock1().getName()))
						&& f1.getName().equals(StringUtils.validName(c.getBlock2().getName()))) {
					return true;
				}
			}
		}
		return false;
	}
	public static int getNumberOfReasonsOfRequiresConstraint(List<IConstraint> constraints, Feature f1, Feature f2) {
		for (IConstraint constraint : constraints) {
			if (constraint instanceof BasicRequiresConstraint) {
				BasicRequiresConstraint c = (BasicRequiresConstraint)constraint;
				if (f1.getName().equals(StringUtils.validName(c.getBlock1().getName()))
						&& f2.getName().equals(StringUtils.validName(c.getBlock2().getName()))) {
					return constraint.getNumberOfReasons();
				}
			}
		}
		return -1;
	}

	public static boolean existsRequiresConstraint(List<IConstraint> constraints, Feature f1, Feature f2) {
		for (IConstraint constraint : constraints) {
			if (constraint instanceof BasicRequiresConstraint) {
				BasicRequiresConstraint c = (BasicRequiresConstraint)constraint;
				if (f1.getName().equals(StringUtils.validName(c.getBlock1().getName()))
						&& f2.getName().equals(StringUtils.validName(c.getBlock2().getName()))) {
					return true;
				}
			}
		}
		return false;
	}

	public static void setChildren(ProductlineadlFactory factory, Feature parentFeature,
			LinkedList<Feature> features) {
		for (Feature childFeature : features) {
			 Edge outEdge = factory.createComposition();
			 parentFeature.getOutgoingEdge().add(outEdge);
			 outEdge.setParent(parentFeature);
		     outEdge.setChild(childFeature);
		}
		
	}

	public static List<Feature> getFeatureRequiredFeatures(EList<Feature> features,
			List<IConstraint> constraints, Feature f1) {
		List<Feature> required = new ArrayList<Feature>();
		for (IConstraint constraint : constraints) {
			if (constraint instanceof BasicRequiresConstraint) {
				BasicRequiresConstraint c = (BasicRequiresConstraint)constraint;
				if (f1.getName().equals(StringUtils.validName(c.getBlock1().getName()))) {
					
					required.add(getFeatureForBlock(features,StringUtils.validName(c.getBlock2().getName())));
				}
			}
		}
		return required;
	}
	
	public static Feature getFeatureForBlock(EList<Feature> features,  String blockName) {

        for (Feature feature : features) {
			if(feature.getName().equals(blockName)){
				return feature;
			}
		}
		return null;
	}
	
	
	// For example 3 requires 2 (3 is child of 2). Then 2 requires 1. isAncestor
		// 1 of 3 is true.
		public static boolean isAncestorFeature1ofFeature2(EList<Feature> features, List<IConstraint> constraints, Feature f1,
				Feature f2,List<Feature> featureTrace) {
		/*	List<Feature> directRequired = getFeatureRequiredFeatures(features, constraints, f2);
			if (directRequired.contains(f1)) {
				return true;
			}
			for (Feature direct : directRequired) {
				if (isAncestorFeature1ofFeature2(features, constraints, f1, direct)) {
					return true;
				}
			}
			*/
			List<Feature> directRequired = getFeatureRequiredFeatures(features, constraints, f2);
			if (directRequired.contains(f1)) {
				return true;
			}
			for (Feature direct : directRequired) {
				if(!featureTrace.contains(direct)){
					featureTrace.add(direct);
					System.out.println(f1.getName() +" isAncestor of---- "+direct.getName()+" ?");
					if (isAncestorFeature1ofFeature2(features, constraints, f1, direct,featureTrace)) {
						System.out.println("true");
						return true;
					}
					featureTrace.remove(direct);
				}
				else{
					System.err.println(f1.getName() +" isAncestor of "+f2.getName()+" ?");
					System.err.println("cycle in "+direct.getName());
				}
			}
			
			return false;
		}
			/**
		 * Remove redundant constraints
		 * @param saplArchitecture 
		 * 
		 * @param fm
		 */
/*		public static void removeRedundantConstraints(IFeatureModel fm, SoftwareProductLineArchitecture saplArchitecture) {
			
			
			
				// Remove redundant constraints

			FeatureModelAnalyzer analyzer = fm.getAnalyser();
			analyzer.calculateRedundantConstraints = true;
			analyzer.calculateTautologyConstraints = false;
			analyzer.calculateDeadConstraints = false;
			analyzer.calculateFOConstraints = false;
			HashMap<Object, Object> o = analyzer.analyzeFeatureModel(new NullMonitor());
			for (Entry<Object, Object> entry : o.entrySet()) {
				if (entry.getKey() instanceof Constraint) {
					if (entry.getValue() instanceof ConstraintAttribute) {
						if ((ConstraintAttribute) entry.getValue() == ConstraintAttribute.REDUNDANT) {
							fm.removeConstraint((Constraint) entry.getKey());
						}
					}
				}
			}
			
			
			
			Iterator<org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint> iterator = saplArchitecture.getConstraints().iterator();
			while (iterator.hasNext()) {
				org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Constraint constraint = iterator.next(); 
			
				boolean exit =false;
				for (de.ovgu.featureide.fm.core.base.IConstraint fmConstraint : fm.getConstraints()) {
					if(fmConstraint instanceof BasicRequiresConstraint){
						BasicRequiresConstraint requireConstraint = (BasicRequiresConstraint)  fmConstraint;
						Block block1 = requireConstraint.getBlock1();
						Block block2 = requireConstraint.getBlock2();
						Feature feature1 =getFeatureForBlock(saplArchitecture.getFeatures(),block1.getName());
						Feature feature2 =getFeatureForBlock(saplArchitecture.getFeatures(), block2.getName());
					
						if(constraint.getSource().getName().equals(feature1.getName()) && constraint.getTarget().getName().equals(feature2.getName()) ){
							if(constraint.getText().equals(requireConstraint.getText())){

								exit =true;
							}
						}
					}
					
					
					
					if(constraint instanceof BasicExcludesConstraint ){
						
						BasicExcludesConstraint excludeConstraint = (BasicExcludesConstraint)  constraint;
						
						Block block1 = excludeConstraint.getBlock1();
						Block block2 = excludeConstraint.getBlock2();
						Feature feature1 =getFeatureForBlock(saplArchitecture.getFeatures(),block1.getName());
						Feature feature2 =getFeatureForBlock(saplArchitecture.getFeatures(), block2.getName());
					
						if(constraint.getSource().getName().equals(feature1.getName()) && constraint.getTarget().getName().equals(feature2.getName()) ){
							if(constraint.getText().equals(excludeConstraint.getText())){
								exit =true;
							}
						}
					}
				}
				if(!exit){
					saplArchitecture.getConstraints().remove(constraint);
				}
				
			}
			
			
		}
	*/
		
		

		/**
		 * Auxiliary classes
		 */
/*		public class AltGroup {
			LinkedList<IFeature> features = new LinkedList<IFeature>();
			int id;
			IFeature altRoot;
		}

		public class AltGroupList {
			List<AltGroup> altGroups = new ArrayList<AltGroup>();

			public AltGroup getAltGroupOfFeature(IFeature feature) {
				for (AltGroup altGroup : altGroups) {
					if (altGroup.features.contains(feature)) {
						return altGroup;
					}
				}
				return null;
			}

			public void addAltGroup(IFeature... features) {
				AltGroup altGroup = new AltGroup();
				// Automatically set the id
				altGroup.id = altGroups.size() + 1;
				for (IFeature feature : features) {
					altGroup.features.add(feature);
				}
				altGroups.add(altGroup);
			}
		}
		
		*/
	
		
		

}
