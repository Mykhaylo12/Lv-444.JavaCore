import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {

	public static void main(String[] args) throws IOException {
		 String country=null;
		 CONTINENT continent = CONTINENT.AFRICA;
		 BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		 country = b.readLine();
		
		switch (country) {
		case "Ukraine": case "United Kingdom": case "France":
			continent = continent.EUROPE;
			break;	
		case "Japan": case "China": case "India":
			continent = continent.ASIA; 
			break;
		case "Egypt": case "Morocco": case "Tunisia":
			continent = continent.AFRICA; 
			break;
		default:
			System.out.println("There is no such continent");
			System.exit(0);
		}
		System.out.println(continent);
	}

}
