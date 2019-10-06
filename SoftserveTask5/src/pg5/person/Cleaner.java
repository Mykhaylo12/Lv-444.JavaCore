package pg5.person;

public class Cleaner extends Staff {
    final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name, int salary) {
        super(name, salary);
    }


    @Override
    public void salary() {
        System.out.println("Salary is:" + getSalary());
    }

    @Override
    public void print() {
        System.out.println("I am a "+TYPE_PERSON+", my name is"+getName());
    }
}
