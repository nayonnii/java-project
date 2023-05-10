package com.example.javaproject2.week4.day3;

import java.io.IOException;

public class HelloPrinter2 {
    //파일에도 저장하고 싶고, 콘솔에도 출력하고 싶을 경우

    // 기능1은 유지한 체로 print만 바꿔 끼우기 위해 interface 생성
    Printer2 printer;   // interface - String message 받아서 print()

    // print를 바꿔 끼우기 위한 생성자 생성
    public HelloPrinter2(Printer2 printer) {
        this.printer = printer;
    }

    // 기능1: 반복 기능
    // repeatMessage는 print라는 기능을 가지고 있다.
    // 이 기능은 콘솔에 출력을 한다.
    public void repeatMessage(int n, String message) throws IOException {  //n번 반복
        for(int i = 0; i < n; i++) {
            printer.print(message);
        }
    }
    public static void main(String[] args) throws IOException {
        HelloPrinter2 hpConsole = new HelloPrinter2(new ConsolePrinter2());
        HelloPrinter2 hpFile = new HelloPrinter2(new FilePrinter2());
        hpConsole.repeatMessage(2, "Hello");    // 콘솔은 텍스트가 누적됨
        hpFile.repeatMessage(3, "ByeBye");  // 파일은 텍스트가 누적되지 않고, n번 호출될 때마다 n번 파일이 생성/삭제됨
    }
}
