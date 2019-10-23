package com.softserve.lukas20191022;

import java.io.File;

public class RecursiveFile {
	public void fetchChild(File file) {

		System.out.println(file.getName());

		if (file.isDirectory()) {

			File[] children = file.listFiles();

			for (File child : children) {

				this.fetchChild(child);
			}
		}

	}
}