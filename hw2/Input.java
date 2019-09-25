package com.softserve.lukas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

	public static String input(String name) throws IOException{
		System.out.println(name+":");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		return br.readLine();
	}
}
