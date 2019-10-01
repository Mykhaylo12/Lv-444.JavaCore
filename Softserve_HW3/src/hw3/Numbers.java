package hw3;

import java.io.BufferedReader;
import java.io.IOException;

public class Numbers {

    public static String[] readNumbers(int count, BufferedReader br) throws IOException {
        String[] str = new String[count];
        for (int i = 0; i < count; i++) {
            str[i] = br.readLine();
        }
        return str;
    }

    public static void checkRange(int min, int max, String[] str) {
       for (int i = 0; i <str.length ; i++) {
            float checkNumber = Float.parseFloat(str[i]);
            if (checkNumber > max){
                System.out.println(str[i] + " this number is more than " + max);
            }
            else if (checkNumber < min) {
                System.out.println(str[i] + " this number is less than " + min);
            }

        }
    }

    public static void checkMinMax(String[] str) {
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);

        for (int i = 1; i < str.length; i++) {
            int checkNumber = Integer.parseInt(str[i]);
            if (checkNumber > max){
                max = checkNumber;
            }
            else if (checkNumber < min) {
                min = checkNumber;
            }
        }

        System.out.println("Minimum value is: " + min + ". Maximum value is: " + max);
    }
}
