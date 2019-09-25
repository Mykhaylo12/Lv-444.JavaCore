package Homew3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
private String FN;
private String LN;
private int BY;
LocalDate date = LocalDate.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
private int d = Integer.parseInt(date.format(formatter));
public Person() {}
public Person(String fN, String lN) {
	FN = fN;
	LN = lN;
}
public void setFN(String fN) {
	FN = fN;
	}
public void setLN(String lN) {
	LN = lN;
	}
public int getBY() {
	return BY;
	}
public void setBY(int bY) {
	BY = bY;
	}
public void getAge() {
	if (BY!=0) {
	System.out.println("Age of this person = "+(d-BY));
}
	else {
		System.out.println("You don't enter Birth Year");
	}
}
public void input(String fn, String ln, int by ) {
	this.FN=fn;
	this.LN=ln;
	this.BY=by;
}
public void output() {
	System.out.println( "Person [FN=" + FN + ", LN=" + LN + ", BY=" + BY + "]");
}
public void changeName(String fn, String ln) {
	this.FN=fn;
	this.LN=ln;
}







}
