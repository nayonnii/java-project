package com.example.javaproject2.week6.day5;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println(names.get(0));
        System.out.println(names.size());
        names.remove("Charlie");
        System.out.println(names);
    }
}
