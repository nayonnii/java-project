package com.example.javaproject2.week4.day3;

// 프린터의 구체적인 구현체 1 (프린터인데 콘솔에 출력하는 프린터)
public class ConsolePrinter2 implements Printer2{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
