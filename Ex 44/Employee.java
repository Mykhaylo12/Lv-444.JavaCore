//	Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
//	all employees of a certain department (enter department number in the console);
//	arrange workers by the field salary in descending order.


public class Employee {
	String name= new String();
	int deptID;
	int salary;
	
	Employee(){}

	public Employee(String name, int deptID, int salary) {
		super();
		this.name = name;
		this.deptID = deptID;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	};

	
}
