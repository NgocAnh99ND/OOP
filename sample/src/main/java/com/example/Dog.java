package com.example;

public class Dog implements Movable, Soundable {

    @Override
    public void move() {
        System.out.println("Dog runs");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}