package com.example.javaproject2.week4.day3;

public class DrawDiamond {
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static String symbol(String symbol, int n) {
        String answer = " ";
        for(int i = 0; i < n; i++) {
            answer += symbol;
        }
        return answer;
    }

    public static String makeALine(int h, int i) {
        int pivot = h / 2;
        if(i <= pivot) {
            // 피라미드 로직, 초항: 3, 등차: -2
            return String.format("%s%s\n", getRepeatedSymbol(" ", -2 + h - i - 2), getRepeatedSymbol("*", 2 * i + 1));
        } else {
            // 역피라미드 로직
            return String.format("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
        }
    }
    public static void main(String[] args) {
        int h = 7;

//        ShapeDrawer sd = new ShapeDrawer() {
//            @Override
//            public String makeALine(int h, int i) {
//                return null;
//            }
//        }
//        for(int i = 0; i < h; i++) {
//            System.out.print(makeALine(h, i));
//        }
    }
}
