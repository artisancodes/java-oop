package io.artisancodes.oop.classes.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animalSound();

        Animal dog = new Dog();
        dog.animalSound();

        Animal pig = new Pig();
        pig.animalSound();
    }
}
