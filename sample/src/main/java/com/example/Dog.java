package com.example;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
