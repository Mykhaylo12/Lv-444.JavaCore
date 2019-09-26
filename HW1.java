//public class HW1 {
//
//	public HW1() {
//		}
//	public static void main(String[] args) {
//		System.out.println("my fitsr program");
//		for (int i = 0; i<args.length; i++) {
//			System.out.println("Arg " + i + "is" + args[i]);
//		}
//	}
//
//}
//
//package HW1;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class HW1 {
//	public static void main (String [] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Hello, what is your name? ");
//		String name = br.readLine();
//		System.out.println("How old are you??");
//		int age = Integer.parseInt(br.readLine());
//	
//		System.out.println("Hello " +name);
//		System.out.println("You are " + age);
//	}
//}

package HW1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1 {
	
	private static double Per = 0;
	private static double Sqr = 0;
	private static double call1 = 0;
	private static double call2 = 0;
	private static double call3 = 0;
	private static double totalsum = 0;
	
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter radius ");
		int radius = Integer.parseInt(br.readLine());
		  Per = 2*3.14*radius;
		  Sqr = 3.14*radius*radius;
		
		System.out.println("Perimeter " + Per);  
		System.out.println("Area " + Sqr); 
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello, what is your name? ");
		String name = br1.readLine();
		System.out.println("where you live" + name);
    	String adress = br1.readLine();
	
		System.out.println("Hello " + name + " You live in " + adress);
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter call value 1 ");
		int val1 = Integer.parseInt(br2.readLine());
		System.out.println("Enter call value 2");
		int val2 = Integer.parseInt(br2.readLine());
		System.out.println("Enter call value 3");
		int val3 = Integer.parseInt(br2.readLine());
				
	    	call1 = val1*0.1;
	    	call2 = val2*0.5;		
			call3 = val3*2;
			totalsum = call1 + call2 + call3;
		 
		 System.out.println("call 1 =" + call1 + "call 2 =" + call2 + "call 3 =" + call3 + 
				 "Tatal cost =" + totalsum );  
	
	}


}
