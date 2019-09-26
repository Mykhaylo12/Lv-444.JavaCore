package person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge(){
        Date now = new Date();
        return now.getYear()-birthYear;
    }

    public void input(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String output() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +'\'' +
                ", Age=" + getAge() +
                '}';
    }

    public void changeName(String[] args) throws IOException {
        if (args.length == 2) {
            this.firstName = args[0];
            this.lastName = args[1];
        }
        else if (args.length == 1){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("If you want change first name input F '\'' If you want change last name input L");
            String s = br.readLine();
            if (s == "F")
                this.firstName = args[0];
            else if (s == "L")
                this.lastName = args[0];
            else
                System.out.println("Invalid option input");
        }
    }
}
