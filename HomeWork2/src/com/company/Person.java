package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear=1990;

    BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
    //String br.readLine()=lastName;
    public Person(String firstName, String lastName, int birthYear)throws IOException {
        this.firstName = br.readLine();
        this.lastName = br.readLine();
        this.birthYear = Integer.parseInt(br.readLine());
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge(){
        return 2019-getBirthYear();
    }



}
