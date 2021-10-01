package org.but4reuse.archmodel.synthesis.ui.preferences;

import java.util.List;

import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureProductLineSynthesis;
import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureVariantRecovery;
import org.but4reuse.archmodel.synthesis.helper.ArchtectureVariantRecoverHelper;
import org.but4reuse.archmodel.synthesis.helper.SAPLArchtectureSynthesisHelper;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class SAVariantRecoveryPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

		
		public SAVariantRecoveryPreferencePage() {
			super(GRID);
			setPreferenceStore(ArchtectureVariantRecoverHelper.getPreferenceStore());
			setDescription("Select Only One");
		}
		@Override
		public void init(IWorkbench workbench) {
			

		}

		/**
		 * Creates the field editors.
		 */
		public void createFieldEditors() {
			List<ISoftwareArchitectureVariantRecovery> algos = ArchtectureVariantRecoverHelper.getAllSAVariantCreators();
			for (ISoftwareArchitectureVariantRecovery algo : algos) {
				String algoName =  ArchtectureVariantRecoverHelper.getAlgorithmName(algo);
				BooleanFieldEditor bfe = new BooleanFieldEditor(algoName, algoName, getFieldEditorParent());
				addField(bfe);
			}
		}
}