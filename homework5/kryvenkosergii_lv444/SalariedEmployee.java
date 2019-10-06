package homework5.kryvenkosergii_lv444;

public class SalariedEmployee extends Employee implements Pay {

	private int hourlyRate;
	private int socialSecurityNumber;
	private int hours;
	private int salary = 0;
	private String employeeld;

	@Override
	public int calculatePay() {
		this.salary = salary + hourlyRate * hours;
		return salary;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public int getSalary() {
		return salary;
	}

	public SalariedEmployee() {

	}

	public SalariedEmployee(String employeeld, int socialSecurityNumber, int hourlyRate, int hours) {
//		super();
		this.hourlyRate = hourlyRate;
		this.socialSecurityNumber = socialSecurityNumber;
		this.hours = hours;
		this.employeeld = employeeld;
		calculatePay();
	}

	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber= " + socialSecurityNumber + ", employeeld= " + employeeld
				+ ", hourlyRate= " + hourlyRate + ", salary= " + salary + "]";
	}

}
