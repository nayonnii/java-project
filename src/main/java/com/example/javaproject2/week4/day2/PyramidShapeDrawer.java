package com.example.javaproject2.week4.day2;

public class PyramidShapeDrawer extends ShapeDrawer {
    private String spaceChar = "0"; //공백문자 초기화

    public PyramidShapeDrawer(String spaceChar) {   //생성자_매개변수가 1개인 경우
        this.spaceChar = spaceChar;
    }
    public PyramidShapeDrawer() {   //생성자_매개변수가 없는 경우(default)
    }

    @Override
    public String makeALine(int h, int i) { // ShapeDrawer클래스에서 상속받아 선언한 makeLine 메소드
        return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(2 * i + 1));
    }

    public void printPyramidWithSpaceChar(int hegiht) { // makeLine메소드를 받아 공백 및 문자를 출력해주는 메소드
        // 기능이 3가지
        for ( int i = 0; i < hegiht; i++) {
            System.out.print(makeALine(hegiht, i));
        }
    }
}
