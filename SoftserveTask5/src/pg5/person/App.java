package pg5.person;

public class App {
    public static void main(String[] args) {
            Person[] persons = {new Student("Vasia"),
            new Student("Petia"),
            new Teacher("Kolia",500),
            new Teacher("Valia", 700),
            new Cleaner("Vova", 50),
            new Cleaner("Kostia",10)};

        for (Person per:persons) {
            per.print();
            if (per instanceof Staff) {
                ((Staff) per).salary();
            }
        }
    }
}
