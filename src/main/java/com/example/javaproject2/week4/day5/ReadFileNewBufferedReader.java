package com.example.javaproject2.week4.day5;

import java.io.IOException;
import java.util.List;

public class ReadFileNewBufferedReader implements ReadFile{

    public static void main(String[] args) throws IOException {
        ReadFile rfe = new ReadFileNewBufferedReader();
        List<String> result = rfe.getLines("C:\\Users\\나연\\Desktop\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\hospital_info.txt");
        System.out.println(result.get(1));
    }

    @Override
    public List<String> getLines(String fileName) {
        return null;
    }
}
