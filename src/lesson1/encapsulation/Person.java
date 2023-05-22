package lesson1.encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException("Age must be positive");
        } else {
            this.age = age;

        }
    }
}