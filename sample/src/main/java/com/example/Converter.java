package com.example;

class Converter {

    // 1. int → double
    double convert(int a) {
        return a;
    }

    // 2. double → int
    int convert(double a) {
        return (int) a;
    }

    // 3. tổng 2 số nguyên
    int convert(int a, int b) {
        return a + b;
    }

    // 4. tổng 3 số nguyên
    int convert(int a, int b, int c) {
        return a + b + c;
    }
}