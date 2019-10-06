package homework5.kryvenkosergii_lv444;

public class ContractEmployee extends Employee implements Pay {

	private int fixedRate;
	private int federalTaxIdmember;
	private String employeeld;

	private int salary = 0;

	@Override
	public int calculatePay() {
		this.salary = salary + fixedRate;
		return salary;
	}

	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public int getSalary() {
		return salary;
	}

	public ContractEmployee() {

	}

	public ContractEmployee(String employeeld, int federalTaxIdmember, int fixedRate) {
		this.fixedRate = fixedRate;
		this.federalTaxIdmember = federalTaxIdmember;
		this.employeeld = employeeld;
		calculatePay();
	}

	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember= " + federalTaxIdmember + ", employeeld= " + employeeld
				+ ", fixedRate= " + fixedRate + ", salary= " + salary + "]";
	}

}
