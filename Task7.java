import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    // public static void main (String [] args)   throws IOException {

    public static void getFactorial ()  throws IOException {
    int n = 1;
    int m = 1;
    String b = new String("Wrong number");
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter naturar positive number");
    int number = Integer.parseInt(read.readLine());
         //return ;
         // System.out.println("Invalid number");
         if (number < 0) {
             return;
         }
    if (number == 0) {
        System.out.println("Factorial " + number + " is 1");
    } else {
        for (int i = 1; i <= number; i++) {
            n = m * n;
            m++;

        }
        System.out.println(n);
    }
    }
}
