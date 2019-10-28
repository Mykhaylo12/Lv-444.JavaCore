package com.softserve.lukas20191022;

public class TransformNameToArticleException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public TransformNameToArticleException(String message, String nameFile) {

		super(message);
		name = nameFile;
	}
}
