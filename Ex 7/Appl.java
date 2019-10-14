import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
//surnames and initials
//name
//name, middle name and last name


//The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores. 
//Using regular expressions implement checking the user name for validity. Input five names in the main method . 
//Output a message to the console of the validation of each of the entered names.



	
public class Appl {

	public static boolean checkWithRegExp(String userName){
		
		Pattern p = Pattern.compile("[a-zA-Z0-9_]{3,15}");
		Matcher m =p.matcher(userName);
		return m.matches();		
	}
	
	public static void main(String[] args) throws IOException {
		String [] arr =new String[3];
		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String fullName = br.readLine();
//		arr = fullName.split(" ");
//		System.out.println();
//		
//		for (String w : arr) {
//		      System.out.println(w);
//		    }
//
//		System.out.println(arr[0]+" "+arr[1].charAt(0)+"."+arr[2].charAt(0)+".");
		
		String []arr1 = new String[5];
		
		arr1[0]="Jane";
		arr1[1]="Janet_Welsh";		
		arr1[2]="Aqntoan98_125";
		arr1[3]="Caroll";
		arr1[4]="_$()ss";
		
		for (String string : arr1) {
			System.out.println(checkWithRegExp(string));			
		}

		
		
	}

	
}
