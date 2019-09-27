package com.company;

public class Employee {
    public static double totalSum = 0;
    private String name;
    private double rate = 0;
    private double hours = 0;
int count =0;



    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        count++;
        totalSum = totalSum + hours*rate*1.1;
    }

    public static double getTotalSum(){
        return totalSum;
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
        totalSum = totalSum - hours*rate*1.1;
        this.rate = rate;
        totalSum = totalSum + hours*rate*1.1;

    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        totalSum = totalSum - hours*rate*1.1;
        this.hours = hours;
        totalSum = totalSum + hours*rate*1.1;

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

    public double totalSum(double... nums) {

    double sum = getBonus();

        for(int i=0;i<count;i++) {
          sum += count;
      }
        return sum; //return the sum

    }

    @Override
    public String toString() {
        return "name " + name + " salary " + getSalary()*1.1;
    }
}



