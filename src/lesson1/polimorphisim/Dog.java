package lesson1.polimorphisim;

import lesson1.inheritance.Animal;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("hav-hav");
    }
}
