package com.example;

public class Bird implements Movable, Soundable {

    @Override
    public void move() {
        System.out.println("Bird flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sings");
    }
}
