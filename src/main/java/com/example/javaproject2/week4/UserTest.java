package com.example.javaproject2.week4;

class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "박성한";
        user1.age = 26;

        User user2 = new User();
        user2.name = "최지훈";
        user2.age = 27;

        System.out.printf("%s는 어른입니까? %b\n", user1.name, user1.isAdult());
        System.out.printf("%s는 어른입니까? %b", user2.name, user2.isAdult());
    }
}