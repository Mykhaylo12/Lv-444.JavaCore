import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Create a method for calculating the area of a rectangle 
//	int squareRectangle (int a, int b), 
//which should throw an exception if the user enters negative value. 
//Input values a and b from console. Check the squareRectangle method in the method main. Check to input nonnumeric value.


public class Appl {
	private static int RectArea(int a, int b)throws ArithmeticException {
	      if ((a < 0)||(b < 0))
	  		throw new ArithmeticException();

		return a*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int result;
		  int a=54;
		  int b=-13;
		  
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  
		  try {
		  a = Integer.parseInt(br.readLine());
		  b= Integer.parseInt(br.readLine());
		  }
		  catch (NumberFormatException | IOException e) {
			  System.out.println(e);
		  }
		  finally {
			  if (br==null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
		  }
		  
		  try {
		    result = RectArea(a, b);
		  } catch (ArithmeticException e) {
		    System.out.println(e);
		    result = -1;
		  }
		  
		  System.out.println("result: " + result);

	}

}
