package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] checkerBoard = new int[19][19];

        for(int i = 0; i < num; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            checkerBoard[x - 1][y - 1] = 1;
        }

        for(int i = 0; i < checkerBoard.length; i++){
            for(int j = 0; j < checkerBoard[i].length; j++){
                System.out.printf("%d ", checkerBoard[i][j]);
            }
            System.out.println();
        }
    }
}
