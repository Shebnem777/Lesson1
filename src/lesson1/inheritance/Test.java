package lesson1.inheritance;

public class Test {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.setName("Mestan");
        cat.setAge(1);
        cat.sound();

        System.out.println(cat);

        Animal testAnimal = new Animal("Test Animal", 11);
        System.out.println(testAnimal);
    }

}
