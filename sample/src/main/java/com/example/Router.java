package com.example;

public class Router implements Connectable {

    @Override
    public void connectWifi(String wifiName) {
        System.out.println("Router phát WiFi: " + wifiName);
    }
}
