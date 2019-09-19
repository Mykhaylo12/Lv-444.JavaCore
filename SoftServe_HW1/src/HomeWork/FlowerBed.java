package HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBed {
    public static void main(String[] args) throws IOException {
        System.out.println("Input R:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        System.out.println("Perimeter: "+2*Math.PI*r);
        System.out.println("Perimeter: "+Math.PI*r*r/2);
    }
}
