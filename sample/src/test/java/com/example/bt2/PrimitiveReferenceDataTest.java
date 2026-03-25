package com.example.bt2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimitiveReferenceDataTest {

    @Test
    void testPrimitiveValuesBeforeChange() {
        PrimitiveReferenceData data = new PrimitiveReferenceData();

        assertEquals(10, data.a);
        assertEquals(10, data.b);
    }

    @Test
    void testPrimitiveValuesAfterChange() {
        PrimitiveReferenceData data = new PrimitiveReferenceData();
        data.changeValues();

        assertEquals(20, data.a);
        assertEquals(10, data.b);
    }

    @Test
    void testReferenceValuesBeforeChange() {
        PrimitiveReferenceData data = new PrimitiveReferenceData();

        assertEquals("Java", data.s1);
        assertEquals("Java", data.s2);
    }

    @Test
    void testReferenceValuesAfterChange() {
        PrimitiveReferenceData data = new PrimitiveReferenceData();
        data.changeValues();

        assertEquals("Python", data.s1);
        assertEquals("Java", data.s2);
    }

    @Test
    void testDataTypes() {
        PrimitiveReferenceData data = new PrimitiveReferenceData();

        assertEquals(Integer.class, ((Object) data.a).getClass());
        assertEquals(Integer.class, ((Object) data.b).getClass());

        assertTrue(data.s1 instanceof String);
        assertTrue(data.s2 instanceof String);
    }
}