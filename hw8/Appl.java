import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//First
//Create method div(), which calculates the dividing of two double numbers. 
//In main method input 2 double numbers and call this method. Catch all exceptions. 
//Second
//Write a method readNumber(int start, int end), that read from console integer number and 
//return it, if it is in the range [start...end]. 
//If an invalid number or non-number text is read, the method should throw an exception. 
//Using this method write a method main(), that has to enter 10 numbers:
//	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100

public class Appl {

	private static double div(double a, double b) {
		return a / b;
	}


	private static int readNumber(int start, int end) throws ExceptionOutRange,
			NumberFormatException, IOException {

		int tmp = -1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number");

		tmp = Integer.parseInt(br.readLine());

		if ((tmp > start) && (tmp < end)) {
			return tmp;
		} else {

			throw new ExceptionOutRange("Input Number is not in range " + start
					+ " " + end);
		}

	}

	public static void main(String[] args) {
		// task ONE
		double a1 = 2;
		double b1 = 0;

		try {
			System.out.println(div(a1, b1));
			// Catch ALL exceptions
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		// task TWO
		int[] arr = new int[10];
		do {
			try {

				arr[0] = readNumber(0, 100);
				for (int i = 1; i < arr.length; i++) {
					do {
					try{
						arr[i] = readNumber(arr[i - 1], 100);
					}catch(Exception e){
						System.out.println(e.getMessage());
					}
					} while (arr[i] == 0);

				}
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("Number isn't INTEGER");

			} catch (ExceptionOutRange e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				// e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("You mut input integer number");
				System.out.println(e.getMessage());
				// e.printStackTrace();
			}
		} while (arr[0] == 0);



	}
}
