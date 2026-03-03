package com.example;

import org.junit.jupiter.api.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class RouterTest {

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
    void connectWifi_shouldPrintWifiName() {
        Router router = new Router();
        router.connectWifi("HomeWifi");

        assertEquals("Router phát WiFi: HomeWifi" + System.lineSeparator(), outContent.toString());
    }
}
