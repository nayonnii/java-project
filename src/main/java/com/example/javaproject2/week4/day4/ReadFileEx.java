package com.example.javaproject2.week4.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileEx {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\나연\\Desktop\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\1.병원정보서비스 2022.10..csv"));
        System.out.println(br.readLine());
        // BufferedReader bufferedReader = new BufferedReader(new FileReader("./hospital_info_0920.csv"));
    }
}
