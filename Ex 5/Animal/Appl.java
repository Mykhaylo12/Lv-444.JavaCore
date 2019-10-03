//Create interface Animal with methods voice() and feed(). 
//Create two classes Cat and Dog, which implement this interface. 
//Create array of Animal and add some Cats and Dogs to it. Call voice() and feed() method for all of it

public class Appl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Animal[] animal = new Animal[4];	
	animal[0]=new Cat();	
	animal[2]=new Cat();	
	animal[1]=new Dog();
	animal[3]=new Dog();
	
	
	for (int i = 0; i < animal.length; i++) {
		
		animal[i].feed();
		animal[i].voice();		
	}
	
	}

}
