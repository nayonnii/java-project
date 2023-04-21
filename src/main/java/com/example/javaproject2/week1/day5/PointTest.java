package com.example.javaproject2.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;
        System.out.printf("x: %d, y: %d\n", p1.x, p1.y);
        System.out.printf("x와 y는 같습니까? %b\n", p1.isSame());

        //또 다른 점 찍기
        Point p2 = new Point();
        p2.x = 2;
        p2.y = 2;
        System.out.printf("x와 y는 같습니까? %b\n", p2.isSame());

        Point p3 = new Point();
        p3.x = 3;
        p3.y = 2;
        System.out.printf("x와 y는 같습니까? %b", p3.isSame());

        // 두 점 사이의 거리 출력문 추가
        System.out.printf("p1과 p2 사이의 거리는? %.2f\n", p1.getDistance(p2));
    }

}
