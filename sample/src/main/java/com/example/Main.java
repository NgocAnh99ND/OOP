package com.example;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Buddy", 3, "Golden");
        Cat cat = new Cat("Kitty", 2, "White");
        Bird bird = new Bird("Sky", 1, 0.5);

        dog.eat();
        dog.bark();

        cat.sleep();
        cat.meow();

        bird.eat();
        bird.fly();

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}