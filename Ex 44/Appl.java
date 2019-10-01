import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//		Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
//		all employees of a certain department (enter department number in the console);
//		arrange workers by the field salary in descending order.



public class Appl {

	private static String EmloyeeName() {}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		final int EMPLOYEE_COUNT =5;
		Employee [] empl =new Employee[EMPLOYEE_COUNT];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input name, depID, salary for each employee.");		
		for (int i = 0; i < empl.length; i++) {
			System.out.println("Input for employeee." + (i+1));			
			empl[i] = new Employee(br.readLine(),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()));			
			
		System.out.println("Dept ");
			
		}
	}

}
