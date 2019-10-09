//Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
//Output the entities of the map on the screen. 
//There are at less two persons with the same firstName among these 10 people?
//Remove from the map person whose firstName is ”Orest” (or other). Print result.


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Appl {
	
	private static void removefromMap (Map <String, String> map, String value) {

	    String removalKey = null;
	    while (map.containsValue(value)){
		    for (Map.Entry<String, String> entry : map.entrySet()) {
		        if (value.equals(entry.getValue())) {
		            removalKey = entry.getKey();
		            break;
		        }
		    }
	    
		    if (removalKey != null) {
		        map.remove(removalKey);
		        System.out.println(value+" is removed from map");
		    }
	    }
	
	
	}
	private static void findDupFN (Map <String, String> map) {
        Set<String> s = new HashSet<String>( );
		for (Map.Entry<String, String> entry : map.entrySet()) {
		    if(!s.add(entry.getValue())){
				   System.out.println("Duplicate detected: " + entry.getValue());		    	
		    }

		}        
        

	}
	
	
	
	private static void printMap(Map<String, String> map) {

		for (Map.Entry<String, String> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
	
	public static void main(String[] args) {
		Map <String,String> mapPerson = new HashMap<String, String>();
		// TODO Auto-generated method stub
		mapPerson.put("Selgen", "Julia");
		mapPerson.put("West", "John");
		mapPerson.put("Perrys", "Larry");
		mapPerson.put("Gartner", "Antony");
		mapPerson.put("Thin", "John");
		mapPerson.put("Baker", "Katy");
		mapPerson.put("Tenneson", "Orest");
		mapPerson.put("Lamber", "Orest");
		mapPerson.put("Smith", "Vlad");
		
		printMap(mapPerson);
		findDupFN(mapPerson);
		// If only value to be Unique??? 
		while (mapPerson.values().remove("John"));
		
		removefromMap(mapPerson,"Orest");
		printMap(mapPerson);
	}

}
