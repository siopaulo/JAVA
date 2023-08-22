package Polymorphism;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.greeting();

        Dog dog1 = new Dog();
        dog1.greeting();

        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal4 = new Animal();

        // Downcast
        Dog dog2 = (Dog) animal2;
        Dog dog3 = (Dog) animal3;
        dog3.greeting(dog2);
        dog2.greeting(dog3);

        
}
