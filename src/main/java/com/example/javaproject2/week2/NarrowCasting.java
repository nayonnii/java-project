package com.example.javaproject2.week2;

public class NarrowCasting {
    public static void main(String[] args) {
        double dVal = 123.456;
        // double타입인 d를 int타입으로 강제 형변환
        int iVal = (int) dVal;
        System.out.println("dVal = " + dVal);
        System.out.println("iVal = " + iVal);
    }
}
