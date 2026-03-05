package com.example;

public class Cat extends Animal {

    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void meow() {
        System.out.println(name + " is meowing");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
