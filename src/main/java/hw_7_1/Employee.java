package hw_7_1;

public class Employee extends Person{
    int salary;

   boolean isSameName(Employee employee) {
       return getName().equals(employee.getName());
   }

   int getSalary(){
       return this.salary;
   }
}
