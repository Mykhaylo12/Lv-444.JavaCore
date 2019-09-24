package homework3.kryvenkosergii_lv444;

import java.time.Year;
//import java.util.Scanner;

public class Person {
	private String firsName = null;
	private String lastName = null;
	private int birthYear = 0;
	private String info = null;

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
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

	public Person() {
	}

	public Person(String firsName, String lastName) {
		this.firsName = firsName;
		this.lastName = lastName;
	}

	protected int getAge() {
		return Year.now().getValue() - this.birthYear;
	}

	protected void input(String info) {
//		System.out.println("Enter information about person:");
//		@SuppressWarnings("resource")
//		Scanner scn = new Scanner (System.in);
//		return scn.next();
		this.info = info;
	}

	public String output() {
		return "Person [firsName=" + firsName + ", lastName=" + lastName + ", birthYear=" + birthYear + ", getAge()="
				+ getAge() + " info from person is " + this.info + "]";
	}

	public void changeName(String fN, String lN) {
		if (fN != null && lN != null) {
			this.firsName = fN;
			this.lastName = lN;
		} else if (fN != null && lN == null) {
			this.firsName = fN;
		} else if (fN == null && lN != null) {
			this.lastName = lN;
		}
	}

}
