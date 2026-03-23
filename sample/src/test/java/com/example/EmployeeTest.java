package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
        // reset lại giá trị static trước mỗi test
        Employee.company = "ABC Corp";
        Employee.nextId = 1;
    }

    @Test
    void testAutoIncrementId() {
        Employee e1 = new Employee("An");
        Employee e2 = new Employee("Binh");
        Employee e3 = new Employee("Cuong");

        assertEquals(1, e1.id);
        assertEquals(2, e2.id);
        assertEquals(3, e3.id);
    }

    @Test
    void testCompanyIsShared() {
        Employee e1 = new Employee("An");
        Employee e2 = new Employee("Binh");

        Employee.company = "XYZ Corp";

        assertEquals("XYZ Corp", Employee.company);
        assertEquals("XYZ Corp", e1.company);
        assertEquals("XYZ Corp", e2.company);
    }

    @Test
    void testDisplay() {
        Employee e1 = new Employee("An");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        e1.display();

        System.setOut(originalOut);

        String expected = "ID: 1, Name: An, Company: ABC Corp";
        assertEquals(expected, out.toString().trim());
    }

    @Test
    void testDisplayAfterChangingCompany() {
        Employee e1 = new Employee("An");
        Employee.company = "XYZ Corp";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        e1.display();

        System.setOut(originalOut);

        String expected = "ID: 1, Name: An, Company: XYZ Corp";
        assertEquals(expected, out.toString().trim());
    }
}