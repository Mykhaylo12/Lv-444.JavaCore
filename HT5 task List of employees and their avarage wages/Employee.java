package ht5task2;

public class Employee implements PayCalculation {

	public String employeeld;
	public String FirstAndLastName;
	public double avMonthlySalary;
	
	public String toString() {
		return "Employee ID  " + employeeld + " Name " + FirstAndLastName + " Average Monthly Wage " + avMonthlySalary;
	}

	public double calculatePay() {
		return avMonthlySalary;
	}

}
