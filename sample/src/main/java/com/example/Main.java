package com.example;
    
    public class Main {
        public static void main(String[] args) {
            Employee e1 = new FullTimeEmployee("FT01", "Nguyen Van A", 15000000);
            Employee e2 = new PartTimeEmployee("PT01", "Tran Thi B", 50000, 80);

            System.out.println(e1.calculateSalary());
            System.out.println(e2.calculateSalary());
        }
    }