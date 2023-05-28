package com.example.javaproject2.week6.day5;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            // Exception 클래스로 예외를 실행시킨다.
            throw new Exception();
        }
        catch (Exception e) {
            // Checked Exception이므로 예외처리를 해주는데 해주지 않으면 컴파일 실패
            System.out.println("Exception");
        }
    }

}
