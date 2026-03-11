package com.example;

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();

    public void display() {
        System.out.println("Color: " + color);
    }
}
