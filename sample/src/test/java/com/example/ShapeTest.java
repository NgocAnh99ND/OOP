package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    void testCircleArea() {
        Circle c = new Circle("Red", 5);
        assertEquals(Math.PI * 25, c.area(), 0.0001);
    }

    @Test
    void testCirclePerimeter() {
        Circle c = new Circle("Red", 5);
        assertEquals(2 * Math.PI * 5, c.perimeter(), 0.0001);
    }

    @Test
    void testRectangleArea() {
        Rectangle r = new Rectangle("Green", 4, 5);
        assertEquals(20, r.area(), 0.0001);
    }

    @Test
    void testRectanglePerimeter() {
        Rectangle r = new Rectangle("Green", 4, 5);
        assertEquals(18, r.perimeter(), 0.0001);
    }

    @Test
    void testTriangleArea() {
        Triangle t = new Triangle("Orange", 5, 6);
        assertEquals(15, t.area(), 0.0001);
    }

    @Test
    void testTrianglePerimeter() {
        Triangle t = new Triangle("Orange", 5, 6);
        double expected = 5 + 6 + Math.sqrt(5 * 5 + 6 * 6);
        assertEquals(expected, t.perimeter(), 0.0001);
    }

    @Test
    void testCircleInvalidRadius() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Circle("Red", -1);
        });
        assertEquals("Radius must be > 0", exception.getMessage());
    }

    @Test
    void testRectangleInvalidWidth() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle("Blue", 0, 5);
        });
        assertEquals("Width and height must be > 0", exception.getMessage());
    }

    @Test
    void testRectangleInvalidHeight() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle("Blue", 4, -2);
        });
        assertEquals("Width and height must be > 0", exception.getMessage());
    }

    @Test
    void testTriangleInvalidBase() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle("Yellow", -3, 6);
        });
        assertEquals("Base and height must be > 0", exception.getMessage());
    }

    @Test
    void testTriangleInvalidHeight() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle("Yellow", 3, 0);
        });
        assertEquals("Base and height must be > 0", exception.getMessage());
    }

    @Test
    void testPolymorphismArea() {
        Shape s1 = new Circle("Red", 5);
        Shape s2 = new Rectangle("Green", 4, 5);
        Shape s3 = new Triangle("Orange", 5, 6);

        assertEquals(Math.PI * 25, s1.area(), 0.0001);
        assertEquals(20, s2.area(), 0.0001);
        assertEquals(15, s3.area(), 0.0001);
    }

    @Test
    void testPolymorphismPerimeter() {
        Shape s1 = new Circle("Red", 5);
        Shape s2 = new Rectangle("Green", 4, 5);
        Shape s3 = new Triangle("Orange", 5, 6);

        assertEquals(2 * Math.PI * 5, s1.perimeter(), 0.0001);
        assertEquals(18, s2.perimeter(), 0.0001);
        assertEquals(5 + 6 + Math.sqrt(61), s3.perimeter(), 0.0001);
    }

    @Test
    void testTotalAreaAndTotalPerimeter() {
        Shape[] shapes = {
            new Circle("Red", 5),
            new Circle("Blue", 4),
            new Rectangle("Green", 4, 5),
            new Rectangle("Yellow", 5, 6),
            new Triangle("Orange", 5, 6),
            new Triangle("Purple", 6, 7)
        };

        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.area();
            totalPerimeter += shape.perimeter();
        }

        double expectedArea =
                Math.PI * 5 * 5 +
                Math.PI * 4 * 4 +
                (4 * 5) +
                (5 * 6) +
                (0.5 * 5 * 6) +
                (0.5 * 6 * 7);

        double expectedPerimeter =
                (2 * Math.PI * 5) +
                (2 * Math.PI * 4) +
                (2 * (4 + 5)) +
                (2 * (5 + 6)) +
                (5 + 6 + Math.sqrt(5 * 5 + 6 * 6)) +
                (6 + 7 + Math.sqrt(6 * 6 + 7 * 7));

        assertEquals(expectedArea, totalArea, 0.0001);
        assertEquals(expectedPerimeter, totalPerimeter, 0.0001);
    }
}
