package com.example.bt1;

public class Main {

    public static String getOriginal() {
        return "   Java Core Basics   ";
    }

    public static int getOriginalLength(String str) {
        return str.length();
    }

    public static String trim(String str) {
        return str.trim();
    }

    public static int getTrimmedLength(String str) {
        return str.trim().length();
    }

    public static String toUpper(String str) {
        return str.trim().toUpperCase();
    }

    public static String toLower(String str) {
        return str.trim().toLowerCase();
    }

    public static void main(String[] args) {
        String str = getOriginal();

        System.out.println("Chuỗi ban đầu: [" + str + "]");
        System.out.println("Độ dài ban đầu: " + getOriginalLength(str));

        String trimmed = trim(str);

        System.out.println("Sau khi trim: [" + trimmed + "]");
        System.out.println("Độ dài sau trim: " + getTrimmedLength(str));

        System.out.println("Chữ hoa: " + toUpper(str));
        System.out.println("Chữ thường: " + toLower(str));
    }
}
