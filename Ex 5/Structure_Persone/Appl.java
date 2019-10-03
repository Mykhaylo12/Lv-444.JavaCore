//Create next structure. In abstract class Person with property name, declare abstract method print(). 
//In other classes in body of method print() output text “I am a …”. 
//In class Staff declare abstract method salary(). In each concrete class create constant TYPE_PERSON. 
//Output type of person in each constructors. 
//Create array of Person and add some Teachers, Cleaners and Students to it. 
//Call method print() for all of it. Call method salary() for all Teachers and Cleaner

public class Appl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person [] person=new Person[8];
		person[0]=new Teacher();
		person[1]=new Cleaner();
		person[2]=new Student();
		person[3]=new Student();
		person[4]=new Teacher();
		person[5]=new Cleaner();
		person[6]=new Student();
		person[7]=new Teacher();
		
		for (int i = 0; i < person.length; i++) {
			if (person[i] instanceof Staff) {
				((Staff)person[i]).salary( );
			}
		}
		
	}

}
