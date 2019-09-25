import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Phone {
    //Phone calls from three different countries are с1, с2 and с3 standard units per minute.
// Talks continued t1, t2 and t3 minutes.
// How much computer will count for each call separately and all talk together?
// Input all source data from console, make calculations and output to the screen.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, imput rate plane of call from USA ,$ per minute");
        double usa = Double.parseDouble(br.readLine());
        System.out.println("Please, imput rate plane of call from Canada,$ per minute ");
        double canada = Double.parseDouble(br.readLine());
        System.out.println("Please, imput rate plane of call from Ukraine,$ per minute ");
        double ukraine = Double.parseDouble(br.readLine());
        System.out.println("How many minets you want to talk with USA ?");
        double usa_minute = Double.parseDouble(br.readLine());
        System.out.println("How many minets you want to talk with Canada?");
        double canada_minute = Double.parseDouble(br.readLine());
        System.out.println("How many minets you want to talk with Ukraine?");
        double ukraine_minute = Double.parseDouble(br.readLine());
        double usa_coust = usa * usa_minute;
        double canada_coust = canada * canada_minute;
        double ukraine_coust = ukraine * ukraine_minute;
        System.out.println("Your conversation with USA coust " + usa_coust + " $");
        System.out.println("Your conversation with Canada coust " + canada_coust + " $");
        System.out.println("Your conversation with Ukraine coust " + ukraine_coust + " $");
        System.out.println("Together you paid " + (usa_coust + canada_coust + ukraine_coust) + " $");

    }
}