package com.example;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);

        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be > 0");
        }

        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}