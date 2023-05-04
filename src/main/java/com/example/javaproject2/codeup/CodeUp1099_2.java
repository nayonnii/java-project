package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1099_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] maze = new int[10][10];
        int x = 1;
        int y = 1;

        // 미로 입력받기
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        // 길찾기 시작
        while (true) {
            //시작점에 먹이가 있을 경우
            if (maze[y][x] == 2) {
                maze[y][x] = 9;
                break;
            }

            //시작점에 먹이가 없을 경우
            maze[y][x] = 9;
            if (maze[y][x + 1] != 1) {          // 오른쪽이 벽이 아닐 경우
                x += 1;
            } else if (maze[y + 1][x] != 1) {   // 아래쪽이 벽이 아닐 경우
                y += 1;
            } else {                            // 오른쪽, 아래 둘 다 벽일 경우
                break;
            }
        }

        // 길찾기 완료한 배열 출력
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.printf("%d ", maze[i][j]);
            }
            System.out.println();
        }
    }
}