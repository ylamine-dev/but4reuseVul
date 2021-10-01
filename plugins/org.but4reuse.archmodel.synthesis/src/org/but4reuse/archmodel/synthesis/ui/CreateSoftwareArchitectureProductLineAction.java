package org.but4reuse.archmodel.synthesis.ui;

import java.net.URI;
import java.util.List;

import org.but4reuse.adaptedmodel.manager.AdaptedModelManager;
import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureProductLineSynthesis;
import org.but4reuse.archmodel.synthesis.helper.SAPLArchtectureSynthesisHelper;
import org.but4reuse.utils.ui.dialogs.URISelectionDialog;
import org.but4reuse.utils.workbench.WorkbenchUtils;
import org.eclipse.contribution.visualiser.views.Menu;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class CreateSoftwareArchitectureProductLineAction implements IViewActionDelegate {

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
			URISelectionDialog inputDialog = new URISelectionDialog(Display.getCurrent().getActiveShell(),
					"Software Architecture Product Line container URI", "Insert container URI for Software Architecture Product Line",
					"platform:/resource" + out + "/productLineArchitectures/");
			if (inputDialog.open() != Dialog.OK) {
				return;
			}
			String constructionString = inputDialog.getValue();
			URI constructionURI = new URI(constructionString);
			// Get the selected pla creators
		List<ISoftwareArchitectureProductLineSynthesis> saplArchitectureCreators = SAPLArchtectureSynthesisHelper.getSelectedSoftwareArchitectureProductLineCreators();

			// Create pla with each of them
			for (ISoftwareArchitectureProductLineSynthesis sapla : saplArchitectureCreators) {
				sapla.createSoftwareArchitectureProductLineModel(constructionURI, new NullProgressMonitor());
			}

			// Refresh
			if (output != null) {
				WorkbenchUtils.refreshIResource(output);
			} else {
				WorkbenchUtils.refreshAllWorkspace();
			}

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

}
