package com.softserve.lukas3;

import java.io.IOException;



public class Appl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int deptSalesPersonsCount =2;
		
		Person deptSalesPersons[] = new Person[deptSalesPersonsCount];
		
		for (int i=0;i<deptSalesPersonsCount;i++){
			deptSalesPersons[i]=new Person();
			deptSalesPersons[i].setFirstName(Input.input(Person.INPUT_FIRST_NAME)); 
			deptSalesPersons[i].setLastName(Input.input(Person.INPUT_LAST_NAME));
			deptSalesPersons[i].setBirthYear(Integer.parseInt(Input.input(Person.INPUT_BIRTH_YEAR)));
		}
	Output.output("First Name: " + deptSalesPersons[0].getFirstName());
	Output.output("Age = "+String.valueOf(deptSalesPersons[0].getAge()));
	
	deptSalesPersons[1].changeName("Berta", "Lay");
	
	
	}

}
