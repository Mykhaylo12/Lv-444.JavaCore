package com.company;

public class  ContractEmployee extends Employee {
    private int federalTaxIdmember;
    private int fixedPaid;
    private String name;
    private String employeeID;
    private int salary=fixedPaid;


    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember=" + federalTaxIdmember +
                ", fixedPaid=" + fixedPaid +
                ", name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int getFixedPaid) {
        this.salary = getFixedPaid();

    }


        public ContractEmployee(int federalTaxIdmember, int fixedPaid, String name, String employeeID) {
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedPaid = fixedPaid;
        this.name = name;
        this.employeeID = employeeID;
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(int federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getFixedPaid() {
        return fixedPaid;
    }

    public void setFixedPaid(int fixedPaid) {
        this.fixedPaid = fixedPaid;
    }
//    public int getsalary(){
//        int salary
//        return salary=getFixedPaid();
//    }

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
        return salary=fixedPaid;
    }
}
