package com.example;

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);

        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be > 0");
        }

        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        // giả sử tam giác vuông
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }
}