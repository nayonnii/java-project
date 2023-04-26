package com.example.javaproject2.codeup;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp1041 {
    public static void main(String[] args) throws IOException {
//내 풀이_Scanner 활용
        Scanner sc = new Scanner(System.in);
        char inputCh = sc.nextLine().charAt(0);
        System.out.println((char)(inputCh+1));  //inputCh+1은 ascii코드가 출력되므로 (char)로 형변환

//다른 풀이_InputStreamReader(한 글자만 읽기) 활용
//        InputStreamReader isr = new InputStreamReader(System.in);
//        char c2 = (char)(isr.read() + 1);
//        System.out.println(c2);
    }
}
