package org.but4reuse.archmodel.synthesis.ui;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.but4reuse.adaptedmodel.manager.AdaptedModelManager;
import org.but4reuse.archmodel.synthesis.IFeatureArchitectureSynthesis;
import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureProductLineSynthesis;
import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureVariantRecovery;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;
import org.but4reuse.archmodel.synthesis.helper.ArchtectureVariantRecoverHelper;
import org.but4reuse.archmodel.synthesis.helper.DeriveNewSoftwareArchitectures;
import org.but4reuse.archmodel.synthesis.helper.SAPLArchtectureSynthesisHelper;
import org.but4reuse.archmodel.synthesis.utils.ArchitectureTools;
import org.but4reuse.archmodel.synthesis.utils.SADerivationDialog;
import org.but4reuse.utils.files.FileUtils;
import org.but4reuse.utils.ui.dialogs.URISelectionDialog;
import org.but4reuse.utils.workbench.WorkbenchUtils;
import org.eclipse.contribution.visualiser.views.Menu;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class CreateNewSoftwareArchitectureVariantAction implements	IViewActionDelegate {
	Menu menu;
	@Override
	public void run(IAction action) {
		try {
			// Get construction uri from user
			String out = "/projectName";
			IContainer output = AdaptedModelManager.getDefaultOutput();
			if (output != null) {
				out = output.getFullPath().toString();
			}
		/*	URISelectionDialog inputDialog = new URISelectionDialog(Display.getCurrent().getActiveShell(),
					"Derived Software Achitecture Variants container URI", "Insert container URI for the Derived Software Achitecture Variants",
					"platform:/resource" + out + "/derivedSoftwareAchitectureVariants/");
			if (inputDialog.open() != Dialog.OK) {
				return;
			}
			*/
			SADerivationDialog conf = new SADerivationDialog("Derived Software Achitecture Variants container URI", "Select the FeatureIDE Configuration File" ,
					 "Select the Recovered Software Achitecture Product Line", "Insert container URI for the Derived Software Achitecture Variants", "platform:/resource" + out + "/derive/");
			
		
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IViewPart view) {
		menu = (Menu) view;

	}

	public static void main(String [] args) {
		Display display1 = new Display();
		final Shell shell1 = new Shell(display1);
		shell1.setSize(800, 400);
		shell1.open();
		while (!shell1.isDisposed()) {
		if (!display1.readAndDispatch())
		display1.sleep();
		}
		display1.dispose();
		
	
	Display display = new Display();
    final Shell shell = new Shell(display);

    FileDialog dlg = new FileDialog(shell, SWT.SINGLE);
    if (dlg.open() != null) {
    StringBuffer bufn = new StringBuffer(dlg.getFilterPath());
    if (bufn.charAt(bufn.length() - 1) != File.separatorChar)
      bufn.append(File.separatorChar);
    bufn.append(dlg.getFileNames()[0]);
    System.out.println(bufn.toString());

    }
    
	

	}
}
