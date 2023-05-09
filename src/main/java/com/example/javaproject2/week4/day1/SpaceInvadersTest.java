package com.example.javaproject2.week4.day1;

public class SpaceInvadersTest {
    public static void main(String[] args) {

        SpaceInvaders si = new SpaceInvaders();
        si.moveLeft();
        si.moveRight();
        si.moveRight();
        System.out.println(si.location);

    }
}
