package com.softserve.lukas20191022;

import java.io.File;

@FunctionalInterface
public interface FileFilter {
  
    boolean accept(File pathname);
 
 
}