//Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2), 
//realizing the operations of union and intersection of two sets. Test the operation of these techniques on two pre-filled sets. 


import java.util.HashSet;
import java.util.Set;


public class Appl {
	private static <T>Set <T> Intersect(Set<T> set1,Set<T> set2){
		Set <T>set=new HashSet<T>();
		set.addAll(set1);
		set.retainAll(set2);
		return set;
	} 

	private static <T>Set <T> Union(Set<T> set1,Set<T> set2){
		Set <T>set=new HashSet<T>();
		set.addAll(set1);
		set.addAll(set2);

		return set;
	} 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating first set 
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);
  
        // Creating second set 
        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(30);
        set2.add(50);
        set2.add(70);
        set2.add(90);
        

        Set<String> set3 = new HashSet<String>();
	    set3.add("a");
	    set3.add("b");
	    set3.add("c");
	    set3.add("d");
	    set3.add("e");


	    Set<String> set4 = new HashSet<String>();
	    set4.add("a");
	    set4.add("c");
	    set4.add("f");
	    set4.add("k");
    
   
	


       	System.out.println("Set 1: "+ set1);   
        System.out.println("Set 2: "+ set2); 
        System.out.println("Set 1 intersection Set 2: "+ Appl.<Integer>Intersect(set1, set2));
        System.out.println("Set 1 union Set 2: "+ Appl.<Integer>Union(set1, set2));       
        	
	    System.out.println("Set 3: "+ set3);       	
	    System.out.println("Set 4: "+ set4); 
	    System.out.println("Set 3 intersection Set 4: "+ Appl.<String>Intersect(set3, set4));
	    System.out.println("Set 3 union Set 4: "+ Appl.<String>Union(set3, set4)); 		    
	}

}
