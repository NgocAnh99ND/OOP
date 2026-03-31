package com.example.bt3;

public class Main {

    // ===== PHẦN A =====
    public static String getFullName() {
        return "Nguyen Van An";
    }

    public static int getFirstSpace(String str) {
        return str.indexOf(' ');
    }

    public static String getFirstNamePart(String str) {
        int firstSpace = str.indexOf(' ');
        return str.substring(0, firstSpace);
    }

    public static String getLastNamePart(String str) {
        int lastSpace = str.lastIndexOf(' ');
        return str.substring(lastSpace + 1);
    }

    // ===== PHẦN B =====
    public static String buildString() {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Core");
        sb.append(" StringBuilder");
        sb.insert(0, "Learning ");

        int start = sb.indexOf("Java");
        int end = start + "Java".length();
        sb.replace(start, end, "JDK");

        return sb.toString();
    }

    public static void main(String[] args) {
        String fullName = getFullName();

        System.out.println(getFirstSpace(fullName));
        System.out.println(getFirstNamePart(fullName));
        System.out.println(getLastNamePart(fullName));

        System.out.println(buildString());
    }
}
