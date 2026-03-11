package com.example.bt3;

class Student extends Person {

    @Override
    void introduce() {
        super.introduce(); // gọi method của class cha
        System.out.println("I am also a student");
    }
}
