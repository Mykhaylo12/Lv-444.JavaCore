package com.softserve.lukas3;

public class YearCheck {
	public static void yearCheck(int year){
		if ((year<1900)||(year>2019)){
			System.out.println("Wrong year, year must be between 1900 and 2019.");
		} 
	}
}
