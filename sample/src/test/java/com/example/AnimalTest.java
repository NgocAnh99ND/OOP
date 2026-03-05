package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;


public class AnimalTest {

    @Test
    void testDogMakeSound() {
        Dog dog = new Dog("Buddy", 3, "Golden");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        dog.makeSound();

        assertEquals("Woof", output.toString().trim());
    }

    @Test
    void testCatMakeSound() {
        Cat cat = new Cat("Kitty", 2, "White");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        cat.makeSound();

        assertEquals("Meow", output.toString().trim());
    }

    @Test
    void testBirdMakeSound() {
        Bird bird = new Bird("Sky", 1, 0.5);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        bird.makeSound();

        assertEquals("Chirp", output.toString().trim());
    }

    @Test
    void testNegativeAgeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Dog("Buddy", -1, "Golden");
        });
    }
}