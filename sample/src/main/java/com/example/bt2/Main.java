package com.example.bt2;

public class Main {

    public static String getString() {
        return "Java 11 has 2 versions";
    }

    public static int countA(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static boolean containsHas(String str) {
        return str.contains("has");
    }

    public static int firstIndexOfA(String str) {
        return str.indexOf('a');
    }

    public static char getCharAt(String str, int index) {
        return str.charAt(index);
    }

    public static void main(String[] args) {
        String str = getString();

        System.out.println("Các ký tự:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println("Số a/A: " + countA(str));
        System.out.println("Số chữ số: " + countDigits(str));
        System.out.println("Số khoảng trắng: " + countSpaces(str));
        System.out.println("Có 'has': " + containsHas(str));
        System.out.println("Vị trí a đầu tiên: " + firstIndexOfA(str));
    }
}
