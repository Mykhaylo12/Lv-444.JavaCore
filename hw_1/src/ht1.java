import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ht1 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("||||||||||Task1||||||||||" );
        System.out.println("Enter radius of a circle");
        int r = Integer.parseInt(a.readLine());
        System.out.println("Permiter of the cirkle is " + r * 3.14);
        System.out.println("Area of the circle is " + r * r * 3.14);

        System.out.println("||||||||||Task2||||||||||");
        System.out.println("What is your name?");
        String name = a.readLine();
        System.out.println("Where are you live, " + name + "?");
        String place = a.readLine();
        System.out.println("Your name is " + name + " and you live in " + place);

        System.out.println("||||||||||Task3||||||||||");
        System.out.println("How many calls was taken from 1-st country?");
        int c1 = Integer.parseInt(a.readLine());
        System.out.println("How many minutes single call take from 1-st country");
        int t1 = Integer.parseInt(a.readLine());
        System.out.println("How many calls was taken from 2-nd country?");
        int c2 = Integer.parseInt(a.readLine());
        System.out.println("How many minutes single call from 2-nd country");
        int t2 = Integer.parseInt(a.readLine());
        System.out.println("How many minutes was taken from 3-rd country?");
        int c3 = Integer.parseInt(a.readLine());
        System.out.println("How many minutes single call from 3-rd country");
        int t3 = Integer.parseInt(a.readLine());
        System.out.println("For the 1-st country " + (c1 * t1) + " minutes was taken");
        System.out.println("For the 2-nd country " + (c2 * t2) + " minutes was taken");
        System.out.println("For the 3-rd country " + (c3 * t3) + " minutes was taken");
        System.out.println("For all countries " + (c1 * t1 + c2 * t2 + c3 * t3) + " minutes was taken");
    }
}