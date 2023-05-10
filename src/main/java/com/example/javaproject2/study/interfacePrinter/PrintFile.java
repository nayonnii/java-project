package com.example.javaproject2.study.interfacePrinter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintFile implements Printer {
    @Override
    public void print(String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./exercise.txt"));
            bw.append(message);
            bw.flush();
            bw.close();
    }
}
