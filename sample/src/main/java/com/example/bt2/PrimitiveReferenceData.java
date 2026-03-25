package com.example.bt2;

public class PrimitiveReferenceData {

    // Phần A: primitive
    int a = 10;
    int b = a;

    // Phần B: reference
    String s1 = "Java";
    String s2 = s1;

    // Thực hiện thay đổi theo đề bài
    void changeValues() {
        a = 20;
        s1 = "Python";
    }
}
