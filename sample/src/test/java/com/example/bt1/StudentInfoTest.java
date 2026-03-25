package com.example.bt1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.bt1.StudentInfo;

public class StudentInfoTest {

    @Test
    void testDataTypes() {
        StudentInfo s = new StudentInfo();

        // Test kiểu dữ liệu

        assertTrue(s.name instanceof String);

        assertEquals(Integer.class, ((Object) s.age).getClass());
        assertEquals(Double.class, ((Object) s.gpa).getClass());
        assertEquals(Boolean.class, ((Object) s.isMale).getClass());
        assertEquals(Character.class, ((Object) s.grade).getClass());
        assertEquals(Long.class, ((Object) s.population).getClass());
    }

    @Test
    void testValues() {
        StudentInfo s = new StudentInfo();

        assertEquals("Ngoc Anh", s.name);
        assertEquals(25, s.age);
        assertEquals(8.5, s.gpa);
        assertTrue(s.isMale);
        assertEquals('A', s.grade);
        assertEquals(10000000000L, s.population);
    }
}