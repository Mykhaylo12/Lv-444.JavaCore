
public class Main {

	public static void main(String[] args) {

		Employee Employee1 = new Employee("Oleg", 3);
		Employee1.setHours(160);
		Employee1.getSalary();
		Employee1.getBonuses();
		Employee Employee2 = new Employee("Olena", 2, 160);
		Employee2.getSalary();
		Employee2.getBonuses();
		Employee Employee3 = new Employee();
		Employee3.setName("Anna");
		Employee3.setRate(1);
		Employee3.setHours(160);
		Employee3.getSalary();
		Employee3.getBonuses();
		Employee[] employees = { Employee1, Employee2, Employee3 };

		Summarizer s = new Summarizer();

		System.out.println(Employee1.getBonuses());
		System.out.println(Employee2.getBonuses());
		System.out.println(Employee3.getBonuses());
		System.out.println(s.getTotalSum(employees));

	}

}
