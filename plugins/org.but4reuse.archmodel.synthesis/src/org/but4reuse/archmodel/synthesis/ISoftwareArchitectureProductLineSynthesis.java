package org.but4reuse.archmodel.synthesis;

import java.net.URI;

import org.eclipse.core.runtime.IProgressMonitor;

public interface ISoftwareArchitectureProductLineSynthesis {
	 
	public void createSoftwareArchitectureProductLineModel(URI outputContainer, IProgressMonitor monitor);
}
