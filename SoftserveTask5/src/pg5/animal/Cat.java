package pg5.animal;

public class Cat implements Animal{
    @Override
    public void voice() {
        System.out.println("Miau");
    }

    @Override
    public void feed() {
        System.out.println("Cats eat mouses");
    }
}
