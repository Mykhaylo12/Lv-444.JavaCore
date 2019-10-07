package ht5task2;

public class SalariedEmployee extends Employee implements PayCalculation {

	private int socialSecurityNumber;
	private double hourlyRate;
	private double workedHours;

	SalariedEmployee(String employeeld, String FirstAndLastName, int socialSecurityNumber, double hourlyRate,
			double workedHours) {
		this.employeeld = employeeld;
		this.FirstAndLastName = FirstAndLastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.workedHours = workedHours;
	}

	public String getFirstAndLastName() {
		return FirstAndLastName;
	}

	public void setFirstAndLastName(String firstAndLastName) {
		FirstAndLastName = firstAndLastName;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(double workedHours) {
		this.workedHours = workedHours;
	}

	public double calculatePay() {
		return avMonthlySalary = hourlyRate * workedHours;
	}

}
