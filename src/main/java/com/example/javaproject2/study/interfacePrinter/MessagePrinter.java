package com.example.javaproject2.study.interfacePrinter;


import java.io.IOException;

public class MessagePrinter {
    //파일, 콘솔에 메시지 반복 출력하기
    Printer printer;

    public MessagePrinter(Printer printer) {
        this.printer = printer;
    }

    //반복 기능
    public void printRepeat(int num, String message) throws IOException {
        for(int i = 0; i < num; i++) {
        printer.print(message);
        }
    }

    public static void main(String[] args) throws IOException {

        MessagePrinter pConsole = new MessagePrinter(new PrintConsole());
        MessagePrinter pFile = new MessagePrinter(new PrintFile());
        pConsole.printRepeat(2, "interface is very hard");
        pFile.printRepeat(3, "interface is very very hard");
    }
}
