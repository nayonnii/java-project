package com.example.javaproject2.week6.day5;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");    /// 중복된 요소이므로 추가되지 않음

        System.out.println(fruits.contains("Banana"));
        System.out.println(fruits.size());
        fruits.remove("Apple");
        System.out.println(fruits);
    }
}
