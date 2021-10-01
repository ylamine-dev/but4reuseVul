
package org.but4reuse.adapters.softarchitectures.utility.filters;

import java.io.File;
import java.io.FileFilter;
 
public class DirectoryFilter implements FileFilter {

	public boolean accept(File aFile) {
		if(aFile.isDirectory()) {
			return true;
		}
		else {
			return false;
		}
	}

}
