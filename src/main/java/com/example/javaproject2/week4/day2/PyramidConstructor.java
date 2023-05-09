package com.example.javaproject2.week4.day2;

public class PyramidConstructor {
    private String spaceChar = "0";

    public PyramidConstructor(String spaceChar) {   // 생성자
        /*생성자
         * 1. 클래스명과 생성자명은 같아야 한다.
         * 2. 반환타입은 기재하지 않는다.
         * */
        this.spaceChar = spaceChar;
    }

// 피라미드 전체 출력 - 시작
    /*public void printPyramid(int hegiht) {
        for ( int i = 0; i < hegiht; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(hegiht - i - 1), "*".repeat(2 * i + 1));
        }
    }*/
// 피라미드 전체 출력 - 끝

// 피라미드 한 줄 만드는 기능 분리하여 출력 - 시작
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
    }

    public void printPyramidWithSpaceChar(int hegiht) {
        // 기능이 3가지
        for ( int i = 0; i < hegiht; i++) {
            System.out.print(makeALine(hegiht, i));
        }
    }
// 피라미드 한 줄 만드는 기능 분리하여 출력 - 끝

    public static void main(String[] args) {
        PyramidConstructor pyramid2 = new PyramidConstructor(" ");  // argument " "를 넘겨서 초기화
        PyramidConstructor pyramidSpaceZero = new PyramidConstructor("0");  // argument "0"을 넘겨서 초기화
// 피라미드 전체 출력 메소드 실행- 시작
/*      pyramid2.printPyramid(4);
        pyramidSpaceZero.printPyramid(5); */
// 피라미드 전체 출력 메소드 실행 - 끝

// 피라미드 한 줄 만드는 기능 분리하여 출력 메소드 실행- 시작
        pyramid2.printPyramidWithSpaceChar(4);
        pyramidSpaceZero.printPyramidWithSpaceChar(5);
// 피라미드 한 줄 만드는 기능 분리하여 출력 메소드 실행- 끝
    }
}
