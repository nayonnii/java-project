package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr9x9 = new int[9][9];

        for(int i = 0; i < arr9x9.length; i++){
            for(int j = 0; j < arr9x9[i].length; j++){
                arr9x9[i][j] = sc.nextInt();
            }
        }

        int maxValue = arr9x9[0][0];
        int maxX = 0;
        int maxY = 0;
        for(int i = 1; i < arr9x9.length; i++){
            for(int j = 1; j < arr9x9[i].length; j++){
                if(maxValue < arr9x9[i][j]){
                    maxValue = arr9x9[i][j];
                    maxX = i + 1;
                    maxY = j + 1;
                }
            }
        }

        System.out.printf("%d\n", maxValue);
        System.out.printf("%d %d", maxX, maxY);
    }
}
