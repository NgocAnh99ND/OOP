package com.example.bt2;

public class Main {
    public static void main(String[] args) {

        // ===== Phần A =====
        int score = 7;

        if (score >= 8) {
            System.out.println("Giỏi");
        } else if (score >= 6) {
            System.out.println("Khá");
        } else if (score >= 5) {
            System.out.println("Trung bình");
        } else {
            System.out.println("Yếu");
        }

        // ===== Phần B =====
        int day = 3;

        switch (day) {
            case 2:
                System.out.println("Thứ hai");
                break;
            case 3:
                System.out.println("Thứ ba");
                break;
            case 4:
                System.out.println("Thứ tư");
                break;
            case 5:
                System.out.println("Thứ năm");
                break;
            case 6:
                System.out.println("Thứ sáu");
                break;
            case 7:
                System.out.println("Thứ bảy");
                break;
            case 8:
                System.out.println("Chủ nhật");
                break;
            default:
                System.out.println("Không hợp lệ");
        }
    }
}