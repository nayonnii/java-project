package com.example.javaproject2.week3.day1;

public class LoopChar {
    public static void main(String[] args) {

        System.out.println("[알파벳 반복출력(세로로 출력)]");
        for(char c = 'a'; c <= 'z'; c++){
            System.out.println(c);
        }
        System.out.println("[알파벳 반복출력(가로로 출력)]");
        for(char c = 'a'; c <= 'z'; c++){
            System.out.printf("%c", c);
        }
        System.out.println();

        System.out.println("[알파벳을 숫자로 출력]");
        for(int c= 'A'; c <= 'Z'; c++){
            System.out.printf("%d ", c);
        }
        System.out.println();
        
        System.out.println("[알파벳과 숫자 혼합하여 for문 선언 후 유니코드와 문자 출력]");
        for(int c= 65; c <= 'Z'; c++){
            System.out.printf("%d:%c\n", c, c);
        }
        System.out.println();

        System.out.println("[한글로 for문 선언 후 유니코드와 문자 출력]");
        for(int c= '가'; c <= '핳'; c++){
            System.out.printf("%d:%c\n", c, c);
        }
        System.out.println();

    }
}
