package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Phone calls from three different countries are с1, с2 and с3 standard units per minute.
// Talks continued t1, t2 and t3 minutes.
// How much computer will count for each call separately and all talk together?
// Input all source data from console, make calculations and output to the screen.
public class PhoneClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Call usa = new Call();
        usa.money("USA");
        usa.price=Double.parseDouble(br.readLine());
        usa.time("USA");
        usa.duration=Double.parseDouble(br.readLine());
        double coust_usa = usa.duration * usa.price;

        Call canada = new Call();
        usa.money("Canada");
        canada.duration=Double.parseDouble(br.readLine());
        usa.time("Canada");
        canada.price=Double.parseDouble(br.readLine());
        double coust_canada = canada.duration * canada.price;

        Call ukraine = new Call();
        usa.money("Ukraine");
        ukraine.duration=Double.parseDouble(br.readLine());
        usa.time("Ukraine");
        ukraine.price=Double.parseDouble(br.readLine());
        double coust_ukraine = ukraine.duration * ukraine.price;

        System.out.println("Your conversation with USA coust " + coust_usa + " $");
        System.out.println("Your conversation with Canada coust " + coust_canada + " $");
        System.out.println("Your conversation with Ukraine coust " + coust_ukraine + " $");
        System.out.println("Together you paid " + (coust_usa + coust_canada + coust_ukraine) + " $");


    }
}
