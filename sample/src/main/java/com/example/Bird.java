package com.example;

public class Bird extends Animal {

    private double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    public void fly() {
        System.out.println(name + " is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
}