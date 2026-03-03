package com.example;
import org.junit.jupiter.api.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class SmartTVTest {

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
        SmartTV tv = new SmartTV();
        tv.turnOn();

        assertEquals("Smart TV đã bật" + System.lineSeparator(), outContent.toString());
    }

    @Test
    void turnOff_shouldPrintMessage() {
        SmartTV tv = new SmartTV();
        tv.turnOff();

        assertEquals("Smart TV đã tắt" + System.lineSeparator(), outContent.toString());
    }

    @Test
    void connectWifi_shouldPrintWifiName() {
        SmartTV tv = new SmartTV();
        tv.connectWifi("MyWifi");

        assertEquals("Smart TV kết nối WiFi: MyWifi" + System.lineSeparator(), outContent.toString());
    }

    @Test
    void integration_turnOn_thenConnectWifi_shouldPrintInOrder() {
        SmartTV tv = new SmartTV();
        tv.turnOn();
        tv.connectWifi("MyWifi");

        String expected =
                "Smart TV đã bật" + System.lineSeparator() +
                "Smart TV kết nối WiFi: MyWifi" + System.lineSeparator();

        assertEquals(expected, outContent.toString());
    }
}
