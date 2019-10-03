package pt4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class appEmployees {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int readNumberOfDepartment() throws IOException {
        return Integer.parseInt(br.readLine());
    }
    static void printEmployeesOfDepartment(Employees[] employees, int department) throws IOException {
       // int department = readNumberOfDepartment();
        for (Employees emp: employees) {
            if (emp.getDepartment_number() == department){
                System.out.println(emp);
            }
        }
    }

    static void sortBySalary(Employees[] employees){
        int tmp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    tmp = employees[i].getSalary();
                    employees[i].setSalary(employees[j].getSalary());
                    employees[j].setSalary(tmp);
                }
            }
        }
    }

    static void printAllEmployees(Employees[] employees){
        for (Employees emp: employees) {
            System.out.println(emp);
        }
    }

    public static void main(String[] args) throws IOException {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Vasia",3,700);
        employees[1] = new Employees("Valia",1,300);
        employees[2] = new Employees("Petia",2,100);
        employees[3] = new Employees("John",3,600);
        employees[4] = new Employees("Ann",2,50);

        printEmployeesOfDepartment(employees,readNumberOfDepartment());

        printAllEmployees(employees);
        sortBySalary(employees);
        printAllEmployees(employees);

    }
}
