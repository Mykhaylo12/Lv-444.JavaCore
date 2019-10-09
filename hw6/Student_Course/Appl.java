import java.util.ArrayList;
import java.util.List;

//Write class Student that provides information about the name of the student and his course. Class Student should consist of
//properties for access to these fields
//constructor with parameters
//method printStudents (List students, Integer course), 
//which receives a list of students and the course number 
//and prints to the console the names of the students from the list, which are taught in this course (use an iterator)
//methods to compare students by name and by course
//In the main() method 
//declare List students and add to the list five different students
//display the list of students ordered by name
//display the list of students ordered by course.

public class Appl {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      List<Student> list = new ArrayList<Student>();

	      list.add(new Student(1, "Greg"));
	      list.add(new Student(4, "Ann"));
	      list.add(new Student(3, "Elise"));
	      list.add(new Student(2, "Rachel"));
	      list.add(new Student(1, "Xantor"));	  
	      
	      
	      System.out.println("Sort by name:");
//	      list.sort(new Student.NameComparator());
//	        for (Student student : list) {
//	            System.out.println(student);
//	        }
	     Student.sortList(list,Student.getNameComparator());	        
	        
		 System.out.println("Sort by course:");	        
//		 list.sort(new Student.TabComparator());
//	        for (Student student : list) {
//	            System.out.println(student);
//
//	        }
		 Student.sortList(list,Student.getTabComparator());	        
		 Student.compareStudent(new Student (2, "Jane"), new Student (3,"Jane"), Student.getNameComparator());
		 Student.compareStudent(new Student (2, "Jane"), new Student (3,"Jane"), Student.getTabComparator());	
		 Student.compareStudent(new Student (2, "Jane"), new Student (2,"Karl"), Student.getTabComparator());	
	
		 Student.printStudents(list,  1);
	}

}
