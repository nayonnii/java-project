package com.example.javaproject2.week2.day2;

public class StirngEquals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD");
        //메모리주소가 같아서 True

        String str1 = "GOLD";
        String str2 = "G";
        System.out.println(str1.substring(0,1) == str2);
        //메모리 주소가 달라서 False

        System.out.println("GOLD-->" + str1.hashCode());
        System.out.println("G-->" + str2.hashCode());
    }
}
