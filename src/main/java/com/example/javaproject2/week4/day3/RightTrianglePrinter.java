package com.example.javaproject2.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// System.out --> Console
// BufferedWriter --> Console, File
public class RightTrianglePrinter {

    /* 인터페이스
        인터페이스 자체로는 객체 생성 불가(불완전)
        인터페이스(Printer)를 구현한 메소드(ConsolePrinter)로 객체 생성
    */

//    private Printer printer = new ConsolePrinter();// 인터페이스
    private Printer printer;// 인터페이스

    public RightTrianglePrinter(Printer printer) {
        this.printer = printer;
    }

    public String makeALine(int n, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));  // 직각삼각형 프린트 소스
    }


    // 모양 출력하기
    public void printShape(int h) throws IOException {
        // 모양 만들기
        String[] lines = new String[h];
        for(int i = 0; i < h; i++) {
            lines[i] = makeALine(h, i + 1);
        }
        //모양 출력하기
        printer.print(lines);
    }

    public static void main(String[] args) throws IOException {
        RightTrianglePrinter rtpConsole = new RightTrianglePrinter(new ConsolePrinter());
        RightTrianglePrinter rtpFile = new RightTrianglePrinter(new FilePrinter());
        rtpConsole.printShape(5);
        rtpFile.printShape(5);
    }
}
