package com.example.javaproject2.week4.day5;

import com.example.javaproject2.week4.day4.Address;
import com.example.javaproject2.week4.day4.Hospital;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    // FileReader(X)
    ReadFile readFile;
    Charset charset;


    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        // BufferedReader선언 --> File연결
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        // BufferedReader에서 loop으로 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }


    public Hospital parse(String str) {
        System.out.println(str);
        String[] splitted = str.split(",");
        System.out.println(Arrays.toString(splitted));
        Address address = new Address(splitted[10], splitted[5], splitted[7]);  // 주소, 시도, 시군구
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }

    public List<Hospital> getHospital(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for(String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
        List<String> strLines = rfe.getLines("./hospital_info.txt");
        List<Hospital> parseHospital = rfe.getHospital(strLines);
//        System.out.println(parseHospital.get(0));
        for (int i = 0; i < 10; i++) {
            Hospital hospital = parseHospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(), hospital.getAddress().getFullAddr());
        }

    }
}
