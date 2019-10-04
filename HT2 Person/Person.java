import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Person {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private String firstName;
	private String lastName;
	private int birthYear;

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

	public Person() {
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {
		return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
	}

	public void input() throws IOException {
		System.out.println("What is your first name?");
		String firstName = br.readLine();
		this.firstName = firstName;
		System.out.println("What is your last name?");
		String lastName = br.readLine();
		this.lastName = lastName;
		System.out.println("What is your birth year?");
		int birthYear = Integer.parseInt(br.readLine());
		this.birthYear = birthYear;
	}

	public void output() {
		System.out.println(firstName + " " + lastName + " " + getAge() + " years");
	}

	public void changeName() throws IOException {
		System.out.println("What is your NEW first name?");
		String firstName = br.readLine();
		this.firstName = firstName;
		System.out.println("What is your NEW last name?");
		String lastName = br.readLine();
		this.lastName = lastName;
	}

	public String toString() {
		return firstName + " " + lastName + " " + birthYear;
	}
}
