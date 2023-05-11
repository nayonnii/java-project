package com.example.javaproject2.week4.day4;

public class NewUserTest {
    public static void main(String[] args) {
        NewUser user1 = new NewUser("박성한", 26);
        NewUser user2 = new NewUser("최지훈", 27);

        System.out.printf("%s는 어른입니까? %b\n", user1.getName(), user1.isAdult());
        System.out.printf("%s는 어른입니까? %b", user2.getName(), user2.isAdult());
    }
}
