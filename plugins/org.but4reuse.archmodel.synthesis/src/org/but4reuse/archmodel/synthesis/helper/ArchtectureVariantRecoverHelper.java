package org.but4reuse.archmodel.synthesis.helper;

import java.util.ArrayList;
import java.util.List;

import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureProductLineSynthesis;
import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureVariantRecovery;
import org.but4reuse.archmodel.synthesis.activator.Activator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;

public class ArchtectureVariantRecoverHelper {

	
	

	private static final String SAVRECOVERINGSYNTHESIS_EXTENSIONPOINT = "org.but4reuse.archmodel.synthesis.sav_recovering";

	/**
	 * Get all feature model creators
	 * 
	 * @return get the list
	 */
	public static List<ISoftwareArchitectureVariantRecovery> getAllSAVariantCreators() {
		List<ISoftwareArchitectureVariantRecovery> savCreators = new ArrayList<ISoftwareArchitectureVariantRecovery>();
		IConfigurationElement[] adapterExtensionPoints = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(SAVRECOVERINGSYNTHESIS_EXTENSIONPOINT);
		for (IConfigurationElement savCreatorExtensionPoint : adapterExtensionPoints) {
			try {
				savCreators.add((ISoftwareArchitectureVariantRecovery) savCreatorExtensionPoint.createExecutableExtension("class"));
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return savCreators;
	}

	/**
	 * Get feature model creator by name
	 * 
	 * @param name
	 * @return null or the feature model creator
	 */
	public static ISoftwareArchitectureVariantRecovery getSAVariantAlgoByName(String name) {
		IConfigurationElement[] adapterExtensionPoints = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(SAVRECOVERINGSYNTHESIS_EXTENSIONPOINT);
		for (IConfigurationElement savCreatorExtensionPoint : adapterExtensionPoints) {
			if (savCreatorExtensionPoint.getAttribute("name").equals(name)) {
				try {
					return (ISoftwareArchitectureVariantRecovery) savCreatorExtensionPoint.createExecutableExtension("class");
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	/**
	 * Get algorithm name
	 * 
	 * @param algo
	 * @return the name
	 */
	public static String getAlgorithmName(ISoftwareArchitectureVariantRecovery algo) {
		IConfigurationElement[] adapterExtensionPoints = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(SAVRECOVERINGSYNTHESIS_EXTENSIONPOINT);
		for (IConfigurationElement adapterExtensionPoint : adapterExtensionPoints) {
			try {
				ISoftwareArchitectureVariantRecovery oneAlgo = (ISoftwareArchitectureVariantRecovery) adapterExtensionPoint
						.createExecutableExtension("class");
				if (oneAlgo.getClass().equals(algo.getClass())) {
					String name = adapterExtensionPoint.getAttribute("name");
					return name;
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return "No name";
	}

	public static List<ISoftwareArchitectureVariantRecovery> getSelectedSoftwareArchitectureVariantCreators() {
		List<ISoftwareArchitectureVariantRecovery> selected = new ArrayList<ISoftwareArchitectureVariantRecovery>();
		for (ISoftwareArchitectureVariantRecovery algo : getAllSAVariantCreators()) {
			if (isAlgorithmSelected(algo)) {
				selected.add(algo);
			}
		}
		return selected;
	}

	public static ISoftwareArchitectureVariantRecovery getSAVCreatorsAlgoByName(String algoName) {
		List<ISoftwareArchitectureVariantRecovery> selected = new ArrayList<ISoftwareArchitectureVariantRecovery>();
		for (ISoftwareArchitectureVariantRecovery algo : getAllSAVariantCreators()) {
			if (getAlgorithmName(algo).equals(algoName)) {
				return algo;
			}
		}
		return null;
	}
	public static boolean isAlgorithmSelected(ISoftwareArchitectureVariantRecovery algo) {
		String algoName = getAlgorithmName(algo);
		IPreferenceStore prefs = getPreferenceStore();
		return prefs.getBoolean(algoName);
	}

	public static IPreferenceStore getPreferenceStore() {
		return Activator.getDefault().getPreferenceStore();
	}

}
