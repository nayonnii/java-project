package com.example.javaproject2.week6.day5;

public class AniTest {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.run();
//        bird.makeSound();

        Ani bird = new Bird();
        Ani bear = new Bear();

        bird.makeSound();   // 동일한 행동이 보장됨
        bear.makeSound();
    }
}
