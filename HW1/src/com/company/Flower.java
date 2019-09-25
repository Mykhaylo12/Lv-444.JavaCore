package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Flower bed is shaped like a circle.
// Calculate the perimeter and area by entering the radius.
// Output obtained results.
public class Flower {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Imput radius of flower bed");
        double radius = Double.parseDouble(br.readLine());
        double perimeter=2*3.14*radius;
        double area=2*3.14*radius*radius;
        System.out.println("Perimeter is "+perimeter);
        System.out.println("Area is "+area);
    }
}
