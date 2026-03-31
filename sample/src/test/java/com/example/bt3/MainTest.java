package com.example.bt3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    // ===== PHẦN A =====

    @Test
    void testFullName() {
        assertEquals("Nguyen Van An", Main.getFullName());
    }

    @Test
    void testFirstSpace() {
        String str = Main.getFullName();
        assertEquals(6, Main.getFirstSpace(str));
    }

    @Test
    void testFirstNamePart() {
        String str = Main.getFullName();
        assertEquals("Nguyen", Main.getFirstNamePart(str));
    }

    @Test
    void testLastNamePart() {
        String str = Main.getFullName();
        assertEquals("An", Main.getLastNamePart(str));
    }

    // ===== PHẦN B =====

    @Test
    void testStringBuilderResult() {
        String result = Main.buildString();
        assertEquals("Learning JDK Core StringBuilder", result);
    }
}
