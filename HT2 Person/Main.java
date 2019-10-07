import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		Person p1 = new Person();
		p1.input();
		p1.output();
		p1.changeName();
		p1.output();
				
		Person p2 = new Person();
		p2.setFirstName("Olena");
		p2.setLastName("Zvir");
		p2.setBirthYear(1980);
		p2.output();

		Person p3 = new Person("Ira", "Vloh");
		p3.setBirthYear(1990);
		p3.output();

		Person p4 = new Person();
		p4.input();
		p4.output();

		Person p5 = new Person();
		p5.input();
		p5.output();
	}
}
