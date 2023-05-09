package com.example.javaproject2.week4.day2;

public class Pyramid {
    public void printPyramid(int height) {
//        for (int i = 0; i < height; i++) {
//            System.out.printf("공백개수: %d, 별개수: %d\n", height - i - 1, 2 * i + 1);
//        }
        for ( int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", " ".repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        int height = 4;
        pyramid.printPyramid(height);
    }
}
