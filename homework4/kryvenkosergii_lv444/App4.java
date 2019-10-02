package homework4.kryvenkosergii_lv444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App4 {

	public static void main(String[] args) throws IOException {

		// Create and initialize four instances of class Car
		Car[] car = { new Car("Mercedes", 2005, 3.0f), new Car("Dodge", 2000, 4.5f), new Car("BMW", 2012, 2.5f),
				new Car("Renault", 2015, 1.6f) };

		// Display certain model year
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter model year");
		String text = br.readLine();
		int certanYear = Integer.parseInt(text);

		for (int i = 0; i < car.length; i++) {
			if (car[i].getYearOfProduction() == certanYear) {
				System.out.println("Your car certain model year is " + car[i].toString());
			} else {
				System.out.println("You entered the wrong year");
				break;
			}
		}
		
		//ordered cars by the field year using the bubble method
		System.out.println("\nOrdered cars by the field year using the bubble method");
		Car tmp = new Car();
		for (int i = 0; i < car.length-1; i++) {
			for (int j = i+1; j< car.length; j++)
				if (car[i].getYearOfProduction()<car[j].getYearOfProduction()) {
					tmp.setType(car[i].getType());
					tmp.setYearOfProduction(car[i].getYearOfProduction());
					tmp.setEngineCapacity(car[i].getEngineCapacity());
					car[i].setYearOfProduction(car[j].getYearOfProduction());
					car[i].setType(car[j].getType());
					car[i].setEngineCapacity(car[j].getEngineCapacity());
					car[j].setYearOfProduction(tmp.getYearOfProduction());
					car[j].setType(tmp.getType());
					car[j].setEngineCapacity(tmp.getEngineCapacity());
				}
		}
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i].toString());
		}
	}
}
