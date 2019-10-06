package hw5.task2;

public class App {
    static void orderedCarsBySalary(Employee[] employees){
        Employee tmp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }
    }

    static void printEmployees(Employee[] employees){
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("id3232","Vasia","389749384",2000),
                new ContractEmployee("id2945","Vova", "983734",23,231),
                new SalariedEmployee("id4232","Valia","38973584",2600),
                new ContractEmployee("id2145","Anna", "2354354",18,180),
                new SalariedEmployee("id1232","Petia","weref434",1950),
                new ContractEmployee("id2945","Kolia", "9834734",28,212)};
        printEmployees(employees);
        System.out.println();
        orderedCarsBySalary(employees);
        printEmployees(employees);
    }
}
