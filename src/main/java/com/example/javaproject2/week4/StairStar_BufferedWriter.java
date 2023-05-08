package com.example.javaproject2.week4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StairStar_BufferedWriter {
    public static void main(String[] args) throws IOException {
        int height = 5;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < height; i++) {   // 0 1 2 3 4
            for(int j = 0; j < i; j++) {   //    0 1 2 3
                bw.append(" ");
            }
            bw.append("**\n");
        }
        bw.flush();
        bw.close();
    }
}
