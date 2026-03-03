package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import java.io.*;


class LightBulbTest {

    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void turnOn_shouldPrintMessage() {
        LightBulb bulb = new LightBulb();
        bulb.turnOn();

        assertEquals("Đèn đã được bật" + System.lineSeparator(), outContent.toString());
    }

    @Test
    void turnOff_shouldPrintMessage() {
        LightBulb bulb = new LightBulb();
        bulb.turnOff();

        assertEquals("Đèn đã được tắt" + System.lineSeparator(), outContent.toString());
    }
}