package com.company;
//import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Enter three numbers. Find out how many of them are odd.
//Enter the number of the day of the week. Display the name in three languages.
//Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
//Create class Product with fields name, price and quantity.
//Create four instances of type Product.
//Display the name and quantity of the most expensive item.
//Display the name of the items, which has the biggest quantity.
public class Main {

    public static void main(String[] args)throws IOException {
		double num1 = 6;
		double num2 = 2;
		double num3 = 11;
		int i = 0;
//Enter three numbers. Find out how many of them are odd.
		if (num1 % 2 == 0) {
			i++;
		}
		if (num2 % 2 == 0) {
			i++;
		}
		if (num3 % 2 == 0) {
			i++;
		}
		System.out.println("We have " + i + " odd numbers");

//Enter the number of the day of the week. Display the name in three languages.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Imput the number of the day of the week from 1 to 7");
    String day = br.readLine();

switch(day)
	{
		case "1":
			System.out.println("Day numer 1 is Monday , Понеділок");
			break;
		case "2":
			System.out.println("Day numer 2 is Tuesday, Вівторок");
			break;
		case "3":
			System.out.println("Day numer 3 is Wednesday , Четвер");
			break;
		case "4":
			System.out.println("Day numer 4 is Thursday , Понеділок");
			break;
		case "5":
			System.out.println("Day numer 5 is Friday , П'ятниця");
			break;
		case "6":
			System.out.println("Day numer 6 is Saturday , Субота");
			break;
		case "7":
			System.out.println("Day numer 7 is Sunday , Неділя");
			break;
		default:
			System.out.println("Wrong!");

	}
//		System.out.println(Country.valueOf());//Error:(11, 5) java: class, interface, or enum expected
//		//Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
//		switch(Country.USA)
//		{
//			case POLAND:
//				System.out.println("POLAND is EOUROPE");
//				break;
//			case USA:
//				System.out.println("USA is NOTH AMERICA");
//				break;
//			case BRAZIL:
//				System.out.println("BRAZIL is SOUTH AMERICA");
//				break;
//			case EGYPT:
//				System.out.println("EGYPT is AFRICA");
    }
//Create class Product with fields name, price and quantity.
//Create four instances of type Product.
//Display the name and quantity of the most expensive item.
//Display the name of the items, which has the biggest quantity.
		Product iphone=new Product("iphone",1000,8);
		Product samsung=new Product("Samsung", 900,10);
		Product xciomi=new Product("Xciomi", 800,12);
		Product htc=new Product("HTC", 800, 7);
	public void mostExpensive(){
		if(iphone.getPrice()>samsung.getPrice()>xciomi.getPrice()>htc.getPrice()){
			System.out.println(iphone.getQuantity() +" "+ iphone.getName() " in store");
		}
		if(samsung.getPrice()>xciomi.getPrice()>htc.getPrice()>iphone.getPrice()){
			System.out.println(samsung.getQuantity() +" "+ samsung.getName() " in store");
		}
		if(xciomi.getPrice()>htc.getPrice()>iphone.getPrice()>samsung.getPrice()){
			System.out.println(xciomi.getQuantity() +" "+ xciomi.getName() " in store");
		}
		if(htc.getPrice()>iphone.getPrice()>samsung.getPrice()>xciomi.getPrice()) {
			System.out.println(htc.getQuantity() +" "+ htc.getName() " in store");
		}else{
			System.out.println("Some of the goods has same price");
		}

		//Display the name of the items, which has the biggest quantity.
		if(iphone.getQuantity()>samsung.getQuantity()>xciomi.getQuantity()>htc.getQuantity()){
			System.out.println(iphone.getName() +" "+ iphone.getPrice() " in store");
		}
		if(samsung.getQuantity()>xciomi.getQuantity()>htc.getQuantity()>iphone.getQuantity()){
			System.out.println(samsung.getName() +" "+ samsung.getPrice() " in store");
		}
		if(xciomi.getQuantity()>htc.getQuantity()>iphone.getQuantity()>samsung.getQuantity()){
			System.out.println(xciomi.getName() +" "+ xciomi.getPrice() " in store");
		}
		if(htc.getQuantity()>iphone.getQuantity()>samsung.getQuantity()>xciomi.getQuantity()) {
			System.out.println(htc.getName() +" "+ htc.getPrice() " in store");
		}else{
			System.out.println("Some of the goods has same quantity");
		}
}

