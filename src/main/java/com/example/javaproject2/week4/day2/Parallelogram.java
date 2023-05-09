package com.example.javaproject2.week4.day2;

public class Parallelogram {
    private String spaceChar = "0";

    public Parallelogram(String spaceChar) {   // 생성자
        this.spaceChar = spaceChar;
    }

    public String makeALine(int height, int i) {    // 메소드_한 줄 만들기
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(height));
    }

    public void printPyramidWithSpaceChar(int hegiht) { //메소드_출력
        for (int i = 0; i < hegiht; i++) {
            System.out.print(makeALine(hegiht, i));
        }
    }

    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(" ");  // argument " "를 넘겨서 초기화
        parallelogram.printPyramidWithSpaceChar(6);
    }
}
