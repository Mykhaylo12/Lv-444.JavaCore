
public class Appl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = new Employee();
		Employee E2 = new Employee(30, "Ard");
		Employee E3 = new Employee(40, "Wns", 5);
		System.out.println("Total1= " + Employee.getTotalSum());	
		E1.setBonus(true);
		System.out.println("Total2= " + Employee.getTotalSum());	
		E1.setHour(3);
		System.out.println("Total3= " + Employee.getTotalSum());			
		E1.setRate(10);
		System.out.println("Total4= " + Employee.getTotalSum());			
		E1.setName("Lay");
		System.out.println("Total5= " + Employee.getTotalSum());			
		E2.setBonus(false);
		System.out.println("Total6= " + Employee.getTotalSum());			
		E2.setHour(4);
		System.out.println("Total7= " + Employee.getTotalSum());			
		E3.setBonus(false);
		System.out.println("Total8= " + Employee.getTotalSum());			
		System.out.println(E1);
		System.out.println(E2);
		System.out.println(E3);
		System.out.println(E3.getSalary());
		System.out.println(E3.getBonus());
		System.out.println("Total= " + Employee.getTotalSum());		
		
	}

}
