package com.softserve.lukas20191022;

import java.io.File;
import java.io.FileFilter;



public class TxtFileFilter implements FileFilter {

	//Why Override-error
	//@Override
    public boolean accept(File pathname) {
 
        if (!pathname.isFile()) {
            return false;
        }
 
        if (pathname.getAbsolutePath().endsWith(".txt")) {
            return true;
        }
 
        return false;
    }
}
