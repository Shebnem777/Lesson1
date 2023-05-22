package lesson1.polimorphisim;

import lesson1.inheritance.Animal;

public class Cat extends Animal {
public  String test;

    public Cat(String s, int i) {
    }

    @Override
    public void sound() {
        System.out.println("miav");

    }
}
