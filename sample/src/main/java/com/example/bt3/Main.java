package com.example.bt3;

public class Main {
    public static void main(String[] args) {

        // ===== Phần A =====
        System.out.println("Phần A:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // ===== Phần B =====
        System.out.println("Phần B:");
        int sum = 0;
        int i = 1;

        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("Tổng = " + sum);

        // ===== Phần C =====
        System.out.println("Phần C:");
        int j = 10;

        do {
            System.out.println(j);
            j--;
        } while (j >= 1);
    }
}