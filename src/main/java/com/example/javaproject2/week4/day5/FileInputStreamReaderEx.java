package com.example.javaproject2.week4.day5;

import java.io.*;
import java.nio.charset.Charset;

public class FileInputStreamReaderEx {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\나연\\Desktop\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\hospital_info.txt"), "EUC-KR"));
        System.out.println(br.readLine());

    }

}
