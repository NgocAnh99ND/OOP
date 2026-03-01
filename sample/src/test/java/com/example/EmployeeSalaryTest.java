package com.example;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeSalaryTest {

    @Test
    void employee_shouldBeAbstractClass() {
        assertTrue(Modifier.isAbstract(Employee.class.getModifiers()),
                "Employee phải là abstract class");
    }

    @Test
    void employee_calculateSalary_shouldBeAbstractMethod() throws NoSuchMethodException {
        var m = Employee.class.getMethod("calculateSalary");
        assertTrue(Modifier.isAbstract(m.getModifiers()),
                "calculateSalary() trong Employee phải là abstract");
    }

    @Test
    void fullTimeEmployee_calculateSalary_shouldReturnMonthlySalary() {
        Employee e = new FullTimeEmployee("E01", "Alice", 1500.0);
        assertEquals(1500.0, e.calculateSalary(), 1e-9);
    }

    @Test
    void partTimeEmployee_calculateSalary_shouldReturnHourlyRateTimesHours() {
        Employee e = new PartTimeEmployee("E02", "Bob", 10.0, 80);
        assertEquals(800.0, e.calculateSalary(), 1e-9);
    }

    @Test
    void invalid_id_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new FullTimeEmployee("   ", "Alice", 1000.0));
    }

    @Test
    void invalid_name_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new PartTimeEmployee("E03", "", 10.0, 10));
    }

    @Test
    void fullTime_negativeSalary_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new FullTimeEmployee("E04", "Chris", -1));
    }

    @Test
    void partTime_negativeHourlyRate_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new PartTimeEmployee("E05", "Daisy", -5.0, 10));
    }

    @Test
    void partTime_negativeHours_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new PartTimeEmployee("E06", "Evan", 5.0, -10));
    }
}