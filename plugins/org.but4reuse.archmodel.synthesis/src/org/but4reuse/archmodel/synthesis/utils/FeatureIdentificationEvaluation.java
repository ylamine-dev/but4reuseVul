package org.but4reuse.archmodel.synthesis.utils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.but4reuse.adaptedmodel.AdaptedArtefact;
import org.but4reuse.adaptedmodel.AdaptedModel;
import org.but4reuse.adaptedmodel.Block;
import org.but4reuse.adaptedmodel.BlockElement;
import org.but4reuse.adaptedmodel.helpers.AdaptedModelHelper;
import org.but4reuse.adaptedmodel.manager.AdaptedModelManager;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.*;
import org.but4reuse.artefactmodel.Artefact;
import org.but4reuse.featurelist.FeatureList;
import org.but4reuse.utils.files.FileUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/** 
 * evaluate precsion and recall of the block identification step
 * @author kerdoudi
 *
 */
public class FeatureIdentificationEvaluation {
//	private ResourceSetImpl resourceSet;

	
	private double recall =0;
	private double recallWithoutSources =0;
    private double precision =0;
    private double truePositives = 0;
    private double falsePositives = 0;
    private double falseNegatives = 0;
    private double falseNegativesWithoutSources = 0;

    private Vector<String> totalNbrOfPluginsInEclispeFeatures = new Vector<String>();
    private double totalNbrOfPluginsfeaturesofInputVars = 0;
    private double  totalNbrOfPluginsInEFwithsources = 0;
    Vector<String> listOffalseNegatives2 = new Vector<String>();

    public FeatureIdentificationEvaluation() {
    	
	}
	
             /***
               * 
               * @param but4reuseFeature  : generated block architecture file
               * @param eclipseFeatures : feature files in the eclipse folder : 'features'
               */
              public  void calculateRecallAndPrecision(File but4reuseFeature, File[] eclipseFeatureFiles){
			
            	  ArchitectureTools archTool = new ArchitectureTools();
            	  CompositeElement emfBut4reuseModel =  archTool.loadFeatureArchitecture(but4reuseFeature);
            	
            	  
            
						ArrayList<File> allXmlFeatureFiles = getAllXMLFiles(eclipseFeatureFiles);
					
						
						
            	  
						// truePositives : number of plugins that are present in but4reuseFeature and in eclipseFeature
						 truePositives = getTruePositives(emfBut4reuseModel,allXmlFeatureFiles);
						System.out.println("truePositives "+truePositives); 
						// falsePositives : number of plugins in but4reuseFeature, but they are not present in eclipseFeature
						 falsePositives = getFalsePositives(emfBut4reuseModel,allXmlFeatureFiles);
						System.out.println("falsePositives "+falsePositives); 

						// 	falseNegatives number of plugins in eclipseFeature , but they are not present in but4reuseFeature 
						 falseNegatives = getFalseNegatives(emfBut4reuseModel,allXmlFeatureFiles);
						System.out.println("falseNegatives "+falseNegatives); 

						if((truePositives+falsePositives)>0){
						 precision = truePositives / (truePositives+falsePositives);
						}
						if((truePositives+falseNegatives)>0){
						 recall = truePositives / (truePositives+falseNegatives);
						}
						
						if((truePositives+falseNegativesWithoutSources)>0){
							 recallWithoutSources = truePositives / (truePositives+falseNegativesWithoutSources);
						}
						
					//	System.out.println("====>"+emfBut4reuseModel.getName());
						System.out.println("Precision = "+ precision);
            	  
						System.out.println("Recall = "+ recall);
						System.out.println("recall Without Sources = "+ recallWithoutSources);

            	  
              }
              
            
    
              
			public List<File> getCommonEclipseFeatures(File distributions){
            	  
            	  List<File> featureDirectories = new ArrayList<File>();
            	  
            	  
     		      File[] allDistributions = distributions.listFiles();
            	  File currentDistribution  = allDistributions[0];

            		  if (currentDistribution.exists() && currentDistribution.isDirectory()){
		                  File currentFeatures = new File(currentDistribution.getAbsolutePath()+"/eclipse/features");
		                  if(!currentFeatures.exists()){
		                	   currentFeatures = new File(currentDistribution.getAbsolutePath()+"/features");
		                  }
		                  if(currentFeatures.exists()){
         		    		for (File featurei : currentFeatures.listFiles()) {
         		    			int count =0;

         		    			for (int i=0; i< allDistributions.length; i++){

         		    				File otherDistribution = allDistributions[i];

         	         		    	if (otherDistribution.isDirectory() ){
         	 		                  File othersFeatures = new File(otherDistribution.getAbsolutePath()+"/eclipse/features");

         	         		    		for (File featurej : othersFeatures.listFiles()) {

         	         		    	//		String  n1 = 	featurei.getName().substring(0, featurei.getName().indexOf("_"));
         	         		    		//	String  n2 = 	featurej.getName().substring(0, featurej.getName().indexOf("_"));
         	         		    		//	if(n1.equals(n2)){
             	         		    			if(featurei.getName().equals(featurej.getName()) ){

         	         		    				count++;
         	         		    				break;
         	         		    			}
         	         		    		}
         	         		    	}
         		    			}
         		    			if(count == allDistributions.length){
         		    				featureDirectories.add(featurei);
         		    			}
         		    		}
		                  }
            		  }
            		  
            	 	  
            	 
         		     
         		
				return featureDirectories ;
            	  
              }
              
                 public List<File> getCommonEclipseFeatures(File[] distributions, List<File> oldCommonFeatures){
            	  
            	  List<File> featureDirectories = new ArrayList<File>();
            	  
            	  
            	  File currentDistribution  = distributions[0];

            		  if (currentDistribution.exists() && currentDistribution.isDirectory()){
		                  File currentFeatures = new File(currentDistribution.getAbsolutePath()+"/eclipse/features");
		                  if(!currentFeatures.exists()){
		                	   currentFeatures = new File(currentDistribution.getAbsolutePath()+"/features");
		                  }
		                  if(currentFeatures.exists()){
         		    		for (File featurei : currentFeatures.listFiles()) {
         		    			int count =0;

         		    			for (int i=0; i< distributions.length; i++){

         		    				File otherDistribution = distributions[i];

         	         		    	if (otherDistribution.isDirectory() ){
         	 		                  File othersFeatures = new File(otherDistribution.getAbsolutePath()+"/eclipse/features");

         	         		    		for (File featurej : othersFeatures.listFiles()) {

         	         		    	//		String  n1 = 	featurei.getName().substring(0, featurei.getName().indexOf("_"));
         	         		    		//	String  n2 = 	featurej.getName().substring(0, featurej.getName().indexOf("_"));
         	         		    		//	if(n1.equals(n2)){
             	         		    			if(featurei.getName().equals(featurej.getName()) ){
                                                   
         	         		    				  count++;
         	         		    				  break;
         	         		    			    }
         	         		    		}
         	         		    	}
         		    			}
         		    			if(count == distributions.length){
         		    				if(!oldCommonFeatures.contains(featurei)){
         		    				   featureDirectories.add(featurei);
         		    				}
         		    			}
         		    		}
		                  }
            		  }
            		  
            	 	  
            	 
         		     
         		
				return featureDirectories ;
            	  
              }
                 
                 
                 /***
                  * get features (eclipse features folders) that are common only between the distributions in params
                  * @param distributions
                  * @param oldCommonFeatures
                  * @param remainingDistributions
                  * @return
                  */
                 public List<File> getCommonEclipseFeatures(File[] distributions, List<File> oldCommonFeatures, Vector<File> remainingDistributions){
               	  
               	  List<File> featureDirectories = new ArrayList<File>();
               	  
               	  
               	  File currentDistribution  = distributions[0];

               		  if (currentDistribution.exists() && currentDistribution.isDirectory()){
   		               File currentFeatures = new File(currentDistribution.getAbsolutePath()+"/eclipse/features");
		                  if(!currentFeatures.exists()){
		                	   currentFeatures = new File(currentDistribution.getAbsolutePath()+"/features");
		                  }
		                  if(currentFeatures!= null && currentFeatures.exists()){
            		    		for (File featurei : currentFeatures.listFiles()) {
            		    			int count =0;

            		    			for (int i=0; i< distributions.length; i++){

            		    				File otherDistribution = distributions[i];

            	         		    	if (otherDistribution.isDirectory() ){
            	 		                  File othersFeatures = new File(otherDistribution.getAbsolutePath()+"/eclipse/features");
            	 		                 if(!othersFeatures.exists()){
            	 		                	othersFeatures = new File(otherDistribution.getAbsolutePath()+"/features");
            			                  }
            	 		                 if(othersFeatures!=null && othersFeatures.exists()){
            	         		    		for (File featurej : othersFeatures.listFiles()) {

            	         		    	//		String  n1 = 	featurei.getName().substring(0, featurei.getName().indexOf("_"));
            	         		    		//	String  n2 = 	featurej.getName().substring(0, featurej.getName().indexOf("_"));
            	         		    		//	if(n1.equals(n2)){
                	         		    			if(featurei.getName().equals(featurej.getName()) ){
                                                      
        	            	 		                   
     	         		    				               count++;
     	         		    				               break;
         	         		    				        
                	         		    			}
            	         		    		}
            	 		                 }
            	         		    	}
            		    			}
            		    			if(count == distributions.length){
            		    				if(!oldCommonFeatures.contains(featurei)){
            		    					
            		    					 boolean existInOtherDistribution =false;

     	         		    				for (File remainingDistribution : remainingDistributions) {
													
												
     	            		    				//	System.out.println(remainingDistribution.getAbsolutePath());
     	            	         		    	if (remainingDistribution.isDirectory() ){
     	            	 		                  File remainingFeatures = new File(remainingDistribution.getAbsolutePath()+"/eclipse/features");
     	            	 		                if(!remainingFeatures.exists()){
     	            	 		                	remainingFeatures = new File(remainingDistribution.getAbsolutePath()+"/features");
     	            			                }
     	            	 		                 if(remainingFeatures!=null && remainingFeatures.exists()){
     	            	         		    		for (File featurek : remainingFeatures.listFiles()) {

                     	         		    			if(featurei.getName().equals(featurek.getName()) ){
                                                              existInOtherDistribution =true; 
                                                              break;
                     	         		    			}
     	            	 		                  
     	            	         		    		}
     	            	 		                 }
     	         		    				        
 	         		    			            }
     	         		    				}
            		    					
    	         		    				if(!existInOtherDistribution){
            		    				       featureDirectories.add(featurei);
    	         		    				}
            		    				}
            		    			}
            		    		}
		                  }
               		  }
               		  
               	 	  
               	 
            		     
            		
   				return featureDirectories ;
               	  
                 }
              /***
               * 
               * @param distributions
               * @return
               */
              public List<File> getCommonEclipseFeatures(File distributions, String[] eclipseVariantNames){
            	  
            	  List<File> featureDirectories = new ArrayList<File>();
            	  
            	  
     		      File[] allDistributions = distributions.listFiles();
            	  File currentDistribution  = allDistributions[0];

            		  if (currentDistribution.exists() && currentDistribution.isDirectory()){
		                  File currentFeatures = new File(currentDistribution.getAbsolutePath()+"/eclipse/features");
		                  if(!currentFeatures.exists()){
		                	   currentFeatures = new File(currentDistribution.getAbsolutePath()+"/features");
		                  }
		                  if(currentFeatures.exists()){
         		    		for (File featurei : currentFeatures.listFiles()) {
         		    			int count =1;

         		    			for (int i=1; i< allDistributions.length; i++){

         		    				File otherDistribution = allDistributions[i];

         	         		    	if (otherDistribution.isDirectory() ){
         	 		                  File othersFeatures = new File(otherDistribution.getAbsolutePath()+"/eclipse/features");

         	         		    		for (File featurej : othersFeatures.listFiles()) {

         	         		    	//		String  n1 = 	featurei.getName().substring(0, featurei.getName().indexOf("_"));
         	         		    		//	String  n2 = 	featurej.getName().substring(0, featurej.getName().indexOf("_"));
         	         		    		//	if(n1.equals(n2)){
             	         		    			if(featurei.getName().equals(featurej.getName()) ){

         	         		    				count++;
         	         		    				break;
         	         		    			}
         	         		    		}
         	         		    	}
         		    			}
         		    			if(count == allDistributions.length/2){
         		    				featureDirectories.add(featurei);
         		    			}
         		    		}
		                  }
            		  }
            		  
            	 	  
            	 
         		     
         		
				return featureDirectories ;
            	  
              }
              
              /**
         	    * True Positives : : number of plugins that are present in but4reuseFeature and in eclipseFeature
         	    * @param emfBut4reuseModel
         	    * @param eclipseFeatureXmlDoc
         	    * @return
         	    */
   			private double getTruePositives(CompositeElement emfBut4reuseModel,ArrayList<File>  allXmlFeatureFiles) {
   				double truePositives = 0;
   				
   				
   			
   				
   				for (ComponentElement componentElement : emfBut4reuseModel.getComponents()) {
					PluginElement pluginEle = (PluginElement) componentElement;
					
					
					boolean found =false;
					 for (File eclipseFeature : allXmlFeatureFiles) {
						
					
					  Document eclipseFeatureXmlDoc =null;
		        	  
			         	 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			  	         DocumentBuilder dBuilder;
			  		    	try {
			  				dBuilder = dbFactory.newDocumentBuilder();
			         	   eclipseFeatureXmlDoc =  dBuilder.parse(eclipseFeature);
								eclipseFeatureXmlDoc.getDocumentElement().normalize();
			  		    	 } catch (Exception e) {
			  			         e.printStackTrace();
			  			      }
			  		    	if(eclipseFeatureXmlDoc!=null &&  eclipseFeatureXmlDoc.getDocumentElement().getNodeName().equals("feature")){
			        	 
			  		    		NodeList nList = eclipseFeatureXmlDoc.getElementsByTagName("plugin");
			  		    		if(nList!= null){
			  		    			for (int temp = 0; temp < nList.getLength(); temp++) {
				     	            Node nNode = nList.item(temp);
				     	    //       System.out.println("\nCurrent Feature :" + nNode.getNodeName());

				     	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				     	        	   Element eElement = (Element) nNode;	
			                           String pluginName = eElement.getAttribute("id");
			                           String pluginVesrion = eElement.getAttribute("version");
			                           
			                          // if(pluginName.equals(pluginEle.getPluginSymbName())){
			           				    if(pluginEle.getPluginSymbName().equals(pluginName) ){//|| pluginEle.getPluginSymbName().equals(pluginName+"_64") ){
	   
				                           //TODO compare versions
			           				       found = true;
			                        	   truePositives++;
			                        	   break;
			                           }
				     	            }
			  		    			}
			  		    		}
			  		    	}
			        
			            if(found){
			            	break;
			            	
			            }
					 }
					
   			
			     }
   				return truePositives;
   			}
              
              
 
              private ArrayList<File>  getAllXMLFiles(File[] files) {

            	  ArrayList<File>  list = new ArrayList<File>(); 
            	 for (File file : files) {
				     if(file.isDirectory()){
				    	 list.addAll(getAllXMLFiles(file.listFiles()));
				     }
				     else{
				    	 if(file.getName().endsWith(".xml")){
				    		 list.add(file);
				    	 }
				     }
				 }
				return list;
			}



			/**
               *      False Positives : number of plugins in but4reuseFeature, but they are not present in eclipseFeature

               * @param emfBut4reuseModel
               * @param eclipseFeatureXmlDoc
               * @return
               */
			private double getFalsePositives(CompositeElement emfBut4reuseModel, ArrayList<File> allXmlFeatureFiles) {
				double falsePositives = 0;

				
				for (ComponentElement componentElement : emfBut4reuseModel.getComponents()) {
					PluginElement pluginEle = (PluginElement) componentElement;
					boolean found =false;
					
					
					 for (File eclipseFeature : allXmlFeatureFiles) {
						  Document eclipseFeatureXmlDoc =null;
				         	 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				  	         DocumentBuilder dBuilder;
				  		    	try {
				  		    		dBuilder = dbFactory.newDocumentBuilder();
				  		    		eclipseFeatureXmlDoc =  dBuilder.parse(eclipseFeature);
									eclipseFeatureXmlDoc.getDocumentElement().normalize();
				  		    	 } catch (Exception e) {
				  			         e.printStackTrace();
				  		    	 }
					
				  		    	if(eclipseFeatureXmlDoc!=null &&  eclipseFeatureXmlDoc.getDocumentElement().getNodeName().equals("feature")){
			        	 
				  		    		NodeList nList = eclipseFeatureXmlDoc.getElementsByTagName("plugin");
				  		    			if(nList!= null){
				  		    				for (int temp = 0; temp < nList.getLength(); temp++) {
				  		    					Node nNode = nList.item(temp);
				  		    					//       System.out.println("\nCurrent Feature :" + nNode.getNodeName());

				  		    					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				  		    						Element eElement = (Element) nNode;	
				  		    						String pluginName = eElement.getAttribute("id");
				  		    						String pluginVesrion = eElement.getAttribute("version");
			                           
				  		    						if(pluginEle.getPluginSymbName().equals(pluginName)){// || pluginEle.getPluginSymbName().equals(pluginName+"_64") ){
				  		    							//TODO compare versions

				  		    							found =true;
				  		    							break;
				  		    						}
				  		    					}
				  		    				}
				  		    			}
				  		    	}
				  		    	
				  		    	if(found){
				  		    		break;
				  		    	}
					 }
			         
					 if(!found){
			        	 falsePositives++;
			         }
			     }
				return falsePositives;
			}

			/**
             * FalseNegatives :  number of plugins in eclipseFeature , but they are not present in but4reuseFeature 
             * @param emfBut4reuseModel
             * @param eclipseFeatureXmlDoc
             * @return
             */
            private double getFalseNegatives(CompositeElement emfBut4reuseModel, ArrayList<File> allXmlFeatureFiles) {


            	double falseNegatives = 0;
            	falseNegativesWithoutSources = 0;

            	 for (File eclipseFeature : allXmlFeatureFiles) {
   							
   						
   						  Document eclipseFeatureXmlDoc =null;
   			        	  
   				         	 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
   				  	         DocumentBuilder dBuilder;
   				  		    	try {
   				  				dBuilder = dbFactory.newDocumentBuilder();
   				         	   eclipseFeatureXmlDoc =  dBuilder.parse(eclipseFeature);
   									eclipseFeatureXmlDoc.getDocumentElement().normalize();
   				  		    	 } catch (Exception e) {
   				  			         e.printStackTrace();
   				  			      }
            	
   			       if(eclipseFeatureXmlDoc!=null &&  eclipseFeatureXmlDoc.getDocumentElement().getNodeName().equals("feature")){
			        	 
			        	 NodeList nList = eclipseFeatureXmlDoc.getElementsByTagName("plugin");
			        	 if(nList!= null){
			        		 for (int temp = 0; temp < nList.getLength(); temp++) {
			 					boolean found =false;

				     	            Node nNode = nList.item(temp);
				     	    //       System.out.println("\nCurrent Feature :" + nNode.getNodeName());

				     	           if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				     	        	   Element eElement = (Element) nNode;	
			                           String pluginName = eElement.getAttribute("id");
			                           String pluginVesrion = eElement.getAttribute("version");
			                  
			                           
				                       	 for (ComponentElement componentElement : emfBut4reuseModel.getComponents()) {
				        					PluginElement pluginEle = (PluginElement) componentElement;
				                           
				           						if(pluginEle.getPluginSymbName().equals(pluginName) ){//|| pluginEle.getPluginSymbName().equals(pluginName+"_64") ){
				           							//TODO compare versions
				           							found =true;
				           							
				           							
				           						}
				                          }
					     	              
					     	           
							     	          if(!found){
				           				//			System.out.println("FN : "+pluginName);
			
							     	        	 falseNegatives++;
							     	        	 if(!pluginName.endsWith(".source")) { 
							     	        	   falseNegativesWithoutSources++;
							     	        	 }
										      }
			                        
			                        }
			        		 }
			         
			        	 }
			        
   				  }
            	 }
    				return falseNegatives;
			}
            public double getRecall() {
				return recall;
			}

			public double getRecallWithoutSources() {
				return recallWithoutSources;
			}

			public double getPrecision() {
				return precision;
			}

			public double getTruePositives() {
				return truePositives;
			}

			public double getFalsePositives() {
				return falsePositives;
			}

			public double getFalseNegatives() {
				return falseNegatives;
			}
			
			
	          public double getFalseNegativesWithoutSources() {
				return falseNegativesWithoutSources;
			}

			/***
             * 
             * @param but4reuseFeature  : generated block architecture file
             * @param eclipseFeatures : feature files in the eclipse folder : 'features'
             */
            public  void isSAPLcontainsAllInputFeatures(File recoveredSAPLPath, File inputVariantsPath){
        	
            	 double totalrecall =0;
            	 double totalrecall2 =0;
                 double totalprecision =0;
                 double totaltruePositives = 0;
                 double totalfalsePositives = 0;
                 double totalfalseNegatives = 0;
                 double totalfalseNegatives2 = 0;

            	ArchitectureTools a = new ArchitectureTools();
	          	SoftwareProductLineArchitecture p = a.loadSAPLArchitecture(recoveredSAPLPath);
	
	          	ArrayList<File> allFeaturesInInputVariants = getallFeaturesInInputVars(inputVariantsPath, 12);
	          	File[] allFeaturesInInputVariantsArray = new File[allFeaturesInInputVariants.size()];
				 int j=0;
			//	 System.out.println("common features : ");
				 for (File file : allFeaturesInInputVariants) {
		//			 System.out.println(file.getName());
					 allFeaturesInInputVariantsArray[j++] = file;
				 }
				 
	      		
						ArrayList<File> allXmlFeatureFilesInVariants = getAllXMLFiles(allFeaturesInInputVariantsArray);

						
						System.out.println("Blocks in SAPL size "+p.getFeatures().size());
			          	System.out.println("feature xml files recovered");
			      		System.out.println("Features xml files in input variants size "+allXmlFeatureFilesInVariants.size());
			      		
//			      	 	falseNegatives number of plugins in eclipseFeature , but they are not present in but4reuseFeature 
 						totalfalseNegatives2 = getTotalFalseNegatives2(p.getFeatures(),allXmlFeatureFilesInVariants);
 						System.out.println("total false Negatives "+totalfalseNegatives2); 	
			      		
	      		for (Feature feature : p.getFeatures()) {
	      			if(feature.getModel()!= null){
	      				if(feature.getModel().size() > 0 ){
	      					
	      					CompositeElement compo = feature.getModel().get(0);
	      					if(compo != null){
	      					   compo.getComponents();
	      					   System.out.println("");
	      					   System.out.println("------> plugins for block :" +feature.getName() +" "+ compo.getComponents().size());
	      					   System.out.println("");
	      						// truePositives : number of plugins that are present in but4reuseFeature and in eclipseFeature
	  						 truePositives = getTruePositives2(compo,allXmlFeatureFilesInVariants);
	  						System.out.println("truePositives "+truePositives); 
	  						// falsePositives : number of plugins in but4reuseFeature, but they are not present in eclipseFeature
	  						 falsePositives = getFalsePositives2(compo,allXmlFeatureFilesInVariants);
	  						System.out.println("falsePositives "+falsePositives); 
	
	  						falseNegatives = getFalseNegatives2(compo,allXmlFeatureFilesInVariants);
	 						System.out.println("false Negatives "+falseNegatives); 
	
	  						if((truePositives+falsePositives)>0){
	  						 precision = truePositives / (truePositives+falsePositives);
	  						}
	  						if((truePositives+falseNegatives)>0){
	  						 recall = truePositives / (truePositives+falseNegatives);
	  						}
	  					//	System.out.println("====>"+emfBut4reuseModel.getName());
	  						System.out.println("Precision = "+ precision);
	  						System.out.println("Recall = "+ recall);
	  						
	      					   
	  						totaltruePositives =totaltruePositives +falseNegatives;
	  						totalfalsePositives = totalfalsePositives+ falsePositives;
	  						totalfalseNegatives= totalfalseNegatives + falseNegatives;
	  						
	      					}
	      				}
	      			}
	      		}
	      		
	      		
	      				if((totaltruePositives+totalfalsePositives)>0){
	      					totalprecision = totaltruePositives / (totaltruePositives+totalfalsePositives);
						}
						if((totaltruePositives+totalfalseNegatives)>0){
							totalrecall = totaltruePositives / (totaltruePositives+totalfalseNegatives);
						}
						
						if((totaltruePositives+totalfalseNegatives2)>0){
							totalrecall2 = totaltruePositives / (totaltruePositives+totalfalseNegatives2);
						}
					//	System.out.println("====>"+emfBut4reuseModel.getName());
						
						System.out.println("totaltruePositives "+totaltruePositives);
						System.out.println("totalfalsePositives "+ totalfalsePositives);
						System.out.println("totalfalseNegatives "+totalfalseNegatives);
						System.out.println("totalfalseNegatives2 "+totalfalseNegatives2);

						System.out.println("total Precision = "+ totalprecision);
						System.out.println("total Recall = "+ totalrecall);
						
						System.out.println("total Recall2 correct = "+ totalrecall2);

            }
            
          

	          /***
           * 
           * @param recoveredSAPLPath
           * @param eclipseFeatures : feature files in the eclipse folder : 'features'
           */
          public  void isSAPLcontainsAllInFeatures(File recoveredSAPLPath, File inputVariantsPath, int nbrVariants){
      	
						double totalfalseNegatives = 0;

						ArchitectureTools a = new ArchitectureTools();
						SoftwareProductLineArchitecture p = a.loadSAPLArchitecture(recoveredSAPLPath);
				
						ArrayList<File> allFeaturesInInputVariants = getallFeaturesInInputVars(inputVariantsPath, nbrVariants);
						File[] allFeaturesInInputVariantsArray = new File[allFeaturesInInputVariants.size()];
						int j = 0;
						for (File file : allFeaturesInInputVariants) {
							allFeaturesInInputVariantsArray[j++] = file;
						}
						ArrayList<File> allXmlFeatureFilesInVariants = getAllXMLFiles(allFeaturesInInputVariantsArray);
						
						System.out.println("Total number of Blocks in SAPL "+p.getFeatures().size());
			      		System.out.println("Total number of Features Xml files in the input variants"+allXmlFeatureFilesInVariants.size());
			      		
//			      	 	falseNegatives number of plugins in eclipseFeature , but they are not present in but4reuseFeature 
						totalfalseNegatives = getTotalFalseNegatives2(p.getFeatures(),allXmlFeatureFilesInVariants);
						
						System.out.println("total Nbr Of Plugins In Eclispe Features "+ totalNbrOfPluginsInEclispeFeatures.size());
						System.out.println("total Nbr Of Plugins In Eclispe Features "+ totalNbrOfPluginsfeaturesofInputVars);

			      		System.out.println("total Nbr Of Plugins In Eclispe Features (with sources) "+ totalNbrOfPluginsInEFwithsources);

						System.out.println("Total false Negatives "+totalfalseNegatives); 
						System.out.println("Real Total false Negatives "+listOffalseNegatives2.size());
						
						for (String file : listOffalseNegatives2) {
							System.out.println(file);
						}
      		
          }
          
            
          /***
           * 
           * @param recoveredSAPLPath
           * @param eclipseFeatures : feature files in the eclipse folder : 'features'
           */
          public  void isSAPLcontainsAllInFeatures2(File recoveredSAPLPath, File inputVariantsPath, int nbrVariants){
      	
						double totalfalseNegatives = 0;

						ArchitectureTools a = new ArchitectureTools();
						SoftwareProductLineArchitecture p = a.loadSAPLArchitecture(recoveredSAPLPath);
				
						ArrayList<File> allFeaturesInInputVariants = getallFeaturesInInputVars(inputVariantsPath, nbrVariants);
						File[] allFeaturesInInputVariantsArray = new File[allFeaturesInInputVariants.size()];
						int j = 0;
						for (File file : allFeaturesInInputVariants) {
							allFeaturesInInputVariantsArray[j++] = file;
						}
						ArrayList<File> allXmlFeatureFilesInVariants = getAllXMLFiles(allFeaturesInInputVariantsArray);
						
						System.out.println("Total number of Blocks in SAPL "+p.getFeatures().size());
			      		System.out.println("Total number of Features Xml files in the input variants"+allXmlFeatureFilesInVariants.size());
			      		
//			      	 	falseNegatives number of plugins in eclipseFeature , but they are not present in but4reuseFeature 
						totalfalseNegatives = getTotalFalseNegatives2(p.getFeatures(),allXmlFeatureFilesInVariants);
						
						System.out.println("total Nbr Of Plugins In Eclispe Features "+ totalNbrOfPluginsInEclispeFeatures.size());
						System.out.println("total Nbr Of Plugins In Eclispe Features "+ totalNbrOfPluginsfeaturesofInputVars);

			      		System.out.println("total Nbr Of Plugins In Eclispe Features (with sources) "+ totalNbrOfPluginsInEFwithsources);

						System.out.println("Total false Negatives "+totalfalseNegatives); 
						System.out.println("Real Total false Negatives "+listOffalseNegatives2.size());
						
						for (String file : listOffalseNegatives2) {
							System.out.println(file);
						}
      		
          } 
          
          
          
            private static ArrayList<File> getallFeaturesInInputVars(File variantsPath, int i) {

            	ArrayList<File> allFeaturesInInputVariants =new ArrayList<File>();
        		if(variantsPath.isDirectory()){
        			File[] variants = variantsPath.listFiles();
        			for (int j = 0; j < i; j++) {
        				File currentDistribution = variants[j];
        				System.out.println("variant :"+currentDistribution.getName());
        				
        				  if (currentDistribution.exists() && currentDistribution.isDirectory()){
        		               File currentFeatures = new File(currentDistribution.getAbsolutePath()+"/eclipse/features");
        	                 if(!currentFeatures.exists()){
        	               	   currentFeatures = new File(currentDistribution.getAbsolutePath()+"/features");
        	                 }
        	                 if(currentFeatures!= null && currentFeatures.exists()){
        	   		    		for (File featurei : currentFeatures.listFiles()) {
        	   		    			   allFeaturesInInputVariants.add(featurei);
        	   		    		}
        	                 }
        				  }
        			}
        		}
        				
        			
        		return allFeaturesInInputVariants;
        	}  
            
            
            /**
       	    * True Positives : : number of plugins that are present in but4reuseFeature and in eclipseFeature
       	    * @param emfBut4reuseModel
       	    * @param eclipseFeatureXmlDoc
       	    * @return
       	    */
 			private double getTruePositives2(CompositeElement emfBut4reuseModel,ArrayList<File>  allXmlFeatureFiles) {
 				double truePositives = 0;
 				
 				
 			
 				System.out.println(emfBut4reuseModel.getComponents().size());
 				for (ComponentElement componentElement : emfBut4reuseModel.getComponents()) {
					PluginElement pluginEle = (PluginElement) componentElement;
					
				//	System.out.println("pluginEle : "+pluginEle.getPluginSymbName());
					
					 for (File eclipseFeature : allXmlFeatureFiles) {
						
						 boolean found =false;
					  Document eclipseFeatureXmlDoc =null;
		        	  
			         	 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			  	         DocumentBuilder dBuilder;
			  		    	try {
			  				dBuilder = dbFactory.newDocumentBuilder();
			         	   eclipseFeatureXmlDoc =  dBuilder.parse(eclipseFeature);
								eclipseFeatureXmlDoc.getDocumentElement().normalize();
			  		    	 } catch (Exception e) {
			  			         e.printStackTrace();
			  			      }
			  		    	if(eclipseFeatureXmlDoc!=null &&  eclipseFeatureXmlDoc.getDocumentElement().getNodeName().equals("feature")){
			        	 
			  		    		NodeList nList = eclipseFeatureXmlDoc.getElementsByTagName("plugin");
			  		    		if(nList!= null){
			  		    			for (int temp = 0; temp < nList.getLength(); temp++) {
				     	            Node nNode = nList.item(temp);
				     	    //       System.out.println("\nCurrent Feature :" + nNode.getNodeName());

				     	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				     	        	   Element eElement = (Element) nNode;	
			                           String pluginName = eElement.getAttribute("id");
			                           String pluginVesrion = eElement.getAttribute("version");
			                           
			                          // if(pluginName.equals(pluginEle.getPluginSymbName())){
			           				    if(pluginEle.getPluginSymbName().equals(pluginName) ){//|| pluginEle.getPluginSymbName().equals(pluginName+"_64") ){
	   
				                           //TODO compare versions

			                        	   truePositives++;
			                        	   found =true;
			                        	   break;
			                           }
				     	            }
			  		    			}
			  		    		}
			  		    	}
			        
			         
			  		    	if(found){
			  		    		
			  		    		break;
			  		    	}
					 }
					
 			
			     }
 				return truePositives;
 			}

 			
 			
 			
 			/**
             *      False Positives : number of plugins in but4reuseFeature, but they are not present in eclipseFeature

             * @param emfBut4reuseModel
             * @param eclipseFeatureXmlDoc
             * @return
             */
			private double getFalsePositives2(CompositeElement emfBut4reuseModel, ArrayList<File> allXmlFeatureFiles) {
				double falsePositives = 0;

				
				for (ComponentElement componentElement : emfBut4reuseModel.getComponents()) {
					PluginElement pluginEle = (PluginElement) componentElement;
					boolean found =false;
					
					
					 for (File eclipseFeature : allXmlFeatureFiles) {
							
						
						  Document eclipseFeatureXmlDoc =null;
			        	  
				         	 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				  	         DocumentBuilder dBuilder;
				  		    	try {
				  		    		dBuilder = dbFactory.newDocumentBuilder();
				  		    		eclipseFeatureXmlDoc =  dBuilder.parse(eclipseFeature);
									eclipseFeatureXmlDoc.getDocumentElement().normalize();
				  		    	 } catch (Exception e) {
				  			         e.printStackTrace();
				  		    	 }
					
				  		    	if(eclipseFeatureXmlDoc!=null &&  eclipseFeatureXmlDoc.getDocumentElement().getNodeName().equals("feature")){
			        	 
				  		    		NodeList nList = eclipseFeatureXmlDoc.getElementsByTagName("plugin");
				  		    			if(nList!= null){
				  		    				for (int temp = 0; temp < nList.getLength(); temp++) {
				  		    					Node nNode = nList.item(temp);
				  		    					//       System.out.println("\nCurrent Feature :" + nNode.getNodeName());

				  		    					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				  		    						Element eElement = (Element) nNode;	
				  		    						String pluginName = eElement.getAttribute("id");
				  		    						String pluginVesrion = eElement.getAttribute("version");
			                           
				  		    						if(pluginEle.getPluginSymbName().equals(pluginName)){// || pluginEle.getPluginSymbName().equals(pluginName+"_64") ){
				  		    							//TODO compare versions

				  		    							found =true;
				  		    							break;
				  		    						}
				  		    					}
				  		    				}
				  		    			}
			         
			         
			         
			         	
				  		    	}
				  		    	 if(found){
				  		    		break;
				  		    	 }
					 }
			         
					 if(!found){
			        	 falsePositives++;
						System.out.println("false positive "+pluginEle.getPluginSymbName() );
						System.out.println("feature name " +emfBut4reuseModel.getName());

			         }
			     }
				return falsePositives;
			}

			/**
           * FalseNegatives :  number of plugins in eclipse Features , but they are not present in SAPL 
           * @param eList
           * @param eclipseFeatureXmlDoc
           * @return
           */
          private double getTotalFalseNegatives2(EList<Feature> fList, ArrayList<File> allXmlFeatureFiles) {


          	double falseNegatives = 0;

          	 for (File eclipseFeature : allXmlFeatureFiles) {
 							
 						
 						  Document eclipseFeatureXmlDoc =null;
 			        	  
 				         	 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
 				  	         DocumentBuilder dBuilder;
 				  		    	try {
 				  				dBuilder = dbFactory.newDocumentBuilder();
 				         	   eclipseFeatureXmlDoc =  dBuilder.parse(eclipseFeature);
 									eclipseFeatureXmlDoc.getDocumentElement().normalize();
 				  		    	 } catch (Exception e) {
 				  			         e.printStackTrace();
 				  			      }
          	
 			       if(eclipseFeatureXmlDoc!=null &&  eclipseFeatureXmlDoc.getDocumentElement().getNodeName().equals("feature")){
			        	 
			        	 NodeList nList = eclipseFeatureXmlDoc.getElementsByTagName("plugin");
			        	 if(nList!= null){
			        		 for (int temp = 0; temp < nList.getLength(); temp++) {
			 					boolean found =false;

				     	            Node nNode = nList.item(temp);
				     	    //       System.out.println("\nCurrent Feature :" + nNode.getNodeName());

				     	           if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				     	        	   Element eElement = (Element) nNode;	
			                           String pluginName = eElement.getAttribute("id");
			                           String pluginVesrion = eElement.getAttribute("version");
			                           totalNbrOfPluginsInEFwithsources ++;
			                          if(!pluginName.endsWith(".source")) {
			                        	  if(!totalNbrOfPluginsInEclispeFeatures.contains(pluginName)){
			                        		  totalNbrOfPluginsInEclispeFeatures.add(pluginName);
			                        	  }
			                        	  totalNbrOfPluginsfeaturesofInputVars++;
										for (Feature feature : fList) {
											if (feature.getModel() != null) {
												if (feature.getModel().size() > 0) {
			
													CompositeElement compo = feature.getModel().get(0);
			
													for (ComponentElement componentElement : compo.getComponents()) {
														PluginElement pluginEle = (PluginElement) componentElement;
			
														if (pluginEle.getPluginSymbName().equals(pluginName)) {// ||
																												// pluginEle.getPluginSymbName().equals(pluginName+"_64")
																												// ){
															// TODO compare versions
															found = true;
														}
													}
												}
											}
										}
			                          
						     	          if(!found){
			           				//			System.out.println("FN : "+pluginName);
				    							System.out.println("false Negatives "+pluginName );
				    							System.out.println(eclipseFeature.getAbsolutePath());
		
						     	        	 falseNegatives++;
									        	
						     	        	 if (!listOffalseNegatives2.contains(pluginName)){
						     	        		listOffalseNegatives2.add(pluginName);
						     	        		
				    					//		System.out.println("----not repeated false Negatives "+pluginName );
				    					//		System.out.println(eclipseFeature.getAbsolutePath());


						     	        	 }
									      }
			                          }
				     	           }
			        		 }
			         
			        	 }
			        
 				  }
          	 }
  				return falseNegatives;
			}
   
          /**
           * FalseNegatives :  number of plugins in eclipseFeature , but they are not present in but4reuseFeature 
           * @param eList
           * @param eclipseFeatureXmlDoc
           * @return
           */
          private double getFalseNegatives2(CompositeElement emfBut4reuseModel, ArrayList<File> allXmlFeatureFiles) {


          	double falseNegatives = 0;


          	 for (File eclipseFeature : allXmlFeatureFiles) {
 							
 						
 						  Document eclipseFeatureXmlDoc =null;
 			        	  
 				         	 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
 				  	         DocumentBuilder dBuilder;
 				  		    	try {
 				  				dBuilder = dbFactory.newDocumentBuilder();
 				         	   eclipseFeatureXmlDoc =  dBuilder.parse(eclipseFeature);
 									eclipseFeatureXmlDoc.getDocumentElement().normalize();
 				  		    	 } catch (Exception e) {
 				  			         e.printStackTrace();
 				  			      }
          	
 			       if(eclipseFeatureXmlDoc!=null &&  eclipseFeatureXmlDoc.getDocumentElement().getNodeName().equals("feature")){
			        	 
			        	 NodeList nList = eclipseFeatureXmlDoc.getElementsByTagName("plugin");
			        	 if(nList!= null){
			        		 for (int temp = 0; temp < nList.getLength(); temp++) {
			 					boolean found =false;

				     	            Node nNode = nList.item(temp);
				     	    //       System.out.println("\nCurrent Feature :" + nNode.getNodeName());

				     	           if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				     	        	   Element eElement = (Element) nNode;	
			                           String pluginName = eElement.getAttribute("id");
			                           String pluginVesrion = eElement.getAttribute("version");
			                      
			                          if(!pluginName.endsWith(".source")) {
										
			
													for (ComponentElement componentElement : emfBut4reuseModel.getComponents()) {
														PluginElement pluginEle = (PluginElement) componentElement;
			
														if (pluginEle.getPluginSymbName().equals(pluginName)) {// ||
																												// pluginEle.getPluginSymbName().equals(pluginName+"_64")
																												// ){
															// TODO compare versions
															found = true;
														}
													}
												
			                          
						     	          if(!found){
			           				//			System.out.println("FN : "+pluginName);
				    						//	System.out.println("false Negatives "+pluginName);
		
						     	        	 falseNegatives++;
									        	 
									      }
			                          }
				     	           }
			        		 }
			         
			        	 }
			        
 				  }
          	 }
  				return falseNegatives;
			}
            public static void main(String[] args) {
            	File saplFile = new File("C:\\Users\\kerdoudi\\but4reuse\\IST\\eclipse-modeling-neon-2-win32-x86_64\\eclipse\\runtime-EclipseApplication\\Keplervariants\\modeling2019_arandom_12_extension\\productLineArchitectures\\FlatOsgiSAPLArchitectureCreator.xml");
        		File variantsPath = new File("C:\\random12");
        		
        		FeatureIdentificationEvaluation fidev = new FeatureIdentificationEvaluation();
        		fidev.isSAPLcontainsAllInFeatures(saplFile,variantsPath, 12);
        		
        		
        	
			}
}
