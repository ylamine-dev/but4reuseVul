package org.but4reuse.archmodel.synthesis.ui.preferences;

import java.util.List;

import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureProductLineSynthesis;
import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureVariantRecovery;
import org.but4reuse.archmodel.synthesis.activator.Activator;
import org.but4reuse.archmodel.synthesis.helper.ArchtectureVariantRecoverHelper;
import org.but4reuse.archmodel.synthesis.helper.SAPLArchtectureSynthesisHelper;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class PreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {

		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		List<ISoftwareArchitectureProductLineSynthesis> algos = SAPLArchtectureSynthesisHelper.getAllSAPLArchitectureCreators();
		for (ISoftwareArchitectureProductLineSynthesis algo : algos) {
			String algoName = SAPLArchtectureSynthesisHelper.getAlgorithmName(algo);
			boolean isTheDefault = algoName.equals("Create Alternative before Hierarchy SAPL Architecture");
			store.setDefault(algoName, isTheDefault);
		}
		
		List<ISoftwareArchitectureVariantRecovery> algos2 = ArchtectureVariantRecoverHelper.getAllSAVariantCreators();
		for (ISoftwareArchitectureVariantRecovery algo : algos2) {
			String algoName = ArchtectureVariantRecoverHelper.getAlgorithmName(algo);
			boolean isTheDefault = algoName.equals("Flat Org SA Variant Recovering");
			store.setDefault(algoName, isTheDefault);
		}
	}

}
