package com.example.javaproject2.week6.day5;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("snack");
        stack.push("soda");
        stack.push("chocolate");

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());

    }
}
