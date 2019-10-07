package com.company;

public class SalariedEmployee  extends Employee {
    private int socialSecurityNumber;
    private int hourlyPaid;
    private int numberHours;
    private String name;
    private String employeeID;
    private int salary;


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber=" + socialSecurityNumber +
                ", hourlyPaid=" + hourlyPaid +
                ", numberHours=" + numberHours +
                ", name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int hourlyPaid ,int numberHours) {
        this.salary =hourlyPaid * numberHours;
    }

    public SalariedEmployee(int socialSecurityNumber, int hourlyPaid, int numberHours, String name, String employeeID) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyPaid = hourlyPaid;
        this.numberHours = numberHours;
        this.name = name;
        this.employeeID = employeeID;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHourlyPaid() {
        return hourlyPaid;
    }

    public void setHourlyPaid(int hourlyPaid) {
        this.hourlyPaid = hourlyPaid;
    }

    public int getNumberHours() {
        return numberHours;
    }

    public void setNumberHours(int numberHours) {
        this.numberHours = numberHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public int calculatePay() {
        return salary=hourlyPaid * numberHours;
    }
}
