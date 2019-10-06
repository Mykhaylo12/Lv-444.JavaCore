package pg5.person;

public abstract class Staff extends Person{
    private int salary;

    public abstract void salary();

    public Staff(int staff) {
        this.salary = staff;
    }

    public Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
