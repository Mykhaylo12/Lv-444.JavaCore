import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Student {
	private int CourseNumber; 
    private String name;
    
    
    public int getCourseNumber() {
		return CourseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.CourseNumber = courseNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Student(int courseNumber, String name) {
		this.CourseNumber = courseNumber;
		this.name = name;
	}

	

	public String toString() {
		return "Student [CourseNumber=" + CourseNumber + ", name=" + name + "]";
	}


	public static <T> void sortList(List <Student> list,Comparator T){
	      list.sort(T);
	        for (Student student : list ) {
	            System.out.println(student);
	        }
	}
	public static <T> void compareStudent(Student st1, Student st2, Comparator T){
		if (T.compare(st1, st2)==0){		
				System.out.println("Is equal");
			} else
			{
				System.out.println("Is NOT equal");	
			}

	}
	
	public static void printStudents(List <Student> list, int course){
//		Iterator <Student> listIterator = list.iterator();
//		while (listIterator.hasNext()) {
//			if(listIterator.next().getCourseNumber()==Course){
//				System.out.println(listIterator.next().toString());
//			}
//		}
		for (Iterator<Student> i = list.iterator(); i.hasNext();){
			Student st = (Student) i.next();
			int tmp = st.getCourseNumber();
			
			//System.out.println(tmp+" "+st.getName());
			if(tmp==course){
				System.out.println(st.toString());
			}			
		}
		
	}	
	
	

	static class NameComparator implements Comparator {
    	  public int compare(Object o1, Object o2) {
    	    return ((Student)o1).getName().compareTo(((Student)o2).getName());
    	  }
    	}

    static class TabComparator implements Comparator {
    	  public int compare(Object o1, Object o2) {
    	    return ((Student)o1).getCourseNumber()-((Student)o2).getCourseNumber();
    	  }
    	}
    
    private static NameComparator nameComparator = new NameComparator( );
    private static TabComparator tabComparator = new TabComparator();
    
    public static Comparator getNameComparator( ) {
        return nameComparator;
    }
    public static Comparator getTabComparator( ) {
        return tabComparator;

}
}