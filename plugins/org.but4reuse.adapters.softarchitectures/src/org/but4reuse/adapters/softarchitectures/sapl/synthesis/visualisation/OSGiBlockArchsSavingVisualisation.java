package org.but4reuse.adapters.softarchitectures.sapl.synthesis.visualisation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.but4reuse.adaptedmodel.AdaptedArtefact;
import org.but4reuse.adaptedmodel.AdaptedModel;
import org.but4reuse.adaptedmodel.Block;
import org.but4reuse.adaptedmodel.BlockElement;
import org.but4reuse.adaptedmodel.helpers.AdaptedModelHelper;
import org.but4reuse.adaptedmodel.manager.AdaptedModelManager;
import org.but4reuse.adapters.IAdapter;
import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.helper.AdaptersHelper;
import org.but4reuse.adapters.softarchitectures.sapl.synthesis.OsgiFeatureArchitectureCreator;
import org.but4reuse.archmodel.synthesis.IFeatureArchitectureSynthesis;
import org.but4reuse.archmodel.synthesis.utils.FeatureIdentificationEvaluation;
import org.but4reuse.artefactmodel.Artefact;
import org.but4reuse.featurelist.FeatureList;
import org.but4reuse.utils.files.FileUtils;
import org.but4reuse.utils.workbench.WorkbenchUtils;
import org.but4reuse.visualisation.IVisualisation;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;

public class OSGiBlockArchsSavingVisualisation implements IVisualisation {

	FeatureList featureList;
	AdaptedModel adaptedModel;
	File blocksArchitecturesFolder;
	List<File> oldCommonFeatures;
	File precision_recallFile;
	
	Map<Block, Double>  precisionValues ; 
	Map<Block, Double> recallValues ;
	Map<Block, Double> recallValueswithoutSources ;
	Map<Block, Double>  truePositiveValues ; 
	Map<Block, Double>  falsePositiveValues ; 
	Map<Block, Double>  falseNegativeValues ; 
	Map<Block, Double> falseNegativesWithoutSources;
	
	File outputFile;
	@Override
	public void prepare(FeatureList featureList, AdaptedModel adaptedModel, Object extra, IProgressMonitor monitor) {
		// TODO Auto-generated method stub

		
		this.featureList = featureList;
		this.adaptedModel = adaptedModel;
		
		for (IAdapter adapter1 : AdaptedModelManager.getAdapters()) {
	           System.out.println("selected adapters "+AdaptersHelper.getAdapterName(adapter1));
		}
		
		monitor.subTask("Feature Architectures Saving");
		
		// Here we try to find the folder to save it
				IContainer output = AdaptedModelManager.getDefaultOutput();
				
				
					outputFile = WorkbenchUtils.getFileFromIResource(output);
				
				
				
				String name = AdaptedModelHelper.getName(adaptedModel);
				if (name == null) {
					name = "default";
				}
 
				// create folder
				blocksArchitecturesFolder = new File(outputFile, "blocks_architectures");
				if(blocksArchitecturesFolder.exists()){
					removeForlder(blocksArchitecturesFolder);
				}
				blocksArchitecturesFolder.mkdir();
						// Evaluation Part
				 	oldCommonFeatures = new ArrayList<File>(); 
				
					// create folder
						File precision_recallFolder = new File(outputFile, "precision_recall");
						precision_recallFolder.mkdir();

						// Save
						precision_recallFile = new File(precision_recallFolder, name + getNameAppendix());
						precisionValues = new HashMap<Block, Double>();
						recallValues = new HashMap<Block, Double>();
						recallValueswithoutSources = new HashMap<Block, Double>();
						truePositiveValues = new HashMap<Block, Double>();
						falsePositiveValues = new HashMap<Block, Double>();
						falseNegativeValues = new HashMap<Block, Double>();
						falseNegativesWithoutSources = new HashMap<Block, Double>();
	}

	public String getNameAppendix() {
		return "_precision_recall.txt";
	}
	private void removeForlder(File file) {

		if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                //call recursively
            	removeForlder(f);
            }
        }
        //call delete to delete files and empty directory
        file.delete();
		 
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		IFeatureArchitectureSynthesis architectureCreator = new OsgiFeatureArchitectureCreator();
		
       
	if(	adaptedModel.getOwnedBlocks() !=null){
		for (Block b : adaptedModel.getOwnedBlocks()) {
	          // save the new blok architecture		
			java.util.List<IElement> elements = AdaptedModelHelper.getElementsOfBlock(b);
			File blocksArchitecturesFolder1 = new File(blocksArchitecturesFolder.getAbsolutePath()+File.separator+b.getName());
			blocksArchitecturesFolder1.mkdir();
			architectureCreator.createFeatureArchitecture(b.getName(), elements, blocksArchitecturesFolder1.getAbsolutePath());
			
			calcaluteFeaturePrecisionRecall(b,blocksArchitecturesFolder1,adaptedModel.getOwnedBlocks().size());
		}
		
		
        addtoTextFile();
		// Refresh
        
        	WorkbenchUtils.refreshIResource(AdaptedModelManager.getDefaultOutput());
        
	}
	}
	public void saveInFile(String text,File file){
		PrintStream io = null;
		 if(io ==null){ 
			try {
				io = new PrintStream(new FileOutputStream(file.getAbsolutePath()));
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		 }
			io.print(text);
		}  
		
	
	
	private void appendUsedAdapters(StringBuilder text) {
		text.append("Adapter= ");
		for (IAdapter adapter : AdaptedModelManager.getAdapters()) {
			text.append(AdaptersHelper.getAdapterName(adapter) + ",");
		}
		text.setLength(text.length() - 1);
		text.append("\n");
	}
	public static double mean(List<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum / list.size();
	}
	public static double standardDeviation(List<Double> list, Double mean) {
		Double numerator = 0.0;
		for (int i = 0; i < list.size(); i++) {
			numerator += Math.pow((list.get(i) - mean), 2);
		}
		numerator = numerator / list.size();
		return Math.sqrt(numerator);
	}
	// must be sorted list
		public static double median(List<Double> list) {
			int middle = list.size() / 2;
			if (list.size() % 2 == 1) {
				return list.get(middle);
			} else {
				return (list.get(middle - 1) + list.get(middle)) / 2.0;
			}
		}
	public static void addMetrics(StringBuilder stringBuilder, String title, List<Double> data) {
		if (data!=null && !data.isEmpty()) {
		//	System.out.println("date : "+data);
			Collections.sort(data);
			stringBuilder.append("\n" + title);
			stringBuilder.append("\nMin= " + data.get(0));
			stringBuilder.append("\nMax= " + data.get(data.size() - 1));
			Double mean = mean(data);
			stringBuilder.append("\nMean= " + mean);
			stringBuilder.append("\nMedian= " + median(data));
			stringBuilder.append("\nStdDev= " + standardDeviation(data, mean));
			stringBuilder.append("\n");

		}
	}
	/**
	 * save the values of precision and recall 
	 */
	private void addtoTextFile() {

		StringBuilder text = new StringBuilder();

		appendUsedAdapters(text);
		text.append("--------------------------------------------\n");
		text.append("Artefacts= " + adaptedModel.getOwnedAdaptedArtefacts().size() + "\n");

		List<Double> nPrecisionAllBlocks = new ArrayList<Double>();
		List<Double> nRecallAllBlocks = new ArrayList<Double>();
		List<Double> nRecallAllBlocksWithoutSources = new ArrayList<Double>();
		Double  sumTruePositiveValues = 0.0; 
		Double  sumFalsePositiveValues = 0.0 ; 
		Double  sumFalseNegativeValues = 0.0 ; 
		Double  sumFalseNegativesWithoutSources = 0.0;
		
		for (Block block : adaptedModel.getOwnedBlocks()) {
			if(truePositiveValues.get(block)!=null && falsePositiveValues.get(block) !=null && falseNegativeValues.get(block)!=null){

				Double precision = precisionValues.get(block);
				Double recall = recallValues.get(block);
				Double recallWithoutSources =recallValueswithoutSources.get(block);
				sumTruePositiveValues  += truePositiveValues.get(block);
				sumFalsePositiveValues += falsePositiveValues.get(block);
				sumFalseNegativeValues += falseNegativeValues.get(block);
				sumFalseNegativesWithoutSources += falseNegativesWithoutSources.get(block);
				
				if(precision!=null){
				 nPrecisionAllBlocks.add(precision);
				}
				if(recall!=null){
				 nRecallAllBlocks.add(recall);
				}
				if(recallWithoutSources!=null){
					nRecallAllBlocksWithoutSources.add(recallWithoutSources);
				}
			}		
		}
		Double totalPrecision =0.0;
		Double totalRecall = 0.0;
		Double totalRecallWithoutSources = 0.0;
		if((sumTruePositiveValues+sumFalsePositiveValues)>0){
			 totalPrecision = sumTruePositiveValues / (sumTruePositiveValues+sumFalsePositiveValues);
			}
			if((sumTruePositiveValues+sumFalseNegativeValues)>0){
				 totalRecall = sumTruePositiveValues / (sumTruePositiveValues+sumFalseNegativeValues);
			}
			
			if((sumTruePositiveValues+sumFalseNegativesWithoutSources)>0){
				 totalRecallWithoutSources = sumTruePositiveValues / (sumTruePositiveValues+sumFalseNegativesWithoutSources);
			}
		
		
		addMetrics(text, "Precision values of all the Blocks", nPrecisionAllBlocks);
		text.append("--------------------------------------------\n");

		addMetrics(text, "Recall values of all the Blocks", nRecallAllBlocks);
		text.append("--------------------------------------------\n");

		addMetrics(text, "Recall values (without counting sources) of all the Blocks", nRecallAllBlocksWithoutSources);
		text.append("\n");
		
		
         text.append("--------------------------------------------\n");
		
		text.append("Total Precision and  Total Recall of all the Blocks\n");

		text.append("\n Total Precision : "+ totalPrecision);
		text.append("\n Total Recall : "+ totalRecall);
		text.append("\n Total Recall Without Sources : "+ totalRecallWithoutSources);
		text.append("\n Sum Of True Positives : "+ sumTruePositiveValues);
		text.append("\n Sum Of False Positives : "+ sumFalsePositiveValues);
		text.append("\n Sum Of False Negatives : "+ sumFalseNegativeValues);
		text.append("\n Sum Of False Negatives without counting plugins with sources : "+ sumFalseNegativesWithoutSources);
		text.append("\n");
		
		text.append("\n");

		for (AdaptedArtefact aa : adaptedModel.getOwnedAdaptedArtefacts()) {
			text.append(aa.getArtefact().getName() + ";");
			text.append("\n");
			
		}

		
		
		text.append("--------------------------------------------\n");

		text.append("\n\n Precision and recall values per Block\n");
		
		
		for (Block block : adaptedModel.getOwnedBlocks()) {
			Double precision = precisionValues.get(block);
			Double recall = recallValues.get(block);
			Double recallWithoutSources = recallValueswithoutSources.get(block);
			text.append("Block Name : "+ block.getName());
			text.append("\n Precision : "+ precision);
			text.append("\n Recall : "+ recall);
			text.append("\n Recall Without Sources : "+ recallWithoutSources);
			text.append("\n True Positives : "+ truePositiveValues.get(block));
			text.append("\n False Positives : "+ falsePositiveValues.get(block));
			text.append("\n False Negatives : "+ falseNegativeValues.get(block));
			text.append("\n False Negatives without counting plugins with sources : "+ falseNegativesWithoutSources.get(block));
			text.append("\n");

		}
		


		
			text.append("\n");
		
// add an extension 
	//	PrecisionRecallVisualisationView view = (PrecisionRecallVisualisationView) WorkbenchUtils.forceShowView(PrecisionRecallVisualisationView.ID);

		//view.scrollable.setText(text.toString());
		
		saveInFile(text.toString(),precision_recallFile);

	}

	private void calcaluteFeaturePrecisionRecall(Block b, File xmiblockFolder, int numberOfBlocks) {
		// TODO Auto-generated method stub
		System.out.println(" calcalute Precision Recall for block : "+b.getName());

		File[] distributions = getDistributionsContainingBlock(b);
		
		Vector<File> remainingDistributions = getDistributionsNotContainingBlock(distributions,adaptedModel.getOwnedAdaptedArtefacts());

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
			// TODO get xmi file with same name as block name
				 for (File but4reuseFeature : xmiblockFolder.listFiles()) {
					
					 if(but4reuseFeature.exists() && ! but4reuseFeature.isDirectory() && but4reuseFeature.getName().endsWith(".xmi")){
					     featureIdentEval.calculateRecallAndPrecision( but4reuseFeature,  eclipseFeaturesArray);
					     
					     precisionValues.put(b, featureIdentEval.getPrecision());
					     recallValues.put(b, featureIdentEval.getRecall()) ;
					     truePositiveValues.put(b, featureIdentEval.getTruePositives());
					     falseNegativeValues.put(b, featureIdentEval.getFalseNegatives());
					     falsePositiveValues.put(b, featureIdentEval.getFalsePositives());
					     falseNegativesWithoutSources.put(b,featureIdentEval.getFalseNegativesWithoutSources());
					     recallValueswithoutSources.put(b, featureIdentEval.getRecallWithoutSources());
					     break;
                    }
					 
				 }
		/*			//	 File but4reuseFeature = xmiblockFolder.listFiles()[0]; 
                  if(but4reuseFeature.exists() && ! but4reuseFeature.isDirectory() && but4reuseFeature.getName().endsWith(".xmi")){
					     featureIdentEval.calculateRecallAndPrecision( but4reuseFeature,  eclipseFeaturesArray);
					     
					     precisionValues.put(b, featureIdentEval.getPrecision());
					     recallValues.put(b, featureIdentEval.getRecall()) ;
					     truePositiveValues.put(b, featureIdentEval.getTruePositives());
					     falseNegativeValues.put(b, featureIdentEval.getFalseNegatives());
					     falsePositiveValues.put(b, featureIdentEval.getFalsePositives());
                  }
                  
*/
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