package com.softserve.lukas3;

import java.io.IOException;



public class Appl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int deptSalesPersonsCount =2;
		
		Person deptSalesPersons[] = new Person[deptSalesPersonsCount];
		
		for (int i=0;i<deptSalesPersonsCount;i++){
			deptSalesPersons[i]=new Person();
			deptSalesPersons[i].setFirstName(Person.input(Person.INPUT_FIRST_NAME)); 
			deptSalesPersons[i].setLastName(Person.input(Person.INPUT_LAST_NAME));
			deptSalesPersons[i].setBirthYear(Integer.parseInt(Person.input(Person.INPUT_BIRTH_YEAR)));
		}
	Person.output("First Name: " + deptSalesPersons[0].getFirstName());
	Person.output("Age = "+String.valueOf(deptSalesPersons[0].getAge()));
	
	deptSalesPersons[1].changeName("Berta", "Lay");
	
	
	}

}
