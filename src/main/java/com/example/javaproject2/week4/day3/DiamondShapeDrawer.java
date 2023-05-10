package com.example.javaproject2.week4.day3;

public class DiamondShapeDrawer extends ShapeDrawer2{
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }
    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;
        if(i <= pivot) {
            // 피라미드 로직, 초항: 3, 등차: -2
            return String.format("%s%s\n", getRepeatedSymbol(" ", h - 3 - i), getRepeatedSymbol("*", 2 * i - 1));
        } else {
            // 역피라미드 로직
            return String.format("%s%s\n", getRepeatedSymbol(" ", pivot - h + i), getRepeatedSymbol("*", h - (2 * i - 8)));
        }
    }

    public static void main(String[] args) {
        ShapeDrawer2 dsd = new DiamondShapeDrawer();
        dsd.printShape(7);
    }
}
