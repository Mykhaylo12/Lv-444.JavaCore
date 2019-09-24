
public class Employee {

	private int rate;
	private String name;
	private int hour;
	private boolean bonus =false;
	
	private static double salaryBonus = 0.1;
	private static double totalSum;
	
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
		if (this.hour != 0) {
			totalSum=totalSum+this.hour*rate;
			if (this.bonus=true) {totalSum=totalSum+this.hour*rate*salaryBonus;}
		}
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
		if (this.rate != 0) {
			totalSum=totalSum+this.hour*rate;
			if (this.bonus==true) {totalSum=totalSum+hour*this.rate*salaryBonus;}
		}
	}
	
	
	
	public static double getTotalSum() {
		return totalSum;
	}

	public Employee() {

	}
	
	public Employee(int rate, String name, int hour) {

		this.rate = rate;
		this.name = name;
		this.hour = hour;
		totalSum=totalSum+rate*hour;
		
	}
	public Employee(int rate, String name) {
		super();
		this.rate = rate;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [rate=" + rate + ", name=" + name + ", hour=" + hour +", bonus=" + bonus + "]";
	}
	
	public double getSalary() {
	return this.rate*this.hour;
	
	}
	public double getBonus(){
		
		return this.getSalary()*salaryBonus;
		
	}
	public void changeRate(int rate) {

		this.rate=rate;
	
	}
	public boolean isBonus() {
		return bonus;
	}
	public void setBonus(boolean bonus) {
		if (this.bonus!=bonus) {
			if (bonus) {totalSum=totalSum+this.rate*this.hour*salaryBonus;}  
			if (!bonus) {totalSum=totalSum-this.rate*this.hour*salaryBonus;}			
		}
		this.bonus = bonus;
	}
	
	
}
