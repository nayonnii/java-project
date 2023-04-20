package com.example.javaproject2.week1;

public class PrintfEx {
    public void print() {
        System.out.printf("%s", "Hello\n");
        System.out.println("bye");
    }

    public static void main(String[] args) {
        PrintfEx printfEx = new PrintfEx(); //printEx 나와랏
        printfEx.print();   // printfEx야 물대포를 싸줘!
    }
}
