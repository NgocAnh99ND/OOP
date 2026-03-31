package com.example.bt2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testGetString() {
        assertEquals("Java 11 has 2 versions", Main.getString());
    }

    @Test
    void testCountA() {
        String str = Main.getString();
        assertEquals(3, Main.countA(str));
    }

    @Test
    void testCountDigits() {
        String str = Main.getString();
        assertEquals(3, Main.countDigits(str));
    }

    @Test
    void testCountSpaces() {
        String str = Main.getString();
        assertEquals(4, Main.countSpaces(str));
    }

    @Test
    void testContainsHas() {
        String str = Main.getString();
        assertTrue(Main.containsHas(str));
    }

    @Test
    void testFirstIndexOfA() {
        String str = Main.getString();
        assertEquals(1, Main.firstIndexOfA(str));
    }

    @Test
    void testGetCharAt() {
        String str = Main.getString();
        assertEquals('J', Main.getCharAt(str, 0));
        assertEquals('a', Main.getCharAt(str, 1));
        assertEquals('1', Main.getCharAt(str, 5));
    }
}