package com.company;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //Ask user to enter the number of month. Read the value and write the amount of days in this month (create array with amount days of each month).
//Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
//Enter 5 integer numbers. Find
//position of second positive number;
//minimum and its position in the array.
//Organize entering integers until the first negative number. Count the product of all entered even numbers.
//Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
//certain model year  (enter year in the console);
//ordered by the field year.
    public static void main(String[] args) {
        System.out.println("Enter the number of month");
        int monthDays[] = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 1 && n <= 12) {
            System.out.println("Month number " + n + " has " + monthDays[n - 1] + " days");
        } else {
            System.out.println("Wrong!");
        }
        //Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
        int arr1[] = {3, 5, 1, -6, 2, 7, 0, -22, 11, 5};
        int sum1 = 0;
        for (int i = 0; i <= 4; i++) {
            sum1 = arr1[i] + sum1;
        }
        ;
        System.out.println("Sum of first 5 elements in arr1 is " + sum1);

        int product1 = 1;
        for (int i = 5; i <= 9; i++) {
            if (arr1[i] == 0) continue;
            product1 = product1 * arr1[i];
        }
        System.out.println("Product of last 5 element arr1 exept 0 element is " + product1);
//Enter 5 integer numbers. Find position of second positive number;
//minimum and its position in the array.
        int arr2[] = {2, 3, -3, 2, -4};
        int positive = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > 0) positive++;
            if (positive == 2) System.out.println(arr2[i] + " is second  positive number");
        }

        int min = arr2[0];
        int imin = 0;
        for ( int i = 0;i<arr2.length;i++){
            if (arr2[i] < min) {
                min = arr2[i];
                imin = i; }
        }System.out.println(min+" is min element with position "+(imin+1));
        //Organize entering integers until the first negative number. Count the product of all entered even numbers.
int product2=1;
        for (int i=0;i<arr2.length;i++){if (arr2[i]<0)break;
                System.out.println((i+1)+" positive number is "+arr2[i]);
        if((arr2[i]%2)==0)product2=product2*arr2[i];}
        System.out.println("Product of all entered even numbers is "+ product2);

        //Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
//certain model year  (enter year in the console);
//ordered by the field year.
        Car[] v =new  Car[5];
        v[0]=new Car("Sedan",2000,110);
        v[1]=new Car("Picap", 2018, 150);
        v[2]=new Car("Jeep",2009,190);
        v[3]=new Car("Crossover", 2013, 120);
        System.out.println("We have cars from 2000, 2009, 2013 and 2018 yers. Imput year and we will show you this car");
        int year=in.nextInt();

        switch (year){
        case 2000:
        System.out.println(v[0].toString());
        break;
        case 2018: System.out.println(v[1].toString());
        break;
        case 2009: System.out.println(v[2].toString());
        break;
        case 2013:
        System.out.println(v[3].toString());
        break;
        default:
            System.out.println("Wrong!");}


    }}
