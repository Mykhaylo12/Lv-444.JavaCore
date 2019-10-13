package work5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//task1
		int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("enter the number of month");
		int x = Integer.parseInt(br.readLine());
		System.out.println("of days in this month = " + monthDays[--x]);
// task2
		int Arr[] = new int[10];
		for (int i = 0; i < Arr.length; i++) {
			System.out.println("Enter" + i + "number");
			Arr[i] = Integer.parseInt(br.readLine());
		}
		chek(Arr);
//task3 
		int Arr1[] = new int[5];
		for (int i = 0; i < Arr1.length; i++) {
			System.out.println("Enter " + i + " number");
			Arr1[i] = Integer.parseInt(br.readLine());
			}
		chek1(Arr1);
		chek2(Arr1);
	}
	static void chek2(int Arr1[]) {
		int min=Arr1[0];
		int position=0;
		for(int i = 1;i<Arr1.length;i++) {
			if(min>Arr1[i]) {
				min=Arr1[i];
				position=i;
			}
		}
		System.out.println("minimum = "+min+" and position in array = "+position);
		
	}
	static void chek1(int Arr1[]) {
		int x = 0;
		int i = 0;
		while(i<Arr1.length) {
			if(Arr1[i]>0) {
				x++;
			}
			if(x==2) {
				System.out.println("second positive number = "+Arr1[i]);
				break;
			}
			i++;
		
		}

	}
	static void chek(int Arr[]) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += Arr[i];
		}
		if (sum <= 0) {
			sum = 0;
			for (int i = 5; i < 10; i++) {
				sum = sum + Arr[i];
			}
			System.out.println("sum 5-10 numbers = " + sum);
		} else {
			System.out.println("sum 1-5 numbers = " + sum);
		}

	}
}