package com.example.javaproject2.week4.day3;

public class RightTriangleDrawer extends ShapeDrawer2 {

    @Override
    public String makeALine(int height, int i){
        return String.format("%s\n", "*".repeat(i));
    }

    public static void main(String[] args) {
        ShapeDrawer2 rtd = new RightTriangleDrawer();
        rtd.printShape(5);
    }
}
