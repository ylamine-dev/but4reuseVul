
package org.but4reuse.adapters.softarchitectures.utility.filters;

import java.io.*;
 
public class JavaFileFilter implements FileFilter{
	
	public boolean accept(File file) {
		if((file != null)&&(file.exists())&&(!file.isDirectory())) {
			String path = file.getAbsolutePath();
			String suffix = path.substring(path.lastIndexOf('.'));
			if(suffix.equals(".java")) {
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
