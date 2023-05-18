package com.example.javaproject2.week2.day1;

public class FloatDigit {
    public static void main(String[] args) {
        float f5 = 1.23e5f;
        float f6 = 1.23e6f;
        float f7 = 1.23e7f;
        float f8 = 1.23e8f;
        float f9 = 1.23e9f;
        float f10 = 1.23e10f;
        double d10 = 1.23e10;

        System.out.printf("f5 = %f\n",f5);      //  f5 = 123000.000000
        System.out.printf("f6 = %f\n",f6);      //  f6 = 1230000.000000
        System.out.printf("f7 = %f\n",f7);      //  f7 = 12300000.000000
        System.out.printf("f8 = %f\n",f8);      //  f8 = 123000000.000000
        System.out.printf("f9 = %f\n",f9);      //  f9 = 1230000000.000000
        System.out.printf("f10 = %f\n",f10);    //  f10 = 12300000256.000000 예상하지 못한 결과가 나옴
        System.out.println("f10 = " + f10);     //  f10 = 1.23000003E10 예상하지 못한 결과가 나옴
        System.out.printf("d10 = %f\n",d10);    //  d10 = 12300000000.000000 예상한 결과가 나옴

        float f1 = 3.123456789012345f;
        System.out.printf("f1 = %f", f1);   // f1 = 3.123457 소수 7번째 자리에서 반올림되어 6번째 자리까지 출력
    }
}
