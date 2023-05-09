package com.example.javaproject2.week4.day2;

public class ParallelogramShapeDrawer extends ShapeDrawer {
    private String spaceChar = "0";

    public ParallelogramShapeDrawer(String spaceChar) {   // 생성자_매개변수가 하나인 경우
        this.spaceChar = spaceChar;
    }

    public ParallelogramShapeDrawer() {   // 생성자_매개변수가 없는 경우
    }
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i), "*".repeat(h));
    }

    public void printParallelogramWithSpaceChar(int hegiht) { //메소드_출력
        for (int i = 0; i < hegiht; i++) {
            System.out.print(makeALine(hegiht, i));
        }
    }
}
