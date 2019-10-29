package range;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



//8.	Input number in range from 1 to 1 000 000 and output this number in English
public class Appl {

	public static void main(String[] args) throws IOException {

		String numberline;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input number.Number must be in range from 1 to 1000000");		

		numberline=br.readLine();		
		NumToWord.printEng(numberline);
		
		br.close();

		
		
	}

}
