package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class AnimailTest {

    @Test
    void testDogMove() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Dog dog = new Dog();
        dog.move();

        System.setOut(originalOut);
        assertEquals("Dog runs" + System.lineSeparator(), output.toString());
    }

    @Test
    void testDogMakeSound() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Dog dog = new Dog();
        dog.makeSound();

        System.setOut(originalOut);
        assertEquals("Dog barks" + System.lineSeparator(), output.toString());
    }

    @Test
    void testBirdMove() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Bird bird = new Bird();
        bird.move();

        System.setOut(originalOut);
        assertEquals("Bird flies" + System.lineSeparator(), output.toString());
    }

    @Test
    void testBirdMakeSound() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Bird bird = new Bird();
        bird.makeSound();

        System.setOut(originalOut);
        assertEquals("Bird sings" + System.lineSeparator(), output.toString());
    }

    @Test
    void testMainOutput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Main.main(new String[] {});

        System.setOut(originalOut);

        String expected = "Dog runs" + System.lineSeparator() +
                "Bird flies" + System.lineSeparator() +
                "Dog barks" + System.lineSeparator() +
                "Bird sings" + System.lineSeparator();

        assertEquals(expected, output.toString());
    }

    @Test
    void testPolymorphismWithMovable() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Movable m1 = new Dog();
        Movable m2 = new Bird();

        m1.move();
        m2.move();

        System.setOut(originalOut);

        String expected = "Dog runs" + System.lineSeparator() +
                "Bird flies" + System.lineSeparator();

        assertEquals(expected, output.toString());
    }

    @Test
    void testPolymorphismWithSoundable() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Soundable s1 = new Dog();
        Soundable s2 = new Bird();

        s1.makeSound();
        s2.makeSound();

        System.setOut(originalOut);

        String expected = "Dog barks" + System.lineSeparator() +
                "Bird sings" + System.lineSeparator();

        assertEquals(expected, output.toString());
    }
}