package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Call {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        public double price=5;;
        public double duration=5;;

    public void money(String country){
        System.out.println("Please, imput rate plane of call to "+ country+ " ,$ / minute");
}
    public void time(String country) {
        System.out.println("How many minets you want to talk with "+ country + " ?");
    }
    }
