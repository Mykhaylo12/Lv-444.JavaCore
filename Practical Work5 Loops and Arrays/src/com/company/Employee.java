package com.company;

import java.util.Objects;

///Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
////all employees of a certain department (enter department number in the console);
////arrange workers by the field salary in descending order.
public class Employee {
   private String name;
   private int departament;
   private int salary;

   public Employee(String name, int departament, int salary) {
      this.name = name;
      this.departament = departament;
      this.salary = salary;
   }

   Arrays.sort(persons, new Comparator(Employee) () {
      public int compare(Person a, Person b) {
         return a.getGrowth() - b.getGrowth();
      }
   });
        System.out.println("\nSorted by growth:");
        for ( Person p : persons )
           System.out.println(p);


   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getDepartament() {
      return departament;
   }

   public void setDepartament(int departament) {
      this.departament = departament;
   }

   public int getSalary() {
      return salary;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Employee)) return false;
      Employee employee = (Employee) o;
      return getSalary() == employee.getSalary();
   }

   @Override
   public int hashCode() {
      return Objects.hash(getSalary());
   }
}
