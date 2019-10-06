package com.softserve.lukas6;

public class SalariedEmployee extends Employee implements CalculatePay{
	
	private String socialSecurityNumber = null;
	private double rate = 0;
	private int hours = 0;
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
		super.employeeld=socialSecurityNumber;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public SalariedEmployee(String name,String socialSecurityNumber, double rate) {
		super(name);
		this.socialSecurityNumber = socialSecurityNumber;
		super.employeeld=socialSecurityNumber;
		this.rate = rate;
	}

	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
		calculatePay();
	}
	
	public void calculatePay (){
		if (this.hours>0) {
			super.setWage(this.hours*this.rate);			
		} else {
			System.out.println("Number of hours worked is 0");
		}

		
	}
}
