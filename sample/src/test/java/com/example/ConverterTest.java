package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    void testConvertIntToDouble() {
        Converter c = new Converter();
        assertEquals(10.0, c.convert(10), 0.0001);
    }

    @Test
    void testConvertDoubleToInt() {
        Converter c = new Converter();
        assertEquals(10, c.convert(10.8));
    }

    @Test
    void testConvertTwoInts() {
        Converter c = new Converter();
        assertEquals(12, c.convert(5, 7));
    }

    @Test
    void testConvertThreeInts() {
        Converter c = new Converter();
        assertEquals(6, c.convert(1, 2, 3));
    }
}