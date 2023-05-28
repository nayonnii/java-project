package com.example.javaproject2.week6.day5;


interface Shape2 {
    double calculateArea(); // 넓이
    double calculatePerimeter();    // 둘레
}

// TODO: Rectangle 클래스 작성
class Rectangle2 implements Shape2 {
    private int width;
    private int height;

    public Rectangle2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width + height) * 2;
    }
}

// TODO: Circle 클래스 작성
class Circle2 implements Shape2 {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


public class ShapeTest {
    public static void main(String[] args) {
        Shape2 rectangle = new Rectangle2(5, 10);
        Shape2 circle = new Circle2(3.5);

        double area1 = rectangle.calculateArea();
        double perimeter1 = rectangle.calculatePerimeter();

        double area2 = circle.calculateArea();
        double perimeter2 = circle.calculatePerimeter();

        System.out.println("사각형의 넓이: " + area1);
        System.out.println("사각형의 둘레: " + perimeter1);
        System.out.println("원의 넓이: " + area2);
        System.out.println("원의 둘레: " + perimeter2);
    }
}

