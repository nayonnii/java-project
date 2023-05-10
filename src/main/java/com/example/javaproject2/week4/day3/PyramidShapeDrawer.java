package com.example.javaproject2.week4.day3;

public class PyramidShapeDrawer extends ShapeDrawer2 {

    @Override
    public String makeALine(int height, int i){
        return String.format("%s%s\n", "0".repeat(height - i), "*".repeat(2 * i - 1));
    }

    public static void main(String[] args) {
        ShapeDrawer2 rtd = new PyramidShapeDrawer();
        rtd.printShape(5);
    }
}
