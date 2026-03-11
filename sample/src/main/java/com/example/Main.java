package com.example;

public class Main {
    public static void main(String[] args) {

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

            shape.display();

            if (shape instanceof Circle) {
                System.out.printf("Circle area: %.2f\n", shape.area());
            } else if (shape instanceof Rectangle) {
                System.out.printf("Rectangle area: %.2f\n", shape.area());
            } else if (shape instanceof Triangle) {
                System.out.printf("Triangle area: %.2f\n", shape.area());
            }

            System.out.printf("Perimeter: %.2f\n", shape.perimeter());

            totalArea += shape.area();
            totalPerimeter += shape.perimeter();

            System.out.println();
        }

        System.out.printf("Total area: %.2f\n", totalArea);
        System.out.printf("Total perimeter: %.2f\n", totalPerimeter);
    }
}