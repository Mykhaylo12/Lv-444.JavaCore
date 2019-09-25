package com.softserve.lukas3;

import java.io.IOException;

public class Person {
	//Declare CONSTANT current YEAR
	private static final int CURRENT_YEAR = 2019;
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
		return CURRENT_YEAR-this.birthYear;
	}
	public void changeName(String fs, String ls) throws IOException{
		System.out.println("Do you want to change a name for " + this.getFirstName()+" "+this.getLastName()+ "? Type y for Yes or n for Not");
		sAnswerChangeName=Input.input("Your Answer");
		if (sAnswerChangeName.equals("y"))
		{
			if (fs.length()>0){
			this.setFirstName(fs);
			}
			if (ls.length()>0){
			this.setLastName(ls);
			}	
			Output.output("New name is "+fs+" "+ls);
		
		}

	}
}
