package com.example;

public class Employee {

    public final int id;              // không đổi
    public String name;
    public static String company = "ABC Corp"; // dùng chung
    public static int nextId = 1;     // cấp id tự động

    // Constructor
    public Employee(String name) {
        this.id = nextId;
        nextId++;
        this.name = name;
    }

    // Hiển thị thông tin
    public void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Company: " + company);
    }
}
