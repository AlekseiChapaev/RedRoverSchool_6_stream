package training;

public class Person {

    /**
     * Задача №1
     *
     * Необходимо создать класс Person с полями: имя, возраст, пол.
     * Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
     * если пол указан как мужской и префикс “Mrs. ” если женский.
     */

    private int age;
    private char gender;
    private String name;

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(char gender){
        if(gender == 'M'){
            return "Mr. " + name;
        } else{
            return "Mrs. " + name;
        }
    }
}
