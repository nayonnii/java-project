package com.example.javaproject2.week4.day2;

class ShapeDrawerTest {
    public static void main(String[] args) {
        PyramidShapeDrawer pyramidShapeDrawer = new PyramidShapeDrawer();
        pyramidShapeDrawer.printPyramidWithSpaceChar(6);

        ParallelogramShapeDrawer parallelogramShapeDrawer = new ParallelogramShapeDrawer();
        parallelogramShapeDrawer.printParallelogramWithSpaceChar(6);
    }
}