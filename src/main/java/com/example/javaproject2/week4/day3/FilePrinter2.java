package com.example.javaproject2.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// 프린터의 구체적인 구현체 2 (프린터인데 파일에 출력하는 프린터)
public class FilePrinter2 implements Printer2 {

    @Override
    public void print(String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./hello2.txt"));
        bw.append(message);
        bw.flush();
        bw.close();
    }
}
