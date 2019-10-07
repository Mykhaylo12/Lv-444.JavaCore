package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//Create an array of ten integers. Display 
//the biggest of these numbers;
//the sum of positive numbers in the array;
//the amount of negative numbers in the array.
//       What values there are more: negative or positive?
//Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
//all employees of a certain department (enter department number in the console);
//arrange workers by the field salary in descending order.
//
public class Main {

    public static void main(String[] args) throws IOException {
        int array[] = {5, 18, 7, 13, 31, -21, 2, 2, 9, -3};
        System.out.println(Arrays.toString(array));
        //the biggest of these numbers;
        int smaller = array[0];
        int largest = array[0];
        for (int i = 0; i >= 9; i++) {
            if (array[i] < smaller) smaller = array[i];
        }
        System.out.println("The smallest element in array is " + array[smaller]);
        for (int i = 0; i >= 9; i++) {
            if (array[i] > largest) largest = array[i];
        }
        //the sum of positive numbers in the array;
        int sumPositive=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) sumPositive = sumPositive + array[i];
        }
        System.out.println("The sum of positive numbers in the array is "+sumPositive);
//the amount of negative numbers in the array.
        int amountNegative=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]< 0) amountNegative++;
        }
        System.out.println("The amount of negative numbers in the array is "+amountNegative);
        //       What values there are more: negative or positive?
        int amountPositive=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>= 0) amountPositive++; }
        if (amountPositive>amountNegative) System.out.println("Amount of positive numbers is  more");
        if (amountPositive<amountNegative) System.out.println("Amount of negative numbers is  more");
        if (amountPositive==amountNegative) System.out.println("Amount of positive and negative numbers is  same");

        Employee[] e =new  Employee[5];
        e[0]=new Employee("Ivan",1,1000);
        e[1]=new Employee("Oksana", 2, 1500);
        e[2]=new Employee("Oleg",3,1200);
        e[3]=new Employee("Igor", 2, 4000);
        e[4]=new Employee("Ira",1, 2200);
        //Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
//all employees of a certain department (enter department number in the console);

        Scanner in = new Scanner(System.in);
        System.out.println("Imput departament 1,2 or 3");
        //int n = in.nextInt();
        int n =2;
        for (int i = 0; i < e.length ; i++) {
            if (e[i].getDepartament()== n)
                System.out.println(e[i].getName()+" is from departament " +e[i].getDepartament()); }
//arrange workers by the field salary in descending order.


        Employee tmp = new Employee();
        for (int i = 0; i < emp.length-1; i++) {
            for (int j = i+1; j< emp.length; j++)
                if (emp[i].getSalary()<emp[j].getSalary()) {
                    tmp.setName(emp[i].getName());
                    tmp.setDepartmentNumber(emp[i].getDepartmentNumber());
                    tmp.setSalary(emp[i].getSalary());
                    emp[i].setDepartmentNumber(emp[j].getDepartmentNumber());
                    emp[i].setName(emp[j].getName());
                    emp[i].setSalary(emp[j].getSalary());
                    emp[j].setDepartmentNumber(tmp.getDepartmentNumber());
                    emp[j].setName(tmp.getName());
                    emp[j].setSalary(tmp.getSalary());
                }
        }
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].toString());
        }}}