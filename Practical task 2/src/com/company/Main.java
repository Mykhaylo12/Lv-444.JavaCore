package com.company;

public class Main {

    public static void main(String[] args) {
	Employee e1=new Employee("Dima", 50,160);
        Employee e2=new Employee("Taras", 70,168);
        Employee e3=new Employee("Ivan", 60,165);
        Employee e4=new Employee("Ivan", 60,165);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(Employee.getTotalSum());
//        Employee.totalSum=e1.getBonus()+e2.getBonus()+e3.getBonus();//сума виплат до changeRate()
//        System.out.println("Total paymant wit bonus is "+Employee.totalSum);
//        System.out.println("Rate of Ivan was changed on 10% up to " + e3.changeRate(e3.getRate()));
//        Employee.totalSum=e1.getBonus()+e2.getBonus()+e3.getBonus();
//        System.out.println("New total paymant wit bonus is "+Employee.totalSum);//сума виплат після e3.changeRate()
        //System.out.println(e2.totalSum());
    }
}
