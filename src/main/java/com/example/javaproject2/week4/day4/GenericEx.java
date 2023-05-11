package com.example.javaproject2.week4.day4;

import java.util.*;

public class GenericEx {
    public static void main(String[] args) {
        List<String> strList = new ArrayList();
        strList.add("hello");
        strList.add("Bye");
        strList.add("1234");

        for (var item : strList) {
            System.out.println(item);
        }
    }
}