package com.example;

public class LightBulb implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Đèn đã được bật");
    }

    @Override
    public void turnOff() {
        System.out.println("Đèn đã được tắt");
    }
}
