package Magerovsky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hm1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//ex1
	System.out.println("Enter the radius");
	double rd = Double.parseDouble(br.readLine());
	System.out.println("Peimeter= " + 2*rd*3.14 );
	System.out.println("Area= " + rd*rd*3.14 );
	//ex2
	System.out.println("What is your name ?");
	String name = br.readLine();
	System.out.println("Where are you live, "+name+" ?");
	String address = br.readLine();
	System.out.println("Dear "+name+", you live "+address+" and we know that)");
	//ex3
	System.out.println("Enter first price for minute (UAH)");
	double c1 = Double.parseDouble(br.readLine());
	System.out.println("Enter second price");
	double c2 = Double.parseDouble(br.readLine());
	System.out.println("Enter third price");
	double c3 = Double.parseDouble(br.readLine());
	System.out.println("Enter first call duration (Minutes)");
	double t1 = Double.parseDouble(br.readLine());
	System.out.println("Enter second call duration (Minutes)");
	double t2 = Double.parseDouble(br.readLine());
	System.out.println("Enter third call duration (Minutes)");
	double t3 = Double.parseDouble(br.readLine());
	System.out.println("First call prise = "+c1*t1);
	System.out.println("Second call prise = "+c2*t2);
	System.out.println("Third call prise = "+c3*t3);
	System.out.println("The total prise of all calls = "+(c1*t1+c2*t2+c3*t3));
	
	
	}

}
