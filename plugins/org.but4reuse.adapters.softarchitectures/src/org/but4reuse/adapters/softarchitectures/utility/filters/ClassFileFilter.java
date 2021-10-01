package org.but4reuse.adapters.softarchitectures.utility.filters;

import java.io.*;
 
public class ClassFileFilter implements FileFilter{
	
	public boolean accept(File file) {
		if((file != null)&&(file.exists())&&(!file.isDirectory())) {
			String path = file.getAbsolutePath();
			String suffix = path.substring(path.lastIndexOf('.'));
			if(suffix.equals(".class")) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
}	
