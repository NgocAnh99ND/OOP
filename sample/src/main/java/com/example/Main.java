package com.example;

public class Main {
    public static void main(String[] args) {

        SmartTV tv = new SmartTV();
        tv.turnOn();
        tv.connectWifi("MyWifi");

        System.out.println("-----------");

        LightBulb bulb = new LightBulb();
        bulb.turnOn();
        bulb.turnOff();

        System.out.println("-----------");

        Router router = new Router();
        router.connectWifi("HomeWifi");
    }
}