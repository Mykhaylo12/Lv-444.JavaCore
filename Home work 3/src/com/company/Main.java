package com.company;

import java.lang.Float;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//        Solve the next tasks:
//        read 3 float numbers and check: are they all belong to the range [-5,5];
//        read 3 integer numbers and write max and min of them;
//        read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
//        Сreate class Dog with fields name, breed, age.
//        Declare enum for field breed.
//        Create 3 instances of type Dog.
//        Check if there is no two dogs with the same name.
//                Display the name and the kind of the oldest dog.
//                *Add Unit Tests to each task, publish code on GitHub
public class Main {

    public static void main(String[] args) throws IOException {
        float num1 = 2.0f;
        float num2 = 8.2f;
        float num3 = 2.0f;
//        read 3 float numbers and check: are they all belong to the range [-5,5];
        if ((-5 <= num1) && (num1 <= 5)) {
            System.out.println("num1 is belong to the range [-5,5]");
        }
        if ((-5 <= num2) && (num2 <= 5)) {
            System.out.println("num2 is belong to the range [-5,5]");
        }
        if ((-5 <= num3) && (num3 <= 5)) {
            System.out.println("num3 is belong to the range [-5,5]");
        }
        //        read 3 integer numbers and write max and min of them;
        int i1 = 2;
        int i2 = 19;
        int i3 = -8;
        if ((i1 < i2) && (i2 < i3)) {
            System.out.println("i1 is min, i3 is max");
        }
        if ((i3 < i1) && (i1 < i2)) {
            System.out.println("i3 is min, i2 is max");
        }
        if ((i2 < i3) && (i3 < i1)) {
            System.out.println("i2 is min, i1 is max");
        }



    //        read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
  //  public enum HTTPEerror {E400("HTTP 400 Bad Request"), E401("HTTP 401 Unauthorized "), E402("402 Payment Required"), E403("HTTP 403 Forbidden")}
// я закоментував всюди енами бо розкоментувавши я отримаю багато помилок і я не знаю як їх виправити
//    public HTTPEerror(String httpEerror) {
//        this.httpEerror = httpEerror;
//        HTTPEerror httpEerror = HTTPEerror.E401;
//        String error = "E401";

    //        Declare enum for field breed.
    //public enum Breed {PITBULL, SPANIEL, DOBERMAN}
    //        Create 3 instances of type Dog.
    //heck if there is no two dogs with the same name.
//                Display the name and the kind of the oldest dog.
    Dog dog1= new Dog("Jack","PITBULL", 5 );
    Dog dog2= new Dog("Alfa","SPANIEL", 2 );
    Dog dog3= new Dog("Qvarck","DOBERMAN", 3);

      if (dog1.getName().equalsIgnoreCase((dog2.getName())))    {
        System.out.println("First and sacond dogs have the same name");}
          if (dog2.getName().equalsIgnoreCase((dog3.getName())))    {
              System.out.println("Sacond and third dogs have the same name");}
              if (dog3.getName().equalsIgnoreCase((dog1.getName())))    {
                  System.out.println("Third and first dogs have the same name");}
              else{
                  System.out.println("Our dogs have different names");}


        if((dog1.hashCode()<dog2.hashCode())&&(dog2.hashCode()<dog3.hashCode())){
            System.out.println(dog3.getName()+"  is the older");}
        else if((dog2.hashCode()<dog3.hashCode()&&(dog3.hashCode()<dog1.hashCode()))){
            System.out.println(dog1.getName()+"  is the older");}
        else if((dog3.hashCode()<dog1.hashCode())&&(dog1.hashCode()<dog2.hashCode())){
            System.out.println(dog2.getName()+"  is the older");}
        else{
            System.out.println("Some of the dogs have same age");}


        }
    }

