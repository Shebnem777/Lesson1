package lesson1.encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("Ali");
        person.setAge(11);


        String name = person.getName();
        int age = person.getAge();


        System.out.println(name);
        System.out.println(age);

    }
}
