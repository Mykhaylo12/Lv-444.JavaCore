package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class app {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    Dog dog1 = new Dog("Alex",Breed.Bulldog,3);
    Dog dog2 = new Dog("John",Breed.Setter,7);
    Dog dog3 = new Dog("Alex",Breed.Collie,1);

    System.out.println(Dog.checkOldestDog(dog1, Dog.checkOldestDog(dog2, dog3)));
    boolean count = true;
    count = Dog.checkSameName(dog1, dog2);
    count = Dog.checkSameName(dog1, dog3);
    count = Dog.checkSameName(dog2, dog3);
    System.out.println(count ? "There are no identical names" : "There are identical names");
    }
}
