package com.company;

public class Main {

    //Create an interface to the method calculatePay(), the base class Employee with a string variable employeeld.
// Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class.
//Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child).
//Describe the string variable socialSecurityNumber in the class SalariedEmployee .
//Include a description of federalTaxIdmember in the class of ContractEmployee.

    //The calculation formula for the "time-worker“ is: the average monthly
    //	salary = hourly rate * number of hours worked
    //For employees with a fixed payment the formula is: the average monthly 	salary = fixed monthly payment
    //Create an array of employees and add the employees with different form of payment.
    //Arrange the entire sequence of workers descending the average monthly wage.
    // Output the employee ID, name, and the average monthly wage for all elements of the list.
    public static void main(String[] args) {
        Employee[]e=new Employee[4];
        e[0]= new ContractEmployee(83848, 5000,"Ken","9877");
        e[1]= new ContractEmployee(43344,8000,"Zou","3443");
        e[2]= new SalariedEmployee(83610, 10, 168,"Stew", "6855");
        e[3]= new SalariedEmployee(53711, 25, 168,"Mary", "2610");
       System.out.println(e[0].calculatePay());
        System.out.println(e[1].calculatePay());
        System.out.println(e[2].calculatePay());
        System.out.println(e[3].calculatePay());


//arrange workers by the field salary in descending order.--не знав як виконати останнє завдання

//        int tmp;
//        for (int i = 0; i < e.length - 1; i++) {
//            for (int j = i + 1; j < e.length; j++) {
//                if (e[i].calculatePay() < e[j].calculatePay()) {
//                    tmp = e[i].calculatePay();
//                    e[i].calculatePay(e[j].calculatePay());
//                    e[j].calculatePay()=tmp;
//                }
//            }
//        }
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].toString());
    }
}}
