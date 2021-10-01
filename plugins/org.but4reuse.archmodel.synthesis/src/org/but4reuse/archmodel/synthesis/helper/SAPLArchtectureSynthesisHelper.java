package org.but4reuse.archmodel.synthesis.helper;

import java.util.ArrayList;
import java.util.List;

import org.but4reuse.archmodel.synthesis.ISoftwareArchitectureProductLineSynthesis;
import org.but4reuse.archmodel.synthesis.activator.Activator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;

public class SAPLArchtectureSynthesisHelper {

	
	

	private static final String SAPLRE_EXTENSIONPOINT = "org.but4reuse.archmodel.synthesis.sapl_re";

	/**
	 * Get all feature model creators
	 * 
	 * @return get the list
	 */
	public static List<ISoftwareArchitectureProductLineSynthesis> getAllSAPLArchitectureCreators() {
		List<ISoftwareArchitectureProductLineSynthesis> saplaCreators = new ArrayList<ISoftwareArchitectureProductLineSynthesis>();
		IConfigurationElement[] adapterExtensionPoints = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(SAPLRE_EXTENSIONPOINT);
		for (IConfigurationElement saplaCreatorExtensionPoint : adapterExtensionPoints) {
			try {
				saplaCreators.add((ISoftwareArchitectureProductLineSynthesis) saplaCreatorExtensionPoint.createExecutableExtension("class"));
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return saplaCreators;
	}

	/**
	 * Get feature model creator by name
	 * 
	 * @param name
	 * @return null or the feature model creator
	 */
	public static ISoftwareArchitectureProductLineSynthesis getSAPLCreatorByName(String name) {
		IConfigurationElement[] adapterExtensionPoints = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(SAPLRE_EXTENSIONPOINT);
		for (IConfigurationElement saplaCreatorExtensionPoint : adapterExtensionPoints) {
			if (saplaCreatorExtensionPoint.getAttribute("name").equals(name)) {
				try {
					return (ISoftwareArchitectureProductLineSynthesis) saplaCreatorExtensionPoint.createExecutableExtension("class");
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
	public static String getAlgorithmName(ISoftwareArchitectureProductLineSynthesis algo) {
		IConfigurationElement[] adapterExtensionPoints = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(SAPLRE_EXTENSIONPOINT);
		for (IConfigurationElement adapterExtensionPoint : adapterExtensionPoints) {
			try {
				ISoftwareArchitectureProductLineSynthesis oneAlgo = (ISoftwareArchitectureProductLineSynthesis) adapterExtensionPoint
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

	public static List<ISoftwareArchitectureProductLineSynthesis> getSelectedSoftwareArchitectureProductLineCreators() {
		List<ISoftwareArchitectureProductLineSynthesis> selected = new ArrayList<ISoftwareArchitectureProductLineSynthesis>();
		for (ISoftwareArchitectureProductLineSynthesis algo : getAllSAPLArchitectureCreators()) {
			if (isAlgorithmSelected(algo)) {
				selected.add(algo);
			}
		}
		return selected;
	}

	public static boolean isAlgorithmSelected(ISoftwareArchitectureProductLineSynthesis algo) {
		String algoName = getAlgorithmName(algo);
		IPreferenceStore prefs = getPreferenceStore();
		return prefs.getBoolean(algoName);
	}

	public static IPreferenceStore getPreferenceStore() {
		return Activator.getDefault().getPreferenceStore();
	}

}
