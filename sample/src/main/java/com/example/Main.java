package com.example;

public class Main {
    public static void main(String[] args) {
        Movable[] movers = {new Dog(), new Bird()};
        for (Movable m : movers) {
            m.move();
        }

        Soundable[] singers = {new Dog(), new Bird()};
        for (Soundable s : singers) {
            s.makeSound();
        }
    }
}
