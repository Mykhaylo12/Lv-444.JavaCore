package com.company;

public class Employee {
    public static double totalSum = 0;
    private String name;
    private double rate = 0;
    private double hours = 0;




    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }


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

    public double getSalary() {
        return rate * hours;


    }

    public double getBonus() {
        return getSalary() * 1.1;
    }

  public double changeRate(double rate){
        return this.rate=rate*1.1;
}
}


