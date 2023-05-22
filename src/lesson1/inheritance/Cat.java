package lesson1.inheritance;

public class Cat extends Animal {

    public String test;

    public Cat() {
    }

    public Cat(String name, int age) {

        super(name, age);

    }

    @Override
    public void sound() {
        System.out.println("Meav");
    }
}
