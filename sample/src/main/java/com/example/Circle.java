package com.example;

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);

        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be > 0");
        }

        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}