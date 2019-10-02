package classwork5.kryvenkosergii_lv44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App2 {

	public static void main(String[] args) throws IOException {

		Employee[] emp = { new Employee("Bob", 1, 5), new Employee("Jim", 3, 2), new Employee("Sam", 2, 10),
				new Employee("Fox", 3, 7), new Employee("Sally", 1, 10) };

		// all employees of a certain department
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of department");
		String text = br.readLine();
		int numDepartment = Integer.parseInt(text);

		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getDepartmentNumber() == numDepartment) {
				System.out.println("An employee from the chosen department is " + emp[i].getName());
			}
		}

		// arrange workers by the field salary in descending order using the bubble method
		Employee tmp = new Employee();
		for (int i = 0; i < emp.length-1; i++) {
			for (int j = i+1; j< emp.length; j++)
				if (emp[i].getSalary()<emp[j].getSalary()) {
					tmp.setName(emp[i].getName());
					tmp.setDepartmentNumber(emp[i].getDepartmentNumber());
					tmp.setSalary(emp[i].getSalary());
					emp[i].setDepartmentNumber(emp[j].getDepartmentNumber());
					emp[i].setName(emp[j].getName());
					emp[i].setSalary(emp[j].getSalary());
					emp[j].setDepartmentNumber(tmp.getDepartmentNumber());
					emp[j].setName(tmp.getName());
					emp[j].setSalary(tmp.getSalary());
				}
		}
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].toString());
		}

	}

}
