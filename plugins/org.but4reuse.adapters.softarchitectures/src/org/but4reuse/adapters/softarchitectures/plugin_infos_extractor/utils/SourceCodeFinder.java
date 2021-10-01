package org.but4reuse.adapters.softarchitectures.plugin_infos_extractor.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

import org.but4reuse.adapters.softarchitectures.utility.filters.*;

public class SourceCodeFinder {
	private static File inputSourceDirectory =null;
    private static File inputSourceDirectory2 =null;
    private static Vector<String> sourceFileNames=null;
	private static Vector<String> sourceFileNames2=null;
	public static boolean findSameVerion = true;
	
	
	 public static File findSourceFor( File pfile,String sourcesPath) {
	    	
	    	File sourceFile = null;
		   if (pfile.isDirectory()) {
			   
			  if(!pfile.getName().contains(".source_")){
					 
			    String bundleSymbolicName = getBundleSymbolicNameFromManifestFile(pfile);
			    if(bundleSymbolicName!=""){
				   if(bundleSymbolicName.contains(";")){
					 bundleSymbolicName = bundleSymbolicName.substring(0, bundleSymbolicName.indexOf(";"));
				   }
				 
			       String bundleVersion = getVersionFromManifestFile(pfile);
			//       System.out.println("start searching from here :");
			        sourceFile  = getSourceFileFromPath(bundleSymbolicName,bundleVersion,sourcesPath);		       
			    }
			  }
		   }
		   else{
				try {
					
					if(!pfile.getName().contains(".source_")){
					JarFile jar = new JarFile(pfile);
					Attributes attributes = jar.getManifest().getMainAttributes();
					String bundleSymbolicName = attributes.getValue("Bundle-SymbolicName");
					if(bundleSymbolicName!=""){
						 if(bundleSymbolicName.contains(";")){
							 bundleSymbolicName = bundleSymbolicName.substring(0, bundleSymbolicName.indexOf(";"));
						 }
					       String bundleVersion = attributes.getValue("Bundle-Version");
					       sourceFile  = getSourceFileFromPath(bundleSymbolicName,bundleVersion,File.separator+"bundle_sources");
					       
					 }
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
		return sourceFile;
	}


	
private static String getBundleSymbolicNameFromManifestFile(File pfile) {
	Manifest manifest;
	String bundleSymbolicName = "";
	if((new File(pfile.getAbsoluteFile()+"/META-INF/MANIFEST.MF")).exists()){
	try {
		
		
		InputStream ips = new FileInputStream(pfile.getAbsoluteFile()+"/META-INF/MANIFEST.MF");

		manifest = new Manifest(ips);
	
	
	Attributes attributes = manifest.getMainAttributes();
	
	bundleSymbolicName = attributes.getValue("Bundle-SymbolicName");
	ips.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	manifest = null;
	}
	
return bundleSymbolicName;
	}




/**
 * 
 * @param bundle
 * @param searchingSameVersion  
 * @return
 */
	private static File getSourceFileFromPath(String bundleSymbolicName,String bundleVersion,String sourcesPath) {

			 
			
		

		//	String sourcesPath="";
		if(sourcesPath!=""){ 
			// save the name of all the zip and jar files (bundles) in the sourceFileNames vector (to reduce the I/O operations)
			if(inputSourceDirectory  == null){  
				
				inputSourceDirectory = new File(sourcesPath);
				if(inputSourceDirectory.exists()){
                  File[] zipBundlesSourceFile = inputSourceDirectory.listFiles(new ZipFileFilter());
                
				  if(zipBundlesSourceFile!= null) {
				    sourceFileNames = new Vector<String>();
			        for(File zipFile : zipBundlesSourceFile ){
				      sourceFileNames.add(zipFile.getName());
			        }
				 }
			   
				File[] jarBundlesSourceFile = inputSourceDirectory.listFiles(new JarFileFilter()); 
			       if(jarBundlesSourceFile != null) {
			         for(File jarSourceFile : jarBundlesSourceFile ){
			    	   sourceFileNames.add(jarSourceFile.getName());
			         }
			       }
				}
				else{
					System.err.println(" you have to create a directory named 'bundle_sources' in your /home directory");
					System.err.println(" put the plugin sources in this directory");

				}
			}
			// searching in jar or zip files   	  
			if(sourceFileNames !=null) {
			    for(String sourceFileName : sourceFileNames ){
				  
			       String versionInString ="";
				   if(findSameVerion && bundleVersion!=null){
					  versionInString=bundleVersion;
				   }
				
				   if(sourceFileName.startsWith(bundleSymbolicName+".source_"+versionInString)){
					
				      File sourceFile = new File(sourcesPath+File.separator+ sourceFileName);
				    
				      if(sourceFile.exists()){
				    	
				    	return sourceFile;
						
				      }
				  }
				  
			 }
			}
			
			// searching in directories (not jar or zip files)    	  
		    File  sourceFile = searchInPathDirectories( bundleSymbolicName, bundleVersion, sourcesPath);
			return sourceFile;
		}
		return null;
	}
/**
 * 
 * @param bundle
 * @param searchingExactVersion
 * @return
 */
	private static File searchInPathDirectories(String bundleSymbolicName,String bundleVersion,String sourcesPath ) {


		
	
		if(sourcesPath!=""){
			if(inputSourceDirectory2  == null){
				
				inputSourceDirectory2 = new File(  java.lang.System.getProperty("user.home")+sourcesPath);
				
			  if(inputSourceDirectory2!=null){	
		    	File[] bundlesSourceFiles = inputSourceDirectory2.listFiles(new DirectoryFilter());
				
		    	if(bundlesSourceFiles!= null) {
				  sourceFileNames2 = new Vector<String>();
			      for(File file : bundlesSourceFiles ){
			        if(file.isDirectory()) {
			   
				      sourceFileNames2.add(file.getName());
				    }
			      }
				}
			  }
			  
			}
			if(sourceFileNames2 !=null) {
			 for(String sourceFileName : sourceFileNames2 ){
				String versionInString ="";
				if(findSameVerion && bundleVersion!=null){
					versionInString=bundleVersion;
				}
				
				if(sourceFileName.equals(bundleSymbolicName/*+".source_"+versionInString*/)){
					
				    File sourceFile = new File(  java.lang.System.getProperty("user.home")+sourcesPath+File.separator+ sourceFileName);
				    
				    if(sourceFile.exists()){
				    	String version= getVersionFromManifestFile(sourceFile);
				    	
				    	if (findSameVerion && versionInString.equals(version)){
				    	  return sourceFile;
				    	}
				    	if(!findSameVerion){
				    	   return sourceFile;
				    	}
				    }
				  
				}
			 }
			}
		}
		return null;
	}
	/**
	 * 
	 * @param sourceFile
	 * @return
	 */
	private static String getVersionFromManifestFile(File sourceFile) {
		
		Manifest manifest;
		String version = "";
		File file = new File(sourceFile.getAbsoluteFile()+"/META-INF/MANIFEST.MF");
		if(file.exists()){

		  try {
			InputStream ips = new FileInputStream(sourceFile.getAbsoluteFile()+"/META-INF/MANIFEST.MF");

			manifest = new Manifest(ips);
		
		
		     Attributes attributes = manifest.getMainAttributes();
		
			version = attributes.getValue("Bundle-Version");
		    ips.close();

		  } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		  }
		  manifest = null;
		}
		else{
		System.err.println(sourceFile.getName()+" : Manifest file does not exist");	
		}
	return version;
}
	
public static void setFindSameVerion(boolean findSameVerion) {
		SourceCodeFinder.findSameVerion = findSameVerion;
	}



public static void main(String[] args) {
		
		Vector<String> notfound ;
	//   String path= "eclipse_distributions";
	   String path= "distributions_2018-19";

	   
	   File sourcesPaths =new File(java.lang.System.getProperty("user.home")+File.separator+path);
	   System.out.println(sourcesPaths.getAbsolutePath());
	   File[] eclipse_distributions = sourcesPaths.listFiles(new DirectoryFilter());
	   for (File ed : eclipse_distributions) {
		   notfound = new  Vector<String>();
			

		   System.out.println("dis :"+ed.getAbsolutePath());
		   File plugins_dir = new File(ed.getAbsolutePath()+File.separator+"eclipse"+File.separator+"plugins");
		   System.out.println(plugins_dir.getAbsolutePath());
		   if(plugins_dir.exists()){
			 File[] pluginFiles = plugins_dir.listFiles();
			 for (File pfile : pluginFiles) {
				 File sourceFile=	findSourceFor(pfile, java.lang.System.getProperty("user.home")+File.separator+"bundle_sources");
			       if(sourceFile != null){
					     System.err.println("source not found for "+pfile.getAbsolutePath() );
					     // add to notFound list
				   }

			 }
		   }
		   
		   
		   for (String name : notfound) {
			   //System.err.println("no source for :"+name);
			
		   }
		   System.out.println( notfound.size()+"/"+plugins_dir.listFiles().length + "sources not found");
		//   System.out.println( notfound.size()+"/"+i + "sources not found");

	   }
	}




   
	
}
