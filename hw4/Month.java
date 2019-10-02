import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Ask user to enter the number of month. 
//Read the value and write the amount of days in this month (create array with amount days of each month).


public class Month {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int monthNumber;
		int monthDays[ ]  = {31, 28, 31, 30, 31, 30, 
				31, 31, 30, 31, 30, 31} ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		monthNumber = Integer.parseInt(br.readLine());
		
		System.out.println("This month  has - "+monthDays[monthNumber-1]);

	}

}
