package com.example;

public class Main {
    public static void main(String[] args) {

        Converter c = new Converter();

        double d = c.convert(10);
        System.out.println("int -> double: " + d);

        int i = c.convert(10.8);
        System.out.println("double -> int: " + i);

        int sum2 = c.convert(5, 7);
        System.out.println("sum 2 numbers: " + sum2);

        int sum3 = c.convert(1, 2, 3);
        System.out.println("sum 3 numbers: " + sum3);
    }
}