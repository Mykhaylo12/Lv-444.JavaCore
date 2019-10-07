package com.company;

public class Main {
    //Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().  
    //Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
    //Create array Bird and add different birds to it.
    //Call fly() method for all of it. Output the
    //information about each type of created bird.
    public static void main(String[] args) {
        Bird[] b = new Bird[4];
        b[0] = new Chicken();
        b[1] = new Penguin();
        b[2] = new Swallow();
        b[3] = new Eagle();
        b[0].fly();
        b[1].fly();
        b[2].fly();
        b[3].fly();


    }
}
