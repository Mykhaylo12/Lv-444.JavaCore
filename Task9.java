package com.company;

import java.util.Scanner;

//9.Write method to return random value 0 or 1.
// Input number n, call this method n times and calculate how many times were number one
public class Task9 {
    public static void randomValue() {
        System.out.println("How many times you want to run this function?");
        Scanner sc = new Scanner(System.in);
        int n=0;
        try {
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Math.round(Math.random()));
        }
    }
}

