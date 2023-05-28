package com.example.javaproject2.week6.day5;

public class ExceptionEx3 extends Exception{
        public ExceptionEx3() {
            super("사용자 정의 예외가 발생했습니다.");
        }

        public ExceptionEx3(String message) {
            super(message);
        }

    public static void main(String[] args) throws ExceptionEx3{
        throw new ExceptionEx3("에러");
    }
}
