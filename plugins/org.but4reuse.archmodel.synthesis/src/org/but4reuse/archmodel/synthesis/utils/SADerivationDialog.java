package org.but4reuse.archmodel.synthesis.utils;

import org.but4reuse.adaptedmodel.manager.AdaptedModelManager;
import org.but4reuse.archmodel.synthesis.IFeatureArchitectureSynthesis;
import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureVariantRecovery;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ComponentElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;
import org.but4reuse.archmodel.synthesis.helper.ArchtectureVariantRecoverHelper;
import org.but4reuse.archmodel.synthesis.helper.DeriveNewSoftwareArchitectures;
import org.but4reuse.utils.files.FileUtils;
import org.but4reuse.utils.workbench.WorkbenchUtils;
import org.eclipse.core.resources.IContainer;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
















import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

















import java.util.ArrayList;
import java.util.List;

public class SADerivationDialog {

	
	    private   String savContainerValue; 
	    private String inputConfigFileValue;
	    private  String inputSAPLAValue ;
		public SADerivationDialog( String title, String inputConfigFileMessage, String inputSAPLArchitectureMessage, String savContainerMessage, String savContainerInitialValue){
	    	
			Display display = Display.getCurrent();
	        Shell shell = new Shell(display);
	        
		        shell.setText(title);
		        // the layout manager handle the layout
		        // of the widgets in the container
		       
		        GridLayout gridLayout = new GridLayout(3, false);
		       
		        shell.setLayout(gridLayout);
		        shell.setSize(850, 160);
		       
		        Label inputConfigLabel = new Label(shell, SWT.NONE);
		        
		        inputConfigLabel.setText(inputConfigFileMessage);
		        inputConfigLabel.setToolTipText(inputConfigFileMessage);

		        Text  inputConfigFileText = new Text(shell, SWT.NONE);
		     //   text.setText("This is the text in the text widget");
		    //    text.setBackground(display.getSystemColor(SWT.COLOR_BLACK));
		    //    text.setForeground(display.getSystemColor(SWT.COLOR_WHITE));

		        Button buttonConfigFile = new Button(shell, SWT.NONE);
		        buttonConfigFile.setText("Browse...");
		        
		      
		        Label inputSAPLALabel= new Label(shell, SWT.NONE);
		        inputSAPLALabel.setText(inputSAPLArchitectureMessage);
		        inputSAPLALabel.setToolTipText(inputSAPLArchitectureMessage);
		        
		        Text  inputSAPLAText = new Text(shell, SWT.NONE);
		  
		        Button buttonSPEL = new Button(shell, SWT.NONE);
		        buttonSPEL.setText("Browse...");
		      
		        
                Label savContainerLabel = new Label(shell, SWT.NONE);
                
                savContainerLabel.setText(savContainerMessage);
                savContainerLabel.setToolTipText(savContainerMessage);

                Text   savContainerText = new Text(shell, SWT.NONE);
		        savContainerText.setText(savContainerInitialValue);
		        // set widgets size to their preferred size
		        Label videLabel = new Label(shell, SWT.NONE);
		        Label videLabel2 = new Label(shell, SWT.NONE);
		        Button oKButton = new Button(shell, SWT.NONE);
		        oKButton.setText("    OK    ");
		        Button cancel = new Button(shell, SWT.NONE);
		        cancel.setText("Cancel");
		        
		        GridData   data = new GridData(SWT.RIGHT, SWT.NONE, false, false, 1, 1);
		        oKButton.setLayoutData(data);
		           data = new GridData(SWT.RIGHT, SWT.NONE, false, false, 1, 1);

		        cancel.setLayoutData(data);
		        
		        
		       //select a configuration file 
		       buttonConfigFile.addSelectionListener(new SelectionAdapter() {
		    	    @Override
		    	    public void widgetSelected(SelectionEvent e) {

		    	    	final Shell dialog = new Shell(display);

		    	        FileDialog dlg = new FileDialog(dialog, SWT.SINGLE);
		    	        if (dlg.open() != null) {
			    	        StringBuffer bufn = new StringBuffer(dlg.getFilterPath());
			    	        if (bufn.charAt(bufn.length() - 1) != File.separatorChar)
			    	        	bufn.append(File.separatorChar);
			    	        
			    	        bufn.append(dlg.getFileNames()[0]);
			//    	        System.out.println(bufn.toString());
			    	        
			    	        inputConfigFileText.setText(bufn.toString());
		    	        }
		    	    	
				    	    
		    	    	
		    	    }
		       });
		    	   
		     
		       //select the recovered SAPL		       
		       buttonSPEL.addSelectionListener(new SelectionAdapter() {
		    	    @Override
		    	    public void widgetSelected(SelectionEvent e) {
		    	        final Shell dialog = new Shell(display);

		    	        FileDialog dlg = new FileDialog(dialog, SWT.SINGLE);
		    	        if (dlg.open() != null) {
			    	        StringBuffer bufn = new StringBuffer(dlg.getFilterPath());
			    	        if (bufn.charAt(bufn.length() - 1) != File.separatorChar)
			    	        	bufn.append(File.separatorChar);
			    	        
			    	        bufn.append(dlg.getFileNames()[0]);
			    	  //      System.out.println(bufn.toString());
			    	        
			    	        inputSAPLAText.setText(bufn.toString());
			    	        
		    	        }
		    	    }
		    	});
		       
		       //generate the SA variant
		       
		       oKButton.addSelectionListener(new SelectionAdapter() {
		    	    @Override
		    	    public void widgetSelected(SelectionEvent e) {
		    	        
		    	    	
		    	        inputConfigFileValue = inputConfigFileText.getText();
						File inputConfigFile = new File(getInputConfigFileValue());

		    	    	inputSAPLAValue = inputSAPLAText.getText();
		    	    	File inputSAPLAFile= new File(getInputSAPLAValue());
		    	    	savContainerValue= savContainerText.getText();
		    	    	
		    	    	File outputContainerFile  =null;
		    	    	try {
		    	    		URI outputContainerURI  = new URI(getSavContainerValue());
			    	    	
	    	    			  outputContainerFile =	FileUtils.getFile(outputContainerURI);							
							
	    	    		} catch (URISyntaxException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
		    	    	
		    	    	// Save

		    			
		    	    	if(inputConfigFile.exists() && inputSAPLAFile.exists()){
		    	    		
		    	    		
				    	    	List<ISoftwareArchitectureVariantRecovery> softwareArchitectureVariantCreators = ArchtectureVariantRecoverHelper.getSelectedSoftwareArchitectureVariantCreators();
		
				    			// Create sav with each of them
				    			for (ISoftwareArchitectureVariantRecovery savc : softwareArchitectureVariantCreators) {
				    			//	savc.recoverSoftwareArchitectureVariant(null, new NullProgressMonitor());
				    					   // We assume that the user gives a valid input files and folders
				    						ArchitectureTools archTool = new ArchitectureTools();
				    						SoftwareProductLineArchitecture inputSAPLArchitecture = archTool.loadSAPLArchitecture(inputSAPLAFile);
				    						
				    						
				    						
				    						
				    						
				    						
		
				    						String softArchVarName = savc.getClass().getSimpleName();
				    						IFeatureArchitectureSynthesis osgiFeatureArchitectureCreator = savc.getFeatureArchitectureCreator();
		
				    							DeriveNewSoftwareArchitectures.derive(inputConfigFile, inputSAPLArchitecture, outputContainerFile, softArchVarName,osgiFeatureArchitectureCreator);
				    			}
				    			IContainer output = AdaptedModelManager.getDefaultOutput();
				    			// Refresh
				    			if (output != null) {
				    				WorkbenchUtils.refreshIResource(output);
				    			} else {
				    				WorkbenchUtils.refreshAllWorkspace();
				    			}
				    			shell.close();
				    	    	
		    	    	}
		    	    	else{
		    	    		
		    	    		 
		    	    		 
		    	    		// create a dialog with ok and cancel buttons and a question icon
			    	    		MessageBox dialog =		    new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
			    	    		dialog.setText("Select valid SAPL file and SA Config File");
			    	    		dialog.setMessage("Please Select valid SAPL file and SA Config File");
	
			    	    		// open dialog and await user selection
			    	    		 dialog.open();
		    	    	}
		    	    }
		    	});
		       
		       cancel.addSelectionListener(new SelectionAdapter() {
		    	    @Override
		    	    public void widgetSelected(SelectionEvent e) {
		    	    
		    	    	shell.close();		    	    

		    	    }
		    	});
		       shell.open();
			     
		        
		        
		       
		    }

		 public String getSavContainerValue() {
			return savContainerValue;
		}

		public String getInputConfigFileValue() {
			return inputConfigFileValue;
		}

		public String getInputSAPLAValue() {
			return inputSAPLAValue;
		}

		
		
	}