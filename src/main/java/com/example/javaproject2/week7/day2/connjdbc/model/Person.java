package com.example.javaproject2.week7.day2.connjdbc.model;

public class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("%,03d %s", id , name);
    }
}
