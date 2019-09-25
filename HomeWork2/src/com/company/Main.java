package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args)throws IOException {

        Person p1 = new Person("Ivan", "Shevchenko", 1990);
       Person p2 = new Person("Mary", "Syla", 1991);
        Person p3 = new Person("Roman", "Volos", 1989);
       Person p4 = new Person("Olga", "Potapenko", 1992);
       Person p5 = new Person("Stepan", "Bulba", 1988);
        System.out.println(p1.toString());
        System.out.println("Age of "+ p1.getFirstName() +" is "+p1.getAge());
    }
}
