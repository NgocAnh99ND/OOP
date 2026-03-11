package com.example.bt4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StudentTest {

    @Test
    void testStudentConstructor() {
        Student s = new Student("John", 20, "S123");

        assertEquals("John", s.name);
        assertEquals(20, s.age);
        assertEquals("S123", s.studentId);
    }

    @Test
    void testDisplay() {

        Student s = new Student("John", 20, "S123");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        System.setOut(new PrintStream(output));

        s.display();

        System.setOut(originalOut);

        String expected =
                "John" + System.lineSeparator() +
                "20" + System.lineSeparator() +
                "S123" + System.lineSeparator();

        assertEquals(expected, output.toString());
    }
}