package hw3;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    Dog dog1 = new Dog("Alex",Breed.Bulldog,3);
    Dog dog2 = new Dog("John",Breed.Setter,7);
    Dog dog3 = new Dog("Alex",Breed.Collie,1);

    @Test
    public void testCheckSameName() {
        assertTrue(Dog.checkSameName(dog1, dog3));
        assertFalse(Dog.checkSameName(dog1, dog2));
    }

    @Test
    public void testCheckOldestDog() {
        assertSame(Dog.checkOldestDog(dog1,dog2), dog2);
        assertNotSame(Dog.checkOldestDog(dog1,dog3), dog2);
    }
}