package pt3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class app {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input three numbers:");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int count = 0;
        if (a%2 != 0){
            count++;
        }
        if (b%2 != 0){
            count++;
        }
        if (c%2 != 0){
            count++;
        }
        System.out.println(count);

        //================================================

        System.out.println("Input number of the day:");
        int dayNumber = Integer.parseInt(br.readLine());
        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 9:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong input");
        }

        //======================================================================
        System.out.println("Input number of the day:");
        String countryName = br.readLine();






    }
}
