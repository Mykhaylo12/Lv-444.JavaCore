import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//In the main() method declare map employeeMap of pairs <Integer, String>.
//Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
//Ask user to enter ID, then find and write corresponding name from your map. 
//If you can't find this ID - say about it to user (use function containsKey()).
//Ask user to enter name, verify than you have name in your map and write corresponding ID. 
//If you can't find this name - say about it to user (use function containsValue()). 

public class Appl {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Map <Integer,String>employeeMap = new HashMap();
		employeeMap.put(1, "Larry");
		employeeMap.put(2, "Simon");
		employeeMap.put(3, "John");
		employeeMap.put(4, "West");		
		employeeMap.put(5, "Kanny");
		employeeMap.put(6, "West");
		employeeMap.put(7, "Wells");
		String tmp = "";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		tmp=br.readLine();
		if (employeeMap.containsKey(Integer.parseInt(tmp))) {
			
			System.out.println((String) employeeMap.get(Integer.parseInt(tmp)));
		}else {
			System.out.println("ID - wrong");
		}
		
		tmp=br.readLine();
		if (employeeMap.containsValue(tmp)) {
		
			for (int i = 0; i < employeeMap.size(); i++) {
				
				if (tmp.equalsIgnoreCase(employeeMap.get(i))) {
//				if ((String) employeeMap.get(i)==tmp) {
					System.out.println(i);				
				}
			}
			
//			System.out.println((String) employeeMap.get(Integer.parseInt(tmp)));
		
		}else {
			System.out.println("ID - wrong");
		}	
	
	}



}
