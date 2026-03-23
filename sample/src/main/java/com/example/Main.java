package com.example;

public class Main {
    public static void main(String[] args) {

        // Tạo 3 nhân viên
        Employee e1 = new Employee("An");
        Employee e2 = new Employee("Binh");
        Employee e3 = new Employee("Cuong");

        // In lần đầu
        e1.display();
        e2.display();
        e3.display();

        System.out.println("---- After change company ----");

        // Đổi company
        Employee.company = "XYZ Corp";

        // In lại
        e1.display();
        e2.display();
        e3.display();
    }
}
