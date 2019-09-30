package Hm4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//task1.1
//		for (int i=1;i<4;i++) {
//		System.out.println("Enter "+i+" number");
//		double rd = Double.parseDouble(br.readLine());
//		if(rd>=-5 && rd<=5) {
//			System.out.println("This number belongs to this interval)");
//		}
//		else {
//			System.out.println("This number don't belongs to this interval(");
//			}
//		}
//		//task1.2
//		int max=0;
//		int min=0;
//		for (int i=1;i<4;i++) {
//			System.out.println("Enter "+i+" number");
//			int rd = Integer.parseInt(br.readLine());
//			if(rd<min)min=rd;
//			if(rd>max)max=rd;
//			if (min==0)min=rd;
//		
//		}
//		System.out.println("MAX= "+max);
//		System.out.println("MIN= "+min);
//		//task1.3
//		Httper Error = Httper.Er400;
//		System.out.println("Enter number of error");
//		int er = Integer.parseInt(br.readLine());
//		switch(er) {
//		case 400:
//			Error=Httper.Er400;break;
//		case 401:
//			Error=Httper.Er401;break;
//		case 402:
//			Error=Httper.Er402;break;
//		case 403:
//			Error=Httper.Er403;break;
//		case 404:
//			Error=Httper.Er404;break;
//		case 405:
//			Error=Httper.Er405;break;
//		case 406:
//			Error=Httper.Er406;break;
//			default:
//				System.out.println("There is no such error in the database");
//				break;
//			}
//		System.out.println( Error.getEr());
		//task2
		Dog dog0=new Dog("bOB", 5, "akita");
		Dog dog1=new Dog("rob", 6, "chug");
		Dog dog2=new Dog("BOB", 2, "beagle");
	dog0.check();

		
			}
		}

