package com.example.javaproject2.week5.day4;

import java.util.Arrays;

public class BracketWithoutStack02 {
    public static void main(String[] args) {
        String brackets = "((((()))))())";

        while(brackets.indexOf("()") != -1) {
            String[] bracketsArr = brackets.split("\\(\\)");
            System.out.println(Arrays.toString(bracketsArr));
            brackets = String.join("", bracketsArr);
            System.out.println(brackets);
        }

        if(brackets.length() == 0) {
            System.out.println("올바른 괄호입니다.");
        } else {
            System.out.println("올바른 괄호가 아닙니다.");
        }
    }
}
