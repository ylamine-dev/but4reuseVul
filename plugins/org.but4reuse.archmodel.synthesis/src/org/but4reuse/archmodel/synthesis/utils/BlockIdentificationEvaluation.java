package org.but4reuse.archmodel.synthesis.utils;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.but4reuse.adaptedmodel.AdaptedArtefact;
import org.but4reuse.adaptedmodel.AdaptedModel;
import org.but4reuse.adaptedmodel.Block;
import org.but4reuse.adaptedmodel.BlockElement;
import org.but4reuse.adaptedmodel.helpers.AdaptedModelHelper;
import org.but4reuse.adaptedmodel.manager.AdaptedModelManager;
import org.but4reuse.artefactmodel.Artefact;
import org.but4reuse.featurelist.FeatureList;
import org.but4reuse.utils.files.FileUtils;
import org.eclipse.emf.common.util.EList;

public class BlockIdentificationEvaluation {

	
	FeatureList featureList;
	AdaptedModel adaptedModel;
	File blocksArchitecturesFolder;
	List<File> oldCommonFeatures;
	File precision_recallFile;
	
	Map<Block, Double>  precisionValues ; 
	Map<Block, Double> recallValues ;
	Map<Block, Double>  truePositiveValues ; 
	Map<Block, Double>  falsePositiveValues ; 
	Map<Block, Double>  falseNegativeValues ; 
	private void calcaluteFeaturePrecisionRecall(Block b, File xmiblockFolder, int numberOfBlocks) {
		// TODO Auto-generated method stub
		System.out.println(" calcalute Precision Recall for block : "+b.getName());

		File[] distributions = getDistributionsContainingBlock(b);
		
		Vector<File> remainingDistributions = getDistributionsNotContainingBlock(distributions,AdaptedModelManager.getAdaptedModel().getOwnedAdaptedArtefacts());

		 FeatureIdentificationEvaluation featureIdentEval =new FeatureIdentificationEvaluation();
		 List<File> eclipseFeatures =null;
		 
		 
			eclipseFeatures = featureIdentEval.getCommonEclipseFeatures(distributions, oldCommonFeatures,remainingDistributions );
			
			// save them here to be excluded the next evaluation (for another block)
		    oldCommonFeatures.addAll(eclipseFeatures);
		 
		 
			 File[] eclipseFeaturesArray = new File[eclipseFeatures.size()];
			 int j=0;
		//	 System.out.println("common features : ");
			 for (File file : eclipseFeatures) {
	//			 System.out.println(file.getName());
				 eclipseFeaturesArray[j++] = file;
			 }
				 File but4reuseFeature = xmiblockFolder.listFiles()[0]; // TODO get file with same name as block name
                  if(but4reuseFeature.exists() && ! but4reuseFeature.isDirectory() && but4reuseFeature.getName().endsWith(".xmi")){
					     featureIdentEval.calculateRecallAndPrecision( but4reuseFeature,  eclipseFeaturesArray);
					     
					     precisionValues.put(b, featureIdentEval.getPrecision());
					     recallValues.put(b, featureIdentEval.getRecall()) ;
					     truePositiveValues.put(b, featureIdentEval.getTruePositives());
					     falseNegativeValues.put(b, featureIdentEval.getFalseNegatives());
					     falsePositiveValues.put(b, featureIdentEval.getFalsePositives());
                  }
                  

	}

	/**
	 * get list of distribution files which are not contain the Block b


	 * @param distributions
	 * @param allArtefacts
	 * @return
	 */
	private Vector<File> getDistributionsNotContainingBlock(File[] distributions,EList<AdaptedArtefact> allArtefacts) {
           
		Vector<File> remainingDistributions = new Vector<File>();
        if(distributions!=null){
        	
        	for (AdaptedArtefact artefact : allArtefacts) {
        		File file;
				try {
					file = FileUtils.getFile(new URI(artefact.getArtefact().getArtefactURI()));
				
        		boolean exist = false;	
			  	for (File commonDistribution : distributions) {
					if(file.getAbsolutePath().equals(commonDistribution.getAbsolutePath()) && file.getName().equals(commonDistribution.getName())){
					  exist = true;	
					}
				}
			  	if(!exist){
			  		remainingDistributions.add(file);
			  	}
        	} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
        }
		return remainingDistributions;
	}
/**
 * get distributions file that Contain the Block b
 * @param b
 * @return
 */
	private File[] getDistributionsContainingBlock(Block b) {
		List<Artefact> artefactsContainingBlock = new ArrayList<Artefact>();
		for (BlockElement blockElement : b.getOwnedBlockElements()) {
			List<Artefact> artefacts = AdaptedModelHelper.getArtefactsContainingBlockElement(blockElement);
			for (AdaptedArtefact aa : adaptedModel.getOwnedAdaptedArtefacts()) {
				if (artefacts.contains(aa.getArtefact())) {
                           
                    if(!artefactsContainingBlock.contains(aa.getArtefact()))  {
                    	  artefactsContainingBlock.add(aa.getArtefact()) ;	
                    }
					   
				} else {
                  

				}
			}
			
		}
		
		File[] distributions = new File[artefactsContainingBlock.size()];
		int i=0;
		System.out.println("Artefacts Containing the Block "+b.getName());
		for (Artefact artefact : artefactsContainingBlock) {
			System.out.println(artefact.getName());
		//	System.out.println(artefact.getArtefactURI());
			File dist;
			try {
				dist = FileUtils.getFile(new URI(artefact.getArtefactURI()));
				distributions[i++] = new File(dist.getAbsolutePath());

			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return distributions;
	}
	
}
