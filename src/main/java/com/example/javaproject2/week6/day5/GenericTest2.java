package com.example.javaproject2.week6.day5;

import java.util.ArrayList;
import java.util.List;


public class GenericTest2 {
    public <T> T getFirstElement(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        GenericTest2 genericTest2 = new GenericTest2();
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        String firstElement = genericTest2.getFirstElement(stringList);  // "Hello"
        System.out.println(firstElement);
    }
}
