package classwork13.kryvenkosergii_lv44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import classwork4.kryvenkosergii_lv44.Continents;

public class AppGroup {

	public static void main(String[] args) throws IOException {
		int num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of task");
		String text = br.readLine();
		
		switch (text) {
		case "1":
			System.out.println("");
			break;
			
		case "2":
			System.out.println("");
			break;
			
		case "3":
			System.out.println("Enter cost of dollar");
			int dollar = Integer.parseInt(br.readLine());
			System.out.println("Enter sum of gryvna");
			int grivna = Integer.parseInt(br.readLine());
			System.out.println("You can buy "+(int)Task3.calculate(dollar, grivna)+" dollar");
			break;
			
		case "4":
			System.out.println("");
			break;
			
		case "5":
			System.out.println("");
			break;
			
		case "6":
			System.out.println("Enter some text using a spase between words");
			Task6.countWords(br.readLine());
			break;
			
		case "7":
			System.out.println("");
			break;
			
		case "8":
			System.out.println("");
			break;
			
		case "9":
			System.out.println("");
			break;
			
		case "10":
			System.out.println("");
			break;
			
		case "11":
			System.out.println("");
			break;
			
		case "12":
			System.out.println("");
			break;
			
		case "13":
			Task13 t13 = new Task13();
			t13.NCK();
			break;
			
		case "14":
			System.out.println("");
			break;
			
		}

	}

}
