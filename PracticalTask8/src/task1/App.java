package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static int squareRectangle(int a, int b) throws NegativeValueException{
        if (a>0 & b>0){
            return a*b;
        }
        else{
            throw new NegativeValueException("a and b must be positive");
        }
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            squareRectangle(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()));
        } catch (NegativeValueException negativeValueException) {
            negativeValueException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.err.println("Not numeric value");
        }

    }
}
