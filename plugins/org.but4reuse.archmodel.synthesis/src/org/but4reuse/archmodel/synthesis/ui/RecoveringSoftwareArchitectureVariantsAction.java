package org.but4reuse.archmodel.synthesis.ui;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.but4reuse.adaptedmodel.AdaptedModel;
import org.but4reuse.adaptedmodel.Block;
import org.but4reuse.adaptedmodel.helpers.AdaptedModelHelper;
import org.but4reuse.adaptedmodel.manager.AdaptedModelManager;
import org.but4reuse.adapters.IAdapter;
import org.but4reuse.adapters.IElement;
import org.but4reuse.adapters.helper.AdaptersHelper;
import org.but4reuse.adapters.preferences.PreferencesHelper;
import org.but4reuse.adapters.ui.AdaptersSelectionDialog;
import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureVariantRecovery;
import org.but4reuse.archmodel.synthesis.helper.ArchtectureVariantRecoverHelper;
import org.but4reuse.artefactmodel.Artefact;
import org.but4reuse.artefactmodel.ArtefactModel;
import org.but4reuse.artefactmodel.ArtefactModelFactory;
import org.but4reuse.feature.constraints.IConstraint;
import org.but4reuse.feature.constraints.IConstraintsDiscovery;
import org.but4reuse.feature.constraints.helper.ConstraintsDiscoveryHelper;
import org.but4reuse.feature.constraints.impl.ConstraintsHelper;
import org.but4reuse.utils.emf.EMFUtils;
import org.but4reuse.utils.ui.dialogs.URISelectionDialog;
import org.but4reuse.utils.workbench.WorkbenchUtils;
import org.but4reuse.visualisation.helpers.VisualisationsHelper;
import org.eclipse.contribution.visualiser.views.Menu;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;

public class RecoveringSoftwareArchitectureVariantsAction implements  IObjectActionDelegate, IViewActionDelegate {

//	Menu menu;
	ArtefactModel artefactModel;
	List<ISoftwareArchitectureVariantRecovery> sarAlgorithms;
	List<IAdapter> adapters;
	ISelection selection;
	@Override
	public void run(IAction action) {
		
		
		if (selection instanceof IStructuredSelection) {
			Object art = ((IStructuredSelection) selection).getFirstElement();
			if (art instanceof IResource) {
				// This is the case where the files are directly selected from
				// the navigator
				List<?> list = ((IStructuredSelection) selection).toList();
				artefactModel = ArtefactModelFactory.eINSTANCE.createArtefactModel();
				for (Object sel : list) {
					IResource resource = (IResource) sel;
					Artefact artefact = ArtefactModelFactory.eINSTANCE.createArtefact();
					URI uri = WorkbenchUtils.getURIFromIResource(resource);
					artefact.setArtefactURI(uri.toString());
					artefact.setName(resource.getName());
					artefactModel.getOwnedArtefacts().add(artefact);
				}
			} else if (art instanceof ArtefactModel) {
				artefactModel = ((ArtefactModel) art);
			}
			if (artefactModel != null) {
				List<IAdapter> defaultAdapters = AdaptersHelper.getAdaptersByIds(artefactModel.getAdapters());

				// Adapter selection by user
				adapters = AdaptersSelectionDialog.show("Adapters selection", artefactModel, defaultAdapters);
				if (!adapters.isEmpty()) {
				
				// Set default output
				IResource artefactModelResource = EMFUtils.getIResource(artefactModel.eResource());
				if (artefactModelResource == null) {
					Object res = ((IStructuredSelection) selection).getFirstElement();
					if (res instanceof IResource) {
						AdaptedModelManager.setDefaultOutput(((IResource) res).getProject());
					} else {
						AdaptedModelManager.setDefaultOutput(null);
					}
				} else {
					AdaptedModelManager.setDefaultOutput(artefactModelResource.getParent());
				}
				
				
				// Launch Progress dialog
				ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(
						Display.getCurrent().getActiveShell());
				
				
				try {
					progressDialog.run(true, true, new IRunnableWithProgress() {
						@Override
						public void run(IProgressMonitor monitor)
								throws InvocationTargetException, InterruptedException {
							
							// recovering SA for each active artefact +prepare visualisation
							int totalWork = AdaptersHelper.getActiveArtefacts(artefactModel).size() + 1 + 1
									+ VisualisationsHelper.getSelectedVisualisations().size();
							
							
							monitor.beginTask("Software Architecture Recovering", totalWork);
							AdaptedModel adaptedModel = AdaptedModelHelper.adapt(artefactModel, adapters, monitor);

							List<ISoftwareArchitectureVariantRecovery> softwareArchitectureVariantCreators = ArchtectureVariantRecoverHelper.getSelectedSoftwareArchitectureVariantCreators();

							// Create pla with each of them
							for (ISoftwareArchitectureVariantRecovery savc : softwareArchitectureVariantCreators) {
								savc.recoverSoftwareArchitectureVariants(null, new NullProgressMonitor());
							}
							
							
							
							monitor.worked(1);

							monitor.subTask("Preparing visualisations");
							VisualisationsHelper.notifyVisualisations(null, adaptedModel, null, monitor);

							monitor.worked(1);
							monitor.done();
						}

						
					});
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			}
		}
		
		try {
			// Get construction uri from user
			String out = "/projectName";
			IContainer output = AdaptedModelManager.getDefaultOutput();
			if (output != null) {
				out = output.getFullPath().toString();
			}
	/*		URISelectionDialog inputDialog = new URISelectionDialog(Display.getCurrent().getActiveShell(),
					"Config File container URI", "Insert path for Config",
					"platform:/resource" + out + "/recoveredArchitectures/");
			if (inputDialog.open() != Dialog.OK) {
				return;
			}
			String constructionString = inputDialog.getValue();
			URI constructionURI = new URI(constructionString);*/
			// Get the selected pla creators
		List<ISoftwareArchitectureVariantRecovery> softwareArchitectureVariantCreators = ArchtectureVariantRecoverHelper.getSelectedSoftwareArchitectureVariantCreators();

			// Create pla with each of them
			for (ISoftwareArchitectureVariantRecovery savc : softwareArchitectureVariantCreators) {
				savc.recoverSoftwareArchitectureVariants(null, new NullProgressMonitor());
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
		this.selection = selection;

	}

	@Override
	public void init(IViewPart view) {

		//menu = (Menu) view;

	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

}
