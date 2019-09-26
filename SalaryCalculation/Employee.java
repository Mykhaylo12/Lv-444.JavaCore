
public class Employee {

	private String name;
	private double rate;
	private double hours;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public Employee() {}

	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, double rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public double getSalary() {
		salary = rate * hours;
		return salary;
	}

	public String toString() {
		return "Employee name " + name + ", rate " + rate + ", hours " + hours;
	}

	public double changeRate(double newRate) {
		return rate = newRate;
	}

	public double getBonuses() {
		double revisedSalary = getSalary() * 1.1;
		return revisedSalary;
	}

}
