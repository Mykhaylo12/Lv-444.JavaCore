package homework1.kryvenkosergii_lv444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerimeterCircle {

	public static void main(String[] args) throws IOException {
		final double PI = 3.141592653589793;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius of Flower bed: ");
		String text = br.readLine();
		float radius = Float.parseFloat(text);
		float perimeter = (float) (PI * radius * radius);
		System.out.format("Obtained results perimeters of Flower bed is: %04.3f", perimeter);

	}

}
