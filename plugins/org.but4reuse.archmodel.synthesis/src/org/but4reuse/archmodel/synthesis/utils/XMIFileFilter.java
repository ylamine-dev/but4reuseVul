package org.but4reuse.archmodel.synthesis.utils;

import java.io.File;
import java.io.FileFilter;


public class XMIFileFilter implements FileFilter{
	
	public boolean accept(File file) {
		if((file != null)&&(file.exists())&&(!file.isDirectory())) {
			String path = file.getAbsolutePath();
			String suffix = path.substring(path.lastIndexOf('.'));
			if(suffix.equals(".xmi")) {
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
