package Homew3;

public class PersonM {

	public static void main(String[] args) {
		Person x1 = new Person();
		Person x2 = new Person("Orest", "Orestovuch");
		Person x3 = new Person();
		Person x4 = new Person("Dim", "Dimuch");
		Person x5 = new Person("Oleg", "Olegovuch");
		x1.input("Vasul", "Vasulovuch", 1984);
		x1.output();
		x1.getAge();
		x2.setBY(1899);
		x2.changeName("Ivan", "Ivanovuch");
		x2.output();
		x2.getAge();
		x3.input("Roman", "Romanovuch", 2000);
		x3.output();
		x3.getAge();
		x4.setBY(1940);
		x4.output();
		x4.getAge();
		x5.setBY(1960);
		x5.output();
		x5.getAge();
		
	
	}

}
