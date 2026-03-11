package com.example.bt4;


class Student extends Person {

    String studentId;

    Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(studentId);
    }
}
