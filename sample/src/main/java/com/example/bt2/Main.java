package com.example.bt2;

public class Main {
    public static void main(String[] args) {

        PrimitiveReferenceData data = new PrimitiveReferenceData();
        data.changeValues();

        System.out.println("Primitive:");
        System.out.println("a = " + data.a);
        System.out.println("b = " + data.b);

        System.out.println();

        System.out.println("Reference:");
        System.out.println("s1 = " + data.s1);
        System.out.println("s2 = " + data.s2);
    }
}
