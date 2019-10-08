import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Declare collection myCollection of 10 integers and fill it (from the console or random).
//Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
//Remove from collection myCollection elements, which are greater then 20. Print result
//Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
//Sort and print collection 

public class Appl {
	private static void InsertIn (List<Integer> list,int index, int element) {
		if (list.size()>index-1) {
		list.add(index, element);
			System.out.println("Insert "+element+" on pisition "+index);
		} else {
			System.out.println("Array size < "+ index);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> myCollection = new ArrayList <Integer>();
		List <Integer> newCollection = new ArrayList <Integer>();
		
		Random rand = new Random();
	      for (int i = 0; i < 11; i++) {
	    	  myCollection.add(rand.nextInt(20));
	    	        }

			System.out.println(myCollection.toString());
	        


			for (Integer integer : myCollection) {
				
				if (integer>5) {
					newCollection.add(integer);
				}
				
			}
			
			System.out.println(newCollection.toString());	

//			for (Integer integer : newCollection) {
//				
//				if (integer>10) {
////					newCollection.remove(newCollection.indexOf(integer));
//					newCollection.remove(integer);
//				}
//			}

		    for(int i = 0; i < newCollection.size(); i++){
	            if(newCollection.get(i)>10){
	            	newCollection.remove(i);
	            }
		    }    
			System.out.println(newCollection.toString());
			


			InsertIn(newCollection, 2, 1);
			InsertIn(newCollection, 8, -3);
			InsertIn(newCollection, 5, -4);
			

			System.out.println(newCollection.toString());	
	
	}

}
