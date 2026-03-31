package com.example.bt1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testOriginalString() {
        assertEquals("   Java Core Basics   ", Main.getOriginal());
    }

    @Test
    void testOriginalLength() {
        String str = Main.getOriginal();
        assertEquals(22, Main.getOriginalLength(str));
    }

    @Test
    void testTrim() {
        String str = Main.getOriginal();
        assertEquals("Java Core Basics", Main.trim(str));
    }

    @Test
    void testTrimmedLength() {
        String str = Main.getOriginal();
        assertEquals(16, Main.getTrimmedLength(str));
    }

    @Test
    void testToUpper() {
        String str = Main.getOriginal();
        assertEquals("JAVA CORE BASICS", Main.toUpper(str));
    }

    @Test
    void testToLower() {
        String str = Main.getOriginal();
        assertEquals("java core basics", Main.toLower(str));
    }
}