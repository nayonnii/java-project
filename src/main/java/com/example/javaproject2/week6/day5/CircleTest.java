package com.example.javaproject2.week6.day5;

public class CircleTest {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        System.out.println(circle.calculateArea());

        // 디폴트 메소드 출력_무조건적으로 추상메소드만 사용한다 = x, 디폴트 메소드도 구현 가능하다.
        circle.display();
    }
}
