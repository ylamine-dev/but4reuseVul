package org.but4reuse.adapters.softarchitectures.utility.filters;

import java.io.File;
import java.io.FileFilter;
 
public class ZipFileFilter implements FileFilter{
	public boolean accept(File file) {
		if((file != null)&&(file.exists())&&(!file.isDirectory())) {
			String path = file.getAbsolutePath();
			String suffix = path.substring(path.lastIndexOf('.'));
			if(suffix.equals(".zip")) {
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