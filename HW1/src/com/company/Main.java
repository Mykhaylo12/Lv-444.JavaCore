package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // Define String variables name and address. Output question "What is your name?"
        // Read the value name and output next question: “Where are you live, (name)?".
        // Read address and write whole information.
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where are you live, " + name + " ?");
        String city = br.readLine();
        System.out.println(name + " is living " + city);
    }
}
