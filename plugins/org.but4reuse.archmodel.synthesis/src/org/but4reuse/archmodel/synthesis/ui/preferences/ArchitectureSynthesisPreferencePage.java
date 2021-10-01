package org.but4reuse.archmodel.synthesis.ui.preferences;

import java.util.List;

import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureProductLineSynthesis;
import org.but4reuse.archmodel.synthesis.helper.SAPLArchtectureSynthesisHelper;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class ArchitectureSynthesisPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	
	public ArchitectureSynthesisPreferencePage() {
		super(GRID);
		setPreferenceStore(SAPLArchtectureSynthesisHelper.getPreferenceStore());
		setDescription("Select");
	}
	@Override
	public void init(IWorkbench workbench) {
		

	}

	/**
	 * Creates the field editors.
	 */
	public void createFieldEditors() {
		List<ISoftwareArchitectureProductLineSynthesis> algos = SAPLArchtectureSynthesisHelper.getAllSAPLArchitectureCreators();
		for (ISoftwareArchitectureProductLineSynthesis algo : algos) {
			String algoName =  SAPLArchtectureSynthesisHelper.getAlgorithmName(algo);
			BooleanFieldEditor bfe = new BooleanFieldEditor(algoName, algoName, getFieldEditorParent());
			addField(bfe);
		}
	}
}
