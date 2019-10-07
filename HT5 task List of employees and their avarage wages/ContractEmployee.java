package ht5task2;

public class ContractEmployee extends Employee implements PayCalculation {

	private int federalTaxIdNumber;
	private double fixedMonthlyPayment;
	
	public int getFederalTaxIdNumber() {
		return federalTaxIdNumber;
	}

	public void setFederalTaxIdNumber(int federalTaxIdNumber) {
		this.federalTaxIdNumber = federalTaxIdNumber;
	}

	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	ContractEmployee(String employeeld, String FirstAndLastName, int federalTaxIdNumber, double fixedMonthlyPayment) {
		this.employeeld = employeeld;
		this.FirstAndLastName = FirstAndLastName;
		this.federalTaxIdNumber = federalTaxIdNumber;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public double calculatePay() {
		return avMonthlySalary = fixedMonthlyPayment;

	}

}
