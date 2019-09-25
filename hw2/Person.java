package com.softserve.lukas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {
	//Declare CONSTANT current YEAR
//	private static final int CURRENT_YEAR = 2019;
	protected static final String INPUT_FIRST_NAME = "Input Person's First Name";	
	protected static final String INPUT_LAST_NAME = "Input Person's Last Name";	
	protected static final String INPUT_BIRTH_YEAR = "Input Birth Year";
	
	private String firstName;
	private String lastName;
	private int birthYear;
//	private boolean bConfirmationChangeName =false;
	private String sAnswerChangeName;

	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Person (){
		
	};
	
	public int getAge(){
        LocalDate date = LocalDate.now();
		return date.getYear()-this.birthYear;
	}
	public static void yearCheck(int year){
		if ((year<1900)||(year>2019)){
			System.out.println("Wrong year, year must be between 1900 and 2019.");
		} 
	}
	public static void output(String output){
		System.out.println("Information about person: ");
		System.out.println("   " +output);
	}
	
	public static String input(String name) throws IOException{
		System.out.println(name+":");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		return br.readLine();
	}
	public void changeName(String fs, String ls) throws IOException{
		System.out.println("Do you want to change a name for " + this.getFirstName()+" "+this.getLastName()+ "? Type y for Yes or n for Not");
		sAnswerChangeName=input("Your Answer");
		if (sAnswerChangeName.equals("y"))
		{
			if (fs.length()>0){
			this.setFirstName(fs);
			}
			if (ls.length()>0){
			this.setLastName(ls);
			}	
			output("New name is "+fs+" "+ls);
		
		}

	}
}
