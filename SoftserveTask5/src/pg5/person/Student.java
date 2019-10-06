package pg5.person;

public class Student extends Person {
    final String TYPE_PERSON = "Student";
    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a "+TYPE_PERSON+", my name is"+name);
    }

}
