package com.example.javaproject2.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSame() {
        return x==y;
    }

    // 두 점 사이의 거리 메서드 추가
    double getDistance(Point p2) {
        int xL = p2.x - this.x;
        int yL = p2.y - this.y;

        double sumOfPow = Math.pow(xL, 2) + Math.pow(yL, 2);
        double result = Math.sqrt(sumOfPow);

        return result;
    }
}
