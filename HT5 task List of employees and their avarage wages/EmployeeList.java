package ht5task2;

public class EmployeeList {

	public static void main(String[] args) {

		Employee[] employees = new Employee[5];
		employees[0] = new SalariedEmployee("D001", "Max Max", 32553255, 14.00, 160);
		employees[1] = new SalariedEmployee("Q001", "Ad Ad", 325667788, 2.00, 150);
		employees[2] = new ContractEmployee("D001", "Test Test", 552244, 3000.00);
		employees[3] = new ContractEmployee("C001", "Di Di", 889977, 5000.00);
		employees[4] = new ContractEmployee("D002", "Ab Ab", 229988, 1000.00);

		Employee emlist;
		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].calculatePay() < employees[j].calculatePay()) {
					emlist = employees[i];
					employees[i] = employees[j];
					employees[j] = emlist;
				}
			}
		}
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
	}
}
