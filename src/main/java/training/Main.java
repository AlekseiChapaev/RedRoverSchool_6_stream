package training;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.setName("Alex");
        p2.setName("Kate");

//        System.out.println(p1.getName('M'));
//        System.out.println(p2.getName('F'));

        System.out.println(p1.getName());
    }

}
