package com.example;

public class SmartTV implements Switchable, Connectable {

    @Override
    public void turnOn() {
        System.out.println("Smart TV đã bật");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV đã tắt");
    }

    @Override
    public void connectWifi(String wifiName) {
        System.out.println("Smart TV kết nối WiFi: " + wifiName);
    }
}