package com.example.bt4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AnimalTest {

    // Hàm bắt output
    private String getOutput(Runnable action) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream old = System.out;
        System.setOut(new PrintStream(out));

        action.run();

        System.setOut(old);
        return out.toString().trim();
    }

    @Test
    void testDogSound() {
        Animal a = new Dog();
        String output = getOutput(a::sound);
        assertEquals("Dog barks", output);
    }

    @Test
    void testCatSound() {
        Animal a = new Cat();
        String output = getOutput(a::sound);
        assertEquals("Cat meows", output);
    }

    @Test
    void testBirdSound() {
        Animal a = new Bird();
        String output = getOutput(a::sound);
        assertEquals("Bird sings", output);
    }

    @Test
    void testPolymorphismArray() {
        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Bird()
        };

        String[] expected = {
            "Dog barks",
            "Cat meows",
            "Bird sings"
        };

        for (int i = 0; i < animals.length; i++) {
            String output = getOutput(animals[i]::sound);
            assertEquals(expected[i], output);
        }
    }
}
