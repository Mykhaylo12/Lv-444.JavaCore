package com.softserve.lukas20191022;

import java.io.File;

public class Appl {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File dir = new File("D:\\Lib\\Docs_from_Internet\\JAVA\\JAVA_core\\StorePhotoCheck");
//        
//        File[] txtFiles = dir.listFiles(new TxtFileFilter());
// 
//        for (File txtFile : txtFiles) {
//            System.out.println(txtFile.getAbsolutePath());
//        }
//        
		RecursiveFile example = new RecursiveFile();
		 

 
        example.fetchChild(dir);
        
        System.out.println("File[] listFiles():\n");
        

 
        File[] children = dir.listFiles();
 
        for (File file : children) {
            System.out.println(file.getAbsolutePath());
        }
 
        System.out.println("\n-----------------------");
        
        System.out.println("String[] list():\n");
 
        String[] paths = dir.list();
 
        for (String path : paths) {
            System.out.println(path);
        }
	}

}
