package hw_7_1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        Salary sal = new Salary();

        person1.setName("Anna");
        person1.setAge(20);
        person1.setGender('F');

        person2.setName("Sergey");
        person2.setAge(30);
        person2.setGender('M');

        employee1.setName("Nik");
        employee2.setName("Pol");
        employee3.setName("Nik");

        employee1.salary = 10000;
        employee2.salary = 20000;
        employee3.salary = 30000;

        Employee[] emp = {employee1, employee2, employee3};

        System.out.println(person1.getName());
        System.out.println(person2.getName());

        System.out.println(employee1.isSameName(employee2));
        System.out.println(employee1.isSameName(employee3));

        System.out.println(sal.getSum(emp));


    }
}
