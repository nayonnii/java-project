package com.example.javaproject2.study.interfacePrinter;

public class PrintConsole implements Printer {
    @Override
    public void print(String message) {
            System.out.print(message);
    }
}
