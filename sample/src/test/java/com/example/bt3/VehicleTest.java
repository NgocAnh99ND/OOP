package com.example.bt3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class VehicleTest {

    // Hàm hỗ trợ: bắt output console
    private String getOutput(Runnable action) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream old = System.out;
        System.setOut(new PrintStream(out));

        action.run();

        System.setOut(old);
        return out.toString().trim();
    }

    @Test
    void testVehicleMove() {
        Vehicle v = new Vehicle();
        String output = getOutput(v::move);
        assertEquals("Vehicle is moving", output);
    }

    @Test
    void testCarMove() {
        Vehicle v = new Car(); // đa hình
        String output = getOutput(v::move);
        assertEquals("Car is moving on the road", output);
    }

    @Test
    void testBoatMove() {
        Vehicle v = new Boat(); // đa hình
        String output = getOutput(v::move);
        assertEquals("Boat is moving on the water", output);
    }

    @Test
    void testPolymorphism() {
        Vehicle[] vehicles = {
            new Vehicle(),
            new Car(),
            new Boat()
        };

        String[] expected = {
            "Vehicle is moving",
            "Car is moving on the road",
            "Boat is moving on the water"
        };

        for (int i = 0; i < vehicles.length; i++) {
            String output = getOutput(vehicles[i]::move);
            assertEquals(expected[i], output);
        }
    }
}