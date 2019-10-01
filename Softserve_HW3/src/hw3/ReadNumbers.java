package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumbers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String[] readNumbers(int count) throws IOException {
        String[] str = new String[count];
        for (int i = 0; i < count; i++) {
            str[i] = br.readLine();
        }
        return str;
    }

    public static void checkRange(int min, int max, int count) throws IOException {
        String[] str = new String[count];
        str = readNumbers(count);
        for (int i = 0; i <count ; i++) {
            float checkNumber = Float.parseFloat(str[i]);
            if (checkNumber > max){
                System.out.println(str[i] + " this number is more than " + max);
            }
            else if (checkNumber < min) {
                System.out.println(str[i] + " this number is less than " + min);
            }

        }
    }

    public static void checkMinMax(int count) throws IOException {
        String[] str = new String[count];
        str = readNumbers(count);
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);

        for (int i = 1; i < count; i++) {
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
