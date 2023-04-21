package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User nayeon = new User();
        nayeon.name = "이나연";
        nayeon.phoneNumber = "010-1234-5678";
        nayeon.age = 27;

        User sunghan = new User();
        sunghan.name = "박성한";
        sunghan.phoneNumber = "010-1212-0303";
        sunghan.age = 26;

        System.out.printf("%s님은 성인입니까? %s\n", nayeon.name, nayeon.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", sunghan.name, sunghan.isAdult());

    }
}
