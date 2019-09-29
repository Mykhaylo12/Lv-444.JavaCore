package com.company;

import java.util.Objects;

//        Сreate class Dog with fields name, breed, age.
public class Dog {
  private   String name;
   private String breed;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return age == dog.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public int compareTo(Dog anotherDog) {
        if (this.age == anotherDog.age) {
            return 0;
        } else if (this.age < anotherDog.age) {
            return -1;
        } else {
            return 1;
        }
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog(String name, String breed, int age) {
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
