package com.company;

import java.util.*;
import java.util.Scanner;

public class Task4 {

    public static void CalculateWords(){
        System.out.println("Input word or sentense");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String []inputArray=input.split(" ");
        System.out.println("You entered "+inputArray.length+" word(s)");
    }
}
