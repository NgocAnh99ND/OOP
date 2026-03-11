package com.example.bt3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StudentTest {

    @Test
    void testIntroduce() {

        // tạo object
        Student student = new Student();

        // bắt output console
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        // gọi method cần test
        student.introduce();

        // kết quả mong đợi
        String expected =
                "Hello, I am a person" + System.lineSeparator() +
                "I am also a student" + System.lineSeparator();

        // so sánh
        assertEquals(expected, output.toString());
    }
}


