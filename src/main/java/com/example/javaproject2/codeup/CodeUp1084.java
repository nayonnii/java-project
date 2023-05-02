package com.example.javaproject2.codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
//시간초과 이슈로 .printf, .println 대신 BufferedWriter 사용 필요
public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int rNum = sc.nextInt();
        int gNum = sc.nextInt();
        int bNum = sc.nextInt();
        int num = 0;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //BufferedWriter: 한 줄씩 읽음
        //OutputStreamWriter: 한 글자 읽음
        for(int i = 0; i < rNum; i++) {
            for(int j = 0; j < gNum; j++) {
                String line = "";
                for(int k = 0; k < bNum; k++){
                    line += i + " " + j + " " + k + "\n";
                    num++;
                }
                bw.write(line);
                bw.flush();
            }
        }
        System.out.println(num);
    }
}
