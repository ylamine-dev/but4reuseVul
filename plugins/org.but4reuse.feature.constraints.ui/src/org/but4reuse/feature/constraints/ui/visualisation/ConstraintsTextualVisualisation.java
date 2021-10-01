package org.but4reuse.feature.constraints.ui.visualisation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.but4reuse.adaptedmodel.AdaptedModel;
import org.but4reuse.adaptedmodel.helpers.AdaptedModelHelper;
import org.but4reuse.adaptedmodel.manager.AdaptedModelManager;
import org.but4reuse.feature.constraints.IConstraint;
import org.but4reuse.feature.constraints.impl.ConstraintsHelper;
import org.but4reuse.featurelist.FeatureList;
import org.but4reuse.utils.workbench.WorkbenchUtils;
import org.but4reuse.visualisation.IVisualisation;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Display;

/**
 * Constraints textual visualisation
 * 
 * @author jabier.martinez
 * 
 */
public class ConstraintsTextualVisualisation implements IVisualisation {

	StringBuilder message;
	AdaptedModel adaptedModel;
	FeatureList featureList;
    File constraintsFile;
    
    
	File outputFile;
	@Override
	public void prepare(FeatureList featureList, AdaptedModel adaptedModel, Object extra, IProgressMonitor monitor) {
		message = new StringBuilder();
		this.adaptedModel = adaptedModel;
		this.featureList = featureList;
		
		// Here we try to find the folder to save it
		IContainer output = AdaptedModelManager.getDefaultOutput();
		
			outputFile = WorkbenchUtils.getFileFromIResource(output);
		
		String name = AdaptedModelHelper.getName(adaptedModel);
		if (name == null) {
			name = "default";
		}

		// create folder
		File graphsFolder = new File(outputFile, "constraints");
		graphsFolder.mkdir();

		// Save
		constraintsFile = new File(graphsFolder, name + getNameAppendix());
	}

	@Override
	public void show() {
		// asyncExec to avoid SWT invalid thread access
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				List<IConstraint> blockConstraints = ConstraintsHelper.getCalculatedConstraints(adaptedModel);
				// Feature constraints if there is a feature list
				if (featureList != null) {
					message.append("Discovered Feature Constraints\n");
					List<IConstraint> featureConstraints = ConstraintsHelper.getFeatureConstraints(featureList,
							adaptedModel);
					if (featureConstraints.isEmpty()) {
						message.append("No structural feature constraints were identified\n\n");
					} else {
						message.append(ConstraintsHelper.getText(featureConstraints));
						message.append("\n\nExplanations\n"
								+ ConstraintsHelper.getTextWithExplanations(featureConstraints) + "\n");
					}
				}
				// Block constraints
				message.append("Discovered Block Constraints\n");
				if (blockConstraints.isEmpty()) {
					message.append("No structural block constraints were identified\n");
				} else {
					message.append(ConstraintsHelper.getText(blockConstraints));
					message.append("\n\nExplanations\n" + ConstraintsHelper.getTextWithExplanations(blockConstraints));
				}

				ConstraintsTextualView view = (ConstraintsTextualView) WorkbenchUtils
						.forceShowView(ConstraintsTextualView.ID);

				view.scrollable.setText(message.toString());
				saveInFile(message.toString(), constraintsFile);
				// Refresh
				
			        	WorkbenchUtils.refreshIResource(AdaptedModelManager.getDefaultOutput());
			     
			}
		});
	}
	
	public void saveInFile(String constraintListAsString,File file){
		PrintStream io = null;
		 if(io ==null){ 
			try {
				io = new PrintStream(new FileOutputStream(file.getAbsolutePath()));
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		 }
			io.print(constraintListAsString);
		}  
	public String getNameAppendix() {
		return "_constraints.txt";
	}

	
}
