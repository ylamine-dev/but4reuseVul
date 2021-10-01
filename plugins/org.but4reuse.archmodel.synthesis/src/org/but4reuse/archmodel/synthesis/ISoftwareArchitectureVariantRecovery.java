package org.but4reuse.archmodel.synthesis;

import java.io.File;
import java.net.URI;
import java.util.List;

import org.but4reuse.adapters.IElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

public interface ISoftwareArchitectureVariantRecovery {
	/***
	 * 
	 * @param outputContainer
	 * @param monitor
	 */
	public void recoverSoftwareArchitectureVariants(File outputContainer, IProgressMonitor monitor);


	public IFeatureArchitectureSynthesis getFeatureArchitectureCreator();


	public void recoverSoftwareArchitectureVariant(List<IElement> elements,	String name, IProgressMonitor nullProgressMonitor);


	
}
