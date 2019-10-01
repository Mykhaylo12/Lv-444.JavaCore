package hw3;

public class Dog {
    private String name;
    private Breed breed;
    private int age;


    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    public static boolean checkSameName(Dog dog1, Dog dog2){
        return dog1.getName().equalsIgnoreCase(dog2.getName()) ? true : false;
    }

    public static Dog checkOldestDog(Dog dog1, Dog dog2){
        return dog1.getAge()>=dog2.getAge() ? dog1 : dog2;
    }
}
