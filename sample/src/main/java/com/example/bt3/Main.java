package com.example.bt3;

public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        Vehicle v3 = new Boat();

        v1.move();
        v2.move();
        v3.move();
    }
}
