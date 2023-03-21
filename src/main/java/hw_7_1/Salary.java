package hw_7_1;

public class Salary {
    int getSum(Employee[] employeeArray){
        int sum = 0;
        for(Employee e : employeeArray){
            sum += e.getSalary();
        }

        return sum;
    }
}
