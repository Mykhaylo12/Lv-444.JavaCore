package classwork4.kryvenkosergii_lv44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of the day");
		String text1 = br.readLine();
		int num = Integer.parseInt(text1);
		
		switch (num) {
		case 1:
			System.out.println("Monday, ��������, �����������");
			break;
		case 2:
			System.out.println("Tuesday, ³������, �������");
			break;
		case 3:
			System.out.println("Wednesday, ������, �����");
			break;
		case 4:
			System.out.println("Thursday, ������, �������");
			break;
		case 5:
			System.out.println("Friday, �������, �������");
			break;
		case 6:
			System.out.println("Saturday, ������, �������");
			break;
		case 7:
			System.out.println("Sunday, �����, �����������");
			break;
		
		}

	}

}
