package pg5.animal;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Gau");
    }

    @Override
    public void feed() {
        System.out.println("Dogs eat cast");
    }
}
