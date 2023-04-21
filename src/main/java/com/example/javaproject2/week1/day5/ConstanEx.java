package com.example.javaproject2.week1.day5;

import com.example.javaproject2.PrintHello;

public class ConstanEx {
    public final int MAX_LEVEL = 3;    //ConstanEx클래스 인스턴스화 후 사용 가능
    public static final int MIN_LEVEL = 1;  //ConstanEx클래스를 인스턴스화 시키지 않아도 사용가능 => 이 케이스를 많이 사용
    public static void main(String[] args) {
        final int iVal;
        iVal = 1;
        System.out.println(iVal);

        final PrintHello printHello = new PrintHello(); //참조타입에도 final을 사용하여 변하지 않도록 가능
    }
}
