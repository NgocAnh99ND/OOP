package com.example.bt4;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 8, 2, 15, 10};

        // ===== 1. In toàn bộ phần tử =====
        System.out.println("Các phần tử trong mảng:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // ===== 2. Tính tổng =====
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Tổng = " + sum);

        // ===== 3. Tìm phần tử lớn nhất =====
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Phần tử lớn nhất = " + max);

        // ===== 4. Đếm số phần tử chẵn =====
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("Số phần tử chẵn = " + countEven);
    }
}
