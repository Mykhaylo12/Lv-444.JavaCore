package com.softserve.lukas6;

public class ContractEmployee extends Employee implements CalculatePay{
	private String federalTaxIdmember = null;
	private double fixedMonthlyPayment = 0;
	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}
	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}
	public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
	//Construct
	public ContractEmployee(String name,String federalTaxIdmember,
			double fixedMonthlyPayment) {
		super(name);
		this.federalTaxIdmember = federalTaxIdmember;
		super.employeeld = federalTaxIdmember;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void calculatePay (){
		
		super.setWage(this.fixedMonthlyPayment);
		
	}

}
