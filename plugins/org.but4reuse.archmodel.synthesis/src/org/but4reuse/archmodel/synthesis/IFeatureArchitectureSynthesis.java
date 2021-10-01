package org.but4reuse.archmodel.synthesis;

import java.util.List;

import org.but4reuse.adapters.IElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.CompositeElement;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.Feature;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.ProductlineadlFactory;
import org.but4reuse.archmodel.synthesis.adlmm.productlineadl.SoftwareProductLineArchitecture;

public interface IFeatureArchitectureSynthesis {
/***
 * 
* For each a feature we generate the corresponding architecture
*
 * @param fileName
 * @param elements
 * @param outputPath
 */
	public void createFeatureArchitecture(String fileName, List<IElement> elements, String outputPath) ;

	public CompositeElement createCompositeModel(String name,SoftwareProductLineArchitecture productLineArchitecture,ProductlineadlFactory factory);

	public void saveArchitecture(String name, String absolutePath,Feature newFeature);



}
