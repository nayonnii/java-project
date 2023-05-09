package com.example.javaproject2.week4.day2;

public class MultiplicationTableMethod {
    private String multipleSymbol;  //멤버변수는 private 권장

    public MultiplicationTableMethod(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public void printMultiplicationTable(int dan) {
        System.out.println("[" + dan + "단]");
        for(int j = 1; j <= 9; j++) {
                System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, j, dan * j);
            }
            System.out.println("------------------------");
    }

    public static void main(String[] args) {
        MultiplicationTableMethod mt1 = new MultiplicationTableMethod("x");
        mt1.printMultiplicationTable(2);
        MultiplicationTableMethod mt2 = new MultiplicationTableMethod("*");
        mt2.printMultiplicationTable(5);
    }
}
