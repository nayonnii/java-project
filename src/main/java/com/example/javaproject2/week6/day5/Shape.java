package com.example.javaproject2.week6.day5;

interface Shape {
    double calculateArea();

    //인터페이스는 디폴트 메소드를 지정해줄 수 있음
    default void display() {
        System.out.println("디폴트 메소드");
    }
}
