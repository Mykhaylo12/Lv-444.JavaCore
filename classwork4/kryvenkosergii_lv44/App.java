package classwork4.kryvenkosergii_lv44;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int numOdd = 0;
		int num1, num2, num3;
	
		System.out.print("Enter first number ");
		Scanner scn1 = new Scanner(System.in);
		num1 = scn1.nextInt();
		if (num1 % 2 == 0) {
			numOdd++;
		}
		
		System.out.print("Enter second number ");
		Scanner scn2 = new Scanner(System.in);
		num2 = scn2.nextInt();
		if (num2 % 2 == 0) {
			numOdd++;
		}
		
		System.out.print("Enter third number ");
		Scanner scn3 = new Scanner(System.in);
		num3 = scn3.nextInt();
		if (num3 % 2 == 0) {
			numOdd++;
		}

		System.out.printf("You entered %d odd numbers\n", numOdd);
		scn1.close();
		scn2.close();
		scn3.close();

	}

}
