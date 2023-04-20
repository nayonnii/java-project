package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        if (word.length() <= 50) {
            char[] newWord = new char[word.length()];
            for (int i = 0; i < newWord.length; i++) {
                newWord[i] = word.charAt(i);
                System.out.print(newWord[i]);
            }
        }
    }
}