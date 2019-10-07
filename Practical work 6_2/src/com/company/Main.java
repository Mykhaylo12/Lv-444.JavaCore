package com.company;

public class Main {
    // Create next structure. In abstract class Person with property name, declare abstract method print().
    // In other classes in body of method print() output text “I am a …”. In class Staff declare abstract method salary().
    // In each concrete class create constant TYPE_PERSON. Output type of person in each constructors.
    // Create array of Person and add some Teachers, Cleaners and Students to it. Call method print() for all of it.
    // Call method salary() for all Teachers and Cleaner
    public static void main(String[] args) {
        Animal[] a = new Animal[4];
        a[0] = new Cat("myav", "fish");
        a[1] = new Cat("myav", "fish");
        a[2] = new Dog("gav", "meat");
        a[3] = new Dog("gav", "meat");
        a[0].voice();
        a[1].feed();
        a[2].voice();
        a[3].feed();


        Person[] p=new Person[3];
        p[0]= new Teacher(10000, "Teacher");
        p[1]=new Cleaner("Cleaner",6000);
        p[2]=new Student("Student");
                p[0].print();
                p[1].salary();
                p[2].print();

    }
}
