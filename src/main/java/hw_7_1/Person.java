package hw_7_1;

public class Person {
    int age;
    String name;
    char gender;

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    void setGender(char gender){
        this.gender = gender;
    }

    String getName(){
        if(gender == 'M'){
            return "Mr. " + name;
        } else{
            return "Mrs. " + name;
        }
    }
}
