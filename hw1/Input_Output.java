package com.softserve.lukas1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input_Output {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Task "a+b"
		int a,b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(br.readLine()); 
		b = Integer.parseInt(br.readLine());
		System.out.println("Sum= "+(a+b));
		System.out.println("Sum= "+(a*b));
		
		//Task "what is your name"
		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("How old are you?");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println("Your name: " + name + "Your age: " + age);

		//Task "Flower"
		int r;
		double c, s;
		final double PI=3.14;
		System.out.println("Radius:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		r = Integer.parseInt(br.readLine());
		c = r*2*PI;
		s = r*r*PI;
		System.out.println("Perimetr = "+ c + ", Area = " + s);
		
		//Task "Adress"
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?");
		String name = br.readLine();		
		System.out.println("Where are you live," + name +"?");
		String address = br.readLine();		
		System.out.println("Your name: " + name + ", Your address: " + address);
		
		//Task "calls"
		int c1,c2,c3, t1, t2,t3;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		c1 = Integer.parseInt(br.readLine()); 
		c2 = Integer.parseInt(br.readLine());
		c3 = Integer.parseInt(br.readLine());
		t1 = Integer.parseInt(br.readLine()); 
		t2 = Integer.parseInt(br.readLine());
		t3 = Integer.parseInt(br.readLine());

		System.out.println("Call1= "+(c1*t1));
		System.out.println("Call2= "+(c2*t2));
		System.out.println("Call3= "+(c3*t3));
		System.out.println("All Calls= "+((c1*t1)+(c2*t2)+(c3*t3)));		
		
		
	}

}
