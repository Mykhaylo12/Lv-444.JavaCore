package com.softserve.lukas6;

public class Employee implements CalculatePay {
	String employeeld = null;
	private double wage = 0;
	private String name = null;
	
	public Employee() {

	}
	
	public Employee(String name) {
		this.name = name;
	}

	public Employee(String employeeld, String name) {
		this.employeeld = employeeld;
		this.name = name;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String toString() {
		return "Employee [employeeld=" + employeeld 
				+ ", name=" + name + ", wage=" + wage + "]";
	}

	public void calculatePay() {
		System.out.println(this.toString());
		// TODO Auto-generated method stub
		
	}



}
